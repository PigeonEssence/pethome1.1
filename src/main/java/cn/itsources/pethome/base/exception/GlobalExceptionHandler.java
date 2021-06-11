package cn.itsources.pethome.base.exception;

import cn.itsources.pethome.base.constants.ErrorCode;
import cn.itsources.pethome.base.result.JSONResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalExceptionHandler {
    /*拦截GlobalException异常 自己定义的*/
    @ExceptionHandler(GlobalException.class)
    public JSONResult globalException(GlobalException e){
        e.printStackTrace();
        return JSONResult.error(e.getErrorCode());
    }

    //拦截其他异常
    @ExceptionHandler(Exception.class)
    public JSONResult exception(Exception e){
        e.printStackTrace();
        return JSONResult.error(ErrorCode.SYSTEM_ERROR);
    }
}
