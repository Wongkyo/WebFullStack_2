package com.wong.s1.test;

import java.util.List;

import com.wong.s1.bankbook.BankBookDAO;
import com.wong.s1.bankbook.BankBookDTO;

public class BankbookDAOTest {

	public static void main(String[] args) {
		BankBookDAO bankBookDAO = new BankBookDAO();
		try {
			BankBookDTO bankBookDTO= bankBookDAO.getSelect(1);
			System.out.println(bankBookDTO != null);
			
			//List<BankBookDTO> ar=bankBookDAO.getList();
			//System.out.println(ar.size() != 0);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
