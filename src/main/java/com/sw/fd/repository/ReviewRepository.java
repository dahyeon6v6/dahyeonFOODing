package com.sw.fd.repository;

import com.sw.fd.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
    Optional<Object> findByRno(int rno);


    // @Query("SELECT r, s.sname FROM Review r JOIN Store s ON r.sno = s.sno WHERE r.rno = :rno")
    // Object[] findReviewWithStoreName(@Param("rno") int rno);

}