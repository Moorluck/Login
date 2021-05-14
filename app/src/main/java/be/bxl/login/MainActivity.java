package be.bxl.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private Button reset;

    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.btn_login);
        reset = findViewById(R.id.btn_reset);

        username = findViewById(R.id.et_username);
        password = findViewById(R.id.et_password);

        login.setOnClickListener(c -> {
            Log.d("Username", username.getText().toString());
            Log.d("Password", password.getText().toString());
        });

        reset.setOnClickListener(c -> {
            username.setText("");
            password.setText("");
        });
    }
}