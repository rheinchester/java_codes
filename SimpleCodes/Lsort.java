public class Lsort{
	public void selectionSort(int[] number) {
		int minIndex, temp , length;
		length = number.length;

		for (int startIndex = 0; startIndex <= 2; startIndex++){//this will search the whole list
			minIndex = startIndex;
			for (int i = startIndex+1;i<=length-1 ;i++ ) {//this will search the unsorted portion.
				if (number[i]<number[minIndex])
					minIndex = i;
			}
					//exchange number[startIndex] and number[minIndex]
						temp = number[startIndex];
						number[startIndex] = number[minIndex];
						number[minIndex] = temp;
						assert minStart(number, startIndex):
						"Error: " + number[startIndex] +
						" at position " + startIndex +
						" is not the smallest.";
						}
						assert isSorted(number):
						"Error: the final is not sorted";
						}
			}
		}
	}
}