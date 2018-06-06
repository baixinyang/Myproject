package yangxinlang.bawei.com.exemdome01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ZhuceActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText mobile1;
    private EditText password1;
    private Button zhuce1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuce);
        initViewId();
        zhuce1.setOnClickListener(this);

    }

    private void initViewId() {
        mobile1 = findViewById(R.id.mobile1);
        password1  = findViewById(R.id.password1);

        zhuce1 = findViewById(R.id.zhuce1);
    }

    @Override
    public void onClick(View v) {
        String mobile2 = mobile1.getText().toString();
        String password2 = password1.getText().toString();
        if (mobile2.length()==11&&password2.length()>=6){
            Toast.makeText(ZhuceActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(ZhuceActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }else {
            Toast.makeText(ZhuceActivity.this,"登陆失败",Toast.LENGTH_SHORT).show();
        }
    }
}
