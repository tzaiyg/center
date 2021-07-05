package com.tlj.blockhead.intercepter;

import java.lang.annotation.*;

/**
 * @description: 配置该注解不需要进行拦截 <br>
 * @date: 2020/10/21 18:09 <br>
 * @author: Zhong Xingfu <br>
 * @version: 1.0 <br>
 */
@Documented
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface NoLoginController {

}
