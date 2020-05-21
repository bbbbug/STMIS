package app.core.util.m;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

//������
public class Interceptor implements HandlerInterceptor{
	//���ԶԵ�¼ҳ�����������
	private static final String[] IGNORE_URI={"/login"};//,"/loginForm"
	
	/**
	 * ���������ִ�У���Ҫ������������Դ����preHandle��������ֵΪtrueʱ�Ż�ִ��
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse reponse, Object handler, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * ����Controller��������֮��ִ�У�������ModelAndView���в�������preHandle��������ֵΪtrueʱ�Ż�ִ��
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse reponse, Object handler) throws Exception {
		boolean loginAccess=false;
		//��ȡ����·�������ж�
		String servletPath=request.getServletPath();
		//�ж������Ƿ���Ҫ���ء�
		for(String uri:IGNORE_URI){
			if(servletPath.contains(uri)){
				//System.out.println(uri);
				loginAccess=true;
				break;
			}
		}
		//��������
		if(!loginAccess){
			HttpSession session=request.getSession();
			//��ȡsession�е��û�
//			User user=(User)session.getAttribute("user");
//			System.out.println(user);
//			//�ж��û��Ƿ��Ѿ���¼
//			if(user==null){
//				//�û�û�е�¼
//				System.out.println("�û�δ��¼");
//				request.getRequestDispatcher("loginForm").forward(request, reponse);
//			}else{
//				//�û��Ѿ���¼
//				System.out.println("�û��Ѿ���¼");
//				loginAccess=true;
//			}
		}
		return loginAccess;
	}
	
}
