package com.ningo.gk;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.gfan.sdk.statitistics.GFAgent;

import db.DBParameter;

public class LogView extends Activity implements OnItemClickListener,OnClickListener{
	 private ListView listView;  
     

     
     
     
     MySQLiteOpenHelper mydb_4=null;
     
 	
 	//为数据库对象准备参数(版本，表名，域名，字段类型)
 private	int version=DBParameter.version;

 
 
 
 
 
 
 

private int position;

     //private List<String> data = new ArrayList<String>();  

     @Override 

     public void onCreate(Bundle savedInstanceState){  

         super.onCreate(savedInstanceState);  
         
         
         

         listView = new ListView(this);  
         
         listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,getData()));
         listView.setOnItemClickListener(this);

         setContentView(listView);  

     }  

        

        

        

     private List<String> getData(){  

            

         List<String> data = new ArrayList<String>();  
         


         
         mydb_4=new MySQLiteOpenHelper(this,"mydb_4",null,version,DBParameter.tables_4,DBParameter.fieldNames_4,DBParameter.fieldTypes_4);
         
         String[] fIdForWord={"list_value","month","date"};
       
         Cursor TimeCollector=mydb_4.select(DBParameter.tables_4[0],fIdForWord,null,null,null,null,null);
        
        
         while(TimeCollector.moveToNext())
         {
        	 
        	 if((TimeCollector.getString(1).equals("0"))&&(TimeCollector.getString(2).equals("0")))
        	 {
        		 data.add("List "+TimeCollector.getString(0)+"   无阅览记录");
        	 }
        	 
        	 
        	 else
        	 {
        		 data.add("List "+TimeCollector.getString(0)+"   "+TimeCollector.getString(1)+"月"+TimeCollector.getString(2)+"日看过"); 
        	 }
         
         
         
         }
         TimeCollector.close();
         mydb_4.close();

        
         return data;  

     }  

  


public  void onItemClick (AdapterView<?> parent, View view, int position, long id){


	String [] items={"我的难词","我的模糊词"};
	 AlertDialog.Builder builder = new AlertDialog.Builder(this); 
	 builder.setTitle("查看该List中的"); 
	 builder.setItems(items, this); 
	 
		 
		 

		
	 
	 
	 builder.create().show(); 

	 this.position=position;


	
	
	
	

}
public void onClick(DialogInterface dialog, int which) 
{

		if(which==0)
		{
			Intent intent=new Intent();
			intent.setClass(LogView.this, MyListView.class);
			Bundle bundle=new Bundle();



			bundle.putInt("tablePosition", position);
			bundle.putInt("pinTablePosition", position+98);
			bundle.putString("strTitle", "List "+String.valueOf(position+1));
			bundle.putString("from", "log");

			intent.putExtras(bundle);
			startActivity(intent);
			finish();

				}
		else if(which==1)
		{
			Intent intent=new Intent();
			intent.setClass(LogView.this, Mid_level_ClearUp.class);
			Bundle bundle=new Bundle();



			bundle.putInt("tablePosition", position);
			bundle.putInt("pinTablePosition", position+98);
			bundle.putString("strTitle", "List "+String.valueOf(position+1));
			bundle.putString("from", "log");

			intent.putExtras(bundle);
			startActivity(intent);
			finish();

		}
}

public boolean onKeyDown(int keyCode, KeyEvent event) {
if(keyCode == KeyEvent.KEYCODE_BACK){



Intent intent=new Intent();
intent.setClass(LogView.this, NavigatePage.class);



 




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
