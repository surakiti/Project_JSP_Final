package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rewards_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Rewards</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:400,100,300,500\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"css/agency.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/others/profile.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"shortcut icon\" href=\"\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"page-top\" class=\"index\">\n");
      out.write("\t\t<nav id=\"mainNav\" class=\"navbar navbar-default navbar-custom navbar-fixed-top\">\n");
      out.write("\t\t      \t<div class=\"container\">\n");
      out.write("\t\t            <div class=\"navbar-header page-scroll\">\n");
      out.write("\t\t                <a class=\"navbar-calcories page-scroll\" href=\"Index.jsp\" style=\"color:#F27935;\">Calcories</a>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t                    <li class=\"hidden\">\n");
      out.write("\t\t                        <a href=\"#page-top\"></a>\n");
      out.write("\t\t                    </li>\n");
      out.write("\t\t                    <li>\n");
      out.write("\t\t                        <a class=\"page-scroll\" href=\"Index.jsp#about\" style=\"color:#F27935;\">About</a>\n");
      out.write("\t\t                    </li>\n");
      out.write("\t\t                    <li>\n");
      out.write("\t\t                        <a class=\"page-scroll\" href=\"Index.jsp#portfolio\" style=\"color:#F27935;\">Voucher</a>\n");
      out.write("\t\t                    </li>\n");
      out.write("\t\t                    <li>\n");
      out.write("\t\t                        <a class=\"page-scroll\" href=\"Index.jsp#team\" style=\"color:#F27935;\">Team</a>\n");
      out.write("\t\t                    </li>\n");
      out.write("\t\t                    <li>\n");
      out.write("\t\t                        <a class=\"page-scroll\" href=\"logout\" style=\"color:#F27935;\" ><c:set var=\"loginOrLogout\"value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username==null ? 'Login':'Logout'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginOrLogout}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("\t\t                    </li>\n");
      out.write("\t\t                </ul>\n");
      out.write("\t\t            </div>  \n");
      out.write("\t\t        </div> \n");
      out.write("\t\t</nav>\n");
      out.write("\t\t<div class=\"paddingprofile\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t            <div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12 col-sm-12\">\n");
      out.write("\t\t\t\t\t    <div class=\"card hovercard\">\n");
      out.write("\t\t\t\t\t        <div class=\"card-background\">\n");
      out.write("\t\t\t\t\t            <img class=\"card-bkimg\" alt=\"\" src=\"http://i2.cdscdn.com/pdt2/2/0/0/1/700x700/auc5060219944200/rw/figurine-geante-mickey-mouse.jpg\">\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t        <div class=\"useravatar\">\n");
      out.write("\t\t\t\t\t        \t<img src=\"http://i2.cdscdn.com/pdt2/2/0/0/1/700x700/auc5060219944200/rw/figurine-geante-mickey-mouse.jpg\">\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t        <div class=\"card-info\"> <span class=\"card-title\"><a href=\"Profiles\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fullnames}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></span>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-9\">\n");
      out.write("\t\t\t\t\t\t<h2>Voucher/Rewards</h2>\n");
      out.write("\t\t\t\t\t\t<h2 style=\"margin-top: -10px;\">แลกของรางวัล</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3 showcoin\">\n");
      out.write("\t\t\t\t\t\t<h4><img src=\"http://image.flaticon.com/icons/svg/138/138292.svg\" height=\"20px\">  Your coins:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${coin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"tab-content\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row showreward\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-3 rewardcard\">\n");
      out.write("\t\t\t\t\t\t\t\t<center><img src=\"http://image.flaticon.com/icons/svg/266/266602.svg\" height=\"50px\" style=\"margin-top: 5%\"></center>\n");
      out.write("\t\t\t\t\t\t\t\t<center><h2 style=\"margin-top: 10%\">เครปลุงหนุ่ม</h2></center>\n");
      out.write("\t\t\t\t\t\t\t\t<center><button type=\"button\" value=\"50\"class=\"btn btn-warning\" style=\"margin-top: 10%;margin-bottom: 10%\">50 Points</button></center>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-3 rewardcard\">\n");
      out.write("\t\t\t\t\t\t\t\t<center><img src=\"http://image.flaticon.com/icons/svg/266/266602.svg\" height=\"50px\" style=\"margin-top: 5%\"></center>\n");
      out.write("\t\t\t\t\t\t\t\t<center><h2 style=\"margin-top: 10%\">เครปลุงหนุ่ม</h2></center>\n");
      out.write("\t\t\t\t\t\t\t\t<center><button type=\"button\" value=\"50\"class=\"btn btn-warning\" style=\"margin-top: 10%;margin-bottom: 10%\">50 Points</button></center>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-3 rewardcard\">\n");
      out.write("\t\t\t\t\t\t\t\t<center><img src=\"http://image.flaticon.com/icons/svg/266/266602.svg\" height=\"50px\" style=\"margin-top: 5%\"></center>\n");
      out.write("\t\t\t\t\t\t\t\t<center><h2 style=\"margin-top: 10%\">เครปลุงหนุ่ม</h2></center>\n");
      out.write("\t\t\t\t\t\t\t\t<center><button type=\"button\" value=\"50\"class=\"btn btn-warning\" style=\"margin-top: 10%;margin-bottom: 10%\">50 Points</button></center>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-3 rewardcard\">\n");
      out.write("\t\t\t\t\t\t\t\t<center><img src=\"http://image.flaticon.com/icons/svg/266/266602.svg\" height=\"50px\" style=\"margin-top: 5%\"></center>\n");
      out.write("\t\t\t\t\t\t\t\t<center><h2 style=\"margin-top: 10%\">เครปลุงหนุ่ม</h2></center>\n");
      out.write("                                                                <center><button type=\"button\" value=\"50\" class=\"btn btn-warning\" style=\"margin-top: 10%;margin-bottom: 10%\">50 Points</button></center>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t    \t\t\t    <!-- jQuery -->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Plugin JavaScript -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Contact Form JavaScript -->\n");
      out.write("    <script src=\"js/jqBootstrapValidation.js\"></script>\n");
      out.write("    <script src=\"js/contact_me.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Theme JavaScript -->\n");
      out.write("    <script src=\"js/agency.min.js\"></script>\n");
      out.write("\t</body>\n");
      out.write("\n");
      out.write("\t<footer>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <span class=\"copyright\">2016 JSP Project \"Calcories\"</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\"><!--\n");
      out.write("                    <ul class=\"list-inline social-buttons\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>-->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <ul class=\"list-inline quicklinks\">\n");
      out.write("                        <li><a href=\"https://www.sit.kmutt.ac.th/\">SIT</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"http://www.kmutt.ac.th/\">KMUTT</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
