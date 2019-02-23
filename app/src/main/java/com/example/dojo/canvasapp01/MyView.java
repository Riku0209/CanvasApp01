package com.example.dojo.canvasapp01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.nfc.NfcAdapter;
import android.view.View;

public class MyView extends View {
    private Paint paint;
    private Path path;

    // コンストラクタ　（初期設定）
  public  MyView (Context Con) {
        super(Con);

        paint = new Paint();
        path = new Path();
    }

    // 絵画の処理
    @Override
    protected void onDraw(Canvas canvas) {

      //　背景
        canvas.drawColor(Color.CYAN);

      //円
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(30);
        canvas.drawCircle(500,400,100,paint);
        paint.setColor(Color.RED);
      canvas.drawCircle(500,300,100,paint);

      //四角
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(60);
        canvas.drawRect(400,800,600,1000,paint);

        //線
        paint.setColor(Color.BLACK);
        canvas.drawLine(0,0,canvas.getWidth(),canvas.getHeight(),paint);
        canvas.drawLine(canvas.getWidth(),0,0,canvas.getHeight(),paint);

        //三角形（パス）
        paint.setColor(Color.WHITE);
        path.moveTo(500,500);
        path.lineTo(700,900);
        path.lineTo(400,800);
        path.lineTo(500,500);
        canvas.drawPath(path,paint);

        path.reset();
        paint.setColor(Color.BLUE);
        path.moveTo(400,400);
        path.lineTo(100,100);
        path.lineTo(200,100);
        path.lineTo(400,400);
        canvas.drawPath(path,paint);

    }



}
