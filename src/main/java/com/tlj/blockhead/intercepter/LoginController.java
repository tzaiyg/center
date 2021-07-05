//package com.tlj.blockhead.intercepter;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.auth0.jwt.JWT;
//import com.tlj.blockhead.Utils.Constants;
//import com.tlj.blockhead.Utils.EnumT;
//import com.tlj.blockhead.Utils.JwtUtil;
//import com.tlj.blockhead.entity.User;
//import com.tlj.blockhead.exception.BaseException;
//import com.tlj.blockhead.service.UserService;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.web.method.HandlerMethod;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * @author ：tlj
// * @date ：Created in 2021/7/2 9:11
// * @version: IntelliJ IDEA
// */
//@Component
//@Slf4j
//public class LoginController  implements HandlerInterceptor {
//
//    @Resource
//    UserService userService;
//    ThreadLocal<Object> objectThreadLocal = new ThreadLocal<>();
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//
//        if (!(handler instanceof HandlerMethod))
//            return true;
//        HandlerMethod handlerMethod = (HandlerMethod) handler;
//        NoLoginController annotation = handlerMethod.getMethod().getAnnotation(NoLoginController.class);
//        if (null != annotation)
//            return true;
//        annotation = handlerMethod.getMethod().getDeclaringClass().getAnnotation(NoLoginController.class);
//        log.info("【调用{}】", handlerMethod.getMethod().getDeclaringClass());
//        if (null != annotation) {
//            return true;
//        }
////            String token = request.getHeader("token");
////        String s = JWT.decode(token).getAudience().get(0);
//
//
////        Claims claims = Jwts.parser().setSigningKey("token").parseClaimsJws(token).getBody();
//      //  Object attribute1 = request.getSession().getAttribute(s);
////        if(token==null){
////            return true;
////        }
////        Claims claims = JwtUtil.parseJWT(token);
////        User user = JSONObject.parseObject(claims.getSubject(), User.class);
//        Object attribute = request.getSession().getAttribute(Constants.LOGIN_INFO);
//        if(attribute==null)
//            throw new BaseException(EnumT.NO_LOGIN.getMessage(),EnumT.NO_LOGIN.getCode() );
//        log.info("【用户登录信息验证成功】:{}", attribute);
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        objectThreadLocal.remove();
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//
//    }
//}
