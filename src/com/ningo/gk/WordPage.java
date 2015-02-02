package com.ningo.gk;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.gfan.sdk.statitistics.GFAgent;

import db.DBParameter;


public class WordPage extends Activity implements OnClickListener{
	
	ProgressDialog progressDialog;////进度条

	
	//创建数据库对象
	static final private int MENU_BACK_TO_MAIN=Menu.FIRST;
	static final private int MENU_GO_TO_TEST=Menu.FIRST+1;
	static final private int MENU_GO_TO_HARDWORDS=Menu.FIRST+2;
	static final private int MENU_GO_TO_MID_LEVEL_WORDS=Menu.FIRST+3;
	static final private int MENU_SET=Menu.FIRST+4;
	static final private int MENU_SIMILARWORDS=Menu.FIRST+5;
//	static final private int TIMES_FOR_PROMPT=6;

	private int pinId;
	private int rowCount;
	private int tablePosition;
	private int pinTablePosition;
	
	private int version=DBParameter.version;
	
	private float originalTouchXCor;
	
	private String tables[]=DBParameter.tables;

	private String strTitle;
	private String source;
	
	private MySQLiteOpenHelper mydb=null;
	private MySQLiteOpenHelper mydb_2=null;
	
	

	
	

	private TextView tvUp;
	private TextView tvDown;
	private TextView tvRate; 
	
	private Button btSimilar;
	
	
	
	
	
    
	  
	/*
	
	
	private final Handler handler = new Handler() {  

	

        @Override 

        public void handleMessage(Message msg) {  

            super.handleMessage(msg);  

            //handler处理消息  

            if(msg.what==TIMES_FOR_PROMPT){  

            	Toast.makeText(getApplicationContext(), "开始记忆，时限30秒钟",
   				     Toast.LENGTH_SHORT).show();  

            }
            else if(msg.what<TIMES_FOR_PROMPT&&msg.what>0)
            {  

            	Toast.makeText(getApplicationContext(),"剩余"+(msg.what)*5+"秒钟",
      				     Toast.LENGTH_SHORT).show();  
            	

            }  
            else
            {
            	Toast.makeText(getApplicationContext(),"时间到",
     				     Toast.LENGTH_SHORT).show();  
           	timer.cancel();
            }

        }  

    };
	
    
    
    */

	
	
	
		@Override
		public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        
	        
	         
	        
	        Bundle bundle=this.getIntent().getExtras();
	        tablePosition=bundle.getInt("tablePosition");
	        pinTablePosition=bundle.getInt("pinTablePosition");
	        
	        strTitle=bundle.getString("strTitle");
	        
	        source=bundle.getString("source");
	        
	        
	       //autoPage();
        
	     /*
	      * 
	      * 
	      * 
	      *  timer = new Timer();
	    			        timer.schedule(new TimerTask() {  

	    		                int i = TIMES_FOR_PROMPT;  
	    			          public void run() {  

	    			        	  

	    				                          Log.i("yao", Thread.currentThread().getName());  

	    				     

	    				                          //定义一个消息传过去  

	    				                          Message msg = new Message();  

	    				                          msg.what = i--;  

	    				                          handler.sendMessage(msg);  

	    				                      }  

	    				     

	    				                  }, 0, 1000);  
	      */
		              

	       
	        setContentView(R.layout.wps_day);
	        setTitle(strTitle);
	        mydb_2=new MySQLiteOpenHelper(this,"mydb_2",null,version,DBParameter.tables_2,DBParameter.fieldNames_2,DBParameter.fieldTypes_2);
	        
	        tvRate=(TextView)findViewById(R.id.tvRate);
	        
	        System.out.println("断点3");
	        
	        tvUp=(TextView)findViewById(R.id.tvword);
	        tvDown=(TextView)findViewById(R.id.tvtrans);
	        
	        btSimilar=(Button)findViewById(R.id.button1);
	        btSimilar.setOnClickListener(this);
	        
	        String []fieldTemp={"current_situation"};
	        
	        String []valueTemp={"fontSize"};
	        
	        
	        
