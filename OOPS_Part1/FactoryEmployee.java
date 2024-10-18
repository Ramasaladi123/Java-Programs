//. Create a subclass called FactoryEmployee, for all factory employees we need to store bus_no, emp_boards.Create a super class related to this subclass.
class EmployeeSuper
{
    private String EmpId;
    private String EmpName;
    public EmployeeSuper(String EmpId,String EmpName)
    {
        this.EmpId=EmpId;
        this.EmpName=EmpName;
    }
    public String getEmpId()
    {
   return EmpId;
    }
    public String getEmpName()
    {
        return EmpName;
    }
    public void displayDeatails()
    {
        System.out.println("Employee id : "+EmpId);
        System.out.println("EMployee Name : "+EmpName);
    }

}
public class FactoryEmployee extends EmployeeSuper {
    private String busNo,empBoardL;
    public FactoryEmployee(String EmpId,String EmpName,String busNo,String empBoardL)
    {
        super(EmpId,EmpName);
        this.busNo=busNo;
        this.empBoardL=empBoardL;
    }
    @Override
    public void displayDeatails()
    {
        super.displayDeatails();
        System.out.println("Bus number : "+busNo);
        System.out.println("Boarding Location : "+empBoardL);
    }
    public static void main(String[] args)
    {
        EmployeeSuper e1=new FactoryEmployee("s102", "rama", "AP102", "MVV City");
        e1.displayDeatails();
    }
}
