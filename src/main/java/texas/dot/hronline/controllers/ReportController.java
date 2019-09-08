package texas.dot.hronline.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sun.jmx.snmp.Timestamp;

import texas.dot.hronline.Util.CommonUtil;
import texas.dot.hronline.commands.LoginForm;
import texas.dot.hronline.commands.ReportForm;
import texas.dot.hronline.configurations.CustomLdapComponent;
import texas.dot.hronline.domain.ApplnUser;
import texas.dot.hronline.repositories.ApplnUserRepository;
import texas.dot.hronline.services.PsActnReasonTblVwService;
import texas.dot.hronline.services.PsAllLicenseDataHistMvwService;
import texas.dot.hronline.services.PsEducDegreeDataHistMvwService;
import texas.dot.hronline.services.PsEmpEvalDataHistMvwService;
import texas.dot.hronline.services.PsOtherAccomplDataHistMvwService;
import texas.dot.hronline.services.PsPeLicenseDataHistMvwService;
import texas.dot.hronline.services.PsPersonNameService;
import texas.dot.hronline.services.PsPersonalDtaVwService;
import texas.dot.hronline.services.PsPriorStateWorkexprMvwService;
import texas.dot.hronline.services.PsXDacaseNoresoluMvwService;
import texas.dot.hronline.services.PsXDacaseNotFinalMvwService;
import texas.dot.hronline.services.PsXJobcodeEducVwService;
import texas.dot.hronline.services.PsXLr01DaCaseMvwService;
import texas.dot.hronline.services.PsXSlryAllocMvwService;
import texas.dot.hronline.services.PsXTrnhistMvwService;
import texas.dot.hronline.services.TrainingHistoryVwService;
import texas.dot.hronline.services.ApplnUserService;
import texas.dot.hronline.services.HrarchiveAlcoholScreeningVwService;
import texas.dot.hronline.services.HrworkAlcoholScreeningVwService;
import texas.dot.hronline.services.HrworkDrugTestVwService;
import texas.dot.hronline.services.HrworkPeopleVwService;
import texas.dot.hronline.services.HrworkPositiveHistoryVwService;
import texas.dot.hronline.services.JobcodeProfileDataMvwService;
import texas.dot.hronline.services.NotificationService;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class ReportController {

	private TrainingHistoryVwService trainingHistoryVwService;
	private PsPersonalDtaVwService psPersonalDtaVwService;
	private PsXTrnhistMvwService psXTrnhistMvwService;
	private PsActnReasonTblVwService psActnReasonTblVwService;
	private PsXDacaseNotFinalMvwService psXDacaseNotFinalMvwService;// rep11
	private PsXDacaseNoresoluMvwService psXDacaseNoresoluMvwService;// rep12
	private PsXLr01DaCaseMvwService psXLr01DaCaseMvwService;// rep13
	private PsEmpEvalDataHistMvwService psEmpEvalDataHistMvwService;// rep15
	private PsPriorStateWorkexprMvwService psPriorStateWorkexprMvwService;// rep16
	private PsPeLicenseDataHistMvwService psPeLicenseDataHistMvwService;// rep17
	private PsXSlryAllocMvwService psXSlryAllocMvwService;// rep24
	private PsAllLicenseDataHistMvwService psAllLicenseDataHistMvwService;// rep25
	private PsEducDegreeDataHistMvwService psEducDegreeDataHistMvwService;// rep26
	private PsOtherAccomplDataHistMvwService psOtherAccomplDataHistMvwService;// rep27
	private PsXJobcodeEducVwService psXJobcodeEducVwService;// rep18
	
	private JobcodeProfileDataMvwService jobcodeProfileDataMvwService;// rep18

	private NotificationService notificationService;// rep18
	
	private HrarchiveAlcoholScreeningVwService hrarchiveAlcoholScreeningVwService;// rep30
	
	private HrworkAlcoholScreeningVwService hrworkAlcoholScreeningVwService;// rep30
	private HrworkDrugTestVwService hrworkDrugTestVwService;// rep30
	private HrworkPeopleVwService hrworkPeopleVwService;// rep30
	private HrworkPositiveHistoryVwService hrworkPositiveHistoryVwService;// rep30
	
	@Autowired
	private ApplnUserService applnUserService;
	
	@Autowired
	private ApplnUserRepository applnUserRepo;

	@Autowired
	LdapTemplate ldapTemplate;
	
	@Autowired
	public void setApplnUserService(ApplnUserService applnUserService) {
		this.applnUserService = applnUserService;
	}
	
	@Autowired
	public void setJobcodeProfileDataMvwService(JobcodeProfileDataMvwService jobcodeProfileDataMvwService) {
		this.jobcodeProfileDataMvwService = jobcodeProfileDataMvwService;
	}

	@Autowired
	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@Autowired
	public void setPsXSlryAllocMvwService(PsXSlryAllocMvwService psXSlryAllocMvwService) {
		this.psXSlryAllocMvwService = psXSlryAllocMvwService;
	}

	@Autowired
	public void setPsAllLicenseDataHistMvwService(PsAllLicenseDataHistMvwService psAllLicenseDataHistMvwService) {
		this.psAllLicenseDataHistMvwService = psAllLicenseDataHistMvwService;
	}

	@Autowired
	public void setPsEducDegreeDataHistMvwService(PsEducDegreeDataHistMvwService psEducDegreeDataHistMvwService) {
		this.psEducDegreeDataHistMvwService = psEducDegreeDataHistMvwService;
	}

	@Autowired
	public void setPsOtherAccomplDataHistMvwService(PsOtherAccomplDataHistMvwService psOtherAccomplDataHistMvwService) {
		this.psOtherAccomplDataHistMvwService = psOtherAccomplDataHistMvwService;
	}

	@Autowired
	public void setPsXJobcodeEducVwService(PsXJobcodeEducVwService psXJobcodeEducVwService) {
		this.psXJobcodeEducVwService = psXJobcodeEducVwService;
	}

	@Autowired
	public void setTrainingHistoryVwService(TrainingHistoryVwService trainingHistoryVwService) {
		this.trainingHistoryVwService = trainingHistoryVwService;
	}

	@Autowired
	public void setPsPersonalDtaVwService(PsPersonalDtaVwService psPersonalDtaVwService) {
		this.psPersonalDtaVwService = psPersonalDtaVwService;
	}

	@Autowired
	public void setPsXTrnhistMvwService(PsXTrnhistMvwService psXTrnhistMvwService) {
		this.psXTrnhistMvwService = psXTrnhistMvwService;
	}

	@Autowired
	public void setPsActnReasonTblVwService(PsActnReasonTblVwService psActnReasonTblVwService) {
		this.psActnReasonTblVwService = psActnReasonTblVwService;
	}

	@Autowired
	public void setPsXDacaseNotFinalMvwService(PsXDacaseNotFinalMvwService psXDacaseNotFinalMvwService) {
		this.psXDacaseNotFinalMvwService = psXDacaseNotFinalMvwService;
	}

	@Autowired
	public void setPsXDacaseNoresoluMvwService(PsXDacaseNoresoluMvwService psXDacaseNoresoluMvwService) {
		this.psXDacaseNoresoluMvwService = psXDacaseNoresoluMvwService;
	}

	@Autowired
	public void setPsXLr01DaCaseMvwService(PsXLr01DaCaseMvwService psXLr01DaCaseMvwService) {
		this.psXLr01DaCaseMvwService = psXLr01DaCaseMvwService;
	}

	@Autowired
	public void setPsEmpEvalDataHistMvwService(PsEmpEvalDataHistMvwService psEmpEvalDataHistMvwService) {
		this.psEmpEvalDataHistMvwService = psEmpEvalDataHistMvwService;
	}

	@Autowired
	public void setPsPriorStateWorkexprMvwService(PsPriorStateWorkexprMvwService psPriorStateWorkexprMvwService) {
		this.psPriorStateWorkexprMvwService = psPriorStateWorkexprMvwService;
	}

	@Autowired
	public void setPsPeLicenseDataHistMvwService(PsPeLicenseDataHistMvwService psPeLicenseDataHistMvwService) {
		this.psPeLicenseDataHistMvwService = psPeLicenseDataHistMvwService;
	}
	

	@Autowired
	public void setHrarchiveAlcoholScreeningVwService(
			HrarchiveAlcoholScreeningVwService hrarchiveAlcoholScreeningVwService) {
		this.hrarchiveAlcoholScreeningVwService = hrarchiveAlcoholScreeningVwService;
	}
	
	@Autowired
	  public void setHrworkAlcoholScreeningVwService(
	      HrworkAlcoholScreeningVwService hrworkAlcoholScreeningVwService) {
	    this.hrworkAlcoholScreeningVwService = hrworkAlcoholScreeningVwService;
	  }
	
	@Autowired
	  public void setHrworkDrugTestVwService(
	      HrworkDrugTestVwService hrworkDrugTestVwService) {
	    this.hrworkDrugTestVwService = hrworkDrugTestVwService;
	  }
	@Autowired
	  public void setHrworkPeopleVwService(
	      HrworkPeopleVwService hrworkPeopleVwService) {
	    this.hrworkPeopleVwService = hrworkPeopleVwService;
	  }
	@Autowired
	  public void setHrworkPositiveHistoryVwService(
	      HrworkPositiveHistoryVwService hrworkPositiveHistoryVwService) {
	    this.hrworkPositiveHistoryVwService = hrworkPositiveHistoryVwService;
	  }
	
	
	@RequestMapping("/users")
    public String product(Model model, HttpServletRequest request) {
		if (request.getSession().getAttribute("auth") != null
				&& request.getSession().getAttribute("auth").toString().equalsIgnoreCase("yes")) {
        model.addAttribute("products", applnUserService.findAllRecords());
        return "reports/userlist";
		} else {
			model.addAttribute("loginForm", new LoginForm());
			notificationService.addErrorMessage("Please Login with your TxDOT credentials.");
			return "security/login";

		}
    }
	
	@RequestMapping(value = "add")
    public String addUser(Model model, HttpServletRequest request) {
		if (request.getSession().getAttribute("auth") != null
				&& request.getSession().getAttribute("auth").toString().equalsIgnoreCase("yes")) {
        model.addAttribute("applnUser", new ApplnUser());
        return "reports/user";
		} else {
			model.addAttribute("loginForm", new LoginForm());
			notificationService.addErrorMessage("Please Login with your TxDOT credentials.");
			return "security/login";

		}
    }
	
	@RequestMapping("/add/{id}")
    public String edit(@PathVariable String id, Model model, HttpServletRequest request) {
		if (request.getSession().getAttribute("auth") != null
				&& request.getSession().getAttribute("auth").toString().equalsIgnoreCase("yes")) {
		if(id!=null && !id.equalsIgnoreCase("")){
			
			
			
			ApplnUser appln = applnUserRepo.findOne(new Long(id));
			if(appln.getRolesId()!=null && !appln.getRolesId().equalsIgnoreCase("")){
				appln.setRolesmulti(Arrays.stream(appln.getRolesId().split(",")).map(String::trim).toArray(String[]::new));
			}
			
			
        model.addAttribute("applnUser", appln);
		}else{
			 model.addAttribute("applnUser", new ApplnUser());	
		}
        return "reports/user";
		} else {
			model.addAttribute("loginForm", new LoginForm());
			notificationService.addErrorMessage("Please Login with your TxDOT credentials.");
			return "security/login";

		}
    }
	
	@RequestMapping(value = "/add/save", method = RequestMethod.POST)
    public String save(ApplnUser applnUser,Model model, HttpServletRequest request) {
		if (request.getSession().getAttribute("auth") != null
				&& request.getSession().getAttribute("auth").toString().equalsIgnoreCase("yes")) {
		//convert array to string
		if(applnUser.getRolesmulti()!=null && applnUser.getRolesmulti().length > 0){
			applnUser.setRolesId(String.join(",", applnUser.getRolesmulti()));
		}
		
		applnUser = applnUserRepo.save(applnUser);
		request.getSession().removeAttribute("role");
        //return "/add/"+applnUser.getApplnUserId();
        return "redirect:/add/" + applnUser.getApplnUserId();
		} else {
			model.addAttribute("loginForm", new LoginForm());
			notificationService.addErrorMessage("Please Login with your TxDOT credentials.");
			return "security/login";

		}
    }
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String insertusr(ApplnUser applnUser,Model model, HttpServletRequest request) {
		if (request.getSession().getAttribute("auth") != null
				&& request.getSession().getAttribute("auth").toString().equalsIgnoreCase("yes")) {
		//convert array to string
				if(applnUser.getRolesmulti()!=null && applnUser.getRolesmulti().length > 0){
					applnUser.setRolesId(String.join(",", applnUser.getRolesmulti()));
				}
		applnUser = applnUserRepo.save(applnUser);
		request.getSession().removeAttribute("role");
		
        //return "/add/"+applnUser.getApplnUserId();
        return "redirect:/add/" + applnUser.getApplnUserId();
		} else {
			model.addAttribute("loginForm", new LoginForm());
			notificationService.addErrorMessage("Please Login with your TxDOT credentials.");
			return "security/login";

		}
    }
	
	@RequestMapping("/delete")
    public String delete(@RequestParam String id,Model model, HttpServletRequest request) {
		if (request.getSession().getAttribute("auth") != null
				&& request.getSession().getAttribute("auth").toString().equalsIgnoreCase("yes")) {
		ApplnUser appln = applnUserRepo.findOne(new Long(id));
		applnUserRepo.delete(appln);
		request.getSession().removeAttribute("role");
        return "redirect:/users";
		} else {
			model.addAttribute("loginForm", new LoginForm());
			notificationService.addErrorMessage("Please Login with your TxDOT credentials.");
			return "security/login";

		}
    }


	@RequestMapping("/")
	public String redirToList() {
		return "redirect:/security/login";
	}

	private Map<String, String> getDropList(){
		Map<String, String> sampleDropdownMap = new HashMap<String, String>();
		sampleDropdownMap.put("17", "Accomplishments - All License Data (Prior to Oct 2014)  ");
		sampleDropdownMap.put("26", "Accomplishments - Education Degree Data");
		sampleDropdownMap.put("27", "Accomplishments - Language, Honor, Membership Data");
		sampleDropdownMap.put("25", "Accomplishments - PE License(Prior to Oct 2014)");
		sampleDropdownMap.put("14", "Action Reason Table");
		sampleDropdownMap.put("11", "Disciplinary Actions - Cases Not Marked Final");
		sampleDropdownMap.put("13", "Disciplinary Actions - Case Step Behavior Summary");
		sampleDropdownMap.put("12", "Disciplinary Actions - With Letter Date");
		sampleDropdownMap.put("2", "TxDOT Employee ID Lookup");
		sampleDropdownMap.put("15", "Employee Evaluation");
		sampleDropdownMap.put("22", "Job Code Competency Data");
		sampleDropdownMap.put("20", "Job Code Duty Data");
		sampleDropdownMap.put("18", "Job Code Education Data");
		sampleDropdownMap.put("19", "Job Code Experience Data");
		sampleDropdownMap.put("21", "Job Code Subs");
		sampleDropdownMap.put("16", "Prior State Government Work Experience Data ");
		sampleDropdownMap.put("24", "Salary Allocation Data");
		sampleDropdownMap.put("23", "Training - Course Information");
		sampleDropdownMap.put("28", "Training History - ALL");
		sampleDropdownMap.put("1", "Training History - By DDO ");
		sampleDropdownMap.put("5", "TxDOT Employee Training History - Total Training Hrs by Employee");
		sampleDropdownMap.put("29", "Job Code Profile Data");
		sampleDropdownMap.put("30", "Assist - Alcohol Screening Data");
		sampleDropdownMap.put("31", "Assist - Drug Test Data");
		sampleDropdownMap.put("32", "Assist - People Data");
		sampleDropdownMap.put("33", "Assist - Positive History Data");
		return sampleDropdownMap;
		
	}
	
	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
	    return map.entrySet()
	              .stream()
	              .sorted(Map.Entry.comparingByValue(/*Collections.reverseOrder()*/))
	              .collect(Collectors.toMap(
	                Map.Entry::getKey, 
	                Map.Entry::getValue, 
	                (e1, e2) -> e1, 
	                LinkedHashMap::new
	              ));
	}
	
	@RequestMapping("/reports/reportform")
	public String reportform(Model model, HttpServletRequest request) {
		// System.out.println("RRRR1"+
		// request.getSession().getAttribute("auth"));
		String rolestr = "";
        ApplnUser applnUser = null;
		if (request.getSession().getAttribute("auth") != null
				&& request.getSession().getAttribute("auth").toString().equalsIgnoreCase("yes")) {
			
			//Roles Logic Start
			//1) hashmap having all values
			Map<String, String> allMap = this.getDropList();
			//2) dbcall get the string
			applnUser = applnUserRepo.findByUserNm(request.getSession().getAttribute("usr").toString().trim().toLowerCase());
			rolestr = applnUser.getRolesId();
			if(rolestr!=null && rolestr.contains("1")){
				request.getSession().setAttribute("role", "A");
			}else{
				request.getSession().setAttribute("role", "X");
			}
			
			//3) if logic remove keys (6 combinations)
			if(rolestr!=null && rolestr.equalsIgnoreCase("2")){//WFD_Admin
				//allMap.remove("17");//N
				allMap.remove("18");//N
				allMap.remove("25");
				allMap.remove("14");
				allMap.remove("11");
				allMap.remove("13");
				allMap.remove("12");
				allMap.remove("15");
				allMap.remove("22");
				allMap.remove("20");
				allMap.remove("19");
				allMap.remove("21");
				allMap.remove("16");
				allMap.remove("24");
				allMap.remove("29");
				allMap.remove("30");
				allMap.remove("31");
				allMap.remove("32");
				allMap.remove("33");
				
			}else if(rolestr!=null && rolestr.equalsIgnoreCase("3")){//WFA_ADMIN
				allMap.remove("14");
				allMap.remove("11");
				allMap.remove("13");
				allMap.remove("12");
				allMap.remove("15");
				allMap.remove("16");
				allMap.remove("24");
				allMap.remove("23");
				allMap.remove("28");
				allMap.remove("1");
				allMap.remove("5");
				allMap.remove("30");
				allMap.remove("31");
				allMap.remove("32");
				allMap.remove("33");
				
			}else if(rolestr!=null && rolestr.equalsIgnoreCase("4")){//DD_Support_Admin
				allMap.remove("17");
				allMap.remove("18");
				allMap.remove("25");
				allMap.remove("22");
				allMap.remove("20");
				allMap.remove("19");
				allMap.remove("21");
				allMap.remove("23");
				allMap.remove("28");				
				allMap.remove("1");
				allMap.remove("5");
				allMap.remove("29");
				allMap.remove("30");
				allMap.remove("31");
				allMap.remove("32");
				allMap.remove("33");
			}else if(rolestr!=null && rolestr.equalsIgnoreCase("5")){//Assist
				allMap.remove("17");
				allMap.remove("26");
				allMap.remove("27");
				allMap.remove("25");
				allMap.remove("14");
				allMap.remove("11");
				allMap.remove("13");
				allMap.remove("12");
				allMap.remove("2");				
				allMap.remove("15");
				allMap.remove("22");
				allMap.remove("20");
				allMap.remove("18");
				allMap.remove("19");
				allMap.remove("21");
				allMap.remove("16");
				allMap.remove("24");
				allMap.remove("23");
				allMap.remove("28");
				allMap.remove("1");
				allMap.remove("5");
				allMap.remove("29");
				
				
			}else if(rolestr!=null && (rolestr.equalsIgnoreCase("3,4")|| rolestr.equalsIgnoreCase("4,3"))){//DD_Support_Admin + WFA_ADMIN (viseversa)
				allMap.remove("23");
				allMap.remove("28");
				allMap.remove("1");
				allMap.remove("5");
				allMap.remove("30");
				allMap.remove("31");
				allMap.remove("32");
				allMap.remove("33");
			
			}else if(rolestr!=null && (rolestr.equalsIgnoreCase("2,4")|| rolestr.equalsIgnoreCase("4,2"))){//WFD_Admin+DD_Support_Admin
				allMap.remove("25");
				allMap.remove("22");
				allMap.remove("20");
				allMap.remove("18");
				allMap.remove("19");
				allMap.remove("21");
				allMap.remove("29");
			}else if(rolestr!=null && (rolestr.equalsIgnoreCase("2,3")|| rolestr.equalsIgnoreCase("3,2"))){//WFD_Admin+WFA_ADMIN
				allMap.remove("14");
				allMap.remove("11");
				allMap.remove("13");
				allMap.remove("12");
				allMap.remove("15");
				allMap.remove("16");
				allMap.remove("24");
				allMap.remove("30");
				allMap.remove("31");
				allMap.remove("32");
				allMap.remove("33");
			}else{
				//All
			}
			
			//Roles Logic End
			//If user dont have any Roles then show empty dropdown
			if(rolestr == null)rolestr = "";
			if(rolestr!=null && !(rolestr.contains("1")||
									rolestr.contains("2")||
									rolestr.contains("3")||
									rolestr.contains("4")||
									rolestr.contains("5"))){
				allMap = new HashMap<String, String>();
			}
			
//			
//
//			Map<String, String> sampleDropdownMap = new HashMap<String, String>();
//			if (request.getSession().getAttribute("usr").toString().trim().equalsIgnoreCase("ksalter-c")||
//					request.getSession().getAttribute("usr").toString().trim().equalsIgnoreCase("lmiller")) {// WFD_Admin
//				
//				sampleDropdownMap.put("27", "Accomplishments - Language, Honor, Membership Data");
//				sampleDropdownMap.put("26", "Accomplishments - Education Degree Data");
//				sampleDropdownMap.put("14", "Action Reason Table");				
//				sampleDropdownMap.put("11", "Disciplinary Actions - Cases Not Marked Final");
//				sampleDropdownMap.put("12", "Disciplinary Actions - With Letter Date");
//				sampleDropdownMap.put("13", "Disciplinary Actions - Case Step Behavior Summary");				
//				sampleDropdownMap.put("15", "Employee Evaluation");
//				sampleDropdownMap.put("18", "Job Code Education Data");
//				sampleDropdownMap.put("16", "Prior State Government Work Experience Data ");
//				sampleDropdownMap.put("24", "Salary Allocation Data");
//				sampleDropdownMap.put("2", "TxDOT Employee ID Lookup");
//			}
//
//			if (request.getSession().getAttribute("usr").toString().trim().equalsIgnoreCase("rkonda-c") ||
//					request.getSession().getAttribute("usr").toString().trim().equalsIgnoreCase("hharri-c") ||
//					request.getSession().getAttribute("usr").toString().trim().equalsIgnoreCase("jpenning") ||
//					request.getSession().getAttribute("usr").toString().trim().equalsIgnoreCase("waulen-c")) {// ALL
//				
//				sampleDropdownMap.put("17", "Accomplishments - All License Data (Prior to Oct 2014)  ");
//				sampleDropdownMap.put("26", "Accomplishments - Education Degree Data");
//				sampleDropdownMap.put("27", "Accomplishments - Language, Honor, Membership Data");
//				sampleDropdownMap.put("25", "Accomplishments - PE License(Prior to Oct 2014)");
//				sampleDropdownMap.put("14", "Action Reason Table");
//				sampleDropdownMap.put("11", "Disciplinary Actions - Cases Not Marked Final");
//				sampleDropdownMap.put("13", "Disciplinary Actions - Case Step Behavior Summary");
//				sampleDropdownMap.put("12", "Disciplinary Actions - With Letter Date");
//				sampleDropdownMap.put("2", "TxDOT Employee ID Lookup");
//				sampleDropdownMap.put("15", "Employee Evaluation");
//				sampleDropdownMap.put("22", "Job Code Competency Data");
//				sampleDropdownMap.put("20", "Job Code Duty Data");
//				sampleDropdownMap.put("18", "Job Code Education Data");
//				sampleDropdownMap.put("19", "Job Code Experience Data");
//				sampleDropdownMap.put("21", "Job Code Subs");
//				sampleDropdownMap.put("16", "Prior State Government Work Experience Data ");
//				sampleDropdownMap.put("24", "Salary Allocation Data");
//				sampleDropdownMap.put("23", "Training - Course Information");
//				sampleDropdownMap.put("28", "Training History - ALL");
//				sampleDropdownMap.put("1", "Training History - By DDO ");
//				sampleDropdownMap.put("5", "TxDOT Employee Training History - Total Training Hrs by Employee");
//
//			}
//			
//			if (request.getSession().getAttribute("usr").toString().trim().equalsIgnoreCase("rsmith")||
//					request.getSession().getAttribute("usr").toString().trim().equalsIgnoreCase("jseife1")) {// WFA_ADMIN	
//				sampleDropdownMap.put("17", "Accomplishments - All License Data (Prior to Oct 2014)  ");
//				sampleDropdownMap.put("26", "Accomplishments - Education Degree Data");
//				sampleDropdownMap.put("27", "Accomplishments - Language, Honor, Membership Data");
//				sampleDropdownMap.put("25", "Accomplishments - PE License(Prior to Oct 2014)");
//				sampleDropdownMap.put("18", "Job Code Education Data");
//				sampleDropdownMap.put("2", "TxDOT Employee ID Lookup");
//				sampleDropdownMap.put("19", "Job Code Experience Data");
//				sampleDropdownMap.put("20", "Job Code Duty Data");
//				sampleDropdownMap.put("21", "Job Code Subs");
//				sampleDropdownMap.put("22", "Job Code Competency Data");
//			}
//			if (request.getSession().getAttribute("usr").toString().trim().equalsIgnoreCase("dhoust4")) {// DD_Support_Admin
//				sampleDropdownMap.put("27", "Accomplishments - Language, Honor, Membership Data");
//				sampleDropdownMap.put("26", "Accomplishments - Education Degree Data");
//				sampleDropdownMap.put("14", "Action Reason Table");				
//				sampleDropdownMap.put("11", "Disciplinary Actions - Cases Not Marked Final");
//				sampleDropdownMap.put("12", "Disciplinary Actions - With Letter Date");
//				sampleDropdownMap.put("13", "Disciplinary Actions - Case Step Behavior Summary");				
//				sampleDropdownMap.put("15", "Employee Evaluation");
//				sampleDropdownMap.put("18", "Job Code Education Data");
//				sampleDropdownMap.put("16", "Prior State Government Work Experience Data ");
//				sampleDropdownMap.put("24", "Salary Allocation Data");
//				sampleDropdownMap.put("2", "TxDOT Employee ID Lookup");
//				
//
//			}

			model.addAttribute("sampleDropdownMap", ReportController.sortByValue(allMap));
			model.addAttribute("reportform", new ReportForm());

			// ROLES LOGIC Start

			// ROLES LOGIC END

			return "reports/reportform";
		} else {
			model.addAttribute("loginForm", new LoginForm());
			notificationService.addErrorMessage("Please Login with your TxDOT credentials.");
			return "security/login";

		}

	}

	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("loginForm", new LoginForm());
		return "security/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@Valid LoginForm logForm, BindingResult bindingResult, Model model,
			HttpServletRequest request) {

		if (bindingResult.hasErrors()) {
			return "security/login";
		}
		String val = "";
		//check in db first
		ApplnUser applnUser = applnUserRepo.findByUserNm(logForm.getUserid().toLowerCase());
		if(applnUser == null){
			notificationService.addErrorMessage("Not Authorized to Access.");
			return "security/login";
		}
		// ldap authentication
		CustomLdapComponent comp = new CustomLdapComponent();
		val = comp.ldapCheck(logForm.getUserid(), logForm.getPassword());

		if (val.equalsIgnoreCase("Success")) {

			// check if DB has userid, if not insert to user table
			// call storedprocedure

			request.getSession().setAttribute("auth", "yes");
			request.getSession().setAttribute("usr", logForm.getUserid());
			return "redirect:/reports/reportform";
		} else {
			// return "error/403";
			notificationService.addErrorMessage("Invalid login");
			return "security/login";
		}

	}

	// end login form

	@RequestMapping(value = "/reportform", method = RequestMethod.POST)
	public String reportform(Model model, @ModelAttribute("repform") ReportForm reportForm,
			RedirectAttributes redirectAttrs, BindingResult bindingResult, HttpServletRequest request) {

		if (bindingResult.hasErrors()) {
			return "reports/login";
		}
		// System.out.println("RRRRRRRRRRRRRRR"+
		// request.getSession().getAttribute("name"));
		redirectAttrs.addFlashAttribute("rf", reportForm);

		if (request.getSession().getAttribute("name") != null
				&& !request.getSession().getAttribute("name").equals("yes")) {
			return "error/403";
		}

		return "redirect:/reports/employeetranininghistory?repid=" + reportForm.getReportId();
	}

	@RequestMapping({ "/reports/employeetranininghistory", "/employeetranininghistory" })
	public String listProducts(Model model, HttpServletRequest request, @RequestParam("repid") String repid) {
		// model.addAttribute("products",
		// trainingHistoryVwService.findByEmplid("10002"));
		SimpleDateFormat desiredFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm a");
		String timeStamp = desiredFormat.format(new Date());
		if (request.getSession().getAttribute("name") != null
				&& !request.getSession().getAttribute("name").equals("yes")) {
			return "error/403";
		}
		ReportForm rform = (ReportForm) model.asMap().get("rf");

		if (rform != null && rform.getReportId().equalsIgnoreCase("5")) {
			model.addAttribute("title","TxDOT Employee Training History - Total Training Hrs by Employee (Report Run Date: "+timeStamp+")");
			String reqcourseStr = "";
			if (rform.getCourseCodes5() != null && rform.getCourseCodes5().length > 0) {
				reqcourseStr = CommonUtil.convertStringArrayToString(rform.getCourseCodes5(), "|^");
			}
			rform.setEmpFirstName(reqcourseStr);
			model.addAttribute("products", psXJobcodeEducVwService.findByTraningMvwHistReport(rform.getBusinessUnit(),
					rform.getCourseStDate(), rform.getCourseEndDate(),reqcourseStr,rform.getEmployeeid5()));// ("008","11LFK")

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("28")) {
			model.addAttribute("title","Training History - ALL (Report Run Date: "+timeStamp+")");
			String reqcourseStr = "";
			if (rform.getJobcodes22() != null && rform.getCourseCodes28().length > 0) {
				reqcourseStr = CommonUtil.convertStringArrayToString(rform.getCourseCodes28(), "|^");
			}
			rform.setEmpFirstName(reqcourseStr);

			model.addAttribute("products", psXJobcodeEducVwService.findByjobcode28(reqcourseStr,
					rform.getCourseStDate28(), rform.getCourseEndDate28(),rform.getRep28employeeid(),rform.getSingleCourseCodes28()));// ("008","11LFK")

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("2")) {
			
			model.addAttribute("title","TxDOT Employee ID Lookup (Report Run Date: "+timeStamp+")");

			
			if (rform.getEmpFirstName() != null && !rform.getEmpFirstName().equalsIgnoreCase("")
					&& (rform.getEmpLastName() == null || rform.getEmpLastName().equalsIgnoreCase(""))) {
				model.addAttribute("products", psPersonalDtaVwService.findBySearchFN(rform.getEmpFirstName()));// ("008","11LFK")
			} else if (rform.getEmpLastName() != null && !rform.getEmpLastName().equalsIgnoreCase("")
					&& (rform.getEmpFirstName() == null || rform.getEmpFirstName().equalsIgnoreCase(""))) {
				model.addAttribute("products", psPersonalDtaVwService.findBySearchLN(rform.getEmpLastName()));// ("008","11LFK")
			} else if (rform.getEmpLastName() != null && !rform.getEmpLastName().equalsIgnoreCase("")
					&& rform.getEmpLastName() != null && !rform.getEmpLastName().equalsIgnoreCase("")) {
				model.addAttribute("products", psPersonalDtaVwService
						.findBySearchFullName(rform.getEmpLastName() + "," + rform.getEmpFirstName()));// ("008","11LFK")
			} else {
				model.addAttribute("products", psPersonalDtaVwService
						.findBySearchFullName(rform.getEmpLastName() + "," + rform.getEmpFirstName()));// ("008","11LFK")
			}

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("1")) {
			model.addAttribute("title","Training History - By DDO (Report Run Date: "+timeStamp+")");
			// course codes
			String reqcourseStr = "";
			if (rform.getCourseCodes() != null && rform.getCourseCodes().length > 0) {
				reqcourseStr = CommonUtil.convertStringArrayToString(rform.getCourseCodes(), "|^");
			}

			rform.setEmpFirstName(reqcourseStr);
			
			//model.addAttribute("title","RRRRRRR");

			model.addAttribute("products",
					psXTrnhistMvwService.findByCourse(rform.getBusinessUnit1(), rform.getCourseStDate1(),
							rform.getEmpFirstName(), rform.getCourseEndDate1(), rform.getEmployeeid(), rform.getSingleCourseCodes1()));// ("008","11LFK")

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("18")) {
			model.addAttribute("title","Job Code Education Data (Report Run Date: "+timeStamp+")");

			String reqcourseStr = "";
			if (rform.getJobcodes18() != null && rform.getJobcodes18().length > 0) {
				reqcourseStr = CommonUtil.convertStringArrayToString(rform.getJobcodes18(), "|^");
			}
			rform.setEmpFirstName(reqcourseStr);
			model.addAttribute("products", psXJobcodeEducVwService.findByjobcode(rform.getEmpFirstName(),rform.getSinglejobcode18(),rform.getJobtitle18()));

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("19")) {
			model.addAttribute("title","Job Code Experience Data (Report Run Date: "+timeStamp+")");

			String reqcourseStr = "";
			if (rform.getJobcodes19() != null && rform.getJobcodes19().length > 0) {
				reqcourseStr = CommonUtil.convertStringArrayToString(rform.getJobcodes19(), "|^");
			}
			rform.setEmpFirstName(reqcourseStr);
			model.addAttribute("products", psXJobcodeEducVwService.findByjobcode19(rform.getEmpFirstName(),rform.getSinglejobcode19(),rform.getJobtitle19()));

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("20")) {
			model.addAttribute("title","Job Code Duty Data (Report Run Date: "+timeStamp+")");
			String reqcourseStr = "";
			if (rform.getJobcodes20() != null && rform.getJobcodes20().length > 0) {
				reqcourseStr = CommonUtil.convertStringArrayToString(rform.getJobcodes20(), "|^");
			}
			rform.setEmpFirstName(reqcourseStr);
			model.addAttribute("products", psXJobcodeEducVwService.findByjobcode20(rform.getEmpFirstName(),rform.getSinglejobcode20(),rform.getJobtitle20()));

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("21")) {
			model.addAttribute("title","Job Code Subs (Report Run Date: "+timeStamp+")");
			String reqcourseStr = "";
			if (rform.getJobcodes21() != null && rform.getJobcodes21().length > 0) {
				reqcourseStr = CommonUtil.convertStringArrayToString(rform.getJobcodes21(), "|^");
			}
			rform.setEmpFirstName(reqcourseStr);
			model.addAttribute("products", psXJobcodeEducVwService.findByjobcode21(rform.getEmpFirstName(),rform.getSinglejobcode21()));

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("23")) {
			model.addAttribute("title","Training - Course Information (Report Run Date: "+timeStamp+")");
			String reqcourseStr = "";
			if (rform.getCourseCodes23() != null && rform.getCourseCodes23().length > 0) {
				reqcourseStr = CommonUtil.convertStringArrayToString(rform.getCourseCodes23(), "|^");
			}
			rform.setEmpFirstName(reqcourseStr);
			model.addAttribute("products", psXJobcodeEducVwService.findByjobcode23(rform.getEmpFirstName(),rform.getSinglejobcode23()));

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("22")) {
			model.addAttribute("title","Job Code Competency Data (Report Run Date: "+timeStamp+")");
			String reqcourseStr = "";
			if (rform.getJobcodes22() != null && rform.getJobcodes22().length > 0) {
				reqcourseStr = CommonUtil.convertStringArrayToString(rform.getJobcodes22(), "|^");
			}
			rform.setEmpFirstName(reqcourseStr);
			model.addAttribute("products", psXJobcodeEducVwService.findByjobcode22(rform.getEmpFirstName(),rform.getSinglejobcode22(),rform.getJobtitle22()));

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("29")) {
			model.addAttribute("title","Job Code Profile Data (Report Run Date: "+timeStamp+")");
			String reqcourseStr = "";
			if (rform.getJobcodes29() != null && rform.getJobcodes29().length > 0) {
				reqcourseStr = CommonUtil.convertStringArrayToString(rform.getJobcodes29(), "|^");
			}
			rform.setEmpFirstName(reqcourseStr);
			model.addAttribute("products", psXJobcodeEducVwService.findByjobcode29(rform.getEmpFirstName(),rform.getSinglejobcode29(),rform.getJobtitle29()));
			
			//model.addAttribute("products", jobcodeProfileDataMvwService.findByJobcode(rform.getSinglejobcode29()));
			
		} else if (rform != null && rform.getReportId().equalsIgnoreCase("14")) {
			model.addAttribute("title","Action Reason Table (Report Run Date: "+timeStamp+")");
			model.addAttribute("products", psActnReasonTblVwService.findAllRecords());

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("15")) {
			model.addAttribute("title","Employee Evaluation (Report Run Date: "+timeStamp+")");
			if (rform.getRep15employeeid() != null && !rform.getRep15employeeid().equalsIgnoreCase("")) {
				model.addAttribute("products", psEmpEvalDataHistMvwService
						.findByEmplid(rform.getRep15employeeid().replaceFirst("^0+(?!$)", "")));
			} else {
				model.addAttribute("products", psEmpEvalDataHistMvwService.findAllRecords());
			}

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("11")) {
			model.addAttribute("title","Disciplinary Actions - Cases Not Marked Final (Report Run Date: "+timeStamp+")");
			if (rform.getRep11employeeid() != null && !rform.getRep11employeeid().equalsIgnoreCase("")) {
				model.addAttribute("products", psXDacaseNotFinalMvwService
						.findByEmplid(rform.getRep11employeeid().replaceFirst("^0+(?!$)", "")));
			} else {
				model.addAttribute("products", psXDacaseNotFinalMvwService.findAllRecords());
			}

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("12")) {
			model.addAttribute("title","Disciplinary Actions - With Letter Date (Report Run Date: "+timeStamp+")");
			if (rform.getRep12employeeid() != null && !rform.getRep12employeeid().equalsIgnoreCase("")) {
				model.addAttribute("products", psXDacaseNoresoluMvwService
						.findByEmplid(rform.getRep12employeeid().replaceFirst("^0+(?!$)", "")));
			} else {
				model.addAttribute("products", psXDacaseNoresoluMvwService.findAllRecords());
			}

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("13")) {
			model.addAttribute("title","Disciplinary Actions - Case Step Behavior Summary (Report Run Date: "+timeStamp+")");
			if (rform.getRep13employeeid() != null && !rform.getRep13employeeid().equalsIgnoreCase("")) {
				model.addAttribute("products",
						psXLr01DaCaseMvwService.findByEmplid(rform.getRep13employeeid().replaceFirst("^0+(?!$)", "")));
			} else {
				model.addAttribute("products", psXLr01DaCaseMvwService.findAllRecords());
			}

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("16")) {
			model.addAttribute("title","Prior State Government Work Experience Data (Report Run Date: "+timeStamp+")");
			if (rform.getRep16employeeid() != null && !rform.getRep16employeeid().equalsIgnoreCase("")) {
				model.addAttribute("products", psPriorStateWorkexprMvwService
						.findByEmplid(rform.getRep16employeeid().replaceFirst("^0+(?!$)", "")));
			} else {
				model.addAttribute("products", psPriorStateWorkexprMvwService.findAllRecords());
			}

		}else if (rform != null && rform.getReportId().equalsIgnoreCase("30")) {
			model.addAttribute("title","Alcohol Screening Data (Report Run Date: "+timeStamp+")");
			if (rform.getRep30ssn() != null && !rform.getRep30ssn().equalsIgnoreCase("")) {
				model.addAttribute("products", hrworkAlcoholScreeningVwService
						.findBySsnNumber(rform.getRep30ssn().replaceFirst("^0+(?!$)", "")));
			} else {
				model.addAttribute("products", hrworkAlcoholScreeningVwService.findAllRecords());
			}

		}else if (rform != null && rform.getReportId().equalsIgnoreCase("31")) {
		      model.addAttribute("title","Drug Test Data (Report Run Date: "+timeStamp+")");
		      if (rform.getRep31ssn() != null && !rform.getRep31ssn().equalsIgnoreCase("")) {
		        model.addAttribute("products", hrworkDrugTestVwService
		            .findBySsnNumber(rform.getRep31ssn().replaceFirst("^0+(?!$)", "")));
		      } else {
		        model.addAttribute("products", hrworkDrugTestVwService.findAllRecords());
		      }

		    }else if (rform != null && rform.getReportId().equalsIgnoreCase("32")) {
		        model.addAttribute("title","People Data (Report Run Date: "+timeStamp+")");
		        if (rform.getRep32ssn() != null && !rform.getRep32ssn().equalsIgnoreCase("")) {
		          model.addAttribute("products", hrworkPeopleVwService
		              .findBySsnNumber(rform.getRep32ssn().replaceFirst("^0+(?!$)", "")));
		        } else {
		          model.addAttribute("products", hrworkPeopleVwService.findAllRecords());
		        }

		      }else if (rform != null && rform.getReportId().equalsIgnoreCase("33")) {
		          model.addAttribute("title","Positive History Data (Report Run Date: "+timeStamp+")");
		          if (rform.getRep33ssn() != null && !rform.getRep33ssn().equalsIgnoreCase("")) {
		            model.addAttribute("products", hrworkPositiveHistoryVwService
		                .findBySsnNumber(rform.getRep33ssn().replaceFirst("^0+(?!$)", "")));
		          } else {
		            model.addAttribute("products", hrworkPositiveHistoryVwService.findAllRecords());
		          }

		        }   else if (rform != null && rform.getReportId().equalsIgnoreCase("17")) {
			model.addAttribute("title","Accomplishments - All License Data(Prior to Oct 2014) (Report Run Date: "+timeStamp+")");
//			if ((rform.getRep17employeeid() == null || rform.getRep17employeeid().equalsIgnoreCase(""))
//					&& (rform.getBusinessUnit17() == null || rform.getBusinessUnit17().equalsIgnoreCase(""))) {
//				model.addAttribute("products", psPeLicenseDataHistMvwService.findAllRecords());
//			} else {
//				model.addAttribute("products", psPeLicenseDataHistMvwService.findByBUEmp(rform.getBusinessUnit17(),
//						rform.getRep17employeeid().replaceFirst("^0+(?!$)", "")));
//
//			}
			
			
			
			//BU and Fy not null

			
			
			
			if(rform.getBusinessUnit17()!=null && !rform.getBusinessUnit17().equalsIgnoreCase("") && 
			rform.getRep17employeeid()!=null && !rform.getRep17employeeid().equalsIgnoreCase("")){
		model.addAttribute("products", psAllLicenseDataHistMvwService.findByBUEmp(rform.getBusinessUnit17(),
				rform.getRep17employeeid().replaceFirst("^0+(?!$)", "")));

	}else if(rform.getBusinessUnit17()!=null && !rform.getBusinessUnit17().equalsIgnoreCase("") ){
		model.addAttribute("products", psAllLicenseDataHistMvwService.findBySearchBU(rform.getBusinessUnit17()));
	}else if(rform.getRep17employeeid()!=null && !rform.getRep17employeeid().equalsIgnoreCase("") ){
		model.addAttribute("products", psAllLicenseDataHistMvwService.findByBUEmp(rform.getBusinessUnit17(),
				rform.getRep17employeeid().replaceFirst("^0+(?!$)", "")));
	}else{
		model.addAttribute("products", psAllLicenseDataHistMvwService.findAllRecords());
	}
			

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("25")) {
			model.addAttribute("title","Accomplishments - PE License (Prior to Oct 2014) (Report Run Date: "+timeStamp+")");
//			if ((rform.getRep25employeeid() == null || rform.getRep25employeeid().equalsIgnoreCase(""))
//					&& (rform.getBusinessUnit25() == null || rform.getBusinessUnit25().equalsIgnoreCase(""))) {
//				model.addAttribute("products", psAllLicenseDataHistMvwService.findAllRecords());
//			} else {
//				model.addAttribute("products", psAllLicenseDataHistMvwService.findByBUEmp(rform.getBusinessUnit25(),
//						rform.getRep25employeeid().replaceFirst("^0+(?!$)", "")));
//
//			}
			
			
						
			

			if(rform.getBusinessUnit25()!=null && !rform.getBusinessUnit25().equalsIgnoreCase("") && 
			rform.getRep25employeeid()!=null && !rform.getRep25employeeid().equalsIgnoreCase("")){
		model.addAttribute("products", psPeLicenseDataHistMvwService.findByBUEmp(rform.getBusinessUnit25(),
				rform.getRep25employeeid().replaceFirst("^0+(?!$)", "")));

	}else if(rform.getBusinessUnit25()!=null && !rform.getBusinessUnit25().equalsIgnoreCase("") ){
		model.addAttribute("products", psPeLicenseDataHistMvwService.findBySearchBU(rform.getBusinessUnit25()));
	}else if(rform.getRep25employeeid()!=null && !rform.getRep25employeeid().equalsIgnoreCase("") ){
		model.addAttribute("products", psPeLicenseDataHistMvwService.findByBUEmp(rform.getBusinessUnit25(),
				rform.getRep25employeeid().replaceFirst("^0+(?!$)", "")));
	}else{
		model.addAttribute("products", psPeLicenseDataHistMvwService.findAllRecords());
	}
			
			
			

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("26")) {
			model.addAttribute("title","Accomplishments - Education Degree Data (Report Run Date: "+timeStamp+")");
			if ((rform.getRep26employeeid() == null || rform.getRep26employeeid().equalsIgnoreCase(""))
					&& (rform.getBusinessUnit26() == null || rform.getBusinessUnit26().equalsIgnoreCase(""))) {
				model.addAttribute("products", psEducDegreeDataHistMvwService.findAllRecords());
			} else {
				model.addAttribute("products", psEducDegreeDataHistMvwService.findByBUEmp(rform.getBusinessUnit26(),
						rform.getRep26employeeid().replaceFirst("^0+(?!$)", "")));

			}

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("27")) {
			model.addAttribute("title","Accomplishments - Language, Honor, Membership Data (Report Run Date: "+timeStamp+")");
			if ((rform.getRep27employeeid() == null || rform.getRep27employeeid().equalsIgnoreCase(""))
					&& (rform.getBusinessUnit27() == null || rform.getBusinessUnit27().equalsIgnoreCase(""))) {
				model.addAttribute("products", psOtherAccomplDataHistMvwService.findAllRecords());
			} else {
				model.addAttribute("products", psOtherAccomplDataHistMvwService.findByBUEmp(rform.getBusinessUnit27(),
						rform.getRep27employeeid().replaceFirst("^0+(?!$)", "")));

			}

		} else if (rform != null && rform.getReportId().equalsIgnoreCase("24")) {
			model.addAttribute("title","Salary Allocation Data (Report Run Date: "+timeStamp+")");
//			if ((rform.getCourseStDate24() == null || rform.getCourseStDate24().equalsIgnoreCase(""))
//					&& (rform.getBusinessUnit24() == null || rform.getBusinessUnit24().equalsIgnoreCase(""))) {
//				model.addAttribute("products", psXSlryAllocMvwService.findAllRecords());
//			} else {
//				model.addAttribute("products", psXSlryAllocMvwService.findByBUEmp(rform.getBusinessUnit24(),
//						rform.getCourseStDate24().replaceFirst("^0+(?!$)", "")));
//
//			}
			
			//BU and Fy not null
			if(rform.getCourseStDate24()!=null && !rform.getCourseStDate24().equalsIgnoreCase("") && 
					rform.getBusinessUnit24()!=null && !rform.getBusinessUnit24().equalsIgnoreCase("")){
				model.addAttribute("products", psXSlryAllocMvwService.findByBUEmp(rform.getBusinessUnit24(),
						rform.getCourseStDate24().replaceFirst("^0+(?!$)", "")));
			}else if(rform.getBusinessUnit24()!=null && !rform.getBusinessUnit24().equalsIgnoreCase("") ){
				model.addAttribute("products", psXSlryAllocMvwService.findBySearchBU(rform.getBusinessUnit24()));
			}else if(rform.getCourseStDate24()!=null && !rform.getCourseStDate24().equalsIgnoreCase("") ){
				model.addAttribute("products", psXSlryAllocMvwService.findByFiscalYear(rform.getCourseStDate24()));
			}else{
				model.addAttribute("products", psXSlryAllocMvwService.findAllRecords());	
			}
			

		} else {
			return "error/403";
		}

		return "reports/employeetranininghistory";
	}

}
