

import java.util.Scanner;

public class resumeBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		String [] resume =buildResume();
		
		System.out.println("My name is "+resume[0]);
		System.out.println("My contact information is "+resume[1]);
		System.out.println(resume[2]);
		System.out.println("My Experience is "+resume[3]);
		System.out.println("My skill is "+resume[4]);
		
	}
	
	public static String getName() {
		Scanner scanner = new Scanner(System.in);
		String first_name= new String();
		String last_name= new String();
		System.out.println("Enter your first name");
		first_name= scanner.next();
		System.out.println("Enter your last name");
		last_name = scanner.next();
		String name= first_name + " "+last_name;
		return name;
	}

	public static String getContactinfo( ) {
		Scanner scanner = new Scanner(System.in);
		String contact_info=new String();
		System.out.println("Enter your contact information");
		contact_info=scanner.next();
		return contact_info;
	}
	
	public static String getEducation( ) {
		Scanner scanner = new Scanner(System.in);
		String school= new String();
		String major= new String();
		String graduation_year=new String();
		String total=school+major+graduation_year;
		
		System.out.println("Enter your school");
		school = scanner.next();
		
		System.out.println("Enter your major");
		major = scanner.next();
		
		System.out.println("Enter your graduation year");
		graduation_year = scanner.next();
		
		return "School; " +school+" "+"Major;"+major+" "+"Graduation year;"+graduation_year;
	}
	
	public static String getWorkExperience( ) {
		Scanner scanner = new Scanner(System.in);
		String work_experience= new String();
		System.out.println("Enter your work experience");
		work_experience=scanner.next();
		return work_experience;
	}
	public static String getSkills() {
		Scanner scanner = new Scanner(System.in);
		String skills =new String();
		System.out.println("Enter your skills");
		skills=scanner.next();
		return skills;
	}
	
	public static String[] buildResume() {

		String [] resume= {getName(),getContactinfo( ),getEducation(),getWorkExperience(),getSkills()};
		return resume;
	}
}

