package com.jlu.seckilling.result;

import lombok.Data;

/**<h1>结果</h1>
 * @author QuJing
 * @create 2019/12/3
 */
@Data
public class Result<T> {

    /* 结果代码 */
    private Integer code;

    /** 结果信息 */
    private String msg;

    /** 结果值 */
    private T data;

    /** 成功的时候调用 */
    public static <T> Result<T> success(T data){
        return new Result<>(data);
    }

    /** 失败的时候 */
    public static <T> Result<T> error(CodeMsg cm){
        return new Result<>(cm);
    }

    private Result(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    private Result(CodeMsg cm) {
        if(cm == null) {
            return;
        }
        this.code = cm.getCode();
        this.msg = cm.getMsg();
    }

}
