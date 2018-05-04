package pivotal.io.apj.pa.workshops;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource (collectionResourceRel = "workshops", path = "workshops")
public interface WorkshopRepository extends JpaRepository <Workshop, String> {

}
