package com.toutiao.developer.v2;

@SuppressWarnings("unused")
public class ToutiaoError2 extends Exception {
        private String error_id;
        private int code;
        private String message;
        private String exception;

        public String getError_id() {
            return error_id;
        }

        public void setError_id(String error_id) {
            this.error_id = error_id;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getException() {
            return exception;
        }

        public void setException(String exception) {
            this.exception = exception;
        }
    }