	        Cursor cTemp=mydb_2.select(DBParameter.tables_2[0],fieldTemp,"property = ?",valueTemp,null,null,null);
	         cTemp.moveToNext();//cTemp是数据库游标，要下移一位，然后进行判断，初始值为-1
	         if(cTemp.getString(0).equals("0"))
	        {
	        	
	        
	        
	        tvUp.setTextSize(30);
 	        tvDown.setTextSize(30);
	        
	        }
	        else if(cTemp.getString(0).equals("1"))
	        {
	        	
		        
		        
		        tvUp.setTextSize(45);
	 	        tvDown.setTextSize(45);
	        }
	        else if(cTemp.getString(0).equals("2"))
	        {
	        	
		        
		        tvUp.setTextSize(60);
	 	        tvDown.setTextSize(60);
	        }
	        
	       
	        
	        
	        String []valueTemp_2={"fontColor"};
	        
	        
	        
	        Cursor cTemp_2=mydb_2.select(DBParameter.tables_2[0],fieldTemp,"property = ?",valueTemp_2,null,null,null);
	        
	        cTemp_2.moveToNext();//再往下移一行，设置字色
	        if(cTemp_2.getString(0).equals("0"))
	        {
	        	tvUp.setTextColor(Color.rgb(204, 0, 51));
		        tvDown.setTextColor(Color.rgb(204, 0, 51));
	        
	        }
	        else if(cTemp_2.getString(0).equals("1"))
	        {
	        	tvUp.setTextColor(Color.rgb(255, 102, 51));
		        tvDown.setTextColor(Color.rgb(255, 102, 51));
	        }
	        else if(cTemp_2.getString(0).equals("2"))
	        {
	        	tvUp.setTextColor(Color.rgb(51,0,255));
		        tvDown.setTextColor(Color.rgb(51,0,255));
	        }
	        cTemp.close();
	        
	       mydb_2.close();
	        
	         
	        mydb=new MySQLiteOpenHelper(this,"mydb",null,DBParameter.version,DBParameter.tables,DBParameter.fieldNames,DBParameter.fieldTypes);
	        
	        String[] fIdForWord={"id"};
	        
	        Cursor cRowCount=mydb.select(tables[tablePosition],fIdForWord,"",null,null,null,null);
	        
	        rowCount=cRowCount.getCount();//rowCount是看这个List有多少个单词
	        
	        
	        
	        
	        
	        String fPinIdForPin[]={"pinId"};
	        String[] selectionArgsForPin={"1"};
	        Cursor cPin=mydb.select(tables[pinTablePosition],fPinIdForPin,"id=?",selectionArgsForPin,null,null,null);
	        cPin.moveToNext();
	        String pin=cPin.getString(0);
	        pinId=Integer.parseInt(pin);
	        
	        
	        tvRate.setText("本list当前进度   "+String.valueOf((int)((float)pinId/(float)rowCount*100))+"%");///*********************************///显示计算比率
	        
	        String fWord[]={"id","word","chinese","pos"};
	        String[] selectionArgsWord={pin};
	        Cursor cWord=mydb.select(tables[tablePosition],fWord,"id=?",selectionArgsWord,null,null,null);
	        cWord.moveToNext();
	        tvUp.setText(cWord.getString(1));
	        tvDown.setText(cWord.getString(3)+" "+cWord.getString(2));
	        
	        
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		  @Override 
		
