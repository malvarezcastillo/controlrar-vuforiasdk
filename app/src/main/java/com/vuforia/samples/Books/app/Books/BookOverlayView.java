/*===============================================================================
Copyright (c) 2016 PTC Inc. All Rights Reserved.

Copyright (c) 2012-2014 Qualcomm Connected Experiences, Inc. All Rights Reserved.

Vuforia is a trademark of PTC Inc., registered in the United States and other 
countries.
===============================================================================*/

package com.vuforia.samples.Books.app.Books;

import com.vuforia.samples.Books.R;
import com.vuforia.samples.Books.model.Labels;
import com.vuforia.samples.Books.model.Measure;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

// Custom View with Book Overlay Data
public class BookOverlayView extends RelativeLayout {
    public BookOverlayView(Context context) {

        this(context, null);
    }


    public BookOverlayView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }


    public BookOverlayView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        inflateLayout(context);

    }


    // Inflates the Custom View Layout
    private void inflateLayout(Context context) {

        final LayoutInflater inflater = LayoutInflater.from(context);

        // Generates the layout for the view
        inflater.inflate(R.layout.bitmap_layout, this, true);
    }


    public void setSensorName(String value) {
        TextView tv = (TextView) findViewById(R.id.sensorAliasTV);
        tv.setText(value);
    }

    public void setMeasure(Measure m, int pos) {
        Log.d("BOOKOVERLAY", "" + pos);
        TextView mtv = null;
        TextView utv = null;
        String measure = "", uom;
        //This looks messy but it works, uh..
        if (m.getIsStatus()) {
            Labels l = m.getLabels();
            if (m.getIsMainStatus()) {
                if (l != null) {
                    if (m.getMeasureDataList().get(0).getValue().equals("True")) {
                        measure = l.getTrue();
                    } else if (m.getMeasureDataList().get(0).getValue().equals("False")) {
                        measure = l.getFalse();
                    } else {
                        measure = m.getMeasureDataList().get(0).getValue();
                    }
                }

            } else {
                measure = m.getMeasureDataList().get(0).getValue();
            }
            uom = "";
        } else {
            measure = m.getMeasureDataList().get(0).getValue() + m.getUom();
            uom = m.getLabel().replaceAll(" .*", "");
        }
        switch (pos) {
            case 1:
                mtv = (TextView) findViewById(R.id.measureTV1);
                utv = (TextView) findViewById(R.id.uomTV1);
                break;
            case 2:
                mtv = (TextView) findViewById(R.id.measureTV2);
                utv = (TextView) findViewById(R.id.uomTV2);
                break;
            case 3:
                mtv = (TextView) findViewById(R.id.measureTV3);
                utv = (TextView) findViewById(R.id.uomTV3);
                break;
            case 4:
                mtv = (TextView) findViewById(R.id.measureTV4);
                utv = (TextView) findViewById(R.id.uomTV4);
                utv = (TextView) findViewById(R.id.uomTV4);
                break;
            default:
                break;
        }

        if (utv != null && mtv != null) {
            mtv.setText(measure);
            utv.setText(uom);
        }
    }


}
