package kr.ac.kopo.day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain04 {
	// iotest/Koala.jpg => iotest/Koala3.jpg ����
	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		long start = System.currentTimeMillis();

		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala3.jpg");

			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			while (true) {
				int c = bis.read();
				if (c == -1)
					break;
				bos.write(c);
			}
			bos.flush();
			System.out.println("koala3.jpg ����Ϸ�...");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			FileClose.close(fis, bis);
			FileClose.close(fos, bos);

//				FileClose.close(bis);
//				FileClose.close(fis);
//				FileClose.close(bos);
//				FileClose.close(fos);
		}

		long end = System.currentTimeMillis();
		System.out.println("�ҿ�ð� : " + (end - start) / 1000. + "(��)");
	}
}
