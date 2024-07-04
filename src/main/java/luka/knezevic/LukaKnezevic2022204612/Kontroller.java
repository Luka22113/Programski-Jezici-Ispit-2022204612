package luka.knezevic.LukaKnezevic2022204612;


import luka.knezevic.LukaKnezevic2022204612.DTO.KupovinaDTO;
import luka.knezevic.LukaKnezevic2022204612.DTO.PecivaDTO;
import luka.knezevic.LukaKnezevic2022204612.Entities.KupovinaEntity;
import luka.knezevic.LukaKnezevic2022204612.Entities.PecivaEntity;
import luka.knezevic.LukaKnezevic2022204612.Repos.KupovinaRepo;
import luka.knezevic.LukaKnezevic2022204612.Repos.PecivaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class Kontroller {

    @Autowired
    private PecivaRepo pecivaRepo;
    @Autowired
    private KupovinaRepo kupovinaRepo;

    @GetMapping("/getPeciva")
    public ResponseEntity<List<PecivaEntity>> getPeciva() { return ResponseEntity.ok(pecivaRepo.findAll()); }

    @PostMapping("/dodajPecivo")
    public ResponseEntity<PecivaEntity> dodajPecivo(@RequestBody PecivaDTO request) throws Exception {
        PecivaEntity novoPecivo = pecivaRepo.save(new PecivaEntity(request.imePeciva, request.cenaPeciva));
        return ResponseEntity.ok(novoPecivo);
    }

    @PostMapping("/dodajKupovinu")
    public ResponseEntity<KupovinaEntity> dodajKupovinu(@RequestBody KupovinaDTO request) throws Exception {
        PecivaEntity pecivo = pecivaRepo.findById(request.pecivoId)
                .orElseThrow(() -> new Exception("Thread not found with id " + request.pecivoId));
        KupovinaEntity novaKupovina = kupovinaRepo.save(new KupovinaEntity(request.brojPeciva, pecivo.getCenaPeciva() * request.brojPeciva, pecivo));
        return ResponseEntity.ok(novaKupovina);
    }

    @GetMapping("/dohvatiKupovineZaPecivo/{pecivoId}")
    public ResponseEntity<List<KupovinaEntity>>dohvatiKupovineZaPecivo(@PathVariable Long pecivoId) {
        return ResponseEntity.ok(kupovinaRepo.findByPecivoId(pecivoId));
    }


}
