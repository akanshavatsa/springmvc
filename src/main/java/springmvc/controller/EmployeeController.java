package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.service.EmployeeServiceImpl;
import springmvc.service.IEmployeeService;
import springmvc.vo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;

    @ModelAttribute
    public void commonDataForModel(Model m)
    {
        System.out.println("adding common data to model");
        m.addAttribute("Header","Employee Details Form");
        m.addAttribute("Desc","Please fill in the details");
    }


    @RequestMapping("/formDisplay")
    public  String formDisplay()
    {
        return "employeeFormDisplay";

    }


    @RequestMapping(value = "/processForm"  , method = RequestMethod.POST)
        public String processForm(@ModelAttribute Employee employee)
        {
            System.out.println(employee);
            employeeService.save(employee);

            return "employeeGrid";

        }

        @RequestMapping(value = "/update" ,method=RequestMethod.PUT)
                public String updateEmployee(@ModelAttribute Employee employee)
        {
          employeeService.update(employee);
              return  "employeeGrid";
        }




}
