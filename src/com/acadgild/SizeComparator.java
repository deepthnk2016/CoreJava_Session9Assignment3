package com.acadgild;

import java.util.Comparator;

/**
 * 
 * Class to implement Comparator and to override the compare method to compare
 * the sizes of objects of HDTV
 *
 */
public class SizeComparator implements Comparator<Object> {

	public int compare(Object arg0, Object arg1) {

		HDTV hd1 = (HDTV) arg0;
		HDTV hd2 = (HDTV) arg1;
		if (hd1.size == hd2.size)
			return 0;
		else if (hd1.size > hd2.size)
			return 1;
		else
			return -1;
	}

}
