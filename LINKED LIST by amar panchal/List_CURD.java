import java.util.*;

class ENode {

    int empId;
    String name;
    String gender;
    double salary;
    ENode next;

    public ENode(int empId, String name, String gender, double salary) {
        this.empId = empId;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.next = null;
    }

}

public class List_CURD {

    ENode root, last;

    void createList() {
        root = last = null;// root is not created but assigned
    }

    void insertInNode(int empId, String name, String gender, double salary) {
        ENode n = new ENode(empId, name, gender, salary);// created node
        if (root == null)// not created
        {
            root = last = n;// 1st one assigned as root
        } else {
            last.next = n;// 1
            last = n;// 2
        }
        System.out.println("Inserted");
    }

    void search(int empId) {
        if (root == null)// not created
        {
            System.out.println("EMPTY");

        } else {
            ENode t = root;
            while (t != null) {
                if (t.empId == empId) {
                    System.out.println("FOUND");
                    System.out.println("EMP ID : " + t.empId);
                    System.out.println("NAME : " + t.name);
                    System.out.println("GENDER : " + t.gender);
                    System.out.println("SALARY : " + t.salary);
                    break;
                }
                t = t.next;
            }
            if (t == null) {
                System.out.println("Not Found:");
            }

        }
    }

    void update(int empId) {
        if (root == null)// not created
        {
            System.out.println("EMPTY");

        } else {
            ENode t = root;
            while (t != null) {
                if (t.empId == empId) {
                    System.out.println("FOUND OLD DATA");
                    System.out.println("EMP ID : "+t.empId);
                    System.out.println("NAME : "+t.name);
                    System.out.println("GENDER : "+t.gender);
                    System.out.println("SALARY : "+t.salary);
                    Scanner in = new Scanner(System.in);
                    System.out.println("1.update name 2.update gender 3.update salary");
                    int option = in.nextInt();
                    if(option==1){
                        System.out.println("ENTER NEW NAME");
                        t.name=in.next();
                    }

                    else if(option==2){
                        System.out.println("ENTER NEW GENDER");
                        t.gender=in.next();
                    }

                    else if(option==3){
                        System.out.println("ENTER NEW SALARAY");
                        t.salary=in.nextInt();
                    }

                    else{
                        System.out.println("WRONG INPUT");
                    }
                    break;
                }
                t = t.next;
            }
            if (t == null) {
                System.out.println("Not Found:");
            }

        }
        
    }

    public static void main(String[] args) {
        List_CURD obj = new List_CURD();
        int ch;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.ADD");
            System.out.println("2.SEARCH");
            System.out.println("3.UPDATE");
            System.out.println("4.DELETE");
            System.out.println("0.EXIT");
            System.out.println("ENTER CHOICE");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("------ENTER INFO------");
                    System.out.print("EMP ID :");
                    int e = sc.nextInt();
                    System.out.print("NAME :");
                    String s = sc.next();
                    System.out.print("GENDER :");
                    String c = sc.next();
                    System.out.print("SALARY :");
                    double d = sc.nextDouble();

                    obj.insertInNode(e, s, c, d);

                    break;
                case 2:
                    System.out.println("ENTER EMP ID TO SEARCH");
                    int es = sc.nextInt();
                    obj.search(es);

                    break;
                case 3:
                    System.out.println("UPDATE");
                    int up = sc.nextInt();
                    obj.search(up);
                    break;

                case 0:
                    System.out.println("Thanks for using the code\n");
                    break;

                default:
                    break;
            }
        } while (ch != 0);

    }

}
