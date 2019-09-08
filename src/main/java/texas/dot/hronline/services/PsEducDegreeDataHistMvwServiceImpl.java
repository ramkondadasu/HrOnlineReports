package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.PsEducDegreeDataHistMvw;
import texas.dot.hronline.repositories.PsEducDegreeDataHistMvwRepository;

@Service
public class PsEducDegreeDataHistMvwServiceImpl implements PsEducDegreeDataHistMvwService{

	private PsEducDegreeDataHistMvwRepository PsEducDegreeDataHistMvwRepository;

	@Autowired
	public PsEducDegreeDataHistMvwServiceImpl(PsEducDegreeDataHistMvwRepository PsEducDegreeDataHistMvwRepository) {
		this.PsEducDegreeDataHistMvwRepository = PsEducDegreeDataHistMvwRepository;
	}

	@Override
	public List<PsEducDegreeDataHistMvw> findAllRecords() { 
		List<PsEducDegreeDataHistMvw> PsEducDegreeDataHistMvws = new ArrayList<>();
		PsEducDegreeDataHistMvwRepository.findAllRecords().forEach(PsEducDegreeDataHistMvws::add); // fun with Java 8	
		PsEducDegreeDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return PsEducDegreeDataHistMvws;
	}

	@Override
	public List<PsEducDegreeDataHistMvw> findByEmplid(@Param("rep17employeeid") String rep17employeeid) {
		List<PsEducDegreeDataHistMvw> PsEducDegreeDataHistMvws = new ArrayList<>();
		PsEducDegreeDataHistMvwRepository.findByEmplid(rep17employeeid).forEach(PsEducDegreeDataHistMvws::add); // fun with Java 8	
		PsEducDegreeDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return PsEducDegreeDataHistMvws;
		
	}
	
	@Override
	public List<PsEducDegreeDataHistMvw> findByBUEmp(@Param("businessUnit17") String businessUnit17,@Param("rep17employeeid") String rep17employeeid){
		List<PsEducDegreeDataHistMvw> PsEducDegreeDataHistMvws = new ArrayList<>();
		PsEducDegreeDataHistMvwRepository.findByBUEmp(businessUnit17,rep17employeeid).forEach(PsEducDegreeDataHistMvws::add); // fun with Java 8
		PsEducDegreeDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return PsEducDegreeDataHistMvws;
	}
	
	@Override
	public List<PsEducDegreeDataHistMvw> findBySearchBU(@Param("businessUnit17") String businessUnit17){
		List<PsEducDegreeDataHistMvw> PsEducDegreeDataHistMvws = new ArrayList<>();
		PsEducDegreeDataHistMvwRepository.findBySearchBU(businessUnit17).forEach(PsEducDegreeDataHistMvws::add); // fun with Java 8	
		PsEducDegreeDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return PsEducDegreeDataHistMvws;
	}

//	@Override
//	public List<PsEmpEvalDataHistMvw> findByEmplid(@Param("rep15employeeid") String empid) {
//		List<PsEmpEvalDataHistMvw> PsEmpEvalDataHistMvws = new ArrayList<>();
//		psEmpEvalDataHistMvwRepository.findByEmplid(empid).forEach(PsEmpEvalDataHistMvws::add); // fun with Java 8																
//		return PsEmpEvalDataHistMvws; 
//	}
//	
//	@Query("SELECT t FROM PsEducDegreeDataHistMvw t WHERE " +
//		    "LOWER(t.businessUnit) LIKE LOWER(CONCAT('%',:businessUnit17, '%')) ")
//		List<PsEducDegreeDataHistMvw> findBySearchBU(@Param("businessUnit17") String businessUnit17);
//			 
//			 
//			 @Query("SELECT t FROM PsEducDegreeDataHistMvw t WHERE " +
//					    "LOWER(t.businessUnit) LIKE LOWER(CONCAT('%',:businessUnit17, '%')) OR " +
//					    "LOWER(t.emplid) LIKE LOWER(CONCAT('%',:rep17employeeid, '%'))")
//					List<PsPersonalDtaVw> findBySearchFull(@Param("businessUnit17") String searchTerm,@Param("rep17employeeid") String rep17employeeid);
//			 
//			
			
			 //List<PsEducDegreeDataHistMvw> findByEmplid(String rep17employeeid);

	

}
