package com.example.backgom.linearlayoutexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

	private ListView listView;
	private FloatingActionButton fab;
	private boolean flag = true;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		setDataInit();

		fab = (FloatingActionButton) findViewById(R.id.fab);
		listView = (ListView) findViewById(R.id.listview);
		final ListViewAdapter adapter = new ListViewAdapter(this, setDataInit());
		final HanaViewAdapter adapter1 = new HanaViewAdapter(this, setDataInit());

		listView.setAdapter(adapter);

		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				if (listView.getAdapter() == null) {
					return;
				}

				if (flag) {
					listView.setAdapter(adapter1);
					flag = false;

				} else {
					listView.setAdapter(adapter);
					flag = true;
				}

			}
		});

	}

	public List<String> setDataInit() {
		List<String> titleList = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			titleList.add("하나 바보" + i);
		}
		return titleList;
	}

}