package tugasGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FormDaftarUlang extends JFrame{
    private JLabel lbJudul, lbNamaLengkap, lbTanggalLahir, lbNomorPendaftaran, lbNoTelp, lbAlamat, lbEmail;
    private JTextField txtNamaLengkap, txtTanggalLahir, txtNomorPendaftaran, txtNoTelp, txtEmail; 
    private JTextArea txtAlamat;
    private JButton btnSubmit;

    public FormDaftarUlang(){

        setTitle("Formulir Pendaftaran Ulang Mahasiswa");
        setLayout(null);
        setSize(570, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        lbJudul = new JLabel("Formulir Pendaftaran Ulang Mahasiswa");
        lbJudul.setFont(new Font("Arial", Font.BOLD, 20));
        add(lbJudul);
        
        lbNamaLengkap = new JLabel("Nama Lengkap");
        add(lbNamaLengkap);
        
        lbTanggalLahir = new JLabel("Tanggal Lahir");
        add(lbTanggalLahir);
        
        lbNomorPendaftaran = new JLabel("Nomor Pendaftaran");
        add(lbNomorPendaftaran);
        
        lbNoTelp = new JLabel("Nomor Telepon");
        add(lbNoTelp);
       
        lbAlamat = new JLabel("Alamat");
        add(lbAlamat);
        
        lbEmail = new JLabel("Email");
        add(lbEmail);
        
        txtNamaLengkap = new JTextField();
        add(txtNamaLengkap);

        txtTanggalLahir = new JTextField();
        add(txtTanggalLahir);

        txtNomorPendaftaran = new JTextField();
        add(txtNomorPendaftaran);

        txtNoTelp = new JTextField();
        add(txtNoTelp);

        txtAlamat = new JTextArea();
        add(txtAlamat);

        txtEmail = new JTextField();
        add(txtEmail);

        btnSubmit = new JButton("Submit");
        add(btnSubmit);

        lbJudul.setBounds(100, 10, 700, 20);
        lbNamaLengkap.setBounds(115, 50, 100, 20);
        lbTanggalLahir.setBounds(115, 80, 100, 20);
        lbNomorPendaftaran.setBounds(115, 110, 150, 20);
        lbNoTelp.setBounds(115, 140, 100, 20);
        lbAlamat.setBounds(115, 170, 100, 20);
        lbEmail.setBounds(115, 230, 100, 20);

        txtNamaLengkap.setBounds(250, 50, 200, 20);
        txtTanggalLahir.setBounds(250, 80, 200, 20);
        txtNomorPendaftaran.setBounds(250, 110, 200, 20);
        txtNoTelp.setBounds(250, 140, 200, 20);
        txtAlamat.setBounds(250, 170, 200, 50);
        txtEmail.setBounds(250, 230, 200, 20);
        btnSubmit.setBounds(235, 290, 100, 20);
        

        btnSubmit.addActionListener(new ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent e){
                if(isInputValid()){
                    int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah data yang anda masukkan sudah benar?", "Konfirmasi Data", JOptionPane.YES_NO_OPTION);
                    boolean windowKonfirmasi = true;
                    if (konfirmasi != JOptionPane.YES_OPTION) {
                        windowKonfirmasi = false;
                    }else if(windowKonfirmasi){
                        JOptionPane.showMessageDialog(null, "Data mahasiswa baru berhasil disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                        outputForm();
                        clearForm();
                }} else {
                    JOptionPane.showMessageDialog(null, "Terdapat data yang belum diisi, silakan lengkapi data mahasiswa baru terlebih dahulu", "Informasi", JOptionPane.INFORMATION_MESSAGE) ;
                }
                
            }
        }
        );

    }

    public boolean isInputValid() {
        return !txtNamaLengkap.getText().isEmpty() 
        && !txtTanggalLahir.getText().isEmpty() 
        && !txtNomorPendaftaran.getText().isEmpty() 
        && !txtNoTelp.getText().isEmpty() 
        && !txtAlamat.getText().isEmpty() 
        && !txtEmail.getText().isEmpty();
    }

    public void clearForm(){
        txtNamaLengkap.setText("");
        txtTanggalLahir.setText("");
        txtNomorPendaftaran.setText("");
        txtNoTelp.setText("");
        txtAlamat.setText("");
        txtEmail.setText("");
    }

    public void outputForm(){
        JFrame frame = new JFrame();

        frame.setTitle("Data Mahasiswa Baru");
        frame.setLayout(null);
        frame.setSize(350,400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        JLabel lbJudul = new JLabel("Data Mahasiswa Baru");
        lbJudul.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(lbJudul);

        JLabel lbNamaLengkap = new JLabel("Nama Lengkap: " + txtNamaLengkap.getText());
        frame.add(lbNamaLengkap);

        JLabel lbTanggalLahir = new JLabel("Tanggal Lahir: " + txtTanggalLahir.getText());
        frame.add(lbTanggalLahir);

        JLabel lbNomorPendaftaran = new JLabel("Nomor Pendaftaran: " + txtNomorPendaftaran.getText());
        frame.add(lbNomorPendaftaran);

        JLabel lbNoTelp = new JLabel("Nomor Telepon: " + txtNoTelp.getText());
        frame.add(lbNoTelp);

        JLabel lbAlamat = new JLabel("Alamat: " + txtAlamat.getText());
        frame.add(lbAlamat);

        JLabel lbEmail = new JLabel("Email: " + txtEmail.getText());
        frame.add(lbEmail);

        lbJudul.setBounds(90, 10, 700, 20);
        lbNamaLengkap.setBounds(10, 50, 200, 20);
        lbTanggalLahir.setBounds(10, 80, 200, 20);
        lbNomorPendaftaran.setBounds(10, 110, 200, 20);
        lbNoTelp.setBounds(10, 140, 200, 20);
        lbAlamat.setBounds(10, 170, 200, 20);
        lbEmail.setBounds(10, 200, 200, 20);
    }
}
