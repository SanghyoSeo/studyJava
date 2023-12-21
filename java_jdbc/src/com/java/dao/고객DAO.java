package com.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.java.datasource.DataSource;
import com.jdbc.dto.고객VO;

public class 고객DAO implements DAO<고객VO> {

	private DataSource dataSource = DataSource.getInstance();
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public List<고객VO> selectList() throws Exception {
		Connection conn = dataSource.getConnection();
		Statement stmt = conn.createStatement();
		
		String sql = "select * from 고객";		
		ResultSet rs = stmt.executeQuery(sql);
		
		List<고객VO> 고객리스트 = new ArrayList<고객VO>();
		while (rs.next()) {
			고객VO 고객 = new 고객VO();
			
			고객.set고객아이디(rs.getString("고객아이디"));
			고객.set고객이름(rs.getString("고객이름"));
			고객.set나이(rs.getInt("나이"));
			고객.set등급(rs.getString("등급"));
			고객.set직업(rs.getString("직업"));
			고객.set적립금(rs.getInt("적립금"));
			
			고객리스트.add(고객);
		}
		
		for (int i = 0; i < 고객리스트.size(); i++) {
			고객VO 고객 = 고객리스트.get(i);
			
//			System.out.println(고객.get고객아이디() + "\t" 
//								+ 고객.get고객이름() + "\t"
//								+ 고객.get나이() + "\t"
//								+ 고객.get등급() + "\t"
//								+ 고객.get직업() + "\t"
//								+ 고객.get적립금() + "\t");
			System.out.println(고객);
		}
		
		if(stmt != null)stmt.close();
		if(conn != null)conn.close();
		
		return 고객리스트;
	}

	@Override
	public 고객VO selectById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(고객VO e) throws Exception {
		Connection conn = dataSource.getConnection();
		
		String sql = "insert into 고객(고객아이디, 고객이름, 나이, 등급, 직업, 적립금) " +
				"values(?, ?, ?, ?, ?, ?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, e.get고객아이디());
		pstmt.setString(2, e.get고객이름());
		pstmt.setInt(3, e.get나이());
		pstmt.setString(4, e.get등급());
		pstmt.setString(5, e.get직업());
		pstmt.setInt(6, e.get적립금());
		
		pstmt.executeUpdate();
		
		if(pstmt != null)pstmt.close();
		if(conn != null)conn.close();
		
	}

	@Override
	public void update(고객VO e) throws Exception {
		Connection conn = dataSource.getConnection();
		String sql = "update 고객 set "
					+ "고객이름=?, 나이=?, 등급=?, 직업=?, 적립금=? "
					+ "where 고객아이디=?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, e.get고객이름());
		pstmt.setInt(2, e.get나이());
		pstmt.setString(3, e.get등급());
		pstmt.setString(4, e.get직업());
		pstmt.setInt(5, e.get적립금());
		pstmt.setString(6, e.get고객아이디());
		
		pstmt.executeUpdate();
		
		if(pstmt != null)pstmt.close();
		if(conn != null)conn.close();

		
	}

	@Override
	public void delete(String id) throws Exception {
		Connection conn = dataSource.getConnection();
		String sql = "delete from 고객 where 고객아이디='" + id + "'";
		
		Statement stmt = conn.createStatement();
		
		stmt.executeUpdate(sql);
		
		if(stmt != null)stmt.close();
		if(conn != null)conn.close();
		
	}
	
}
