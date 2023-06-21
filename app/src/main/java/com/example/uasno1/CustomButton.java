package com.example.uasno1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.res.ResourcesCompat;

public class CustomButton extends AppCompatButton {

    boolean clicked = false;
    Drawable mImage;

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        mImage = ResourcesCompat.getDrawable(getResources(), R.drawable.plane_img, null);
        showImage();

        setBackgroundColor(Color.GREEN);
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked == false){
                    setBackgroundColor(Color.GREEN);
                    clicked = true;
                }
                else{
                    setBackgroundColor(Color.RED);
                    clicked = false;
                }
            }
        });
    }

    void showImage(){
        setCompoundDrawablesRelativeWithIntrinsicBounds(mImage, null, mImage, null);
    }

}
