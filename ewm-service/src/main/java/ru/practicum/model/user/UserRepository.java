package ru.practicum.model.user;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u " +
            "from User u where u.id in :ids")
    List<User> findByUserIdIn(@Param("ids") List<Long> ids, Pageable pageable);
}

