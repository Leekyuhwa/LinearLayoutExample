package com.example.backgom.linearlayoutexample.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.util.Log;

import com.example.backgom.linearlayoutexample.R;

/**
 * Created by Coupang on 2016-01-19.
 */
public class ArrayDialogFragment extends AppCompatDialogFragment {
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		builder.setTitle(R.string.array_dialog_title)
				.setItems(R.array.color_array, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						Log.e("---------------", String.valueOf(which));
					}
				});
		return builder.create();
	}
}
