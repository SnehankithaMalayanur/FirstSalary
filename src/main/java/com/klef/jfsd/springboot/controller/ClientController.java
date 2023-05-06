package com.klef.jfsd.springboot.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.DepartmentAdmin;
import com.klef.jfsd.springboot.model.IrpAdmin;
import com.klef.jfsd.springboot.model.JobDrive;
import com.klef.jfsd.springboot.model.JobProfile;
import com.klef.jfsd.springboot.model.JobSeeker;
import com.klef.jfsd.springboot.model.Recruiter;
import com.klef.jfsd.springboot.service.IrpAdminService;
import com.klef.jfsd.springboot.service.JobDriveService;
import com.klef.jfsd.springboot.service.JobProfileService;
import com.klef.jfsd.springboot.service.JobSeekerService;
import com.klef.jfsd.springboot.service.RecruiterService;



@Controller
public class ClientController
{
	@Autowired
	private IrpAdminService irpadminService;
	
	
	@Autowired
	private JobSeekerService jobseekerService;

	@Autowired
	private RecruiterService recruiterService;
	
	@Autowired
	private JobProfileService createjobprofileService;
	
	@Autowired
	private JobDriveService jobdriveService;

	@GetMapping("/")
	public String mainhomedemo()
	{
		return "index";
	}
	@GetMapping("/index")
	public String indexdemo()
	{
		return "index";
	}
	@GetMapping("/job-list")
	public String joblistdemo()
	{
		return "job-list";
	}
	@GetMapping("/job-detail")
	public String jobdetaildemo()
	{
		return "job-detail";
	}
	@GetMapping("/category")
	public String categorydemo()
	{
		return "category";
	}
	@GetMapping("/feedback")
	public String contactdemo()
	{
		return "feedback";
	}
	@GetMapping("/login")
	public String logindemo()
	{
		return "login";
	}

	
	@GetMapping("/irpadminlogin")
	public ModelAndView irpadminlogindemo()
	{
		ModelAndView mv = new ModelAndView("irpadminlogin");
		
		return mv;
	}
//	
	
	
	@GetMapping("/about")
	public ModelAndView aboutdemo()
	{
		ModelAndView mv = new ModelAndView("about");
		
		return mv;
	}

	


	
	
	@GetMapping("/jobseekerlogin")
	public ModelAndView jobseekerlogindemo()
	{
		ModelAndView mv = new ModelAndView("jobseekerlogin");
		
		return mv;
	}
//	
	@GetMapping("/recruiterlogin")
	public ModelAndView recruiterlogindemo()
	{
		ModelAndView mv = new ModelAndView("recruiterlogin");
		
		return mv;
	}
	
	
//	
	@GetMapping("/jobseekerreg")
	public ModelAndView jobseekerregistrationdemo()
	{
		ModelAndView mv = new ModelAndView("jobseekerreg", "jobseeker",new JobSeeker());
		return mv;
	}
//	
	@GetMapping("/recruiterregistration")
	public ModelAndView recruiterregistrationdemo()
	{
		ModelAndView mv = new ModelAndView("recruiterregistration", "recruiter",new Recruiter());
		return mv;
	}
//	
	@GetMapping("/irpadminhome")
	public ModelAndView irpadminhomedemo()
	{
		ModelAndView mv = new ModelAndView("irpadminhome");
		
		return mv;
	}
	

//	@GetMapping("/viewalljobseeker")
//	public ModelAndView viewalljobseekersdemo()
//	{
//		ModelAndView mv = new ModelAndView("viewalljobseeker");
//		
//		List<JobSeeker> jobseekerlist = irpadminService.viewalljobseekers();
//		mv.addObject("jobseekerlist",jobseekerlist);
//		
//		return mv;
//	}
//	
	@PostMapping("/checkirpadminlogin")
	public ModelAndView checkirpadminlogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String iauname = request.getParameter("iauname");
		String iapwd = request.getParameter("iapwd");
		
		IrpAdmin irpadmin = irpadminService.checkirpadminlogin(iauname, iapwd);
		
