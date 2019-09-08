package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.PsOtherAccomplDataHistMvw;
import texas.dot.hronline.repositories.PsOtherAccomplDataHistMvwRepository;

@Service
public class PsOtherAccomplDataHistMvwServiceImpl implements PsOtherAccomplDataHistMvwService{

	private PsOtherAccomplDataHistMvwRepository PsOtherAccomplDataHistMvwRepository;

	@Autowired
	public PsOtherAccomplDataHistMvwServiceImpl(PsOtherAccomplDataHistMvwRepository PsOtherAccomplDataHistMvwRepository) {
		this.PsOtherAccomplDataHistMvwRepository = PsOtherAccomplDataHistMvwRepository;
	}

	@Override
	public List<PsOtherAccomplDataHistMvw> findAllRecords() { 
		List<PsOtherAccomplDataHistMvw> PsOtherAccomplDataHistMvws = new ArrayList<>();
		PsOtherAccomplDataHistMvwRepository.findAllRecords().forEach(PsOtherAccomplDataHistMvws::add); // fun with Java 8
		PsOtherAccomplDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return PsOtherAccomplDataHistMvws;
	}

	@Override
	public List<PsOtherAccomplDataHistMvw> findByEmplid(@Param("rep17employeeid") String rep17employeeid) {
		List<PsOtherAccomplDataHistMvw> PsOtherAccomplDataHistMvws = new ArrayList<>();
		PsOtherAccomplDataHistMvwRepository.findByEmplid(rep17employeeid).forEach(PsOtherAccomplDataHistMvws::add); // fun with Java 8	
		PsOtherAccomplDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return PsOtherAccomplDataHistMvws;
		
	}
	
	@Override
	public List<PsOtherAccomplDataHistMvw> findByBUEmp(@Param("businessUnit17") String businessUnit17,@Param("rep17employeeid") String rep17employeeid){
		List<PsOtherAccomplDataHistMvw> PsOtherAccomplDataHistMvws = new ArrayList<>();
		PsOtherAccomplDataHistMvwRepository.findByBUEmp(businessUnit17,rep17employeeid).forEach(PsOtherAccomplDataHistMvws::add); // fun with Java 8
		PsOtherAccomplDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return PsOtherAccomplDataHistMvws;
	}
	
	@Override
	public List<PsOtherAccomplDataHistMvw> findBySearchBU(@Param("businessUnit17") String businessUnit17){
		List<PsOtherAccomplDataHistMvw> PsOtherAccomplDataHistMvws = new ArrayList<>();
		PsOtherAccomplDataHistMvwRepository.findBySearchBU(businessUnit17).forEach(PsOtherAccomplDataHistMvws::add); // fun with Java 8	
		PsOtherAccomplDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return PsOtherAccomplDataHistMvws;
	}

//	@Override
//	public List<PsEmpEvalDataHistMvw> findByEmplid(@Param("rep15employeeid") String empid) {
//		List<PsEmpEvalDataHistMvw> PsEmpEvalDataHistMvws = new ArrayList<>();
//		psEmpEvalDataHistMvwRepository.findByEmplid(empid).forEach(PsEmpEvalDataHistMvws::add); // fun with Java 8																
//		return PsEmpEvalDataHistMvws; 
//	}
//	
//	@Query("SELECT t FROM PsOtherAccomplDataHistMvw t WHERE " +
//		    "LOWER(t.businessUnit) LIKE LOWER(CONCAT('%',:businessUnit17, '%')) ")
//		List<PsOtherAccomplDataHistMvw> findBySearchBU(@Param("businessUnit17") String businessUnit17);
//			 
//			 
//			 @Query("SELECT t FROM PsOtherAccomplDataHistMvw t WHERE " +
//					    "LOWER(t.businessUnit) LIKE LOWER(CONCAT('%',:businessUnit17, '%')) OR " +
//					    "LOWER(t.emplid) LIKE LOWER(CONCAT('%',:rep17employeeid, '%'))")
//					List<PsPersonalDtaVw> findBySearchFull(@Param("businessUnit17") String searchTerm,@Param("rep17employeeid") String rep17employeeid);
//			 
//			
			
			 //List<PsOtherAccomplDataHistMvw> findByEmplid(String rep17employeeid);

	

}
