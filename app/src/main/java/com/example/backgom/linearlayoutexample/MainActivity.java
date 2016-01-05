package com.example.backgom.linearlayoutexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	private TextView nameTextView;
	private TextView ageTextView;
	private TextView majorTextView;
	private EditText nameEditText;
	private EditText ageEditText;
	private EditText majorEditText;

	private FloatingActionButton fab;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		initializeViews();


		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

			}
		});

	}

	private void initializeViews() {
		nameTextView = (TextView) findViewById(R.id.name_text);
		ageTextView = (TextView) findViewById(R.id.age_text);
		majorTextView = (TextView) findViewById(R.id.major_text);
		nameEditText = (EditText) findViewById(R.id.name_edit);
		ageEditText = (EditText) findViewById(R.id.age_edit);
		majorEditText = (EditText) findViewById(R.id.major_edit);

		fab = (FloatingActionButton) findViewById(R.id.fab);
	}

}
