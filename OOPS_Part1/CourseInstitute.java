/*Create a class Student that stores the details like admin_no, stu_name, course_joined and fees_paid.
—> Courses are: JAVA, PYTHON.
—> The total fees for java is 10k and for python is 7.5k.
—> Provide a constructor to take required details.The default course is JAVA.
—> Provide the following methods: getTotalFee(), getDue(), getFeePaid(), payment(amount).*/
public class CourseInstitute {
    private String admin_no;
    private String stu_name;
    private String course_joined;
    private double fees_paid;
    public static final double javaFee=10000;
    public static final double pythonFee=7500;
    public CourseInstitute(String admin_no,String stu_name,double fees_paid)
    {
        this(admin_no,stu_name,"JAVA",fees_paid);
    }public CourseInstitute(String admin_no,String stu_name,String course_joined,double fees_paid)
    {
        this.admin_no=admin_no;
        this.stu_name=stu_name;
        this.course_joined=course_joined.toUpperCase();
        this.fees_paid=fees_paid;
    }
    public double  getTotalFee()
    {
        if(course_joined.equals("JAVA"))
        {
            return javaFee;
        }
        else if(course_joined.equals("PYTHON"))
        {
            return pythonFee;
        }
        else
        {
            System.out.println("Course not available");
            return 0;
        }
    }
    public double getDue()
    {
        return getTotalFee()-fees_paid;
    }
    public double getFeePaid()
    {
        return fees_paid;
    }
    public void payment(double amount)
    {
        if(amount<0)
        {
            System.out.println("Amount should be positive");
        }
        else if(fees_paid+amount>getTotalFee())
        {
            System.out.println("Amount exceeds");
        }
        else{
            fees_paid+=amount;
            System.out.println("payment of "+amount+" made successful");
        }
    }
    public static void main(String[] args)
    {
        CourseInstitute c1=new CourseInstitute("a102","rama",3000);
        System.out.println("Total fee for "+c1.course_joined+":"+c1.getTotalFee());
        System.out.println("Fee paid : "+c1.getFeePaid());
        System.out.println("Due : "+c1.getDue());
        c1.payment(1000);
        System.out.println("Updated Due : "+c1.getDue());

        CourseInstitute c2=new CourseInstitute("a170","ram","Python",1500);
        System.out.println("Total fee for "+c2.course_joined+":"+c2.getTotalFee());
        System.out.println("Fee paid : "+c2.getFeePaid());
        System.out.println("Due : "+c2.getDue());
        c2.payment(3000);
        System.out.println("Updated due : "+c2.getDue());
    }
}
