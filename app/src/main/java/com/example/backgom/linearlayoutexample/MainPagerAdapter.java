package com.example.backgom.linearlayoutexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Coupang on 2016-03-22.
 */
public class MainPagerAdapter extends FragmentPagerAdapter {

	private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3", "Tab4", "Tab5" };

	public MainPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		// 해당하는 page의 Fragment를 생성합니다.
		return PagerFragment.create(position);
	}

	@Override
	public int getCount() {
		return 5;  // 총 5개의 page를 보여줍니다.
	}

	@Override
	public CharSequence getPageTitle(int position) {
		// Generate title based on item position
		return tabTitles[position];
	}
}
