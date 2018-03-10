package com.lukashman.FateLibrary.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/files")
public class FileController {
	
	private final String PATH = "C:/Download/UPLOADTEST";
	private final static Logger LOGGER = LogManager.getLogger(FileController.class);
	
	@RequestMapping(value = "/fileUpload")
	public ModelAndView fileUpload() {
		ModelAndView md = new ModelAndView("fileUpload");
		md.addObject("title", "File Upload Test");
		return md;
	}
	
	@PostMapping(value = "/fileUploadAction")
	public ModelAndView fileUploadAction(@RequestParam("file") MultipartFile file) {
				
		if (!file.isEmpty()) {
			try {
				File dir = new File(PATH);
				File serverFile = new File(dir.getAbsolutePath() + File.separator + file.getOriginalFilename());
				byte[] bytes = file.getBytes();
				
				if (!dir.exists()) {
					dir.mkdir();
				}
				
				BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(serverFile));
				bufferedOutputStream.write(bytes);
				bufferedOutputStream.flush();
				bufferedOutputStream.close();
				LOGGER.info("Server file path: " + serverFile.getAbsolutePath());
				
				return getUploadedFile(serverFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				LOGGER.error("Something wrong with File");
				return fileUpload();
			}
		} else {
			LOGGER.error("File cannto be null");
			return fileUpload();
		}
	}
	
	public ModelAndView getUploadedFile(File file) {
		ModelAndView md = new ModelAndView("fileView");
		md.addObject("title", "Uploaded File | " + file.getName());
		md.addObject(file);
		return md;
	}
}
