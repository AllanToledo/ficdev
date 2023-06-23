package com.allantoledo.api;

//@author Allan Toledo

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Table(name="livro")
public class Livro {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter
    private int id;
    @Getter
    @Setter
    private String titulo;
    @Getter
    @Setter
    private String subtitulo;
    @Getter
    @Setter
    private String autor;
    @Getter
    @Setter
    private int anoPublicacao;
    @Getter
    @Setter
    private String isbn10;
}
