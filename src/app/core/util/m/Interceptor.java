package app.core.util.m;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

//拦截器
public class Interceptor implements HandlerInterceptor{
	//忽略对登录页面的请求拦截
	private static final String[] IGNORE_URI={"/login"};//,"/loginForm"
	
	/**
	 * 请求结束后执行，主要作用是清理资源，在preHandle方法返回值为true时才会执行
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse reponse, Object handler, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 先于Controller方法调用之后执行，方法对ModelAndView进行操作，在preHandle方法返回值为true时才会执行
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse reponse, Object handler) throws Exception {
		boolean loginAccess=false;
		//获取请求路径进行判断
		String servletPath=request.getServletPath();
		//判断请求是否需要拦截、
		for(String uri:IGNORE_URI){
			if(servletPath.contains(uri)){
				//System.out.println(uri);
				loginAccess=true;
				break;
			}
		}
		//拦截请求
		if(!loginAccess){
			HttpSession session=request.getSession();
			//获取session中的用户
//			User user=(User)session.getAttribute("user");
//			System.out.println(user);
//			//判断用户是否已经登录
//			if(user==null){
//				//用户没有登录
//				System.out.println("用户未登录");
//				request.getRequestDispatcher("loginForm").forward(request, reponse);
//			}else{
//				//用户已经登录
//				System.out.println("用户已经登录");
//				loginAccess=true;
//			}
		}
		return loginAccess;
	}
	
}
