package com.ningo.gk;



import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;

import com.gfan.sdk.statitistics.GFAgent;

import db.DBParameter;

public class Welcome extends Activity {
    public static final Double CURRENT_VERSION = 3.0;
	private MySQLiteOpenHelper mydb_2=null;
    private MySQLiteOpenHelper mydb_3=null;
    private MySQLiteOpenHelper mydb_4=null;
    

	/** Called when the activity is first created. */
	
	
	
	 
	
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	

	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
      /*  
        Patch_DatabaseFilling pdf = new Patch_DatabaseFilling();
        if(pdf.isFull())
        {
        	Toast.makeText(getApplicationContext(), "��װ��",
				     Toast.LENGTH_SHORT).show();
        }
        else
        {
        	Toast.makeText(getApplicationContext(), "δװ��",
				     Toast.LENGTH_SHORT).show();
        }
        */
        
        
        		
        
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.welcome);
        
      /***********************************************/
        
        
        /*
         * 
         * 
         * mydb_2���½������ݿ⣬��������ɫ�����Ƕ�����ʾ״̬
         * 
         * 
         */
        
        
        mydb_2=new MySQLiteOpenHelper(this,"mydb_2",null,DBParameter.version,DBParameter.tables_2,DBParameter.fieldNames_2,DBParameter.fieldTypes_2);
        
        
        String []fieldCursor={"*"};
        
        Cursor c=mydb_2.select(DBParameter.tables_2[0],fieldCursor,"",null,null,null,null);
        
        if(c.getCount()<1)
        {
        	
        	
        	
      mydb_2.configInitial();
      mydb_2.close();
      c.close();
        }
        else
        {
        	
        	mydb_2.close();
        	c.close();
        }
        
    
        mydb_3=new MySQLiteOpenHelper(this,"mydb_3",null,DBParameter.version,DBParameter.tables_3,DBParameter.fieldNames_3,DBParameter.fieldTypes_3);
        String []fieldCursor_dup={"*"};
        Cursor c_2=mydb_3.select(DBParameter.tables_3[0],fieldCursor_dup,"",null,null,null,null);
        
        if(c_2.getCount()<1)
        {
        	
        	 AlertDialog.Builder builder = new Builder(this);
        	 builder.setMessage('\n'+"�޸��ν���������Bug,�����ʻ���ټ�������");
        	 builder.setTitle("3.0���¹��ܸ���");
        	 
        	 builder.setNegativeButton("֪����", new DialogInterface.OnClickListener() {
        	    
        	  public void onClick(DialogInterface dialog, int which) {
        	  dialog.dismiss();
        	 }
        	 });
        	  builder.create().show();
        	
        	mydb_3.notification();
        	mydb_3.close();
        	c_2.close();
        }
        else
        {
        	c_2.moveToNext();
        	if(Double.parseDouble(c_2.getString(1))<CURRENT_VERSION)
        	{
        		 AlertDialog.Builder builder = new Builder(this);
            	 builder.setMessage('\n'+"�޸��ν���������Bug,�����ʻ���ټ�������");
            	 builder.setTitle("�°���Ҫ���ܸ���");
            	 
            	 builder.setNegativeButton("֪����", new DialogInterface.OnClickListener() {
            	    
            	  public void onClick(DialogInterface dialog, int which) {
            	  dialog.dismiss();
            	 }
            	 });
            	  builder.create().show();
        		String[] updateFields={"content"};
        		String[] updateValues={String.valueOf(CURRENT_VERSION)};
				String[] whereValue={"0"};
				mydb_3.update(DBParameter.tables_3[0], updateFields, updateValues, "id = ?", whereValue);
        	}
        else{
        		
        	}
        	
        	mydb_3.close();
        	c_2.close();
        }
        
        
        
        
        
        
 mydb_4=new MySQLiteOpenHelper(this,"mydb_4",null,DBParameter.version,DBParameter.tables_4,DBParameter.fieldNames_4,DBParameter.fieldTypes_4);
        
        
        String []fieldCursor4={"*"};
        
        Cursor c4=mydb_4.select(DBParameter.tables_4[0],fieldCursor4,"",null,null,null,null);
        
        if(c4.getCount()<1)
        {
        	
        	
        	
      mydb_4.logInitial();
     
      mydb_4.close();
      c4.close();
        }
        else
        {
        	
        	mydb_4.close();
        	c4.close();
        }
        
        
    }
    

    @Override 

    public boolean onTouchEvent(MotionEvent event) { 
    	if(event.getAction()==MotionEvent.ACTION_DOWN)
    	{
    		
    		final MyTask myTask = new MyTask();
    		if(myTask.isFull())
    		{
    			Intent intent=new  Intent();
				intent.setClass(Welcome.this, NavigatePage.class);
				startActivity(intent);
				finish();	
    		}
    		else
    		{
    			myTask.execute("");
    		}
    		
    	}
    	return true;

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
    
    
    private class MyTask extends AsyncTask<String, Integer, String> {  
	      

  		private ProgressDialog progressDialog;
  		private MySQLiteOpenHelper mydb;

  		//onPreExecute����������ִ�к�̨����ǰ��һЩUI����  
  	       @Override  
  	       protected void onPreExecute() {  
  	    	   progressDialog = new ProgressDialog(Welcome.this);     
  	    	    
  	    	   progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL); 
  	    	   progressDialog.setMessage("���Ժ�");   
  	    	   progressDialog.setTitle("��������¼����");   
  	    	   progressDialog.setProgress(0);   
  	    	   progressDialog.setMax(100);    
  	    	   progressDialog.show();    
  	    	   
  	       }  
  	         
  	       //doInBackground�����ڲ�ִ�к�̨����,�����ڴ˷������޸�UI  
  	       @Override  
  	       protected String doInBackground(String... params) {  
  	    	   
  	    	   mydb=new MySQLiteOpenHelper(Welcome.this,"mydb",null,DBParameter.version,DBParameter.tables,DBParameter.fieldNames,DBParameter.fieldTypes);
  	   		for(int pos=DBParameter.pos_wl_1,isLock=DBParameter.isLockTablePosInBase_1,pin=DBParameter.pinTablePosInBase_wl_1;pos<=DBParameter.pos_wl_49;pos++,isLock++,pin++)
  	   		{
  	   			subFill(pos,isLock,pin);  
  	   			publishProgress((int) ((pos / (float) DBParameter.pos_wl_49) * 100));  
  	   		}
  	    	   
  	    	   
  	      return null;
  	       }  
  	         
  	       //onProgressUpdate�������ڸ��½�����Ϣ  
  	       @Override  
  	       protected void onProgressUpdate(Integer... progresses) {  
  	            
  	    	   progressDialog.setProgress(progresses[0]);  
  	           
  	       }  
  	         
  	       //onPostExecute����������ִ�����̨��������UI,��ʾ���  
  	       @Override  
  	       protected void onPostExecute(String result) {  
  	    	   Intent intent=new  Intent();
    				intent.setClass(Welcome.this, NavigatePage.class);
    				startActivity(intent);
    				finish();
  	       }  
  	         
  	       //onCancelled����������ȡ��ִ���е�����ʱ����UI  
  	     
  	       
  	       /*  @Override  
  	       protected void onCancelled() {  
  	           Log.i(TAG, "onCancelled() called");  
  	           textView.setText("cancelled");  
  	           progressBar.setProgress(0);  
  	             
  	           execute.setEnabled(true);  
  	           cancel.setEnabled(false);  
  	       }  */
  	       
  	       
  	       
  	       public void subFill(int pos_wl,int isLockTablePosInBase,int pinTablePosInBase){
  	   		
  		       
  	           String[] f={"isLocked"};
  	    
  	           Cursor c=mydb.select(DBParameter.tables[isLockTablePosInBase],f,"",null,null,null,null);
  	           
  	           if(c.getCount()==0)
  	           {
  	           	
  	       	
  	           
  	           
  	           
  	           String[] fieldIniForPin={"pinId"};
  	           String[] valueIniForPin={"1"};
  	            
  	           
  	           mydb.insert(DBParameter.tables[pinTablePosInBase],fieldIniForPin,valueIniForPin);
  	          
  	           
  	           
  	           
  	           
  	           
  	           String[] fields={"isLocked"};
  	           String[] value={"yes"};
  	           	
  	           	
  	               
  	               mydb.insert(DBParameter.tables[isLockTablePosInBase], fields, value);///////���ݿ��ʼ��״̬����
  	               
  	               
  	               
  	               
  	               if(pos_wl==0)
  	                   mydb.initial(1);////װ����������
  	                   else if(pos_wl==1)
  	               	mydb.initial(2);
  	                   else if(pos_wl==2)
  	                   mydb.initial(3);////װ����������
  	                   else if(pos_wl==3)
  	                   mydb.initial(4);
  	                   else if(pos_wl==4)
  	                   mydb.initial(5);////װ����������
  	                   else if(pos_wl==5)
  	                   mydb.initial(6);
  	                   else if(pos_wl==6)
  	                   mydb.initial(7);////װ����������
  	                   else if(pos_wl==7)
  	                   mydb.initial(8);
  	                   else if(pos_wl==8)
  	                   mydb.initial(9);////װ����������
  	                   else  if(pos_wl==9)
  	                       mydb.initial(10);
  	                       else if(pos_wl==10)
  	                       mydb.initial(11);////װ����������
  	                       else if(pos_wl==11)
  	                       mydb.initial(12);
  	                       else if(pos_wl==12)
  	                       mydb.initial(13);////װ����������
  	                       else if(pos_wl==13)
  	                       mydb.initial(14);
  	                       else if(pos_wl==14)
  	                       mydb.initial(15);////װ����������
  	                       else if(pos_wl==15)
  	                       mydb.initial(16);
  	                       else if(pos_wl==16)
  	                       mydb.initial(17);////װ����������
  	                       else if(pos_wl==17)
  	                       mydb.initial(18);
  	                       else if(pos_wl==18)
  	                       mydb.initial(19);////װ����������
  	                       else if(pos_wl==19)
  	                       mydb.initial(20);
  	                       else if(pos_wl==20)
  	                       mydb.initial(21);////װ����������
  	                       else if(pos_wl==21)
  	                       mydb.initial(22);
  	                       else if(pos_wl==22)
  	                       mydb.initial(23);////װ����������
  	                       else if(pos_wl==23)
  	                       mydb.initial(24);
  	                       else if(pos_wl==24)
  	                       mydb.initial(25);////װ����������
  	                       else if(pos_wl==25)
  	                       mydb.initial(26);
  	                       else if(pos_wl==26)
  	                       mydb.initial(27);////װ����������
  	                       else  if(pos_wl==27)
  	                       mydb.initial(28);
  	                       else if(pos_wl==28)
  	                       mydb.initial(29);////װ����������
  	                       else if(pos_wl==29)
  	                       mydb.initial(30);
  	                       else if(pos_wl==30)
  	                       mydb.initial(31);////װ����������
  	                       else if(pos_wl==31)
  	                       mydb.initial(32);
  	                       else if(pos_wl==32)
  	                       mydb.initial(33);////װ����������
  	                       else if(pos_wl==33)
  	                       mydb.initial(34);
  	                       else if(pos_wl==34)
  	                       mydb.initial(35);////װ����������
  	                       else if(pos_wl==35)
  	                       mydb.initial(36);
  	                       else if(pos_wl==36)
  	                       mydb.initial(37);////װ����������
  	                       else if(pos_wl==37)
  	                       mydb.initial(38);
  	                       else if(pos_wl==38)
  	                       mydb.initial(39);////װ����������
  	                       else if(pos_wl==39)
  	                       mydb.initial(40);
  	                       else if(pos_wl==40)
  	                       mydb.initial(41);////װ����������
  	                       else if(pos_wl==41)
  	                       mydb.initial(42);
  	                       else if(pos_wl==42)
  	                       mydb.initial(43);////װ����������
  	                       else if(pos_wl==43)
  	                       mydb.initial(44);
  	                       else if(pos_wl==44)
  	                       mydb.initial(45);////װ����������
  	                       else  if(pos_wl==45)
  	                       mydb.initial(46);
  	                       else if(pos_wl==46)
  	                       mydb.initial(47);////װ����������
  	                       else if(pos_wl==47)
  	                       mydb.initial(48);
  	                       else if(pos_wl==48)
  	                       mydb.initial(49);////װ����������
  	   	}

  	   }
  	       
  	       
  	       public boolean isFull(){
  	   		
  	   		mydb=new MySQLiteOpenHelper(Welcome.this,"mydb",null,DBParameter.version,DBParameter.tables,DBParameter.fieldNames,DBParameter.fieldTypes);
  	   		
  	   		 String[] f={"isLocked"};
  	   		 
  	   		 
  	   		 Cursor c;
  	   		 int isLock;
  	   		 for(isLock = DBParameter.isLockTablePosInBase_1;isLock<=DBParameter.isLockTablePosInBase_49;isLock++)
  	   		 {
  	   			  
  	   			c=mydb.select(DBParameter.tables[isLock],f,"",null,null,null,null);
  	   			 
  	   			if(c.getCount()==0)
  	   			{
  	   				
  	   				return false;
  	   			}
  	   			
  	   		 }
  	   		 
  	   		 return true;
  	   	}
  	   } 
    
}