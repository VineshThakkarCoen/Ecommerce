package com.learn.mycart_511.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    private String categoryTitle;
    private String categorySDescription;
    @OneToMany(mappedBy = "category")
    private List<product> products = new ArrayList<>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public category(int categoryId, String categoryTitle, String categorySDescription) {
        this.categoryId = categoryId;
        this.categoryTitle = categoryTitle;
        this.categorySDescription = categorySDescription;
    }

    public category(String categoryTitle, String categorySDescription,List<product> products) {
        this.categoryTitle = categoryTitle;
        this.categorySDescription = categorySDescription;
        this.products = products;
    }

    public category() {
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public String getCategorySDescription() {
        return categorySDescription;
    }

    public void setCategorySDescription(String categorySDescription) {
        this.categorySDescription = categorySDescription;
    }

    public List<product> getProducts() {
        return products;
    }

    public void setProducts(List<product> products) {
        this.products = products;
    }

    
    @Override
    public String toString() {
        return "category{" + "categoryId=" + categoryId + ", categoryTitle=" + categoryTitle + ", categorySDescription=" + categorySDescription + '}';
    }
    
     
          
           
    
}
