package com.example.gdg3.detail;

import com.example.gdg3.entity.Image;
import com.example.gdg3.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImgRepository extends JpaRepository<Image, Long> {
    List<Image> findByStoreId(long storeId);
}
