package com.stock.apicommon.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stock.apicommon.model.ResultData;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExceptionData extends ResultData {

    public ExceptionData(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ExceptionData(int code, String message,Object msgDetails) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "{" +
                "code:" + code +
                ", message: '" + message + '\''+
                '}';
    }
}
