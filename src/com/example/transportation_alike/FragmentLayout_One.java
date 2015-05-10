package com.example.transportation_alike;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentLayout_One extends Fragment {
	Button btnGoBack;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.layout_one, container, false);
		btnGoBack = (Button) view.findViewById(R.id.btnGoBack);
		btnGoBack.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				MainActivity.container.setVisibility(View.GONE);
				MainActivity.mPager.setVisibility(View.VISIBLE);
			}
		});
		return view;
	}
}
