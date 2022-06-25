package search;

import entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface SearchRepository extends JpaRepository<Store, Long> {
    @Query("select s from Store s where s.address like %:location% limit :size offset (:pageNum - 1 ) * :size")
    List<Store> findByAddress(@Param("location") String location, @Param("size")int size, @Param("pageNum") int pageNum);
}
