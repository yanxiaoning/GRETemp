package com.ningo.gk;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import db.DBParameter;

public class WordSearchActivity extends Activity implements TextWatcher,OnItemClickListener{
	private List<String> listTotal;
	private List<String> listCollected;
	
	private TextView tf;
	private ListView lv;
	private List<String[]> wordsInitial;
	private ArrayAdapter<String> adapter;
	
	  //ArrayAdapter<String> adapter;
	 protected void onCreate(Bundle savedInstanceState) {
	     super.onCreate(savedInstanceState);
	     setContentView(R.layout.word_search);
	     
	    
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
         //adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,getData());
	     listTotal= getData();
	     
	     
	   
	     
	     
	     
	     
	     lv = (ListView)findViewById(R.id.lv); 
	     
	     

	     
	     
	     
	     
	     
	   
	     
	     DisplayMetrics dm = new DisplayMetrics();  

	     getWindowManager().getDefaultDisplay().getMetrics(dm);  

        
	    tf = (TextView)findViewById(R.id.searchFriend);
	    tf.setLayoutParams(new LayoutParams(dm.widthPixels,LayoutParams.WRAP_CONTENT));
	    lv = (ListView)findViewById(R.id.lv);
	    lv.setOnItemClickListener(this);
	     
	     
	     tf.addTextChangedListener(this); 
	    }
	    	   
	    	  
	    	   public void onTextChanged(CharSequence s, int start, int before, int count) {
	    	    // TODO Auto-generated method stub
	    		  String str=tf.getText().toString();
	    		  String sTemp;
	    		  listCollected=new ArrayList<String>();
	    		  for(int i=0;i<listTotal.size();i++)
	    		  {
	    			  sTemp=listTotal.get(i);
	    			 if( sTemp.contains(str))
	    			 {
	    				 listCollected.add(sTemp);
	    			 }
	    		  }
	    		  adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,listCollected);
	    		  lv.setAdapter(adapter); 
	    	   }
	    	   
	    	   public void beforeTextChanged(CharSequence s, int start, int count,
	    	     int after) {
	    		   
	    	    // TODO Auto-generated method stub
	    	   
	    	   }
	    	   
	    	   public void afterTextChanged(Editable s) {
	    	    // TODO Auto-generated method stub
	    	   
	    	   }
	    	  
	    	   
	    	   private List<String> getData(){  

	    		   
	  	    	List<String[]> wordsInitial= new ArrayList<String[]>(); 
	  	    	List<String> wordsTemp= new ArrayList<String>();
	  	         
	  	    	
	  	    	int version=DBParameter.version;
	  	    	String tables[]=DBParameter.tables;
	  	    	String fieldNames[][]=DBParameter.fieldNames;
	  	    	String fieldTypes[][]=DBParameter.fieldTypes;
				MySQLiteOpenHelper mydb = new MySQLiteOpenHelper(this,"mydb",null,version,tables,fieldNames,fieldTypes);
				
	  	         String[] fIdForWord={"word","chinese","pos"};
	  	         
	  	         
	  	         
	  	       String word;
	  	     String chinese;
	  	   String type;
	  	         //String id="0";
	  	         
				for(int i=0;i<49;i++)
	  	         {
	  	         
	  	         Cursor hardWordsCollector=mydb.select(tables[i],fIdForWord,null,null,null,null,null);
	  	        
	  	     
	  	         
	  	         
	  	         
	  	         while(hardWordsCollector.moveToNext())
	  	         {
	  	        	
	  	        	 
	  	        	 word=hardWordsCollector.getString(0);
	  	        	chinese=hardWordsCollector.getString(1);
	  	        	type=hardWordsCollector.getString(2);
	  	        	String[] temp={word,chinese,type};
	  	        	 wordsInitial.add(temp);
	  	        	wordsTemp.add(word);
	  	        	 
	  	        	
	  	        	 //id=String.valueOf(Integer.parseInt(id)+1);
	  	         }
	  	         
	  	         
	  	       
	  	         
	  	         }
	  	         
	  	         
	  	         
	  	        
	  	         
	  	         
	  	         
	  	         
	  	         this.wordsInitial=wordsInitial;
	  	        
				return wordsTemp;  

	  	     }  
	    	   
	    	   
	    	   public  void onItemClick (AdapterView<?> parent, View view, int position, long id){
	    			
	    			String strItem=(String)parent.getItemAtPosition(position);
	    			
	    			
	    			int judge=0;
	    			
	    			
	    			String parameterWord="";
	    			String parameterChinese="";
	    			String parameterPos="";
					for(int i=0;i<wordsInitial.size();i++)
	    			
	    			if(this.wordsInitial.get(i)[0]==strItem)
	    			{
	    				judge=1;
	    				 parameterWord=wordsInitial.get(i)[0];
	    				 parameterChinese=wordsInitial.get(i)[1];
	    				 parameterPos=wordsInitial.get(i)[2];
	    				break;
	    			}
	    			
	    			
	    			
	    			if(judge==1)
	    			{
	    				listCollected.set(position, parameterWord+'\n'+parameterPos+" "+parameterChinese);
	    			
	    			adapter.notifyDataSetChanged();
	    			
	    			}
	    			
	    			
	    			
	    			
	    			
	    		}
	    	   public boolean onKeyDown(int keyCode, KeyEvent event) {
	    		   if(keyCode == KeyEvent.KEYCODE_BACK){
	    				
	    				

	    				Intent intent=new Intent();
	    				intent.setClass(WordSearchActivity.this, NavigatePage.class);
	    				startActivity(intent);
	    				finish();
	    		   }
	    		   return true;
	    	   }

	    
	}