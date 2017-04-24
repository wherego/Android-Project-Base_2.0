package cn.manfi.project.base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import cn.manfi.project.base.utils.ToastUtils;

/**
 * Base Activity
 * Created by Manfi on 2017/4/17.
 */

public abstract class BaseActivity extends AppCompatActivity {

    private Activity activity;

    // Loading Dialog
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        // Dagger2 依赖注入，放在onCreate()前
//        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        activity = this;
        progressDialog = new ProgressDialog(activity);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        initView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    public void showToast(String msg) {
        ToastUtils.show(msg);
    }

    public void showProgress(String msg) {
        progressDialog.setTitle(msg);
        progressDialog.show();
    }

    public void dismissProgress() {
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    protected abstract void initView();
}
