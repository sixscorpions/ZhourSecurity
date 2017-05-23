package com.zhoursecurity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utils.Utility;

public class GuestActivity extends Activity {

    @BindView(R.id.et_write_your_code)
    EditText etWriteYourCode;

    @BindView(R.id.tv_message)
    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_check)
    void checkFunction() {
        if (isValidFields()) {
            etWriteYourCode.setText("");
            tvMessage.setVisibility(View.VISIBLE);
        }
    }

    private boolean isValidFields() {
        boolean isValid = true;
        if (Utility.isValueNullOrEmpty(etWriteYourCode.getText().toString())) {
            Utility.showToastMessage(this, "Please write code");
            isValid = false;
        }
        return isValid;
    }

}
