package com.example.user.myapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.user.myapplication.Main3Activity;


public class MainActivity extends AppCompatActivity  {
    TextView nametext;
    TextView emailtext;
    TextView passwordtext;
    TextView dateofbirthtext;
    TextView gendertext;
    Button buttonsignup;
    RadioButton buttonmale;
    RadioButton buttonfemale;
    EditText nameedit;
    EditText emailedit;
    EditText passwordedit;
    EditText dateofbirthedit;
    String entername;
    String enteremail;
    String enterpassword;
    String enterdateofbirth;
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nametext = findViewById(R.id.textView);
        emailtext = findViewById(R.id.textView2);
        passwordtext = findViewById(R.id.textView3);
        dateofbirthtext = findViewById(R.id.textView4);
        gendertext = findViewById(R.id.textView5);
        buttonsignup = findViewById(R.id.button);
        buttonmale = findViewById(R.id.radioButton);
        buttonfemale = findViewById(R.id.radioButton2);
        nameedit = findViewById(R.id.editText);
        emailedit = findViewById(R.id.editText2);
        passwordedit = findViewById(R.id.editText3);
        dateofbirthedit = findViewById(R.id.editText4);

        entername = nameedit.getText().toString();
        enteremail = emailedit.getText().toString();
        enterpassword = passwordedit.getText().toString();
        enterdateofbirth = dateofbirthedit.getText().toString();

        buttonmale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buttonmale.isChecked()) {
                    gender = "Male";
                    buttonfemale.setEnabled(false);
                    buttonmale.setEnabled(false);

                }
            }
        });
        buttonfemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buttonfemale.isChecked()) {
                    gender = "Female";
                    buttonmale.setEnabled(false);
                    buttonfemale.setEnabled(false);
                }
            }
        });

        buttonsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("name" , entername);
                intent.putExtra("email" , enteremail);
                intent.putExtra("password" , enterpassword);
                intent.putExtra("dateofbirth" , enterdateofbirth);
                intent.putExtra("gender" , gender);
                startActivity(intent);

            }
        });
    }
}
