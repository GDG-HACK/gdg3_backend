package search;
import entity.Store;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import search.dto.searchDto;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class SearchController {

    private final SearchService searchService;

    @GetMapping("/stores")
    public List<Store> getNearStores(@RequestBody searchDto searchDto,  String latitude, String longitude) {
        return searchService.curSearch(searchDto.pageNum, searchDto.size,latitude, longitude);
    }
}
