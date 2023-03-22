package org.system;

public class Desktop extends Computer {
	public void desktopsize() {
	
	float Size  = 	13.6f ;
	System.out.println("DesktopSize : "+ Size + " inches "); 
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop lap = new Desktop();
		lap.ComputerModel();
		lap.desktopsize();

	}

}
