package my.edu.tarc.lab2_3;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int GET_MESSAGE = 1;
    private static final int GET_IMAGE = 2;
    private TextView textViewMassage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewMassage = (TextView)findViewById(R.id.textViewMessage);
    }
    public void showSecond(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, GET_MESSAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == GET_MESSAGE){
            if(resultCode == RESULT_OK){
                textViewMassage.setText(data.getStringExtra("MESSAGE"));
            }
        }else if(requestCode == GET_IMAGE){
            //Display image on an ImageView
        }
    }
}
