package com.airbitz.activities;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.airbitz.R;
import com.airbitz.adapters.ExportAdapter;
import com.airbitz.utils.Common;

import java.util.Calendar;

/**
 * Created on 2/22/14.
 */
public class ExportActivity  extends Activity implements GestureDetector.OnGestureListener{
    private EditText mFromDateEdittext;
    private EditText mToDateEdittext;

    private Button mAccountButton;
    private Button mCSVButton;
    private Button mQuickenButton;
    private Button mQuickBooksButton;
    private Button mPdfbutton;
    private Button mWalletbutton;


    private ImageButton mHelpButton;
    private ImageButton mBackButton;

    private TextView mAccountTextView;
    private TextView mFromTextView;
    private TextView mToTextView;
    private TextView mTitleTextView;

    private Button mThisWeekButton;
    private Button mThisMonthButton;
    private Button mThisYearButton;

    private RelativeLayout mParentLayout;
    private RelativeLayout mNavigationLayout;

    private ScrollView mScrollView;

    private GestureDetector mGestureDetector;
    private ExportAdapter mExportAdapter;

    private Intent mIntent;

    private Calendar calendar;
    private int mYear;
    private int mMonth;
    private int mDay;

    static final int DATE_DIALOG_ID_FROM = 10;
    static final int DATE_DIALOG_ID_TO = 11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_export);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

        mGestureDetector = new GestureDetector(this);
        mParentLayout = (RelativeLayout) findViewById(R.id.layout_root);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);


        calendar = Calendar.getInstance();
        mYear = calendar.get(Calendar.YEAR);
        mMonth = calendar.get(Calendar.MONTH);
        mDay = calendar.get(Calendar.DAY_OF_MONTH);

        mScrollView = (ScrollView) findViewById(R.id.layout_scroll);

        mNavigationLayout = (RelativeLayout) findViewById(R.id.navigation_layout);

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

        mCSVButton = (Button) findViewById(R.id.button_csv);
        mQuickenButton = (Button) findViewById(R.id.button_quicken);
        mQuickBooksButton = (Button) findViewById(R.id.button_quickbooks);
        mPdfbutton = (Button) findViewById(R.id.button_pdf);
        mWalletbutton = (Button) findViewById(R.id.button_wallet);

        mAccountButton = (Button) findViewById(R.id.button_acount);
        mFromDateEdittext = (EditText) findViewById(R.id.edittext_from);
        mToDateEdittext = (EditText) findViewById(R.id.edittext_to);

        mBackButton = (ImageButton) findViewById(R.id.button_back);
        mHelpButton = (ImageButton) findViewById(R.id.button_help);

        mAccountTextView = (TextView) findViewById(R.id.textview_account);
        mFromTextView = (TextView) findViewById(R.id.textview_from);
        mToTextView = (TextView) findViewById(R.id.textview_to);
        mTitleTextView = (TextView) findViewById(R.id.textview_title);

        mThisWeekButton = (Button) findViewById(R.id.button_this_week);
        mThisMonthButton = (Button) findViewById(R.id.button_this_month);
        mThisYearButton = (Button) findViewById(R.id.button_this_year);

        mAccountButton.setTypeface(LandingActivity.montserratBoldTypeFace, Typeface.BOLD);
        mFromDateEdittext.setTypeface(LandingActivity.montserratBoldTypeFace, Typeface.BOLD);
        mToDateEdittext.setTypeface(LandingActivity.montserratBoldTypeFace, Typeface.BOLD);
        mAccountTextView.setTypeface(LandingActivity.montserratBoldTypeFace, Typeface.BOLD);
        mFromTextView.setTypeface(LandingActivity.montserratBoldTypeFace, Typeface.BOLD);
        mToTextView.setTypeface(LandingActivity.montserratBoldTypeFace, Typeface.BOLD);
        mThisWeekButton.setTypeface(LandingActivity.montserratBoldTypeFace, Typeface.BOLD);
        mThisMonthButton.setTypeface(LandingActivity.montserratBoldTypeFace, Typeface.BOLD);
        mThisYearButton.setTypeface(LandingActivity.montserratBoldTypeFace, Typeface.BOLD);
        mTitleTextView.setTypeface(LandingActivity.montserratBoldTypeFace, Typeface.BOLD);

        mScrollView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return mGestureDetector.onTouchEvent(motionEvent);
            }
        });

        mParentLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return mGestureDetector.onTouchEvent(motionEvent);
            }
        });

        mAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mIntent = new Intent(ExportActivity.this, WalletActivity.class);
                mIntent.putExtra(RequestActivity.CLASSNAME, "ImportActivity");
                startActivity(mIntent);
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
                Common.showHelpInfo(ExportActivity.this, "Info", "Business directory info");
            }
        });

        mCSVButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mIntent = new Intent(ExportActivity.this, ExportSavingOptionActivity.class);
                startActivity(mIntent);
            }
        });
        mQuickenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mIntent = new Intent(ExportActivity.this, ExportSavingOptionActivity.class);
                startActivity(mIntent);
            }
        });
        mQuickBooksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mIntent = new Intent(ExportActivity.this, ExportSavingOptionActivity.class);
                startActivity(mIntent);
            }
        });
        mPdfbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mWalletbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mThisWeekButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mThisMonthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mThisYearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mFromDateEdittext.setKeyListener(null);
        mFromDateEdittext.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                showDialog(DATE_DIALOG_ID_FROM);
                return true;
            }
        });


        mToDateEdittext.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                showDialog(DATE_DIALOG_ID_TO);
                return true;
            }
        });

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        int widthPixels = metrics.widthPixels;
        int heightPixels = metrics.heightPixels;


        if(widthPixels <= 480){
            int accountWidth = mAccountTextView.getWidth();

            float scale = ExportActivity.this.getResources().getDisplayMetrics().density;
            int pixels = (int) (200 * scale + 0.5f);
            mAccountTextView.getLayoutParams().width = pixels;
            pixels = (int) (200 * scale + 0.5f);
            mFromTextView.getLayoutParams().width = pixels;
            pixels = (int) (200 * scale + 0.5f);
            mToTextView.getLayoutParams().width = pixels;

            mAccountButton.setTextSize((int) (11 * scale + 0.5f));
            mFromDateEdittext.setTextSize((int) (9 * scale + 0.5f));
            mToDateEdittext.setTextSize((int) (9 * scale + 0.5f));
        }
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_DIALOG_ID_FROM:
                int[] splittedFromDate = Common.dateTextSplitter(mFromDateEdittext.getText().toString());
                return new DatePickerDialog(this, datePickerFromListener,
                        splittedFromDate[2], splittedFromDate[1]-1, splittedFromDate[0]);
            case DATE_DIALOG_ID_TO:
                int[] splittedToDate = Common.dateTextSplitter(mFromDateEdittext.getText().toString());
                return new DatePickerDialog(this, datePickerToListener,
                        splittedToDate[2], splittedToDate[1]-1, splittedToDate[0]);
        }
        return null;
    }


    private DatePickerDialog.OnDateSetListener datePickerToListener
            = new DatePickerDialog.OnDateSetListener() {

        // when dialog box is closed, below method will be called.
        public void onDateSet(DatePicker view, int selectedYear,
                              int selectedMonth, int selectedDay) {
            mMonth = selectedMonth+1;;
            mDay = selectedDay;
            mYear = selectedYear;

            ExportActivity.this.mToDateEdittext.setText(mDay+"/"+mMonth+"/"+mYear);
        }
    };

    private DatePickerDialog.OnDateSetListener datePickerFromListener
            = new DatePickerDialog.OnDateSetListener() {

        // when dialog box is closed, below method will be called.
        public void onDateSet(DatePicker view, int selectedYear,
                              int selectedMonth, int selectedDay) {
            mMonth = selectedMonth+1;;
            mDay = selectedDay;
            mYear = selectedYear;

            ExportActivity.this.mFromDateEdittext.setText(mDay+"/"+mMonth+"/"+mYear);
        }
    };


    @Override
    protected void onResume() {
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return mGestureDetector.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float v, float v2) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent start, MotionEvent finish, float v, float v2) {
        if(start != null & finish != null){

            float yDistance = Math.abs(finish.getY() - start.getY());

            if((finish.getRawX()>start.getRawX()) && (yDistance < 15)){
                float xDistance = Math.abs(finish.getRawX() - start.getRawX());

                if(xDistance > 50){
                    finish();
                    return true;
                }
            }

        }

        return false;
    }
}
