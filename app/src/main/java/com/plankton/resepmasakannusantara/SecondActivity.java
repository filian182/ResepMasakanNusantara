package com.plankton.resepmasakannusantara;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.plankton.resepmasakannusantara.R.array.DaftarMasakan;

public class SecondActivity extends AppCompatActivity {

    public ListView ListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarDaftar);
        toolbar.setTitle(getResources().getString(R.string.app_name2));


        ListView = (ListView) findViewById(R.id.Listview);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<>(SecondActivity.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(DaftarMasakan));

        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("CatagoryName", ListView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });
        ListView.setAdapter(mAdapter);
    }
}
