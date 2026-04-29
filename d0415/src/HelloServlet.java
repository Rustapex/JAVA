import javax.servlet.http.HttpServletResponse;

/*
* 1, httpServlet 상속받기
* 2. 약속된 메서드 service override
* 3. url-pattern 매핑하기
* */
// 인사하기 사용자 요청 -> 예쁘게 인사하기

import java.io.PrintWriter;
@WebServlet("/hello2")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws servletException

//    내 요청에 대한 처리하기
//    응답정보 데이터(Content-type) :  text/html(default) , text/plain, aplication/json
//    응담정보 인코딩 방식 : 한글 인코딩 utf-8

    response.setCharacterEncoding("utf-8"); // 서버 -> encoding utf8
    response.setContentType("text/html;charset=utf-8"); // 클라이언트(웹브라우저)에게 해석에 대한 정보

//    응답하기
    PrintWriter out = response.getWriter();
    out.

}
