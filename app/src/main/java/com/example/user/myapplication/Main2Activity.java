package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.myapplication.Main3Activity;

public class Main2Activity extends AppCompatActivity {
    TextView nameview;
    TextView passwordview;
    EditText nameedit;
    EditText passwordedit;
    Button buttonlogin;
    Intent int1;
    String username;
    String password;
    String enterusername;
    String enterpassword;

    String email;
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nameview = findViewById(R.id.textView6);
        passwordview = findViewById(R.id.textView7);
        nameedit = findViewById(R.id.editText5);
        passwordedit = findViewById(R.id.editText6);
        buttonlogin = findViewById(R.id.button2);
        enterusername = nameedit.getText().toString();
        enterpassword = passwordedit.getText().toString();

        int1 = getIntent();
        username = int1.getStringExtra("name");
        password = int1.getStringExtra("password");

        email = int1.getStringExtra("email");
        gender = int1.getStringExtra("gender");

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(enterusername.equals(username) && enterpassword.equals(password))

                {
                    Intent int2 = new Intent(getApplicationContext(), Main3Activity.class);
                    int2.putExtra("name", username);
                    int2.putExtra("password" , password);
                    int2.putExtra("email" , email);
                    int2.putExtra("gender" , gender);

                    startActivity(int2);
                }
                else {
                    Toast.makeText(Main2Activity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
