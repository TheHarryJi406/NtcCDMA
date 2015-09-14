package com.designco.ntbilling.util;

import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

public class FtpUtil {
	FTPClient fclient;

	public FtpUtil(String host, String user, String pass) throws Exception {
		fclient = new FTPClient();
		fclient.connect(host);
		if (fclient.login(user, pass)) {

		} else {
			throw new Exception("Invalid username/password.");
		}
	}

	public static void main(String[] args) {
		try {
			String accountNo = "12345";
			String dir = accountNo.substring(accountNo.length()-2, accountNo.length());
			System.out.println(dir);
			
			//FtpUtil ftp = new FtpUtil("172.20.8.101", "ntftp", "nt@ftp");
//			String bill = ftp.getBillDetail("117154", 2012, 12);

//			System.out.println(bill);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public String getBillDetail(String accountNo, String year, String month)
			throws Exception {
		fclient.changeWorkingDirectory(year + "/");
		fclient.changeWorkingDirectory(month + "/");
		
		String dir = accountNo.substring(accountNo.length()-2, accountNo.length());
		fclient.changeWorkingDirectory(dir + "/");
		
		String file = accountNo + "_" + year + "" + month + ".html";
		FTPFile[] files = fclient.listFiles();
		boolean exist = false;
		for (FTPFile ffile : files){
			//System.out.println(ffile.getName());
			if (ffile.getName().equals(file)) {
				exist = true;
				break;
			}
		}
		if (!exist) {
			throw new Exception("Bill does not exist.");
		}
		StringOutputStream sos = new StringOutputStream();
		fclient.retrieveFile(file, sos);
		sos.close();
		fclient.disconnect();
		return sos.getString();
	}

	class StringOutputStream extends OutputStream {
		StringBuilder mBuf = new StringBuilder();

		public void write(int by) throws IOException {
			mBuf.append((char) by);
		}

		public String getString() {
			return mBuf.toString();
		}
	}
}
