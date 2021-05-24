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

@WebServlet(name="Login", urlPatterns="/JavaLogin")
public class Login extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    static boolean prov1;
    static boolean prov2;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestLogin auth = RequestLogin.fromRequestParameters(request);
        auth.Proverka(request);

        if (prov1) {
        	for (int i = 0; i < 5; i++) {
        			request.setAttribute("labe" + i, "hidden");
        			request.setAttribute("labe" + i + "1", "hidden");
        	}
            request.getRequestDispatcher("/admpanel.jsp").forward(request, response);
        } else if (prov2) {
            request.getRequestDispatcher("/Form.jsp").forward(request, response);
        } else {
        	request.getRequestDispatcher("/indexFalse.jsp").forward(request, response);
        }
    }

    private static class RequestLogin {
        private final String login;
        private final String pass;

        private RequestLogin (String login, String pass) {
            this.login = login;
            this.pass = pass;
            }

        public static RequestLogin fromRequestParameters(HttpServletRequest request) {
            return new RequestLogin(
            request.getParameter("login"),
            request.getParameter("pass")
                    );
            }
        
        public void Proverka(HttpServletRequest request) throws IOException {

            String login_try;
            String pass_try;

            login_try = login;
            pass_try = pass;

            Check check = new Check();
            prov1 = check.check1(login_try, pass_try);
            prov2 = check.check2(login_try, pass_try);
        }
    }
}
