
package com.vuforia.samples.Books.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Measure implements Parcelable
{

    @SerializedName("isMainStatus")
    @Expose
    private Boolean isMainStatus;
    @SerializedName("isSeries")
    @Expose
    private Boolean isSeries;
    @SerializedName("isStatus")
    @Expose
    private Boolean isStatus;
    @SerializedName("isVisible")
    @Expose
    private Boolean isVisible;
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("labels")
    @Expose
    private Labels labels;
    @SerializedName("measureDataList")
    @Expose
    private final List<MeasureDataList> measureDataList = new ArrayList<>();
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("range")
    @Expose
    private Range range;
    @SerializedName("uom")
    @Expose
    private String uom;
    @SerializedName("updateFreq")
    @Expose
    private Integer updateFreq;
    public final static Parcelable.Creator<Measure> CREATOR = new Creator<Measure>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Measure createFromParcel(Parcel in) {
            Measure instance = new Measure();
            instance.isMainStatus = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.isSeries = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.isStatus = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.isVisible = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.kind = ((String) in.readValue((String.class.getClassLoader())));
            instance.label = ((String) in.readValue((String.class.getClassLoader())));
            instance.labels = ((Labels) in.readValue((Labels.class.getClassLoader())));
            in.readList(instance.measureDataList, (MeasureDataList.class.getClassLoader()));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.range = ((Range) in.readValue((Range.class.getClassLoader())));
            instance.uom = ((String) in.readValue((String.class.getClassLoader())));
            instance.updateFreq = ((Integer) in.readValue((Integer.class.getClassLoader())));
            return instance;
        }

        public Measure[] newArray(int size) {
            return (new Measure[size]);
        }

    }
    ;

    public Boolean getIsMainStatus() {
        return isMainStatus;
    }

    public Boolean getIsStatus() {
        return isStatus;
    }

    public Boolean getIsVisible() {
        return isVisible;
    }

    public String getLabel() {
        return label;
    }

    public Labels getLabels() {
        return labels;
    }

    public List<MeasureDataList> getMeasureDataList() {
        return measureDataList;
    }

    public String getName() {
        return name;
    }

    public String getUom() {
        return uom;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(isMainStatus);
        dest.writeValue(isSeries);
        dest.writeValue(isStatus);
        dest.writeValue(isVisible);
        dest.writeValue(kind);
        dest.writeValue(label);
        dest.writeValue(labels);
        dest.writeList(measureDataList);
        dest.writeValue(name);
        dest.writeValue(range);
        dest.writeValue(uom);
        dest.writeValue(updateFreq);
    }

    public int describeContents() {
        return  0;
    }

}
