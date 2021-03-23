package com.example.provider.vo;

public class ResultUtil {

    public static ResultVO success(Object data){
        ResultVO result = new ResultVO();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(data);
        return result;
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO result = new ResultVO();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static ResultVO error(ResultEnum res) {
        ResultVO result = new ResultVO();
        result.setCode(res.getCode());
        result.setMsg(res.getMsg());
        return result;
    }

}
