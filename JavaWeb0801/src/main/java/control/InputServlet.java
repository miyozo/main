package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 入力を受け付けるサーブレット
 * @author M.Takahashi
 */
@WebServlet("/input-servlet")
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストのエンコーディング方式を指定
		request.setCharacterEncoding("UTF-8");

		// リクエストパラメータの取得
		String nameStr = "【名前】" + request.getParameter("name");
		String passwordStr = "【パスワード】" + request.getParameter("password");
		String genderStr = "【性別】" + request.getParameter("gender");
		String[] foodArray = request.getParameterValues("food");
		String foodStr = "【好物】";
		if (foodArray != null) {
			for (String food : foodArray) {
				foodStr += (food + "　");
			}
		} else {
			foodStr += "(未選択)";
		}
		String hobbyStr = "【趣味】" + request.getParameter("hobby");

		// レスポンスのコンテンツタイプおよびエンコーディング方式を指定
		response.setContentType("text/html; charset=UTF-8");

		// レスポンス書き出し用オブジェクトの取得
		PrintWriter out = response.getWriter();

		//レスポンスの書き出し
		out.println("<!DOCTYPE html>                                 ");
		out.println("<html>                                          ");
		out.println("<head>                                          ");
		out.println("<meta charset=\"UTF-8\">                        ");
		out.println("<title>入力内容</title>                         ");
		out.println("<link rel=\"stylesheet\" href=\"style.css\">    ");
		out.println("</head>                                         ");
		out.println("<body>                                          ");
		out.println("    <h2>入力内容</h2>                           ");
		out.println("    " + nameStr + "<br><br>                     ");
		out.println("    " + passwordStr + "<br><br>                 ");
		out.println("    " + genderStr + "<br><br>                   ");
		out.println("    " + foodStr + "<br><br>                     ");
		out.println("    " + hobbyStr + "<br><br>                    ");
		out.println("<br><a href=\"input.html\">入力フォームへ</a>     ");
		out.println("</body>                                         ");
		out.println("</html>                                         ");
	}

}
