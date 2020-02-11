package Model;

// Given an array of integer, return true if the array is length 1 or more, 
// and the first element and the last element are equal.
public class TaskToDo {
	public boolean CheckArrayTask1(int[] arr) {
		boolean result = false;
		if (arr.length >= 1 && arr[0] == arr[arr.length-1]) {
			result = true;
		}
		
		return result;
	}
}
