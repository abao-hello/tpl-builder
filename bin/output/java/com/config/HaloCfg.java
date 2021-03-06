package com.config;

import java.util.HashMap;

/***
 * HaloTbl.java
 * HaloCfg.java
 *
 * @Author: abaojin
 */
public class HaloTbl {

	// #主键
	private ﻿int Id;
	// 带有光环的怪物名称尾部需要使用括号包含该文字内容
	private string NameSuffix;
	// 程序不需要使用的描述字段
	private string Des;
	// 光环效果类别1冰2火3毒4吸5移动加速
	private int Type;
	// 光环效果的数值, 表示万分之
	private int Value;
	// 光环范围(米)
	private int Range;
	// 大尺寸光环特效ID
	private int ResLarge;
	// 中尺寸光环特效ID
	private int ResMid;
	// 小尺寸光环特效ID
	private int ResSmall;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public string getNameSuffix(){
		return NameSuffix
	}
	public void setNameSuffix(string NameSuffix){
		this.NameSuffix = NameSuffix
	}
	
	public string getDes(){
		return Des
	}
	public void setDes(string Des){
		this.Des = Des
	}
	
	public int getType(){
		return Type
	}
	public void setType(int Type){
		this.Type = Type
	}
	
	public int getValue(){
		return Value
	}
	public void setValue(int Value){
		this.Value = Value
	}
	
	public int getRange(){
		return Range
	}
	public void setRange(int Range){
		this.Range = Range
	}
	
	public int getResLarge(){
		return ResLarge
	}
	public void setResLarge(int ResLarge){
		this.ResLarge = ResLarge
	}
	
	public int getResMid(){
		return ResMid
	}
	public void setResMid(int ResMid){
		this.ResMid = ResMid
	}
	
	public int getResSmall(){
		return ResSmall
	}
	public void setResSmall(int ResSmall){
		this.ResSmall = ResSmall
	}
	
}

public class HaloCfg {
	public const string FILENAME = "Halo";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			HaloTbl record = new HaloTbl();
			
			record.NameSuffix = table.GetString(i, "NameSuffix");
			record.Des = table.GetString(i, "Des");
			record.Type = table.GetInt(i, "Type");
			record.Value = table.GetInt(i, "Value");
			record.Range = table.GetInt(i, "Range");
			record.ResLarge = table.GetInt(i, "ResLarge");
			record.ResMid = table.GetInt(i, "ResMid");
			record.ResSmall = table.GetInt(i, "ResSmall");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}