package com.dtrix.listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private String arr[]={"Sambalpur","Chennai","Delhi","Kolkata","Gujurat","Pondicherry","Mahabalipuram","space","mars","venus","jupiter","Saturn","Unranus","Neptune"};
    private TextView mtv1 =null;
    private ArrayAdapter adp1=null;
    private ListView lv1= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1=(ListView)findViewById(R.id.listview);
        mtv1=(TextView)findViewById(R.id.tv1);
        adp1=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr);
        if(lv1!=null){
            lv1.setAdapter(adp1);
        }
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.v("Place",arr[position]);
            }
        });
    }
}
