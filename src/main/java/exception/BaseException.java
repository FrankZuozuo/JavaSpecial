package exception;

import java.io.Serializable;

/**
 * @author Created by 谭健 on 2018/4/9 0009. 星期一. 9:29.
 * © All Rights Reserved.
 */
public class BaseException extends Exception {


    /**
     * Exception 继承了 Throwable ， Throwable 实现了Serializable 接口，所以Exception的子类都必须定义serialVersionUID
     */
    private static final long serialVersionUID = -3459455225253612032L;

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
