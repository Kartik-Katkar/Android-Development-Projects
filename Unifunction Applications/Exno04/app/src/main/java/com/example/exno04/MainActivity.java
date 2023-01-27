package com.example.exno04;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating a Bitmap
        Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);

        //Setting the Bitmap as background for the ImageView
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(bg));

        //Creating the Canvas Object
        Canvas canvas = new Canvas(bg);

        //Creating the Paint Object and set its color & TextSize
        //To draw a Rectangle
        Paint paint = new Paint();
        paint.setColor(Color.CYAN);
        paint.setTextSize(50);
        canvas.drawText("Rectangle", 420, 150, paint);
        canvas.drawRect(400, 200, 650, 700, paint);

        //To draw a Circle
        Paint paint1 = new Paint();
        paint1.setColor(Color.YELLOW);
        paint1.setTextSize(40);
        canvas.drawText("Circle", 120, 150, paint1);
        canvas.drawCircle(200, 350, 150,paint1);

        //To draw a Square
        Paint paint2 = new Paint();
        paint2.setColor(Color.BLUE);
        paint2.setTextSize(30);
        canvas.drawText("Square", 120, 800, paint2);
        canvas.drawRect(50, 850, 350, 1150, paint2);

        //To draw a Line
        Paint paint3 = new Paint();
        paint3.setColor(Color.GREEN);
        paint3.setTextSize(60);
        canvas.drawText("Line", 480, 800, paint3);
        canvas.drawLine(520, 850, 520, 1150, paint3);
    }
}
