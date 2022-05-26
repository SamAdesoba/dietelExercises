package Turtle;

public class SketchPad {
	private int[][] floor;
	public SketchPad(int floorRow, int floorColumn) {
		floor = new int[floorRow][floorColumn];
	}

	@Override
	public String toString() {
		StringBuilder toBeReturned = new StringBuilder();
//		If you don't want to use enhanced for loop
//		for(int row = 0; row < floor.length; row++){
//			for(int column = 0; column < floor[row].length; column++){
//				if(floor[row][column] == 0) toBeReturned +="  ";
//				if(floor[row][column] == 1) toBeReturned +="* ";
//			}
//		}
//		for(var row : floor){
//			for(var column: row){
//				if(column == 0) toBeReturned += "  ";
//				if(column == 1) toBeReturned += "* ";
//			}
//			toBeReturned += "\n";
//		}

		for(var column : floor){
			for(var row: column){
				if(row == 0) toBeReturned.append("  ");
				if(row == 1) toBeReturned.append("* ");
			}
			toBeReturned.append("\n");
		}
		return toBeReturned.toString();
	}

	public int[][] getFloor() {
		return floor;
	}
}
