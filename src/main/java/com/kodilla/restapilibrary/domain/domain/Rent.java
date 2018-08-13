package com.kodilla.restapilibrary.domain.domain;

import com.kodilla.restapilibrary.domain.domain.Copy;
import com.kodilla.restapilibrary.domain.domain.Reader;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NoArgsConstructor
@Getter
@Entity(name = "RENTS")
@SequenceGenerator(name = "RENT_GEN", sequenceName = "RENT_SEQ")
public class Rent {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RENT_GEN")
    @Column(name = "ID", unique = true)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "READER_ID")
    private Reader reader;

    @ManyToOne
    @JoinColumn(name = "COPY_ID")
    private Copy copy;

    @NotNull
    @Column(name = "RENT_DATE")
    private Date rentDate;

    @Column(name = "RETURN_DATE")
    private Date returnDate;

    public Rent(Date rentDate, Reader reader, Copy copy) {
        this.rentDate = rentDate;
        this.reader = reader;
        this.copy = copy;
    }

    private void setId(Long id) {
        this.id = id;
    }

    private void setReader(Reader reader) {
        this.reader = reader;
    }

    private void setCopy(Copy copy) {
        this.copy = copy;
    }

    private void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}