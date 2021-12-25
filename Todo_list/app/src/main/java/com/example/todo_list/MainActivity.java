package com.example.todo_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> items;
    ArrayAdapter<String> Adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        items=new ArrayList<>();
    }
    public void click(View v)
    {
        EditText editText=findViewById(R.id.editTextTextPersonName);
        ListView listView=findViewById(R.id.listview);
        items.add(editText.getText().toString());
        Adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);
        listView.setAdapter(Adapter);
    }
}