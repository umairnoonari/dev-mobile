package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<UserData> arrayList=new ArrayList<>();
        arrayList.add(new UserData(R.drawable.pic1,"Umair","umair@gmail.com","03142836313"));
        arrayList.add(new UserData(R.drawable.pic2,"Tahir","tahir@gmail.com","03142344323"));
        arrayList.add(new UserData(R.drawable.pic3,"Reha","reha@gmail.com","03131434323"));
        arrayList.add(new UserData(R.drawable.pic4,"Yasir","yasir@gmail.com","03334232343"));
        arrayList.add(new UserData(R.drawable.pic5,"Umaira","umaira@gmail.com","03043434555"));
        arrayList.add(new UserData(R.drawable.pic6,"Haleema","haleema@gmail.com","03032349493"));
        arrayList.add(new UserData(R.drawable.pic7,"Zubair","Zubair@gmail.com","03339483948"));
        list=arrayList;
        Adapter adapter=new Adapter(this,R.layout.list_view,list);
        listView=findViewById(R.id.listview1);
        listView.setAdapter(adapter);
    }
}