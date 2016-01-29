package com.training.domains;

import com.training.ifaces.Automobile;

public class NewShowroom extends ShowRoom {
	
	@Override
	public Automobile getItem(int key){
		switch(key){
		case 4 :
		return new Bike();
		default:
			return super.getItem(key);
			
		
	}

}
}
