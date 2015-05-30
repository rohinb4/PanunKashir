package com.example.akhil.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


//import static com.example.akhil.myapplication.R.drawable.shailputri;

public class MyListActivity extends ListActivity {
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] values = new String[]{"The Shrine of Shailputri", "temple2", "temple3",
                "temple4"};
        int[] image = new int[]{R.drawable.shailputri, R.drawable.shailputri, R.drawable.shailputri, R.drawable.shailputri};
        // use your custom layout

        setListAdapter(new ArrayAdapter<String>(MyListActivity.this, android.R.layout.simple_list_item_1, values));
        List<HashMap<String, String>> listinfo = new ArrayList<HashMap<String, String>>();
        listinfo.clear();
        for (int i = 0; i < 4; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("name", values[i]);
            hm.put("image", Integer.toString(image[i]));
            listinfo.add(hm);
        }

        // Keys used in Hashmap
        String[] from = {"image", "name"};
        int[] to = {R.id.icon, R.id.label};
        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), listinfo, R.layout.rowlayout, from, to);
        // ListView mylist = (ListView) findViewById(R.id.);
        //mylist.setAdapter(adapter);


        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                R.layout.rowlayout, R.id.label, values);
        setListAdapter(adapter1);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
        Intent i;
        switch (position) {

            case 0:
                i = new Intent(getApplicationContext(), Temple1.class);
                startActivity(i);
                break;

            case 1:
                i = new Intent(getApplicationContext(), Temple1.class);
                startActivity(i);
                break;

            default:
                break;

        }


    }
}