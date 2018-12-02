package me.home.bangumi.dao;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "BANGUMI_CALENDAR".
 */
@Entity
public class BangumiCalendar {

    @Id
    private Long id;

    @NotNull
    private String name_cn;
    private int air_weekday;
    private int bangumi_id;
    private Integer bangumi_total;
    private Float bangumi_average;
    private String large_image;
    private String common_image;
    private String medium_image;
    private String small_image;
    private String grid_image;
    private Integer rank;
    private String name_jp;

    @Generated
    public BangumiCalendar() {
    }

    public BangumiCalendar(Long id) {
        this.id = id;
    }

    @Generated
    public BangumiCalendar(Long id, String name_cn, int air_weekday, int bangumi_id, Integer bangumi_total, Float bangumi_average, String large_image, String common_image, String medium_image, String small_image, String grid_image, Integer rank, String name_jp) {
        this.id = id;
        this.name_cn = name_cn;
        this.air_weekday = air_weekday;
        this.bangumi_id = bangumi_id;
        this.bangumi_total = bangumi_total;
        this.bangumi_average = bangumi_average;
        this.large_image = large_image;
        this.common_image = common_image;
        this.medium_image = medium_image;
        this.small_image = small_image;
        this.grid_image = grid_image;
        this.rank = rank;
        this.name_jp = name_jp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    public String getName_cn() {
        return name_cn;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName_cn(@NotNull String name_cn) {
        this.name_cn = name_cn;
    }

    public int getAir_weekday() {
        return air_weekday;
    }

    public void setAir_weekday(int air_weekday) {
        this.air_weekday = air_weekday;
    }

    public int getBangumi_id() {
        return bangumi_id;
    }

    public void setBangumi_id(int bangumi_id) {
        this.bangumi_id = bangumi_id;
    }

    public Integer getBangumi_total() {
        return bangumi_total;
    }

    public void setBangumi_total(Integer bangumi_total) {
        this.bangumi_total = bangumi_total;
    }

    public Float getBangumi_average() {
        return bangumi_average;
    }

    public void setBangumi_average(Float bangumi_average) {
        this.bangumi_average = bangumi_average;
    }

    public String getLarge_image() {
        return large_image;
    }

    public void setLarge_image(String large_image) {
        this.large_image = large_image;
    }

    public String getCommon_image() {
        return common_image;
    }

    public void setCommon_image(String common_image) {
        this.common_image = common_image;
    }

    public String getMedium_image() {
        return medium_image;
    }

    public void setMedium_image(String medium_image) {
        this.medium_image = medium_image;
    }

    public String getSmall_image() {
        return small_image;
    }

    public void setSmall_image(String small_image) {
        this.small_image = small_image;
    }

    public String getGrid_image() {
        return grid_image;
    }

    public void setGrid_image(String grid_image) {
        this.grid_image = grid_image;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getName_jp() {
        return name_jp;
    }

    public void setName_jp(String name_jp) {
        this.name_jp = name_jp;
    }

}
