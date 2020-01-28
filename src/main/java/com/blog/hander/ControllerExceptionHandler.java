package com.blog.hander;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

/**
 * Package: com.blog.hander
 * <p>
 * Author: 懒洋洋
 * <p>
 * Date: Created in 2020/1/27 13:41
 */

@ControllerAdvice
/**
 * 统一拦截异常 ControllerExceptionHandler
 */
public class ControllerExceptionHandler {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHander(HttpServletRequest request,Exception e) throws Exception {
        /**
         * 异常处理
         */
        logger.error("Request URL:{},Exception: {}",request.getRequestURL(),e);

        if (AnnotationUtils.findAnnotation(e.getClass(),ResponseStatus.class) != null) {
            throw e;
        }
        ModelAndView mv =new ModelAndView();
        mv.addObject("url",request.getRequestURL());
        mv.addObject("exception",e);
        mv.setViewName("error/error");
        return mv;
    }

}
