package Pr_9;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CalculatorServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Servlet CalculatorServlet</title></head><body>");

        try {
            double n1 = Double.parseDouble(request.getParameter("txtN1"));
            double n2 = Double.parseDouble(request.getParameter("txtN2"));
            String opr = request.getParameter("opr");

            double result = 0;

            switch (opr) {
                case "+":
                    result = n1 + n2;
                    break;
                case "-":
                    result = n1 - n2;
                    break;
                case "*":
                    result = n1 * n2;
                    break;
                case "/":
                    result = n2 != 0 ? n1 / n2 : 0;
                    break;
                default:
                    out.println("<h3>Invalid Operation</h3>");
                    break;
            }

            out.println("<h1>Result = " + result + "</h1>");
        } catch (NumberFormatException e) {
            out.println("<h3>Error: Please enter valid numbers!</h3>");
        }

        out.println("</body></html>");
    }
}

