package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.PsAllLicenseDataHistMvw;
import texas.dot.hronline.repositories.PsAllLicenseDataHistMvwRepository;

@Service
public class PsAllLicenseDataHistMvwServiceImpl implements PsAllLicenseDataHistMvwService{

	private PsAllLicenseDataHistMvwRepository PsAllLicenseDataHistMvwRepository;

	@Autowired
	public PsAllLicenseDataHistMvwServiceImpl(PsAllLicenseDataHistMvwRepository PsAllLicenseDataHistMvwRepository) {
		this.PsAllLicenseDataHistMvwRepository = PsAllLicenseDataHistMvwRepository;
	}

	@Override
	public List<PsAllLicenseDataHistMvw> findAllRecords() { 
		List<PsAllLicenseDataHistMvw> PsAllLicenseDataHistMvws = new ArrayList<>();
		PsAllLicenseDataHistMvwRepository.findAllRecords().forEach(PsAllLicenseDataHistMvws::add); // fun with Java 8
		PsAllLicenseDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return PsAllLicenseDataHistMvws;
	}

	@Override
	public List<PsAllLicenseDataHistMvw> findByEmplid(@Param("rep17employeeid") String rep17employeeid) {
		List<PsAllLicenseDataHistMvw> PsAllLicenseDataHistMvws = new ArrayList<>();
		PsAllLicenseDataHistMvwRepository.findByEmplid(rep17employeeid).forEach(PsAllLicenseDataHistMvws::add); // fun with Java 8	
		PsAllLicenseDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return PsAllLicenseDataHistMvws;
		
	}
	
	@Override
	public List<PsAllLicenseDataHistMvw> findByBUEmp(@Param("businessUnit17") String businessUnit17,@Param("rep17employeeid") String rep17employeeid){
		List<PsAllLicenseDataHistMvw> PsAllLicenseDataHistMvws = new ArrayList<>();
		PsAllLicenseDataHistMvwRepository.findByBUEmp(businessUnit17,rep17employeeid).forEach(PsAllLicenseDataHistMvws::add); // fun with Java 8
		PsAllLicenseDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return PsAllLicenseDataHistMvws;
	}
	
	@Override
	public List<PsAllLicenseDataHistMvw> findBySearchBU(@Param("businessUnit17") String businessUnit17){
		List<PsAllLicenseDataHistMvw> PsAllLicenseDataHistMvws = new ArrayList<>();
		PsAllLicenseDataHistMvwRepository.findBySearchBU(businessUnit17).forEach(PsAllLicenseDataHistMvws::add); // fun with Java 8	
		PsAllLicenseDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return PsAllLicenseDataHistMvws;
	}

//	@Override
//	public List<PsEmpEvalDataHistMvw> findByEmplid(@Param("rep15employeeid") String empid) {
//		List<PsEmpEvalDataHistMvw> PsEmpEvalDataHistMvws = new ArrayList<>();
//		psEmpEvalDataHistMvwRepository.findByEmplid(empid).forEach(PsEmpEvalDataHistMvws::add); // fun with Java 8																
//		return PsEmpEvalDataHistMvws; 
//	}
//	
//	@Query("SELECT t FROM PsAllLicenseDataHistMvw t WHERE " +
//		    "LOWER(t.businessUnit) LIKE LOWER(CONCAT('%',:businessUnit17, '%')) ")
//		List<PsAllLicenseDataHistMvw> findBySearchBU(@Param("businessUnit17") String businessUnit17);
//			 
//			 
//			 @Query("SELECT t FROM PsAllLicenseDataHistMvw t WHERE " +
//					    "LOWER(t.businessUnit) LIKE LOWER(CONCAT('%',:businessUnit17, '%')) OR " +
//					    "LOWER(t.emplid) LIKE LOWER(CONCAT('%',:rep17employeeid, '%'))")
//					List<PsPersonalDtaVw> findBySearchFull(@Param("businessUnit17") String searchTerm,@Param("rep17employeeid") String rep17employeeid);
//			 
//			
			
			 //List<PsAllLicenseDataHistMvw> findByEmplid(String rep17employeeid);

	

}
