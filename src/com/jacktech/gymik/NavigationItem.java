package com.jacktech.gymik;

public class NavigationItem {

	public int drawable = 0;
	public String text = "prázdný";
	public boolean delimiter = false;
	
	public NavigationItem(int drawable, String text){
		this.drawable = drawable;
		this.text = text;
	}

	public NavigationItem() {
		this.delimiter = true;
	}
	
}
