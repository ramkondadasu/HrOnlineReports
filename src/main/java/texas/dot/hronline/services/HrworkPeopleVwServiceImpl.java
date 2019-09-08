package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.HrworkPeopleVw;
import texas.dot.hronline.repositories.HrworkPeopleVwRepository;

@Service
public class HrworkPeopleVwServiceImpl implements HrworkPeopleVwService{
	
	private HrworkPeopleVwRepository HrworkPeopleVwRepository;

	@Autowired
	public HrworkPeopleVwServiceImpl(HrworkPeopleVwRepository HrworkPeopleVwRepository) {
		this.HrworkPeopleVwRepository = HrworkPeopleVwRepository;
	}

	@Override
	public List<HrworkPeopleVw> findAllRecords() {
		List<HrworkPeopleVw> HrworkPeopleVws = new ArrayList<>();
		HrworkPeopleVwRepository.findAllRecords().forEach(HrworkPeopleVws::add); // fun with Java 8																
		return HrworkPeopleVws;
	}
	
	@Override
	public List<HrworkPeopleVw> findBySsnNumber(@Param("ssnNumber") String ssnNumber) {
		List<HrworkPeopleVw> HrworkPeopleVws = new ArrayList<>();
		HrworkPeopleVwRepository.findBySsnNumber(ssnNumber).forEach(HrworkPeopleVws::add); // fun with Java 8																
		return HrworkPeopleVws; 
	}

}



