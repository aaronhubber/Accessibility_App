//package com.jaarozz.accessibilityApp.models;
//
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "workshops")
//public class WorkShop{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//
//    @Column(name = "id", nullable = false)
//    private Long id;
//    @Column(name = "title")
//    private String title;
//    @Column(name = "genres")
//    private String genre;
//    @Column(name = "descriptions")
//    private String description;
//
//
//    public WorkShop(String title, String genre, String description) {
//        this.title = title;
//        this.genre = genre;
//        this.description = description;
//    }
//
//    public WorkShop() {
//    }
//
//    //region GETTERS & SETTERS
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    //endregion
//}
