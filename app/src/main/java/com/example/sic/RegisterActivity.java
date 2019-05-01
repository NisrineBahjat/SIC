package com.example.sic;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    EditText ufirstname, ulastname, uemail, upassword, uconfpassword, ucontactno;
    Button btnRegister;
    TextInputLayout userFirstNameWrapper, userLastNameWrapper, userEmailWrapper, userPasswordWrapperm,
            userConfPasswordWrapper, userContactNoWrapper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ufirstname = findViewById(R.id.userFirstName);
        ulastname = findViewById(R.id.userLastName);
        uemail = findViewById(R.id.userEmailAddress);
        upassword = findViewById(R.id.userPassword);
        uconfpassword = findViewById(R.id.userConfirmPassword);
        ucontactno = findViewById(R.id.userContactNumber);

        userFirstNameWrapper = findViewById(R.id.userFirstNameWrapper);
        userLastNameWrapper = findViewById(R.id.userLastNameWrapper);
        userEmailWrapper = findViewById(R.id.userEmailWrapper);
        userPasswordWrapperm = findViewById(R.id.userPasswordWrapper);
        userConfPasswordWrapper = findViewById(R.id.userConfPasswordWrapper);
        userContactNoWrapper = findViewById(R.id.userContactNoWrapper);

        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname = ufirstname.getText().toString().trim();
                String lastname = ulastname.getText().toString().trim();
                String email = uemail.getText().toString().trim();
                String password = upassword.getText().toString().trim();
                String confpassword = uconfpassword.getText().toString().trim();
                String contactno = ucontactno.getText().toString().trim();
                if(firstname.isEmpty()){
                    userFirstNameWrapper.setError("Enter First Name");
                    userFirstNameWrapper.requestFocus();
                    return;
                }
                if(lastname.isEmpty()){
                    userLastNameWrapper.setError("Enter Last Name");
                    userLastNameWrapper.requestFocus();
                    return;
                }
                if(email.isEmpty()){
                    userEmailWrapper.setError("Enter Email");
                    userEmailWrapper.requestFocus();
                    return;
                }
                if(password.isEmpty()){
                    userPasswordWrapperm.setError("Enter Password");
                    userPasswordWrapperm.requestFocus();
                    return;
                }
                if(confpassword.isEmpty()){
                    userConfPasswordWrapper.setError("Enter Confirm Password");
                    userConfPasswordWrapper.requestFocus();
                    return;
                }
                if(!password.equals(confpassword)){
                    userConfPasswordWrapper.setError("Password didn't match");
                    userConfPasswordWrapper.requestFocus();
                    return;
                }
                if(contactno.isEmpty()){
                    userContactNoWrapper.setError("Enter Contact Number");
                    userContactNoWrapper.requestFocus();
                    return;
                }
            }
        });

    }
}
