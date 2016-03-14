package com.training.apps;

import com.training.ifaces.Greeting;

public class FirstApplication {

	public static void main(String[] args) {
		
		
		
		Greeting grt = (d) -> {
			return d *5.0;
		};
		
		System.out.println(grt.show(6.0));
	}

}
