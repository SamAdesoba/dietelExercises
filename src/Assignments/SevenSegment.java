package Assignments;

public class SevenSegment {
	String[][] seven = new String[5][4];
	public  void setA(){
		for (int i = 0; i <= 0; i++){
			for(int j = 0; j <= 3; j++){
				seven[i][j] = "* ";
			}
		}
	}
	public void setB(){
		for(int i = 0; i <= 2; i++){
			for(int j = 3; j <= 3; j++){
				seven[i][j] = "* ";
			}
		}
	}
	public void setC(){
		for(int i = 2; i <=4; i++ ){
			for(int j = 3; j <= 3; j++){
				seven[i][j] = "* ";
			}
		}
	}
	public void setD(){
		for(int i = 4; i <=4;i++){
			for(int j = 0; j <=3;j++){
				seven[i][j] = "* ";
			}
		}
	}
	public void setE(){
		for(int i = 2; i <= 4; i++){
			for(int j = 0; j <=0;j++){
				seven[i][j] = "* ";
			}
		}
	}
	public void setF(){
		for(int i = 0; i <= 2; i++){
			for(int j = 0; j <= 0; j++){
				seven[i][j] = "* ";
			}
		}
	}
	public void setG(){
		for (int i = 2; i <= 2; i++){
			for(int j = 0; j <= 3; j++){
				seven[i][j] = "* ";
			}
		}
	}
	public void setScreen(){
		for(int i = 0; i <= 4;i++){
			for(int j = 0; j <= 3; j++){
				seven[i][j] = "  ";
			}
		}
	}
	public void settingDisplay(String input){
		setScreen();
		if(input.charAt(7) == '1'){
			if(input.charAt(0) == '1'){setA();}
			if(input.charAt(1) == '1'){setB();}
			if(input.charAt(2) == '1'){setC();}
			if(input.charAt(3) == '1'){setD();}
			if(input.charAt(4) == '1'){setE();}
			if(input.charAt(5) == '1'){setF();}
			if(input.charAt(6) == '1'){setG();}
		}
	}
	public void display(){
		for(int i = 0; i <= 4; i++){
			for(int j = 0; j <= 3; j++){
				System.out.print(seven[i][j] + " ");
			}
			System.out.println();
		}
	}
}
