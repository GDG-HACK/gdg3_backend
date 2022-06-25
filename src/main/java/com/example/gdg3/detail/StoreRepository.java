package com.example.gdg3.detail;

import com.example.gdg3.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {

    Store findStoreById(long storeId);

}
