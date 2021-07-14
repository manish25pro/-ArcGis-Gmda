package com.firestudio.projectgmda.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import com.firestudio.projectgmda.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {
    TextInputEditText textInputEditText;
private static final CharSequence fixNumber= "9876543210";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textInputEditText = findViewById(R.id.edit_text_number);
    }

    public void loginButton(View view) {
        if (validateMobileNumber(Objects.requireNonNull(textInputEditText.getText()).toString())) {
            Toast.makeText(this, "Otp is 36363", Toast.LENGTH_LONG).show();
            startActivity(new Intent(LoginActivity.this, MobileOtpVerificationActivity.class));
            finish();
        } else {
            Toast.makeText(this, "Enter Correct Mobile Number", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean validateMobileNumber(CharSequence ch) {
        if (TextUtils.isEmpty(ch)) {
            return false;
        } else if (Patterns.PHONE.matcher(ch).matches() && ch.equals(fixNumber)) {
            return true;
        } else  {
            return false;
        }

    }
}