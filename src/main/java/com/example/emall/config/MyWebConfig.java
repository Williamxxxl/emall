package com.example.emall.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Classname AddResource
 * @Description TODO
 * @Date 2021/7/19 20:55
 * @Created by William
 */
@Configuration
public class MyWebConfig implements WebMvcConfigurer {
    /**
     * @Description token拦截
     * @param registry
     * @return void
     * @date 2021/7/20 11:09
     * @author William
     */
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new JwtInterceptor())
//                .addPathPatterns("/**")//拦截所有
//                .excludePathPatterns("/admin/getLogin","/img/**");// 放行的信息
//    }
    static final String ORIGINS[] = new String[] { "GET", "POST", "PUT", "DELETE" };
    /**
     * @Description 跨域
     * @param registry
     * @return void
     * @date 2021/7/20 11:09
     * @author William
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOriginPatterns("*").allowCredentials(true).allowedMethods(ORIGINS).maxAge(3600);
    }
    /**
     * @Description 图片上传映射,前面是URL访问地址,后面是本地地址
     * @param registry
     * @return void
     * @date 2021/7/20 11:09
     * @author William
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/**").addResourceLocations("file:/home/mysoft/emall/headpic/");
    }


}
