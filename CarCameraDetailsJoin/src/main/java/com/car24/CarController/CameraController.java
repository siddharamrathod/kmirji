package com.car24.CarController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.car24.CarDao.CarDAO;
import com.car24.CarServices.CameraService;
import com.car24domain.entities.Camera;

@Controller
public class CameraController  {

	@Autowired
	private CameraService cameraService;

	@RequestMapping("/cameradetails")
	public String showMessage(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		
		/*int cameraId = Integer.parseInt(request.getParameter("cameraId"));
		Camera camera = cameraService.getCameraById(cameraId);
		if (camera != null) {
			model.addAttribute("cameraName", camera.getCameraName());
			model.addAttribute("storeName", camera.getStore().getStoreName());
			model.addAttribute("mikoName", camera.getStore().getMiko().getMikoName());
		} */
		
		
		
		
		return "Car";
	}

	
}
