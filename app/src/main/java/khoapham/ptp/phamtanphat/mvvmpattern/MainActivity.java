package khoapham.ptp.phamtanphat.mvvmpattern;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import khoapham.ptp.phamtanphat.mvvmpattern.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        final User user = new User("","",R.mipmap.ic_launcher);
        mainBinding.setUser(user);
        mainBinding.executePendingBindings();

        // cap nhat cho 1 so thuoc tinh khong the hieu gia tri truyen vao
//        mainBinding.imageview.setImageResource(R.mipmap.ic_launcher);
//        final Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Log.d("BBB",user.getEmail());
//                handler.postDelayed(this,500);
//            }
//        },500);
    }
    @BindingAdapter({"android:src"})
    public static void setImage(ImageView image , int hinh){
        image.setImageResource(hinh);
    }
}
