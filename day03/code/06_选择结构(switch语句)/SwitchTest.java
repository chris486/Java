﻿/*
	看程序写结果
*/
class SwitchTest {
	public static void main(String[] args) {
		/*
		int x = 2;
		int y = 3;

		switch(x){
			default:
				y++;
				break;
			case 3:
				y++;
			case 4:
				y++;
		}
		System.out.println("y="+y);
		*/
		
		int x = 2;
		int y = 3;
		switch(x){
			default:
				y++;
				//System.out.println("default y="+y);
			case 3:
				y++;
				//System.out.println("3 y="+y);
			case 4:
				y++;
				//System.out.println("4 y="+y);
		}
		System.out.println("y="+y);
		
	}
}
