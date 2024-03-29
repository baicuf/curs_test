package Tema7;

public class Qualification extends Teacher {
	
	public static void main(String[] args) { 
		
		Teacher teacher = new Teacher();
		teacher.setCourse("JAVA");
		teacher.setExperienceYears(9);
		teacher.setSchedule("Afternoon");
		
		verify(teacher);
		
	}

	private static void verify(Teacher teacher) {
		if(teacher.getCourse().equals("JAVA") && teacher.getExperienceYears()>3 && teacher.getSchedule().equals("Afternoon")) {
			System.out.println("You qualify to teach at this school!");
		} else {
			System.out.println("You do not qualify!");
			}
		
		}
		
	}
