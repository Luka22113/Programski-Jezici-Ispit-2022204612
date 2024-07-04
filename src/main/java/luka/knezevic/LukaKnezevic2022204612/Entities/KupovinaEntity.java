package luka.knezevic.LukaKnezevic2022204612.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Kupovine")
@Getter
@Setter
public class KupovinaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kupovina_id")
    private Long kupovinaId;

    @Column(name = "vreme_kupovine")
    private LocalDateTime vremeKupovine;

    @Column(name = "broj_peciva")
    private int brojPeciva;

    @Column(name = "cena")
    private int cena;

    @Column(name = "pecivo_id")
    private Long pecivoId;


    public KupovinaEntity(Long kupovinaId,int brojPeciva, int cena, PecivaEntity pecivo) {
        this.kupovinaId = kupovinaId;
        this.vremeKupovine = LocalDateTime.now();
        this.brojPeciva = brojPeciva;
        this.cena = cena;
        this.pecivoId = pecivo.getPecivoId();
    }

    public KupovinaEntity(int brojPeciva, int cena, PecivaEntity pecivo) {
        this.vremeKupovine = LocalDateTime.now();
        this.brojPeciva = brojPeciva;
        this.cena = cena;
        this.pecivoId = pecivo.getPecivoId();
    }

    public KupovinaEntity() {
    }
}
