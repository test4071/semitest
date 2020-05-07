package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.me")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// <request와 response>
		// request : 서버에 요청하는 모든 정보들에 대해 보관
		// response : 서비스를 요청한 클라이언트와 ip, url에 대해 보관
		
		// => 쌍으로 서버를 왔다갔다 하면서 클라이언트에 정확한 정보 제공
		
		// <post와 get 방식의 차이>
		
		// request와 response는 둘 다 head와 body로 나뉨
		// post : body에 기록되어서 전달(url에 보이지 않음)
		// get : head에 기록되어서 전달(url에 보임)
		
		/*
		 * 객체를 담아 둘 수 있는 객체들(scope(범위)가 좁은 순위)
		 * 1. page : 자기 자신 페이지에서만 쓸 수 있다. (해당 jsp 파일 안에서만 사용 가능)
		 ** 2. request : 전달 받은 대상의 jsp만 꺼내 쓸 수 있다. (서비스 요청 및 응답 시에만 가능)
		 ** 3. session : 웹 브라우저 유지 및 해당 시간 동안 쓸 수 있다.
		 * 4. application : 톰캣이 유지되는 한 모든 곳에서 쓸 수 있다.
		 * */
		
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		//사용자가 입력한 아이디와 PW값을 뒷단으로 보내보자.
		
		Member member = new Member(userId, userPwd);
		
		System.out.println(member);
		
		Member loginMember = new MemberService().loginMember(member);
		
		System.out.println("LoginMember가 Servlet까지 도착했니?"+loginMember);
		if(loginMember != null) {
			//로그인이 생공했을 경우
			HttpSession session = request.getSession(); //세션 객체 받아보자
			//(기본 30분 유지, 독립적인 공간, 모든 페이지에서 session의 공간 이용 가능)
			
			// 우리가 원하는 시간 만큼 session 객체 유지
			// 새로고침시에는 발생하지 않음 : 새로고침하면 해당 객체가 리셋되어 해당 시간부터 다시 제한함
			session.setMaxInactiveInterval(10); // 초(s) 단위
			
			session.setAttribute("loginUser", loginMember); //Attribute라는 바구니 담자(Key와 Value를 이용)
			
			response.sendRedirect("index.jsp"); //Default는 Web(Context root) 그렇기 때문에 index.jsp만 적어준다
			
		}else {
			//로그인이 실패했을 경우
			request.setAttribute("msg", "로그인 실패");
			
			RequestDispatcher view = request.getRequestDispatcher("views/common/errorPage.jsp");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
