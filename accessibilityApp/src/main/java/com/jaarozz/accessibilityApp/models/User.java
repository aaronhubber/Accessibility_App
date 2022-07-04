//package com.jaarozz.accessibilityApp.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//import java.awt.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "users")
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", nullable = false)
//    private Long id;
//    @Column(name = "name")
//    private String name;
//    @Column(name = "assistance_level")
//    private AssistanceLevel assistanceLevel;
//
////    @JsonIgnoreProperties({"user"})
////    @OneToMany(mappedBy = "user")
////    private ArrayList<IChoose> choices;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JsonIgnoreProperties({"user"})
//    @JoinColumn(name = "image_id", referencedColumnName = "id")
//    private ImageEntity image;
//
//    public User(String name, AssistanceLevel assistanceLevel) {
//        this.name = name;
//        this.assistanceLevel = assistanceLevel;
////        this.image = new ImageEntity();
//
//    }
//
//    public User() {}
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public AssistanceLevel getAssistanceLevel() {
//        return assistanceLevel;
//    }
//
//    public void setAssistanceLevel(AssistanceLevel assistanceLevel) {
//        this.assistanceLevel = assistanceLevel;
//    }
//
////    public ArrayList<IChoose> getChoices() {
////        return choices;
////    }
////
////    public void setChoices(ArrayList<IChoose> choices) {
////        this.choices = choices;
////    }
//
//    public ImageEntity getImage() {
//        return image;
//    }
//
//    public void setImage(ImageEntity image) {
//        this.image = image;
//    }
//
//    public Long getId() {
//        return id;
//    }
//}
