package cn.manfi.project.base.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

import cn.manfi.project.base.BaseApp;

/**
 * ToastUtils
 * Created by Manfi on 2017/4/17.
 */

public class ToastUtils {

    private static Context context = BaseApp.getAppContext();

    private static Toast toast;

    public static void show(CharSequence text) {
        show(text, Toast.LENGTH_SHORT);
    }

    public static void show(CharSequence text, int duration) {
        text = TextUtils.isEmpty(text) ? "" : text;
        if (toast == null) {
            toast = Toast.makeText(context, text, duration);
        } else {
            toast.setText(text);
        }
        toast.show();
    }

    public static void show(int resId) {
        show(context.getResources().getText(resId), Toast.LENGTH_SHORT);
    }

    public static void show(int resId, int duration) {
        show(context.getResources().getText(resId), duration);
    }
}
