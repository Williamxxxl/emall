package com.example.emall.util;

import java.util.Date;
import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator.Builder;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

public class JWTUtil {
	 //过期时间10分钟
	private static final long EXPIRE_TIME = 10*60*1000;
	 // jwt 密钥  非常关键
	private static final String SECRET = "jwt_db";
	
	public static String CreateJwt(Map<String,String> map) {
		//计算出过期的具体时间
		Date dt=new Date(System.currentTimeMillis()+EXPIRE_TIME);
		Algorithm hmac256 = Algorithm.HMAC256(SECRET);
		Builder create = JWT.create();
		map.forEach((k,v)->{
			create.withClaim(k, v);
		});
		create.withExpiresAt(dt);
		String jwt=create.sign(hmac256);
//		//生成一个 jwt
//		String jwt=JWT.create()
//		//相关的数据
//		.withClaim("uname", "张三")
//		.withClaim("addr", "sy")
//		//过期时间
//		.withExpiresAt(dt)
//		.sign(hmac256);
		System.out.println(jwt);
		return jwt;
	}
	
	//校验
	public static boolean checkSign(String token) {
		//进行校验  拿到token进行校验
		DecodedJWT verify = JWT.require(Algorithm.HMAC256(SECRET)).build().verify(token);
		//获取信息
		String loginid = verify.getClaim("loginid").asString();
		System.out.println(loginid);
		return true;
	}
}
