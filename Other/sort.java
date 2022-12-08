package Other;

public class sort {
	
	public static void main(String[] args) {
		//Bubble Sort
		for (int i = 0; i < n; i ++) {
			for (int x = 0; x < n -1; x++) {
				if (haylocations[x] > haylocations[x +1]) {
					int temp = haylocations[x + 1];
					haylocations[x + 1] = haylocations[x]; 
					haylocations[x] = temp; 
				}
			}
		}
		
		//you want to have the least possible so that an n algoratihm is better than other alogrithms 
		//bubble sort is a n2 algorthim 
		//Computers used merge sort (nlogn), which is much better than n2. 
		//If you have 1000, you notice that n2 over nlogn and n is significantly greater at n 
		 //you should merge sort or other types of sorts 
		// the big ones are large sorts 
		//computers use quick sort, but the worst case is n2. Technically, merge sense is probably better. 
		//Sorting in a computer is going to be nlog(n). 
		//In bronze, you can use arrays.sort. 
			//Nothing is good is bronze 
		//There is some special case where it works better 
		//You can briefly go over what arrays.sort does 
		
		
		
		//if you wanted to sort greatest to least, 
		//insertion is when you construct your sorted array one by one and then you pick up the top card and then place it into the sorted array. 
		//If you start with an arandmo arrya, and if you compare the stack minus the greater 
		//
		
	
		///the mention bubble sort in a bronze prolem, but it is not neccesary to know what it is 
		//the question gave you the implmenetionat of the 
		//It was the year that I did it, like 2018 december 
		//It is the first question somehwere
		//If you know what quicksort it, it won't be that important 
		
	
	}

}
