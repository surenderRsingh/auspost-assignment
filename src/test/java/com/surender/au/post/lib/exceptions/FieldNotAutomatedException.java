package com.surender.au.post.lib.exceptions;

public class FieldNotAutomatedException extends Exception {
    public FieldNotAutomatedException() {
    }

    public FieldNotAutomatedException(String message) {
        super(message);
    }

    public FieldNotAutomatedException(String message, Throwable cause) {
        super(message, cause);
    }

    public FieldNotAutomatedException(Throwable cause) {
        super(cause);
    }

    public FieldNotAutomatedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
