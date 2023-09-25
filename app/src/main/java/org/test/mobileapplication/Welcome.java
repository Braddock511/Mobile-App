package org.test.mobileapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        Button backButton = findViewById(R.id.backButton);
        String welcomeMessage = getIntent().getStringExtra("welcomeMessage");

        // Find the TextView in the layout and set the welcome message
        TextView welcomeTextView = findViewById(R.id.textViewWelcome);
        welcomeTextView.setText(welcomeMessage);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
