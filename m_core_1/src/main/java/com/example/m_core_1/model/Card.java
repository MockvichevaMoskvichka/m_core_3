package com.example.m_core_1.model;

import jakarta.persistence.*;
import lombok.*;



@Getter
@Setter
@Entity
@Table(name = "Card")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Card {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long rating;
    @ManyToOne
    private EnWord enWord;
    @ManyToOne
    private EnWord ruWord;
  //private Long rating;

}

