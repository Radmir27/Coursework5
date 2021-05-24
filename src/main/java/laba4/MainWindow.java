package laba4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="Calc", urlPatterns="/JavaCalc")
public class MainWindow extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestCalc Calc = RequestCalc.fromRequestParameters(request);
		Calc.setAsRequestAttributesAndCalculate(request);
		
		request.getRequestDispatcher("/Form.jsp").forward(request, response);
	}
	
	private static class RequestCalc {
		private final String category;
		private final String city;
		private final String cbm;
		private final String age;
		private final String experience;
		private final String cm;
		private final String pricep;
		private final String promo;
		
		private float result;
						
		private RequestCalc (String category, String city, String cbm, String age, String experience, String cm, String pricep,String promo) {
			this.category = category;
			this.city = city;
			this.cbm = cbm;
			this.age = age;
			this.experience = experience;
			this.cm = cm;
			this.pricep = pricep;
			this.promo = promo;
			}
		
		public static RequestCalc fromRequestParameters(HttpServletRequest request) {
			return new RequestCalc(
			request.getParameter("category"),
			request.getParameter("city"),
			request.getParameter("cbm"),
			request.getParameter("age"),
			request.getParameter("experience"),
			request.getParameter("cm"),
			request.getParameter("pricep"),
			request.getParameter("promo"));
			}
				
		public void setAsRequestAttributesAndCalculate(HttpServletRequest request) throws IOException {
			
			request.setAttribute("promo", promo);
			
			int category_try;
			int city_try;
			int cbm_try;
			int age_try;
			int experience_try;
			int cm_try;
			int pricep_try;
			String promo_try;
			
			category_try = Integer.parseInt(category);
			city_try = Integer.parseInt(city);
			cbm_try = Integer.parseInt(cbm);
			age_try = Integer.parseInt(age);
			experience_try = Integer.parseInt(experience);
			cm_try = Integer.parseInt(cm);
			pricep_try = Integer.parseInt(pricep);
			promo_try = promo;
			
			if (pricep_try == 1) {
				//������� �� ����� ��� ����� � ��������
				OSAGOwithTrailer osago = new OSAGOwithTrailer();
				result = osago.calculation(category_try, city_try, cbm_try, age_try, experience_try, cm_try, promo_try);
				request.setAttribute("result", result);
			} else if (pricep_try == -1) {
				//������� �� ����� ��� ����� � ����������
				OSAGOwithPromo osago = new OSAGOwithPromo();
				result = osago.calculation(category_try, city_try, cbm_try, age_try, experience_try, cm_try, promo_try);
				request.setAttribute("result", result);
			}
			
			for (int i = 0; i < 12; i++) {
				if (i == category_try) {
					request.setAttribute("category" + i, "selected");
				} else {
					request.setAttribute("category" + i, "");
				}
			}
			
			for (int i = 0; i < 5; i++) {
				if (i == city_try) {
					request.setAttribute("city" + i, "selected");
				} else {
					request.setAttribute("city" + i, "");
				}
			}
			
			for (int i = 0; i < 15; i++) {
				if (i == cbm_try) {
					request.setAttribute("cbm" + i, "selected");
				} else {
					request.setAttribute("cbm" + i, "");
				}
			}
			
			for (int i = 0; i < 8; i++) {
				if (i == age_try) {
					request.setAttribute("age" + i, "selected");
				} else {
					request.setAttribute("age" + i, "");
				}
			}
			
			for (int i = 0; i < 8; i++) {
				if (i == experience_try) {
					request.setAttribute("experience" + i, "selected");
					if (i == 0) {
						request.setAttribute("cbm" , "disabled");
			        	request.setAttribute("cbm4" , "selected");
					}
				} else {
					request.setAttribute("experience" + i, "");
				}
			}
			
			for (int i = 0; i < 6; i++) {
				if (i == cm_try) {
					request.setAttribute("cm" + i, "selected");
				} else {
					request.setAttribute("cm" + i, "");
				}
			}
			
			if (1 == pricep_try) {
				request.setAttribute("pricep1", "checked");
				request.setAttribute("pricep0", "");
				request.setAttribute("promoog" , "disabled");
			} else {
				request.setAttribute("pricep1", "");
				request.setAttribute("pricep0", "checked");
			}
		}
	}
}