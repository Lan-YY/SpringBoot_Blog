package com.blog;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Package: com.blog
 * <p>
 * Author: 懒洋洋
 * <p>
 * Date: Created in 2020/1/28 15:26
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
    public NotFoundException(){

    }
    public NotFoundException(String message){
        super(message);
    }
    public NotFoundException(String message,Throwable cause){
        super(message,cause);
    }

}
