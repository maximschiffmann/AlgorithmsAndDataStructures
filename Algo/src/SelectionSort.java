
public class SelectionSort {
	public void selectionSort(int[] a, int n) {
		int i, j, min;
		for (i = 0; i < n; i++) {
			min = i;
			for (j = i; j < n; j++) {
				if (a[j] < a[min])
					min = j;
			}
			int h = a[i];
			a[i] = a[min];
			a[min] = h;
		}
	}

	public void sort(int[] a) {
		int max;
		for (int i = a.length - 1; i >= 0; i--) {
			max = i;
			for (int j = i; j >= 0; j--) {
				if (a[j] > a[max])
					max = j;
			}
			int temp = a[i];
			a[i] = a[max];
			a[max] = temp;
		}
	}
	
    static void stableSelectionSort(int[] a, int n) 
    { 
        // Iterate through array elements 
        for (int i = 0; i < n - 1; i++)  
        { 
  
            // Loop invariant : Elements till  
            // a[i - 1] are already sorted. 
  
            // Find minimum element from  
            // arr[i] to arr[n - 1]. 
            int min = i; 
            for (int j = i + 1; j < n; j++) 
                if (a[min] > a[j]) 
                    min = j; 
  
            // Move minimum element at current i. 
            int key = a[min]; 
            while (min > i)  
            { 
                a[min] = a[min - 1]; 
                min--; 
            } 
              
            a[i] = key; 
            printArray(a, n); 
        } 
    } 
  
    static void printArray(int[] a, int n) 
    { 
        for (int i = 0; i < n; i++) 
        System.out.print(a[i]+ " "); 
          
        System.out.println(); 
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        int[] a = { 4, 5, 3, 2, 4, 1 }; 
        int n = a.length; 
        stableSelectionSort(a, n); 
        printArray(a, n); 
    } 
}
