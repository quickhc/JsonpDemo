package jp.com.mvvmdemo.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

public class UserEntity  extends BaseObservable {
    private String username;  
    private String nickname;  
    private int age;  
  
    public UserEntity() {  
    }

    @Bindable
    public int getAge() {  
        return age;  
    }  
  
    public void setAge(int age) {  
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    @Bindable
    public String getNickname() {  
        return nickname;  
    }  
  
    public void setNickname(String nickname) {  
        this.nickname = nickname;
        notifyPropertyChanged(BR.nickname);
    }

    @Bindable
    public String getUsername() {  
        return username;  
    }  
  
    public void setUsername(String username) {  
        this.username = username;
        notifyPropertyChanged(BR.username);
    }  
  
    public UserEntity(int age, String nickname, String username) {  
        this.age = age;  
        this.nickname = nickname;  
        this.username = username;  
    }  
}  