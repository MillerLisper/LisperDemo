package com.lisper.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * 作者:  Lisper
 * 日期:  2017/3/17.
 */

public class LPToastUtils {
    private static Toast lpToast;

    /**
     * @param context Application实例
     * @param text 文本
     */
    public static void show(Context context, CharSequence text) {
        if(lpToast != null){
            lpToast.cancel();
        }
        if(TextUtils.isEmpty(text)){
            return;
        }
        if (text.length() < 10) {
            lpToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        } else {
            lpToast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        }
        lpToast.show();
    }
}
