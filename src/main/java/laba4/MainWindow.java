package laba4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
			/*request.setAttribute("category", category);
			request.setAttribute("city", city);
			request.setAttribute("cbm", cbm);
			request.setAttribute("age", age);
			request.setAttribute("experience", experience);
			request.setAttribute("cm", cm);
			request.setAttribute("pricep", pricep);
			request.setAttribute("promo", promo);
			*/
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
				//переход на метод или класс с прицепом
				OSAGOwithTrailer osago = new OSAGOwithTrailer();
				result = osago.calculation(category_try, city_try, cbm_try, age_try, experience_try, cm_try, promo_try);
				request.setAttribute("result", result);
			} else if (pricep_try == -1) {
				//переход на метод или класс с промокодом
				OSAGOwithPromo osago = new OSAGOwithPromo();
				result = osago.calculation(category_try, city_try, cbm_try, age_try, experience_try, cm_try, promo_try);
				request.setAttribute("result", result);
			}
		}
	}
}