package com.config;

import java.util.HashMap;

/***
 * MonsterTbl.java
 * MonsterCfg.java
 *
 * @Author: abaojin
 */
public class MonsterTbl {

	// #主键
	private ﻿int Id;
	// 等级
	private int Levle;
	// 程序不用的数据备注
	private string Des;
	// 提供经验值
	private int Exp;
	// 名称
	private string Name;
	// 模型文件路径
	private string Model;
	// 怪物拥有的技能
	private string SkillId;
	// 死亡效果（没有为空）
	private int DeadEffect;
	// 死亡音效（音效表ID）
	private int DeadSound;
	// 攻击音效（音效表ID）
	private int AttackSound;
	// 待机音效（音效表ID）
	private int WaitSound;
	// 被击音效(音效ID)
	private int HitSound;
	// 是否使用世界掉落数据
	private int IsUseWorldDrop;
	// 掉落道具列表
	private string DropItemList;
	// 掉落道具概率(/10000)
	private string DropChanceList;
	// 掉落数量列表
	private string DropCountList;
	// 掉落次数
	private int DropCount;
	// 蓝色精英掉落道具列表
	private string BlueDropItemList;
	// 蓝色精英掉落道具概率(/10000)
	private string BlueDropChanceList;
	// 蓝色精英掉落数量列表
	private string BlueDropCountList;
	// 蓝色精英掉落次数
	private int BlueDropCount;
	// 蓝色精英怪额外附加的掉宝值, 同角色的MF值作用
	private int BlueMfBouns;
	// 金色精英掉落道具列表
	private string GoldDropItemList;
	// 金色精英掉落道具概率(/10000)
	private string GoldDropChanceList;
	// 金色精英掉落数量列表
	private string GoldDropCountList;
	// 金色精英掉落次数
	private int GoldDropCount;
	// 金色精英怪额外附加的掉宝值, 同角色的MF值作用
	private int GoldMfBouns;
	// 稀有度1装备掉落权重
	private int EquipmentRarity1Chance;
	// 稀有度2装备掉落权重
	private int EquipmentRarity2Chance;
	// 稀有度3装备掉落权重
	private int EquipmentRarity3Chance;
	// 稀有度4装备掉落权重
	private int EquipmentRarity4Chance;
	// 稀有度5装备掉落权重
	private int EquipmentRarity5Chance;
	// 力量
	private int Str;
	// 智力
	private int Wit;
	// 物攻下限
	private int AtkMin;
	// 物攻上限
	private int AtkMax;
	// 魔攻下限
	private int MtkMin;
	// 魔攻上限
	private int MtkMax;
	// 幸运一击概率
	private int CrtChance;
	// 幸运一击倍率
	private int CrtBonus;
	// 卓越一击概率
	private int BrilliantChance;
	// 物理护甲穿透
	private int DefPierce;
	// 魔法护甲穿透
	private int MdefPierce;
	// 无视防御概率
	private int IgnoreAllDef;
	// 双倍伤害概率
	private int DoubleChance;
	// 攻击力增加百分比
	private int AllAtkBonus;
	// 敏捷
	private int Dex;
	// 体力
	private int Vit;
	// 物理防御
	private int Def;
	// 魔法防御
	private int Mdef;
	// 生命值上限
	private int Hp;
	// 血条数量
	private int HpNum;
	// 抗幸运一击概率
	private int CrtChanceResist;
	// 抗幸运一击伤害
	private int CrtBonusResist;
	// 生命值提升百分比
	private int HpBonus;
	// 伤害减少百分比
	private int DmgReduce;
	// 反伤比例
	private int ReboundDmg;
	// 对BOSS护甲伤害提升
	private int BonusToArmor;
	// 对怪物伤害提升
	private int BonusToMonster;
	// 经验提升
	private int ExpUp;
	// 击杀怪物后恢复生命
	private int KillCure;
	// 掉宝加成值
	private int MF;
	// 怪物伤害类型1物理2魔法
	private int DamageType;
	// BOO怪护盾(护甲)最大值
	private int BossShield;
	// 特效缩放
	private float EffectScale;
	// 视野范围半径, 单位米, 对于该范围内的敌对目标进行攻击AI
	private int ViewRange;
	// 阴影缩放值
	private float ShadowScale;
	// 怪物追击最大范围(米)
	private int FollowRange;
	// 移动速度(厘米/秒)
	private int MoveSpeed;
	// 动画速度
	private float AnimationSpeed;
	// 精英怪缩放尺寸
	private float EliteScale;
	// 怪物包含的光环列表, 多个光环使用下划线分隔, 刷新时随机取1个
	private string HaloList;
	// 光环尺寸
	private int HaloScaleType;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public int getLevle(){
		return Levle
	}
	public void setLevle(int Levle){
		this.Levle = Levle
	}
	
