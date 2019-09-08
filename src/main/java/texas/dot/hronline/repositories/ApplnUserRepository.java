package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import texas.dot.hronline.domain.ApplnUser;


public interface ApplnUserRepository extends CrudRepository<ApplnUser, Long>{
	
	ApplnUser findByUserNm(String userNm);
	
	@Query("select p from ApplnUser AS p")		       	       
	 List<ApplnUser> findAllRecords();

}
