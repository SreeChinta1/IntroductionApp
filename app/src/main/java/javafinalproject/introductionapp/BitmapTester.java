package javafinalproject.introductionapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class BitmapTester extends View
{
    private Bitmap image;

    public BitmapTester(Context context)
    {
        super(context);
        image = BitmapFactory.decodeResource(getResources(), R.drawable.blue_car);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        BitmapFactory.Options bitmapOptions = new BitmapFactory.Options();
        bitmapOptions.inSampleSize = 4;
        Bitmap scaledImage = BitmapFactory.decodeResource(getResources(), R.drawable.blue_car, bitmapOptions);
        canvas.drawBitmap(scaledImage, (canvas.getWidth()/2), 0, null);
    }
}