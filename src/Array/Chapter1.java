package Array;

class ArraysExapmle {

	void MultiDArray() {
		int[][] array_1 = new int[5][3];

		int[][] arr = { { 3, 4, 5 }, { 12, 34, 56 } };

		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
	}

	void demoArray() {

		int[] ages = new int[5];
		float[] weight = new float[5];

		// Array Literals
		String[] names = { "Neeraj", "Kumar", "Ram" };

		// 3D Array
		int[][][] arr_3 = new int[5][3][2];
		
		//Assigning a 3D Array
		
		arr_3[0][0][0] =1;

		ages[0] = 1;
		ages[1] = 2;
		ages[3] = 5;
//		ages[10]=3;     it will Give Index Out of Bound Error
		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);

		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		System.out.println("3D Array:- " +arr_3[0][0][0]);
		
		
		System.out.println("The Length of 3D Array is " + arr_3.length);
		
		System.out.println("The Length of ages is :- "+ ages.length);
		
		System.out.println("The Length of names is :- "+ names.length);
	}
	
}

public class Chapter1 {
	public static void main(String[] args) {

		ArraysExapmle obj = new ArraysExapmle();
		obj.demoArray();
		obj.MultiDArray();

	}

}
