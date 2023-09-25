package org.test.mobileapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.window.SplashScreen;

public class MainActivity extends AppCompatActivity {
    private EditText firstNameEditText;
    private EditText lastNameEditText;
    private EditText emailEditText;
    private EditText phoneEditText;
    private Button submitButton;
    private Button clearButton;
    private RelativeLayout mainLayout;
    private TextView welcomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNameEditText = findViewById(R.id.editTextFirstName);
        lastNameEditText = findViewById(R.id.editTextLastName);
        emailEditText = findViewById(R.id.editTextEmail);
        phoneEditText = findViewById(R.id.editTextPhone);
        submitButton = findViewById(R.id.buttonSubmit);
        clearButton = findViewById(R.id.buttonClear);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = firstNameEditText.getText().toString();
                String lastName = lastNameEditText.getText().toString();

                String welcomeMessage = String.format("Welcome, %s %s!", firstName, lastName);

                // Create an Intent to start a new activity
                Intent intent = new Intent(MainActivity.this, Welcome.class);

                // Pass the welcome message as an extra to the new activity
                intent.putExtra("welcomeMessage", welcomeMessage);

                // Start the new activity
                startActivity(intent);
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNameEditText.getText().clear();
                lastNameEditText.getText().clear();
                emailEditText.getText().clear();
                phoneEditText.getText().clear();
            }
        });
    }
}