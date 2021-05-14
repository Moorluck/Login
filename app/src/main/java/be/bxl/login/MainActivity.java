package be.bxl.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private Button reset;
    private Button signUp;

    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.btn_login);
        reset = findViewById(R.id.btn_reset);
        signUp = findViewById(R.id.btn_signup);

        username = findViewById(R.id.et_username);
        password = findViewById(R.id.et_password);

        login.setOnClickListener(c -> {
            Toast.makeText(this, "Login !", Toast.LENGTH_LONG).show();
            Log.d("Username", username.getText().toString());
            Log.d("Password", password.getText().toString());
        });

        reset.setOnClickListener(c -> {
            username.setText("");
            password.setText("");
        });

        signUp.setOnClickListener(c -> {
            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);
        });
    }
}