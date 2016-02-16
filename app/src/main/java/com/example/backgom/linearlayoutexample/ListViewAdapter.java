package com.example.backgom.linearlayoutexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by coupang on 2016. 2. 16..
 */
public class ListViewAdapter extends BaseAdapter {

	private Context context;
	private List<String> titleList;

	public ListViewAdapter(Context context, List<String> titleList) {
		this.context = context;
		this.titleList = titleList;
	}

	@Override
	public int getCount() {
		return titleList.size();
	}

	@Override
	public Object getItem(int position) {
		return titleList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		if (convertView == null) {
			convertView = LayoutInflater.from(context).inflate(R.layout.item_listview, null);
		}

		TextView textView = (TextView) convertView.findViewById(R.id.textview);
		ImageView imageView = (ImageView) convertView.findViewById(R.id.imageview);

		textView.setText(titleList.get(position));
		imageView.setBackgroundResource(R.mipmap.listview_item_image);

		return convertView;
	}
}
