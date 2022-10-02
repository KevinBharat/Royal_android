package com.example.myappliction;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyBaseAdapter extends BaseAdapter {
    Context context;
    ArrayList<ContactModel> contactModelArrayList;

    public MyBaseAdapter(Context context, ArrayList<ContactModel> contactModelArrayList) {

        this.context = context;
        this.contactModelArrayList = contactModelArrayList;
    }

    @Override
    public int getCount() {

        return contactModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {

        return contactModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = layoutInflater.inflate(R.layout.raw_list, null);

        final ContactModel contactModel = (ContactModel) getItem(i);
        TextView tvName = (TextView) view.findViewById(R.id.tv_name);
        tvName.setText(contactModelArrayList.get(i).getFirstName() + "  " +
                contactModelArrayList.get(i).getLastName());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strfn = contactModelArrayList.get(i).getFirstName();
                String strln = contactModelArrayList.get(i).getLastName();
                String strid = contactModelArrayList.get(i).getID();

                Intent i = new Intent(context, UpdateActivity.class);
                i.putExtra("FN_KEY", strfn);
                i.putExtra("LN_KEY", strln);
                i.putExtra("ID_KEY", strid);
                context.startActivity(i);

            }
        });
        return view;
    }
}