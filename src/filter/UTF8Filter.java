package filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/UTF8Filter")
public class UTF8Filter extends HttpServlet implements Filter {
	private static final long serialVersionUID = 1L;


    public void init(FilterConfig arg0) throws javax.servlet.ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, javax.servlet.ServletException {
    	request.setCharacterEncoding("UTF-8");
    	 response.setContentType("text/html; charset=UTF-8");
    	 chain.doFilter(request, response);
    }
}
