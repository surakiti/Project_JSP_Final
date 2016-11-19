package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class Profiles_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Profile</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:400,100,300,500\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"css/agency.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/others/profile.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendor/others/photo.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"shortcut icon\" href=\"\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"page-top\" class=\"index\" >\n");
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
      out.write("                                        <a class=\"page-scroll\" href=\"logout\" style=\"color:#F27935;\" >");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginOrLogout}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("\t\t                    </li>\n");
      out.write("\t\t                </ul>\n");
      out.write("\t\t            </div>  \n");
      out.write("\t\t        </div> \n");
      out.write("\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t<div class=\"paddingprofile\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t            <div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12 col-sm-12\">\n");
      out.write("\t\t\t\t\t    <div class=\"card hovercard\">\n");
      out.write("\t\t\t\t\t        <div class=\"card-background\">\n");
      out.write("\t\t\t\t\t            <img class=\"card-bkimg\" alt=\"\" src=\"http://i2.cdscdn.com/pdt2/2/0/0/1/700x700/auc5060219944200/rw/figurine-geante-mickey-mouse.jpg\">\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t        <div class=\"useravatar\">\n");
      out.write("                                                    <!-------->\n");
      out.write("\n");
      out.write("                                          <img src=\"http://i2.cdscdn.com/pdt2/2/0/0/1/700x700/auc5060219944200/rw/figurine-geante-mickey-mouse.jpg\">\n");
      out.write("\t\t\t\t\t        \n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t        <div class=\"card-info\"> <span class=\"card-title\"><a href=\"Profiles\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></span>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t    <div class=\"btn-pref btn-group btn-group-justified btn-group-lg\" role=\"group\" aria-label=\"...\">\n");
      out.write("\t\t\t\t\t        <div class=\"btn-group\" role=\"group\">\n");
      out.write("\t\t\t\t\t            <button type=\"button\" id=\"stars\" class=\"btn btn-default\" href=\"Index.jsp#about\" data-toggle=\"tab\"><span class=\"fa fa-user\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t                <div class=\"hidden-xs\">About</div>\n");
      out.write("\t\t\t\t\t            </button>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t        <div class=\"btn-group\" role=\"group\">\n");
      out.write("\t\t\t\t\t            <button type=\"button\" id=\"following\" class=\"btn btn-default\" href=\"#coins\" data-toggle=\"tab\"><span class=\"fa fa-money\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t                <div class=\"hidden-xs\">Coins</div>\n");
      out.write("\t\t\t\t\t            </button>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t        <div class=\"btn-group\" role=\"group\">\n");
      out.write("\t\t\t\t\t            <button type=\"button\" id=\"favorites\" class=\"btn btn-default\" href=\"Index.jsp#tab2\" data-toggle=\"tab\"><span class=\"fa fa-cutlery\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t                <div class=\"hidden-xs\">Calrories</div>\n");
      out.write("\t\t\t\t\t            </button>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t        <div class=\"well\">\n");
      out.write("\t\t\t\t\t      <div class=\"tab-content\">\n");
      out.write("\t\t\t\t\t        <div class=\"tab-pane fade in active\" id=\"about\">\n");
      out.write("\t\t\t\t\t        \t<div class=\"row\">\n");
      out.write("\t\t\t\t\t        \t\t<div class=\"col-sm-8\">\n");
      out.write("\t\t\t\t\t\t\t        \t<div class=\"table-responsive\">\n");
      out.write("\t\t\t\t\t\t\t        \t\t<table class=\"table\" style=\"border:0;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t\t<td><strong>Gender</strong></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t\t<td><strong>Age</strong></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${age}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t\t<td><strong>Height</strong></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${height}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t\t<td><strong>Weight</strong></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${weight}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t\t<td><strong>BMI</strong></td>\n");
      out.write("                                                                                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bmi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t\t<td><strong>Cal per day</strong></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${calperday}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t        \t</tr>\n");
      out.write("                                                                                        \n");
      out.write("\t\t\t\t\t\t\t\t\t        </table>\n");
      out.write("\t\t\t\t\t\t\t        \t</div>\n");
      out.write("\t\t\t\t\t        \t\t</div>\n");
      out.write("\t\t\t\t\t        \t</div>\n");
      out.write("                                                    \n");
      out.write("\t\t\t\t\t\t        \t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t        \t</div>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t        <div class=\"tab-pane fade in active\" id=\"coins\">\n");
      out.write("\t\t\t\t\t        \t<div class=\"row\">\n");
      out.write("\t\t\t\t\t        \t\t<div class=\"col-sm-8\">\n");
      out.write("\t\t\t\t\t\t\t        \t<div class=\"table-responsive\">\n");
      out.write("\t\t\t\t\t\t\t        \t\t<table class=\"table\" style=\"border:0;\">\n");
      out.write("\t\t\t\t\t\t\t        \t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t        \t\t\t<td><img src=\"http://image.flaticon.com/icons/svg/138/138292.svg\" height=\"20%\"><h4>Your coins:</h4></td>\n");
      out.write("                                                                                        <td><h2 style=\"color:black\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${coin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" COIN</h2></td>\n");
      out.write("\t\t\t\t\t\t\t        \t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t        \t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t        \t\t\t<td><a href=\"rewards.jsp\"><h6>Rewards</h6></a></td>\n");
      out.write("\t\t\t\t\t\t\t        \t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t        \t\t</table>\n");
      out.write("\t\t\t\t\t\t\t        \t</div>\n");
      out.write("\t\t\t\t\t        \t\t</div>\n");
      out.write("\t\t\t\t\t        \t</div>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t        <div class=\"tab-pane fade in\" id=\"tab3\">\n");
      out.write("\t\t\t\t\t          <h3>This is tab 3</h3>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t      </div>\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t    <!-- jQuery -->\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("loginOrLogout");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username==null ? 'Login':'Logout'}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
