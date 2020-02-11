package App;

import Model.TaskToDo;

public class Main {
	public static void main(String[] args) {
		// properties
		TaskToDo task = new TaskToDo();
		int[] sampleArray1 = new int[] {2, 4, 4, 5, 2};
		int[] sampleArray2 = new int[] {1, 2, 3, 4, 5, 6};
		int[] sampleArray3 = new int[] {};

		System.out.println(task.CheckArrayTask1(sampleArray1));
		System.out.println(task.CheckArrayTask1(sampleArray2));
		System.out.println(task.CheckArrayTask1(sampleArray3));
	}
}
