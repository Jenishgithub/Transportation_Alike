package com.example.transportation_alike;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
	private static final String[] CONTENT = new String[] { "First", "Second" };
	List<Fragment> fragments;

	public ViewPagerAdapter(FragmentManager fm, List<Fragment> fragments) {
		super(fm);
		this.fragments = fragments;
	}

	@Override
	public Fragment getItem(int position) {

		return this.fragments.get(position);
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return CONTENT[position % CONTENT.length].toUpperCase();
	}

	@Override
	public int getCount() {
		return this.fragments.size();
	}
}