package com.ningo.gk;

import db.DBParameter;
import wordLists.WordLists;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;


public class MySQLiteOpenHelper extends SQLiteOpenHelper 
{
	public String TableNames[];//设置变量
	public String FieldNames[][];//设置数据库要设置为二维数组，第一维是表，第二维是域。
	public String FieldTypes[][];
	public static String NO_CREATE_TABLES="no tables";
	private String message="";
	
	private SQLiteDatabase dbInitial=null;//初始化
	  

	
	
	
	
	
	
	
	public MySQLiteOpenHelper(Context context,String dbName,CursorFactory factory,
			int version,String tableNames[],String fieldNames[][],String fieldTypes[][])
	{
		super(context,dbName,factory,version);
		TableNames=tableNames;
		FieldNames=fieldNames;
		FieldTypes=fieldTypes;
			
	}
	@Override
	public void onCreate(SQLiteDatabase db)
	{
		if(TableNames==null)
		{
			message=NO_CREATE_TABLES;
			return;
		}
		for(int i=0;i<TableNames.length;i++)
		{
			String sql="CREATE TABLE "+TableNames[i]+" (";
			for(int j=0;j<FieldNames[i].length;j++)
			{
				sql+=FieldNames[i][j]+" "+FieldTypes[i][j]+",";
			}
			sql=sql.substring(0,sql.length()-1);
			sql+=")";
			db.execSQL(sql);
		}
	}
	@Override
	public void onUpgrade(SQLiteDatabase db,int arg1,int arg2)
	{
		for(int i=0;i<TableNames[i].length();i++)
		{
			String sql="DROP TABLE IF EXISTS "+TableNames[i];
			db.execSQL(sql);
			
		}
		onCreate(db);
	}
	
	public void execSQL(String sql)throws java.sql.SQLException
	{
		SQLiteDatabase db=this.getWritableDatabase();
		db.execSQL(sql);
	}
	
	
	public Cursor select(String table,String[] columns,String selection,
			String[] selectionArgs,String groupBy,String having,String orderBy)
	{
		SQLiteDatabase db=this.getReadableDatabase();
		Cursor cursor=db.query(table, columns, selection, selectionArgs, groupBy, having, orderBy);
		return cursor;
	}
	
	
	public long insert(String table,String fields[],String values[])
	{
		SQLiteDatabase db=this.getWritableDatabase();
		ContentValues cv=new ContentValues();
		for(int i=0;i<fields.length;i++)
		{
			cv.put(fields[i], values[i]);
		}
		return db.insert(table, null, cv);
	}
	
	 public void configInitial()//welcome界面初始化设置
	    {
		 SQLiteDatabase configInitial=getWritableDatabase();
		
		
		
		
	    configInitial.beginTransaction();        //手动设置开始事务

	    	ContentValues cv=new ContentValues();
	    	
	    		cv.put("property", "fontSize");
	    		cv.put("current_situation", "0");
	    		
	    		
	    	
	    		configInitial.insert(DBParameter.tables_2[0], null, cv);
	    		
	    		
	    		ContentValues cv_2= new ContentValues();
	    		cv_2.put("property", "fontColor");
	    		cv_2.put("current_situation", "0");
	    		
	    	
	    		configInitial.insert(DBParameter.tables_2[0], null, cv_2);
	    		
	    		
	    		configInitial.setTransactionSuccessful();        //设置事务处理成功，不设置会自动回滚不提交
	    		configInitial.endTransaction(); 
	    		   
	    		configInitial.close();
	    }
	 
	 
	 
	 public void logInitial()//welcome界面初始化设置
	    {
		 SQLiteDatabase logInitial=getWritableDatabase();
		
		
		
		
		 logInitial.beginTransaction();        //手动设置开始事务

	    	ContentValues cv=new ContentValues();
	    	
	    		cv.put("list_value", "1");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "2");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "3");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "4");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "5");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "6");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "7");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "8");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "9");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "10");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "11");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "12");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "13");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "14");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "15");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "16");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "17");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "18");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "19");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "20");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "21");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "22");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "23");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "24");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "25");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "26");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "27");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "28");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "29");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "30");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "31");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "32");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "33");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "34");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "35");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "36");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "37");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "38");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "39");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "40");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "41");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "42");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "43");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "44");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "45");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "46");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "47");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "48");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		cv.put("list_value", "49");
	    		cv.put("month", "0");
	    		cv.put("date", "0");
	    		logInitial.insert(DBParameter.tables_4[0], null, cv);
	    		
	    	
	    		
	    		
	    		
	    	/*	ContentValues cv_2= new ContentValues();
	    		cv_2.put("property", "fontColor");
	    		cv_2.put("current_situation", "0");
	    		*/
	    	
	    		//configInitial.insert(DBParameter.tables_2[0], null, cv_2);
	    		
	    		
	    		logInitial.setTransactionSuccessful();        //设置事务处理成功，不设置会自动回滚不提交
	    		logInitial.endTransaction(); 
	    		   
	    		logInitial.close();
	    }
	 
	 
	
	 public void notification()
	 {
		 SQLiteDatabase notify=getWritableDatabase();
			
			
			
			
		 notify.beginTransaction();        //手动设置开始事务

		    	ContentValues cv=new ContentValues();
		    	cv.put("id", String.valueOf("0"));
		    		cv.put("content", String.valueOf(Welcome.CURRENT_VERSION));
		    		
		    		
		    		
		    	
		    		notify.insert(DBParameter.tables_3[0], null, cv);
		    		
		    		
		    		
		    		
		    		
		    		notify.setTransactionSuccessful();        //设置事务处理成功，不设置会自动回滚不提交
		    		notify.endTransaction(); 
		    		   
		    		notify.close(); 
	 }
	 
	 
