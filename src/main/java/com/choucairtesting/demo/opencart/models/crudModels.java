package com.choucairtesting.demo.opencart.models;

public class crudModels {

    String categoryName;
    String description;
    String metaTagTitle;
    String metaTagDescription;
    String metaTagKeywords;

    public crudModels(String categoryName, String description, String metaTagTitle, String metaTagDescription, String metaTagKeywords) {
        this.categoryName = categoryName;
        this.description = description;
        this.metaTagTitle = metaTagTitle;
        this.metaTagDescription = metaTagDescription;
        this.metaTagKeywords = metaTagKeywords;
    }


    public String getCategoryName() {
        return categoryName;
    }

    public String getDescription() {
        return description;
    }

    public String getMetaTagTitle() {
        return metaTagTitle;
    }

    public String getMetaTagDescription() {
        return metaTagDescription;
    }

    public String getMetaTagKeywords() {
        return metaTagKeywords;
    }
}
