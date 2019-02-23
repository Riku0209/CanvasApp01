package com.example.dojo.canvasapp01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.nfc.NfcAdapter;
import android.view.View;

public class MyView extends View {
    private Paint paint;

    // コンストラクタ　（初期設定）
  public  MyView (Context Con) {
        super(Con);

        paint = new Paint();
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
        
    }



}
