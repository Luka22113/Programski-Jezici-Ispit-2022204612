package luka.knezevic.LukaKnezevic2022204612.Repos;

import luka.knezevic.LukaKnezevic2022204612.Entities.KupovinaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KupovinaRepo extends JpaRepository<KupovinaEntity, Long> {
    List<KupovinaEntity> findByPecivoId(Long Pecivo_id);
}
