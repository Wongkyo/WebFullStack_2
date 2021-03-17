package com.wong.s1.bankbook;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.wong.s1.member.MemberDTO;
import com.wong.s1.util.ActionFoward;

public class BankBookService {
	
		private BankBookDAO bankBookDAO;
		
		

		
		
		
		
		public ActionFoward setWrite(HttpServletRequest request)throws Exception{
			ActionFoward actionFoward = new ActionFoward();
			System.out.println("setWrite");
			//GET
			actionFoward.setPath("../WEB-INF/bankbook/bankbookWrite.jsp");
			actionFoward.setCheck(true);
			
			if(request.getMethod().toUpperCase().equals("POST")) {
				BankBookDTO bankBookDTO = new BankBookDTO();
				bankBookDTO.setBookName(request.getParameter("bookname"));
				bankBookDTO.setBookRate(Double.parseDouble(request.getParameter("bookRate")));
				bankBookDTO.setBookSale(request.getParameter("bookSale"));
				//DAO 작업
				int result = bankBookDAO.setWrite(bankBookDTO);
				actionFoward.setPath("./bankbookList.do");
				actionFoward.setCheck(false);
			}
		
			return actionFoward;
			}
		
		
		
		
		
		public void setBankBookDAO(BankBookDAO bankBookDAO) {
			this.bankBookDAO = bankBookDAO;
		}

		
		public ActionFoward getSelect(HttpServletRequest request)throws Exception{
			ActionFoward actionFoward = new ActionFoward();
		
			long bookNumber = Long.parseLong(request.getParameter("bookNumber"));
			
			BankBookDTO bankBookDTO = bankBookDAO.getSelect(bookNumber);
			
			actionFoward.setCheck(true);
			actionFoward.setPath("../WEB-INF/bankbook/bankbookSelect.jsp");
			request.setAttribute("dto", bankBookDTO);
			
			return actionFoward;
		}


		//getList dao의  getList 호출 후 리턴
		public ActionFoward getList(HttpServletRequest request)throws Exception{
			ActionFoward actionFoward = new ActionFoward();
			List<BankBookDTO> ar = bankBookDAO.getList();
			
			request.setAttribute("list", ar);
			actionFoward.setPath("../WEB-INF/bankbook/bankbookList.jsp");
			actionFoward.setCheck(true);
			
			return actionFoward;
		}
	
	
	
}
