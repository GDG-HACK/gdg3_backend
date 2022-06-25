package com.example.gdg3;

import entity.Store;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.TestPropertySource;
import search.SearchRepository;

import javax.transaction.Transactional;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
@Transactional
@TestPropertySource(locations="classpath:application.properties")
public class SearchTest {

    @Autowired
    SearchRepository searchRepository;
//    @Autowired
//    private SearchServiceImpl searchService;

    @Test
    public void 데이터베이스연결() {
        Optional<Store> store = searchRepository.findById(2L);
    }
}
