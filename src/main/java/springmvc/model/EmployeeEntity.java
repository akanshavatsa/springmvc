package springmvc.model;


import jakarta.persistence.*;

@Entity
@Table(name = "EMPLOYEES")
public class EmployeeEntity {


       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       @Column(name = "ID")
        private long id;

        private  String  email;
        private  String userName;
        private  String projectName;
        private  String managerName;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getProjectName() {
            return projectName;
        }

        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }

        public String getManagerName() {
            return managerName;
        }

        public void setManagerName(String managerName) {
            this.managerName = managerName;
        }


    }


