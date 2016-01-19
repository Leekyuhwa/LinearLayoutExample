package com.example.backgom.linearlayoutexample;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDialogFragment;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.backgom.linearlayoutexample.dialog.ArrayDialogFragment;
import com.example.backgom.linearlayoutexample.dialog.CustomDialogFragment;
import com.example.backgom.linearlayoutexample.dialog.DefaultDialogFragment;
import com.example.backgom.linearlayoutexample.dialog.MultiDialogFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

	private TextView defulatDialogTextView;
	private TextView arrayDialogTextView;
	private TextView multiDialogTextView;
	private TextView customDialogTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		initializeView();
		initializeEvent();
	}

	private void initializeEvent() {
		this.defulatDialogTextView.setOnClickListener(this);
		this.arrayDialogTextView.setOnClickListener(this);
		this.multiDialogTextView.setOnClickListener(this);
		this.customDialogTextView.setOnClickListener(this);
	}

	private void initializeView() {
		this.defulatDialogTextView = (TextView) findViewById(R.id.default_dialog_text);
		this.arrayDialogTextView = (TextView) findViewById(R.id.array_dialog_text);
		this.multiDialogTextView = (TextView) findViewById(R.id.multi_dialog_text);
		this.customDialogTextView = (TextView) findViewById(R.id.custom_dialog_text);
	}

	@Override
	public void onClick(View v) {
		FragmentManager fm = getSupportFragmentManager();
		AppCompatDialogFragment dialogFragment = null;
		switch (v.getId()) {
			case R.id.default_dialog_text :
				dialogFragment = new DefaultDialogFragment();
				break;
			case R.id.array_dialog_text :
				dialogFragment = new ArrayDialogFragment();
				break;
			case R.id.multi_dialog_text :
				dialogFragment = new MultiDialogFragment();
				break;
			case R.id.custom_dialog_text :
				dialogFragment = new CustomDialogFragment();
				break;
		}

		if (dialogFragment != null) {
			dialogFragment.show(fm, "defaultDialogFragmentTag");
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

}
