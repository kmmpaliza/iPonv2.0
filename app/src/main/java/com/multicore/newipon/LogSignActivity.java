package com.multicore.newipon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;

public class LogSignActivity extends AppCompatActivity  {

    @BindView(R.id.btnLog) Button btnLog;
    @BindView(R.id.btnSign) Button btnSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_sign);

    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLog:
                startActivity(new Intent(getApplicationContext(), LogInActivity.class));
                break;
            case R.id.btnSign:
                startActivity(new Intent(getApplicationContext(), SignUpActivity.class));
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent setIntent = new Intent(Intent.ACTION_MAIN);
        setIntent.addCategory(Intent.CATEGORY_HOME);
        setIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(setIntent);
        finish();
    }
}
