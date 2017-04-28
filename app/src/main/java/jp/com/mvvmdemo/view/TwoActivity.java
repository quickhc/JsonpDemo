package jp.com.mvvmdemo.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import jp.com.mvvmdemo.R;
import jp.com.mvvmdemo.databinding.UserLayoutBinding;
import jp.com.mvvmdemo.model.UserEntity;
import jp.com.mvvmdemo.viewModel.BtnClick;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UserLayoutBinding userLayoutBinding = DataBindingUtil.setContentView(this, R.layout.user_layout);
        UserEntity user = new UserEntity();
        user.setAge(34);
        user.setUsername("zhangsan");
        user.setNickname("张三");
        userLayoutBinding.setUser(user);
        BtnClick btnClick=new BtnClick(userLayoutBinding);
        userLayoutBinding.setBtnClick(btnClick);
    }


}
