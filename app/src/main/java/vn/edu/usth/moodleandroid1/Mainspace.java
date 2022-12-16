package vn.edu.usth.moodleandroid1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Mainspace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainspace1);


        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Profile");
        list.add("Document");



        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    //clicked Profile

                    startActivity(new Intent(Mainspace.this,Profile.class));

                }else if(position==1){
                    //clicked Document
                    startActivity(new Intent(Mainspace.this,Document.class));
                }else{

                }
            }
        });


    }
}