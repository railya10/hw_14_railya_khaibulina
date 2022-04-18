package com.example.hw_14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.invoke.LambdaConversionException;

public class MainActivity extends AppCompatActivity {

    private EditText email, password;
    private Button button;
    private TextView come_in, info, welcome, forget_pass, click;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.field1);
        password = findViewById(R.id.field2);
        button = findViewById(R.id.enter_button);
        come_in = findViewById(R.id.text_1);
        info = findViewById(R.id.text_3);
        welcome = findViewById(R.id.text_2);
        forget_pass = findViewById(R.id.forgot_pass);
        click = findViewById(R.id.pas_reset);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("admin@gmail.com") &&
                        password.getText().toString().equals("admin")) {
                    button.setVisibility(view.GONE);
                    email.setVisibility(view.GONE);
                    password.setVisibility(view.GONE);
                    forget_pass.setVisibility(view.GONE);
                    click.setVisibility(view.GONE);
                    come_in.setVisibility(view.GONE);
                    info.setVisibility(view.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Неверная почта или пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (email.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                } else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (password.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                } else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }
        });


    }


}





