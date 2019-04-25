package sg.edu.rp.c346.p02holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvType;
    ArrayList<String> alHoliday;
    ArrayAdapter<String> aaHoliday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvType = findViewById(R.id.lvType);


        alHoliday = new ArrayList<String>();
        alHoliday.add("Secular");
        aaHoliday = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, alHoliday);
        lvType.setAdapter(aaHoliday);
        lvType.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedType = alHoliday.get(position);

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("type", selectedType);
                startActivity(i);
            }
        });
    }


}
