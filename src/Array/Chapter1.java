package Array;

class ArraysExapmle {
	void ddemoArray() {

		int[] ages = new int[5];
		float[] weight = new float[5];
		String[] names = new String[5];
		
		ages[0] =1;
		ages[1]=2;
		ages[3]=5;
//		ages[10]=3;     it will Give Index Out of Bound Error
		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);

	}
}

public class Chapter1 {
	public static void main(String[] args) {

		ArraysExapmle obj = new ArraysExapmle();
		obj.ddemoArray();

	}

}
