package homework;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConferenceTest {
    private Conference conference = new Conference(1000);
    private Student student = new Student("Mila", "Smilevski", Course.OTHER, 20);
    @Test
    public void calculateTotalPricePaidForOneOfEach(){
        conference.addAttendeeToConference(new Student("Ana", "Stojmenovska", Course.EMT, 22));
        conference.addAttendeeToConference(new Student("Alek", "Jovanovski", Course.WEB, 21));
        conference.addAttendeeToConference(new Student("Evgenija", "Smilevska", Course.OTHER, 20));

        double price = conference.calculateTotalPricePaid();
        assertEquals(5.45 + 7.63 + 10.90, price,0);
    }

    @Test
    public void addAttendeeToConferenceNoCapacity(){
        student.setAge(student.getAge()+1);
        student.setName(student.getName()+"n");
        student.setSurname(student.getSurname()+"");
        student.setCourse(Course.OS);

        for(int i = 1; i<=10000; i++){
            conference.addAttendeeToConference(student);
        }

        assertEquals(false,conference.addAttendeeToConference(student));
    }

    @Test
    public void addAttendeeToConferenceTripleCapacity(){
        for(int i = 1; i<=conference.getCapacity(); i++){
            conference.addAttendeeToConference(student);
        }

        assertEquals(true,conference.addAttendeeToConference(student));
    }

    @Test
    public void getAttendeesTest(){
        assertEquals(conference.getAttendees(),conference.getAttendees());
    }

    @Test
    public void printStudent(){
        String s = "Student{" +
                "name='" + "Mila" + '\'' +
                ", surname='" + "Smilevski" + '\'' +
                ", course=" + Course.OTHER +
                ", age=" + 20 +
                '}';
        assertEquals(s,student.toString());
    }




}