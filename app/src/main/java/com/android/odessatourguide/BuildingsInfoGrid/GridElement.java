package com.android.odessatourguide.BuildingsInfoGrid;

public class GridElement {

    private Integer image;
    private String name;
    private String description;
    private String link;

    GridElement(Integer image, String name, String description, String link) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.link = link;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
