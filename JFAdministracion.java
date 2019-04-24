
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class JFAdministracion extends JFrame
{
    private JPanel p1,p2,p3;
    private JLabel lblNombre,lblPropietario, lblArea, lblHabitantes, 
                   lblValorPagar;
    private JTextArea txtNombre, txtPropietario, txtArea, txtHabitantes,
                      txtValorPagar;
    private JButton btnBuscar, btnCalcular, btnLimpiar;
    private JCheckBox checkProntoPago, checkPlataforma;
    
    public JFAdministracion()
    {
        setTitle("Ejercicio de administración de condominio");
        setVisible(true);
        setSize(350,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());
        
        //Crear panel p1: "Dastos de propiedad"
        p1 = new JPanel();
        p1.setLayout(new GridLayout(5,2,5,5));
        p1.setPreferredSize(new Dimension(350,200));
        p1.setBackground(Color.pink);
        p1.setBorder(new TitledBorder("Datos de la propiedad"));
        
        //Crear panel p2: "Descuentos"
        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.setPreferredSize(new Dimension(350,100));
        p2.setBackground(Color.yellow);
        p2.setBorder(new TitledBorder("Decuentos"));
        
        //crear panel p3: "Calculos y resultados"
        p3 = new JPanel();
        p3.setLayout(new GridLayout(2,2,5,5));
        p3.setPreferredSize(new Dimension(350,100));
        p3.setBackground(Color.gray);
        p3.setBorder(new TitledBorder("Calculos y resultados"));
        
        //Añadir panel al formulario
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.SOUTH);
        
        //Crear los elementos gráficos del panel 1
        lblNombre = new JLabel("Nombre");
        lblPropietario = new JLabel("Propietario");
        lblArea = new JLabel("Área");
        lblHabitantes = new JLabel("Habitantes");
        lblValorPagar = new JLabel("Valor a pagar");
        
        txtNombre = new JTextArea("");
        txtArea = new JTextArea("");
        txtPropietario = new JTextArea("");
        txtHabitantes = new JTextArea("");
        txtValorPagar = new JTextArea("");
        
        btnBuscar = new JButton("Buscar");
        
        //Añadir elementos gráficos al panel 1
        p1.add(lblNombre);
        p1.add(txtNombre);
        p1.add(lblPropietario);
        p1.add(txtPropietario);
        p1.add(lblArea);
        p1.add(txtArea);
        p1.add(lblHabitantes);
        p1.add(txtHabitantes);
        p1.add(lblValorPagar);
        p1.add(txtValorPagar);
        
        p1.add(btnBuscar);
        
        //Crear los elementos gráficos del panel 2
        checkProntoPago = new JCheckBox("Pronto pago",false);
        checkPlataforma = new JCheckBox("Pago Plataforma",false);
        
        //Añadir elementos gráfuicos al panel 2
        p2.add(checkProntoPago);
        p2.add(checkPlataforma);
        
        //Crear los elementos gráficos del panel 3
        lblValorPagar = new JLabel("Valor a pagar($):");
        
        txtValorPagar = new JTextArea("");
        
        btnCalcular = new JButton("Calcular");
        btnLimpiar = new JButton("Limpiar");
        
        //Añadir los elementos gráficos al panel 3
        p3.add(lblValorPagar);
        p3.add(txtValorPagar);
        p3.add(btnCalcular);
        p3.add(btnLimpiar);
    }
}

