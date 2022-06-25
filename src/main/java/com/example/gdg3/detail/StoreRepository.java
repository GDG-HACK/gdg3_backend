package com.example.gdg3.detail;

import com.example.gdg3.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.util.List;

public interface StoreRepository extends JpaRepository<Store, Long> {

    Store findStoreById(long storeId);
    List<Store> findByAddressContaining(String location);

    @Query(value = "select * from store s where s.latitude > (:latitude - 10) and s.latitude < (:latitude + 10) " +
            "and s.longitude > (:longitude - 10) and s.longitude < (:longitude + 10)", nativeQuery = true)
    List<Store> findByLatitudeAndLongitude(@Param("latitude") float latitude, @Param("longitude") float longitude);
}
