package com.examduple2sasd22.accoundomar.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.examduple2sasd22.accoundomar.myapplication.Data.ImageData;
import com.examduple2sasd22.accoundomar.myapplication.R;

import java.util.List;

import github.hellocsl.cursorwheel.CursorWheelLayout;

/**
 * Created by accoundOmar on 7/17/2017.
 */

public class WheelImageAdapter extends CursorWheelLayout.CycleWheelAdapter {
    private Context mcontext;
    private List<ImageData> menuItems;
    private LayoutInflater inflater;
    private int gravity;

    public WheelImageAdapter(Context mcontext, List<ImageData> menuItems) {
        this.mcontext = mcontext;
        this.menuItems = menuItems;
        inflater=LayoutInflater.from(mcontext);
    }

    @Override
    public int getCount() {
        return menuItems.size();

    }

    @Override
    public View getView(View view, int i) {

        ImageData data=getItem(i);
        View root=inflater.inflate(R.layout.wheel_image_layout,null,false);
        ImageView imageView=(ImageView)root.findViewById(R.id.wheel_menu_item_iv);
        imageView.setImageResource(data.imageResourse);
        return root;


    }

    @Override
    public ImageData getItem(int i) {
        return menuItems.get(i);
    }
}
