package com.jellyfish;

public class TheGame {

	public static void main(String[] args) {
		
		   Board board=new Board(); 

		   Thread t1 =new Thread(board);    

            t1.start();
           
	}

}
