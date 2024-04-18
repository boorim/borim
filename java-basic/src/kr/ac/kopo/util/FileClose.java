package kr.ac.kopo.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileClose {

	public static void close(FileInputStream fis, DataInputStream dis) {
		if (fis != null) {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(OutputStream os) {
		if (os != null) {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(FileInputStream fis, BufferedInputStream bis) {
		// TODO Auto-generated method stub
		
	}

	public static void close(FileOutputStream fos, BufferedOutputStream bos) {
		// TODO Auto-generated method stub
		
	}

}

