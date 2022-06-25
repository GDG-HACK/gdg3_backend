package com.example.gdg3.detail;

import com.example.gdg3.config.BaseResponse;
import com.example.gdg3.detail.DTO.StoreDetailDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DetailController {

    private final DetailService detailService;

    @GetMapping(value = "/stores/{shopId}")
    public BaseResponse<StoreDetailDto> shopDetail(@PathVariable Long shopId) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        StoreDetailDto storeDetailDto = detailService.getShopDetail(shopId);

        System.out.println(storeDetailDto.getStoreInfo().getInfo());

        //String jsonInString = objectMapper.writeValueAsString(storeDetailDto);


        return new BaseResponse<>(storeDetailDto);

    }
}
