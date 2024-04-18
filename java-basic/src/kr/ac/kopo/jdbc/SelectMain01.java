package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCclose;

public class SelectMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// 1,2
			conn = new ConnectionFactory().getConnection();
			
			// 3�ܰ� : ������ ���� ���ఴü ���
			String sql = "select * from t_test ";
			pstmt = conn.prepareStatement(sql);
			
			// 4�ܰ� : ���� �� ��� ���
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.println(name + "(" + id + ")");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5�ܰ�
			JDBCclose.close(conn, pstmt);
		}
	}
}