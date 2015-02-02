package com.ningo.gk;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;

import com.gfan.sdk.statitistics.GFAgent;

public class NavigatePage extends Activity implements OnClickListener{
	private ImageView ivLists;

	
	private ImageView ivLog;
	
	private ImageView ivSearchView;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        
        
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        
        
     
        
       
        		setContentView(R.layout.navigate);
        		
        		ivLists=(ImageView)findViewById(R.id.imageView3);
        		
        		
        		ivLog=(ImageView)findViewById(R.id.imageView1);
        		ivSearchView=(ImageView)findViewById(R.id.imageView2);
       	
        		
        		ivLists.setOnClickListener(this);
        	
        		ivLog.setOnClickListener(this);
        		
        		
        		ivSearchView.setOnClickListener(this);
        
    }
    
    public void onClick(View v)
    {
    	if(v.equals(ivLists))
    	{
    		Intent intent=new  Intent();
			intent.setClass(NavigatePage.this, MainPage.class);
			startActivity(intent);
			finish();
    	}
 
    	else if(v.equals(ivLog))
    	{
    		
    		
   	    		Intent intent=new  Intent();
   				intent.setClass(NavigatePage.this, LogView.class);
   				startActivity(intent);
   				finish();
   	    	
   	     
   	     
    		
    		
    		
    		
    	}
    	else if(v.equals(ivSearchView))
    	{
    		
    		
   	    		Intent intent=new  Intent();
   				intent.setClass(NavigatePage.this, WordSearchActivity.class);
   				startActivity(intent);
   				finish();
   	    	
   	     
   	     
    		
    		
    		
    		
    	}
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    
    if(keyCode == KeyEvent.KEYCODE_BACK){
		
    	
    	
    	  AlertDialog.Builder builder = new Builder(this);
builder.setMessage("确认退出吗？");
builder.setTitle("提示");
builder.setPositiveButton("确认", new DialogInterface.OnClickListener() {
 
public void onClick(DialogInterface dialog, int which) {
dialog.dismiss();
android.os.Process.killProcess(android.os.Process.myPid());//获取PID
}
});
builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
   
 public void onClick(DialogInterface dialog, int which) {
 dialog.dismiss();
}
});
 builder.create().show();


	

		return true;

	}else{		

		return super.onKeyDown(keyCode, event);

	}

}
    
    
 

   



    
    @Override
    protected void onResume (){
   super.onResume();
   GFAgent.onResume (this);
   }
  
   @Override
   protected void onPause(){
   super.onPause();
   GFAgent.onPause(this);
   }
}
