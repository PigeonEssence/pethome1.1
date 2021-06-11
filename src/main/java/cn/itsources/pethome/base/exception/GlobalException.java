package cn.itsources.pethome.base.exception;

import cn.itsources.pethome.base.constants.ErrorCode;
import lombok.Data;

@Data
public class GlobalException extends RuntimeException{
    private ErrorCode errorCode;
    public GlobalException(String message){
        super(message);
    }

    public GlobalException(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
