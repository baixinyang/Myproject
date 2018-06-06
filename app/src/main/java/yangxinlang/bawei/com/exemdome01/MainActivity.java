package yangxinlang.bawei.com.exemdome01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mobile;
    private EditText password;
    private Button login;
    private Button zhuce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewId();
        login.setOnClickListener(this);
        zhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ZhuceActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void initViewId() {
        mobile = findViewById(R.id.mobile);
        password  = findViewById(R.id.password);
        login = findViewById(R.id.login);
        zhuce = findViewById(R.id.zhuce);
    }

    @Override
    public void onClick(View v) {
        String mobile1 = mobile.getText().toString();
        String password1 = password.getText().toString();
        if (mobile1.length()==11&&password1.length()>=6){
            Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity.this, ShangpinActivity.class);
        startActivity(intent);
        finish();
        }else {
            Toast.makeText(MainActivity.this,"登陆失败",Toast.LENGTH_SHORT).show();
        }
    }
}
