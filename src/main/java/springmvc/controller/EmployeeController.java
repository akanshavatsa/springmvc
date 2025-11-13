package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springmvc.model.EmployeeEntity;
import springmvc.service.EmployeeServiceImpl;
import springmvc.service.IEmployeeService;
import springmvc.utils.EmployeeUtility;
import springmvc.vo.Employee;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;

    @ModelAttribute
    public void commonDataForModel(Model m)
    {
        //System.out.println("adding common data to model");
        m.addAttribute("Header","Employee Details Form");
        m.addAttribute("Desc","Please fill in the details");
    }


    @RequestMapping("/formDisplay")
    public  String formDisplay()
    {
        return "employeeFormDisplay";

    }


    @RequestMapping(value = "/processForm"  , method = RequestMethod.POST)
    @ResponseBody
        public String processForm(@ModelAttribute Employee employee , Model model)
        {
            System.out.println("in processs employee");

            System.out.println(employee);
            employeeService.update(employee);

            return "success";



        }


        @RequestMapping(value = "/update" ,method=RequestMethod.PUT)
        @ResponseBody

                public String updateEmployee(@RequestBody Employee employee)
        {
            System.out.println(employee);
          employeeService.update(employee);

            return "redirect:/employee/getAllEmployees";
        }

    @RequestMapping(value = "/edit/{id}")

    public String updateEmployee(@PathVariable("id") long id, Model model)
    {
        //System.out.println(employee);
        System.out.println("in edit method");
        EmployeeEntity employeeEntity= employeeService.getEmployeeById(id);
        model.addAttribute("employee",EmployeeUtility.getEmployee(employeeEntity));
        return "employeeFormDisplay";
        //employeeService.update(id);


    }

        @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
@ResponseBody
    public  String deleteEmployee(@PathVariable("id")long id)
        {
            System.out.println(id);
            employeeService.delete(id);
            return "success";

            //return "redirect:/employee/getAllEmployees";
        }

        @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)

    public String getAllEmployees (Model model)
        {
            List<EmployeeEntity> allEmployees = employeeService.getAllEmployees();
            model.addAttribute("employees",allEmployees);
            System.out.println(allEmployees);
            return  "employeeGrid";
        }




}