		if(irpadmin!=null)
		{
			
			HttpSession session = request.getSession();
			
			session.setAttribute("iauname", iauname);
			
			mv.setViewName("irpadminhome");
		}
		else
		{
			mv.setViewName("irpadminlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}
	
////	
////	
	@PostMapping("/checkjobseekerlogin")
	public ModelAndView checkjobseekerlogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String uname = request.getParameter("jobseekeruname");
		String pwd = request.getParameter("jobseekerpwd");
		
		JobSeeker jobseeker = jobseekerService.checkjobseekerlogin(uname, pwd);
		
		if(jobseeker!=null)
		{
			HttpSession session = request.getSession();
			
			session.setAttribute("jobseekeruname", uname);
			
			mv.setViewName("job-detail");
		}
		else
		{
			mv.setViewName("jobseekerlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}
//	
	@PostMapping("/checkrecruiterlogin")
	public ModelAndView checkrecruiterlogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String recruiteruname = request.getParameter("recruiteruname");
		String recruiterpwd = request.getParameter("recruiterpwd");
		
		Recruiter recruiter = recruiterService.checkrecruiterlogin(recruiteruname, recruiterpwd);
		
		if(recruiter!=null)
		{
			HttpSession session = request.getSession();
			
			session.setAttribute("recruiteruname", recruiteruname);
			
			mv.setViewName("job-list");
		}
		else
		{
			mv.setViewName("recruiterlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}
////	
////	

	
	
	@PostMapping("/addjobseeker")
	public ModelAndView addjobseekerdemo(@ModelAttribute("jobseeker") JobSeeker jobseeker)
	{
		jobseekerService.addjobseeker(jobseeker);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("jobseekerreg");
		mv.addObject("msg", "JobSeeker Registered Successfully");
		return mv;
	}
//	
	@PostMapping("/addrecruiter")
	public ModelAndView addrecruiterdemo(@ModelAttribute("recruiter") Recruiter recruiter)
	{
		recruiterService.addrecruiter(recruiter);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("recruiterregistration");
		mv.addObject("msg", "Recruiter Registered Successfully");
		
		return mv;
	}
	
	@GetMapping("createjobprofiledemo")
	public ModelAndView createjobprofiledemo()
	{
		ModelAndView mv = new ModelAndView("createjobprofiledemo", "jobprofile",new JobProfile());
		return mv;
	}
//	
	@PostMapping("/insertjobprofile")
	public ModelAndView addcreatejobprofiledemo(@ModelAttribute("jobprofile") JobProfile jobprofile)
	{
		createjobprofileService.addcreatejobprofile(jobprofile);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("createjobprofiledemo");
		mv.addObject("msg", "Profile added successfully...!");
		
		return mv;
	}
	
	@GetMapping("applyjob")
	public ModelAndView applyjob()
	{
		ModelAndView mv=new ModelAndView("applyjob");
		mv.addObject("jlist", jobdriveService.viewalljobdrive());
		return mv;
	}
	
//
	@GetMapping("/applynow")
	public void applynow(HttpServletRequest request,@RequestParam(value="id",required=true) Integer jid)
	{
		
        System.out.println(jid);
	
	}
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/addjobdrive")
	public ModelAndView addjobdrivedemo()
	{
		ModelAndView mv = new ModelAndView("jobdrives", "jobdrive",new JobDrive());
		return mv;
	}
	
	
	@PostMapping("/insertjobdrive")
	public ModelAndView addnewjobdrivedemo(@ModelAttribute("jobdrive") JobDrive jobdrive)
	{
		jobdriveService.addnewjobdrive(jobdrive);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("job-list");
		mv.addObject("msg", "JobDrive Created Successfully");
		return mv;
	}
	
//	@PostMapping("/addjobdrive")
//	public ModelAndView addjobdrivedemo(@ModelAttribute("jobdrive") JobDrive jobdrive)
//	{
//		jobdriveService.addjobdrive(jobdrive);
//		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("jobdrives");
//		mv.addObject("msg", "Job Drive Added Successfully");
//		
//		return mv;
//	}
	
	@GetMapping("/deletejobseeker")
	public String deletejobseekerdemo(@RequestParam("id") int jobseekerid)
	{
		irpadminService.deletejobseeker(jobseekerid);
		
		return "redirect:viewalljobseekers";
	}
	
	@GetMapping("/deleterecruiter")
	public String deleterecruiterdemo(@RequestParam("id") int recruiterid)
	{
		irpadminService.deleterecruiter(recruiterid);
		
		return "redirect:viewallrecruiters";
	}
////	
//	@GetMapping("/viewrecruiter")
//	public ModelAndView viewrecruiter(HttpServletRequest request)
//	{
//		HttpSession session = request.getSession();
//		
//		String recruiteruname = (String) session.getAttribute("recruiteruname");
//		
//		Recruiter recruiter =  recruiterService.viewrecruiter(recruiteruname);
//		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("viewrecruiter");
//		mv.addObject("recruiter",recruiter);
//		
//		return mv;
//	}
//	
	@GetMapping("/viewalljobseekers")
	public ModelAndView viewjobseeker()
	{
ModelAndView mv = new ModelAndView("viewalljobseekers");
		
		List<JobSeeker> jobseekerlist = irpadminService.viewalljobseekers();
		mv.addObject("jobseekerlist",jobseekerlist);
		
		return mv;
	}
	
	@GetMapping("/viewjobseeker")
	public ModelAndView viewjobseekerdemo(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String jobseeker = (String) session.getAttribute("jobseeker");
		
		JobSeeker jobseekers =  jobseekerService.viewjobseeker(jobseeker);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewjobseeker");
		mv.addObject("jobseeker",jobseeker);
		
		return mv;
	}

//	@GetMapping("/viewallapplyjobs")
//	public ModelAndView viewapplyjob()
//	{
//ModelAndView mv = new ModelAndView("viewallapplyjobs");
//		
//		List<ApplyJob> applyjoblist = applyjobService.viewallapplyjobs();
//		mv.addObject("applyjoblist",applyjoblist);
//		
//		return mv;
//	}
	
	@GetMapping("/viewallrecruiters")
	public ModelAndView viewrecruiter()
	{
ModelAndView mv = new ModelAndView("viewallrecruiters");
		
		List<Recruiter> recruiterlist = irpadminService.viewallrecruiters();
		mv.addObject("recruiterlist",recruiterlist);
		
		return mv;
	}
	
	
//	
	@GetMapping("/jobseekerchangepwd")
	public ModelAndView jobseekerchangepwd(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String jobseekeruname = (String) session.getAttribute("jobseekeruname");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("jobseekerchangepwd");
		mv.addObject("jobseekeruname",jobseekeruname);
		
		return mv;
	}
	
	
	@PostMapping("/updatejobseekerpwd")
	public ModelAndView updateemppwddemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("jobseekerchangepwd");
		
		HttpSession session = request.getSession();
		
		String jobseekeruname = (String) session.getAttribute("jobseekeruname");
		
		String jobseekeroldpwd = request.getParameter("jobseekeropwd");
		String jobseekernewpwd = request.getParameter("jobseekernpwd");
		
		int n = jobseekerService.changejobseekerpassword(jobseekeroldpwd, jobseekernewpwd, jobseekeruname);
		
		if(n > 0)
		{
			
			mv.addObject("msg","Password Updated Successfully");
		}
		else
		{
			mv.addObject("msg","Old Password is Incorrect");
		}
		
		return mv;
	}
	
	@GetMapping("/recruiterchangepwd")
	public ModelAndView recruiterchangepwd(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String recruiteruname = (String) session.getAttribute("recruiteruname");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("recruiterchangepwd");
		mv.addObject("recruiteruname",recruiteruname);
		
		return mv;
	}
	
	@GetMapping("/viewjobseekerbyid")
	public ModelAndView viewjobseekerbyiddemo(@RequestParam("id") int id)
	{
		JobSeeker jobseeker = irpadminService.viewjobseekerbyid(id);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("viewjobseekerbyid");
		mv.addObject("jobseeker",jobseeker);
		
		return mv;
	}
	
	@GetMapping("/viewrecruiterbyid")
	public ModelAndView viewrecruiterbyiddemo(@RequestParam("id") int id)
	{
		Recruiter recruiter = irpadminService.viewrecruiterbyid(id);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("viewrecruiterbyid");
		mv.addObject("recruiter",recruiter);
		
		return mv;
	}
	
	@GetMapping("/viewjobprofile")
	public ModelAndView viewjobprofiledemo(@RequestParam("id") int id)
	{
		JobProfile jobprofile = JobProfileService.viewjobprofile(id);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("viewjobprofile");
		mv.addObject("jobprofile",jobprofile);
		
		return mv;
	}
	
	
	
}
