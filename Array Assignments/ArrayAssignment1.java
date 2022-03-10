public class ArrayAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		double maximum = values[0];
		double negative = 0;
		
		for (int i=0;i<values.length;i++) {
			System.out.print(values[i]+" ");

			if (values[i] > maximum) {
				maximum = values[i];
			}
			if (values[i] < 0) {
				negative++;
			}
		}
		System.out.println();
		System.out.println("The maximum of all elements in the array is: "+maximum+"");
		System.out.println("The total amount of negative values in the array is: "+negative+"");
		
	}}
