package com.nomevini.dscatalog.entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

@Data
@Entity
@Table(name="tb_category")
public class Category implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Category() {

    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
