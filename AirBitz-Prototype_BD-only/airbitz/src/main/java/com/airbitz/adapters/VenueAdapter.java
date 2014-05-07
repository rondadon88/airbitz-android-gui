package com.airbitz.adapters;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.airbitz.R;
import com.airbitz.fragments.BusinessDirectoryFragment;
import com.airbitz.models.BusinessSearchResult;
import com.airbitz.utils.Common;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created on 2/13/14.
 */
public class VenueAdapter extends BaseAdapter {

    public static final String TAG = VenueAdapter.class.getSimpleName();
    private final Context mContext;
    private final List<BusinessSearchResult> mVenues;
    private int mCurrentPosition = 0;
    private boolean firstPlace = false;
    private double mLat;
    private double mLon;

    public VenueAdapter(Context context, List<BusinessSearchResult> venues) {
        firstPlace = false;
        mContext = context;
        mVenues = venues;
        mLat = getLatFromSharedPreference();
        mLon = getLonFromSharedPreference();
    }

    @Override
    public int getCount() {
        return mVenues.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        mCurrentPosition = position;
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.item_listview_venues, parent, false);
        TextView venueNameTextView = (TextView) convertView.findViewById(R.id.textview_business_name);
        TextView distanceTextView = (TextView) convertView.findViewById(R.id.textview_distance);
        TextView addressTextView = (TextView) convertView.findViewById(R.id.textview_address);
        TextView discountTextView = (TextView) convertView.findViewById(R.id.textview_discount);

        venueNameTextView.setTypeface(BusinessDirectoryFragment.latoBlackTypeFace);
        distanceTextView.setTypeface(BusinessDirectoryFragment.latoBlackTypeFace);
        addressTextView.setTypeface(BusinessDirectoryFragment.helveticaNeueTypeFace);
        discountTextView.setTypeface(BusinessDirectoryFragment.helveticaNeueTypeFace);

        final BusinessSearchResult result = mVenues.get(position);

        // Address
        if (!TextUtils.isEmpty(result.getAddress())) {
            addressTextView.setText(result.getAddress());
            addressTextView.setVisibility(View.VISIBLE);
        } else {
            addressTextView.setVisibility(View.INVISIBLE);
        }

        // Discount
        String discount = result.getBizDiscount();
        double discountDouble = 0;
        try {
            discountDouble = Double.parseDouble(discount);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (discountDouble != 0) {
            discountTextView.setText("BTC Discount " + (int) (discountDouble * 100) + "%");
            discountTextView.setVisibility(View.VISIBLE);
        } else {
            discountTextView.setVisibility(View.GONE);
        }

        // Distance
        try{
            double distance = Double.parseDouble(mVenues.get(position).getDistance());
            distance = Common.metersToMiles(distance);
            if (distance < 1.0){
                distance = Math.ceil(distance*10)/10;
                String distanceString = ""+distance;
                distanceString = distanceString.substring(1,distanceString.length());
                distanceTextView.setText(distanceString+" miles");
            } else if (distance >= 1000){
                int distanceInInt = (int) distance;
                distanceTextView.setText(String.valueOf(distanceInInt)+" miles");
            } else {
                distance = Math.ceil(distance*10)/10;
                distanceTextView.setText(String.valueOf(distance)+" miles");
            }
            distanceTextView.setVisibility(View.VISIBLE);
        } catch (Exception e){
            distanceTextView.setVisibility(View.INVISIBLE);
            e.printStackTrace();
        }
        ImageView backgroundView = (ImageView) convertView.findViewById(R.id.venueBackground);
        venueNameTextView.setText(mVenues.get(position).getName());

        if(position==0){
            RelativeLayout mainLayout = (RelativeLayout)convertView.findViewById(R.id.mainLayout);
            int height = (int) mContext.getResources().getDimension(R.dimen.venue_list_full_height_275);
            mainLayout.getLayoutParams().height = height;
        }

        final Picasso p = Picasso.with(mContext);
        p.load(mVenues.get(position).getProfileImage().getImageThumbnail()).noFade().into(backgroundView);

        return convertView;
    }

    private float getStateFromSharedPreferences(String key) {
        SharedPreferences pref = mContext.getSharedPreferences(BusinessDirectoryFragment.PREF_NAME, Context.MODE_PRIVATE);
        return pref.getFloat(key, -1);
    }

    private double getLatFromSharedPreference(){
        double lat = (double)getStateFromSharedPreferences(BusinessDirectoryFragment.LAT_KEY);
        return lat;
    }

    private double getLonFromSharedPreference(){
        double lon = (double)getStateFromSharedPreferences(BusinessDirectoryFragment.LON_KEY);
        return lon;
    }


}
