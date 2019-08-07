package v;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import bean.User_Bean_Info;
import cn.com.myapplication.R;
import p.Presenter;

public class MainActivity extends AppCompatActivity implements I_MainActivity {
    //用户名
    private EditText userName;
    //用户密码
    private EditText userPassword;
    //保存信息
    private Button save;
    //获取信息
    private Button get;
    // P 的引用，让 V 和 P 能进行交互
    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实例化 P
        presenter = new Presenter(this);
        //绑定
        userName = findViewById(R.id.user_name);
        userPassword = findViewById(R.id.user_password);
        get = findViewById(R.id.get);
        save = findViewById(R.id.save);
        //获取信息 Button
        get.setOnClickListener((v)->{
            //通过 P 来获取，不涉及逻辑操作
            presenter.getLoginInfo();
        });
        //保存用户信息
        save.setOnClickListener((v)->{
            //构建用户信息
            User_Bean_Info info = new User_Bean_Info();
            info.setUserName(userName.getText().toString());
            info.setUserPassword(userPassword.getText().toString());
            //让 P 进行保存，不涉及逻辑操作
            presenter.saveLoginInfo(info);
        });

    }
    //让 P 能获取 V 中的用户名
    @Override
    public String getUserName() {
        return userName.getText().toString();
    }
    //让 P 能获取 V 中的密码
    @Override
    public String getUserPassword() {
        return userPassword.getText().toString();
    }
    // P 对 V 进行设置 V 中的数据，设置用户名
    @Override
    public void setUserName(String name) {
        userName.setText(name);
    }

    // P 对 V 进行设置 V 中的数据，设置密码
    @Override
    public void setUserPassword(String password) {
        userPassword.setText(password);
    }
}
