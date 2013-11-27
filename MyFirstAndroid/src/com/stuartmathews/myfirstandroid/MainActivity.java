package com.stuartmathews.myfirstandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the layout to the "activity_main" layout. See that layout to see
        // how this activity will look like.
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    public void onClick(View view )
    {
    	switch( view.getId())
    	{
    	case R.id.button1:
    		String theMessage = getApplicationContext().getString(R.string.HelloMessage);
    		Toast.makeText(getApplicationContext(), theMessage, Toast.LENGTH_SHORT).show();
    		break;
    	}
    }
    
}
