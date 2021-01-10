package com.nawres.jeuenfant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    Button btnSignIn;
    EditText name,email,password;
    Button btn__register;
    SharedPreferences sharedPreferences;

    private static  final String Shared_Pref_Name="mypref";
    private static  final String KEY_NAME="name";
    private static  final String KEY_EMAIL="email";
    public static  final String PREF_IS_CONNECT="is connected";
    private static  final String KEY_PASSWORD="password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);

        callSignIn();

        name=findViewById(R.id.etName);
        email=findViewById(R.id.etEmail);
        password=findViewById(R.id.etPassword);
        btn__register=findViewById(R.id.btnRegister);


        sharedPreferences=getSharedPreferences(Shared_Pref_Name,MODE_PRIVATE);


        String kidname= sharedPreferences.getString(KEY_NAME,null);
        if (kidname!= null){
            Intent intent = new Intent(SignUp.this,MainActivity.class);
            startActivity(intent);
        }


        btn__register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString(KEY_NAME,name.getText().toString());
                editor.putString(KEY_EMAIL,email.getText().toString());
                editor.putString(KEY_PASSWORD,password.getText().toString());
                editor.putBoolean(PREF_IS_CONNECT,true);
                editor.apply();
                Intent intent = new Intent(SignUp.this,SignIn.class);
                startActivity(intent);
                Toast.makeText(SignUp.this,"true",Toast.LENGTH_LONG).show();
            }
        });

    }



    private void callSignIn(){
        btnSignIn=findViewById(R.id.btnsignin);
        btnSignIn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(SignUp.this,SignIn.class);
                startActivity(intent);
            }
        });
    }
}