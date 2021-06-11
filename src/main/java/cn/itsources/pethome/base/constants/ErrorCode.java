package cn.itsources.pethome.base.constants;

import lombok.Data;

public enum ErrorCode {
    /**=================================================
     * 方法说明:相当于是在调用构造器
     =================================================== **/


    OK("1000","成功"),

    SYSTEM_ERROR("1001","系统内部异常");
    /**=================================================
     * 方法说明:生成构造器
     =================================================== **/

    private String code;
    private String message;

    ErrorCode(String code,String message){
        this.code=code;
        this.message=message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
