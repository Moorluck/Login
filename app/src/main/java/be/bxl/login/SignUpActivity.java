package be.bxl.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private EditText email;
    private EditText phone;

    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        username = findViewById(R.id.et_sgnup_username);
        password = findViewById(R.id.et_sgnup_password);
        email = findViewById(R.id.et_sgnup_email);
        phone = findViewById(R.id.et_sgnup_phone);
        signUpButton = findViewById(R.id.btn_sgnup_signup);

        signUpButton.setOnClickListener(c -> {
            Toast.makeText(this, "Signed up !", Toast.LENGTH_LONG).show();
            Log.d("Username : ", username.getText().toString());
            Log.d("Password : ", password.getText().toString());
            Log.d("Email : ", email.getText().toString());
            Log.d("Phone : ", phone.getText().toString());
        });

    }
}