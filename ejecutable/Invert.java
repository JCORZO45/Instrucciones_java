import javax.swing.JOptionPane;

public class Invert
{ 
    public static void main(String[] args) {
    int meses =0;
    double c1;
    double c2; 
    double c3; 
    JOptionPane.showMessageDialog(null, "Meses-inversion");
    c1 =Integer.parseInt(JOptionPane.showInputDialog(null, "Capital de Pedro: "));
    c2 =Integer.parseInt(JOptionPane.showInputDialog(null, "Capital de Juan: "));
    c3 =Integer.parseInt(JOptionPane.showInputDialog(null,"Inversión para el negocio: "));
    
    if(c1+c2==c3){
        JOptionPane.showMessageDialog(null, "ya cuentan con el dinero para la inversión");
    }

    while (c1 + c2 < c3){
    meses += 1;
    c1 *= 1.03;
    c2 *= 1.04;
    }
    JOptionPane.showMessageDialog(null, "los meses requeridos para la inversion son: " + meses);

    }

}