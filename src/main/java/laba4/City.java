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

@WebServlet(name="City", urlPatterns="/JavaCity")
public class City extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    static boolean prov1;
    static boolean prov2;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestLogin auth = RequestLogin.fromRequestParameters(request);
        auth.setConfCity(request);
        request.getRequestDispatcher("/admpanel.jsp").forward(request, response);

        /*if (prov1) {
            request.getRequestDispatcher("/admpanel.jsp").forward(request, response);
        } else if (prov2) {
            request.getRequestDispatcher("/Form.jsp").forward(request, response);
        } else {
        	request.getRequestDispatcher("/indexFalse.jsp").forward(request, response);
        }*/
    }

    private static class RequestLogin {
        private final float[] city;

        private RequestLogin (String city0, String city1 ,String city2, String city3, String city4) {
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

        public static RequestLogin fromRequestParameters(HttpServletRequest request) {
            return new RequestLogin(
            request.getParameter("city0"),
            request.getParameter("city1"),
            request.getParameter("city2"),
            request.getParameter("city3"),
            request.getParameter("city4")
                    );
            }
        
        public void setConfCity(HttpServletRequest request) throws IOException {
        	
        	File file;
        	
        	Coef coef = new Coef();
        	coef.setCity();
        	
        	for (int i = 0; i < 5; i++) {
        		if (city[i] == 0) {
        			city[i] = coef.cityCoef[i];
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
    			filepath=abspath+"webapp/conf/city.txt";
    			file = new File(filepath);
    			FileWriter fw = new FileWriter(file);
        		PrintWriter pw = new PrintWriter(fw);
        		for (int i = 0; i < 5; i++) {
        			pw.print(city[i] + " ");
            	}
        		pw.close();
        	} catch(Exception ex) {
        		ex.printStackTrace();
    		}
        }
    }
}