package examples.aaronhoskins.com.daytwointrotoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {
    //Declare Views in the activity
    TextView tvDisplay;
    EditText etInput;
    //Button btnSendData;

    //R = resource
    //layout = Folder
    //activity_main = name of resource
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding views to xml elements
        tvDisplay = (TextView)findViewById(R.id.tvDisplay);
        etInput = findViewById(R.id.etUserInput);
       // btnSendData = findViewById(R.id.btnSendStringToDisplay);
//        btnSendData.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String userInput = etInput.getText().toString();
//                if(!userInput.isEmpty()) {
//                    tvDisplay.setText(userInput);
//                    etInput.setText("");
//                }
//            }
//        });
      // btnSendData.setOnClickListener(this);
    }

    //@Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnSendStringToDisplay:
                String userInput = etInput.getText().toString();
                if(!userInput.isEmpty()) {
                    tvDisplay.setText(userInput);
                }
                break;
            case R.id.tvDisplay:
                etInput.setText("");
                break;
        }

    }
}
