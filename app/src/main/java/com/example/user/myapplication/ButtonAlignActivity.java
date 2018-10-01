package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonAlignActivity extends AppCompatActivity {

    private TextView tv_btn_nm=null,b_1=null,c_1=null,a_1=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_align);
        tv_btn_nm=findViewById(R.id.tv_btn_nm);

        

        a_1=findViewById(R.id.btn_1);
        b_1=findViewById(R.id.btn_2);
        c_1=findViewById(R.id.btn_3);

    }
    public  void cl1(View v){
        Button btn=(Button) v;

        tv_btn_nm.setText(btn.getText());

        if(v.getId()==R.id.btn_1){



            a_1.setText("1");
            b_1.setText("o");
            c_1.setText("o");
        }else if(v.getId()==R.id.btn_2){


            a_1.setText("0");
            b_1.setText("2");
            c_1.setText("o");
        }else if(v.getId()==R.id.btn_3){


            a_1.setText("o");
            b_1.setText("o");
            c_1.setText("3");
        }

    }

}
