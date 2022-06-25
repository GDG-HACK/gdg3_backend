package com.example.gdg3.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "image")
@Getter @Setter
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long imgId;

    private String imgUrl;

    private int order;

    private boolean isMenu;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "store_id")
    private Store store;
}
