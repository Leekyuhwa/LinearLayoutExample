package com.example.backgom.linearlayoutexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

	final String TAG = "States";

	/**
	 * @param savedInstanceState
	 * 엑티비티가 생성될때 호출 되면서 사용자 인터페이스 초기화
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		Log.d(TAG, "MainActivity: onCreate()");
	}

	/**
	 * 엑티비티가 사용자에게 보여지기 바로 직전에 호출
	 */
	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TAG, "MainActivity: onStart()");
	}


	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(TAG, "MainActivity: onRestart()");
	}

	/**
	 * 엑티비티가 사용자와 상호작용 하기 바로 직전에 호출
	 */
	@Override
	protected void onResume() {
		super.onResume();
		Log.d(TAG, "MainActivity: onResume()");
	}

	/**
	 * 다른 엑티비티가 보여질 때 호출
	 * 데이터 저장, 스레드 중지 등 처리하기 적당함
	 */
	@Override
	protected void onPause() {
		super.onPause();
		Log.d(TAG, "MainActivity: onPause()");
	}

	/**
	 * 엑티비티가 더이상 사용자에게 보여지지 않을 때 호출
	 * 메모리가 부족할 경우 호출이 안될 수도 있음
	 */
	@Override
	protected void onStop() {
		super.onStop();
		Log.d(TAG, "MainActivity: onStop()");
	}

	/**
	 * 엑티비티가 소멸 될떄 호출
	 * finish() 메서드 호출하거나 시스템 메모리 확보를 위해 메모리에서 엑티비티 제거 할 때 호출
	 */
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "MainActivity: onDestroy()");
	}
}
