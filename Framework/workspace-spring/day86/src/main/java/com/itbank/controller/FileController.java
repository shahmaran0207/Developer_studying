package com.itbank.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.FileService;

@Controller
@RequestMapping("/test")
public class FileController {
	
	@Autowired
	private FileService fs;

	@GetMapping("/EX01")
	public void EX01() {}
	
	@PostMapping("/EX01")
	public void EX01(MultipartFile upload, String memo) {
		System.out.println("memo = " + memo);
		
		System.out.println("upload = " + upload);
		System.out.println("이름1 : " + upload.getName());
		System.out.println("이름2 : " + upload.getOriginalFilename());
		System.out.println("타입 : " + upload.getContentType());
		System.out.println("크기 : " + upload.getSize());
	}

	@GetMapping("/EX02")
	public ModelAndView EX02() throws IOException {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("dir", fs.getDir());
		
		return mav;
	}

	@PostMapping("/EX02")
	public String EX02(MultipartFile upload) throws IOException {
		fs.fileUpload(upload);
		return "redirect:/test/EX02";
	}
}
