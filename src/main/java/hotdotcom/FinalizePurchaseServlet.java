package hotdotcom;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/** Servlet that reads credit card information,
 *  performs a stock purchase, and displays confirmation page.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, 
 *  Spring, Hibernate, JPA, and Java</a>.
 */
@WebServlet("/ssl/FinalizePurchase")
public class FinalizePurchaseServlet extends HttpServlet {

  private static final long serialVersionUID = -7470845803003250055L;

  /**
   * Use doPost for non-SSL access to prevent credit card number from showing up in URL.
   */

  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    String fullName = request.getParameter("fullName");
    String cardNum = request.getParameter("cardNum");
    confirmPurchase(fullName, cardNum);
    String destination = "/investing/sucker.jsp";
    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destination);
    dispatcher.forward(request, response);
  }

  /**
   * doGet calls doPost. Servlets that are redirected to through SSL must have doGet.
   */

  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    doPost(request, response);
  }

  private void confirmPurchase(String fullName, String cardNum) {
    // Details removed to protect the guilty.
  }
}
