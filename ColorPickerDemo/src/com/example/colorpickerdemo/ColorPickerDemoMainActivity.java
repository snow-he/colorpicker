package com.example.colorpickerdemo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ColorPickerDemoMainActivity extends Activity {
	private colorpicker bdialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainlayout);
		Button bt = (Button)findViewById(R.id.choosebt);
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				init();	
			}
		});


	}
	public void init(){

		bdialog = new colorpicker(this, Color.rgb(190, 52, 225), getResources().getString(
				R.string.dialogtitle),
				new colorpicker.OnColorChangedListener() {

					public void colorChanged(int color) {
					}
				});
		bdialog.setTitle(R.string.dialogtitle);
		bdialog.show();
	}
}
