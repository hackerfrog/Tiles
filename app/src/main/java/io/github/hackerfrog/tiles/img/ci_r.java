package io.github.hackerfrog.tiles.img;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;

import io.github.hackerfrog.tiles.R;

public class ci_r {

    Context context;
    Bitmap bitmap;
    int rotateCount = 0;
    public static int rotateMod = 4;

    public ci_r(Context context) {
        this.context = context;
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.ci_r);

        bitmap = Bitmap.createScaledBitmap(bitmap, 100, 100, true);
    }

    public void setRotateCount(int rotateCount) {
        this.rotateCount = rotateCount;
        for (int i = 0; i < rotateCount; i++) {
            rotate();
        }
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void rotate() {
        rotateCount++;

        Matrix matrix = new Matrix();
        matrix.postRotate(90);

        bitmap = Bitmap.createBitmap(bitmap, 0, 0, 100, 100, matrix, true);
    }
}
