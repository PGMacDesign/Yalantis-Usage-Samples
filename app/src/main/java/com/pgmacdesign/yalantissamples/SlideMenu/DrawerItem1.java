package com.pgmacdesign.yalantissamples.SlideMenu;

import com.pgmacdesign.yalantissamples.R;

import yalantis.com.sidemenu.interfaces.Resourceble;

/**
 * Created by PatrickSSD2 on 1/14/2016.
 */
public class DrawerItem1 implements Resourceble {

	@Override
	public int getImageRes() {
		int intx = R.mipmap.ic_launcher;
		return intx;
		//return 0;
	}

	@Override
	public String getName() {
		return "ic_launcher yo!";
		//return null;
	}
}
