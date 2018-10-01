package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.BitSet;

public class CalcActivity extends AppCompatActivity {
    ArrayList<Button> Blist=new ArrayList<>();
    Button[] b=new Button[16];
    int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);


    b[0]=(Button) findViewById(R.id.clacButtonNum0);
        b[1]=(Button) findViewById(R.id.clacButtonNum1);
        b[2]=(Button) findViewById(R.id.clacButtonNum2);
        b[3]=(Button) findViewById(R.id.clacButtonNum3);
   b[4]=(Button) findViewById(R.id.clacButtonNum4);
        b[5]=(Button) findViewById(R.id.clacButtonNum5);
        b[6]=(Button) findViewById(R.id.clacButtonNum6);
        b[7]=(Button) findViewById(R.id.clacButtonNum7);
        b[8]=(Button) findViewById(R.id.clacButtonNum8);
        b[9]=(Button) findViewById(R.id.clacButtonNum9);

      b[10]=(Button) findViewById(R.id.clacButton1);
        b[11]=(Button) findViewById(R.id.clacButton2);
        b[12]=(Button) findViewById(R.id.clacButton3);
        b[13]=(Button) findViewById(R.id.clacButton4);;
        b[14]=(Button) findViewById(R.id.clacButton5);
        b[15]=(Button) findViewById(R.id.clacButton6);




    }

    public  void onClick(View v){
        TextView textView1=(TextView) findViewById(R.id.clacTextView1);
       TextView textView2=(TextView) findViewById(R.id.clacTextView2);
         TextView textView3=(TextView) findViewById(R.id.clacTextView3);
        String str="";
        str=v.toString();
        if(v.getId()==R.id.clacButtonNum0){
            if(a>0){
            textView3.setText(str);
            }else{
                textView1.setText(str);
            }

        }else if(v.getId()==R.id.clacButtonNum1){
            if(a>0){
                textView3.setText(str);
            }else{
                textView1.setText(str);
            }

        }else if(v.getId()==R.id.clacButtonNum2){
            if(a>0){
                textView3.setText(str);
            }else{
                textView1.setText(str);
            }

        }else if(v.getId()==R.id.clacButtonNum3){
            if(a>0){
                textView3.setText(str);
            }else{
                textView1.setText(str);
            }

        }else if(v.getId()==R.id.clacButtonNum4){
            if(a>0){
                textView3.setText(str);
            }else{
                textView1.setText(str);
            }

        }else if(v.getId()==R.id.clacButtonNum5){
            if(a>0){
                textView3.setText(str);
            }else{
                textView1.setText(str);
            }

        }else if(v.getId()==R.id.clacButtonNum6){
            if(a>0){
                textView3.setText(str);
            }else{
                textView1.setText(str);
            }

        }else if(v.getId()==R.id.clacButtonNum7){
            if(a>0){
                textView3.setText(str);
            }else{
                textView1.setText(str);
            }

        }else if(v.getId()==R.id.clacButtonNum8){
            if(a>0){
                textView3.setText(str);
            }else{
                textView1.setText(str);
            }

        }else if(v.getId()==R.id.clacButtonNum9){
            if(a>0){
                textView3.setText(str);
            }else{
                textView1.setText(str);
            }

        }else if(v.getId()==R.id.clacButtonNum1){
            if(a>0){
                textView3.setText(str);
            }else{
                textView1.setText(str);
            }

        }else if(v.getId()==R.id.clacButtonNum1){
            if(a>0){
                textView3.setText(str);
            }else{
                textView1.setText(str);
            }

        }else if(v.getId()==R.id.clacButton1&&textView1.getText().toString()!=null){
            a++;
            textView2.setText(str);
        }else if(v.getId()==R.id.clacButton2&&textView1.getText().toString()!=null){
            a++;
            textView2.setText(str);
        }else if(v.getId()==R.id.clacButton3&&textView1.getText().toString()!=null){
            a++;
            textView2.setText(str);
        }else if(v.getId()==R.id.clacButton4&&textView1.getText().toString()!=null){
            a++;
            textView2.setText(str);
        }else if(v.getId()==R.id.clacButton5){
            a=0;

            textView1.setText("");
            textView2.setText("");
            textView3.setText("");


        }else if(v.getId()==R.id.clacButton6){

        }


    }
}
