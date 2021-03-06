package com.vana.gshop.entity;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "publisher")
public class Publisher extends User {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "publisher_id")
    private String publisherId;

    @NotNull
    @Column(name="publisher_name")
    private String publisherName;

    @NotNull
    @Column(name="publisher_website")
    private String publisherWebsite;
}
