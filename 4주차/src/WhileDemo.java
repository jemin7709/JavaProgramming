
public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 2;
		while(row < 10) {
			int column = 1;
			while(column < 10) {
				System.out.printf("%d * %d = %d\t", row, column, row * column);
				column++;
			}
			System.out.println();
			row++;
		}
	}

}
