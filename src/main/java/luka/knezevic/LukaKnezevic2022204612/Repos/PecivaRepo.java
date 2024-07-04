package luka.knezevic.LukaKnezevic2022204612.Repos;

import luka.knezevic.LukaKnezevic2022204612.Entities.PecivaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PecivaRepo extends JpaRepository<PecivaEntity, Long> {

}
