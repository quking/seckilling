package com.jlu.seckilling.result;

import lombok.AllArgsConstructor;
import lombok.Data;

/**<h1>定义错误代码</h1>
 * @author QuJing
 * @create 2019/12/3
 */
@Data
@AllArgsConstructor
public class CodeMsg {

    /* 错误代码 */
    private Integer code;

    /* 错误信息 */
    private String Msg;

    /** 通用异常 */
    public static CodeMsg SUCCESS = new CodeMsg(0,"success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100,"服务端异常");
}
