package search;

import entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public interface SearchRepository extends JpaRepository<Store, Long> {
    List<Store> findByAddressContaining(String location);
}
