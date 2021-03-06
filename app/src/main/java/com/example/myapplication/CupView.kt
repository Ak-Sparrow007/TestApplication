package com.example.myapplication

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class CupView (context: Context, attributeSet: AttributeSet) : View(context, attributeSet){

    private val paint = Paint().apply {
        color = Color.BLACK
        style = Paint.Style.STROKE
        strokeWidth = 15f
        pathEffect = CornerPathEffect(20f)

    }


    private val bottlePaint = Paint().apply {
        color = Color.BLACK
        style = Paint.Style.STROKE
        strokeWidth = 15f
        pathEffect = CornerPathEffect(30f)
    }

    private val strawPaint = Paint().apply {
        color = Color.BLACK
        style = Paint.Style.STROKE
        strokeWidth = 10f
        //pathEffect = CornerPathEffect(30f)
    }

    private val topBar2Path = Path()
    private val topBar1Path = Path()
    private val bottlePath = Path()
    private val strawPath = Path()

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)


        strawPath.moveTo(480f, 250f)
        strawPath.lineTo(520f, 150f)
        strawPath.lineTo(650f, 100f)
        strawPath.lineTo(640f, 130f)
        strawPath.lineTo(540f, 170f)
        strawPath.lineTo(510f, 250f)

        topBar1Path.moveTo(340f, 300f)
        topBar1Path.lineTo(360f, 250f)
        topBar1Path.lineTo(630f, 250f)
        topBar1Path.lineTo(660f, 300f)

        topBar2Path.moveTo(300f, 300f)
        topBar2Path.lineTo(700f, 300f)
        topBar2Path.lineTo(730f, 340f)
        topBar2Path.lineTo(270f, 340f)
        topBar2Path.close()

        bottlePath.moveTo(340f, 340f)
        bottlePath.lineTo(370f, 950f)
        bottlePath.lineTo(600f, 950f)
        bottlePath.lineTo(650f, 340f)

    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        if (canvas == null) return

        canvas.translate(60f, 350f)

        canvas.drawPath(strawPath, strawPaint)
        canvas.drawPath(topBar1Path, paint)
        canvas.drawPath(topBar2Path, paint)
        canvas.drawPath(bottlePath, bottlePaint)
    }

}