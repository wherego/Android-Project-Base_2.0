package cn.manfi.project.base;

import android.content.Context;

import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.DaggerFragment;

/**
 * Base Fragment
 * Created by Manfi on 2017/4/20.
 */

public abstract class BaseFragment extends DaggerFragment {

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
        initView();
    }

    protected abstract void initView();
}