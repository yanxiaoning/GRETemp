package com.ningo.gk;

import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

import com.gfan.sdk.statitistics.GFAgent;

import db.DBParameter;

public class MainPage extends Activity implements OnClickListener{


	private MySQLiteOpenHelper mydb=null;
	
	private ImageView iv1;
	private ImageView iv2;
	private ImageView iv3;
	private ImageView iv4;
	private ImageView iv5;
	private ImageView iv6;
	private ImageView iv7;
	private ImageView iv8;
	private ImageView iv9;
	
	
	

	

	private ImageView iv10;

	private ImageView iv11;

	private ImageView iv12;

	private ImageView iv13;

	private ImageView iv14;

	private ImageView iv15;

	private ImageView iv16;

	private ImageView iv17;

	private ImageView iv18;

	private ImageView iv19;

	private ImageView iv20;

	private ImageView iv21;

	private ImageView iv22;

	private ImageView iv23;

	private ImageView iv24;

	private ImageView iv25;

	private ImageView iv26;

	private ImageView iv27;

	private ImageView iv28;

	private ImageView iv29;

	private ImageView iv30;

	private ImageView iv31;

	private ImageView iv32;

	private ImageView iv34;

	private ImageView iv33;

	private ImageView iv35;

	private ImageView iv36;

	private ImageView iv37;

	private ImageView iv38;

	private ImageView iv39;

	private ImageView iv40;

	private ImageView iv41;

	private ImageView iv42;

	private ImageView iv43;

	private ImageView iv44;

	private ImageView iv45;

	private ImageView iv46;

	private ImageView iv47;

	private ImageView iv48;

	private ImageView iv49;
	
	
	private String strTitle;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        
        setContentView(R.layout.main);
        setTitle("Lists");
     
        
         iv1=(ImageView)findViewById(R.id.iv_1);
         iv2=(ImageView)findViewById(R.id.iv_2);
         iv3=(ImageView)findViewById(R.id.iv_3);
         iv4=(ImageView)findViewById(R.id.iv_4);
         iv5=(ImageView)findViewById(R.id.iv_5);
         iv6=(ImageView)findViewById(R.id.iv_6);
         iv7=(ImageView)findViewById(R.id.iv_7);
         iv8=(ImageView)findViewById(R.id.iv_8);
         iv9=(ImageView)findViewById(R.id.iv_9);
         iv10=(ImageView)findViewById(R.id.iv_10);
         iv11=(ImageView)findViewById(R.id.iv_11);
         iv12=(ImageView)findViewById(R.id.iv_12);
         iv13=(ImageView)findViewById(R.id.iv_13);
         iv14=(ImageView)findViewById(R.id.iv_14);
         iv15=(ImageView)findViewById(R.id.iv_15);
         iv16=(ImageView)findViewById(R.id.iv_16);
         iv17=(ImageView)findViewById(R.id.iv_17);
         iv18=(ImageView)findViewById(R.id.iv_18);
         iv19=(ImageView)findViewById(R.id.iv_19);
         iv20=(ImageView)findViewById(R.id.iv_20);
         iv21=(ImageView)findViewById(R.id.iv_21);
         iv22=(ImageView)findViewById(R.id.iv_22);
         iv23=(ImageView)findViewById(R.id.iv_23);
         iv24=(ImageView)findViewById(R.id.iv_24);
         iv25=(ImageView)findViewById(R.id.iv_25);
         iv26=(ImageView)findViewById(R.id.iv_26);
         iv27=(ImageView)findViewById(R.id.iv_27);
         iv28=(ImageView)findViewById(R.id.iv_28);
         iv29=(ImageView)findViewById(R.id.iv_29);
         iv30=(ImageView)findViewById(R.id.iv_30);
         iv31=(ImageView)findViewById(R.id.iv_31);
         iv32=(ImageView)findViewById(R.id.iv_32);
         iv33=(ImageView)findViewById(R.id.iv_33);
         iv34=(ImageView)findViewById(R.id.iv_34);
        