	public string getDes(){
		return Des
	}
	public void setDes(string Des){
		this.Des = Des
	}
	
	public int getExp(){
		return Exp
	}
	public void setExp(int Exp){
		this.Exp = Exp
	}
	
	public string getName(){
		return Name
	}
	public void setName(string Name){
		this.Name = Name
	}
	
	public string getModel(){
		return Model
	}
	public void setModel(string Model){
		this.Model = Model
	}
	
	public string getSkillId(){
		return SkillId
	}
	public void setSkillId(string SkillId){
		this.SkillId = SkillId
	}
	
	public int getDeadEffect(){
		return DeadEffect
	}
	public void setDeadEffect(int DeadEffect){
		this.DeadEffect = DeadEffect
	}
	
	public int getDeadSound(){
		return DeadSound
	}
	public void setDeadSound(int DeadSound){
		this.DeadSound = DeadSound
	}
	
	public int getAttackSound(){
		return AttackSound
	}
	public void setAttackSound(int AttackSound){
		this.AttackSound = AttackSound
	}
	
	public int getWaitSound(){
		return WaitSound
	}
	public void setWaitSound(int WaitSound){
		this.WaitSound = WaitSound
	}
	
	public int getHitSound(){
		return HitSound
	}
	public void setHitSound(int HitSound){
		this.HitSound = HitSound
	}
	
	public int getIsUseWorldDrop(){
		return IsUseWorldDrop
	}
	public void setIsUseWorldDrop(int IsUseWorldDrop){
		this.IsUseWorldDrop = IsUseWorldDrop
	}
	
	public string getDropItemList(){
		return DropItemList
	}
	public void setDropItemList(string DropItemList){
		this.DropItemList = DropItemList
	}
	
	public string getDropChanceList(){
		return DropChanceList
	}
	public void setDropChanceList(string DropChanceList){
		this.DropChanceList = DropChanceList
	}
	
	public string getDropCountList(){
		return DropCountList
	}
	public void setDropCountList(string DropCountList){
		this.DropCountList = DropCountList
	}
	
	public int getDropCount(){
		return DropCount
	}
	public void setDropCount(int DropCount){
		this.DropCount = DropCount
	}
	
	public string getBlueDropItemList(){
		return BlueDropItemList
	}
	public void setBlueDropItemList(string BlueDropItemList){
		this.BlueDropItemList = BlueDropItemList
	}
	
	public string getBlueDropChanceList(){
		return BlueDropChanceList
	}
	public void setBlueDropChanceList(string BlueDropChanceList){
		this.BlueDropChanceList = BlueDropChanceList
	}
	
	public string getBlueDropCountList(){
		return BlueDropCountList
	}
	public void setBlueDropCountList(string BlueDropCountList){
		this.BlueDropCountList = BlueDropCountList
	}
	
	public int getBlueDropCount(){
		return BlueDropCount
	}
	public void setBlueDropCount(int BlueDropCount){
		this.BlueDropCount = BlueDropCount
	}
	
	public int getBlueMfBouns(){
		return BlueMfBouns
	}
	public void setBlueMfBouns(int BlueMfBouns){
		this.BlueMfBouns = BlueMfBouns
	}
	
	public string getGoldDropItemList(){
		return GoldDropItemList
	}
	public void setGoldDropItemList(string GoldDropItemList){
		this.GoldDropItemList = GoldDropItemList
	}
	
	public string getGoldDropChanceList(){
		return GoldDropChanceList
	}
	public void setGoldDropChanceList(string GoldDropChanceList){
		this.GoldDropChanceList = GoldDropChanceList
	}
	
	public string getGoldDropCountList(){
		return GoldDropCountList
	}
	public void setGoldDropCountList(string GoldDropCountList){
		this.GoldDropCountList = GoldDropCountList
	}
	
	public int getGoldDropCount(){
		return GoldDropCount
	}
	public void setGoldDropCount(int GoldDropCount){
		this.GoldDropCount = GoldDropCount
	}
	
