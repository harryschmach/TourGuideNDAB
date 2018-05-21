package com.example.harryschmach.tourguidendab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.harryschmach.tourguidendab.AttractionFragment.OnListFragmentInteractionListener;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link SDAttraction} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyAttractionRecyclerViewAdapter extends RecyclerView.Adapter<MyAttractionRecyclerViewAdapter.ViewHolder> {

    private final List<SDAttraction> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyAttractionRecyclerViewAdapter(List<SDAttraction> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.attraction_in_fragment_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mNameView.setText(mValues.get(position).getNameOfPlace());
        holder.mDescriptionView.setText(mValues.get(position).getDescriptionOfPlace());
        holder.mAddressView.setText(mValues.get(position).getLocationOfPlace());
        holder.mImageView.setImageResource(mValues.get(position).getResourceImID());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mNameView;
        public final TextView mDescriptionView;
        public final TextView mAddressView;
        public final ImageView mImageView;
        public SDAttraction mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mNameView = view.findViewById(R.id.name_of_attraction);
            mDescriptionView = view.findViewById(R.id.attraction_description_tv);
            mAddressView = view.findViewById(R.id.address_of_attraction);
            mImageView = view.findViewById(R.id.attraction_in_list_pic);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mNameView.getText() + "'";
        }
    }
}
