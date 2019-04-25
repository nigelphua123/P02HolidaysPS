package sg.edu.rp.c346.p02holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tv;
    ArrayAdapter aa;
    ArrayList<Day> day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        lv = findViewById(R.id.lvDays);
        tv = findViewById(R.id.tvDays);

        day = new ArrayList<Day>();

        Intent i = getIntent();
        String type = i.getStringExtra("type");
        tv.setText(type);

        day.add(new Day("New Year's Day", "1 Jan 2017", true, "Secular"));
        day.add(new Day("Labour Day", "1 May 2017", false, "Secular"));
        aa = new DayAdapter(this, R.layout.row, day);
        lv.setAdapter(aa);
    }
}
