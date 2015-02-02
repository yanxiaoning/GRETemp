package com.ningo.gk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

import com.gfan.sdk.statitistics.GFAgent;

public class MLWordPage extends Activity{
	private TextView tvUp;
	private TextView tvDown;
	
	private int tablePosition;
	private int pinTablePosition;
	private String strTitle;
	private String source;
	private String from;
	

	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        Bundle bundle=this.getIntent().getExtras();
        String parameterWord=bundle.getString("parameterWord");
        String parameterChinese=bundle.getString("parameterChinese");
        String parameterPos=bundle.getString("parameterPos");
        
        
        tablePosition=bundle.getInt("tablePosition");
        pinTablePosition=bundle.getInt("pinTablePosition");
        strTitle=bundle.getString("strTitle");
        source=bundle.getString("source");
        from=bundle.getString("from");
        setContentView(R.layout.shw);
        
        
        
        tvUp=(TextView)findViewById(R.id.tvword);
        tvDown=(TextView)findViewById(R.id.tvtrans);
        
        
        tvUp.setText(parameterWord);
        tvDown.setText(parameterPos+" "+parameterChinese);
        
        
        
	}
	





	
public boolean onKeyDown(int keyCode, KeyEvent event) {

		

		//按下键盘上返回按钮

		if(keyCode == KeyEvent.KEYCODE_BACK){
			
		

			Intent intent=new Intent();

			intent.setClass(MLWordPage.this, Mid_level_ClearUp.class);
		Bundle bundle=new Bundle();
		
		
		
		bundle.putInt("tablePosition", tablePosition);
		bundle.putInt("pinTablePosition", pinTablePosition);
		bundle.putString("strTitle", strTitle);
		bundle.putString("source", source);
		bundle.putString("from", from);
		intent.putExtras(bundle);
			startActivity(intent);
			finish();

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
