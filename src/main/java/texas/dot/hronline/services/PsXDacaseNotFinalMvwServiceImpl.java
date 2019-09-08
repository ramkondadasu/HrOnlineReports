package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.PsXDacaseNotFinalMvw;
import texas.dot.hronline.repositories.PsXDacaseNotFinalMvwRepository;

@Service
public class PsXDacaseNotFinalMvwServiceImpl implements PsXDacaseNotFinalMvwService{

	private PsXDacaseNotFinalMvwRepository psXDacaseNotFinalMvwRepository;

	@Autowired
	public PsXDacaseNotFinalMvwServiceImpl(PsXDacaseNotFinalMvwRepository psActnReasonTblVwRepository) {
		this.psXDacaseNotFinalMvwRepository = psActnReasonTblVwRepository;
	}

	@Override
	public List<PsXDacaseNotFinalMvw> findAllRecords() { 
		List<PsXDacaseNotFinalMvw> psXDacaseNotFinalMvws = new ArrayList<>();
		psXDacaseNotFinalMvwRepository.findAllRecords().forEach(psXDacaseNotFinalMvws::add); // fun with Java 8		
		psXDacaseNotFinalMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psXDacaseNotFinalMvws;
	}

	@Override
	public List<PsXDacaseNotFinalMvw> findByEmplid(@Param("rep11employeeid") String rep11employeeid) {
		List<PsXDacaseNotFinalMvw> psXDacaseNotFinalMvws = new ArrayList<>();
		psXDacaseNotFinalMvwRepository.findByEmplid(rep11employeeid).forEach(psXDacaseNotFinalMvws::add); // fun with Java 8
		psXDacaseNotFinalMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psXDacaseNotFinalMvws; 
	}
	
	
	
}
