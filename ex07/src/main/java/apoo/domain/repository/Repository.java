package apoo.domain.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<K, T> {
    Optional<T> findById(K id);
    void save(T t);
    void delete(T t);
    List<T> findAll();
}
