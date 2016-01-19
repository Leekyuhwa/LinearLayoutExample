package com.example.backgom.linearlayoutexample.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;

import com.example.backgom.linearlayoutexample.R;

/**
 * Created by Coupang on 2016-01-19.
 */
public class CustomDialogFragment extends AppCompatDialogFragment {
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		// Get the layout inflater
		LayoutInflater inflater = getActivity().getLayoutInflater();

		// Inflate and set the layout for the dialog
		// Pass null as the parent view because its going in the dialog layout
		builder.setView(inflater.inflate(R.layout.dialog_signin, null))
				// Add action buttons
				.setPositiveButton(R.string.signin, new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int id) {
						// sign in the user ...
					}
				})
				.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						CustomDialogFragment.this.getDialog().cancel();
					}
				});
		return builder.create();
	}

}
