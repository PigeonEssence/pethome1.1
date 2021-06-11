package cn.itsources.pethome.base.result;

import cn.itsources.pethome.base.constants.ErrorCode;
import lombok.Data;

//返回JSON结果
@Data
public class JSONResult {
    private boolean success = true;

    private String message = "成功";

    //错误码，描述错误类型
    private String code = "1000";

    //返回的数据
    private Object data;
    /**=================================================
     * 方法说明:成功的情况：根据传入的参数不同，返回不同的value
     * 步骤说明：
     =================================================== **/
    public static JSONResult instance(){
        return new JSONResult();
    }

    public static JSONResult instance(Object obj){
        JSONResult instance = new JSONResult();
        instance.setData(obj);
        return instance;
    }

/**=================================================
 * 方法说明:有错误的情况：根据传入的参数不同，返回不同的value
 * 步骤说明：
 =================================================== **/
    public static JSONResult error(){
        JSONResult jsonResult = new JSONResult();
        jsonResult.setSuccess(false);
        return jsonResult;
    }


    public static JSONResult error(String message){
        JSONResult instance = new JSONResult();
        instance.setMessage(message);
        instance.setSuccess(false);
        return instance;
    }

    public static JSONResult error(String message,String code){
        JSONResult instance = new JSONResult();
        instance.setMessage(message);
        instance.setSuccess(false);
        instance.setCode(code);
        return instance;
    }

    //接收一个错误码的枚举
    public static JSONResult error(ErrorCode errorCode){
        JSONResult instance = new JSONResult();
        instance.setMessage(errorCode.getMessage());
        instance.setSuccess(false);
        instance.setCode(errorCode.getCode());
        return instance;
    }
}
