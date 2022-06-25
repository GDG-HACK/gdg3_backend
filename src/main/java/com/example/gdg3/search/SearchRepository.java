package com.example.gdg3.search;

import com.example.gdg3.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface SearchRepository extends JpaRepository<Store, Long> {
    List<Store> findByAddressContaining(String location);
}
