/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-04-29 01:54:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/common/menubar.jsp", Long.valueOf(1588124814250L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');

	Member loginUser = (Member)session.getAttribute("loginUser");
//import작업은 지시자 태그에 따로 해줘야 한다.
//getAttribute의 반환형은 object이므로 다운캐스팅이 필요

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\tbody{\r\n");
      out.write("\t\t\tbackground:url('");
      out.print(request.getContextPath());
      out.write("/image/flower1.PNG') no-repeat;\r\n");
      out.write("\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#LoginBtn input, #memberJoinBtn, #logoutBtn, #myPage{\r\n");
      out.write("\t\t\tdisplay:inline-block;\r\n");
      out.write("\t\t\tvertical-align:middle;\r\n");
      out.write("\t\t\ttext-align:center;\r\n");
      out.write("\t\t\tbackground:orangered;\r\n");
      out.write("\t\t\tcolor:white;\r\n");
      out.write("\t\t\theight:25px;\r\n");
      out.write("\t\t\twidth:100px;\r\n");
      out.write("\t\t\tborder-radius:5px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#memberJoinBtn{\r\n");
      out.write("\t\t\tbackground:yellowgreen;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#loginBtn:hover, #changeInfo:hover, #logoutBtn:hover,\r\n");
      out.write("\t\t#memberJoinBtn:hover, #myPage:hover{\r\n");
      out.write("\t\t\tcursor:pointer;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.LoginArea > form, #userInfo{\r\n");
      out.write("\t\t\tfloat:right;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#logout, #mypage{\r\n");
      out.write("\t\t\tbackground:orangered;\r\n");
      out.write("\t\t\tcolor:white;\r\n");
      out.write("\t\t\ttext-decoration:none;\r\n");
      out.write("\t\t\tborder-radius:5px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#myPage {\r\n");
      out.write("      background:yellowgreen;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .wrap {\r\n");
      out.write("      background:black;\r\n");
      out.write("      width:100%;\r\n");
      out.write("      height:50px;\r\n");
      out.write("   }\r\n");
      out.write("   .menu {\r\n");
      out.write("      background:black;\r\n");
      out.write("      color:white;\r\n");
      out.write("      text-align:center;\r\n");
      out.write("      vertical-align:middle;\r\n");
      out.write("      width:150px;\r\n");
      out.write("      height:50px;\r\n");
      out.write("      display:table-cell;\r\n");
      out.write("   }\r\n");
      out.write("   .nav {\r\n");
      out.write("      width:600px;\r\n");
      out.write("      margin-left:auto;\r\n");
      out.write("      margin-right:auto;\r\n");
      out.write("   }\r\n");
      out.write("   .menu:hover {\r\n");
      out.write("      background:darkgray;\r\n");
      out.write("      color:orangered;\r\n");
      out.write("      font-weight:bold;\r\n");
      out.write("      cursor:pointer;\r\n");
      out.write("   }\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1 align=\"center\">Welcome JSP world!</h1>\r\n");
      out.write("\t<div class=\"LoginArea\">\r\n");
      out.write("\t<!-- 2. 로그인이 되었는지 확인하는 자바코드 -->\r\n");
      out.write("\t");

	if(loginUser==null){
		
	
      out.write("\r\n");
      out.write("\t<!--1.  로그인 관련 폼 만들기 -->\r\n");
      out.write("\t\t<form method=\"get\" action=\"");
      out.print(request.getContextPath());
      out.write("/login.me\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label>ID: </label><td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"userId\" id=\"userId\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label>PW: </label><td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" name=\"userPwd\" id=\"userPwd\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"saveId\" id=\"saveId\">&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<label for=\"saveId\">아이디 저장</label>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<div class=\"btns\" align=\"center\">\r\n");
      out.write("\t\t\t\t<div id=\"memberJoinBtn\" onclick=\"memberJoin();\">회원가입</div>\r\n");
      out.write("\t\t\t\t<div id=\"LoginBtn\"><input type=\"submit\" value=\"로그인\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t<div id = \"userInfo\">\r\n");
      out.write("\t\t\t\t<label>");
      out.print(loginUser.getUserName() );
      out.write("님 환영합니다.</label>\r\n");
      out.write("\t\t\t\t<div class=\"btns\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t<div id=\"myPage\">정보수정</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"logoutBtn\" onclick=\"logout();\">로그아웃</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction logout(){\r\n");
      out.write("\t\t\tlocation.href='");
      out.print(request.getContextPath());
      out.write("/logout.me';\r\n");
      out.write("\t\t\t// location.href는 해당 경로로 이동하기 위한 속성\r\n");
      out.write("\t\t\t// form 태그가 아닌 단순히 원하는 Servlet으로 넘어가기 위해 사용\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!-- \t<h1>안녕하세요</h1>\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>이름</th>\r\n");
      out.write("\t\t\t<th>나이</th>\r\n");
      out.write("\t\t\t<th>주소</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>김계연</td>\r\n");
      out.write("\t\t\t<td>24</td>\r\n");
      out.write("\t\t\t<td>서울시 강남구</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table> -->\r\n");
      out.write("<!-- <span>\t\r\n");
      out.write("\t제일 먼저 세팅할 것들\r\n");
      out.write("\t1. Window - Preferences\r\n");
      out.write("\t  1) 인코딩 관련한 것들 UTF-8로 바꿔주기\r\n");
      out.write("\t     - General > Editors > Text Editors > Spelling\r\n");
      out.write("\t     - General > Workspace\r\n");
      out.write("\t     - Web > CSS, HTML, JSP\r\n");
      out.write("\t     \r\n");
      out.write("\t  2) Server 만들기\r\n");
      out.write("\t     - Server > Runtime Environment > Add > 맨 마지막 경로가 톰캣으로 끝나게(bin파일 보일때까지)\r\n");
      out.write("\t     - 경로가 달라졌을 경우 이부분에 가서 경로를 다시한번 잡아주면 된다.\r\n");
      out.write("\t\r\n");
      out.write("\t2. Dynamic Web Project 생성\r\n");
      out.write("\t  1) Navigator > 우클릭 > Dynamic Web Project > next > next 버튼 누르면 context directory 설정 \r\n");
      out.write("\t     (모든 상대경로의 기본적인 경로, 기본은 WebContent, 통일해서 web으로 쓰기-간단하게)\r\n");
      out.write("\t     \r\n");
      out.write("\t     - 프로젝트 우클릭 > Properties > Web Project Setting 에서 Context root 확인 가능 \r\n");
      out.write("\t   \t - 아래에 web.xml파일 만들기 꼭 체크\r\n");
      out.write("\t  \r\n");
      out.write("\t  2) 프로젝트 우클릭 > Properties> Java Build Path > Source 에가면 어느 폴더에 Build를 할지 설정 가능\r\n");
      out.write("\t     (Default output folder 수정 - Browse버튼으로 ))\r\n");
      out.write("\t  \t - 모든것은 web > WEB_INF에 만들 것이다. (web/WEB_INF/classes) !!기존의 build폴더는 삭제!!\r\n");
      out.write("\t  \t - 우리는 기본 경로가 web부터 시작하기 때문에 검색이 가능하도록 web안에 모든것을 설정하는 편\r\n");
      out.write("\t  \t - web.xml과 같은 경로에 두는 것이 규칙\r\n");
      out.write("\t  \t \r\n");
      out.write("\t3. Servers 탭에서 톰켓 세팅하기 (없을 때 window>showView에 Servers가 있음) \r\n");
      out.write("\t  1) 마우스 우클릭 > new > Server > Server name 정하고 next > 프로젝트를 add를 시켜 우측으로 이동\r\n");
      out.write("\t     (TomCat이 구동시킬 프로젝트를 등록하는 과정이다.)\r\n");
      out.write("\t  2) 만들어진 서버를 더블클릭하면 HTTP의 포트번호(기존 8080)와 다른 포트번호 역시 수정\r\n");
      out.write("\t     !!포트번호 수정시 앞자리 8은 유지하도록 한다.!!\r\n");
      out.write("\t  3) Serve modules without publishing에 체크 선택\r\n");
      out.write("\t     (Clean>stop>publish를 반복해야 하는 번거로움을 없앰)\r\n");
      out.write("\t  \t \r\n");
      out.write("\t4. project 우클릭 > properties > Project Facets > Runtime에 본인이 구동시킬 Tomcat인지 확인함\r\n");
      out.write("\t\r\n");
      out.write("\t5. Servers 프로젝트 > Tom-config > Context.xml을 META_INF 밑으로 이동(복사)시킨다. \r\n");
      out.write("\t    - <Context workDir=> 에  META_INF 밑에 컴파일되면 빌드파일이 저장될 파일을 한개 만들고 경로 설정\r\n");
      out.write("\t              보통 WEB_INF 아래 jspwork를 생성 > 해당 경로를 workDir로 설정해주는 것임\r\n");
      out.write("\t\r\n");
      out.write("\t!!!톰캣은 수정할 때 꺼주는 것이 오류를 줄이는 방법 중 하나이다!!\r\n");
      out.write("\t</span> -->\r\n");
      out.write("\t\r\n");
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