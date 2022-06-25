package com.example.gdg3.search;


import com.example.gdg3.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ImageRepository extends JpaRepository<Image, Long> {
    Image findImageByStoreId(@Param("storeId") Long storeId);
}
