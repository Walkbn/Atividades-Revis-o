import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class InformarHora {
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("Como você se chama?");
        int answer;
        answer = JOptionPane.showConfirmDialog(null, "Deseja ver as horas atual?");
        if (answer == JOptionPane.YES_OPTION) {
            LocalTime now = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String FormattedHour = now.format(formatter);
            JOptionPane.showMessageDialog(null, name + " O horário atual é: " + FormattedHour, "Horas: ", answer);
        } else {
            JOptionPane.showMessageDialog(null, "Estamos partindo! " + name, "Saindo!", answer);
        }
    }
}
