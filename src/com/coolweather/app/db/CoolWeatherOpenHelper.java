package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/*
 * 该包是建立数据库
 */

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	// 省份
	public static final String CREATE_PROVINCE = "create table Province ( id integer primary key autoincrement,province_name text,province_code text )";
	// 城市(引用外键跟省份关联)
	public static final String CREATE_CITY = "create table City ( id integer primary key autoincrement,city_name text,city_code text,province_id integer";
	// 县(引用城市与县关联)
	public static final String CREATE_COUNT = "create table Count ( id integer primary key autoincrement,count_name text,count_code text,city_id integer";

	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_PROVINCE);
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNT);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
