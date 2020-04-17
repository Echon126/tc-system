package com.tianta.tc.base.exception;


import com.tianta.tc.base.constant.BaseStatusCode;
import com.tianta.tc.base.constant.IStatusCode;

/**
 * @author ZKTT
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 2450214686001409867L;
    public IStatusCode statusCode = BaseStatusCode.SYSTEM_ERROR;

    public BusinessException(String msg) {
        super(msg);
    }

    public BusinessException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

    public BusinessException(Throwable throwable) {
        super(throwable);
    }

    public BusinessException(String msg, IStatusCode errorCode) {
        super(msg);
        this.statusCode = errorCode;
    }

    public BusinessException(IStatusCode errorCode) {
        super(errorCode.getDesc());
        this.statusCode = errorCode;
    }

    public BusinessException(IStatusCode errorCode, Throwable throwable) {
        super(errorCode.getDesc(), throwable);
        this.statusCode = errorCode;
    }

    public BusinessException(String msg, IStatusCode errorCode, Throwable throwable) {
        super(errorCode.getDesc() + ":" + msg, throwable);
        this.statusCode = errorCode;
    }

    public String getStatuscode() {
        if (statusCode == null) return "";
        return statusCode.getCode();
    }


    public IStatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(IStatusCode statusCode) {
        this.statusCode = statusCode;
    }
}
