package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.PsXDacaseNoresoluMvw;
import texas.dot.hronline.repositories.PsXDacaseNoresoluMvwRepository;

@Service
public class PsXDacaseNoresoluMvwServiceImpl implements PsXDacaseNoresoluMvwService{

	private PsXDacaseNoresoluMvwRepository psXDacaseNoresoluMvwRepository;

	@Autowired
	public PsXDacaseNoresoluMvwServiceImpl(PsXDacaseNoresoluMvwRepository psXDacaseNoresoluMvwRepository) {
		this.psXDacaseNoresoluMvwRepository = psXDacaseNoresoluMvwRepository;
	}

	@Override
	public List<PsXDacaseNoresoluMvw> findAllRecords() { 
		List<PsXDacaseNoresoluMvw> psXDacaseNoresoluMvws = new ArrayList<>();
		psXDacaseNoresoluMvwRepository.findAllRecords().forEach(psXDacaseNoresoluMvws::add); // fun with Java 8			
		psXDacaseNoresoluMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psXDacaseNoresoluMvws;
	}

	@Override
	public List<PsXDacaseNoresoluMvw> findByEmplid(@Param("rep12employeeid") String empid) {
		List<PsXDacaseNoresoluMvw> psXDacaseNoresoluMvws = new ArrayList<>();
		psXDacaseNoresoluMvwRepository.findByEmplid(empid).forEach(psXDacaseNoresoluMvws::add); // fun with Java 8	
		psXDacaseNoresoluMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psXDacaseNoresoluMvws; 
	}
	
	
	
}
