package com.ningo.gk;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.gfan.sdk.statitistics.GFAgent;

import db.DBParameter;

public class SimilarWordsPage extends Activity implements OnItemClickListener{  

	private String parameterWord="";
	private String parameterChinese="";
	private String parameterPos="";

	     private ListView listView;  
	     
	     static final private int MENU_BACK_TO_MAIN=Menu.FIRST;
	     
	     
	     
	     MySQLiteOpenHelper mydb=null;
	     
	 	
	 	//为数据库对象准备参数(版本，表名，域名，字段类型)
	 private	int version=DBParameter.version;
	 private	String tables[]=DBParameter.tables;
	 private	String fieldNames[][]=DBParameter.fieldNames;
	 private	String fieldTypes[][]=DBParameter.fieldTypes;
	 
	 
	 private ArrayAdapter<String>  adapter;
	 
	 
	 
	 private int tablePosition;

	private int pinTablePosition;

	private String strTitle;

	private String source;
	
	
	private String keyWord;
	
	private int wordsDisplayAmount;
	
	private List<String> getData;
	
	private List<String[]> wordsInitial= new ArrayList<String[]>(); 
	     //private List<String> data = new ArrayList<String>();  

	     @Override 

	     public void onCreate(Bundle savedInstanceState){  

	         super.onCreate(savedInstanceState);  
	         Bundle bundle=this.getIntent().getExtras();
	         tablePosition=bundle.getInt("tablePosition");
	         pinTablePosition=bundle.getInt("pinTablePosition");
	         strTitle=bundle.getString("strTitle");
	         source=bundle.getString("source");
	         keyWord=bundle.getString("keyWord");
	         wordsDisplayAmount=bundle.getInt("wordsDisplayAmount");
	         
	         setTitle("可能与"+keyWord+"相似的词");
	         
	         
	         listView = new ListView(this);  
	         getData=getData();
	           adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,getData);
	         listView.setAdapter(adapter);
	         listView.setOnItemClickListener(this);

	         setContentView(listView);  

	     }  

	        

	        

	    

	     private List<String> getData(){  

	    	 List<String>  dataFinal=new ArrayList<String>();

	         
	         
	         
	         mydb=new MySQLiteOpenHelper(this,"mydb",null,version,tables,fieldNames,fieldTypes);
	         
	         String[] fIdForWord={"word","chinese","pos"};
	         
	         
	         
	         
	         
	         String id="0";
	         for(int i=0;i<49;i++)
	         {
	         
	         Cursor hardWordsCollector=mydb.select(tables[i],fIdForWord,null,null,null,null,null);
	        
	         
	         
	         
	         
	         while(hardWordsCollector.moveToNext())
	         {
	        	 
	        	 String[] itemTemp={id,hardWordsCollector.getString(0),hardWordsCollector.getString(1),hardWordsCollector.getString(2)};
	        	 wordsInitial.add(itemTemp); 
	        	 id=String.valueOf(Integer.parseInt(id)+1);
	         }
	         
	         
	         
	         
	         }
	         
	         
	         
	        
	         SimilarWords sw=new SimilarWords();
	         List<String> dataIds=sw.orderedIdArray(keyWord, wordsInitial,wordsDisplayAmount);
	         
	         
	         for(int i=0;i<dataIds.size();i++)
	         for(int j=0;j<wordsInitial.size();j++)
	         if(dataIds.get(i)==wordsInitial.get(j)[0])
	        	 dataFinal.add(wordsInitial.get(j)[1]);
	         
	         
	         
	         
	        
	         return dataFinal;  

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
			mydb.close();
		}
		
		intent.setClass(SimilarWordsPage.this, MainPage.class);
		startActivity(intent);
		finish();
	break;
	
		
	}

	return super.onMenuItemSelected(featureId, item);
}

public  void onItemClick (AdapterView<?> parent, View view, int position, long id){
	
	String strItem=(String)parent.getItemAtPosition(position);
	
	
	int judge=0;
	
	
	for(int i=0;i<wordsInitial.size();i++)
	
	if(this.wordsInitial.get(i)[1]==strItem)
	{
		judge=1;
		 parameterWord=wordsInitial.get(i)[1];
		 parameterChinese=wordsInitial.get(i)[2];
		 parameterPos=wordsInitial.get(i)[3];
		break;
	}
	
	
	
	if(judge==1)
	{
	getData.set(position, parameterWord+'\n'+parameterPos+" "+parameterChinese);
	
	adapter.notifyDataSetChanged();
	
	}
	
	
	
	
	
}



public boolean onKeyDown(int keyCode, KeyEvent event) {
if(keyCode == KeyEvent.KEYCODE_BACK){
	
	

	Intent intent=new Intent();
	intent.setClass(SimilarWordsPage.this, WordPage.class);
	
	
	
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