package strategy.impl;

import strategy.iface.ISocialMediaStrategy;

public class orkutStrategy implements ISocialMediaStrategy {
	public void connectTo(String friendName) 
	  {
	    System.out.println(
	    "Connecting with " + friendName + " through Orkut");
	  }
}


