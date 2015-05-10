package com.example.transportation_alike;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

@SuppressLint("NewApi")
public class MyFragment extends Fragment {
	Button btnSubmitt;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.my_fragment, container, false);
		btnSubmitt = (Button) view.findViewById(R.id.btnSubmitt);
		btnSubmitt.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				MainActivity.mPager.setVisibility(View.GONE);
				MainActivity.container.setVisibility(View.VISIBLE);
				FragmentManager mFragmentmanager = getFragmentManager();
				Fragment fragment = new FragmentLayout_One();
				mFragmentmanager.beginTransaction()
						.replace(R.id.container, fragment).commit();
			}
		});
		return view;
	}

}
