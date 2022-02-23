package com.example.emall.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.emall.util.JWTUtil;
import org.springframework.web.servlet.HandlerInterceptor;



public class JwtInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {	
		String token = request.getHeader("token");
		System.out.println(token);
		try {
			//校验token
			if(JWTUtil.checkSign(token)) {
				
				return true; //如果
			}else {
				response.getWriter().append("123cw");
				return false;
			}
			//return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			response.getWriter().append("cw");
			return false;
		}
	}
}
