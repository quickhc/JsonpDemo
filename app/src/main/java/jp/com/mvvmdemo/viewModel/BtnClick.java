package jp.com.mvvmdemo.viewModel;

import android.view.View;

import jp.com.mvvmdemo.databinding.UserLayoutBinding;
import jp.com.mvvmdemo.model.UserEntity;

/**
 * Created by hc on 2017/4/11.
 */

public class BtnClick {

    UserLayoutBinding userLayoutBinding;

    public BtnClick(UserLayoutBinding userLayoutBinding){
        this.userLayoutBinding=userLayoutBinding;

    }

    public final void btnClick(View v){
        userLayoutBinding.setUser(new UserEntity(21,"wo","nimen"));
    }
}
