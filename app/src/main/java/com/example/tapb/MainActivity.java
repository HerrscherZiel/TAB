package com.example.tapb;

import android.support.annotation.LayoutRes;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.design.widget.NavigationView;
import android.os.Bundle;

import com.example.tapb.Acivity.BaseFrag;

public class MainActivity extends BaseFrag {

    private DrawerLayout mDrawerLayout;
    private NavigationView mNavDrawer;
    private ActionBarDrawerToggle mDrawerToggle;

    @Override
    @LayoutRes
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mNavDrawer = (NavigationView) findViewById(R.id.nav_drawer);
        mDrawerToggle = setupDrawerToggle();

        // Tie DrawerLayout events to the ActionBarToggle
        mDrawerLayout.addDrawerListener(mDrawerToggle);

        // Setup drawer view
        setupDrawerContent(mNavDrawer);

        // Select TodayFragment on app start by default
        loadTodayFragment();
    }
}
