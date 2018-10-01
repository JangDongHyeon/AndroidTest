package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrintSartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_sart);

        final EditText editText=(EditText) findViewById(R.id.editText1);
        Button button=(Button) findViewById(R.id.button1);
        final TextView textView=(TextView) findViewById(R.id.textView1);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String start = "";
                if(!per(editText.getText().toString())){
                    start+="숫자를입력하세요!!";
                }else {

              int te = Integer.parseInt(editText.getText().toString());

                    for (int i = 0; i < te; i++) {
                        for (int z = 0; z <= i; z++) {
                            start += "*";
                        }
                        start += "\n";
                    }
                }
                textView.setText(start);

            }
        });

    }
    public boolean per(String a){
    try {
        Integer.parseInt(a);
        return  true;


    }catch (Exception e){
        return  false;
    }
    }
}
