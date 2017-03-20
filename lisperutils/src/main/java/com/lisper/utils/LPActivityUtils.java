package com.lisper.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 作者:  Lisper
 * 日期:  2017/3/17.
 */

public class LPActivityUtils {
    /**
     * Activity跳转
     * @param context
     * @param className
     * @param params  NUll:true or false
     */
    public static void startActivity(Context context, Class<?> className, HashMap<String, Object> params){
        Intent i = new Intent(context, className);
        if (params != null) {
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                putExtra(i, entry);
            }
        }
        context.startActivity(i);
    }

    /**
     * Activity中使用
     * @param className
     * @param params
     * @param requestCode
     */
    public static void startActivityForResult(Activity activity, Class<?> className, HashMap<String, Object> params, int requestCode){
        Intent i = new Intent(activity, className);
        if (params != null) {
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                putExtra(i, entry);
            }
        }
        activity.startActivityForResult(i, requestCode);
    }

    /**
     * fragemnt中使用
     * @param className
     * @param params
     * @param requestCode
     */
    public static void startActivityForResult(Fragment fragment, Class<?> className, HashMap<String, Object> params, int requestCode){
        Intent i = new Intent(fragment.getActivity(), className);
        if (params != null) {
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                putExtra(i, entry);
            }
        }
        fragment.startActivityForResult(i, requestCode);
    }

    /**
     *
     * @param intent
     * @param entry
     */
    public static void putExtra(Intent intent, Map.Entry<String, Object> entry) {
        String name = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof CharSequence) {
            intent.putExtra(name, (CharSequence) value);
        } else if (value instanceof CharSequence[]) {
            intent.putExtra(name, (CharSequence[]) value);
        } else if (value instanceof Boolean) {
            intent.putExtra(name, (Boolean) value);
        } else if (value instanceof Boolean[]) {
            intent.putExtra(name, (Boolean[]) value);
        } else if (value instanceof Bundle) {
            intent.putExtra(name, (Bundle) value);
        } else if (value instanceof Byte) {
            intent.putExtra(name, (Byte) value);
        } else if (value instanceof Byte[]) {
            intent.putExtra(name, (Byte[]) value);
        } else if (value instanceof Character) {
            intent.putExtra(name, (Character) value);
        } else if (value instanceof Character[]) {
            intent.putExtra(name, (Character[]) value);
        } else if (value instanceof Double) {
            intent.putExtra(name, (Double) value);
        } else if (value instanceof Double[]) {
            intent.putExtra(name, (Double[]) value);
        } else if (value instanceof Float) {
            intent.putExtra(name, (Float) value);
        } else if (value instanceof Float[]) {
            intent.putExtra(name, (Float[]) value);
        } else if (value instanceof Integer) {
            intent.putExtra(name, (Integer) value);
        } else if (value instanceof Integer[]) {
            intent.putExtra(name, (Integer[]) value);
        } else if (value instanceof Long) {
            intent.putExtra(name, (Long) value);
        } else if (value instanceof Long[]) {
            intent.putExtra(name, (Long[]) value);
        } else if (value instanceof Parcelable) {
            intent.putExtra(name, (Parcelable) value);
        } else if (value instanceof Serializable) {
            intent.putExtra(name, (Serializable) value);
        }
    }
}
