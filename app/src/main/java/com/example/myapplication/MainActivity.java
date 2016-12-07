package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bmob.initialize(this,"5b12e8533fc325e7d8e7013b31181a5b");
        Button button = (Button)findViewById(R.id.get);
        final EditText getusername = (EditText)findViewById(R.id.getusername);
        final EditText getpwd = (EditText)findViewById(R.id.getpwd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Person p2 = new Person();
                p2.setName(getusername.getText().toString());
                p2.setPassword(getpwd.getText().toString());
                p2.save(new SaveListener<String>() {
                    @Override
                    public void done(String s, BmobException e) {
                        if(e==null){
                            Toast.makeText(MainActivity.this,"注册成功",Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(MainActivity.this,"注册失败",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}
