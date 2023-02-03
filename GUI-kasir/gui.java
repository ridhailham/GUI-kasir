import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class gui {
    public static void main(String[] args){
        JFrame Frame = new JFrame("Program Pembayaran");
        JPanel panel = new JPanel();
        Frame.setSize(500, 500);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.add(panel);
        Frame.setLocationRelativeTo(null);
        panel.setBackground(Color.getHSBColor(100,40,70));
        panel.setLayout(null);

        JLabel judul = new JLabel("Toko Tiap Hari Mandi");
        judul.setBounds(180,20,1000,50);
        panel.add(judul);

        JLabel label1 = new JLabel("Masukkan nama Anda");
        label1.setBounds(180,50,1000,50);
        panel.add(label1);

        JTextField nama = new JTextField();
        nama.setBounds(170,90,150,25);
        nama.setBackground(Color.getHSBColor(180,20,90));
        panel.add(nama);

        JLabel label2 = new JLabel("Masukkan jumlah sikat gigi yang dibeli");
        label2.setBounds(150,110,1000,50);
        panel.add(label2);

        JTextField sikatgigi = new JTextField();
        sikatgigi.setBounds(170,150,150,25);
        sikatgigi.setBackground(Color.getHSBColor(180,20,90));
        panel.add(sikatgigi);

        JLabel label3 = new JLabel("Masukkan jumlah facial foam yang dibeli");
        label3.setBounds(150,170,1000,50);
        panel.add(label3);

        JTextField Facialoam = new JTextField();
        Facialoam.setBounds(170,210,150,25);
        Facialoam.setBackground(Color.getHSBColor(180,20,90));
        panel.add(Facialoam);

        JLabel label4 = new JLabel("Masukkan jumlah alat cukur yang dibeli");
        label4.setBounds(150,230,1000,50);
        panel.add(label4);

        JTextField Alatcukur = new JTextField();
        Alatcukur.setBounds(170,270,150,25);
        Alatcukur.setBackground(Color.getHSBColor(180,20,90));
        panel.add(Alatcukur);

        JLabel ket1 = new JLabel("*Keterangan");
        ket1.setBounds(70,300,1000,50);
        panel.add(ket1);

        JLabel ket2 = new JLabel("Harga sikat gigi = Rp.21.000");
        ket2.setBounds(70,320,1000,50);
        panel.add(ket2);

        JLabel ket3 = new JLabel("Harga facial foam = Rp.15.000");
        ket3.setBounds(70,340,1000,50);
        panel.add(ket3);

        JLabel ket4 = new JLabel("Harga alat cukur = Rp. 4.500");
        ket4.setBounds(70,360,1000,50);
        panel.add(ket4);

        JButton submit = new JButton("Submit");
        submit.setBackground(Color.getHSBColor(30,88,70));
        submit.setBorderPainted(true);
        submit.setForeground(Color.black);
        submit.setBounds(210,300,80,20);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name;
                int barang1, barang2, barang3;
              int subtotal1, subtotal2, subtotal3;
                name = nama.getText();
                barang1 = Integer.parseInt(sikatgigi.getText());
                barang2 = Integer.parseInt(Facialoam.getText());
                barang3 = Integer.parseInt(Alatcukur.getText());

                subtotal1 = barang1*21000;
                subtotal2 = barang2*15000;
                subtotal3 = barang3*4500;
                JFrame Frame2 = new JFrame("Struck");
                JPanel panel2 = new JPanel();
                Frame2.setSize(500,500);
                Frame2.add(panel2);
                Frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                panel2.setBackground(Color.getHSBColor(100,40,70));
                Frame2.setLocationRelativeTo(null);
                panel2.setLayout(null);

                JLabel baru1 = new JLabel("Toko Tiap Hari Mandi");
                baru1.setBounds(180,100,1000, 25);
                panel2.add(baru1);

                JLabel baru2 = new JLabel("===============================================");
               baru2.setBounds(70,120, 1000,25);
                panel2.add(baru2);

                JLabel baru3 = new JLabel("Nama pelanggan : " + " " +name);
                baru3.setBounds(90,140,1000,25);
                panel2.add(baru3);

                JLabel jumlah1 = new JLabel("Sikat gigi");
                jumlah1.setBounds(90,160,1000,50);
                JLabel sub1 = new JLabel(barang1 + " x " + "21000");
                sub1.setBounds(90,180,1000,50);
                JLabel sub12 = new JLabel("Rp."+ subtotal1);
                sub12.setBounds(350,180,1000,50);

                JLabel jumlah2 = new JLabel("Facial foam");
                jumlah2.setBounds(90,200,1000,50);
                JLabel sub2 = new JLabel(barang2 + "x" + "15000");
                sub2.setBounds(90,220,1000,50);
                JLabel sub22 = new JLabel("Rp."+ subtotal2);
                sub22.setBounds(350,220,1000,50);


                JLabel jumlah3 = new JLabel("Alat cukur ");
                jumlah3.setBounds(90,240,1000,50);
                JLabel sub3 = new JLabel(barang3 + "x" + "4500");
                sub3.setBounds(90,260,1000,50);
                JLabel sub32 = new JLabel("Rp." + subtotal3);
                sub32.setBounds(350,260,1000,50);


                JLabel baru4 = new JLabel("===============================================");
                baru4.setBounds(70,289,1000,50);
                JLabel subtotal = new JLabel("Subtotal :"+ "  " + "Rp." + (subtotal1+subtotal2+subtotal3));
                subtotal.setBounds(90,300,1000,50);

                JLabel diskon = new JLabel("Diskon 25 %");
                diskon.setBounds(90,320,1000,50);

                JLabel total = new JLabel("Total        :" + "  " + "Rp." + ((subtotal1+subtotal2+subtotal3)-((subtotal1+subtotal2+subtotal3)*0.25)));
                total.setBounds(90,340,1000,50);

                JLabel corp = new JLabel("PT. Bisa Cumloude");
                corp.setBounds(200,400,1000,50);

                panel2.add(jumlah1);
                panel2.add(sub1);
                panel2.add(sub12);
                panel2.add(jumlah2);
                panel2.add(sub2);
                panel2.add(sub22);
                panel2.add(jumlah3);
                panel2.add(sub3);
                panel2.add(sub32);
                panel2.add(baru4);
                panel2.add(subtotal);
                panel2.add(diskon);
                panel2.add(total);
                panel2.add(corp);


                JButton return1 = new JButton("Return");
                return1.setSize(50,50);
                return1.setBackground(Color.getHSBColor(30,80,70));
                return1.setBorderPainted(false);
                return1.setForeground(Color.black);
                return1.setBounds(90,380,100,25);
                return1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Frame.setVisible(true);
                        Frame2.setVisible(false);
                    }
                });

                panel2.add(return1);

                Frame2.setVisible(true);
                Frame.setVisible(false);
            }
        });
        panel.add(submit);

        Frame.setVisible(true);

    }
}