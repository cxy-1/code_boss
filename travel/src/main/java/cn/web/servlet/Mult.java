package cn.web.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//邮箱激活时使用  当前项目没有使用邮箱功能因此、
//   即 发送带超链接的邮件、 之后点击以后访问此servlet去激活用户

//功能
// 获取激活码 判断是否存在此激活码  防止恶意的访问
// 修改状态码
@WebServlet("/mult")
public class Mult extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a = Integer.valueOf(request.getParameter("a"));
        int b = Integer.valueOf(request.getParameter("b"));
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(String.valueOf(a*b));//直接转发到一个新界面 之后把msg里面的对象加载到此页面上去显示
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
