package com.jess.arms.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class ListViewNoScroll extends ListView {

	public ListViewNoScroll(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	public ListViewNoScroll(Context context) {
		super(context);
	}

	public ListViewNoScroll(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	public void onMeasure(int widthMeasureSpec, int heightMeasureSpec){  
        int mExpandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);  
        super.onMeasure(widthMeasureSpec, mExpandSpec);  
   }  
}
