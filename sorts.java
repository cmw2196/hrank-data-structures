// Merge Sort


public static void mergeSort(int[] arr){
	int[] helper = new int[arr.length];
	mergeSort(array, helper, 0, array.length - 1);
}


public static void mergeSort(int[] arr, int[] helper, int low, int high){
	if (low < high) {
		int middle = low + high / 2;
		mergeSort(arr, helper, low, middle);
		mergeSort(arr, helper, middle + 1, high);
		merge(arr, helper, low, middle, high);
	}
}

public static void merge(int[] arr, int[] helper, int low, int middle, int high){
	for (int i = low; i <= high; i++){
		helper[i] = arr[i];   //copy all elements between low and high into helper array	
	}

	int hleft = low;
	int hright = middle + 1;
	int current = low;
	
	while (hleft <= middle && hright <= high){
		if (helper[hleft] >= helper[hright]){
			arr[current] = helper[hright];
			hright++;
		} else {
			arr[current] = helper[hleft];
			hleft++;
		}
		current++;
	}

	for (int j = hleft; j <= middle; j++){
		arr[current] = helper[j];    //only check space between mid and left as array elements between mid and right already in arr
		current++;
	}
}



//Quick Sort

public static void quickSort(int[] arr){
	quicksort(arr, 0, arr.length - 1);
}

public static void quickSort(int[] arr, int low, int high){
	int index = partition(arr, low, high);
	if (low < index - 1){
		quickSort(arr, low, index - 1);
	if (high > index) {
		quickSort(arr, index, high);
	}
}

public static int partition(int[] arr, int low, int high){
	int pivot = arr[low + high / 2];
	while (low <= high){
		while (arr[low] < pivot) { low++;}
		while (arr[high] > pivot) { high--;}
		if (low <= high){
			swap(arr, low, high);
			low++;
			high--;
		}
	}
	return low;
}

public static void swap(int [] arr, int low, int high){
	int temp = arr[high];
	arr[high] = arr[low];
	arr[low] = temp;
}



//Iterative QuickSort

public static void quickSort(int[] arr, 0, arr.length -1){
	if (arr == null || arr.length = 0 || low >= high) { return;}
	
	int pivot = arr[low + ((high - low)/2)];
	int i = low, j = high;

	while (i <= j){
		while (arr[i] < pivot) { i++;}
		while (arr[j] > pivot) { j--;}
		if (i <= j){
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
		}
	}

	if (low < j) {quickSort(arr, low, j);}
	if (high > i) {quickSort(arr, i, high);}
}




 
	


		






