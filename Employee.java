import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Employee {
    int eNo;
    double eSalary;
    String eName;

    Employee(int no, double salary, String name) {
        eNo = no;
        eSalary = salary;
        eName = name;
    }

    static Employee read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int no = Integer.parseInt(br.readLine());
        String name = br.readLine();
        double salary = Double.parseDouble(br.readLine());
        return new Employee(no, salary, name);
    }

    public String toString() {
        return ("\nEmployee Details:-\nEmployee No.:\t"+ eNo +"\nName:\t"+ eName +"\nSalary:\t"+ eSalary);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the total number of employees: ");
        int n = Integer.parseInt(br.readLine());
        
        Employee[] employees = new Employee[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter no., name and salary of employee " + (i+1));
            employees[i] = read();
        }

        System.out.print("\nEnter the employee number:\t");
        int no = Integer.parseInt(br.readLine());
        boolean flag = false;
        for(Employee e: employees) {
            if(e.eNo == no) {
                flag = true;
                System.out.println(e.toString());
                break;
            }
        }

        if(!flag)
            System.out.println("There is no employee with employee number " + no);
    }
}
