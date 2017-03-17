// functions to find the n'th fibonacci number- O(n)

public static int fibCalc(int n){
	if (n == 0 || n == 1){
		return n;
	}
	
	int temp = 0;
	int a = 0;
	int b = 1;
	
	for (int i = 2; i < n; i++){
		temp = b;
		b = a + b;
		a = temp;
	}
	
	return b;
}

// Recursively using memoization - O(n)

public static int fibRec(int n){
	int[] memo = new int[n + 1];
	int res = fibRec(n, memo);
	return(res);
}

public static int fibRec(int n, int[] memo){
	if (n == 0 || n == 1){
		return n;
	}
	
	if (memo[n] == 0){
		memo[n]  = fibRec(n - 1, memo) + fibRec(n-2, memo);
	}
	
	return memo[n];
}
	
		
		
	
	
