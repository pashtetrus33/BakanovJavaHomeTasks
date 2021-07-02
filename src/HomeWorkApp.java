public class HomeWorkApp {

        public static void main(String[] args) {

            StaffMember[] employeesArray = new StaffMember[5];

            employeesArray[0] = new StaffMember("Pavlov Ivan", "Chief Executive Officer", "pavlovi@company.com", "+79602223344", 400000, 55);
            employeesArray[1] = new StaffMember("Ivanov Pavel", "Chief Financial Officer", "ivanovp@company.com", "+79602223355", 200000, 45);
            employeesArray[2] = new StaffMember("Petrov Semen", "Chief Accounting Officer", "petrovs@company.com", "+79602223366", 100000, 35);
            employeesArray[3] = new StaffMember("Romanova Mariia", "Developer", "romanovam@company.com", "+79602223377", 150000, 30);
            employeesArray[4] = new StaffMember("Sokolova Anna", "Engineer", "sokolovaa@company.com", "+79602223388", 90000, 41);

            for (StaffMember staffMember : employeesArray) {
                if (staffMember.getAge() > 40) {
                    staffMember.info();
                    System.out.println();
                }

            }
        }
    }

