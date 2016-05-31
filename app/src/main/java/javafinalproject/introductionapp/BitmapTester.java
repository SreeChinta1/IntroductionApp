package javafinalproject.introductionapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class BitmapTester extends View
{
    public static Bitmap image;
    public static int x;

    public BitmapTester(Context context)
    {
        super(context);
        image = BitmapFactory.decodeResource(getResources(), R.drawable.yellow_car);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        BitmapFactory.Options bitmapOptions = new BitmapFactory.Options();
        bitmapOptions.inSampleSize = 6;
        Bitmap scaledImage = BitmapFactory.decodeResource(getResources(), R.drawable.yellow_car, bitmapOptions);
        x = (canvas.getWidth()/2);
        canvas.drawBitmap(scaledImage,x, 0, null);
    }
}