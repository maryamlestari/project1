package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MaryamActivity extends AppCompatActivity {

    public static final int RESULT_CODE=110;
    public static final String EXTRA_NAME="extra_name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maryam);

        final EditText edtEdit=findViewById(R.id.editText);
        Button btnOk=findViewById(R.id.buttonOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ok=edtEdit.getText().toString();
                Intent Back=new Intent();
                Back.putExtra(EXTRA_NAME,Ok);
                setResult(RESULT_CODE,Back);
                finish();
            }
        });
    }
}
