package com.richardo4578.caasera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtLoginName, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtLoginName = (EditText) findViewById(R.id.edtLoginName);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
    }

    public void btnLoginOnClick(View v) {
        Log.i("CLICK", "Login button was clicked.");
        Log.i("CLICK", edtLoginName.getText().toString());
        Log.i("CLICK", edtPassword.getText().toString());
        Toast.makeText(this, "You have successfully logged in as: " + edtLoginName.getText().toString() + "\nPassword: " + edtPassword.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void btnCancelOnClick(View v) {
        Log.i("CLICK", "Cancel button was clicked.");
        Toast.makeText(this, "Login cancelled!", Toast.LENGTH_SHORT).show();
    }


}
