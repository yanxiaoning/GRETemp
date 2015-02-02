package com.ningo.gk;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.gfan.sdk.statitistics.GFAgent;

import db.DBParameter;

public class TestPage extends Activity implements OnClickListener ,RadioGroup.OnCheckedChangeListener{
	//创建数据库对象
	static final private int MENU_BACK_TO_MAIN=Menu.FIRST;
	

	
	
	
	private MySQLiteOpenHelper mydb=null;
	private Cursor cWord;
	
	//为数据库对象准备参数(版本，表名，域名，字段类型)
	private int version=DBParameter.version;
	private String tables[]=DBParameter.tables;
	private String fieldNames[][]=DBParameter.fieldNames;
	private String fieldTypes[][]=DBParameter.fieldTypes;
	
	//控件
	private Button buttonNext;
	private Button buttonLast;
	private Button buttonDisplayChinese;
	private TextView tvUp;
	private TextView tvDown;
	private RadioGroup rg;
	private RadioButton rb1;
	private RadioButton rb2;
	private RadioButton rb3;
	
	//定位id和行计数器
	private int pinId;
	private int rowCount;
	private int tablePosition;
	private int pinTablePosition;

	private String strTitle;

	private String source;

	
	
	
	
	
	
	
	
		@Override
		public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        
	        Bundle bundle=this.getIntent().getExtras();
	        tablePosition=bundle.getInt("tablePosition");
	        pinTablePosition=bundle.getInt("pinTablePosition");
	        strTitle=bundle.getString("strTitle");
	        source=bundle.getString("source");
	        
	        setContentView(R.layout.tps);
	        
	        mydb=new MySQLiteOpenHelper(this,"mydb",null,version,tables,fieldNames,fieldTypes);
	        
	        tvUp=(TextView)findViewById(R.id.tvword);
	        tvDown=(TextView)findViewById(R.id.tvtrans);
	        
	        rg=(RadioGroup)findViewById(R.id.rg);
	        
	        
	        rb1=(RadioButton)findViewById(R.id.rb1);
	        rb2=(RadioButton)findViewById(R.id.rb2);
	        rb3=(RadioButton)findViewById(R.id.rb3);
	        
	      
	        
	       
	       rg.setOnCheckedChangeListener(this);
	        
	        
	        
	        
	        
	       
	        
	        
	        buttonNext=(Button)findViewById(R.id.btnext);
	        buttonNext.setOnClickListener(this);
	        
	        buttonLast=(Button)findViewById(R.id.btlast);
	        buttonLast.setOnClickListener(this);
	        
	        
	        buttonDisplayChinese=(Button)findViewById(R.id.btDisplayChinese);
	        buttonDisplayChinese.setOnClickListener(this);
	        
	        String[] fIdForWord={"id"};
	        Cursor cRowCount=mydb.select(tables[tablePosition],fIdForWord,"",null,null,null,null);
	        rowCount=cRowCount.getCount();
	        
	        
	        
	        
	        
