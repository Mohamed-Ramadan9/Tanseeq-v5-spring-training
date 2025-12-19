package com.Tanseeq.Tanseeq5.SharedModels;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse<T> {
    private Boolean isError = false;
    private String message = "";
    private Integer targetId = 0;
    private T returnedValue;



    // Helper methods for success responses
    public static <T> BaseResponse<T> success(T data) {
        BaseResponse<T> response = new BaseResponse<>();
        response.setReturnedValue(data);
        response.setMessage("Operation successful");
        return response;
    }

    public static <T> BaseResponse<T> success(T data, String message) {
        BaseResponse<T> response = new BaseResponse<>();
        response.setReturnedValue(data);
        response.setMessage(message);
        return response;
    }

    public static <T> BaseResponse<T> error(String message) {
        BaseResponse<T> response = new BaseResponse<>();
        response.setIsError(true);
        response.setMessage(message);
        return response;
    }


}