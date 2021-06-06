package com.retail.database;

import java.util.HashMap;

import com.retail.beans.Cosmetic;

public class CosmeticList {
private static HashMap<Integer,Cosmetic> cosmetics=new HashMap<Integer, Cosmetic>();
	
	static {
		cosmetics.put(101, new Cosmetic(101,"Lipbalm",500));
		cosmetics.put(102, new Cosmetic(102,"Lipstick’",3000));
		cosmetics.put(103, new Cosmetic(103,"Toner’",800));
		cosmetics.put(104, new Cosmetic(104,"Foundation",1000));
		cosmetics.put(105, new Cosmetic(105,"Eye-Liner",1200));
		
		
	}

	public static HashMap<Integer, Cosmetic> getCosmetics() {
		return cosmetics;
	}

	public static void setBooks(HashMap<Integer, Cosmetic> cosmetics) {
		CosmeticList.cosmetics = cosmetics;
	}
}
