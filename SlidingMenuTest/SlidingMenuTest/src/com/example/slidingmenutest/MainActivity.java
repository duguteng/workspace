package com.example.slidingmenutest;

import com.slidingmenu.lib.SlidingMenu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private SlidingMenu menu;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		menu = new SlidingMenu(this);
		menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		menu.setFadeEnabled(true);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		//menu.setFadeDegree(0.35f);
		menu.setFadeDegree(0.7f);
		menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT | SlidingMenu.SLIDING_WINDOW);
=======
		menu.setFadeDegree(0.35f);
		menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT );
>>>>>>> 55b54867386d8edea72f6f4f0528e9b45a7df700
=======
		menu.setFadeDegree(0.35f);
		menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT );
>>>>>>> 55b54867386d8edea72f6f4f0528e9b45a7df700
=======
		//menu.setFadeDegree(0.35f);
		menu.setFadeDegree(0.7f);
		menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT | SlidingMenu.SLIDING_WINDOW);
>>>>>>> parent of 8efc8cb... left menu framework ok
		menu.setMenu(R.layout.behindview);
		menu.setBehindOffset(300);
		//menu.setAboveOffset(100);
		//menu.setContent(R.layout.activity_main);
		Button btn = (Button)menu.findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,LeftAndRightActivity.class));
			}});
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
			
>>>>>>> 55b54867386d8edea72f6f4f0528e9b45a7df700
=======
			
>>>>>>> 55b54867386d8edea72f6f4f0528e9b45a7df700
=======
>>>>>>> parent of 8efc8cb... left menu framework ok
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		super.onStart();
=======
		super.onStart();	
>>>>>>> 55b54867386d8edea72f6f4f0528e9b45a7df700
=======
		super.onStart();	
>>>>>>> 55b54867386d8edea72f6f4f0528e9b45a7df700
=======
		super.onStart();
>>>>>>> parent of 8efc8cb... left menu framework ok
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
