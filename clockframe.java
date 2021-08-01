package clock;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
//import static java.awt.PageAttributes.MediaType.D;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
public class clockframe extends JFrame {
     
    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dateFormat;
    SimpleDateFormat dayFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String date;
    String day;
    
    clockframe(){
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setTitle("Berry Clok Program");
         this.setLayout(new FlowLayout());
         this.setSize(500, 500);
         //this.setResizable(false);
         this.setVisible(true);
         
         Border border = BorderFactory.createLineBorder(Color.yellow,5);         
         Border border2 = BorderFactory.createLineBorder(Color.cyan,5);
         timeFormat = new SimpleDateFormat("hh:mm:ss a  ");
         //System.getProperty("line.separator");
         dayFormat = new SimpleDateFormat("EEEE  ");
         dateFormat = new SimpleDateFormat("MMMMM/"+"\n"+"EE/YYYY ");
         //String dateFormat = date.format(date);
         
         timeLabel  = new JLabel();
         timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
         timeLabel.setForeground(new Color(0x00aa00));
         timeLabel.setBackground(Color.BLACK);  
         timeLabel.setBorder(border);
         timeLabel.setOpaque(true);      
                  
         dayLabel = new JLabel();
         dayLabel.setFont(new Font("Ink Free",Font.PLAIN,35));
         dayLabel.setForeground(new Color(0x00FF00));
         dayLabel.setVerticalAlignment(JLabel.BOTTOM);
         dayLabel.setHorizontalAlignment(JLabel.CENTER);
         dayLabel.setBackground(Color.BLACK);  
         dayLabel.setBorder(border2);
         dayLabel.setOpaque(true);
         
         
         
         dateLabel = new JLabel();
         dateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));
         dateLabel.setVerticalAlignment(JLabel.CENTER);
         dateLabel.setHorizontalAlignment(JLabel.CENTER);
         dateLabel.setOpaque(true);
         
         this.add(timeLabel);
         this.add(dayLabel);
         this.add(dateLabel);
         this.setVisible(true);
         
         
         setTime();
    }
     public void setTime(){
         while (true){
    time= timeFormat.format(Calendar.getInstance().getTime());
         timeLabel.setText(time);         
    day= dayFormat.format(Calendar.getInstance().getTime());
         dayLabel.setText(day);
         date= dateFormat.format(Calendar.getInstance().getTime());
         dateLabel.setText(date);
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException ex) {
                 Logger.getLogger(clockframe.class.getName()).log(Level.SEVERE, null, ex);
             }
         
         }}  
     }