package kr.ac.kopo.day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOMain02 {

	public static void main(String[] args) {
		// iotest/Koala.jpg -> iotest/Koala2.jpg ����
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		long start = System.currentTimeMillis();
		
		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala2.jpg");
			
			while(true) {
				int c = fis.read();
				if(c == -1) break;
				fos.write(c);
			}
			fos.flush();
			System.out.println("���Ϻ��� �Ϸ�....");
						
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch(IOException ie) {
			ie.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("�ҿ�ð� : " + (end - start) / 1000. + "(��)");
		
	}
}
