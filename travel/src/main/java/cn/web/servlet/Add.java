package cn.web.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//   http://localhost:8080/add?a=4&b=7
@WebServlet("/add")
public class Add extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a = Integer.valueOf(request.getParameter("a"));
        int b = Integer.valueOf(request.getParameter("b"));
        System.out.println(a);
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(String.valueOf(a+b));//直接转发到一个新界面 之后把msg里面的对象加载到此页面上去显示


    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
