package laba4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Login", urlPatterns="/JavaLogin")
public class Login extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestLogin auth = RequestLogin.fromRequestParameters(request);
        boolean prov = auth.Proverka(request);

        if (prov) {
            request.getRequestDispatcher("/AdminWindow.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/Authorization.jsp").forward(request, response);
        }
    }

    private static class RequestLogin {
        private final String login;
        private final String pass;

        private float result;

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
        public boolean Proverka(HttpServletRequest request) throws IOException {

            String login_try;
            String pass_try;

            login_try = login;
            pass_try = pass;

            Check check = new Check();
            return check.check(login_try, pass_try);
        }
    }
}
