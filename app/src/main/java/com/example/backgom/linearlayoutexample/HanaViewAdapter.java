package com.example.backgom.linearlayoutexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by coupang on 2016. 2. 16..
 */
public class HanaViewAdapter extends BaseAdapter {

	private Context context;
	private List<String> hanaStringList;

	public HanaViewAdapter(Context context, List<String> hanaStringList) {
		this.context = context;
		this.hanaStringList = hanaStringList;
	}

	@Override
	public int getCount() {
		if (hanaStringList.size() > 10) {
			return hanaStringList.size() - 8;
		}
		return 0;
	}

	@Override
	public Object getItem(int position) {
		return hanaStringList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = LayoutInflater.from(context).inflate(R.layout.item_hana_listview, null);
		}
		TextView textView = (TextView) convertView.findViewById(R.id.hana_textview);
		textView.setText(hanaStringList.get(position));

		return convertView;
	}
}
