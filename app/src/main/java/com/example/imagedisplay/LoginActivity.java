package com.example.imagedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText editContact, editPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editContact = (EditText) findViewById(R.id.et_login_id);
        editPassword = (EditText) findViewById(R.id.et_password);
        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        login();
                    }
                }
        );
    }

    private void login() {
        String contact = editContact.getText().toString();
        String password = editPassword.getText().toString();

        if (TextUtils.equals(contact, "9876543210") && TextUtils.equals(password, "admin")) {
            startActivity(new Intent(LoginActivity.this, DashBoardActivity.class));
        } else {
            Toast.makeText(LoginActivity.this, "Wrong credentials", Toast.LENGTH_SHORT).show();
        }
    }
}