	        String fPinIdForPin[]={"pinId"};
	        String[] selectionArgsForPin={"1"};
	        Cursor cPin=mydb.select(tables[pinTablePosition],fPinIdForPin,"id=?",selectionArgsForPin,null,null,null);
	        cPin.moveToNext();
	        String pin=cPin.getString(0);
	        pinId=Integer.parseInt(pin);
	        
	        
	        String fWord[]={"id","word","chinese","pos"};
	        String[] selectionArgsWord={pin};
	        cWord=mydb.select(tables[tablePosition],fWord,"id=?",selectionArgsWord,null,null,null);
	        cWord.moveToNext();
	        tvUp.setText(cWord.getString(1));
	     
	        
	    }
		
		public void onClick(View v){
			if(!rb1.isChecked()&&!rb2.isChecked()&&!rb3.isChecked())
			{

				Toast.makeText(getApplicationContext(), "您还没有选择熟识程度",
					     Toast.LENGTH_SHORT).show();
				return;
			}
			
			if(v.equals(buttonNext))
			{
				if(pinId<rowCount)
				{tvDown.setText(null);
					rg.clearCheck();
					rb1.setPressed(false);
					rb2.setPressed(false);
					rb3.setPressed(false);
					
			pinId=pinId+1;
			
			
			String fPin[]={"pinId"};
	        String[] selectionArgsPin={"1"};
	        String strPin=String.valueOf(pinId);
	        String[] valueUpdate={strPin};
	        
	        mydb.update(tables[pinTablePosition],fPin,valueUpdate,"id=?",selectionArgsPin);
	        
	        
	        
	        
	        String fWord[]={"id","word","chinese","pos"};
	        String[] selectionArgsWord={strPin};
	        cWord=mydb.select(tables[tablePosition],fWord,"id=?",selectionArgsWord,null,null,null);
	        cWord.moveToNext();
	        tvUp.setText(cWord.getString(1));
	    
				}
				else 
				{
					Toast.makeText(getApplicationContext(), "已到达该List底端",
						     Toast.LENGTH_SHORT).show();
					return;
				}
			
    		
    	}
			else if(v.equals(buttonLast))
			{
				if(pinId>1)
				{tvDown.setText(null);
					rg.clearCheck();
					rb1.setPressed(false);
				rb2.setPressed(false);
				rb3.setPressed(false);
				
				pinId=pinId-1;
				
				
				String fPin[]={"pinId"};
		        String[] selectionArgsPin={"1"};
		        String strPin=String.valueOf(pinId);
		        String[] valueUpdate={strPin};
		        
		        mydb.update(tables[pinTablePosition],fPin,valueUpdate,"id=?",selectionArgsPin);
		        
		        
		        
		        
		        String fWord[]={"id","word","chinese","pos"};
		        String[] selectionArgsWord={strPin};
		        cWord=mydb.select(tables[tablePosition],fWord,"id=?",selectionArgsWord,null,null,null);
		        cWord.moveToNext();
		        tvUp.setText(cWord.getString(1));
		 
				}
				else
				{   
					
					
					
					Toast.makeText(getApplicationContext(), "已到达该List顶端",
						     Toast.LENGTH_SHORT).show();

					return;
				}
			}
			else if(v.equals(buttonDisplayChinese))
			{
				tvDown.setText(cWord.getString(3)+" "+cWord.getString(2));
			}
		}
		
		
		public void onCheckedChanged(RadioGroup group,int checkedId)
		{
			String[] fWordHN={"hardness"};
			String[] valueUpdate1={"3"};
			String[] valueUpdate2={"2"}; 
			String[] valueUpdate3={"1"}; 
			String[] idFocused={cWord.getString(0)};
			if(checkedId==R.id.rb1)
			{
				mydb.update(tables[tablePosition],fWordHN,valueUpdate1,"id=?",idFocused);
				
			}
			else if(checkedId==R.id.rb2)
			{
				mydb.update(tables[tablePosition],fWordHN,valueUpdate2,"id=?",idFocused);
				
			}
			else if(checkedId==R.id.rb3)
			{
				
				mydb.update(tables[tablePosition],fWordHN,valueUpdate3,"id=?",idFocused);
				
			}
		}
		
		
		
		@Override
		public boolean onCreateOptionsMenu(Menu menu){
			
	         	int idGroup1=0;
	         	
	         	
	         	int orderItem1=Menu.NONE;
	         	
	         	
	         	 
	         	
	         	menu.add(idGroup1,MENU_BACK_TO_MAIN,orderItem1,R.string.str_btm).setIcon(android.R.drawable.ic_menu_add);
	         	
	         	
	         	
	         	return super.onCreateOptionsMenu(menu);
	         
		}
		@Override
		public boolean onMenuItemSelected(int featureId,MenuItem item){
			Intent intent=new  Intent();
	    	
	    	switch(item.getItemId())
	    	{
	    	
	    	
	    	case(MENU_BACK_TO_MAIN):
	    		if(mydb!=null&&mydb.getReadableDatabase().isOpen())
				{
	    			cWord.close();

	    			mydb.close();
				}
				
				intent.setClass(TestPage.this, NavigatePage.class);
				startActivity(intent);
				finish();
	    	break;
	    	
	    	
	    	}
	    	return super.onMenuItemSelected(featureId, item);
	    }
		
		
		public boolean onKeyDown(int keyCode, KeyEvent event) {

			

			//按下键盘上返回按钮

			if(keyCode == KeyEvent.KEYCODE_BACK){
				
			

				Intent intent=new Intent();
				intent.setClass(TestPage.this, WordPage.class);
				
				
				
                 Bundle bundle=new Bundle();
                 bundle.putInt("tablePosition", tablePosition);
                 bundle.putInt("pinTablePosition", pinTablePosition);
                 bundle.putString("strTitle", strTitle);
                 bundle.putString("source", source);
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


