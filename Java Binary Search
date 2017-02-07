// Recursive Binary Search


public static int binarySearch(int[] arr, int num){
	return binarySearch(arr, num, 0, arr.length - 1);
}

public static int binarySearch(int[] arr, int num, int low, int high){
	if (low > high) { return -1;}
	int mid = low + high / 2;

	if (num > arr[mid]){
		return binarySearch(arr, num, mid +1, high);
	} else if (num < arr[mid]){
		return binarySearch(arr, num, low, mid -1);
	} else {
		return mid;
	}
}


// Iterative Binary Search


public static int binarySearch(int[] arr, int num){
	return binarySearch(arr, num, 0, arr.length - 1);
}

public static int binarySearch(int[] arr, int num){
	int low = 0;
	int high = arr.length - 1;
	int mid;
	
	while (low <= high){
    mid = low + high / 2;
		if (arr[mid] > num){
			high = mid - -1;
		} else if (arr[mid] < num){
			low = mid + 1;
		} else {
			return mid;
		}
	}
	return -1;
}
