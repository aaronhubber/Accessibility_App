//package com.jaarozz.accessibilityApp.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import org.springframework.boot.SpringApplication;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "choices")
//public class Choice {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//
//    @Column(name = "id", nullable = false)
//    private Long id;
//    @Column(name = "date")
//    private String date;
//
//    @JsonIgnoreProperties({"choice"}) //can add more than one field
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "choice_id", referencedColumnName = "id")
//    private IChoose choice;
//
//
//    @JsonIgnoreProperties({"user"}) //can add more than one field
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    private User user;
//
//    public Choice(String date) {
//        this.date = date;
//    }
//
//    public Choice() {
//    }
//
//    //region GETTERS & SETTERS
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public IChoose getChoice() {
//        return choice;
//    }
//
//    public void setChoice(IChoose choice) {
//        this.choice = choice;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    //endregion
//}
