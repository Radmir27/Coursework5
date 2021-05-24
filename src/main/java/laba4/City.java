package laba4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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

@WebServlet(name="City", urlPatterns="/JavaCity")
public class City extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestCity auth = RequestCity .fromRequestParameters(request);
        auth.setConfCity(request);
        request.getRequestDispatcher("/admpanel.jsp").forward(request, response);

    }

    private static class RequestCity  {
        private final float[] city;

        private RequestCity  (String city0, String city1 ,String city2, String city3, String city4) {
        	city = new float[5];
        	try {
        		city[0] = Float.parseFloat(city0);
        	} catch(Exception ex) {
        		city[0] = 0;
    		}
        	try {
        		city[1] = Float.parseFloat(city1);
        	} catch(Exception ex) {
        		city[1] = 0;
    		}
        	try {
        		city[2] = Float.parseFloat(city2);
        	} catch(Exception ex) {
        		city[2] = 0;
    		}
        	try {
        		city[3] = Float.parseFloat(city3);
        	} catch(Exception ex) {
        		city[3] = 0;
    		}
        	try {
        		city[4] = Float.parseFloat(city4);
        	} catch(Exception ex) {
        		city[4] = 0;
    		}
        }

        public static RequestCity  fromRequestParameters(HttpServletRequest request) {
            return new RequestCity (
            request.getParameter("city0"),
            request.getParameter("city1"),
            request.getParameter("city2"),
            request.getParameter("city3"),
            request.getParameter("city4")
                    );
            }
        
        public void setConfCity(HttpServletRequest request) throws IOException {
        	
        	File file;
        	
        	String[] labe = new String[5];
        	
        	
        	Coef coef = new Coef();
        	coef.setCity();
        	
        	for (int i = 0; i < 5; i++) {
        		labe[i] = "Коэффициент города успешно изменен!"; 
        		if (city[i] == (float)0) {
        			city[i] = coef.cityCoef[i];
        			labe[i] = "Коэффициент города не изменился."; 
        		}
        	}
        	try {
    			String filepath = new File("").getCanonicalPath();
    			String[] parsfilepath = filepath.split("/");
    			
    			int lengthpath = parsfilepath.length;
    			String abspath=""; 
    			for(int i=0;i<(lengthpath-1);i++) { 
    				abspath=abspath+parsfilepath[i]+"/";
    			}
    			filepath=abspath+"apache-tomcat-10.0.5/webapps/Calculate/conf/city.txt";
    			file = new File(filepath);
    			FileWriter fw = new FileWriter(file);
        		PrintWriter pw = new PrintWriter(fw);
        		for (int i = 0; i < 5; i++) {
        			pw.print(city[i] + " ");
            	}
        		pw.close();
        	} catch(Exception ex) {
        		for (int i = 0; i < 5; i++) {
        			labe[i] = "Коэффициент города не изменился."; 
            	}
    		}
        	for (int i = 0; i < 5; i++) {
        		request.setAttribute("labe" + i, labe[i]);
        	}
        }
    }
}
