package com.zhoursecurity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tv_guest)
    TextView tvGuest;
    @BindView(R.id.tv_security)
    TextView tvSecurity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv_guest)
    void navigateGuest() {
        Intent intent = new Intent(this, GuestActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.tv_security)
    void navigateSecurity() {
        Intent intent = new Intent(this, SecurityActivity.class);
        startActivity(intent);
    }
}
