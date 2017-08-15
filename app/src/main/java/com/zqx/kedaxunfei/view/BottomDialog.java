package com.zqx.kedaxunfei.view;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

import com.zqx.kedaxunfei.R;

/**
 * Created by ZhangQixiang on 2017/1/5.
 */
public class BottomDialog extends Dialog {

    public BottomDialog(Context context) {
        super(context,R.style.dialog_bottom_style);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = WindowManager.LayoutParams.WRAP_CONTENT;
        attributes.gravity = Gravity.BOTTOM;
        window.setAttributes(attributes);
    }


}
