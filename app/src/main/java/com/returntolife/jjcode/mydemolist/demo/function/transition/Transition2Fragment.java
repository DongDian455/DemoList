package com.returntolife.jjcode.mydemolist.demo.function.transition;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.returntolife.jjcode.mydemolist.R;

/**
 * Created by HeJiaJun on 2020/3/31.
 * Email:hejj@mama.cn
 * des:
 */
public class Transition2Fragment extends Fragment {


    public static Transition2Fragment newInstance() {
        Transition2Fragment fragment = new Transition2Fragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_transition2, container, false);


        return view;
    }
}
