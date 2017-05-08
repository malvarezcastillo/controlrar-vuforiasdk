
package com.vuforia.samples.Books.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Sensor implements Parcelable {

    @SerializedName("alias")
    @Expose
    private String alias;
    @SerializedName("dead")
    @Expose
    private Boolean dead;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("measures")
    @Expose
    private final List<Measure> measures = new ArrayList<>();
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("subtype")
    @Expose
    private String subtype;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("visible")
    @Expose
    private Boolean visible;
    @SerializedName("zombie")
    @Expose
    private Boolean zombie;
    public final static Parcelable.Creator<Sensor> CREATOR = new Creator<Sensor>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Sensor createFromParcel(Parcel in) {
            Sensor instance = new Sensor();
            instance.alias = ((String) in.readValue((String.class.getClassLoader())));
            instance.dead = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.id = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.measures, (Measure.class.getClassLoader()));
            instance.status = ((String) in.readValue((String.class.getClassLoader())));
            instance.subtype = ((String) in.readValue((String.class.getClassLoader())));
            instance.type = ((String) in.readValue((String.class.getClassLoader())));
            instance.visible = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.zombie = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            return instance;
        }

        public Sensor[] newArray(int size) {
            return (new Sensor[size]);
        }

    };

    public String getAlias() {
        return alias;
    }

    public String getId() {
        return id;
    }

    public List<Measure> getMeasures() {
        return measures;
    }

    public String getType() {
        return type;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(alias);
        dest.writeValue(dead);
        dest.writeValue(id);
        dest.writeList(measures);
        dest.writeValue(status);
        dest.writeValue(subtype);
        dest.writeValue(type);
        dest.writeValue(visible);
        dest.writeValue(zombie);
    }

    public int describeContents() {
        return 0;
    }

}
