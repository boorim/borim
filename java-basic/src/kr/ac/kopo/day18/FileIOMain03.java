package kr.ac.kopo.day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOMain03 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream("iotest/koala.jpg");
			fos = new FileOutputStream("iotest.koala3.jpg");

			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			while (true) {
				int c = bis.read();
				if (c == -1)
					break;
				bos.write(c);
			}
			bos.flush(); // 버퍼 비우기
			System.out.println("koala3.jpg 복사완료...");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
