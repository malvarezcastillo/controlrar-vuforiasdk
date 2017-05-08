
package com.vuforia.samples.Books.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Labels implements Parcelable {

    @SerializedName("True")
    @Expose
    private String _true;
    @SerializedName("False")
    @Expose
    private String _false;

    public final static Parcelable.Creator<Labels> CREATOR = new Creator<Labels>() {
        @SuppressWarnings({
                "unchecked"
        })
        public Labels createFromParcel(Parcel in) {
            Labels instance = new Labels();
            instance._true = ((String) in.readValue((String.class.getClassLoader())));
            instance._false = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Labels[] newArray(int size) {
            return (new Labels[size]);
        }

    };

    public String getTrue() {
        return _true;
    }

    public void setTrue(String _true) {
        this._true = _true;
    }

    public String getFalse() {
        return _false;
    }

    public void setFalse(String _false) {
        this._false = _false;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(_true);
        dest.writeValue(_false);
    }

    public int describeContents() {
        return 0;
    }

}