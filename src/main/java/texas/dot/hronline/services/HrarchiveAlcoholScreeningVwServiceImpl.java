package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.HrarchiveAlcoholScreeningVw;
import texas.dot.hronline.repositories.HrarchiveAlcoholScreeningVwRepository;

@Service
public class HrarchiveAlcoholScreeningVwServiceImpl implements HrarchiveAlcoholScreeningVwService{
	
	private HrarchiveAlcoholScreeningVwRepository hrarchiveAlcoholScreeningVwRepository;

	@Autowired
	public HrarchiveAlcoholScreeningVwServiceImpl(HrarchiveAlcoholScreeningVwRepository hrarchiveAlcoholScreeningVwRepository) {
		this.hrarchiveAlcoholScreeningVwRepository = hrarchiveAlcoholScreeningVwRepository;
	}

	@Override
	public List<HrarchiveAlcoholScreeningVw> findAllRecords() {
		List<HrarchiveAlcoholScreeningVw> hrarchiveAlcoholScreeningVws = new ArrayList<>();
		hrarchiveAlcoholScreeningVwRepository.findAllRecords().forEach(hrarchiveAlcoholScreeningVws::add); // fun with Java 8																
		return hrarchiveAlcoholScreeningVws;
	}
	
	@Override
	public List<HrarchiveAlcoholScreeningVw> findBySsnNumber(String ssnNumber) {
		List<HrarchiveAlcoholScreeningVw> hrarchiveAlcoholScreeningVws = new ArrayList<>();
		hrarchiveAlcoholScreeningVwRepository.findBySsnNumber(ssnNumber).forEach(hrarchiveAlcoholScreeningVws::add); // fun with Java 8																
		return hrarchiveAlcoholScreeningVws; 
	}

}
