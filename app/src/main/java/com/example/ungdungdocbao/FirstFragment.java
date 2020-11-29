package com.example.ungdungdocbao;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class FirstFragment extends Fragment {
    private TabLayout tabLayout;
    private ViewPager firstViewPager;
    public FirstFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.first_fragment, container, false);

        firstViewPager = (ViewPager) rootView.findViewById(R.id.viewpage_content);

        tabLayout = (TabLayout) rootView.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(firstViewPager);

        setupViewPager(firstViewPager);
        return rootView;
    }

    private void setupViewPager(ViewPager viewPager) {
        TabViewPageAdapter adapter = new TabViewPageAdapter(getChildFragmentManager());
        adapter.addFragment_TabView(new ThoiSuFragment(), "Thời Sự");
        adapter.addFragment_TabView(new GocNhinFragment(),"Góc Nhìn");
        adapter.addFragment_TabView(new TheGioiFragment(), "Thế Giới");
        adapter.addFragment_TabView(new TheThaoFragment(),"Thể Thao");
        adapter.addFragment_TabView(new CongNgheFragment(),"Công Nghệ");
        adapter.addFragment_TabView(new GiaiTriFragment(),"Giải Trí");
        adapter.addFragment_TabView(new KhoaHocFragment(),"Khoa Học");
        viewPager.setAdapter(adapter);
    }
}
