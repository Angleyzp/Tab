package com.example.tab;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup rgGroup;
    private RadioButton rbA;
    private RadioButton rbB;
    private RadioButton rbC;
    private RadioButton rbD;
    private RadioButton rbE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        rgGroup = (RadioGroup) findViewById(R.id.rg_group);
        rbA = (RadioButton) findViewById(R.id.rb_a);
        rbB = (RadioButton) findViewById(R.id.rb_b);
        rbC = (RadioButton) findViewById(R.id.rb_c);
        rbD = (RadioButton) findViewById(R.id.rb_d);
        rbE = (RadioButton) findViewById(R.id.rb_e);
        rbA.setOnClickListener(this);
        rbB.setOnClickListener(this);
        rbC.setOnClickListener(this);
        rbD.setOnClickListener(this);
        rbE.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rb_a:
                Toast.makeText(this, "页面1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb_b:
                Toast.makeText(this, "页面2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb_c:
                Toast.makeText(this, "页面3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb_d:
                Toast.makeText(this, "页面4", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb_e:
                Toast.makeText(this, "页面5", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}