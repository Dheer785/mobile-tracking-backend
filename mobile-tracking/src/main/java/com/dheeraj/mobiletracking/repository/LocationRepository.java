package com.dheeraj.mobiletracking.repository;
import com.dheeraj.mobiletracking.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
public interface LocationRepository extends JpaRepository<Location, Long> {
}

