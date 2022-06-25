package com.example.gdg3.detail.DTO;

import com.example.gdg3.entity.Menu;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class MenuInfo {
    private List<MenuObject> MenuList;


    public MenuInfo(List<MenuObject> menuList) {
        this.MenuList = menuList;
    }
}

