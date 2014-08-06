package com.airbitz.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.airbitz.R;
import com.airbitz.utils.Common;

/**
 * Created on 3/4/14.
 */
public class SecurityActivity extends BaseActivity {
    private Button mDisplayButton;
    private Button mSecurityButton;
    private Button mLanguageButton;
    private Button mExchangeRateButton;
    private Button mCategoriesButton;

    private TextView mTitleTextView;

    private ImageButton mBackButton;
    private ImageButton mHelpButton;

    private RelativeLayout mParentLayout;
    private RelativeLayout mNavigationLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

        mTitleTextView = (TextView) findViewById(R.id.fragment_category_textview_title);

        mParentLayout = (RelativeLayout) findViewById(R.id.layout_root);
        mNavigationLayout = (RelativeLayout) findViewById(R.id.navigation_layout);

        mDisplayButton = (Button) findViewById(R.id.button_display);
        mSecurityButton = (Button) findViewById(R.id.button_security);
        mLanguageButton = (Button) findViewById(R.id.button_language);
        mExchangeRateButton = (Button) findViewById(R.id.button_exchange);
        mCategoriesButton = (Button) findViewById(R.id.button_categories);

        mBackButton = (ImageButton) findViewById(R.id.fragment_category_button_back);
        mHelpButton = (ImageButton) findViewById(R.id.fragment_category_button_help);


        mDisplayButton.setTypeface(NavigationActivity.latoBlackTypeFace);
        mSecurityButton.setTypeface(NavigationActivity.latoBlackTypeFace);
        mLanguageButton.setTypeface(NavigationActivity.latoBlackTypeFace);
        mExchangeRateButton.setTypeface(NavigationActivity.latoBlackTypeFace);
        mCategoriesButton.setTypeface(NavigationActivity.latoBlackTypeFace);
        mTitleTextView.setTypeface(NavigationActivity.montserratBoldTypeFace);

        mParentLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                int heightDiff = mParentLayout.getRootView().getHeight() - mParentLayout.getHeight();
                if (heightDiff > 100) {
                    mNavigationLayout.setVisibility(View.GONE);
                }
                else
                {
                    mNavigationLayout.setVisibility(View.VISIBLE);
                }
            }
        });

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        mHelpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Common.showHelpInfo(SecurityActivity.this, "Info", "Business directory info");
            }
        });

        mDisplayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mSecurityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mLanguageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mExchangeRateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mCategoriesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    protected void onResume() {

        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        super.onResume();
    }
}
