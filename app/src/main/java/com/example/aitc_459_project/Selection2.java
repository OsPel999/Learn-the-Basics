package com.example.aitc_459_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Selection2<selection2> extends MainActivity {
    //represents the favcolor in the textview where the user inputs
    String favcolor;
    //represents the button bttn
    Button bttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection2);
        //favcolor is found by its unique id
        favcolor = String.valueOf((EditText) findViewById(R.id.favcolor));
        //bttn is found by its unique id
        bttn = (Button) findViewById(R.id.bttn);

        //When button "click on me" is clicked, the user will see a message.
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Selection2.this, "Now I know what your favorite color is ", Toast.LENGTH_LONG).show();
            }
        });
    }
}
