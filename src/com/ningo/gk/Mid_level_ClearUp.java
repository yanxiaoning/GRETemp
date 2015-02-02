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

public class Mid_level_ClearUp extends Activity implements OnItemClickListener{
	
	private ListView listView;  
    
    static final private int MENU_BACK_TO_MAIN=Menu.FIRST;
    
    
    
    MySQLiteOpenHelper mydb=null;
    
	
	//为数据库对象准备参数(版本，表名，域名，字段类型)
private	int version=DBParameter.version;
private	String tables[]=DBParameter.tables;
private	String fieldNames[][]=DBParameter.fieldNames;
private	String fieldTypes[][]=DBParameter.fieldTypes;






private int tablePosition;

private int pinTablePosition;

private String strTitle;

private String source;

private String from;

    //private List<String> data = new ArrayList<String>();  

    @Override 

    public void onCreate(Bundle savedInstanceState){  

        super.onCreate(savedInstanceState);  
        Bundle bundle=this.getIntent().getExtras();
        tablePosition=bundle.getInt("tablePosition");
        pinTablePosition=bundle.getInt("pinTablePosition");
        strTitle=bundle.getString("strTitle");
        source=bundle.getString("source");
        from=bundle.getString("from");

        listView = new ListView(this);  

        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,getData()));
        listView.setOnItemClickListener(this);
        setTitle(strTitle+"中我的模糊词");
        setContentView(listView);  

    }  

       

       

       

    private List<String> getData(){  

           

        List<String> data = new ArrayList<String>();  
        
        
        mydb=new MySQLiteOpenHelper(this,"mydb",null,version,tables,fieldNames,fieldTypes);
        
        String[] fIdForWord={"word"};
        String[] selectionArg={"2"};
        Cursor hardWordsCollector=mydb.select(tables[tablePosition],fIdForWord,"hardness=?",selectionArg,null,null,null);
       
        while(hardWordsCollector.moveToNext())
        {
       	 data.add(hardWordsCollector.getString(0)); 
        }
       
           

        return data;  

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
	
	intent.setClass(Mid_level_ClearUp.this, MainPage.class);
	startActivity(intent);
	finish();
break;

	
}

return super.onMenuItemSelected(featureId, item);
}

public  void onItemClick (AdapterView<?> parent, View view, int position, long id){

String[] strItem={(String)parent.getItemAtPosition(position)};
String[] fields={"word","chinese","pos"};
Cursor c=mydb.select(tables[tablePosition],fields , "word=?", strItem, null, null, null);
c.moveToNext();

String parameterWord=c.getString(0);
String parameterChinese=c.getString(1);
String parameterPos=c.getString(2);


Intent intent=new Intent();
intent.setClass(Mid_level_ClearUp.this, MLWordPage.class);
Bundle bundle=new Bundle();
bundle.putString("parameterWord", parameterWord);
bundle.putString("parameterChinese", parameterChinese);
bundle.putString("parameterPos", parameterPos);


bundle.putInt("tablePosition", tablePosition);
bundle.putInt("pinTablePosition", pinTablePosition);
bundle.putString("strTitle", strTitle);
bundle.putString("source", source);
bundle.putString("from", from);

intent.putExtras(bundle);
startActivity(intent);
finish();
c.close();

}




public boolean onKeyDown(int keyCode, KeyEvent event) {
if(keyCode == KeyEvent.KEYCODE_BACK){
	
	if(from.equals("log"))
	{
		Intent intent=new Intent();
		intent.setClass(Mid_level_ClearUp.this, LogView.class);
		startActivity(intent);
		finish();
	}
	else if(from.equals("word"))
	{
	Intent intent=new Intent();
	intent.setClass(Mid_level_ClearUp.this, WordPage.class);
	
	
	
     Bundle bundle=new Bundle();
     bundle.putInt("tablePosition", tablePosition);
     bundle.putInt("pinTablePosition", pinTablePosition);
     bundle.putString("strTitle", strTitle);
     bundle.putString("source", source);
	intent.putExtras(bundle);
	
	
	

		startActivity(intent);
		finish();
	}
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
