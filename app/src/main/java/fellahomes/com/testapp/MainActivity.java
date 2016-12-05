package fellahomes.com.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList arrayList = new ArrayList();
        arrayList.add("item 1");
        arrayList.add("item 2");
        arrayList.add("item 3");
        arrayList.add("item 4");
        arrayList.add("item 5");
        arrayList.add("item 6");
        arrayList.add("item 7");
        arrayList.add("item 8");
        arrayList.add("item 9");
        arrayList.add("item 10");
        arrayList.add("item 11");
        arrayList.add("item 12");
        arrayList.add("item 13");
        arrayList.add("item 14");
        arrayList.add("item 15");
        arrayList.add("item 16");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.expandable_list_content, arrayList);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(arrayAdapter);
    }
}
