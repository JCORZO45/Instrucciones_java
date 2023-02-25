import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {
        int i,n,proceso;
        proceso=1;
        i=1;
        JOptionPane.showMessageDialog(null, "Calcular factorial");
        n= Integer.parseInt(JOptionPane.showInputDialog("digita un número : "));
        
        while(i<=n){
            proceso=proceso*i;
            i++;



         }
         if(n>=0){
            JOptionPane.showMessageDialog(null,"El factorial de "+n+" es : "+proceso, "RESULTADOS", JOptionPane.PLAIN_MESSAGE);
         }
         else{
            JOptionPane.showMessageDialog(null,"Digite un numero positivo", "RESULTADOS", JOptionPane.ERROR_MESSAGE);
         }
        

    }
    
}
