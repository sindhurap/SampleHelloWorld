package com.paradigmcreatives.samplegitpractise;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SampleGitPractiseActivity extends Activity {

	private Button show_Dialog;

	/** Called when the activity is first created. */
	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		show_Dialog = (Button) findViewById(R.id.showDialog);
		show_Dialog.setOnClickListener(new OnClickListener() {

			@Override

			public void onClick (View v) {
				final Dialog dialog = new Dialog(SampleGitPractiseActivity.this);
				LayoutInflater inflater = (LayoutInflater) SampleGitPractiseActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				View hello_dialog = inflater.inflate(R.layout.helloworld, null);
				Button ok_button = (Button) hello_dialog.findViewById(R.id.ok_message_button);
				ok_button.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick (View v) {
						dialog.dismiss();
					}
				});
				dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
				dialog.setContentView(hello_dialog);
				dialog.show();

			}

		});
	}
}