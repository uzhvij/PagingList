package com.blogspot.uzhvij.paginglist.DataSource;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Film {

    @SerializedName("countries")
    @Expose
    private String countries;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("partner")
    @Expose
    private String partner;
    @SerializedName("actors")
    @Expose
    private String actors;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("content_group_ptr")
    @Expose
    private String contentGroupPtr;
    @SerializedName("favorites")
    @Expose
    private String favorites;
    @SerializedName("adult")
    @Expose
    private String adult;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("genres")
    @Expose
    private String genres;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("content_type_ptr")
    @Expose
    private String contentTypePtr;
    @SerializedName("partner_path")
    @Expose
    private String partnerPath;
    @SerializedName("added")
    @Expose
    private String added;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("locked")
    @Expose
    private String locked;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("comments")
    @Expose
    private String comments;
    @SerializedName("director")
    @Expose
    private String director;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("age")
    @Expose
    private String age;
    @SerializedName("status")
    @Expose
    private String status;

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContentGroupPtr() {
        return contentGroupPtr;
    }

    public void setContentGroupPtr(String contentGroupPtr) {
        this.contentGroupPtr = contentGroupPtr;
    }

    public String getFavorites() {
        return favorites;
    }

    public void setFavorites(String favorites) {
        this.favorites = favorites;
    }

    public String getAdult() {
        return adult;
    }

    public void setAdult(String adult) {
        this.adult = adult;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getContentTypePtr() {
        return contentTypePtr;
    }

    public void setContentTypePtr(String contentTypePtr) {
        this.contentTypePtr = contentTypePtr;
    }

    public String getPartnerPath() {
        return partnerPath;
    }

    public void setPartnerPath(String partnerPath) {
        this.partnerPath = partnerPath;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}