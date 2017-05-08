
package com.vuforia.samples.Books.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MeasureDataList implements Parcelable
{

    @SerializedName("date")
    @Expose
    private long date;
    @SerializedName("value")
    @Expose
    private String value;
    public final static Parcelable.Creator<MeasureDataList> CREATOR = new Creator<MeasureDataList>() {


        @SuppressWarnings({
            "unchecked"
        })
        public MeasureDataList createFromParcel(Parcel in) {
            MeasureDataList instance = new MeasureDataList();
            instance.date = ((long) in.readValue((Double.class.getClassLoader())));
            instance.value = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public MeasureDataList[] newArray(int size) {
            return (new MeasureDataList[size]);
        }

    }
    ;

    public long getDate() {
        return date;
    }

    public String getValue() {
        return value;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(date);
        dest.writeValue(value);
    }

    public int describeContents() {
        return  0;
    }

}
