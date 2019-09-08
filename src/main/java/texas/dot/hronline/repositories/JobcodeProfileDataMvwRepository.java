package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.JobcodeProfileDataMvw;


public interface JobcodeProfileDataMvwRepository extends CrudRepository<JobcodeProfileDataMvw, Long>  {
	
	@Query("select p from JobcodeProfileDataMvw AS p"		       
		       + " where p.jobcode = :singlejobcode29 ")	
 List<JobcodeProfileDataMvw> findByJobcode(@Param("singlejobcode29") String singlejobcode29);

}
