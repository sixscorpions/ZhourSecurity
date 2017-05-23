package com.zhoursecurity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

    @BindView(R.id.btn_scan_vehicle)
    Button btnScanVehicle;

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
            btnScanVehicle.setVisibility(View.VISIBLE);
        }
    }

    private boolean isValidFields() {
        boolean isValid = true;
        if (Utility.isValueNullOrEmpty(etWriteYourCode.getText().toString())) {
            Utility.showToastMessage(this, "Please write code");
            isValid = false;
        } else if (etWriteYourCode.getText().toString().length() != 4) {
            Utility.showToastMessage(this, "Code must be 4 digit");
            isValid = false;
        }
        return isValid;
    }

}
