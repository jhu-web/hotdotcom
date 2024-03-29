package hotdotcom;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/** Servlet that simply redirects users to the
 *  Web application home page. Registered with the
 *  default servlet URL to prevent access to servlets
 *  through URLs that have no security settings.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, 
 *  Spring, Hibernate, JPA, and Java</a>.
 */
@WebServlet("/servlet/*")
public class RedirectorServlet extends HttpServlet {
  private static final long serialVersionUID = -4903141835246978349L;

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    response.sendRedirect(request.getContextPath());
  }

  public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}
