package com.example.dell.fire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class first extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
    public boolean onTouchEvent(MotionEvent touch)
    {
        switch(touch.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                x1=touch.getX();
                y1=touch.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2=touch.getX();
                y2=touch.getY();
                if((x1<x2)||(x1>x2)||(y1<y2)||(y1>y2))
                {
                    Intent i=new Intent(first.this,Fire.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }
}
