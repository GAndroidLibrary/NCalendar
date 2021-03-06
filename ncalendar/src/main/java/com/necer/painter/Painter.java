package com.necer.painter;

import android.graphics.Canvas;
import android.graphics.Rect;

import com.necer.entity.NDate;

import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by necer on 2019/1/3.
 */
public abstract class Painter {


    public List<LocalDate> mPointList = new ArrayList<>();


    /**
     * 绘制今天的日期
     *
     * @param canvas
     * @param rect
     * @param nDate
     * @param isSelect 今天是否被选中
     */
    public abstract void onDrawToday(Canvas canvas, Rect rect, NDate nDate, boolean isSelect);


    /**
     * 绘制当前月或周的日期
     *
     * @param canvas
     * @param rect
     * @param nDate
     * @param isSelect 是否选中
     */
    public abstract void onDrawCurrentMonthOrWeek(Canvas canvas, Rect rect, NDate nDate, boolean isSelect);

    /**
     * 绘制上一月，下一月的日期，周日历不须实现
     *
     * @param canvas
     * @param rect
     * @param nDate
     */
    public abstract void onDrawNotCurrentMonth(Canvas canvas, Rect rect, NDate nDate);


    /**
     * 绘制不可用的日期，和方法setDateInterval(startFormatDate, endFormatDate)对应
     *
     * @param canvas
     * @param rect
     * @param nDate
     */
    public abstract void onDrawDisableDate(Canvas canvas, Rect rect, NDate nDate);


    public void setPointList(List<LocalDate> localDates) {
        mPointList.clear();
        mPointList.addAll(localDates);
    }
}
