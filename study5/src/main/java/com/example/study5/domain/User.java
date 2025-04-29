package com.example.study5.domain;

import com.example.study5.domain.common.BaseEntity;
import com.example.study5.domain.enums.Gender;
import com.example.study5.domain.mapping.Preference;
import com.example.study5.domain.mapping.UserMission;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor

public class User extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;


    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(10)")
    private Gender gender;


    private LocalDate inactiveDate;

    private LocalDate updatedDate;

    private LocalDate birth;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false)
    private Integer myPoint;

    private String phone;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserMission> userMissions = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Preference> preferences = new ArrayList<>();

}
