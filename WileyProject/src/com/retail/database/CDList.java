package com.retail.database;

import java.util.HashMap;

import com.retail.beans.CD;


public class CDList {
private static HashMap<Integer,CD> cds=new HashMap<Integer, CD>();
	
	static {
		cds.put(101, new CD(101,"The Beatles – ‘Revolver’",400));
		cds.put(102, new CD(102,"The Beatles – ‘The White Album’",600));
		cds.put(103, new CD(103,"David Bowie – ‘Low’",200));
		cds.put(104, new CD(104,"Public Enemy – ‘It Takes A Nation Of Millions To Hold Us Back’",300));
		cds.put(105, new CD(105,"The Beach Boys – ‘Pet Sounds’",900));
		
		
	}

	public static HashMap<Integer, CD> getCDs() {
		return cds;
	}

	public static void setBooks(HashMap<Integer, CD> cds) {
		CDList.cds = cds;
	}

}
