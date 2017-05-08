
package com.vuforia.samples.Books.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Range implements Parcelable
{

    @SerializedName("max")
    @Expose
    private String max;
    @SerializedName("min")
    @Expose
    private String min;
    public final static Parcelable.Creator<Range> CREATOR = new Creator<Range>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Range createFromParcel(Parcel in) {
            Range instance = new Range();
            instance.max = ((String) in.readValue((String.class.getClassLoader())));
            instance.min = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Range[] newArray(int size) {
            return (new Range[size]);
        }

    }
    ;

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(max);
        dest.writeValue(min);
    }

    public int describeContents() {
        return  0;
    }

}
