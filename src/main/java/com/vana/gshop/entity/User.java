package com.vana.gshop.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @NotNull
    @Column(name="user_name")
    private String userName;

    @NotNull
    @Column(name="mail")
    private String mail;

    @NotNull
    @Column(name="password")
    private String password;

    @NotNull
    @Column(name="phone")
    private String phone;

    @Column(name="crated_date")
    private LocalDateTime createdDate;



}