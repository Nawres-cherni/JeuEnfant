package com.nawres.jeuenfant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

public class SignIn extends AppCompatActivity {
    Button login;
    EditText name,password,EdiPassword;
    SharedPreferences sharedPreferences;
    private static  final String Shared_Pref_Name="mypref";
    private static  final String KEY_NAME="name";
    private static  final String KEY_EMAIL="email";
    public static  final String PREF_IS_CONNECT="is connected";
    private static  final String KEY_PASSWORD="password";
    CheckBox ShowPassword;
    AwesomeValidation awesomeValidation;

    Button  bntSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_in);

        name=findViewById(R.id.editmail);
        password=findViewById(R.id.motpssword);
        login=findViewById(R.id.btnlog);
        ShowPassword=findViewById(R.id.showpassword);

        callSignUp();
        validateChamp();
        showPassword();
    }

    private void validateChamp() {
        awesomeValidation=new AwesomeValidation(ValidationStyle.BASIC);
        awesomeValidation.addValidation(this,R.id.editmail, RegexTemplate.NOT_EMPTY,R.string.name_invalid);
        awesomeValidation.addValidation(this,R.id.motpssword, RegexTemplate.NOT_EMPTY,R.string.password_invalid);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(awesomeValidation.validate()){
                    LoginUser();

                }

            }
        });

    }

    private void LoginUser(){
        sharedPreferences=getSharedPreferences(Shared_Pref_Name,MODE_PRIVATE);
        String enfantname=sharedPreferences.getString(KEY_NAME,null);
        if(enfantname != null){
            startActivity(new Intent(SignIn.this, MainActivity.class));

        }
        final String kidname= sharedPreferences.getString(KEY_EMAIL,"");
        final String kidpassword= sharedPreferences.getString(KEY_PASSWORD,"");
        SharedPreferences.Editor editor=sharedPreferences.edit();
        String passwordValue=password.getText().toString();
        String userNameValue=name.getText().toString();
        editor.putBoolean(PREF_IS_CONNECT,true);
        editor.putString(KEY_EMAIL,name.getText().toString());
        editor.putString(KEY_PASSWORD,password.getText().toString());
        editor.apply();

        if(userNameValue.equals(kidname)&& passwordValue.equals(kidpassword)){
            startActivity(new Intent(SignIn.this, MainActivity.class));
        }else{
            Toast.makeText(SignIn.this,"error",Toast.LENGTH_LONG).show();


        }
    }

    private void  showPassword(){
        ShowPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else{
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
    }
    private void callSignUp(){
        bntSignUp=findViewById(R.id.btnsignup);
        bntSignUp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(SignIn.this,SignUp.class);
                startActivity(intent);
            }
        });

    }



}
