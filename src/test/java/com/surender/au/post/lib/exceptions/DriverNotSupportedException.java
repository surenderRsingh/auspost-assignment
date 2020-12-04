package com.surender.au.post.lib.exceptions;

public class DriverNotSupportedException  extends Exception{
    public DriverNotSupportedException() {
    }

    public DriverNotSupportedException(String message) {
        super(message);
    }

    public DriverNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }

    public DriverNotSupportedException(Throwable cause) {
        super(cause);
    }

    public DriverNotSupportedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
