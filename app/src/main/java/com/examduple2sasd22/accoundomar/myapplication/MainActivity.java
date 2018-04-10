package com.examduple2sasd22.accoundomar.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.examduple2sasd22.accoundomar.myapplication.Adapter.WheelImageAdapter;
import com.examduple2sasd22.accoundomar.myapplication.Data.ImageData;

import java.util.ArrayList;
import java.util.List;

import github.hellocsl.cursorwheel.CursorWheelLayout;

public class MainActivity extends AppCompatActivity implements CursorWheelLayout.OnMenuSelectedListener{
    CursorWheelLayout wheel_image;

    List<ImageData> lstImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        try{
            loadData();
        }catch (Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show();}
        wheel_image.setOnMenuSelectedListener(this);

    }


    private void loadData() {


     //اضاقة العناصر في القائمة

        lstImage=new ArrayList<>();
        lstImage.add(new ImageData(R.drawable.images,"Drive1"));
        lstImage.add(new ImageData(R.drawable.images,"Drive2"));
        lstImage.add(new ImageData(R.drawable.images,"Drive3"));
        lstImage.add(new ImageData(R.drawable.images,"Drive4"));
        lstImage.add(new ImageData(R.drawable.images,"Drive5"));
        lstImage.add(new ImageData(R.drawable.images,"Drive6"));
        WheelImageAdapter imgAdapter =new WheelImageAdapter(getBaseContext(),lstImage);
        wheel_image.setAdapter(imgAdapter);
    }

    private void initViews() {
        wheel_image=(CursorWheelLayout)findViewById(R.id.whell_image);

    }

    @Override
    public void onItemSelected(CursorWheelLayout parent, View view, int i) {

         if (parent.getId()==R.id.whell_image){//ماذا يحدث عند اختيار العنصر
            try {
                Toast.makeText(getBaseContext(), "selected :" + lstImage.get(i).imageDescription, Toast.LENGTH_LONG).show();
            }catch (Exception e){Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show();}

        }
    }
}
