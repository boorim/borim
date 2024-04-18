package kr.ac.kopo.day17;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {
		 
		File fileObj = new File("iotest/a/a.txt");
		System.out.println("���� �̸� : " + fileObj.getName());
		System.out.println("���� ��� : " + fileObj.getParent());
		System.out.println("���丮���� : " + fileObj.isDirectory());
		System.out.println("���Ͽ��� : " + fileObj.isFile());
		System.out.println("���翩�� : " + fileObj.exists());
		
		System.out.println("�б⿩�� : " + fileObj.canRead());
		System.out.println("���⿩�� : " + fileObj.canWrite());
		System.out.println("���࿩�� : " + fileObj.canExecute());
		System.out.println("����ũ�� : " + fileObj.length() + "byte(s)");
		long time = fileObj.lastModified();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("������ ������¥ : " + sdf.format(new Date(time)));
		
	
		
		/*
		 File dirObj = new File("iotest");
		
		
		System.out.println("���丮���� : " + dirObj.isDirectory());
		System.out.println("���Ͽ��� : " + dirObj.isFile());
		System.out.println("���翩�� : " + dirObj.exists());
		System.out.println("parent : " + dirObj.getParent());
		System.out.println("path : " + dirObj.getPath());
		
	//	File dirObj2 = new File("iotest/a/aaa");
		File dirObj2 = new File("iotest/b/����");
		dirObj2.mkdirs();
		
		System.out.println("----------------------");
		System.out.println(dirObj.getPath() + "����");
		System.out.println("----------------------");
		
		String[] list = dirObj.list(); //��ü����� ������ !!!! �׷� �� ����Ʈ�� String �ȿ� �����ž�
		for(String e : list) {
			System.out.println(e);
		} */
	}
}