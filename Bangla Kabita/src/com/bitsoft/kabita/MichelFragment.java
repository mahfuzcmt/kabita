package com.bitsoft.kabita;

import info.androidhive.slidingmenu.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class MichelFragment extends Fragment {
	
	public MichelFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_michel, container, false);
         
        return rootView;
    }
}
