package com.mgr.controller.sawonprocess;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mgr.sawon.service.TelInfoService;
import com.mgr.sawon.vo.TelInfoVO;

@Controller
public class SawonController {

	@Resource(name = "TelInfoService")
	private TelInfoService telInfoService;

	@RequestMapping("/getAllTelinfo.do")
	public String sawonGetAllTelinfo(TelInfoVO vo1, Model model1) throws SQLException {
		model1.addAttribute("mAllTelinfo", telInfoService.getAllTelinfo(vo1));
		return "sawonGetAllTelinfo"; // .jsp로 보낸다 views안에있는 sawonGetAllTelinfo.jsp
	}
	
	@RequestMapping("/insertTelinfo.do")
	public String sawonInsertTelinfo(TelInfoVO vo1) throws SQLException {
		telInfoService.insertTelinfo(vo1);
		return "redirect:getAllTelinfo.do";
	}
	
	@RequestMapping("/getTelinfo.do")
	public String sawonGetTelinfo(TelInfoVO vo1 , Model model1) throws SQLException {
		model1.addAttribute("mTelinfo",telInfoService.getTelInfo(vo1));
		return "sawonGetTelinfo";
	}
	
	@RequestMapping("/updateTelinfo.do")
	public String sawonUpdateTelinfo(TelInfoVO vo1) throws SQLException {
		telInfoService.updateTelinfo(vo1);
		return "redirect:getAllTelinfo.do";
	}
	
	@RequestMapping("/deleteTelinfo.do")
	public String sawondeleteTelinfo(TelInfoVO vo1) throws SQLException {
		telInfoService.deleteTelinfo(vo1);
		return "redirect:getAllTelinfo.do";
	}

}
