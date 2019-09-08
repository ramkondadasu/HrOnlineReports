package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.PsPriorStateWorkexprMvw;
import texas.dot.hronline.repositories.PsPriorStateWorkexprMvwRepository;

@Service
public class PsPriorStateWorkexprMvwServiceImpl implements PsPriorStateWorkexprMvwService{

	private PsPriorStateWorkexprMvwRepository psPriorStateWorkexprMvwRepository;

	@Autowired
	public PsPriorStateWorkexprMvwServiceImpl(PsPriorStateWorkexprMvwRepository psPriorStateWorkexprMvwRepository) {
		this.psPriorStateWorkexprMvwRepository = psPriorStateWorkexprMvwRepository;
	}

	@Override
	public List<PsPriorStateWorkexprMvw> findAllRecords() { 
		List<PsPriorStateWorkexprMvw> psPriorStateWorkexprMvws = new ArrayList<>();
		psPriorStateWorkexprMvwRepository.findAllRecords().forEach(psPriorStateWorkexprMvws::add); // fun with Java 8	
		psPriorStateWorkexprMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psPriorStateWorkexprMvws;
	}

	@Override
	public List<PsPriorStateWorkexprMvw> findByEmplid(@Param("rep16employeeid") String empid) {
		List<PsPriorStateWorkexprMvw> psPriorStateWorkexprMvws = new ArrayList<>();
		psPriorStateWorkexprMvwRepository.findByEmplid(empid).forEach(psPriorStateWorkexprMvws::add); // fun with Java 8
		psPriorStateWorkexprMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psPriorStateWorkexprMvws; 
	}
	
	
	
}