	public int getGoldMfBouns(){
		return GoldMfBouns
	}
	public void setGoldMfBouns(int GoldMfBouns){
		this.GoldMfBouns = GoldMfBouns
	}
	
	public int getEquipmentRarity1Chance(){
		return EquipmentRarity1Chance
	}
	public void setEquipmentRarity1Chance(int EquipmentRarity1Chance){
		this.EquipmentRarity1Chance = EquipmentRarity1Chance
	}
	
	public int getEquipmentRarity2Chance(){
		return EquipmentRarity2Chance
	}
	public void setEquipmentRarity2Chance(int EquipmentRarity2Chance){
		this.EquipmentRarity2Chance = EquipmentRarity2Chance
	}
	
	public int getEquipmentRarity3Chance(){
		return EquipmentRarity3Chance
	}
	public void setEquipmentRarity3Chance(int EquipmentRarity3Chance){
		this.EquipmentRarity3Chance = EquipmentRarity3Chance
	}
	
	public int getEquipmentRarity4Chance(){
		return EquipmentRarity4Chance
	}
	public void setEquipmentRarity4Chance(int EquipmentRarity4Chance){
		this.EquipmentRarity4Chance = EquipmentRarity4Chance
	}
	
	public int getEquipmentRarity5Chance(){
		return EquipmentRarity5Chance
	}
	public void setEquipmentRarity5Chance(int EquipmentRarity5Chance){
		this.EquipmentRarity5Chance = EquipmentRarity5Chance
	}
	
	public int getStr(){
		return Str
	}
	public void setStr(int Str){
		this.Str = Str
	}
	
	public int getWit(){
		return Wit
	}
	public void setWit(int Wit){
		this.Wit = Wit
	}
	
	public int getAtkMin(){
		return AtkMin
	}
	public void setAtkMin(int AtkMin){
		this.AtkMin = AtkMin
	}
	
	public int getAtkMax(){
		return AtkMax
	}
	public void setAtkMax(int AtkMax){
		this.AtkMax = AtkMax
	}
	
	public int getMtkMin(){
		return MtkMin
	}
	public void setMtkMin(int MtkMin){
		this.MtkMin = MtkMin
	}
	
	public int getMtkMax(){
		return MtkMax
	}
	public void setMtkMax(int MtkMax){
		this.MtkMax = MtkMax
	}
	
	public int getCrtChance(){
		return CrtChance
	}
	public void setCrtChance(int CrtChance){
		this.CrtChance = CrtChance
	}
	
	public int getCrtBonus(){
		return CrtBonus
	}
	public void setCrtBonus(int CrtBonus){
		this.CrtBonus = CrtBonus
	}
	
	public int getBrilliantChance(){
		return BrilliantChance
	}
	public void setBrilliantChance(int BrilliantChance){
		this.BrilliantChance = BrilliantChance
	}
	
	public int getDefPierce(){
		return DefPierce
	}
	public void setDefPierce(int DefPierce){
		this.DefPierce = DefPierce
	}
	
	public int getMdefPierce(){
		return MdefPierce
	}
	public void setMdefPierce(int MdefPierce){
		this.MdefPierce = MdefPierce
	}
	
	public int getIgnoreAllDef(){
		return IgnoreAllDef
	}
	public void setIgnoreAllDef(int IgnoreAllDef){
		this.IgnoreAllDef = IgnoreAllDef
	}
	
	public int getDoubleChance(){
		return DoubleChance
	}
	public void setDoubleChance(int DoubleChance){
		this.DoubleChance = DoubleChance
	}
	
	public int getAllAtkBonus(){
		return AllAtkBonus
	}
	public void setAllAtkBonus(int AllAtkBonus){
		this.AllAtkBonus = AllAtkBonus
	}
	
	public int getDex(){
		return Dex
	}
	public void setDex(int Dex){
		this.Dex = Dex
	}
	
	public int getVit(){
		return Vit
	}
	public void setVit(int Vit){
		this.Vit = Vit
	}
	
	public int getDef(){
		return Def
	}
	public void setDef(int Def){
		this.Def = Def
	}
	
	public int getMdef(){
		return Mdef
	}
	public void setMdef(int Mdef){
		this.Mdef = Mdef
	}
	
	public int getHp(){
		return Hp
	}
	public void setHp(int Hp){
		this.Hp = Hp
	}
	
