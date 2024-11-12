package com.javaweb.demo.controllers;

import com.javaweb.demo.models.Student;
import com.javaweb.demo.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

//danh dau day la 1 controller(1 bean)
//annotation controller se giup spring boot biet duoc day la 1 controller
@Controller
@RequestMapping("/student")
public class StudentController {


    // cơ chế autowired giúp spring boot tự động tìm kiếm và inject bean vào đây
    @Autowired
    private IStudentService studentService;

    @GetMapping("")
    public String displayAllStudent(Model model){// model là 1 đối tượng giúp truyền dữ liệu từ controller sang view

        List<Student> students = studentService.findAll();
        model.addAttribute("students", students); // truyền dữ liệu students sang view
        return "student/list";
//        return new ModelAndView("student/list","students",studentService.findAll());
    }

    @GetMapping("/create")
    public String viewCreate(){
        return "student/create";
    }
    @PostMapping("/create")
    public String newStudent(@RequestParam("name")String name,
                             @RequestParam("address")String address,
                             @RequestParam("point")double point,
                             Model model,RedirectAttributes redirectAttributes){
        Student student = new Student(name,address,point);
        studentService.save(student);
        redirectAttributes.addFlashAttribute("message","Them moi thanh cong");
        return "redirect:/student";
    }
    // Bien thể của RequestMapping
    // PatchMapping: được dùng để cập nhật dữ liệu, sửa 1 phần hoặc toàn bộ dữ liệu
    //PutMapping: được dùng để cập nhật dữ liệu, sửa toàn bộ dữ liệu
//    @RequestMapping(value="/create", method= RequestMethod.GET){
//
//    }

}
