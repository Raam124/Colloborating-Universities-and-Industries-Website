/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.56
 * Generated at: 2019-04-07 10:52:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ResearchProblem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      out.write("    <title>Research Problem</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Icons font CSS-->\r\n");
      out.write("    <link href=\"mdi-fontmaterial-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <link href=\"font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <!-- Font special for pages-->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Vendor CSS-->\r\n");
      out.write("    <link href=\"select2.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <link href=\"daterangepicker.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Main CSS-->\r\n");
      out.write("    <link href=\"main.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"page-wrapper bg-gra-03 p-t-45 p-b-50\">\r\n");
      out.write("        <div class=\"wrapper wrapper--w790\">\r\n");
      out.write("            <div class=\"card card-5\">\r\n");
      out.write("                <div class=\"card-heading\">\r\n");
      out.write("                    <h2 class=\"title\">Research Problem Form</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <form method=\"POST\" action=\"xyz2\">\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                            <div class=\"name\">Company</div>\r\n");
      out.write("                            <div class=\"value\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <input class=\"input--style-5\" type=\"text\" name=\"txtCname\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                            <div class=\"name\">Email</div>\r\n");
      out.write("                            <div class=\"value\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <input class=\"input--style-5\" type=\"email\" name=\"txtMail\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                            <div class=\"name\">Title</div>\r\n");
      out.write("                            <div class=\"value\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <input class=\"input--style-5\" type=\"text\" name=\"txtTitle\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                         <div class=\"form-row\">\r\n");
      out.write("                            <div class=\"name\">Date</div>\r\n");
      out.write("                            <div class=\"value\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <input class=\"input--style-5\" type=\"text\" name=\"txtDate\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                       \r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                            <div class=\"name\">University</div>\r\n");
      out.write("                            <div class=\"value\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <div class=\"rs-select2 js-select-simple select--no-search\">\r\n");
      out.write("                                        <select name=\"txtSubject\">\r\n");
      out.write("                                            <option disabled=\"disabled\" selected=\"selected\">Choose option</option>\r\n");
      out.write("                                            <option>NSBM Grenn University</option>\r\n");
      out.write("                                            <option>Plymouth University</option>\r\n");
      out.write("                                            <option>IIT Madras</option>\r\n");
      out.write("                                             <option>All</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                        <div class=\"select-dropdown\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                            <div class=\"name\">Problem</div>\r\n");
      out.write("                            <div class=\"value\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <textarea class=\"input--style-5\"  name=\"txtProblem\" rows=\"4\" cols=\"49\"></textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-row p-t-20\">\r\n");
      out.write("                            <label class=\"label label--block\">Are you an existing company?</label>\r\n");
      out.write("                            <div class=\"p-t-15\">\r\n");
      out.write("                                <label class=\"radio-container m-r-55\">Yes\r\n");
      out.write("                                    <input type=\"radio\" checked=\"checked\" name=\"exist\">\r\n");
      out.write("                                    <span class=\"checkmark\"></span>\r\n");
      out.write("                                </label>\r\n");
      out.write("                                <label class=\"radio-container\">No\r\n");
      out.write("                                    <input type=\"radio\" name=\"exist\">\r\n");
      out.write("                                    <span class=\"checkmark\"></span>\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <button class=\"btn btn--radius-2 btn--red\" type=\"submit\" name=\"btnSubmit\">Submit</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Jquery JS-->\r\n");
      out.write("    <script src=\"jquery.min.js\"></script>\r\n");
      out.write("    <!-- Vendor JS-->\r\n");
      out.write("    <script src=\"select2.min.js\"></script>\r\n");
      out.write("    <script src=\"moment.min.js\"></script>\r\n");
      out.write("    <script src=\"daterangepicker.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Main JS-->\r\n");
      out.write("    <script src=\"global.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body><!-- This templates was made by Colorlib (https://colorlib.com) -->\r\n");
      out.write("\r\n");
      out.write("</html>");
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