		  public boolean onTouchEvent(MotionEvent event) { 
		    	if(event.getAction()==MotionEvent.ACTION_DOWN)
		    	{
		    		originalTouchXCor=event.getRawX();
		    	}
		    	else 
		    		if(event.getAction()==MotionEvent.ACTION_UP)
			    	{
			    		if(event.getRawX()>originalTouchXCor)
			    		{if(pinId>1)
			    			previousWord();
							else
							{   
								
								
								
								Toast.makeText(getApplicationContext(), "已到达该List顶端",
									     Toast.LENGTH_SHORT).show();

								
							}}
			    	
		    		else if(event.getRawX()<originalTouchXCor)
		    		{if(pinId<rowCount)
		    			nextWord();
		    				else 
		    				{
		    					Toast.makeText(getApplicationContext(), "已到达该List底端",
		    						     Toast.LENGTH_SHORT).show();
		    					
		    				}}}
		    	return true;

		    }
		@Override
		public boolean onCreateOptionsMenu(Menu menu){//设置元素
			
	         	int idGroup1=0;
	         	
	         	
	         	int orderItem1=Menu.NONE;
	         	int orderItem2=Menu.NONE;
	         	int orderItem3=Menu.NONE;
	         	int orderItem4=Menu.NONE;
	         	
	         	int orderItem5=Menu.NONE;
	         	int orderItem6=Menu.NONE;
	         	 
	         	
	         	menu.add(idGroup1,MENU_BACK_TO_MAIN,orderItem1,R.string.str_btm).setIcon(android.R.drawable.ic_menu_add);
	         	menu.add(idGroup1,MENU_GO_TO_TEST,orderItem2,R.string.str_test).setIcon(android.R.drawable.ic_menu_add);
	         	menu.add(idGroup1,MENU_GO_TO_HARDWORDS,orderItem3,R.string.str_hardwords).setIcon(android.R.drawable.ic_menu_add);
	         	menu.add(idGroup1,MENU_GO_TO_MID_LEVEL_WORDS,orderItem4,R.string.str_m_l_words).setIcon(android.R.drawable.ic_menu_add);
	         	menu.add(idGroup1,MENU_SET,orderItem5,R.string.str_set).setIcon(android.R.drawable.ic_menu_add);
	         	menu.add(idGroup1,MENU_SIMILARWORDS,orderItem6,R.string.str_similarWords).setIcon(android.R.drawable.ic_menu_add);
	         	return super.onCreateOptionsMenu(menu);
	         
		}
		


		
		@Override
		public boolean onMenuItemSelected(int featureId,MenuItem item){
		//	timer.cancel();   **************************非常重要*******************************//////////
	    	Intent intent=new  Intent();
	    	Bundle bundle=new Bundle();
	    	switch(item.getItemId())
	    	{
	    	
	    	
	    	case(MENU_BACK_TO_MAIN):
	    		if(mydb!=null&&mydb.getReadableDatabase().isOpen())
				{
	    			mydb.close();
				}
				
				intent.setClass(WordPage.this, NavigatePage.class);
				startActivity(intent);
				finish();
	    	break;
	    	case(MENU_GO_TO_TEST):
	    		
	    		if(mydb!=null&&mydb.getReadableDatabase().isOpen())
				{
	    			

	    			mydb.close();
				}
				
				intent.setClass(WordPage.this, TestPage.class);
				
				bundle.putInt("tablePosition", tablePosition);
				bundle.putInt("pinTablePosition", pinTablePosition);
				bundle.putString("strTitle", strTitle);System.out.println("44");
		    	bundle.putString("source", source);System.out.println("55");
				intent.putExtras(bundle);
				startActivity(intent);
				finish();
	    	break;
	    	case(MENU_GO_TO_HARDWORDS):
	    		if(mydb!=null&&mydb.getReadableDatabase().isOpen())
	    		{
	    			
	    			mydb.close();
	    		}
	    		
	    		intent.setClass(WordPage.this, MyListView.class);
	    		
				bundle.putInt("tablePosition", tablePosition);
				bundle.putInt("pinTablePosition", pinTablePosition);
				bundle.putString("strTitle",strTitle );
				bundle.putString("source", source);
				bundle.putString("from", "word");
				
				intent.putExtras(bundle);
	    		startActivity(intent);
	    		finish();
	    	break;//
	    	case(MENU_GO_TO_MID_LEVEL_WORDS):
	    		if(mydb!=null&&mydb.getReadableDatabase().isOpen())
	    		{
	    			
	    			mydb.close();
	    		}
	    		
	    		intent.setClass(WordPage.this, Mid_level_ClearUp.class);
	    		
				bundle.putInt("tablePosition", tablePosition);
				bundle.putInt("pinTablePosition", pinTablePosition);
				bundle.putString("strTitle",strTitle );
				bundle.putString("source", source);//以上四个参数是为了从word到难词界面中传值，使得后退之后还能在当前单词界面，而且难词List不丢失。
				bundle.putString("from", "word");
				intent.putExtras(bundle);//装载数据包
	    		startActivity(intent);
	    		finish();
	    	break;	
	    	
	    	
	    	
	    	
	    	
	    	////////////设     置/////////////
	    	case(MENU_SIMILARWORDS):
	    		
	    		if(mydb!=null&&mydb.getReadableDatabase().isOpen())
	    		{
	    			
	    			mydb.close();
	    		}
	    	
	    	
	    	 
	    		new AlertDialog.Builder(WordPage.this).setTitle("形近词模糊查找，结果将按相似程度排序（需1-3秒）").setSingleChoiceItems(
		    		     new String[] { "显示3个", "显示5个" ,"显示10个","显示20个", "显示30个" ,"显示50个",}, 0,
		    		     new DialogInterface.OnClickListener() {
		    		      public void onClick(DialogInterface dialog, int which) {
		    		    	  

		    		       if(which==0)
		    		       {
		    		    	   Intent intent0=new Intent();
		    		    	   Bundle bundle_2=new Bundle();
		    			    	
		    			    	bundle_2.putInt("tablePosition", tablePosition);
		    			    	bundle_2.putInt("pinTablePosition", pinTablePosition);
		    			    	bundle_2.putString("strTitle", strTitle);
		    			    	bundle_2.putString("source", source);
		    			    	bundle_2.putString("keyWord", tvUp.getText().toString());
		    			    	bundle_2.putInt("wordsDisplayAmount", 3);
		    			    	
		    			    	
		    			    	
		    			    	
		    			    	intent0.putExtras(bundle_2);
		    			    	intent0.setClass(WordPage.this, SimilarWordsPage.class);
		    			    	
		    			    		startActivity(intent0);
		    			    		
		    			    		finish(); 
		    		       }
		    		       else if(which==1)
		    		       {
		    		    	   Intent intent0=new Intent();
		    		    	   Bundle bundle_2=new Bundle();
		    			    	
		    			    	bundle_2.putInt("tablePosition", tablePosition);
		    			    	bundle_2.putInt("pinTablePosition", pinTablePosition);
		    			    	bundle_2.putString("strTitle", strTitle);
		    			    	bundle_2.putString("source", source);
		    			    	bundle_2.putString("keyWord", tvUp.getText().toString());
		    			    	bundle_2.putInt("wordsDisplayAmount", 5);
		    			    	
		    			    	
		    			    	
		    			    	
		    			    	intent0.putExtras(bundle_2);
		    			    	intent0.setClass(WordPage.this, SimilarWordsPage.class);
		    			    	
		    			    		startActivity(intent0);
		    			    		finish(); 
		    		       }
		    		       else if(which==2)
		    		       {
		    		    	   Intent intent0=new Intent();
		    		    	   Bundle bundle_2=new Bundle();
		    			    	
		    			    	bundle_2.putInt("tablePosition", tablePosition);
		    			    	bundle_2.putInt("pinTablePosition", pinTablePosition);
		    			    	bundle_2.putString("strTitle", strTitle);
		    			    	bundle_2.putString("source", source);
		    			    	bundle_2.putString("keyWord", tvUp.getText().toString());
		    			    	bundle_2.putInt("wordsDisplayAmount", 10);
		    			    	
		    			    	
		    			    	
		    			    	
		    			    	intent0.putExtras(bundle_2);
		    			    	intent0.setClass(WordPage.this, SimilarWordsPage.class);
		    			    	
		    			    		startActivity(intent0);
		    			    		finish(); 
		    		       }
		    		       else if(which==3)
		    		       {
		    		    	   Intent intent0=new Intent();
		    		    	   Bundle bundle_2=new Bundle();
		    			    	
		    			    	bundle_2.putInt("tablePosition", tablePosition);
		    			    	bundle_2.putInt("pinTablePosition", pinTablePosition);
		    			    	bundle_2.putString("strTitle", strTitle);
		    			    	bundle_2.putString("source", source);
		    			    	bundle_2.putString("keyWord", tvUp.getText().toString());
		    			    	bundle_2.putInt("wordsDisplayAmount", 20);
		    			    	
		    			    	
		    			    	
		    			    	
		    			    	intent0.putExtras(bundle_2);
		    			    	intent0.setClass(WordPage.this, SimilarWordsPage.class);
		    			    	
		    			    		startActivity(intent0);
		    			    		finish(); 
		    		       }
		    		       else if(which==4)
		    		       {
		    		    	   Intent intent0=new Intent();
		    		    	   Bundle bundle_2=new Bundle();
		    			    	
		    			    	bundle_2.putInt("tablePosition", tablePosition);
		    			    	bundle_2.putInt("pinTablePosition", pinTablePosition);
		    			    	bundle_2.putString("strTitle", strTitle);
		    			    	bundle_2.putString("source", source);
		    			    	bundle_2.putString("keyWord", tvUp.getText().toString());
		    			    	bundle_2.putInt("wordsDisplayAmount", 30);
		    			    	
		    			    	
		    			    	
		    			    	
		    			    	intent0.putExtras(bundle_2);
		    			    	intent0.setClass(WordPage.this, SimilarWordsPage.class);
		    			    	
		    			    		startActivity(intent0);
		    			    		finish(); 
		    		       }
		    		       else if(which==5)
		    		       {
		    		    	   Intent intent0=new Intent();
		    		    	   Bundle bundle_2=new Bundle();
		    			    	
		    			    	bundle_2.putInt("tablePosition", tablePosition);
		    			    	bundle_2.putInt("pinTablePosition", pinTablePosition);
		    			    	bundle_2.putString("strTitle", strTitle);
		    			    	bundle_2.putString("source", source);
		    			    	bundle_2.putString("keyWord", tvUp.getText().toString());
		    			    	bundle_2.putInt("wordsDisplayAmount", 50);
		    			    	
		    			    	
		    			    	
		    			    	
		    			    	intent0.putExtras(bundle_2);
		    			    	intent0.setClass(WordPage.this, SimilarWordsPage.class);
		    			    	
		    			    		startActivity(intent0);
		    			    		finish(); 
		    		       }
		    		      }
		    		     }).show();
	    	


	    	
	    	
	    	
	    	
	    	break;	
case(MENU_SET):
	    		
	    		if(mydb!=null&&mydb.getReadableDatabase().isOpen())
	    		{
	    			
	    			mydb.close();
	    		}
	    	Bundle bundle_3=new Bundle();
	    	bundle_3.putInt("tablePosition", tablePosition);
	    	bundle_3.putInt("pinTablePosition", pinTablePosition);
    		
	    	bundle_3.putString("strTitle", strTitle);
	    	bundle_3.putString("source", source);
    		intent.putExtras(bundle_3);
	    		intent.setClass(WordPage.this, SetPage.class);	
	    		
	    		startActivity(intent);
	    		finish(); 
	    	break;	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	}
	
	    	return super.onMenuItemSelected(featureId, item);
	    }
		
