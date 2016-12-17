package pl.akademiakodu.intent;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonGo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGo = (Button) findViewById(R.id.buttonGo);
        buttonGo.setOnClickListener(this);



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
          if(requestCode == 0) {
              if(resultCode == Activity.RESULT_OK){
                  Toast.makeText(this, data.getStringExtra("name"), Toast.LENGTH_SHORT).show();
              }else{
                  Toast.makeText(this, "Wystąpił błąd", Toast.LENGTH_SHORT).show();
              }
          }
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == buttonGo.getId()){
            Intent i = new Intent(this, DataActivity.class);
            // startActivity(i);
             startActivityForResult(i, 0);
        }
    }
}
