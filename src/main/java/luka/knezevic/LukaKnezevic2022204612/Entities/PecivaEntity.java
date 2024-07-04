package luka.knezevic.LukaKnezevic2022204612.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Peciva")
@Getter
@Setter
public class PecivaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pecivo_id")
    private Long pecivoId;

    @Column(name = "pecivo_ime")
    private String imePeciva;

    @Column(name = "pecivo_cena")
    private int cenaPeciva;

    public PecivaEntity(Long birthDayId, String imePeciva, int cenaPeciva) {
        this.pecivoId = birthDayId;
        this.imePeciva = imePeciva;
        this.cenaPeciva = cenaPeciva;

    }

    public PecivaEntity(String imePeciva, int cenaPeciva) {
        this.imePeciva = imePeciva;
        this.cenaPeciva = cenaPeciva;
    }

    public PecivaEntity() {
    }
}