	/*	public void autoPage(){
			 timer2 = new Timer();
		        timer2.schedule(new TimerTask() {  

	                 
		          public void run() {  

		        	  
		        	  
		        	  
		        	  
		        	  
		        	  
		        	  

                      Log.i("yan", Thread.currentThread().getName());  

 

                      //定义一个消息传过去  

                      Message msg = new Message();  

                      msg.what = pinId;  

                      handler2.sendMessage(msg);  
		        	 
			                         

			                      }  

			     

			                  }, 0, 3000);  

			              
		}
		*/
		
		public void nextWord(){
			
             pinId=pinId+1;
			
             tvRate.setText("本list当前进度   "+String.valueOf((int)((float)pinId/(float)rowCount*100))+"%");
			String fPin[]={"pinId"};
	        String[] selectionArgsPin={"1"};
	        String strPin=String.valueOf(pinId);
	        String[] valueUpdate={strPin};
	        
	        mydb.update(tables[pinTablePosition],fPin,valueUpdate,"id=?",selectionArgsPin);
	        
	        
	        
	        
	        String fWord[]={"id","word","chinese","pos"};
	        String[] selectionArgsWord={strPin};
	        Cursor cWord=mydb.select(tables[tablePosition],fWord,"id=?",selectionArgsWord,null,null,null);
	        cWord.moveToNext();
	        tvUp.setText(cWord.getString(1));
	        tvDown.setText(cWord.getString(3)+" "+cWord.getString(2));
			
		}
		
