package ca.sait.calculators.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Calculates result of basic arithmetic operations
 *
 * @author Vidhy Patel
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("output", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstInput = request.getParameter("first");
        String secondInput = request.getParameter("second");
        String operation = request.getParameter("operation");
        String result = "";
        if (firstInput != null && secondInput != null) {
            try {
                int first = Integer.parseInt(firstInput);
                int second = Integer.parseInt(secondInput);
                if (operation.equals("add")) {
                    result = (first + second) + "";
                } else if (operation.equals("subtract")) {
                    result = (first - second) + "";
                } else if (operation.equals("multiply")) {
                    result = (first * second) + "";
                } else if (operation.equals("divide")) {
                    result = (first / second) + "";
                }
            } catch (Exception e) {
                result = "invalid";
            }
        } else {
            result = "invalid";
        }
        request.setAttribute("firstEntry", firstInput);
        request.setAttribute("secondEntry", secondInput);
        request.setAttribute("output", result);

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
