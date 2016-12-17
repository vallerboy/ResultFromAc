package pl.akademiakodu.intent;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DataActivity extends AppCompatActivity implements View.OnClickListener{


    EditText text;
    Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        text = (EditText) findViewById(R.id.editText);
        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.putExtra("name", text.getText().toString());
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}
