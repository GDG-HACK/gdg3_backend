package com.example.gdg3.detail;


import com.example.gdg3.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    Menu findMenuByStore(long storeId);
}
