package laba4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Calc", urlPatterns="/JavaCalc")
public class MainWindow extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestCalc Calc = RequestCalc.fromRequestParameters(request);
		Calc.setAsRequestAttributesAndCalculate(request);
		 
		request.getRequestDispatcher("/Results.jsp").forward(request, response);
		/*osago.setCategory(category.getSelectedIndex());
                	osago.setCity(city.getSelectedIndex());
                	osago.setCBM(kbm.getSelectedIndex());
                	osago.setAge(age.getSelectedIndex());
                	osago.setExperience(experience.getSelectedIndex());
                	osago.setCM(power.getSelectedIndex());
                	osago.peredacha();
                	totalMin.setText(String.valueOf(osago.getTotalMin()));
                	totalMax.setText(String.valueOf(osago.getTotalMax()));*/
	}
	
	private static class RequestCalc {
		//private final String first_calc;
		//private final String second_calc;
		private float result;
		
		private final int category;
		private final String city;
		private final String cbm;
		private final String age;
		private final String experience;
		private final String cm;
		private final String pricep;
		private final String promo;
						
		private RequestCalc (String category, String city, String cbm, String age, String experience, String cm, String pricep,String promo) {
			this.category = category.getSelectedIndex();
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
				
		public void setAsRequestAttributesAndCalculate(HttpServletRequest request) {
			request.setAttribute("category", category);
			request.setAttribute("city", city);
			request.setAttribute("cbm", cbm);
			request.setAttribute("age", age);
			request.setAttribute("experience", experience);
			request.setAttribute("cm", cm);
			request.setAttribute("pricep", pricep);
			request.setAttribute("promo", promo);
			//float first_try;
			//float second_try;
			/*try { 
			first_try=Float.parseFloat(first_calc);
			second_try=Float.parseFloat(second_calc);
			}
			catch (NumberFormatException e) {
				first_try=0;
				second_try=0;	
			}*/
			/*if (first_try <= 0 || second_try <= 0) {
				first_try = 0;
				second_try = 0;
			}
			
			result=first_try*second_try/2;
			request.setAttribute("result", result);*/
		}
		
	}
	
	
}