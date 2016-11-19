package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<?php\n");
      out.write(" define (\"MAX_SIZE\",\"1000\"); \n");
      out.write("\n");
      out.write("//This function reads the extension of the file. It is used to determine if the\n");
      out.write("// file  is an image by checking the extension.\n");
      out.write(" function getExtension($str) {\n");
      out.write("         $i = strrpos($str,\".\");\n");
      out.write("         if (!$i) { return \"\"; }\n");
      out.write("         $l = strlen($str) - $i;\n");
      out.write("         $ext = substr($str,$i+1,$l);\n");
      out.write("         return $ext;\n");
      out.write(" }\n");
      out.write("\n");
      out.write("//This variable is used as a flag. The value is initialized with 0 (meaning no \n");
      out.write("// error  found)  \n");
      out.write("//and it will be changed to 1 if an errro occures.  \n");
      out.write("//If the error occures the file will not be uploaded.\n");
      out.write(" $errors=0;\n");
      out.write("//checks if the form has been submitted\n");
      out.write(" if(isset($_POST['Submit'])) \n");
      out.write(" {\n");
      out.write(" \t//reads the name of the file the user submitted for uploading\n");
      out.write(" \t$image=$_FILES['image']['name'];\n");
      out.write(" \t//if it is not empty\n");
      out.write(" \tif ($image) \n");
      out.write(" \t{\n");
      out.write(" \t//get the original name of the file from the clients machine\n");
      out.write(" \t\t$filename = stripslashes($_FILES['image']['name']);\n");
      out.write(" \t//get the extension of the file in a lower case format\n");
      out.write("  \t\t$extension = getExtension($filename);\n");
      out.write(" \t\t$extension = strtolower($extension);\n");
      out.write(" \t//if it is not a known extension, we will suppose it is an error and \n");
      out.write("        // will not  upload the file,  \n");
      out.write("\t//otherwise we will do more tests\n");
      out.write(" if (($extension != \"jpg\") && ($extension != \"jpeg\") && ($extension !=\n");
      out.write(" \"png\") && ($extension != \"gif\")) \n");
      out.write(" \t\t{\n");
      out.write("\t\t//print error message\n");
      out.write(" \t\t\techo '<h3>Unknown extension!</h3>';\n");
      out.write(" \t\t\t$errors=1;\n");
      out.write(" \t\t}\n");
      out.write(" \t\telse\n");
      out.write(" \t\t{\n");
      out.write("//get the size of the image in bytes\n");
      out.write(" //$_FILES['image']['tmp_name'] is the temporary filename of the file\n");
      out.write(" //in which the uploaded file was stored on the server\n");
      out.write(" $size=filesize($_FILES['image']['tmp_name']);\n");
      out.write("\n");
      out.write("//compare the size with the maxim size we defined and print error if bigger\n");
      out.write("if ($size > MAX_SIZE*1024)\n");
      out.write("{\n");
      out.write("\techo '<h1>You have exceeded the size limit!</h1>';\n");
      out.write("\t$errors=1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("//we will give an unique name, for example the time in unix time format\n");
      out.write("$image_name=time().'.'.$extension;\n");
      out.write("//the new name will be containing the full path where will be stored (images \n");
      out.write("//folder)\n");
      out.write("$newname=\"images/\".$image_name;\n");
      out.write("//we verify if the image has been uploaded, and print error instead\n");
      out.write("$copied = copy($_FILES['image']['tmp_name'], $newname);\n");
      out.write("if (!$copied) \n");
      out.write("{\n");
      out.write("\techo '<h3>Copy unsuccessfull!</h3>';\n");
      out.write("\t$errors=1;\n");
      out.write("}}}}\n");
      out.write(" ?>\n");
      out.write("<!Doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>\n");
      out.write("Member Home Page\n");
      out.write("</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form name=\"newad\" method=\"post\" enctype=\"multipart/form-data\"  \n");
      out.write("action=\"\">\n");
      out.write(" <table>\n");
      out.write(" \t<tr><td><input type=\"file\" name=\"image\" id=\"file\"></td></tr>\n");
      out.write(" \t<tr><td><input name=\"Submit\" type=\"submit\" value=\"Upload image\" id=\"image_upload\">\n");
      out.write("       </td></tr>\n");
      out.write(" </table>\t\n");
      out.write(" </form>\n");
      out.write("\n");
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
