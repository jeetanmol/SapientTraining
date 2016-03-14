package com.training.exercise2;

public class Media {
	
	private MediaType media[][] = new MediaType[3][10];
	private static int book = 0;
	private static int period = 0;
	private static int dvd = 0;
	
	public void addMedia(MediaType media){
		if(media instanceof Books){
			this.media[0][book] = media;
			book++;
		}
		if(media instanceof Periodical){
			this.media[1][period] = media;
			period++;
		} 
		if(media instanceof Dvd){
			this.media[2][dvd] = media;
			dvd++;
		}
		
		
	}
	

	public void getMedia(int key){
		
		for(MediaType b: media[key-1])
		
		{ if(b==null)
			continue;
		else
			b.getDetails();
		}
	}

}