		public void previousWord(){
			
			pinId=pinId-1;
			
			tvRate.setText("本list当前进度   "+String.valueOf((int)((float)pinId/(float)rowCount*100))+"%");
			String fPin[]={"pinId"};
	        String[] selectionArgsPin={"1"};
	        String strPin=String.valueOf(pinId);
	        String[] valueUpdate={strPin};
	        
	        mydb.update(tables[pinTablePosition],fPin,valueUpdate,"id=?",selectionArgsPin);
	        
	        
	        
	        
	        String fWord[]={"id","word","chinese","pos"};
	        String[] selectionArgsWord={strPin};
	        Cursor cWord=mydb.select(tables[tablePosition],fWord,"id=?",selectionArgsWord,null,null,null);
	        cWord.moveToNext();
	        tvUp.setText(cWord.getString(1));
	        tvDown.setText(cWord.getString(3)+" "+cWord.getString(2));
			
		}
		
		
		
		@Override

		public boolean onKeyDown(int keyCode, KeyEvent event) {

			

			//按下键盘上返回按钮

			if(keyCode == KeyEvent.KEYCODE_BACK){//后退键定义
				Intent intent=new Intent();
	 
				if(mydb!=null&&mydb.getReadableDatabase().isOpen())
				{
	    			mydb.close();
				}
				
				
				
				if(source.equals("MainPage"))//source指从哪里来就去哪里
				    intent.setClass(WordPage.this, MainPage.class);
				
				
				
				
				
				
				startActivity(intent);
				finish();
			

				

				return true;

			}else{		

				return super.onKeyDown(keyCode, event);

			}

		}
		
		
		public void onClick(View v)
		{
			if(v.equals(btSimilar))
			{
				if(mydb!=null&&mydb.getReadableDatabase().isOpen())
	    		{
	    			
	    			mydb.close();
	    		}
				
	    		new AlertDialog.Builder(WordPage.this).setTitle("形近词模糊查找，结果将按相似程度排序（需1-3秒）").setSingleChoiceItems(
		    		     new String[] { "显示3个", "显示5个" ,"显示10个","显示20个", "显示30个" ,"显示50个",}, 0,
		    		     new DialogInterface.OnClickListener() {
		    		      public void onClick(DialogInterface dialog, int which) {
		    		    	  

		    		       if(which==0)
		    		       {
		    		    	   Intent intent0=new Intent();
		    		    	   Bundle bundle_2=new Bundle();
		    			    	
		    			    	bundle_2.putInt("tablePosition", tablePosition);
		    			    	bundle_2.putInt("pinTablePosition", pinTablePosition);
		    			    	bundle_2.putString("strTitle", strTitle);
		    			    	bundle_2.putString("source", source);
		    			    	bundle_2.putString("keyWord", tvUp.getText().toString());
		    			    	bundle_2.putInt("wordsDisplayAmount", 3);
		    			    	
		    			    	
		    			    	
		    			    	
		    			    	intent0.putExtras(bundle_2);
		    			    	intent0.setClass(WordPage.this, SimilarWordsPage.class);
		    			    	
		    			    		startActivity(intent0);
		    			    		
		    			    		finish(); 
		    		       }
		    		       else if(which==1)
		    		       {
		    		    	   Intent intent0=new Intent();
		    		    	   Bundle bundle_2=new Bundle();
		    			    	
		    			    	bundle_2.putInt("tablePosition", tablePosition);
		    			    	bundle_2.putInt("pinTablePosition", pinTablePosition);
		    			    	bundle_2.putString("strTitle", strTitle);
		    			    	bundle_2.putString("source", source);
		    			    	bundle_2.putString("keyWord", tvUp.getText().toString());
		    			    	bundle_2.putInt("wordsDisplayAmount", 5);
		    			    	
		    			    	
		    			    	
		    			    	
		    			    	intent0.putExtras(bundle_2);
		    			    	intent0.setClass(WordPage.this, SimilarWordsPage.class);
		    			    	
		    			    		startActivity(intent0);
		    			    		finish(); 
		    		       }
		    		       else if(which==2)
		    		       {
		    		    	   Intent intent0=new Intent();
		    		    	   Bundle bundle_2=new Bundle();
		    			    	
		    			    	bundle_2.putInt("tablePosition", tablePosition);
		    			    	bundle_2.putInt("pinTablePosition", pinTablePosition);
		    			    	bundle_2.putString("strTitle", strTitle);
		    			    	bundle_2.putString("source", source);
		    			    	bundle_2.putString("keyWord", tvUp.getText().toString());
		    			    	bundle_2.putInt("wordsDisplayAmount", 10);
		    			    	
		    			    	
		    			    	
		    			    	
		    			    	intent0.putExtras(bundle_2);
		    			    	intent0.setClass(WordPage.this, SimilarWordsPage.class);
		    			    	
		    			    		startActivity(intent0);
		    			    		finish(); 
		    		       }
		    		       else if(which==3)
		    		       {
		    		    	   Intent intent0=new Intent();
		    		    	   Bundle bundle_2=new Bundle();
		    			    	
		    			    	bundle_2.putInt("tablePosition", tablePosition);
		    			    	bundle_2.putInt("pinTablePosition", pinTablePosition);
		    			    	bundle_2.putString("strTitle", strTitle);
		    			    	bundle_2.putString("source", source);
		    			    	bundle_2.putString("keyWord", tvUp.getText().toString());
		    			    	bundle_2.putInt("wordsDisplayAmount", 20);
		    			    	
		    			    	
		    			    	
		    			    	
		    			    	intent0.putExtras(bundle_2);
		    			    	intent0.setClass(WordPage.this, SimilarWordsPage.class);
		    			    	
		    			    		startActivity(intent0);
		    			    		finish(); 
		    		       }
		    		       else if(which==4)
		    		       {
		    		    	   Intent intent0=new Intent();
		    		    	   Bundle bundle_2=new Bundle();
		    			    	
		    			    	bundle_2.putInt("tablePosition", tablePosition);
		    			    	bundle_2.putInt("pinTablePosition", pinTablePosition);
		    			    	bundle_2.putString("strTitle", strTitle);
		    			    	bundle_2.putString("source", source);
		    			    	bundle_2.putString("keyWord", tvUp.getText().toString());
		    			    	bundle_2.putInt("wordsDisplayAmount", 30);
		    			    	
		    			    	
		    			    	
		    			    	
		    			    	intent0.putExtras(bundle_2);
		    			    	intent0.setClass(WordPage.this, SimilarWordsPage.class);
		    			    	
		    			    		startActivity(intent0);
		    			    		finish(); 
		    		       }
		    		       else if(which==5)
		    		       {
		    		    	   Intent intent0=new Intent();
		    		    	   Bundle bundle_2=new Bundle();
		    			    	
		    			    	bundle_2.putInt("tablePosition", tablePosition);
		    			    	bundle_2.putInt("pinTablePosition", pinTablePosition);
		    			    	bundle_2.putString("strTitle", strTitle);
		    			    	bundle_2.putString("source", source);
		    			    	bundle_2.putString("keyWord", tvUp.getText().toString());
		    			    	bundle_2.putInt("wordsDisplayAmount", 50);
		    			    	
		    			    	
		    			    	
		    			    	
		    			    	intent0.putExtras(bundle_2);
		    			    	intent0.setClass(WordPage.this, SimilarWordsPage.class);
		    			    	
		    			    		startActivity(intent0);
		    			    		finish(); 
		    		       }
		    		      }
		    		     }).show();
	    	
				
	    	
	    	
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