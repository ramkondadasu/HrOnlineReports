package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.PsEmpEvalDataHistMvw;
import texas.dot.hronline.repositories.PsEmpEvalDataHistMvwRepository;
import org.springframework.data.repository.query.Param;

@Service
public class PsEmpEvalDataHistMvwServiceImpl implements PsEmpEvalDataHistMvwService{

	private PsEmpEvalDataHistMvwRepository psEmpEvalDataHistMvwRepository;

	@Autowired
	public PsEmpEvalDataHistMvwServiceImpl(PsEmpEvalDataHistMvwRepository psEmpEvalDataHistMvwRepository) {
		this.psEmpEvalDataHistMvwRepository = psEmpEvalDataHistMvwRepository;
	}

	@Override
	public List<PsEmpEvalDataHistMvw> findAllRecords() { 
		List<PsEmpEvalDataHistMvw> psEmpEvalDataHistMvws = new ArrayList<>();
		psEmpEvalDataHistMvwRepository.findAllRecords().forEach(psEmpEvalDataHistMvws::add); // fun with Java 8		
		psEmpEvalDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psEmpEvalDataHistMvws;
	}

	@Override
	public List<PsEmpEvalDataHistMvw> findByEmplid(@Param("rep15employeeid") String empid) {
		List<PsEmpEvalDataHistMvw> PsEmpEvalDataHistMvws = new ArrayList<>();
		psEmpEvalDataHistMvwRepository.findByEmplid(empid).forEach(PsEmpEvalDataHistMvws::add); // fun with Java 8	
		PsEmpEvalDataHistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return PsEmpEvalDataHistMvws; 
	}
	
	
	
}
