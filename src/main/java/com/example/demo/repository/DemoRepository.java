package com.example.demo.repository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository<User, Long>  {
    User save(User user);
    Optional<User> findById(long id);
    List<User> findAll();
    @Query ("SELECT u FROM User u WHERE u.age>=:age ORDER BY u.firstName")
    List<User> findAdditionalInfo(@Param("age") Integer age);
}
