package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.ApplnUser;
import texas.dot.hronline.repositories.ApplnUserRepository;

@Service
public class ApplnUserServiceImpl implements ApplnUserService{
	
	private  ApplnUserRepository  applnUserRepository;

	@Autowired
	public ApplnUserServiceImpl(ApplnUserRepository applnUserRepository) {
		this.applnUserRepository = applnUserRepository;
	}

	@Override
	public List<ApplnUser> findAllRecords() {
		List<ApplnUser> applnUsers = new ArrayList<>();
		applnUserRepository.findAllRecords().forEach(applnUsers::add); // fun with Java 8																
		return applnUsers;
	}
	

}
