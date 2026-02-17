package com.nomevini.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nomevini.dscatalog.entities.Category;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
