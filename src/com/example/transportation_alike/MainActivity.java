package com.example.transportation_alike;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	TextView tvHome, tvSetting;
	ViewPagerAdapter mAdapter;
	public static ViewPager mPager;
	public static FrameLayout container;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getSupportActionBar().hide();

		tvHome = (TextView) findViewById(R.id.tvHome);
		tvSetting = (TextView) findViewById(R.id.tvSetting);
		container = (FrameLayout) findViewById(R.id.container);

		List<Fragment> fragments = getFragments();
		mAdapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments);
		mPager = (ViewPager) findViewById(R.id.pager);
		mPager.setAdapter(mAdapter);
		setTab();
	}

	// yo you buttduck
	private List<Fragment> getFragments() {
		// TODO Auto-generated method stub
		List<Fragment> fragments = new ArrayList<>();
		fragments.add(new MyFragment());
		fragments.add(new Fragment_Second());
		return fragments;
	}

	private void setTab() {
		// TODO Auto-generated method stub
		mPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				// TODO Auto-generated method stub
				switch (position) {
				case 0:
					tvHome.setTextColor(Color.WHITE);
					tvHome.setCompoundDrawablesWithIntrinsicBounds(0,
							R.drawable.home_white, 0, 0);
					tvSetting.setTextColor(Color.GRAY);
					tvSetting.setCompoundDrawablesWithIntrinsicBounds(0,
							R.drawable.settings_black, 0, 0);
					break;
				case 1:
					tvHome.setTextColor(Color.GRAY);
					tvHome.setCompoundDrawablesWithIntrinsicBounds(0,
							R.drawable.home_black, 0, 0);
					tvSetting.setTextColor(Color.WHITE);
					tvSetting.setCompoundDrawablesWithIntrinsicBounds(0,
							R.drawable.settings_white, 0, 0);

					break;
				default:
					break;
				}

			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub

			}
		});
	}

}
