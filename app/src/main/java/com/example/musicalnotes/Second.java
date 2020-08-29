package com.example.musicalnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class Second extends AppCompatActivity {

    EditText editText;
    Button button;

    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final List<String> list = Arrays.asList("-sa","-re","-ga","-ma","-pa","-dha","=-sa","-ni","sa","re","ga","ma","pa","dha","=sa","ni","+sa","+ra","+ga","+ma","+pa","+dha","=+sa","+ni");
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.btn);
        res = findViewById(R.id.res);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = String.valueOf(editText.getText());
                String str =str1.toLowerCase();
                if(str==null)
                {
                    Toast.makeText(Second.this, "Enter Musical Notes", Toast.LENGTH_SHORT).show();
                }
                else{
                    String[] val = str.split(" ");
                    String result = "";
                    for(String w:val)
                    {
                        int index = list.indexOf(w)+1;
                        if(index==0)
                        {
                            result = result+"- ";
                        }
                        else {
                            result = result + index + " ";
                        }
                    }
                    res.setVisibility(View.VISIBLE);
                    res.setText(result);
                }
            }
        });



    }
    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}