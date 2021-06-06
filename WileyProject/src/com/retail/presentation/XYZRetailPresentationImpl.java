package com.retail.presentation;

import java.util.Collection;
import java.util.Scanner;



public class XYZRetailPresentationImpl implements XYZRetailPresentation{

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to XYZ Retail Shop");
		System.out.println("1. Buy CDs");
		System.out.println("2. Buy Books");
		System.out.println("3. Buy Cosmetics");
		System.out.println("4. Display Shopping Basket");
		System.out.println("5. Display Final Bill");
		System.out.println("6. Get Details of CD by id");
		System.out.println("7. Get Details of Book by id");
		System.out.println("8. Get Details of Cosmetic by id");
		System.out.println("9. Exit");
		
	}

	@Override
	public void performMenu(int choice) {
	
		Scanner scn=new Scanner(System.in);
		switch(choice) {
		case 1:
			
			break;
		case 2:
			
				
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
		       break;
		case 6:
				break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			System.exit(0);
		default :
			
			System.out.println("Invalid Choice");
			
		}

	}

	}


