package com.pgmacdesign.yalantissamples.misc;

/**
 * Created by PatrickSSD2 on 1/14/2016.
 */
public class L  {

	public static <T extends Object> void m(T t){
		if(t == null){
			t = (T)"null";
		}
		System.out.println("" + t.toString());
	}
}
