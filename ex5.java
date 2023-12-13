//ex5:
//*******************************************************
//question 1:


   public void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
 
 
 //*******************************************************
//question 2:
public void mergeSort(int[] arr, int n) {
    if (n < 2) {
        return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];

    for (int i = 0; i < mid; i++) {
        l[i] = arr[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = arr[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);

    merge(arr, l, r, mid, n - mid);
}

public void merge(int[] arr, int[] l, int[] r, int left, int right) {
 
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            arr[k++] = l[i++];
        }
        else {
            arr[k++] = r[j++];
        }
    }
    while (i < left) {
        arr[k++] = l[i++];
    }
    while (j < right) {
        arr[k++] = r[j++];
    }
}
//*******************************************************
//question 3:


public void quickSort(int arr[], int begin, int end) {
    if (begin < end) {
        int p = partition(arr, begin, end);

        quickSort(arr, begin, p-1);
        quickSort(arr, p+1, end);
    }
}


public int partition(int arr[], int begin, int end) {
    int pivot = arr[end];
    int i = (begin-1);

    for (int j = begin; j < end; j++) {
        if (arr[j] <= pivot) {
            i++;

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }

    int tmp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = tmp;

    return i+1;
}








