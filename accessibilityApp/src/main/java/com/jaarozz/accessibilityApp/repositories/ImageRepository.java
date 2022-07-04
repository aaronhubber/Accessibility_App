package com.jaarozz.accessibilityApp.repositories;

import com.jaarozz.accessibilityApp.models.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ImageRepository extends JpaRepository<ImageEntity, String> {


}

