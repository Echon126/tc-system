package com.tianta.tc.base.exception;


import com.tianta.tc.base.constant.BaseStatusCode;
import com.tianta.tc.base.constant.IStatusCode;

/**
 * @author ZKTT
 */
public class BusinessError extends RuntimeException {
    private static final long serialVersionUID = -7289238698048230824L;
    public IStatusCode statusCode = BaseStatusCode.SYSTEM_ERROR;

    public BusinessError(String msg) {
        super(msg);
    }

    public BusinessError(String msg, Throwable throwable) {
        super(msg, throwable);
    }

    public BusinessError(Throwable throwable) {
        super(throwable);
    }

    public BusinessError(String msg, IStatusCode errorCode) {
        super(msg);
        this.statusCode = errorCode;
    }

    public BusinessError(IStatusCode errorCode) {
        super(errorCode.getDesc());
        this.statusCode = errorCode;
    }

    public BusinessError(IStatusCode errorCode, Throwable throwable) {
        super(errorCode.getDesc(), throwable);
        this.statusCode = errorCode;
    }

    public BusinessError(String msg, IStatusCode errorCode, Throwable throwable) {
        super(errorCode.getDesc() + ":" + msg, throwable);
        this.statusCode = errorCode;
    }

    public String getStatusode() {
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
