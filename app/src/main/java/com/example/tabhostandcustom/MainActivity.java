package com.example.tabhostandcustom;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TabHost tabHost;
    ListView lvHistory;
    EditText inputA, inputB;
    TextView output_KQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        addEvents();
    }
    private void addControl() {
        lvHistory = findViewById(R.id.lvRauCu);
        inputA = findViewById(R.id.edtSoA);
        inputB = findViewById(R.id.edtSoB);
        tabHost = findViewById(R.id.tabhost);
        tabHost.setup();
        createTab();
    }
    //tạo tab đầu tiên
    private void createTab() {
        TabHost.TabSpec tabSpec1;
        tabSpec1 = tabHost.newTabSpec("Tab1");
        //gán dữ liệu của tab1 trong tabHost dc tạo và gán ở trên vào tabspec1
        tabSpec1.setContent(R.id.tab1);
        //nội dung của tab
        tabSpec1.setIndicator("Thịt cá");
        tabHost.addTab(tabSpec1);

        //tạo tab thứ 2
        TabHost.TabSpec tabSpec2;
        tabSpec2 = tabHost.newTabSpec("Tab2");
        //gán dữ liệu của tab2 trong tabHost dc tạo và gán ở trên vào tabspec1
        tabSpec2.setContent(R.id.tab2);
        //nội dung của tab
        tabSpec2.setIndicator("Rau củ, quả");
        tabHost.addTab(tabSpec2);

        //tạo tab thứ 3
        TabHost.TabSpec tabSpec3;
        tabSpec3 = tabHost.newTabSpec("Tab3");
        //gán dữ liệu của tab3 trong tabHost dc tạo và gán ở trên vào tabspec1
        tabSpec3.setContent(R.id.tab3);
        //nội dung của tab
        tabSpec3.setIndicator("Điện thoại");
        tabHost.addTab(tabSpec3);
    }

    private void addEvents() {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Tab Selector");
        return super.onCreateOptionsMenu(menu);
    }
}