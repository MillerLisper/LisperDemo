package com.lisper.lisperdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lisper.utils.LPActivityUtils;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.lpSecBtn)
    void onClick(){
        LPActivityUtils.startActivity(SecondActivity.this, MainActivity.class, null);
    }
}
