package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.HrworkAlcoholScreeningVw;
import texas.dot.hronline.repositories.HrworkAlcoholScreeningVwRepository;

@Service
public class HrworkAlcoholScreeningVwServiceImpl implements HrworkAlcoholScreeningVwService{
	
	private HrworkAlcoholScreeningVwRepository HrworkAlcoholScreeningVwRepository;

	@Autowired
	public HrworkAlcoholScreeningVwServiceImpl(HrworkAlcoholScreeningVwRepository HrworkAlcoholScreeningVwRepository) {
		this.HrworkAlcoholScreeningVwRepository = HrworkAlcoholScreeningVwRepository;
	}

	@Override
	public List<HrworkAlcoholScreeningVw> findAllRecords() {
		List<HrworkAlcoholScreeningVw> HrworkAlcoholScreeningVws = new ArrayList<>();
		HrworkAlcoholScreeningVwRepository.findAllRecords().forEach(HrworkAlcoholScreeningVws::add); // fun with Java 8																
		return HrworkAlcoholScreeningVws;
	}
	
	@Override
	public List<HrworkAlcoholScreeningVw> findBySsnNumber(String ssnNumber) {
		List<HrworkAlcoholScreeningVw> HrworkAlcoholScreeningVws = new ArrayList<>();
		HrworkAlcoholScreeningVwRepository.findBySsnNumber(ssnNumber).forEach(HrworkAlcoholScreeningVws::add); // fun with Java 8																
		return HrworkAlcoholScreeningVws; 
	}

}

