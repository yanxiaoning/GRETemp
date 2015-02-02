package com.ningo.gk;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.gfan.sdk.statitistics.GFAgent;

import db.DBParameter;

public class SetPage extends Activity implements OnItemClickListener{
	private int pinTablePosition;
	private int tablePosition;
    private String strTitle;
    private String source;
    private Bundle bundle;
    private ListView listView;
	public MySQLiteOpenHelper mydb_2=new MySQLiteOpenHelper(this,"mydb_2",null,DBParameter.version,DBParameter.tables_2,DBParameter.fieldNames_2,DBParameter.fieldTypes_2);

	
	
	
	 

	

	

	
	 
	public void onCreate(Bundle savedInstanceState) {
		  super.onCreate(savedInstanceState);
		  
		  this.bundle=this.getIntent().getExtras();//bundle是传数据的包
		  
		  tablePosition=bundle.getInt("tablePosition");//“tablePosition”是标签，tablePosition是数据，数据传输的是每个表的位置。
	      pinTablePosition=bundle.getInt("pinTablePosition");//pinTablePosition是标题
	      strTitle=bundle.getString("strTitle");
	      source=bundle.getString("source");
		  
		  listView = new ListView(this);  
	      listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,getData()));
	      listView.setOnItemClickListener(this);
	      listView.setBackgroundColor(Color.BLACK);
	      setContentView(listView); 
	         
	         
	}
	
	
	 private List<String> getData(){  

         

         List<String> data = new ArrayList<String>();  
         
         
       
        	 data.add("字体"); 
        	 data.add("字色"); 
        	 data.add("背景"); 
         
        
            

         return data;  

     }  
	 
	 
	 public  void onItemClick (AdapterView<?> parent, View view, int position, long id){
			
			if(position==0)
			{

	        	
				
			String [] fontSize={"小","中","大"};
				 AlertDialog.Builder builder = new AlertDialog.Builder(this); 
				 builder.setTitle("请选择字体大小"); 
				 builder.setItems(fontSize, new DialogInterface.OnClickListener() 
				 {
					 
					 

					public void onClick(DialogInterface dialog, int which) 
					 {
					
							 String whereValue[]={"fontSize"};
							 String []selectField={"current_situation"};
							 String []strWhich={String.valueOf(which)};//valueof是把整数值变字符值
							 mydb_2.update(DBParameter.tables_2[0], selectField, strWhich, "property = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
							 mydb_2.close();
					 }
				 });
				 
				 builder.create().show(); 
			}
			
			else if(position==1)
			{
				String [] fontColor={"红","橙","蓝"};
				 AlertDialog.Builder builder = new AlertDialog.Builder(this); 
				 builder.setTitle("请选择字体颜色"); 
				 builder.setItems(fontColor, new DialogInterface.OnClickListener() 
				 {
					 
					 

					public void onClick(DialogInterface dialog, int which) 
					 {
						
						
						 
							 String whereValue[]={"fontColor"};
							 String []selectField={"current_situation"};
							 String []strWhich={String.valueOf(which)};
							 mydb_2.update(DBParameter.tables_2[0], selectField, strWhich, "property = ?", whereValue);
							 mydb_2.close();
						 
					 }
				 });
				 
				 builder.create().show(); 
			}
			
			else if(position==2)
			{
				
			}

			
			
			
			
			
			
			
			
			
			
			
			
		}
	 
	 
	 @Override

		public boolean onKeyDown(int keyCode, KeyEvent event) {

		 MySQLiteOpenHelper  mydb=new MySQLiteOpenHelper(this,"mydb",null,DBParameter.version,DBParameter.tables,DBParameter.fieldNames,DBParameter.fieldTypes);


			//按下键盘上返回按钮

			if(keyCode == KeyEvent.KEYCODE_BACK){
				Intent intent=new Intent();
	 
				if(mydb!=null&&mydb.getReadableDatabase().isOpen())
				{
	    			mydb.close();
				}
				Bundle bundle_2=new Bundle();
		    	bundle_2.putInt("tablePosition", tablePosition);
		    	bundle_2.putInt("pinTablePosition", pinTablePosition);
	    		
		    	bundle_2.putString("strTitle", strTitle);
		    	bundle_2.putString("source", source);
	    		intent.putExtras(bundle_2);
		    		intent.setClass(SetPage.this, WordPage.class);	
		    		
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
