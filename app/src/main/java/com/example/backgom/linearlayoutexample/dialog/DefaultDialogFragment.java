package com.example.backgom.linearlayoutexample.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

import com.example.backgom.linearlayoutexample.R;

/**
 * Created by Coupang on 2016-01-19.
 */
public class DefaultDialogFragment extends AppCompatDialogFragment {
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		builder.setMessage(R.string.dialog_fire_missiles)
				.setPositiveButton(R.string.fire, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
					}
				})
				.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
					}
				});
		return builder.create();
	}
}
