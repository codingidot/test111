/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.73
 * Generated at: 2022-05-30 01:21:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kaja2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write(' ');

request.setCharacterEncoding("utf-8"); //post방식으로 했으므로
String irum=(String)request.getParameter("irum");
String na2=(String)request.getParameter("na2");
out.println("여기는 자바스타일로 출력"+irum+","+na2+"<br>");




      out.write("\r\n");
      out.write("<!--    자바는 oop방식 ==>클래스방식\r\n");
      out.write("	물론 어떤 문제를 해결할때 class를 사용할수도 안할수도 있다.\r\n");
      out.write(" 	Sawon sawon1=new Sawon()\r\n");
      out.write(" 	Sawon sawon2=new Sawon()\r\n");
      out.write(" 	자바는 이렇게 해서 사용\r\n");
      out.write(" 	\r\n");
      out.write(" 	스프링은\r\n");
      out.write(" 	<bean id=\"객체명\" class=\"패키지명.클래스명\" />\r\n");
      out.write(" 	\r\n");
      out.write(" 	액션태그로 하면\r\n");
      out.write(" 	가독성(가능한한 자바식 표현 하지말고 태그로 표현하자는)\r\n");
      out.write(" 	id는 객체명 class=\"패키지명.클래스명\"\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" 	목적은 가독성(가능한한 자바식 표현 하지말고 태그로 표현하자는)\r\n");
      out.write(" -->\r\n");
      out.write(" ");
      sawonpkg.Sawon sawon1 = null;
      sawon1 = (sawonpkg.Sawon) _jspx_page_context.getAttribute("sawon1", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (sawon1 == null){
        sawon1 = new sawonpkg.Sawon();
        _jspx_page_context.setAttribute("sawon1", sawon1, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      sawonpkg.Sawon sawon2 = null;
      sawon2 = (sawonpkg.Sawon) _jspx_page_context.getAttribute("sawon2", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (sawon2 == null){
        sawon2 = new sawonpkg.Sawon();
        _jspx_page_context.setAttribute("sawon2", sawon2, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- setProperty에서는 id가 아니라 name으로 객체명 나타냄\r\n");
      out.write("	결과적으로 sawon1객체에는 입력에서 넘어온 irum, na2가 들어간다\r\n");
      out.write("	sawon1.setIrum(request.getParameter(\"irum\"))\r\n");
      out.write("	sawon1.setNa2(request.getParameter(\"na2\"))\r\n");
      out.write("	위의 두개가 밑에 두개랑 같다\r\n");
      out.write("-->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("sawon1"), "irum", request.getParameter("irum"), request, "irum", false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("sawon1"), "na2", request.getParameter("na2"), request, "na2", false);
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("sawon2"), request);
      out.write("\r\n");
      out.write("<!-- set + Irum, Na2() ... 즉, 10개를 set 해도 한줄로 끝 \r\n");
      out.write("	\r\n");
      out.write(" 폼에서 넘어오는 것을 all set, 단, getProperty는 *기호 사용 못함\r\n");
      out.write(" 즉, setter에 한해서 전부다 넘어오는 역할을 *가 담당함\r\n");
      out.write(" 그러므로 *는 현재 irum,na2를 set하고 있음\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2> jsp:getProperty 출력1</h2>\r\n");
      out.write("이름은 ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((sawonpkg.Sawon)_jspx_page_context.findAttribute("sawon1")).getIrum())));
      out.write("\r\n");
      out.write("나이는 ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((sawonpkg.Sawon)_jspx_page_context.findAttribute("sawon1")).getNa2())));
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h2> jsp:getProperty 출력2</h2>\r\n");
      out.write("이름은 ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((sawonpkg.Sawon)_jspx_page_context.findAttribute("sawon2")).getIrum())));
      out.write("\r\n");
      out.write("나이는 ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((sawonpkg.Sawon)_jspx_page_context.findAttribute("sawon2")).getNa2())));
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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