package com.example.gdg3.detail;


import com.example.gdg3.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findByStoreId(long storeId);
}
