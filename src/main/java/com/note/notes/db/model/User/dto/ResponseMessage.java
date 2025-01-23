
package com.note.notes.db.model.User.dto;

import org.springframework.http.HttpStatus;

/**
 *
 * @author Noah1
 */
public class ResponseMessage<T> {
    private Integer code;
    private String messages;
    private T data;

    public ResponseMessage(Integer code, String message, T data) {
        this.code = code;
        this.messages = message;
        this.data = data;
    }

    public static <T> ResponseMessage<T> success(T data) {
        return new ResponseMessage<>(HttpStatus.OK.value(), "success", data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMgs() {
        return messages;
    }

    public void setMgs(String messages) {
        this.messages = messages;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
