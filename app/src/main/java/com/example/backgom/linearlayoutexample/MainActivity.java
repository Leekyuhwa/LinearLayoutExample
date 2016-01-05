package com.example.backgom.linearlayoutexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	private TextView nameTextView;
	private TextView ageTextView;
	private TextView majorTextView;
	private TextView resulatTextView;
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
				String name = nameEditText.getText().toString();
				String age = ageEditText.getText().toString();
				String major = majorEditText.getText().toString();

				if (validationCheck(name, age, major)) {
					resulatTextView.setText(name + age + major);
				}
			}
		});

	}

	private void initializeViews() {
		nameTextView = (TextView) findViewById(R.id.name_text);
		ageTextView = (TextView) findViewById(R.id.age_text);
		majorTextView = (TextView) findViewById(R.id.major_text);
		resulatTextView = (TextView) findViewById(R.id.result_text);
		nameEditText = (EditText) findViewById(R.id.name_edit);
		ageEditText = (EditText) findViewById(R.id.age_edit);
		majorEditText = (EditText) findViewById(R.id.major_edit);

		fab = (FloatingActionButton) findViewById(R.id.fab);
	}

	private boolean validationCheck(String name, String age, String major) {

		if (emptyString(name)) {
			showToastPopup(nameTextView.getText().toString());
			return false;
		}

		if (emptyString(age)) {
			showToastPopup(ageTextView.getText().toString());
			return false;
		}

		if (emptyString(major)) {
			showToastPopup(majorTextView.getText().toString());
			return false;
		}

		return true;
	}

	private boolean emptyString(String value) {
		if (value == null) {
			return true;
		}

		if ("".equals(value)) {
			return true;
		}

		return false;

	}

	private void showToastPopup(String message) {
		Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
	}

}
