package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCclose;

public class InsertMain04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = new ConnectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("insert into t_test(id, name) ");
			sql.append( "values(?, ?) ");
			pstmt = conn.prepareStatement(sql.toString());	
			pstmt.setString(1,  id);
			pstmt.setString(2, name);
			pstmt.executeUpdate();
			System.out.println("삽입완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCclose.close(conn, pstmt);
		}
	} 
}
