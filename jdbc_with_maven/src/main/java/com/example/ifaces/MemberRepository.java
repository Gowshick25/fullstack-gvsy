package com.example.ifaces;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.entity.Product;
import com.example.ifaces.*;

public class MemberRepository implements CrudRepository<Member> {

	
	private Connection con;
	public MemberRepository(Connection con) {
		
		super();
		this.con=con;
		
	}

		public int add(Member obj) {
			int rowAdded = 0;
			
			String sql = "insert into sathiyaa_member values(?,?,?,?,?,?,?,?)";
					
					try(PreparedStatement pstmt = con.prepareStatement(sql)) {
						
						pstmt.setInt(1, obj.getMemberId());
						pstmt.setString(2,obj.getMemberName());
						pstmt.setString(3,obj.getMemberAddress());
						pstmt.setDate(4,null);
						pstmt.setString(5,obj.getMemberShipType());
						pstmt.setDouble(6,obj.getFeesPaid());
						pstmt.setInt(7,obj.getMaxBookAllowed());
						pstmt.setInt(8,obj.getPenaltyAmount());
						
						rowAdded = pstmt.executeUpdate();
						
						
				}catch (SQLException e) {
				e.printStackTrace();
			}
			return rowAdded;
		}
	public List<Member> findAll() {
		
		 List <Member> productList = new ArrayList<Member>();
		 
		 String sql = "select * from gowshick_product";
		 
		 try (PreparedStatement pstmt = con.prepareStatement(sql)){
			 
			ResultSet rs= pstmt.executeQuery();
			
			while (rs.next())
			{
				int memberId = rs.getInt("");

				String memberName = rs.getString("");

				String memberAddress = rs.getDouble("");

				Date accountOpenDate= rs.getInt("");

				String memberShipType = rs.getString("");

				double  feesPaid = rs.getDouble("");
				
				int maxBookAllowed = rs.getString("");

				int  penaltyAmount = rs.getDouble("");
				
				Member prod = new Member( memberId, memberName,  memberAddress,  accountOpenDate,
						 memberShipType,  feesPaid,  maxBookAllowed,  penaltyAmount);
				
				productList.add(prod);
			}
					
		 } catch (SQLException e) {
			e.printStackTrace();
		}
		 return productList;
		}
	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Member findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public int update(int Id, Member obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	
}
