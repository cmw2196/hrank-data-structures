// calculate the mean

public static double calcMean(double[] arr){
	double count = 0;
	for (double obj: arr){
		count += obj;
	}
	return count / arr.length;
}


//	calculate the median 

public static double calcMed(double[] arr){
	sortedArr = Arrays.sort(arr);
	int mid = sortedArr.length / 2;
	if (sortedArr.length % 2 == 0){
		return (sortedArr[mid] + sortedArr[mid - 1])  / 2.0;
	} else {
		return sortedArr[mid];
	}
}


public static double calcMode(double[] arr){
	HashMap<Double, Integer> modeMap = new HashMap<Double, Integer>();   // list of values and number of appearances
	ArrayList<Double> modeList = new ArrayList<Double>();    //final list of modes
	int maxFreq = -1;		// number of times a mode occurs
	
	for (elem : arr){
		Integer count = modeMap.get(elem);
		if (count == null){
			modeMap.put(elem, 1);
		} else {
			modeMap.put(elem, count + 1);
		}
		if (count + 1 > maxFreq){
			maxFreq = count + 1;
		}
	}
	

	for (Map.Entry<Double, Integer> keyVal : modeMap.entrySet()){
		int val = keyVal.getValue();
		if (val == maxFreq){
			modeList.add(keyVal.getKey());
		}
	}
	
	return modeList;
}
		

