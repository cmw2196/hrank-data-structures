// functions to find the n'th fibonacci number

public static int fibCalc(int n){
	if (n == 0 || n == 1){
		return n;
	}
	int temp = 0, a = 0, count = 2;
	int b = 1;
	
	while (count < n){
		temp = b;
		b = a + b;
		a = temp;
		count++;
	}
	
	return b;
}

// Recursively using memoization

public static int fibRec(int n){
	int memo = new int[n - 1];
	int res = fibRec(n, memo);
	return(res);
}

public static int fibRec(int n, int[] memo){
	if (n == 0 || n == 1){
		return n;
	}
	
	if (memo[n] > 0){
		return memo[n];
		
	} else {
		memo[n]  = fibRec(n - 1, memo) + fibRec(n-2, memo);
	}
	
	return memo[n];
}
	
		
		
	
	
