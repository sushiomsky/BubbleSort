package bubbleSort;

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
public class BubbleSort {
	public static int[] BubbleSort(int[] aArray){
		int lastElement = aArray.length;
		int tmp = 0;

		while (lastElement > 1){
			for (int i = 0; i < lastElement; i++) {
				if (aArray[i-1] > aArray[i]){
					tmp = aArray[i];
					aArray[i] = aArray[i-1];
					aArray[i-1] = tmp;
				}
			}
			lastElement -=1;
		}
		return aArray;
	}
}
