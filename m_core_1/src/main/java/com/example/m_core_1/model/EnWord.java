package com.example.m_core_1.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "En_word")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"meaning"})
public class EnWord {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String meaning;
    @OneToMany(mappedBy = "enWord", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Card> cards;


}
