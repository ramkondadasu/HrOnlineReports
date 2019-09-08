package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.PsPeLicenseDataHistMvw;
import texas.dot.hronline.repositories.PsPeLicenseDataHistMvwRepository;

@Service
public class PsPeLicenseDataHistMvwServiceImpl implements PsPeLicenseDataHistMvwService{

	private PsPeLicenseDataHistMvwRepository psPeLicenseDataHistMvwRepository;

	@Autowired
	public PsPeLicenseDataHistMvwServiceImpl(PsPeLicenseDataHistMvwRepository psPeLicenseDataHistMvwRepository) {
		this.psPeLicenseDataHistMvwRepository = psPeLicenseDataHistMvwRepository;
	}

	@Override
	public List<PsPeLicenseDataHistMvw> findAllRecords() { 
		List<PsPeLicenseDataHistMvw> psPeLicenseDataHistMvws = new ArrayList<>();
		psPeLicenseDataHistMvwRepository.findAllRecords().forEach(psPeLicenseDataHistMvws::add); // fun with Java 8	
		psPeLicenseDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psPeLicenseDataHistMvws;
	}

	@Override
	public List<PsPeLicenseDataHistMvw> findBySearchEmplid(@Param("rep17employeeid") String rep17employeeid) {
		List<PsPeLicenseDataHistMvw> psPeLicenseDataHistMvws = new ArrayList<>();
		psPeLicenseDataHistMvwRepository.findBySearchEmplid(rep17employeeid).forEach(psPeLicenseDataHistMvws::add); // fun with Java 8	
		psPeLicenseDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psPeLicenseDataHistMvws;
		
	}
	
	@Override
	public List<PsPeLicenseDataHistMvw> findByBUEmp(@Param("businessUnit17") String businessUnit17,@Param("rep17employeeid") String rep17employeeid){
		List<PsPeLicenseDataHistMvw> psPeLicenseDataHistMvws = new ArrayList<>();
		psPeLicenseDataHistMvwRepository.findByBUEmp(businessUnit17,rep17employeeid).forEach(psPeLicenseDataHistMvws::add); // fun with Java 8	
		psPeLicenseDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psPeLicenseDataHistMvws;
	}
	
	@Override
	public List<PsPeLicenseDataHistMvw> findBySearchBU(@Param("businessUnit17") String businessUnit17){
		List<PsPeLicenseDataHistMvw> psPeLicenseDataHistMvws = new ArrayList<>();
		psPeLicenseDataHistMvwRepository.findBySearchBU(businessUnit17).forEach(psPeLicenseDataHistMvws::add); // fun with Java 8
		psPeLicenseDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psPeLicenseDataHistMvws;
	}

//	@Override
//	public List<PsEmpEvalDataHistMvw> findByEmplid(@Param("rep15employeeid") String empid) {
//		List<PsEmpEvalDataHistMvw> PsEmpEvalDataHistMvws = new ArrayList<>();
//		psEmpEvalDataHistMvwRepository.findByEmplid(empid).forEach(PsEmpEvalDataHistMvws::add); // fun with Java 8																
//		return PsEmpEvalDataHistMvws; 
//	}
//	
//	@Query("SELECT t FROM PsPeLicenseDataHistMvw t WHERE " +
//		    "LOWER(t.businessUnit) LIKE LOWER(CONCAT('%',:businessUnit17, '%')) ")
//		List<PsPeLicenseDataHistMvw> findBySearchBU(@Param("businessUnit17") String businessUnit17);
//			 
//			 
//			 @Query("SELECT t FROM PsPeLicenseDataHistMvw t WHERE " +
//					    "LOWER(t.businessUnit) LIKE LOWER(CONCAT('%',:businessUnit17, '%')) OR " +
//					    "LOWER(t.emplid) LIKE LOWER(CONCAT('%',:rep17employeeid, '%'))")
//					List<PsPersonalDtaVw> findBySearchFull(@Param("businessUnit17") String searchTerm,@Param("rep17employeeid") String rep17employeeid);
//			 
//			
			
			 //List<PsPeLicenseDataHistMvw> findByEmplid(String rep17employeeid);

	

}
