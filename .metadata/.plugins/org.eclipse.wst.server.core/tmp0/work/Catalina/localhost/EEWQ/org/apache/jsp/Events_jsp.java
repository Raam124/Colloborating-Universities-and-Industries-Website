/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.92
 * Generated at: 2019-05-18 12:13:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Events_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- Required meta tags-->\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"Colorlib Templates\">\r\n");
      out.write("    <meta name=\"author\" content=\"Colorlib\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"Colorlib Templates\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Title Page-->\r\n");
      out.write("    <title>Apply for Event</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Font special for pages-->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Main CSS-->\r\n");
      out.write("    <link href=\"main2.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"page-wrapper bg-dark p-t-100 p-b-50\">\r\n");
      out.write("        <div class=\"wrapper wrapper--w900\">\r\n");
      out.write("            <div class=\"card card-6\">\r\n");
      out.write("                <div class=\"card-heading\">\r\n");
      out.write("                    <h2 class=\"title\">Apply for Event</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                     <form method=\"POST\" action=\"iioi\">\r\n");
      out.write("                     <div class=\"form-row\">\r\n");
      out.write("                            <div class=\"name\">Reg.No</div>\r\n");
      out.write("                            <div class=\"value\">\r\n");
      out.write("                                <input class=\"input--style-6\" type=\"text\" name=\"rno\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                            <div class=\"name\">Organization name</div>\r\n");
      out.write("                            <div class=\"value\">\r\n");
      out.write("                                <input class=\"input--style-6\" type=\"text\" name=\"orga_name\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                            <div class=\"name\">Event name</div>\r\n");
      out.write("                            <div class=\"value\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <input class=\"input--style-6\" type=\"text\" name=\"ename\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                            <div class=\"name\">University name</div>\r\n");
      out.write("                            <div class=\"value\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                  <select name=\"txtUni\">\r\n");
      out.write("                                            <option disabled=\"disabled\" selected=\"selected\">Choose University</option>\r\n");
      out.write("                                            <option>NSBM Green University</option>\r\n");
      out.write("                                            <option>Plymouth University</option>\r\n");
      out.write("                                            <option>IIT Madras</option>\r\n");
      out.write("                                             <option>All</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                            <div class=\"name\">Date</div>\r\n");
      out.write("                            <div class=\"value\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <input class=\"input--style-6\" type=\"text\" name=\"edate\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                            <div class=\"name\">Event details</div>\r\n");
      out.write("                            <div class=\"value\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <textarea class=\"textarea--style-6\" name=\"edetail\" ></textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                            <div class=\"name\">Upload Image</div>\r\n");
      out.write("                            <div class=\"value\">\r\n");
      out.write("                                <div class=\"input-group js-input-file\">\r\n");
      out.write("                                    <input class=\"input-file\" type=\"file\" name=\"photo\" id=\"file\">\r\n");
      out.write("                                    <label class=\"label--file\" for=\"file\">Choose file</label>\r\n");
      out.write("                                    <span class=\"input-file__info\">No file chosen</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"label--desc\">Upload your Image. Max file size 50 MB</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"card-footer\">\r\n");
      out.write("                    <button class=\"btn btn--radius-2 btn--blue-2\" type=\"submit\">Send Application</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                     </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Jquery JS-->\r\n");
      out.write("    <script src=\"jquery2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Main JS-->\r\n");
      out.write("    <script src=\"global2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body><!-- This templates was made by Colorlib (https://colorlib.com) -->\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("<!-- end document-->");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
