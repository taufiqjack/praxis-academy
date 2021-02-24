package com.taufiqjack.springboot_mtom.Resource;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExcept extends Exception {
    private static final long serialVersionUID = 1L;
    public ResourceNotFoundExcept(String message){
        super(message);
    }
}
