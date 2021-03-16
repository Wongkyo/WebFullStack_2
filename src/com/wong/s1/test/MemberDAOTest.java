package com.wong.s1.test;

import com.wong.s1.member.MemberDAO;
import com.wong.s1.member.MemberDTO;

public class MemberDAOTest {

	public static void main(String[] args) {
		//Web 에서 메인 메서드는 테스트 용도로만 사용
		MemberDAO memberDAO = new MemberDAO();
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id3");
		memberDTO.setPw("pw3");
		memberDTO.setName("id3");
		memberDTO.setEmail("id3@naver.com");
		memberDTO.setPhone("01022222222");
		
		try {
			int result = memberDAO.memberJoin(memberDTO);
			
			System.out.println(result != 0);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}