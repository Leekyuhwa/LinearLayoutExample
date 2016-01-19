package com.example.backgom.linearlayoutexample.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

import com.example.backgom.linearlayoutexample.R;

import java.util.ArrayList;

public class MultiDialogFragment extends AppCompatDialogFragment {

	private ArrayList mSelectedItems;

	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		mSelectedItems = new ArrayList(); // Where we track the selected items
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		builder.setTitle(R.string.pick_toppings)
			.setMultiChoiceItems(R.array.toppings, null,
				new DialogInterface.OnMultiChoiceClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which,
						boolean isChecked) {
						if (isChecked) {
							mSelectedItems.add(which);
						} else if (mSelectedItems.contains(which)) {
							mSelectedItems.remove(Integer.valueOf(which));
						}
					}
				})
			.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int id) {
				}
			})
			.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int id) {
				}
			});

		return builder.create();
	}
}
