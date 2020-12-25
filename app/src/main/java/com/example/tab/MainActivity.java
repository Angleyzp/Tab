package com.example.tab;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tab.fragment.HomeFragment;
import com.example.tab.fragment.LessFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup rgGroup;
    private RadioButton rbA;
    private RadioButton rbB;
    private RadioButton rbC;
    private RadioButton rbD;
    private RadioButton rbE;
    private RecyclerView rv;
    private FrameLayout frame;
    private LinearLayout ll;
    private HomeFragment homeFragment;
    private LessFragment lessFragment;

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


        frame = (FrameLayout) findViewById(R.id.frame);
        homeFragment = new HomeFragment();
        lessFragment = new LessFragment();
        //初始化界面
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame, homeFragment)
                .add(R.id.frame, lessFragment)
                .show(homeFragment)
                .hide(lessFragment)
                .commit();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rb_a:
                //展示第一个页面
                getSupportFragmentManager().beginTransaction()
                        .show(homeFragment)
                        .hide(lessFragment)
                        .commit();
                break;
            case R.id.rb_b:
                //展示第二个界面
                getSupportFragmentManager().beginTransaction()
                        .show(lessFragment)
                        .hide(homeFragment)
                        .commit();
                break;
            case R.id.rb_c:
                Toast.makeText(this, "页面3暂未开发", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb_d:
                Toast.makeText(this, "页面4暂未开发", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb_e:
                Toast.makeText(this, "页面5暂未开发", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}