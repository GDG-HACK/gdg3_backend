package com.example.gdg3.detail.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class MenuObject {
    private String menuName;

    private int price;

    public MenuObject(String menuName, int price) {
        this.menuName = menuName;
        this.price = price;
    }
}
