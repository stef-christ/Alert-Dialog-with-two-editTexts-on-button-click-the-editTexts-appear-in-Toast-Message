package com.example.enotita_6_9;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_show = findViewById(R.id.btn_show);

        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dialog);

                final EditText edtxt_email = dialog.findViewById(R.id.edtxt_email);
                final EditText edtxt_password = dialog.findViewById(R.id.edtxt_password);
                Button btn_close = dialog.findViewById(R.id.btn_close);

                btn_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String email = edtxt_email.getText().toString();
                        String password = edtxt_password.getText().toString();
                        Toast.makeText(getApplicationContext(), email + " " + password, Toast.LENGTH_LONG).show();
                        dialog.cancel();
                      }
                });
                dialog.show();
            }
        });
    }
}
