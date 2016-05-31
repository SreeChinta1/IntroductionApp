package javafinalproject.introductionapp;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.ContextMenu;
import android.view.View;

public class RoadTester extends View
{
    public RoadTester(Context context)
    {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawColor(Color.BLACK);
        Paint white = new Paint();
        Rect divider = new Rect();
        white.setColor(Color.WHITE);
        white.setStyle(Paint.Style.FILL);
        int left = (int)(canvas.getWidth()*.22), right = (int)(canvas.getWidth()*.26), space = canvas.getHeight()/18;
        while(right <= canvas.getWidth())
        {
            int top = 0, bottom = canvas.getHeight()/9;

            while(bottom <= canvas.getHeight())
            {
                divider.set(left, top, right, bottom);
                canvas.drawRect(divider, white);
                top = bottom + space;
                bottom = top + canvas.getHeight()/9;
            }

            left = right + (int)(canvas.getWidth()*.22);
            right = left + (int)(canvas.getWidth()*.04);
        }
    }
}
