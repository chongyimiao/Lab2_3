package my.edu.tarc.lab2_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editTextMessage = (EditText)findViewById(R.id.editTextMessage);
    }

    public void closeSecond(View v){

        String message = editTextMessage.getText().toString();
        Intent intentMessage = new Intent();

        intentMessage.putExtra("MESSAGE",message);

        setResult(RESULT_OK, intentMessage);
        finish();
    }
}
