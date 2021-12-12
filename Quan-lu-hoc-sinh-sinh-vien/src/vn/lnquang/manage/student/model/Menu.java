package vn.lnquang.manage.student.model;

//import vn.lnquang.manage.student.views.InstructorManagement;
import vn.lnquang.manage.student.views.View;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Menu--------");
            System.out.println("Vui long chon chuc nang");
            System.out.println("1. Quản lí danh sách sinh viên hiện có.");
            System.out.println("2. Quản lí danh sách giảng viên hiện có.");
            System.out.println("3. Quản lí lớp học.");
            System.out.println("0. Ket thuc chuong trinh.");
            System.out.println("Nhap so: ");
            try {
                int choice = Integer.parseInt(scanner.next());
                if (choice > 0 && choice < 4) {
                    switch (choice) {
                        case 1:
                        studentManager();
                            break;
                        case 2:
                        instructorManager();
                            break;
                        case 3:
                        classRoomManager();
                            break;
                    }
                } else if (choice == 0) {
                    System.out.println("tam biet");
                    break;
                } else
                    System.out.println("nhap tu 0-3");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
            while (true);

    }

    public static void studentManager(){
        View view = new View();
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Menu--------");
            System.out.println("Vui long chon chuc nang");
            System.out.println("1. Thêm sinh viên vào danh sách");
            System.out.println("2. Hiển thị danh sách sinh viên hiện có.");
            System.out.println("3. Kiểm tra danh sách sinh viên có rỗng không.");
            System.out.println("4. Đếm số lượng sinh viên trong danh sách");
            System.out.println("5. Reset danh sách sinh viên");
            System.out.println("6. Kiểm tra sinh viên trong danh sách bằng MSV ");
            System.out.println("7. Xoá sinh viên ra khỏi danh sách bằng MSV");
            System.out.println("8. Tìm sinh viên theo tên.");
            System.out.println("9. Sắp xếp sinh viên theo điểm từ cao đến thấp");
            System.out.println("10. Ghi dữ liệu sinh viên ra file ");
            System.out.println("0. Ket thuc chuong trinh.");
            System.out.println("Nhap so: ");
            try {
//                int choice = Integer.parseInt(scanner.next());
                int choice = scanner.nextInt();
                if (choice > 0 && choice < 12) {
                    switch (choice) {
                        case 1:
                        view.addStudentIntoList();

                            break;
                        case 2:
                        view.showStudentList();
                            break;
                        case 3:
                            view.checkStudentList();
                            break;
                        case 4:
                            view.printQuantity();
                            break;
                        case 5:
                            view.resetStudentList();
                            break;
                        case 6:
                            view.checkStudentInList();
                            break;
                        case 7:
                            view.checkRemove();
                            break;
                        case 8:
                            view.checkStudentByName();
                            break;
                        case 9:
                            view.sortStudentList();
                            break;
                        case 10:
                            view.WriteStudentList();
                            break;
                    }
                } else if (choice == 0) {
                    System.out.println("tam biet");
                    break;
                } else
                    System.out.println("nhap tu 0-11");

            } catch (Exception e) {
                System.err.println("Yêu cầu nhập số");
            }
        }
        while (true);
    }
    public static void instructorManager(){
        Scanner scanner = new Scanner(System.in);
        View view = new View();
        do {

            System.out.println("Menu--------");
            System.out.println("Vui long chon chuc nang");
            System.out.println("1. Thêm giảng viên vào danh sách");
            System.out.println("2. Hiển thị danh sách giảng viên hiện có.");
            System.out.println("3. Kiểm tra danh sách giảng viên có rỗng không.");
            System.out.println("4. Đếm số lượng giảng viên trong danh sách");
            System.out.println("5. Reset danh sách giảng viên");
            System.out.println("6. Tìm giảng viên theo tên.");
            System.out.println("7. Ghi Giảng viên vào file");
            System.out.println("0. Ket thuc chuong trinh.");
            System.out.println("Nhap so: ");
            try {
                int choice = Integer.parseInt(scanner.next());
                if (choice > 0 && choice < 8) {
                    switch (choice) {
                        case 1:
                            view.addInstructorIntoList();
                            break;
                        case 2:
                            view.showInstructorList();
                            break;
                        case 3:
                            view.checkInstructorList();
                            break;
                        case 4:
                            view.printInstructorQuantity();
                            break;
                        case 5:
                            view.resetInstructorList();
                            break;
                        case 6:
                            view.checkInstructorByName();
                            break;
                        case 7:
                            view.WriteInstructorList();
                            break;
                    }
                } else if (choice == 0) {
                    System.out.println("tam biet");
                    break;
                } else
                    System.out.println("nhap tu 0-7");

            } catch (Exception e) {
                System.err.println("yeu cau nhap so");
            }
        }
        while (true);
    }

    public static void classRoomManager(){
        Scanner scanner = new Scanner(System.in);
        View view = new View();
        do {

            System.out.println("Menu--------");
            System.out.println("Vui long chon chuc nang");
            System.out.println("1.Tạo lớp học");
            System.out.println("2. Thêm giảng viên vào lớp học mình muốn");
            System.out.println("3. Thêm sinh viên vào lớp học mình muốn.");
            System.out.println("4. Hiển thị thông tin lớp học theo ID");

            System.out.println("0. Ket thuc chuong trinh.");
            System.out.println("Nhap so: ");
            try {
                int choice = Integer.parseInt(scanner.next());
                if (choice > 0 && choice < 5) {
                    switch (choice) {
                        case 1:
                            view.createClassRoom();
                            break;
                        case 2:
                            view.addInstructorIntoClass();
                            break;
                        case 3:
                            view.addStudentIntoClass();
                            break;
                        case 4:
                            view.getClassInformation();
                            break;
                    }
                } else if (choice == 0) {
                    System.out.println("tam biet");
                    break;
                } else
                    System.out.println("nhap tu 0-4");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (true);
    }
    }

