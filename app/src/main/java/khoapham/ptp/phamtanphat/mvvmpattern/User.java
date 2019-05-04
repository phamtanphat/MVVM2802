package khoapham.ptp.phamtanphat.mvvmpattern;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.databinding.library.baseAdapters.BR;

public class User extends BaseObservable {
    private String email;
    private String password;
    private Integer image;

    public User(String email, String password, Integer image) {
        this.email = email;
        this.password = password;
        this.image = image;
    }


    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    @Bindable
    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
        notifyPropertyChanged(BR.image);
    }

//    @BindingAdapter({"android:src"})
//    public static void setImage(ImageView image , int hinh){
//        image.setImageResource(hinh);
//    }

    public void setOnClickViewButton(View v , String message){
        Toast.makeText(v.getContext(), message, Toast.LENGTH_SHORT).show();
    }
    @BindingAdapter({"android:onClick"})
    public static void setText(Button v , String message , int number){
        Toast.makeText(v.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
