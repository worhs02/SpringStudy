package com.example.study5.domain;

import com.example.study5.domain.common.BaseEntity;
import com.example.study5.domain.mapping.FoodCategory;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Food extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "food", cascade = CascadeType.ALL)
    private List<FoodCategory> food = new ArrayList<>();
}
