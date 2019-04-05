package org.curitis.util;

import com.github.pagehelper.PageInfo;
import org.curitis.bean.LayuiResult;

public class ResultUtil {

    private static final int SUCCESS_CODE = 200;

    private static final int LAYUI_SUCCESS_CODE = 0;

    private static final String SUCCESS_MESSAGE = "success";

    public static <T> LayuiResult getLayUIPageResult(PageInfo<T> page){
        return new LayuiResult(LAYUI_SUCCESS_CODE,SUCCESS_MESSAGE,page.getTotal(),page.getList());
    }
}
