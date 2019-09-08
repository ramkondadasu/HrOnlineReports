package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.PsXSlryAllocMvw;
import texas.dot.hronline.repositories.PsXSlryAllocMvwRepository;

@Service
public class PsXSlryAllocMvwServiceImpl implements PsXSlryAllocMvwService{

	private PsXSlryAllocMvwRepository psXSlryAllocMvwRepository;

	@Autowired
	public PsXSlryAllocMvwServiceImpl(PsXSlryAllocMvwRepository psXSlryAllocMvwRepository) {
		this.psXSlryAllocMvwRepository = psXSlryAllocMvwRepository;
	}

	@Override
	public List<PsXSlryAllocMvw> findAllRecords() { 
		List<PsXSlryAllocMvw> PsXSlryAllocMvws = new ArrayList<>();
		psXSlryAllocMvwRepository.findAllRecords().forEach(PsXSlryAllocMvws::add); // fun with Java 8																
		return PsXSlryAllocMvws;
	}

	@Override
	public List<PsXSlryAllocMvw> findByFiscalYear(@Param("courseStDate24") String courseStDate24) {
		List<PsXSlryAllocMvw> PsXSlryAllocMvws = new ArrayList<>();
		psXSlryAllocMvwRepository.findByFiscalYear(courseStDate24).forEach(PsXSlryAllocMvws::add); // fun with Java 8																
		return PsXSlryAllocMvws;
		
	}
	
	@Override
	public List<PsXSlryAllocMvw> findByBUEmp(@Param("businessUnit24") String businessUnit17,@Param("fiscalYear") String fiscalYear){
		List<PsXSlryAllocMvw> PsXSlryAllocMvws = new ArrayList<>();
		psXSlryAllocMvwRepository.findByBUEmp(businessUnit17,fiscalYear).forEach(PsXSlryAllocMvws::add); // fun with Java 8																
		return PsXSlryAllocMvws;
	}
	
	@Override
	public List<PsXSlryAllocMvw> findBySearchBU(@Param("businessUnit24") String businessUnit24){
		List<PsXSlryAllocMvw> PsXSlryAllocMvws = new ArrayList<>();
		psXSlryAllocMvwRepository.findBySearchBU(businessUnit24).forEach(PsXSlryAllocMvws::add); // fun with Java 8																
		return PsXSlryAllocMvws;
	}

//	@Override
//	public List<PsEmpEvalDataHistMvw> findByEmplid(@Param("rep15employeeid") String empid) {
//		List<PsEmpEvalDataHistMvw> PsEmpEvalDataHistMvws = new ArrayList<>();
//		psEmpEvalDataHistMvwRepository.findByEmplid(empid).forEach(PsEmpEvalDataHistMvws::add); // fun with Java 8																
//		return PsEmpEvalDataHistMvws; 
//	}
//	
//	@Query("SELECT t FROM PsXSlryAllocMvw t WHERE " +
//		    "LOWER(t.businessUnit) LIKE LOWER(CONCAT('%',:businessUnit17, '%')) ")
//		List<PsXSlryAllocMvw> findBySearchBU(@Param("businessUnit17") String businessUnit17);
//			 
//			 
//			 @Query("SELECT t FROM PsXSlryAllocMvw t WHERE " +
//					    "LOWER(t.businessUnit) LIKE LOWER(CONCAT('%',:businessUnit17, '%')) OR " +
//					    "LOWER(t.emplid) LIKE LOWER(CONCAT('%',:rep17employeeid, '%'))")
//					List<PsPersonalDtaVw> findBySearchFull(@Param("businessUnit17") String searchTerm,@Param("rep17employeeid") String rep17employeeid);
//			 
//			
			
			 //List<PsXSlryAllocMvw> findByEmplid(String rep17employeeid);

	

}
