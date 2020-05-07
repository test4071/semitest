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
 * Servlet implementation class UpdateMemberServlet
 */
@WebServlet("/update.me")
public class UpdateMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글값 깨지지 않게 해 준다
		request.setCharacterEncoding("utf-8");
		
		String userId = request.getParameter("userId");
		// 비밀번호는 수정 페이지에 뜨지 않게 처리했으므로 생략된다.
		String userName = request.getParameter("userName");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		String[] irr = request.getParameterValues("interest");
		
		String interest = "";
		
		
		// 한 컬럼 값에 취미를 넣기 위해서 , 를 기준으로 String[] 을 하나의 String으로 전환(String에서 제공하는 join 메소드
		
		if(irr != null) {
			interest = String.join(",", irr);
		}
		
		Member m = new Member(userId, userName, phone, email, address, interest);
		int result = new MemberService().updateMember(m);
//		System.out.println("회원정보 수정 servlet에서 업데이트 결과 : " + result);
		
		RequestDispatcher view = null;
		
		if(result > 0) {
			// 현재 로그인한 사람의 session도 수정하자
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", m);
			view = request.getRequestDispatcher("views/common/successPage.jsp");
			request.setAttribute("msg", "성공적으로 회원 정보를 수정했습니다.");
		}else {
			view = request.getRequestDispatcher("views/common/errorPage.jsp");
			request.setAttribute("msg", "회원 정보 수정에 실패했습니다.");
			
		}
		
		view.forward(request, response);
		
		// 수정 확인이 끝나면 memberView.jsp를 가서 회원 탈퇴를 진행하자.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