	public int getHpNum(){
		return HpNum
	}
	public void setHpNum(int HpNum){
		this.HpNum = HpNum
	}
	
	public int getCrtChanceResist(){
		return CrtChanceResist
	}
	public void setCrtChanceResist(int CrtChanceResist){
		this.CrtChanceResist = CrtChanceResist
	}
	
	public int getCrtBonusResist(){
		return CrtBonusResist
	}
	public void setCrtBonusResist(int CrtBonusResist){
		this.CrtBonusResist = CrtBonusResist
	}
	
	public int getHpBonus(){
		return HpBonus
	}
	public void setHpBonus(int HpBonus){
		this.HpBonus = HpBonus
	}
	
	public int getDmgReduce(){
		return DmgReduce
	}
	public void setDmgReduce(int DmgReduce){
		this.DmgReduce = DmgReduce
	}
	
	public int getReboundDmg(){
		return ReboundDmg
	}
	public void setReboundDmg(int ReboundDmg){
		this.ReboundDmg = ReboundDmg
	}
	
	public int getBonusToArmor(){
		return BonusToArmor
	}
	public void setBonusToArmor(int BonusToArmor){
		this.BonusToArmor = BonusToArmor
	}
	
	public int getBonusToMonster(){
		return BonusToMonster
	}
	public void setBonusToMonster(int BonusToMonster){
		this.BonusToMonster = BonusToMonster
	}
	
	public int getExpUp(){
		return ExpUp
	}
	public void setExpUp(int ExpUp){
		this.ExpUp = ExpUp
	}
	
	public int getKillCure(){
		return KillCure
	}
	public void setKillCure(int KillCure){
		this.KillCure = KillCure
	}
	
	public int getMF(){
		return MF
	}
	public void setMF(int MF){
		this.MF = MF
	}
	
	public int getDamageType(){
		return DamageType
	}
	public void setDamageType(int DamageType){
		this.DamageType = DamageType
	}
	
	public int getBossShield(){
		return BossShield
	}
	public void setBossShield(int BossShield){
		this.BossShield = BossShield
	}
	
	public float getEffectScale(){
		return EffectScale
	}
	public void setEffectScale(float EffectScale){
		this.EffectScale = EffectScale
	}
	
	public int getViewRange(){
		return ViewRange
	}
	public void setViewRange(int ViewRange){
		this.ViewRange = ViewRange
	}
	
	public float getShadowScale(){
		return ShadowScale
	}
	public void setShadowScale(float ShadowScale){
		this.ShadowScale = ShadowScale
	}
	
	public int getFollowRange(){
		return FollowRange
	}
	public void setFollowRange(int FollowRange){
		this.FollowRange = FollowRange
	}
	
	public int getMoveSpeed(){
		return MoveSpeed
	}
	public void setMoveSpeed(int MoveSpeed){
		this.MoveSpeed = MoveSpeed
	}
	
	public float getAnimationSpeed(){
		return AnimationSpeed
	}
	public void setAnimationSpeed(float AnimationSpeed){
		this.AnimationSpeed = AnimationSpeed
	}
	
	public float getEliteScale(){
		return EliteScale
	}
	public void setEliteScale(float EliteScale){
		this.EliteScale = EliteScale
	}
	
	public string getHaloList(){
		return HaloList
	}
	public void setHaloList(string HaloList){
		this.HaloList = HaloList
	}
	
	public int getHaloScaleType(){
		return HaloScaleType
	}
	public void setHaloScaleType(int HaloScaleType){
		this.HaloScaleType = HaloScaleType
	}
	
}

public class MonsterCfg {
	public const string FILENAME = "Monster";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			MonsterTbl record = new MonsterTbl();
			
