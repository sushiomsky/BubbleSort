package sorting;

/**
 * BubbleSort
 * Copyright (c) 2017 Dennis Suchomsky <dennis.suchomsky@gmail.com>
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public class QuickSort {
	public static void main(String[] a){
		int[] aArray = {1,2,3,4,3,7,9,86,5,4,7,};
		quick(aArray,0, aArray.length-1);
		for (int element : aArray){
			System.out.println(element);
		}
	}
	public static void quick(int x[], int left, int right){
		int i = left;
		int j = right;
		int middleElement = x[(left+right)/2];

		do {
			while (x[i] < middleElement){//von links nach rechts bis ein element >= dem trenn element ist
				i++;
			}
			//x[i] ist >= middleElement

			while (middleElement < x[j]){
				j--;
			}
			//x[j] ist <= middleElement

			if(i<=j){
				int tmp = x[i];
				x[i] = x[j];
				x[j] = tmp;
				i++;
				j--;
			}
		}while (i<=j);

		//alles bis x[j] ist kleiner als alles ab x[j]
		if (left<j){
			quick(x,left,j);
		}

		if (i<right){
			quick(x,i,right);
		}
	}
}
