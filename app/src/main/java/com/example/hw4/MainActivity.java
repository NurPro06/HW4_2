package com.example.hw4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView Entrance;
    private TextView Registration;
    private TextView YourPassworld;
    private TextView ClicPassworld;
    private EditText Email;
    private EditText password;
    private Button Come;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Entrance = findViewById(R.id.text0);
        Registration = findViewById(androidx.core.R.id.text2);
        YourPassworld = findViewById(R.id.text_q);
        ClicPassworld = findViewById(R.id.text3);
        Email = findViewById(R.id.edit_text1);
        password = findViewById(R.id.edit_text2);
        Come = findViewById(R.id.button);
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
                    Come.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                } else {
                    Come.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.brown));
                }

            }
        });
        Email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (Email.getText().toString().isEmpty()) {
                    Come.setBackgroundColor(Color.GRAY);
                } else {
                    Come.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.brown));
                }

            }
        });
        Come.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Email.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")) {
                    Entrance.setVisibility(View.GONE);
                    Registration.setVisibility(View.GONE);
                    YourPassworld.setVisibility(View.GONE);
                    ClicPassworld.setVisibility(View.GONE);
                    Email.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    Come.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this,
                            "Вы успешно зарегистрировались",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,
                            "Не правильный логин или пароль"
                            , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}