			record.Levle = table.GetInt(i, "Levle");
			record.Des = table.GetString(i, "Des");
			record.Exp = table.GetInt(i, "Exp");
			record.Name = table.GetString(i, "Name");
			record.Model = table.GetString(i, "Model");
			record.SkillId = table.GetString(i, "SkillId");
			record.DeadEffect = table.GetInt(i, "DeadEffect");
			record.DeadSound = table.GetInt(i, "DeadSound");
			record.AttackSound = table.GetInt(i, "AttackSound");
			record.WaitSound = table.GetInt(i, "WaitSound");
			record.HitSound = table.GetInt(i, "HitSound");
			record.IsUseWorldDrop = table.GetInt(i, "IsUseWorldDrop");
			record.DropItemList = table.GetString(i, "DropItemList");
			record.DropChanceList = table.GetString(i, "DropChanceList");
			record.DropCountList = table.GetString(i, "DropCountList");
			record.DropCount = table.GetInt(i, "DropCount");
			record.BlueDropItemList = table.GetString(i, "BlueDropItemList");
			record.BlueDropChanceList = table.GetString(i, "BlueDropChanceList");
			record.BlueDropCountList = table.GetString(i, "BlueDropCountList");
			record.BlueDropCount = table.GetInt(i, "BlueDropCount");
			record.BlueMfBouns = table.GetInt(i, "BlueMfBouns");
			record.GoldDropItemList = table.GetString(i, "GoldDropItemList");
			record.GoldDropChanceList = table.GetString(i, "GoldDropChanceList");
			record.GoldDropCountList = table.GetString(i, "GoldDropCountList");
			record.GoldDropCount = table.GetInt(i, "GoldDropCount");
			record.GoldMfBouns = table.GetInt(i, "GoldMfBouns");
			record.EquipmentRarity1Chance = table.GetInt(i, "EquipmentRarity1Chance");
			record.EquipmentRarity2Chance = table.GetInt(i, "EquipmentRarity2Chance");
			record.EquipmentRarity3Chance = table.GetInt(i, "EquipmentRarity3Chance");
			record.EquipmentRarity4Chance = table.GetInt(i, "EquipmentRarity4Chance");
			record.EquipmentRarity5Chance = table.GetInt(i, "EquipmentRarity5Chance");
			record.Str = table.GetInt(i, "Str");
			record.Wit = table.GetInt(i, "Wit");
			record.AtkMin = table.GetInt(i, "AtkMin");
			record.AtkMax = table.GetInt(i, "AtkMax");
			record.MtkMin = table.GetInt(i, "MtkMin");
			record.MtkMax = table.GetInt(i, "MtkMax");
			record.CrtChance = table.GetInt(i, "CrtChance");
			record.CrtBonus = table.GetInt(i, "CrtBonus");
			record.BrilliantChance = table.GetInt(i, "BrilliantChance");
			record.DefPierce = table.GetInt(i, "DefPierce");
			record.MdefPierce = table.GetInt(i, "MdefPierce");
			record.IgnoreAllDef = table.GetInt(i, "IgnoreAllDef");
			record.DoubleChance = table.GetInt(i, "DoubleChance");
			record.AllAtkBonus = table.GetInt(i, "AllAtkBonus");
			record.Dex = table.GetInt(i, "Dex");
			record.Vit = table.GetInt(i, "Vit");
			record.Def = table.GetInt(i, "Def");
			record.Mdef = table.GetInt(i, "Mdef");
			record.Hp = table.GetInt(i, "Hp");
			record.HpNum = table.GetInt(i, "HpNum");
			record.CrtChanceResist = table.GetInt(i, "CrtChanceResist");
			record.CrtBonusResist = table.GetInt(i, "CrtBonusResist");
			record.HpBonus = table.GetInt(i, "HpBonus");
			record.DmgReduce = table.GetInt(i, "DmgReduce");
			record.ReboundDmg = table.GetInt(i, "ReboundDmg");
			record.BonusToArmor = table.GetInt(i, "BonusToArmor");
			record.BonusToMonster = table.GetInt(i, "BonusToMonster");
			record.ExpUp = table.GetInt(i, "ExpUp");
			record.KillCure = table.GetInt(i, "KillCure");
			record.MF = table.GetInt(i, "MF");
			record.DamageType = table.GetInt(i, "DamageType");
			record.BossShield = table.GetInt(i, "BossShield");
			record.EffectScale = table.GetFloat(i, "EffectScale");
			record.ViewRange = table.GetInt(i, "ViewRange");
			record.ShadowScale = table.GetFloat(i, "ShadowScale");
			record.FollowRange = table.GetInt(i, "FollowRange");
			record.MoveSpeed = table.GetInt(i, "MoveSpeed");
			record.AnimationSpeed = table.GetFloat(i, "AnimationSpeed");
			record.EliteScale = table.GetFloat(i, "EliteScale");
			record.HaloList = table.GetString(i, "HaloList");
			record.HaloScaleType = table.GetInt(i, "HaloScaleType");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}