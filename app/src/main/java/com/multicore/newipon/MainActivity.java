package com.multicore.newipon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnLetStart) Button btnLetStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLetStart:
                startActivity(new Intent(getApplicationContext(), LogSignActivity.class));
                break;
        }
    }
}
