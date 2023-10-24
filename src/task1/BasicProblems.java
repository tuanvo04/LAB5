package task1;

import java.util.Iterator;

public class BasicProblems {
	// add 2 matrices
	public static int[][] add(int[][] a, int[][] b) {
		int[][] arr = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				arr[i][j] = a[i][j] + b[i][j];
			}
		}
		return arr;
	}

	// subtract 2 matrices
	public static int[][] subtract(int[][] a, int[][] b) { // TODO
		int[][] arr = new int[a.length][a[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = a[i][j] - b[i][j];
			}
		}
		return arr;
	}

	// multiply 2 matrices
	public static int[][] multiply(int[][] a, int[][] b) {
		int[][] arr = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < b[0].length; k++) {
					arr[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		return arr;
	}
	public static int[][] transpose(int[][] a) {
			int [][] arr = new int [a[0].length][a.length];
		
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				arr[i][j] = a[j][i];
				
			}
		}
		return arr;
		
		}
	public static void main(String[] args) {
		int[][] a = { { 7, 2 }, { 5, 3 } };
		int[][] b = { { 2, 1 }, { 3, 1 } };
		System.out.println("Add:");
		int arr1[][] = add(a, b);
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {

				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("subtract:");
		int arr2[][] = subtract(a, b);
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		int[][] a1 = { { 1, 2, 3 }, { 2, 5, 1 } };
		int[][] b1 = { { 2, 2, 4 }, { 3, 1, 2 }, { 4, 3, 1 } };
		System.out.println("multiply:");
		int arr3[][] = multiply(a1, b1);
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	
	
	int [][] a2 = {{1,2},{3,4},{5,6}};
	System.out.println("transpose: ");
	int[][] arr4 = transpose(a2);
	for (int i = 0; i < arr4.length; i++) {
		for (int j = 0; j < arr4[i].length; j++) {
			System.out.print(arr4[i][j]+ " ");
		}
		System.out.println();
	}
	}
}