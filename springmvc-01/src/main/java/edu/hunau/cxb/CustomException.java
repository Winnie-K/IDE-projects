package edu.hunau.cxb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/excp")
public class CustomException extends RuntimeException {

    private String message;//异常信息

    public CustomException(String message) {
        this.message = message;
    }

    public CustomException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public CustomException(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    public CustomException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public CustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.message = message1;
    }
}
