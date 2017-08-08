package com.android.nikunj.shopave;
/**
 * Created by gurleensethi on 08/08/17.
 */

public class ProductModel {
    private String name;
    private Double price;
    private Double rating;
    private int totalRatings;
    private int image;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public ProductModel(String name, Double price, Double rating, int totalRatings, int image) {
        this.name = name;
        this.price = price;

        this.rating = rating;
        this.totalRatings = totalRatings;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }
}
