package sg.edu.rp.c346.id18015518.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;
    Button btnClear;
    ListView lvTask;
    ArrayList<String> tasks;
    EditText etTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.buttonAdd);
        btnClear = findViewById(R.id.buttonClear);
        lvTask = findViewById(R.id.listViewTask);
        etTask = findViewById(R.id.editTextTask);

        tasks = new ArrayList<String>();

        final ArrayAdapter aaTask = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tasks);
        lvTask.setAdapter(aaTask);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String colour = etTask.getText().toString();
                tasks.add(colour);
                aaTask.notifyDataSetChanged();

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tasks.clear();
            }
        });


    }
}
