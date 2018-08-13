package com.kodilla.restapilibrary.domain.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


@NamedNativeQuery(name = "com.kodilla.restapilibrary.domain.domain.Title.getAllTitles",
        query = "SELECT * FROM titles, copies WHERE copies.title_id = titles.id and copies.status LIKE ",
        resultClass = Title.class)

@NoArgsConstructor
@lombok.Getter
@Entity(name = "TITLES")
@SequenceGenerator(name = "TITLE_GEN", sequenceName = "TITLE_SEQ")
public class Title {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TITLE_GEN")
    @NotNull
    @Column(name = "ID", unique = true)
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "PUBLICATION_YEAR")
    private int publicationYear;

    @OneToMany(
            targetEntity = Copy.class,
            mappedBy = "title",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<Copy> copyList;

    public Title (String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    private void setId(Long id) {
        this.id = id;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    private void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setCopyList(List<Copy> copyList) {
        this.copyList = copyList;
    }

    @Override
    public String toString() {
        return "com.kodilla.restapilibrary.domain.domain.Title{" +
                "id='" + id + '\'' +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
