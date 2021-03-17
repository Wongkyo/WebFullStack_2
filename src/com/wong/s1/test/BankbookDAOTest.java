package com.wong.s1.test;

import java.util.List;

import com.wong.s1.bank.BankBookDAO;
import com.wong.s1.bank.BankBookDTO;

public class BankbookDAOTest {

	public static void main(String[] args) {
		BankBookDAO bankBookDAO = new BankBookDAO();
		try {
			List<BankBookDTO> ar=bankBookDAO.getList();
			System.out.println(ar.size() != 0);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
