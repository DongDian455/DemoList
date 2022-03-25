package com.returntolife.jjcode.mydemolist.demo.function.mvvm;


import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

/**
 * Created by HeJiaJun on 2019/7/4.
 * Email:455hejiajun@gmail
 * des:
 */
public abstract class BaseActivity<T extends BaseViewModel> extends FragmentActivity {

    protected T mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel= ViewModelProviders.of(this).get(getViewModelClass());
    }



    /**
     * 创建 自定义的 ViewModel
     */
    protected abstract Class<T> getViewModelClass();


}
