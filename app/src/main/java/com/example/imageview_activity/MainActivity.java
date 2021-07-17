package com.example.imageview_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list_View);
        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        //어디에,어떤형식,어떤자료로
        listView.setAdapter(adapter);

        data.add("리스트뷰");
        data.add("연습"); data.add("리스트뷰");
        data.add("연습"); data.add("리스트뷰");
        data.add("연습"); data.add("리스트뷰");
        data.add("연습"); data.add("리스트뷰");
        data.add("연습"); data.add("리스트뷰");
        data.add("연습"); data.add("리스트뷰");
        data.add("연습"); data.add("리스트뷰");
        data.add("연습"); data.add("리스트뷰");
        data.add("연습"); data.add("리스트뷰");
        data.add("연습"); data.add("리스트뷰");
        data.add("연습"); data.add("리스트뷰");
        data.add("연습"); data.add("리스트뷰");
        data.add("연습"); data.add("리스트뷰");
        data.add("연습"); data.add("리스트뷰");
        data.add("연습"); data.add("리스트뷰");
        data.add("연습"); data.add("리스트뷰");
        data.add("연습"); data.add("리스트뷰");
        data.add("연습");
        adapter.notifyDataSetChanged();//데이터 변경후에 해줘야 알아먹음
    }
}