package entity;

import java.util.Map;
import java.util.logging.Logger;

/**
 * @author Ontheway
 * @Date 2019/3/24
 * 通用的响应规范
 **/
public class Result {

    private boolean flag;//是否成功

    private Integer code;// 返回码

    private String message;//返回信息

    private Map<String, Object> extention;// 返回数据

    public Result add(String key, Object value) {
        this.extention.put(key, value);
        return this;
    }

    public static Result success(){
        Result result = new Result();
        result.setCode(StatusCode.OK);
        result.setFlag(true);
        return result;
    }

    public static Result fail(){
        Result result = new Result();
        result.setCode(StatusCode.ERROR);
        result.setFlag(false);
        return result;
    }

    public Result() {
    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result(boolean flag, Integer code, String message, Map<String, Object> extention) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.extention = extention;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Map<String, Object> getExtention() {
        return extention;
    }

    public void setExtention(Map<String, Object> extention) {
        this.extention = extention;
    }
}