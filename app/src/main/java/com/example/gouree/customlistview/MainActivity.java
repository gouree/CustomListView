package com.example.gouree.customlistview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    ListView ls;

    //names that appear on the text view
    String[] names=
            {"Gouree","Vihaan","Vidhi","Sanket","Sonam","nilam","jhelam","wani"};

    //contact numbers appearing on text view
    String[] contacts =
            {
                    "98498595",
                    "83748784",
                    "837483787",
                    "34777488",
                    "7873888394",
                    "7763767377",
                    "653666",
                    "677677676"
            };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //list view object
        ls= (ListView) findViewById(R.id.list_view);

        //adapters
        Adapter adapter = new Adapter(this,names,contacts);

        ls.setAdapter(adapter);


        //Events

        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "clicked -->" +names[position]+"\nnumber -->"+contacts[position], Toast.LENGTH_LONG).show();
            }
        });

    }
}