         iv35=(ImageView)findViewById(R.id.iv_35);
         iv36=(ImageView)findViewById(R.id.iv_36);
         iv37=(ImageView)findViewById(R.id.iv_37);
         iv38=(ImageView)findViewById(R.id.iv_38);
         iv39=(ImageView)findViewById(R.id.iv_39);
         iv40=(ImageView)findViewById(R.id.iv_40);
         iv41=(ImageView)findViewById(R.id.iv_41);
         iv42=(ImageView)findViewById(R.id.iv_42);
         iv43=(ImageView)findViewById(R.id.iv_43);
         iv44=(ImageView)findViewById(R.id.iv_44);
         iv45=(ImageView)findViewById(R.id.iv_45);
         iv46=(ImageView)findViewById(R.id.iv_46);
         iv47=(ImageView)findViewById(R.id.iv_47);
         iv48=(ImageView)findViewById(R.id.iv_48);
         iv49=(ImageView)findViewById(R.id.iv_49);
         
         
       
         
       
        
     iv1.setOnClickListener(this);
     iv2.setOnClickListener(this);
     iv3.setOnClickListener(this);
     iv4.setOnClickListener(this);
     iv5.setOnClickListener(this);
     iv6.setOnClickListener(this);
     iv7.setOnClickListener(this);
     iv8.setOnClickListener(this);
     iv9.setOnClickListener(this);
     
     iv10.setOnClickListener(this);
     iv11.setOnClickListener(this);
     iv12.setOnClickListener(this);
     iv13.setOnClickListener(this);
     iv14.setOnClickListener(this);
     iv15.setOnClickListener(this);
     iv16.setOnClickListener(this);
     iv17.setOnClickListener(this);
     iv18.setOnClickListener(this);
     
     iv19.setOnClickListener(this);
     iv20.setOnClickListener(this);
     iv21.setOnClickListener(this);
     iv22.setOnClickListener(this);
     iv23.setOnClickListener(this);
     iv24.setOnClickListener(this);
     iv25.setOnClickListener(this);
     iv26.setOnClickListener(this);
     iv27.setOnClickListener(this);
     
     iv28.setOnClickListener(this);
     iv29.setOnClickListener(this);
     iv30.setOnClickListener(this);
     iv31.setOnClickListener(this);
     iv32.setOnClickListener(this);
     iv33.setOnClickListener(this);
     iv34.setOnClickListener(this);
     iv35.setOnClickListener(this);
     iv36.setOnClickListener(this);
     
     iv37.setOnClickListener(this);
     iv38.setOnClickListener(this);
     iv39.setOnClickListener(this);
     iv40.setOnClickListener(this);
     iv41.setOnClickListener(this);
     iv42.setOnClickListener(this);
     iv43.setOnClickListener(this);
     iv44.setOnClickListener(this);
     iv45.setOnClickListener(this);
     
