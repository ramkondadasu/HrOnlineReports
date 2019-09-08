package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;


import texas.dot.hronline.domain.JobcodeProfileDataMvw;
import texas.dot.hronline.repositories.JobcodeProfileDataMvwRepository;

@Service
public class JobcodeProfileDataMvwServiceImpl implements JobcodeProfileDataMvwService {

	private JobcodeProfileDataMvwRepository jobcodeProfileDataMvwRepository;

	@Autowired
	public JobcodeProfileDataMvwServiceImpl(JobcodeProfileDataMvwRepository jobcodeProfileDataMvwRepository) {
		this.jobcodeProfileDataMvwRepository = jobcodeProfileDataMvwRepository;
	}

	
	
	@Override
	public List<JobcodeProfileDataMvw> findByJobcode(@Param("singlejobcode29") String singlejobcode29){
		List<JobcodeProfileDataMvw> jobcodeProfileDataMvws = new ArrayList<>();
		jobcodeProfileDataMvwRepository.findByJobcode(singlejobcode29).forEach(jobcodeProfileDataMvws::add); // fun with Java 8		
		jobcodeProfileDataMvws.forEach(System.out::println);
		for(int i=0;i<jobcodeProfileDataMvws.size();i++){
		    System.out.println(jobcodeProfileDataMvws.get(i).getJobTitle());
		} 
		return jobcodeProfileDataMvws;
		
	}
	
}
