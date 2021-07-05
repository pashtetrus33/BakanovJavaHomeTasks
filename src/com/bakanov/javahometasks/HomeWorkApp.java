package com.bakanov.javahometasks;

public class HomeWorkApp {

        public static void main(String[] args) {

            StaffMember[] employeesArray = new StaffMember[5];

            employeesArray[0] = new StaffMember("Pavlov Ivan", "Chief Executive Officer", "pavlovi@company.com", "+79602223344", 30000000, 55);
            employeesArray[1] = new StaffMember("Ivanov Pavel", "Chief Financial Officer", "ivanovp@company.com", "+79602223355", 20000000, 45);
            employeesArray[2] = new StaffMember("Petrov Semen", "Chief Accounting Officer", "petrovs@company.com", "+79602223366", 10000000, 35);
            employeesArray[3] = new StaffMember("Romanova Mariia", "Developer", "romanovam@company.com", "+79602223377", 15000000, 30);
            employeesArray[4] = new StaffMember("Sokolova Anna", "Engineer", "sokolovaa@company.com", "+79602223388", 9000000, 41);
            // Написал стандартный цикл for по элементам массива employeesArray, но среда разработки упростила цикл до for each, я согласился :)
            for (StaffMember staffMember : employeesArray) {
                if (staffMember.getAge() > 40) {
                    staffMember.info();
                    System.out.println();
                }

            }
        }

    }