     iv46.setOnClickListener(this);
     iv47.setOnClickListener(this);
     iv48.setOnClickListener(this);
     iv49.setOnClickListener(this);
     
   
        
        
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
    }
	public void onClick(View v){
		
		
		MySQLiteOpenHelper mydb_4=new MySQLiteOpenHelper(this,"mydb_4",null,DBParameter.version,DBParameter.tables_4,DBParameter.fieldNames_4,DBParameter.fieldTypes_4);
		
		String []selectField={"month","date"};
		Calendar c=Calendar.getInstance();
		 String []strWhich={String.valueOf(c.get(Calendar.MONTH)+1),String.valueOf(c.get(Calendar.DATE))};
		
		
		if(v.equals(iv1))
    	{strTitle="List 1"; 
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_1+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_1,DBParameter.isLockTablePosInBase_1,DBParameter.pinTablePosInBase_wl_1);  
    	     
    	}
    	else if(v.equals(iv2))
    	{ strTitle="List 2";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_2+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_2,DBParameter.isLockTablePosInBase_2,DBParameter.pinTablePosInBase_wl_2); 
    	}else if(v.equals(iv3))
    	{strTitle="List 3";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_3+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_3,DBParameter.isLockTablePosInBase_3,DBParameter.pinTablePosInBase_wl_3); 
    	}else if(v.equals(iv4))
    	{ strTitle="List 4";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_4+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_4,DBParameter.isLockTablePosInBase_4,DBParameter.pinTablePosInBase_wl_4); 
    		
    	}else if(v.equals(iv5))
    	{ strTitle="List 5";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_5+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_5,DBParameter.isLockTablePosInBase_5,DBParameter.pinTablePosInBase_wl_5); 
    		
    	}else if(v.equals(iv6))
    	{ strTitle="List 6";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_6+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_6,DBParameter.isLockTablePosInBase_6,DBParameter.pinTablePosInBase_wl_6); 
    		
    	}else if(v.equals(iv7))
    	{ strTitle="List 7";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_7+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_7,DBParameter.isLockTablePosInBase_7,DBParameter.pinTablePosInBase_wl_7); 
    		
    	}else if(v.equals(iv8))
    	{
    		strTitle="List 8";
    		String whereValue[]={String.valueOf(DBParameter.pos_wl_8+1)};
    		
   		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
   		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_8,DBParameter.isLockTablePosInBase_8,DBParameter.pinTablePosInBase_wl_8); 
    	}else if(v.equals(iv9))
    	{ strTitle="List 9";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_9+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_9,DBParameter.isLockTablePosInBase_9,DBParameter.pinTablePosInBase_wl_9); 
    		
    	}else if(v.equals(iv10))
    	{strTitle="List 10";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_10+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_10,DBParameter.isLockTablePosInBase_10,DBParameter.pinTablePosInBase_wl_10);  
    	     
    	}
    	else if(v.equals(iv11))
    	{ strTitle="List 11";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_11+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_11,DBParameter.isLockTablePosInBase_11,DBParameter.pinTablePosInBase_wl_11); 
    	}else if(v.equals(iv12))
    	{strTitle="List 12";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_12+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_12,DBParameter.isLockTablePosInBase_12,DBParameter.pinTablePosInBase_wl_12); 
    	}else if(v.equals(iv13))
    	{ strTitle="List 13";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_13+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_13,DBParameter.isLockTablePosInBase_13,DBParameter.pinTablePosInBase_wl_13); 
    		
    	}else if(v.equals(iv14))
    	{ strTitle="List 14";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_14+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_14,DBParameter.isLockTablePosInBase_14,DBParameter.pinTablePosInBase_wl_14); 
    		
    	}else if(v.equals(iv15))
    	{ strTitle="List 15";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_15+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_15,DBParameter.isLockTablePosInBase_15,DBParameter.pinTablePosInBase_wl_15); 
    		
    	}else if(v.equals(iv16))
    	{ strTitle="List 16";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_16+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_16,DBParameter.isLockTablePosInBase_16,DBParameter.pinTablePosInBase_wl_16); 
    		
    	}else if(v.equals(iv17))
    	{
    		strTitle="List 17";
    		String whereValue[]={String.valueOf(DBParameter.pos_wl_17+1)};
    		
   		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
   		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_17,DBParameter.isLockTablePosInBase_17,DBParameter.pinTablePosInBase_wl_17); 
    	}else if(v.equals(iv18))
    	{ strTitle="List 18";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_18+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_18,DBParameter.isLockTablePosInBase_18,DBParameter.pinTablePosInBase_wl_18); 
    		
    	}else if(v.equals(iv19))
    	{strTitle="List 19";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_19+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_19,DBParameter.isLockTablePosInBase_19,DBParameter.pinTablePosInBase_wl_19);  
    	     
    	}
    	else if(v.equals(iv20))
    	{ strTitle="List 20";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_20+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_20,DBParameter.isLockTablePosInBase_20,DBParameter.pinTablePosInBase_wl_20); 
    	}else if(v.equals(iv21))
    	{strTitle="List 21";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_21+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_21,DBParameter.isLockTablePosInBase_21,DBParameter.pinTablePosInBase_wl_21); 
    	}else if(v.equals(iv22))
    	{ strTitle="List 22";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_22+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_22,DBParameter.isLockTablePosInBase_22,DBParameter.pinTablePosInBase_wl_22); 
    		
    	}else if(v.equals(iv23))
    	{ strTitle="List 23";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_23+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_23,DBParameter.isLockTablePosInBase_23,DBParameter.pinTablePosInBase_wl_23); 
    		
    	}else if(v.equals(iv24))
    	{ strTitle="List 24";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_24+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_24,DBParameter.isLockTablePosInBase_24,DBParameter.pinTablePosInBase_wl_24); 
    		
    	}else if(v.equals(iv25))
    	{ strTitle="List 25";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_25+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_25,DBParameter.isLockTablePosInBase_25,DBParameter.pinTablePosInBase_wl_25); 
    		
    	}else if(v.equals(iv26))
    	{strTitle="List 26";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_26+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();    		
    		mainToWord(DBParameter.pos_wl_26,DBParameter.isLockTablePosInBase_26,DBParameter.pinTablePosInBase_wl_26); 
    	}else if(v.equals(iv27))
    	{ strTitle="List 27";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_27+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_27,DBParameter.isLockTablePosInBase_27,DBParameter.pinTablePosInBase_wl_27); 
    		
    	}else if(v.equals(iv28))
    	{strTitle="List 28";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_28+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_28,DBParameter.isLockTablePosInBase_28,DBParameter.pinTablePosInBase_wl_28);  
    	     
    	}
    	else if(v.equals(iv29))
    	{ strTitle="List 29";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_29+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_29,DBParameter.isLockTablePosInBase_29,DBParameter.pinTablePosInBase_wl_29); 
    	}else if(v.equals(iv30))
    	{strTitle="List 30";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_30+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_30,DBParameter.isLockTablePosInBase_30,DBParameter.pinTablePosInBase_wl_30); 
    	}else if(v.equals(iv31))
    	{ strTitle="List 31";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_31+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_31,DBParameter.isLockTablePosInBase_31,DBParameter.pinTablePosInBase_wl_31); 
    		
    	}else if(v.equals(iv32))
    	{ strTitle="List 32";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_32+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_32,DBParameter.isLockTablePosInBase_32,DBParameter.pinTablePosInBase_wl_32); 
    		
    	}else if(v.equals(iv33))
    	{ strTitle="List 33";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_33+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_33,DBParameter.isLockTablePosInBase_33,DBParameter.pinTablePosInBase_wl_33); 
    		
    	}else if(v.equals(iv34))
    	{ strTitle="List 34";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_34+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_34,DBParameter.isLockTablePosInBase_34,DBParameter.pinTablePosInBase_wl_34); 
    		
    	}else if(v.equals(iv35))
    	{strTitle="List 35";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_35+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_35,DBParameter.isLockTablePosInBase_35,DBParameter.pinTablePosInBase_wl_35); 
    	}else if(v.equals(iv36))
    	{ strTitle="List 36";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_36+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_36,DBParameter.isLockTablePosInBase_36,DBParameter.pinTablePosInBase_wl_36); 
    		
    	}else if(v.equals(iv37))
    	{strTitle="List 37";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_37+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_37,DBParameter.isLockTablePosInBase_37,DBParameter.pinTablePosInBase_wl_37);  
    	     
    	}
    	else if(v.equals(iv38))
    	{ strTitle="List 38";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_38+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_38,DBParameter.isLockTablePosInBase_38,DBParameter.pinTablePosInBase_wl_38); 
    	}else if(v.equals(iv39))
    	{strTitle="List 39";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_39+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_39,DBParameter.isLockTablePosInBase_39,DBParameter.pinTablePosInBase_wl_39); 
    	}else if(v.equals(iv40))
    	{ strTitle="List 40";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_40+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_40,DBParameter.isLockTablePosInBase_40,DBParameter.pinTablePosInBase_wl_40); 
    		
    	}else if(v.equals(iv41))
    	{ strTitle="List 41";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_41+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_41,DBParameter.isLockTablePosInBase_41,DBParameter.pinTablePosInBase_wl_41); 
    		
    	}else if(v.equals(iv42))
    	{ strTitle="List 42";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_42+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_42,DBParameter.isLockTablePosInBase_42,DBParameter.pinTablePosInBase_wl_42); 
    		
    	}else if(v.equals(iv43))
    	{ strTitle="List 43";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_43+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_43,DBParameter.isLockTablePosInBase_43,DBParameter.pinTablePosInBase_wl_43); 
    		
    	}else if(v.equals(iv44))
    	{strTitle="List 44";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_44+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_44,DBParameter.isLockTablePosInBase_44,DBParameter.pinTablePosInBase_wl_44); 
    	}else if(v.equals(iv45))
    	{ strTitle="List 45";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_45+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_45,DBParameter.isLockTablePosInBase_45,DBParameter.pinTablePosInBase_wl_45); 
    		
    	}else if(v.equals(iv46))
    	{strTitle="List 46";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_46+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_46,DBParameter.isLockTablePosInBase_46,DBParameter.pinTablePosInBase_wl_46);  
    	     
    	}
    	else if(v.equals(iv47))
    	{ strTitle="List 47";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_47+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_47,DBParameter.isLockTablePosInBase_47,DBParameter.pinTablePosInBase_wl_47); 
    	}else if(v.equals(iv48))
    	{strTitle="List 48";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_48+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_48,DBParameter.isLockTablePosInBase_48,DBParameter.pinTablePosInBase_wl_48); 
    	}else if(v.equals(iv49))
    	{ strTitle="List 49";
    	String whereValue[]={String.valueOf(DBParameter.pos_wl_49+1)};
		
		 mydb_4.update(DBParameter.tables_4[0], selectField, strWhich, "list_value = ?", whereValue);//？对应的whereValue，询问的是whereValue的值是多少
		 mydb_4.close();
    		mainToWord(DBParameter.pos_wl_49,DBParameter.isLockTablePosInBase_49,DBParameter.pinTablePosInBase_wl_49); 
    		
    	}
    	
    	
    }
	

	public void mainToWord(int pos_wl,int isLockTablePosInBase,int pinTablePosInBase){
		Intent intent=new  Intent();
    	intent.setClass(MainPage.this,WordPage.class);
		
		mydb=new MySQLiteOpenHelper(this,"mydb",null,DBParameter.version,DBParameter.tables,DBParameter.fieldNames,DBParameter.fieldTypes);
	       
        String[] f={"isLocked"};
 
        Cursor c=mydb.select(DBParameter.tables[isLockTablePosInBase],f,"",null,null,null,null);
        
        if(c.getCount()==0)
        {
        	Toast.makeText(getApplicationContext(), "---首次打开该list---",
			     Toast.LENGTH_SHORT).show();
    	
        
        
        
        String[] fieldIniForPin={"pinId"};
        String[] valueIniForPin={"1"};
         
        
        mydb.insert(DBParameter.tables[pinTablePosInBase],fieldIniForPin,valueIniForPin);
       
        
        
        
        
        
        String[] fields={"isLocked"};
        String[] value={"yes"};
        	
        	
            
            mydb.insert(DBParameter.tables[isLockTablePosInBase], fields, value);///////数据库初始化状态更改
            
            
            
                     if(pos_wl==0)
                mydb.initial(1);////装载主体内容
                else if(pos_wl==1)
            	mydb.initial(2);
                else if(pos_wl==2)
                mydb.initial(3);////装载主体内容
                else if(pos_wl==3)
                mydb.initial(4);
                else if(pos_wl==4)
                mydb.initial(5);////装载主体内容
                else if(pos_wl==5)
                mydb.initial(6);
                else if(pos_wl==6)
                mydb.initial(7);////装载主体内容
                else if(pos_wl==7)
                mydb.initial(8);
                else if(pos_wl==8)
                mydb.initial(9);////装载主体内容
                else  if(pos_wl==9)
                    mydb.initial(10);
                    else if(pos_wl==10)
                    mydb.initial(11);////装载主体内容
                    else if(pos_wl==11)
                    mydb.initial(12);
                    else if(pos_wl==12)
                    mydb.initial(13);////装载主体内容
                    else if(pos_wl==13)
                    mydb.initial(14);
                    else if(pos_wl==14)
                    mydb.initial(15);////装载主体内容
                    else if(pos_wl==15)
                    mydb.initial(16);
                    else if(pos_wl==16)
                    mydb.initial(17);////装载主体内容
                    else if(pos_wl==17)
                    mydb.initial(18);
                    else if(pos_wl==18)
                    mydb.initial(19);////装载主体内容
                    else if(pos_wl==19)
                    mydb.initial(20);
                    else if(pos_wl==20)
                    mydb.initial(21);////装载主体内容
                    else if(pos_wl==21)
                    mydb.initial(22);
                    else if(pos_wl==22)
                    mydb.initial(23);////装载主体内容
                    else if(pos_wl==23)
                    mydb.initial(24);
                    else if(pos_wl==24)
                    mydb.initial(25);////装载主体内容
                    else if(pos_wl==25)
                    mydb.initial(26);
                    else if(pos_wl==26)
                    mydb.initial(27);////装载主体内容
                    else  if(pos_wl==27)
                    mydb.initial(28);
                    else if(pos_wl==28)
                    mydb.initial(29);////装载主体内容
                    else if(pos_wl==29)
                    mydb.initial(30);
                    else if(pos_wl==30)
                    mydb.initial(31);////装载主体内容
                    else if(pos_wl==31)
                    mydb.initial(32);
                    else if(pos_wl==32)
                    mydb.initial(33);////装载主体内容
                    else if(pos_wl==33)
                    mydb.initial(34);
                    else if(pos_wl==34)
                    mydb.initial(35);////装载主体内容
                    else if(pos_wl==35)
                    mydb.initial(36);
                    else if(pos_wl==36)
                    mydb.initial(37);////装载主体内容
                    else if(pos_wl==37)
                    mydb.initial(38);
                    else if(pos_wl==38)
                    mydb.initial(39);////装载主体内容
                    else if(pos_wl==39)
                    mydb.initial(40);
                    else if(pos_wl==40)
                    mydb.initial(41);////装载主体内容
                    else if(pos_wl==41)
                    mydb.initial(42);
                    else if(pos_wl==42)
                    mydb.initial(43);////装载主体内容
                    else if(pos_wl==43)
                    mydb.initial(44);
                    else if(pos_wl==44)
                    mydb.initial(45);////装载主体内容
                    else  if(pos_wl==45)
                    mydb.initial(46);
                    else if(pos_wl==46)
                    mydb.initial(47);////装载主体内容
                    else if(pos_wl==47)
                    mydb.initial(48);
                    else if(pos_wl==48)
                    mydb.initial(49);////装载主体内容
                
               
            
            
            
        }
        else
        {
        	
        	
        	
        	
        	
        	Toast.makeText(getApplicationContext(), "数据已装载",
				     Toast.LENGTH_SHORT).show();
        	
        	
        	
        	
        	
        	
        	
        }
        c.close();
        mydb.close();
    		Bundle bundle=new Bundle();
			bundle.putInt("tablePosition", pos_wl);
    		bundle.putInt("pinTablePosition", pinTablePosInBase);
    		
    		bundle.putString("strTitle", strTitle);
    		bundle.putString("source", "MainPage");
    		
    		intent.putExtras(bundle);
        	
        	
    	    startActivity(intent);
    	    

    	    finish();
	}
	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		
         	int idGroup1=0;
         	
         	
         	int orderItem1=Menu.NONE;
         	int orderItem2=Menu.NONE;
         	int orderItem3=Menu.NONE;
         	int orderItem4=Menu.NONE;
         	 
         	
         	menu.add(idGroup1,MENU_GO_TO_2,orderItem1,R.string.str_main_2).setIcon(android.R.drawable.ic_menu_add);
         	menu.add(idGroup1,MENU_GO_TO_3,orderItem2,R.string.str_main_3).setIcon(android.R.drawable.ic_menu_add);
         	menu.add(idGroup1,MENU_GO_TO_4,orderItem3,R.string.str_main_4).setIcon(android.R.drawable.ic_menu_add);
         	menu.add(idGroup1,MENU_GO_TO_5,orderItem4,R.string.str_main_5).setIcon(android.R.drawable.ic_menu_add);
         	menu.add(idGroup1,MENU_GO_TO_6,orderItem4,R.string.str_main_6).setIcon(android.R.drawable.ic_menu_add);
         	return super.onCreateOptionsMenu(menu);
         
	}
	


	
	@Override
	public boolean onMenuItemSelected(int featureId,MenuItem item){
	//	timer.cancel();   
    	Intent intent=new  Intent();
    	Bundle bundle=new Bundle();
    	switch(item.getItemId())
    	{
    	case(MENU_GO_TO_2):
    		if(mydb!=null&&mydb.getReadableDatabase().isOpen())
    		{
    			
    			mydb.close();
    		}
    		
    		intent.setClass(MainPage.this, MainPage_2.class);
    		
			
    		startActivity(intent);
    		finish();
    	break;	
    	
    	
    	case(MENU_GO_TO_3):
    		if(mydb!=null&&mydb.getReadableDatabase().isOpen())
			{
    			mydb.close();
			}
			
			intent.setClass(MainPage.this, MainPage_3.class);
			startActivity(intent);
			finish();
    	break;
    	
    	case(MENU_GO_TO_4):
    		if(mydb!=null&&mydb.getReadableDatabase().isOpen())
    		{
    			
    			mydb.close();
    		}
    		
    		intent.setClass(MainPage.this, MainPage_4.class);
    		
			
			
			
    		startActivity(intent);
    		finish();
    	break;//
    	case(MENU_GO_TO_5):
    		if(mydb!=null&&mydb.getReadableDatabase().isOpen())
    		{
    			
    			mydb.close();
    		}
    		
    		intent.setClass(MainPage.this, MainPage_5.class);
    		
			
    		startActivity(intent);
    		finish();
    	break;	
    	case(MENU_GO_TO_6):
    		if(mydb!=null&&mydb.getReadableDatabase().isOpen())
    		{
    			
    			mydb.close();
    		}
    		
    		intent.setClass(MainPage.this, MainPage_6.class);
    		
			
    		startActivity(intent);
    		finish();
    	break;	
    	}

    	return super.onMenuItemSelected(featureId, item);
    }
	*/
	
	@Override

	public boolean onKeyDown(int keyCode, KeyEvent event) {

		

		//按下键盘上返回按钮

		if(keyCode == KeyEvent.KEYCODE_BACK){
			Intent intent=new Intent(MainPage.this, NavigatePage.class);
 
			if(mydb!=null&&mydb.getReadableDatabase().isOpen())
			{
    			mydb.close();
			}
			
			
			
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			
			
			
			
			
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
