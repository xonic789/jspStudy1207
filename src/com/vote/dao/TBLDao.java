package com.vote.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBPKG.OracleConnection;

import com.vote.dto.Tbl_Vote_202005;

public class TBLDao {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void closeAll() throws SQLException{
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
	
	//Vote
	public List<Tbl_Vote_202005> getAllList(){
		String sql="select * from tbl_vote_202005";
		List<Tbl_Vote_202005> list = new ArrayList<Tbl_Vote_202005>();
		try {
			conn=OracleConnection.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				list.add(new Tbl_Vote_202005(rs.getString("v_jumin"),rs.getString("v_name"),
						rs.getString("m_no"), rs.getString("v_time"), rs.getString("v_area"), rs.getString("v_confirm")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				System.out.println("finally close");
				closeAll();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	//Number
	//Party
	
}
