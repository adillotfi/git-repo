package com.ecommerce.micrommerce.model;

public class Product {
  private int id;
  private String name;
  private int prix;

  public Product() {
  }

  public Product(int id, String nom, int prix) {

    this.id = id;

    this.name = nom;

    this.prix = prix;

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String nom) {
    this.name = nom;
  }

  public int getPrix() {
    return prix;
  }

  public void setPrix(int prix) {
    this.prix = prix;
  }

  @Overrid
  public String toString() {
    return "Product{" +
        "id=" + id +
        ", nom='" + name + '\'' +
        ", prix=" + prix +
        '}';
  }
}
