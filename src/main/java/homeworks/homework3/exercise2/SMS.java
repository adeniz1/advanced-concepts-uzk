package homeworks.homework3.exercise2;

public class SMS extends Message{
    
        public String getType() {
            return "SMS";
        }
    
        public void send() {
            System.out.println("SMS");
        }
    
}
