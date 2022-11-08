package com.example.aitc_459_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends MainActivity {
    //buttons for the four selections available
    Button selection1, selection2, selection3, selection4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //each selection is found by its unique id
        selection1 = findViewById(R.id.selection1);
        selection2 = findViewById(R.id.selection2);
        selection3 = findViewById(R.id.selection3);
        selection4 = findViewById(R.id.selection4);


        selection1.setOnClickListener(new View.OnClickListener() {
            private Object Selection2Shapes;

            @Override
            public void onClick(View view) {
                //Once the user clicks on the first selection, which is Shapes they'll redirected to that activity.
                Intent intent = new Intent(Home.this, Selection1.class);
                startActivity(intent);

            }
        });

        selection2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Once the user clicks on the second selection, which is colors they'll redirected to that activity.
                Intent intent1 = new Intent(Home.this,Selection2.class);
                startActivity(intent1);
            }
        });

        selection3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                //Once the user clicks on the third selection, which is ABCs they'll redirected to that activity.
                Intent intent1 = new Intent(Home.this, Selection3.class);
                startActivity(intent1);
            }
        });

        selection4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                //Once the user clicks on the third selection, which is ABCs they'll redirected to that activity.
                Intent intent1 = new Intent(Home.this, Selection4.class);
                startActivity(intent1);
            }
        });

    }
}



