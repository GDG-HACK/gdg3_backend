package com.example.gdg3.search;
import com.example.gdg3.config.BaseResponse;
import com.example.gdg3.search.DTO.StoreItem;
import com.example.gdg3.search.VO.SearchVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class SearchController {

    private final SearchService searchService;

    // 지역명 기반 검색
    @GetMapping("stores")
    public BaseResponse<List<StoreItem>> searchByLocation(@RequestBody SearchVO searchVO,
                                                          @RequestParam(required = false) String location,
                                                          @RequestParam(required = false) String latitude,
                                                          @RequestParam(required = false) String longitude
    ) throws JsonProcessingException {
        List<StoreItem> storeItem = searchService.search(location, latitude, longitude, searchVO.pageNum, searchVO.size);

        return new BaseResponse<>(storeItem);
    }





}
