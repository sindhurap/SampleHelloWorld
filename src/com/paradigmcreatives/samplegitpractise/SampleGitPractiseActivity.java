package com.paradigmcreatives.samplegitpractise;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SampleGitPractiseActivity extends Activity {
	private Button show_Dialog;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		show_Dialog = (Button) findViewById(R.id.showDialog);
		show_Dialog.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(SampleGitPractiseActivity.this,
						"Show Dialog Button Clicked", Toast.LENGTH_SHORT)
						.show();
			}
		});
	}
}