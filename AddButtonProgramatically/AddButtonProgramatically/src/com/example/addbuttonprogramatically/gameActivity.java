package com.example.addbuttonprogramatically;

import java.util.Random;

import android.os.Bundle;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.support.v4.app.NavUtils;
import android.text.Layout;

public class gameActivity extends Activity implements OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setBackgroundColor(Color.BLACK);
        linearLayout.setPadding(5, 5, 5, 5);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        int buttonNumber = 0;
        
        for(int i=0 ; i < 8 ; ++i)
        {
        	
        	LinearLayout innerLinearLayout = new LinearLayout(this);
        	innerLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        	//innerLinearLayout.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
        	
        	for(int j = 0 ; j < 6 ; ++j)
        	{
        		
        		++buttonNumber;
        		Button button = new Button(this);
        		button.setOnClickListener(this);
        		button.setHeight(10);
        		button.setWidth(10);
        		button.setBackgroundResource(R.drawable.magenda);
        		button.setText("" + buttonNumber);
        		button.setId(buttonNumber);
        		innerLinearLayout.addView(button);
        		
        	}
        	
        	linearLayout.addView(innerLinearLayout);
        	
        }
        
        setContentView(linearLayout);
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	public void onClick(View v) {
		
		Log.d("CLICKED ON BUTTON ID", String.valueOf(v.getId()));
		v.setBackgroundResource(R.drawable.blueball);
	}

    
}
