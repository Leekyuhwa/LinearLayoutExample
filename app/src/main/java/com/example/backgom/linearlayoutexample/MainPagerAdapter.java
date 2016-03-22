package com.example.backgom.linearlayoutexample;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Coupang on 2016-03-22.
 */
public class MainPagerAdapter extends PagerAdapter {

	private Context mContext;
	private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3", "Tab4", "Tab5" };

	public MainPagerAdapter(Context context) {
		mContext = context;
	}

	/** instantiateItem() : ViewPager에서 사용할 뷰객체 생성 및 등록 한다. */
	@Override
	public Object instantiateItem(ViewGroup collection, int position) {
		LayoutInflater inflater = LayoutInflater.from(mContext);
		RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.fragment_page, collection, false);
		TextView textview = (TextView) layout.findViewById(R.id.number);
		textview.setText(String.valueOf(position));
		collection.addView(layout);
		return layout;
	}

	/** destroyItem() : View 객체를 삭제 한다. */
	@Override
	public void destroyItem(ViewGroup collection, int position, Object view) {
		collection.removeView((View) view);
	}

	/** getCount() : 현재 PagerAdapter에서 관리할 갯수를 반환 한다. */
	@Override
	public int getCount() {
		return 5;
	}

	/** isViewFromObject() : instantiateItem메소드에서 생성한 객체를 이용할 것인지 여부를 반환 한다. */
	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view == object;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return tabTitles[position];
	}

	/**
	 * restoreState() : saveState() 상태에서 저장했던 Adapter와 page를 복구 한다.
	 * saveState()  : 현재 UI 상태를 저장하기 위해 Adapter와 Page 관련 인스턴스 상태를 저장 합니다.
	 * startUpdate() : 페이지 변경이 시작될때 호출 됩니다.
	 * finishUpdate() : 페이지 변경이 완료되었을때 호출 됩니다.
	 * */
}
