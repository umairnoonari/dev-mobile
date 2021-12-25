package com.example.contacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter extends ArrayAdapter<UserData> {
    int Resource;
    Context context;
    List<UserData> list=null;
    public Adapter(Context context,int Resource,List<UserData> list)
    {
        super(context,Resource,list);
        this.Resource=Resource;
        this.context=context;
        this.list=list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v= LayoutInflater.from(context).inflate(R.layout.list_view,null);
        ImageView imageView=v.findViewById(R.id.imageView2);
        TextView textView1=v.findViewById(R.id.textView3);
        TextView textView2=v.findViewById(R.id.textView4);
        TextView textView3=v.findViewById(R.id.textView5);
        UserData user=list.get(position);
        imageView.setImageResource(user.getpic());
        textView1.setText(user.getUname());
        textView2.setText(user.getEmail());
        textView3.setText(user.getnum());
        return v;
    }
}
