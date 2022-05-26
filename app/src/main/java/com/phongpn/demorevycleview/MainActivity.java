package com.phongpn.demorevycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private Adapter adapter;
    private List<Integer> pepes = Arrays.asList(R.drawable.haha, R.drawable.hihi, R.drawable.hoho, R.drawable.hiuhiu,
            R.drawable.haha, R.drawable.hihi, R.drawable.hoho, R.drawable.hiuhiu, R.drawable.haha, R.drawable.hihi,
            R.drawable.hoho, R.drawable.hiuhiu, R.drawable.haha, R.drawable.hihi, R.drawable.hoho, R.drawable.hiuhiu,
            R.drawable.haha, R.drawable.hihi, R.drawable.hoho, R.drawable.hiuhiu);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new Adapter(pepes, new ImageViewHolder.OnClickImage() {
            @Override
            public void onClick(int id) {
                showPepeAsFragment(id);
            }
        });
        rv = findViewById(R.id.recycleview);
        rv.setLayoutManager(new GridLayoutManager(this, 3));
        rv.setAdapter(adapter);
    }

    private void showPepeAsFragment(int id) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_activity, new ImageFragment(id), null)
                .commit();
    }
}