public void initial(int number){
	
	dbInitial=this.getWritableDatabase();
	
	
	
	
	dbInitial.beginTransaction();        //手动设置开始事务

	//数据插入操作循环

	


	  WordLists wordList=new WordLists(dbInitial,TableNames);
	 
	  
	  if(number==1)
	  wordList.doList_1();
	  else if(number==2)
		  wordList.doList_2();//插数据，每一个单词列表
	  else if(number==3)
		  wordList.doList_3();
	  else if(number==4)
		  wordList.doList_4();
	  else if(number==5)
		  wordList.doList_5();
	  else if(number==6)
		  wordList.doList_6();
	  else if(number==7)
		  wordList.doList_7();
	  else if(number==8)
		  wordList.doList_8();
	  else if(number==9)
		  wordList.doList_9();
	  else if(number==10)
		  wordList.doList_10();
	  else if(number==11)
		  wordList.doList_11();
	  else if(number==12)
			  wordList.doList_12();
	  else if(number==13)
			  wordList.doList_13();
	  else if(number==14)
			  wordList.doList_14();
	  else if(number==15)
			  wordList.doList_15();
	  else if(number==16)
			  wordList.doList_16();
	  else if(number==17)
			  wordList.doList_17();
	  else if(number==18)
			  wordList.doList_18();
	  else if(number==19)
			  wordList.doList_19();
	  else if(number==20)
		  wordList.doList_20();
	  else if(number==21)
		  wordList.doList_21();
	  else if(number==22)
			  wordList.doList_22();
	  else if(number==23)
			  wordList.doList_23();
	  else if(number==24)
			  wordList.doList_24();
	  else if(number==25)
			  wordList.doList_25();
	  else if(number==26)
			  wordList.doList_26();
	  else if(number==27)
			  wordList.doList_27();
	  else if(number==28)
			  wordList.doList_28();
	  else if(number==29)
			  wordList.doList_29();
	  else if(number==30)
		  wordList.doList_30();
	  else if(number==31)
		  wordList.doList_31();
	  else if(number==32)
			  wordList.doList_32();
	  else if(number==33)
			  wordList.doList_33();
	  else if(number==34)
			  wordList.doList_34();
	  else if(number==35)
			  wordList.doList_35();
	  else if(number==36)
			  wordList.doList_36();
	  else if(number==37)
			  wordList.doList_37();
	  else if(number==38)
			  wordList.doList_38();
	  else if(number==39)
			  wordList.doList_39();
	  else if(number==40)
		  wordList.doList_40();
	  else if(number==41)
		  wordList.doList_41();
	  else if(number==42)
			  wordList.doList_42();
	  else if(number==43)
			  wordList.doList_43();
	  else if(number==44)
			  wordList.doList_44();
	  else if(number==45)
			  wordList.doList_45();
	  else if(number==46)
			  wordList.doList_46();
	  else if(number==47)
			  wordList.doList_47();
	  else if(number==48)
			  wordList.doList_48();
	  else if(number==49)
			  wordList.doList_49();
	 
	
	
	
	
	
	
	dbInitial.setTransactionSuccessful();        //设置事务处理成功，不设置会自动回滚不提交
	dbInitial.endTransaction(); 
	   
	dbInitial.close();
	
}
	
	public int delete(String table,String where,String[] whereValue)
	{
		SQLiteDatabase db=this.getWritableDatabase();
		return db.delete(table, where, whereValue);
	}
	
	public int update(String table,String updateFields[],String updateValues[],String where,String[] whereValue)
	{
		SQLiteDatabase db=this.getWritableDatabase();
		
		ContentValues cv=new ContentValues();
		for(int i=0;i<updateFields.length;i++)
		{
			cv.put(updateFields[i], updateValues[i]);//存一个数据元组
		}
		return db.update(table, cv, where,whereValue);
	}
	
	public String getMessage()
	{
		return message;
	}
	@Override
	public synchronized void close()
	{
		super.close();
	}


}
