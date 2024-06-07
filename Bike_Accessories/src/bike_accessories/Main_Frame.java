package bike_accessories;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.net.URI;
import java.sql.*;
import java.util.Random;
import java.util.regex.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Main_Frame extends javax.swing.JFrame {

    public int mousex, mousey;
    double quantity, price, total, discount, bill;

    public Main_Frame() {
        initComponents();
        ImageIcon i1 = new ImageIcon(getClass().getResource("/dashboard_img/logo.png"));
        setIconImage(i1.getImage());
        tab1.setVisible(true);
        tab2.setVisible(false);
        tab3.setVisible(false);
        tab4.setVisible(false);
        tab5.setVisible(false);
        tab6.setVisible(false);
        tab7.setVisible(false);
        dashaddcustomer.setVisible(false);
        dashdealer.setVisible(false);
        dashaccessories.setVisible(false);
        dashpurchase.setVisible(false);
        dashsale.setVisible(false);
        dashcart.setVisible(false);
        dashreport.setVisible(false);
        dashsetting.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
        billtable.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator7 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        gendergroup = new javax.swing.ButtonGroup();
        mainpanel = new javax.swing.JPanel();
        contentpanel = new javax.swing.JPanel();
        tab1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        bajajlbl = new javax.swing.JLabel();
        bmwlbl = new javax.swing.JLabel();
        kawasakilbl = new javax.swing.JLabel();
        royal_enfieldlbl = new javax.swing.JLabel();
        hondalbl = new javax.swing.JLabel();
        ktmlbl = new javax.swing.JLabel();
        tab2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        centerpanel = new javax.swing.JPanel();
        dash1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        dash9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        dash7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        dash4 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        dash3 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        dash5 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        dash8 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        dash2 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        tab3 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        brandroyalenfield = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        brandbmw = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        brandktm = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        brandkawasaki = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        brandbajaj = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        brandhonda = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        tab4 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel22 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        tab5 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        jPanel40 = new javax.swing.JPanel();
        offercart1 = new javax.swing.JPanel();
        jLabel346 = new javax.swing.JLabel();
        offern1 = new javax.swing.JLabel();
        jLabel347 = new javax.swing.JLabel();
        offerq1 = new javax.swing.JComboBox<>();
        offeradd1 = new javax.swing.JButton();
        jLabel348 = new javax.swing.JLabel();
        offerp1 = new javax.swing.JLabel();
        offercart2 = new javax.swing.JPanel();
        jLabel337 = new javax.swing.JLabel();
        offern2 = new javax.swing.JLabel();
        jLabel338 = new javax.swing.JLabel();
        offerq2 = new javax.swing.JComboBox<>();
        offeradd2 = new javax.swing.JButton();
        jLabel339 = new javax.swing.JLabel();
        offerp2 = new javax.swing.JLabel();
        offercart3 = new javax.swing.JPanel();
        jLabel340 = new javax.swing.JLabel();
        offern3 = new javax.swing.JLabel();
        jLabel341 = new javax.swing.JLabel();
        offerq3 = new javax.swing.JComboBox<>();
        offeradd3 = new javax.swing.JButton();
        jLabel342 = new javax.swing.JLabel();
        offerp3 = new javax.swing.JLabel();
        offercart4 = new javax.swing.JPanel();
        jLabel343 = new javax.swing.JLabel();
        offern4 = new javax.swing.JLabel();
        jLabel344 = new javax.swing.JLabel();
        offerq4 = new javax.swing.JComboBox<>();
        offeradd4 = new javax.swing.JButton();
        jLabel345 = new javax.swing.JLabel();
        offerp4 = new javax.swing.JLabel();
        offercart5 = new javax.swing.JPanel();
        jLabel349 = new javax.swing.JLabel();
        offern5 = new javax.swing.JLabel();
        jLabel350 = new javax.swing.JLabel();
        offerq5 = new javax.swing.JComboBox<>();
        offeradd5 = new javax.swing.JButton();
        jLabel351 = new javax.swing.JLabel();
        offerp5 = new javax.swing.JLabel();
        offercart6 = new javax.swing.JPanel();
        jLabel334 = new javax.swing.JLabel();
        offern6 = new javax.swing.JLabel();
        jLabel335 = new javax.swing.JLabel();
        offerq6 = new javax.swing.JComboBox<>();
        offeradd6 = new javax.swing.JButton();
        jLabel336 = new javax.swing.JLabel();
        offerp6 = new javax.swing.JLabel();
        tab6 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        tab7 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        dashaddcustomer = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        backcustomer = new javax.swing.JLabel();
        applicationid = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        customerage = new javax.swing.JTextField();
        customerfullname = new javax.swing.JTextField();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        customersubmit = new javax.swing.JButton();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        others = new javax.swing.JRadioButton();
        customerpincode = new javax.swing.JTextField();
        customeraddress = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        customermobile = new javax.swing.JTextField();
        customeremail = new javax.swing.JTextField();
        customeraadhar = new javax.swing.JTextField();
        customercity = new javax.swing.JTextField();
        jLabel128 = new javax.swing.JLabel();
        customerclear = new javax.swing.JButton();
        customergendererror = new javax.swing.JLabel();
        customerdoberror = new javax.swing.JLabel();
        customeraadharerror = new javax.swing.JLabel();
        customeremailerror = new javax.swing.JLabel();
        customernameerror = new javax.swing.JLabel();
        customerageerror = new javax.swing.JLabel();
        customermobileerror = new javax.swing.JLabel();
        customeraddresserror = new javax.swing.JLabel();
        customercityerror = new javax.swing.JLabel();
        customerpincodeerror = new javax.swing.JLabel();
        customerdob = new com.toedter.calendar.JDateChooser();
        dashdealer = new javax.swing.JPanel();
        jLabel138 = new javax.swing.JLabel();
        backdealer = new javax.swing.JLabel();
        dealerid = new javax.swing.JTextField();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        dealerfullname = new javax.swing.JTextField();
        jLabel145 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        dealersubmit = new javax.swing.JButton();
        dealerpincode = new javax.swing.JTextField();
        dealeraddress = new javax.swing.JTextField();
        jLabel148 = new javax.swing.JLabel();
        dealermobile = new javax.swing.JTextField();
        dealeremail = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        dealeragencyname = new javax.swing.JTextField();
        dealercity = new javax.swing.JTextField();
        jLabel150 = new javax.swing.JLabel();
        dealerclear = new javax.swing.JButton();
        dealeremailerror = new javax.swing.JLabel();
        dealeragencyerror = new javax.swing.JLabel();
        dealernameerror = new javax.swing.JLabel();
        dealermobileerror = new javax.swing.JLabel();
        dealeraddresserror = new javax.swing.JLabel();
        dealercityerror = new javax.swing.JLabel();
        dealerpincodeerror = new javax.swing.JLabel();
        dashaccessories = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        backaccessories = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        accessoryid = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        accbrand = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        accbrandmodel = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        accaccessoryname = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        accaccessoryprice = new javax.swing.JTextField();
        accsubmit = new javax.swing.JButton();
        accclear = new javax.swing.JButton();
        accbranderror = new javax.swing.JLabel();
        accpriceerror = new javax.swing.JLabel();
        accmodelerror = new javax.swing.JLabel();
        accaccessoryerror = new javax.swing.JLabel();
        dashpurchase = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        backpurchase = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        puragencyname = new javax.swing.JTextField();
        purbrand = new javax.swing.JTextField();
        purprice = new javax.swing.JTextField();
        purbrandmodel = new javax.swing.JTextField();
        purbill = new javax.swing.JTextField();
        puraccessoryname = new javax.swing.JTextField();
        purdealerid = new javax.swing.JComboBox<>();
        jLabel129 = new javax.swing.JLabel();
        puraccessoryid = new javax.swing.JComboBox<>();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        purbuy = new javax.swing.JButton();
        purquantity = new javax.swing.JComboBox<>();
        jLabel152 = new javax.swing.JLabel();
        purdiscount = new javax.swing.JTextField();
        purquantityerror = new javax.swing.JLabel();
        purdiscounterror = new javax.swing.JLabel();
        purpriceerror = new javax.swing.JLabel();
        purdealeriderror = new javax.swing.JLabel();
        puraccessoryiderror = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        purchaseid = new javax.swing.JTextField();
        jLabel165 = new javax.swing.JLabel();
        purbuyerror = new javax.swing.JLabel();
        dashsale = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        backsale = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        saleid = new javax.swing.JTextField();
        salecustomerid = new javax.swing.JComboBox<>();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        salepurchaseid = new javax.swing.JComboBox<>();
        salecustomername = new javax.swing.JTextField();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        salebrand = new javax.swing.JTextField();
        salebrandmodel = new javax.swing.JTextField();
        salepurchaseprice = new javax.swing.JTextField();
        jLabel158 = new javax.swing.JLabel();
        saleaccessoryname = new javax.swing.JTextField();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        saleprice = new javax.swing.JTextField();
        saletotal = new javax.swing.JTextField();
        salediscount = new javax.swing.JTextField();
        salegst = new javax.swing.JTextField();
        salebill = new javax.swing.JTextField();
        salequantity = new javax.swing.JComboBox<>();
        salesubmitbtn = new javax.swing.JButton();
        saleviewbill = new javax.swing.JButton();
        jLabel166 = new javax.swing.JLabel();
        salestock = new javax.swing.JTextField();
        salecalculatebtn = new javax.swing.JButton();
        salecustomeriderror = new javax.swing.JLabel();
        salepurchaseiderror = new javax.swing.JLabel();
        salediscounterror = new javax.swing.JLabel();
        salegsterror = new javax.swing.JLabel();
        saletotalerror = new javax.swing.JLabel();
        salequantityerror = new javax.swing.JLabel();
        salepriceerror = new javax.swing.JLabel();
        salebillerror = new javax.swing.JLabel();
        saleanother = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dashreport = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        backreport = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel173 = new javax.swing.JLabel();
        reportsaleid = new javax.swing.JComboBox<>();
        dashcart = new javax.swing.JPanel();
        backcart = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        carttable = new javax.swing.JTable();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jSeparator28 = new javax.swing.JSeparator();
        carttotal = new javax.swing.JTextField();
        cartcalbtn = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        cartid = new javax.swing.JTextField();
        jLabel199 = new javax.swing.JLabel();
        cartcustomername = new javax.swing.JTextField();
        dashsetting = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        backsetting = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        bmw = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jComboBox31 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jComboBox32 = new javax.swing.JComboBox<>();
        jButton32 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jComboBox33 = new javax.swing.JComboBox<>();
        jButton35 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jComboBox34 = new javax.swing.JComboBox<>();
        jButton36 = new javax.swing.JButton();
        jLabel103 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        honda = new javax.swing.JPanel();
        jLabel297 = new javax.swing.JLabel();
        jSeparator27 = new javax.swing.JSeparator();
        jPanel47 = new javax.swing.JPanel();
        jLabel298 = new javax.swing.JLabel();
        jLabel299 = new javax.swing.JLabel();
        jLabel300 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jLabel301 = new javax.swing.JLabel();
        jLabel302 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel303 = new javax.swing.JLabel();
        jLabel304 = new javax.swing.JLabel();
        jLabel305 = new javax.swing.JLabel();
        jComboBox56 = new javax.swing.JComboBox<>();
        jButton12 = new javax.swing.JButton();
        jLabel306 = new javax.swing.JLabel();
        jLabel307 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel308 = new javax.swing.JLabel();
        jLabel309 = new javax.swing.JLabel();
        jLabel310 = new javax.swing.JLabel();
        jComboBox57 = new javax.swing.JComboBox<>();
        jButton54 = new javax.swing.JButton();
        jLabel311 = new javax.swing.JLabel();
        jLabel312 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel318 = new javax.swing.JLabel();
        jLabel319 = new javax.swing.JLabel();
        jLabel320 = new javax.swing.JLabel();
        jComboBox59 = new javax.swing.JComboBox<>();
        jButton56 = new javax.swing.JButton();
        jLabel321 = new javax.swing.JLabel();
        jLabel322 = new javax.swing.JLabel();
        royal_enfield = new javax.swing.JPanel();
        jLabel266 = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        jPanel41 = new javax.swing.JPanel();
        jLabel267 = new javax.swing.JLabel();
        jLabel268 = new javax.swing.JLabel();
        jLabel269 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jLabel270 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel272 = new javax.swing.JLabel();
        jLabel273 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jComboBox51 = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        jLabel275 = new javax.swing.JLabel();
        jLabel276 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel277 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jComboBox52 = new javax.swing.JComboBox<>();
        jButton50 = new javax.swing.JButton();
        jLabel280 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel282 = new javax.swing.JLabel();
        jLabel283 = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        jComboBox53 = new javax.swing.JComboBox<>();
        jButton51 = new javax.swing.JButton();
        jLabel285 = new javax.swing.JLabel();
        jLabel286 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel287 = new javax.swing.JLabel();
        jLabel288 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        jComboBox54 = new javax.swing.JComboBox<>();
        jButton52 = new javax.swing.JButton();
        jLabel290 = new javax.swing.JLabel();
        jLabel291 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel292 = new javax.swing.JLabel();
        jLabel293 = new javax.swing.JLabel();
        jLabel294 = new javax.swing.JLabel();
        jComboBox55 = new javax.swing.JComboBox<>();
        jButton53 = new javax.swing.JButton();
        jLabel295 = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        ktm = new javax.swing.JPanel();
        jLabel235 = new javax.swing.JLabel();
        jSeparator25 = new javax.swing.JSeparator();
        jPanel14 = new javax.swing.JPanel();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        jComboBox46 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jLabel244 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel246 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        jComboBox47 = new javax.swing.JComboBox<>();
        jButton46 = new javax.swing.JButton();
        jLabel249 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel251 = new javax.swing.JLabel();
        jLabel252 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        jComboBox48 = new javax.swing.JComboBox<>();
        jButton47 = new javax.swing.JButton();
        jLabel254 = new javax.swing.JLabel();
        jLabel255 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel256 = new javax.swing.JLabel();
        jLabel257 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        jComboBox49 = new javax.swing.JComboBox<>();
        jButton48 = new javax.swing.JButton();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        kawasaki = new javax.swing.JPanel();
        jLabel204 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jComboBox41 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jComboBox42 = new javax.swing.JComboBox<>();
        jButton42 = new javax.swing.JButton();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        jComboBox44 = new javax.swing.JComboBox<>();
        jButton44 = new javax.swing.JButton();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        bajaj = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jComboBox36 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jComboBox37 = new javax.swing.JComboBox<>();
        jButton38 = new javax.swing.JButton();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jComboBox38 = new javax.swing.JComboBox<>();
        jButton39 = new javax.swing.JButton();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jComboBox39 = new javax.swing.JComboBox<>();
        jButton40 = new javax.swing.JButton();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        billtable = new javax.swing.JPanel();
        jLabel167 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        btable = new javax.swing.JTable();
        jLabel168 = new javax.swing.JLabel();
        billcustomername = new javax.swing.JTextField();
        jLabel169 = new javax.swing.JLabel();
        billcustomerid = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel170 = new javax.swing.JLabel();
        billtotal = new javax.swing.JTextField();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        billid = new javax.swing.JTextField();
        jLabel172 = new javax.swing.JLabel();
        sidepanel = new javax.swing.JPanel();
        sidepanellogo = new javax.swing.JLabel();
        usernamelbl = new javax.swing.JLabel();
        hometab = new javax.swing.JPanel();
        homeimg = new javax.swing.JLabel();
        tab1lbl = new javax.swing.JLabel();
        dashboardtab = new javax.swing.JPanel();
        dashboardimg = new javax.swing.JLabel();
        tab2lbl = new javax.swing.JLabel();
        brandstab = new javax.swing.JPanel();
        brandsimg = new javax.swing.JLabel();
        tab3lbl = new javax.swing.JLabel();
        accessoriestab = new javax.swing.JPanel();
        accessoriesimg = new javax.swing.JLabel();
        tab4lbl = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        offerstab = new javax.swing.JPanel();
        offersimg = new javax.swing.JLabel();
        tab5lbl = new javax.swing.JLabel();
        supporttab = new javax.swing.JPanel();
        supportimg = new javax.swing.JLabel();
        tab6lbl = new javax.swing.JLabel();
        abouttab = new javax.swing.JPanel();
        aboutimg = new javax.swing.JLabel();
        tab7lbl = new javax.swing.JLabel();
        logouttab = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tab8lbl = new javax.swing.JLabel();
        instagramtab = new javax.swing.JPanel();
        instagrambtn = new javax.swing.JButton();
        facebooktab = new javax.swing.JPanel();
        facebookbtn = new javax.swing.JButton();
        jSeparator20 = new javax.swing.JSeparator();
        titlepanel = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        closebtn = new javax.swing.JButton();
        minimizebtn = new javax.swing.JButton();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page_img/royalenfield.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bike Accessories");
        setAlwaysOnTop(true);
        setUndecorated(true);

        mainpanel.setBackground(new java.awt.Color(0, 0, 0));
        mainpanel.setForeground(new java.awt.Color(255, 255, 255));
        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentpanel.setBackground(new java.awt.Color(153, 204, 255));

        tab1.setBackground(new java.awt.Color(0, 0, 0));
        tab1.setPreferredSize(new java.awt.Dimension(660, 686));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("HOME");
        jLabel7.setPreferredSize(new java.awt.Dimension(1810, 43));

        bajajlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page_img/dominar.jpg"))); // NOI18N
        bajajlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bajajlblMouseClicked(evt);
            }
        });

        bmwlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page_img/bmw.jpg"))); // NOI18N
        bmwlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bmwlblMouseClicked(evt);
            }
        });

        kawasakilbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page_img/kawasaki.jpg"))); // NOI18N
        kawasakilbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kawasakilblMouseClicked(evt);
            }
        });

        royal_enfieldlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page_img/royalenfield.jpg"))); // NOI18N
        royal_enfieldlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                royal_enfieldlblMouseClicked(evt);
            }
        });

        hondalbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page_img/honda.jpg"))); // NOI18N
        hondalbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hondalblMouseClicked(evt);
            }
        });

        ktmlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page_img/ktm.jpg"))); // NOI18N
        ktmlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ktmlblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(tab1Layout.createSequentialGroup()
                .addComponent(bajajlbl)
                .addGap(30, 30, 30)
                .addComponent(bmwlbl)
                .addGap(30, 30, 30)
                .addComponent(kawasakilbl))
            .addGroup(tab1Layout.createSequentialGroup()
                .addComponent(royal_enfieldlbl)
                .addGap(42, 42, 42)
                .addComponent(hondalbl)
                .addGap(18, 18, 18)
                .addComponent(ktmlbl))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bmwlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bajajlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kawasakilbl, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hondalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(royal_enfieldlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ktmlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        tab2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel14.setBackground(new java.awt.Color(218, 228, 230));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("DASHBOARD");
        jLabel14.setPreferredSize(new java.awt.Dimension(1810, 43));

        centerpanel.setBackground(new java.awt.Color(0, 0, 0));
        centerpanel.setPreferredSize(new java.awt.Dimension(1810, 867));
        centerpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dash1.setBackground(new java.awt.Color(255, 255, 255));
        dash1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        dash1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash1MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/customer.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("New Customer");

        javax.swing.GroupLayout dash1Layout = new javax.swing.GroupLayout(dash1);
        dash1.setLayout(dash1Layout);
        dash1Layout.setHorizontalGroup(
            dash1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dash1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(dash1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(dash1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dash1Layout.setVerticalGroup(
            dash1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel6)
                .addGap(14, 14, 14)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        centerpanel.add(dash1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 170));

        dash9.setBackground(new java.awt.Color(255, 255, 255));
        dash9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        dash9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash9MouseClicked(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/setting.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Setting Tools");

        javax.swing.GroupLayout dash9Layout = new javax.swing.GroupLayout(dash9);
        dash9.setLayout(dash9Layout);
        dash9Layout.setHorizontalGroup(
            dash9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dash9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(dash9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator8)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        dash9Layout.setVerticalGroup(
            dash9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash9Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        centerpanel.add(dash9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 140, 170));

        dash7.setBackground(new java.awt.Color(255, 255, 255));
        dash7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        dash7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash7MouseClicked(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/editing.png"))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("My Cart");

        javax.swing.GroupLayout dash7Layout = new javax.swing.GroupLayout(dash7);
        dash7.setLayout(dash7Layout);
        dash7Layout.setHorizontalGroup(
            dash7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dash7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(dash7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator9)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(dash7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dash7Layout.setVerticalGroup(
            dash7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash7Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dash7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        centerpanel.add(dash7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 140, 170));

        dash4.setBackground(new java.awt.Color(255, 255, 255));
        dash4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        dash4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash4MouseClicked(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/purchase.png"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Purchase");

        javax.swing.GroupLayout dash4Layout = new javax.swing.GroupLayout(dash4);
        dash4.setLayout(dash4Layout);
        dash4Layout.setHorizontalGroup(
            dash4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash4Layout.createSequentialGroup()
                .addGroup(dash4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dash4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dash4Layout.setVerticalGroup(
            dash4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash4Layout.createSequentialGroup()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(27, 27, 27))
        );

        centerpanel.add(dash4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, 170));

        dash3.setBackground(new java.awt.Color(255, 255, 255));
        dash3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        dash3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash3MouseClicked(evt);
            }
        });

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/helmet.jpg"))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Bike Accessories");

        javax.swing.GroupLayout dash3Layout = new javax.swing.GroupLayout(dash3);
        dash3.setLayout(dash3Layout);
        dash3Layout.setHorizontalGroup(
            dash3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dash3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(dash3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        dash3Layout.setVerticalGroup(
            dash3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash3Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        centerpanel.add(dash3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 130, 170));

        dash5.setBackground(new java.awt.Color(255, 255, 255));
        dash5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        dash5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash5MouseClicked(evt);
            }
        });

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/sale.png"))); // NOI18N

        jLabel48.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Sale");

        javax.swing.GroupLayout dash5Layout = new javax.swing.GroupLayout(dash5);
        dash5.setLayout(dash5Layout);
        dash5Layout.setHorizontalGroup(
            dash5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dash5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(dash5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dash5Layout.createSequentialGroup()
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dash5Layout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        dash5Layout.setVerticalGroup(
            dash5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash5Layout.createSequentialGroup()
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addGap(27, 27, 27))
        );

        centerpanel.add(dash5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 140, 170));

        dash8.setBackground(new java.awt.Color(255, 255, 255));
        dash8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        dash8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash8MouseClicked(evt);
            }
        });

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/report.png"))); // NOI18N

        jLabel52.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Report");

        javax.swing.GroupLayout dash8Layout = new javax.swing.GroupLayout(dash8);
        dash8.setLayout(dash8Layout);
        dash8Layout.setHorizontalGroup(
            dash8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dash8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(dash8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(dash8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dash8Layout.setVerticalGroup(
            dash8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dash8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        centerpanel.add(dash8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 140, 170));
        centerpanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 660, 10));
        centerpanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 650, -1));

        dash2.setBackground(new java.awt.Color(255, 255, 255));
        dash2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        dash2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash2MouseClicked(evt);
            }
        });

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/dealer.jpg"))); // NOI18N

        jLabel54.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Dealer");

        javax.swing.GroupLayout dash2Layout = new javax.swing.GroupLayout(dash2);
        dash2.setLayout(dash2Layout);
        dash2Layout.setHorizontalGroup(
            dash2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dash2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(dash2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator6)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(dash2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dash2Layout.setVerticalGroup(
            dash2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dash2Layout.createSequentialGroup()
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel54)
                .addGap(27, 27, 27))
        );

        centerpanel.add(dash2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 140, 170));

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(centerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(tab2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(centerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tab3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel55.setBackground(new java.awt.Color(218, 228, 230));
        jLabel55.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("ALL BRANDS");
        jLabel55.setPreferredSize(new java.awt.Dimension(1810, 43));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brandroyalenfield.setBackground(new java.awt.Color(0, 0, 0));
        brandroyalenfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brandroyalenfieldMouseClicked(evt);
            }
        });

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/company_logo/royalenfield.png"))); // NOI18N
        jLabel56.setText("jLabel5");

        jLabel57.setBackground(new java.awt.Color(0, 0, 0));
        jLabel57.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("ROYAL ENFIELD");

        javax.swing.GroupLayout brandroyalenfieldLayout = new javax.swing.GroupLayout(brandroyalenfield);
        brandroyalenfield.setLayout(brandroyalenfieldLayout);
        brandroyalenfieldLayout.setHorizontalGroup(
            brandroyalenfieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(brandroyalenfieldLayout.createSequentialGroup()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        brandroyalenfieldLayout.setVerticalGroup(
            brandroyalenfieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brandroyalenfieldLayout.createSequentialGroup()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(brandroyalenfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 210, 260));

        brandbmw.setBackground(new java.awt.Color(0, 0, 0));
        brandbmw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brandbmwMouseClicked(evt);
            }
        });

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/company_logo/bmw.png"))); // NOI18N
        jLabel58.setText("jLabel5");

        jLabel59.setBackground(new java.awt.Color(0, 0, 0));
        jLabel59.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("BMW");

        javax.swing.GroupLayout brandbmwLayout = new javax.swing.GroupLayout(brandbmw);
        brandbmw.setLayout(brandbmwLayout);
        brandbmwLayout.setHorizontalGroup(
            brandbmwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(brandbmwLayout.createSequentialGroup()
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        brandbmwLayout.setVerticalGroup(
            brandbmwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brandbmwLayout.createSequentialGroup()
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(brandbmw, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 260));

        brandktm.setBackground(new java.awt.Color(0, 0, 0));
        brandktm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brandktmMouseClicked(evt);
            }
        });

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/company_logo/ktm.png"))); // NOI18N
        jLabel60.setText("jLabel5");

        jLabel61.setBackground(new java.awt.Color(0, 0, 0));
        jLabel61.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("KTM");

        javax.swing.GroupLayout brandktmLayout = new javax.swing.GroupLayout(brandktm);
        brandktm.setLayout(brandktmLayout);
        brandktmLayout.setHorizontalGroup(
            brandktmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(brandktmLayout.createSequentialGroup()
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        brandktmLayout.setVerticalGroup(
            brandktmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brandktmLayout.createSequentialGroup()
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(brandktm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 210, 260));

        brandkawasaki.setBackground(new java.awt.Color(0, 0, 0));
        brandkawasaki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brandkawasakiMouseClicked(evt);
            }
        });

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/company_logo/kawasaki.png"))); // NOI18N
        jLabel62.setText("jLabel5");

        jLabel63.setBackground(new java.awt.Color(0, 0, 0));
        jLabel63.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("KAWASAKI");

        javax.swing.GroupLayout brandkawasakiLayout = new javax.swing.GroupLayout(brandkawasaki);
        brandkawasaki.setLayout(brandkawasakiLayout);
        brandkawasakiLayout.setHorizontalGroup(
            brandkawasakiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(brandkawasakiLayout.createSequentialGroup()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        brandkawasakiLayout.setVerticalGroup(
            brandkawasakiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brandkawasakiLayout.createSequentialGroup()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(brandkawasaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 210, 260));

        brandbajaj.setBackground(new java.awt.Color(0, 0, 0));
        brandbajaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brandbajajMouseClicked(evt);
            }
        });

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/company_logo/bajaj.png"))); // NOI18N
        jLabel64.setText("jLabel5");

        jLabel65.setBackground(new java.awt.Color(0, 0, 0));
        jLabel65.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("BAJAJ");

        javax.swing.GroupLayout brandbajajLayout = new javax.swing.GroupLayout(brandbajaj);
        brandbajaj.setLayout(brandbajajLayout);
        brandbajajLayout.setHorizontalGroup(
            brandbajajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(brandbajajLayout.createSequentialGroup()
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        brandbajajLayout.setVerticalGroup(
            brandbajajLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brandbajajLayout.createSequentialGroup()
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(brandbajaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 210, 260));

        brandhonda.setBackground(new java.awt.Color(0, 0, 0));
        brandhonda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brandhondaMouseClicked(evt);
            }
        });

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/company_logo/honda.png"))); // NOI18N
        jLabel66.setText("jLabel5");

        jLabel67.setBackground(new java.awt.Color(0, 0, 0));
        jLabel67.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("HONDA");

        javax.swing.GroupLayout brandhondaLayout = new javax.swing.GroupLayout(brandhonda);
        brandhonda.setLayout(brandhondaLayout);
        brandhondaLayout.setHorizontalGroup(
            brandhondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(brandhondaLayout.createSequentialGroup()
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        brandhondaLayout.setVerticalGroup(
            brandhondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brandhondaLayout.createSequentialGroup()
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(brandhonda, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 210, 260));

        javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
            .addGroup(tab3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        tab4.setBackground(new java.awt.Color(0, 0, 0));
        tab4.setPreferredSize(new java.awt.Dimension(660, 686));

        jLabel68.setBackground(new java.awt.Color(218, 228, 230));
        jLabel68.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("ALL ACCESSORIES");
        jLabel68.setPreferredSize(new java.awt.Dimension(1810, 43));

        jPanel22.setBackground(new java.awt.Color(0, 0, 0));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accessories_img/crash_guard_HONDA.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel69.setBackground(new java.awt.Color(0, 0, 0));
        jLabel69.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("CRASH GUARD | CB350 RS");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 210, 280));

        jPanel25.setBackground(new java.awt.Color(0, 0, 0));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accessories_img/crash_guard_BAJAJ.jpg"))); // NOI18N
        jLabel70.setText("jLabel5");

        jLabel71.setBackground(new java.awt.Color(0, 0, 0));
        jLabel71.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("CRASH GUARD | DOMINAR");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel70)
                .addGap(16, 16, 16)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel22.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 270));

        jPanel26.setBackground(new java.awt.Color(0, 0, 0));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accessories_img/leg_guard_RE.jpg"))); // NOI18N
        jLabel72.setText("jLabel5");

        jLabel73.setBackground(new java.awt.Color(0, 0, 0));
        jLabel73.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("LEG GUARD | RE");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 190, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel22.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 210, 260));

        jPanel27.setBackground(new java.awt.Color(0, 0, 0));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accessories_img/crash_guard_KTM.jpg"))); // NOI18N
        jLabel74.setText("jLabel5");

        jLabel75.setBackground(new java.awt.Color(0, 0, 0));
        jLabel75.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("CRASH GUARD | KTM");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel22.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 210, 260));

        jPanel28.setBackground(new java.awt.Color(0, 0, 0));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accessories_img/sadle_stay_KTm.jpg"))); // NOI18N
        jLabel76.setText("jLabel5");

        jLabel77.setBackground(new java.awt.Color(0, 0, 0));
        jLabel77.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("SADDLE STAY | KTM");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel22.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 210, 260));

        jPanel29.setBackground(new java.awt.Color(0, 0, 0));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accessories_img/engine_frame_RE.jpg"))); // NOI18N
        jLabel78.setText("jLabel5");

        jLabel79.setBackground(new java.awt.Color(0, 0, 0));
        jLabel79.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("ENGINE FRAME | HIMALAYAN");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel78)
                .addGap(18, 18, 18)
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel22.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 210, 260));

        javax.swing.GroupLayout tab4Layout = new javax.swing.GroupLayout(tab4);
        tab4.setLayout(tab4Layout);
        tab4Layout.setHorizontalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        tab4Layout.setVerticalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        tab5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel110.setBackground(new java.awt.Color(218, 228, 230));
        jLabel110.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setText("OFFERS");
        jLabel110.setPreferredSize(new java.awt.Dimension(1810, 43));

        jPanel40.setBackground(new java.awt.Color(0, 0, 0));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        offercart1.setBackground(new java.awt.Color(153, 153, 153));
        offercart1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel346.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Java Tution\\Bike_Accessories\\Bike_Accessories\\images\\main_frame\\tab5\\headLight_grill.png")); // NOI18N

        offern1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offern1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offern1.setText("HEAD LIGHT GRILL");

        jLabel347.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel347.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel347.setText("Qty :");

        offerq1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offerq1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        offeradd1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offeradd1.setText("Add");
        offeradd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offeradd1ActionPerformed(evt);
            }
        });

        jLabel348.setText("Price :");

        offerp1.setText("879");

        javax.swing.GroupLayout offercart1Layout = new javax.swing.GroupLayout(offercart1);
        offercart1.setLayout(offercart1Layout);
        offercart1Layout.setHorizontalGroup(
            offercart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel346, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(offern1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(offercart1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(offercart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(offercart1Layout.createSequentialGroup()
                        .addComponent(jLabel347, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(offerq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(offeradd1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(offercart1Layout.createSequentialGroup()
                        .addComponent(jLabel348)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(offerp1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        offercart1Layout.setVerticalGroup(
            offercart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offercart1Layout.createSequentialGroup()
                .addComponent(jLabel346)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(offern1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(offercart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel348)
                    .addComponent(offerp1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(offercart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(offeradd1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(offercart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offerq1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel347))))
        );

        jPanel40.add(offercart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        offercart2.setBackground(new java.awt.Color(153, 153, 153));
        offercart2.setForeground(new java.awt.Color(153, 153, 153));

        jLabel337.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Java Tution\\Bike_Accessories\\Bike_Accessories\\images\\main_frame\\tab5\\mobile_mount_ktm.png")); // NOI18N

        offern2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offern2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offern2.setText("MOBILE MOUNT");

        jLabel338.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel338.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel338.setText("Qty :");

        offerq2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offerq2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        offeradd2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offeradd2.setText("Add");
        offeradd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offeradd2ActionPerformed(evt);
            }
        });

        jLabel339.setText("Price :");

        offerp2.setText("389");

        javax.swing.GroupLayout offercart2Layout = new javax.swing.GroupLayout(offercart2);
        offercart2.setLayout(offercart2Layout);
        offercart2Layout.setHorizontalGroup(
            offercart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel337, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(offern2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(offercart2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(offercart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(offercart2Layout.createSequentialGroup()
                        .addComponent(jLabel338, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(offerq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(offeradd2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(offercart2Layout.createSequentialGroup()
                        .addComponent(jLabel339)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(offerp2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        offercart2Layout.setVerticalGroup(
            offercart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offercart2Layout.createSequentialGroup()
                .addComponent(jLabel337)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(offern2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(offercart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel339)
                    .addComponent(offerp2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(offercart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(offeradd2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(offercart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offerq2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel338))))
        );

        jPanel40.add(offercart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        offercart3.setBackground(new java.awt.Color(153, 153, 153));
        offercart3.setForeground(new java.awt.Color(153, 153, 153));

        jLabel340.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Java Tution\\Bike_Accessories\\Bike_Accessories\\images\\main_frame\\tab5\\sadle_stay_himalayan.png")); // NOI18N

        offern3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offern3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offern3.setText("SADDLE STAY");

        jLabel341.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel341.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel341.setText("Qty :");

        offerq3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offerq3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        offeradd3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offeradd3.setText("Add");
        offeradd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offeradd3ActionPerformed(evt);
            }
        });

        jLabel342.setText("Price :");

        offerp3.setText("1200");

        javax.swing.GroupLayout offercart3Layout = new javax.swing.GroupLayout(offercart3);
        offercart3.setLayout(offercart3Layout);
        offercart3Layout.setHorizontalGroup(
            offercart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel340, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(offern3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(offercart3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(offercart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(offercart3Layout.createSequentialGroup()
                        .addComponent(jLabel341, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(offerq3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(offeradd3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(offercart3Layout.createSequentialGroup()
                        .addComponent(jLabel342)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(offerp3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        offercart3Layout.setVerticalGroup(
            offercart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offercart3Layout.createSequentialGroup()
                .addComponent(jLabel340)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(offern3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(offercart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel342)
                    .addComponent(offerp3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(offercart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(offeradd3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(offercart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offerq3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel341))))
        );

        jPanel40.add(offercart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        offercart4.setBackground(new java.awt.Color(153, 153, 153));
        offercart4.setForeground(new java.awt.Color(153, 153, 153));

        jLabel343.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Java Tution\\Bike_Accessories\\Bike_Accessories\\images\\main_frame\\tab5\\crash_guard_ktm.png")); // NOI18N

        offern4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offern4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offern4.setText("CRASH GUARD BLACK KTM");

        jLabel344.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel344.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel344.setText("Qty :");

        offerq4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offerq4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        offeradd4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offeradd4.setText("Add");
        offeradd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offeradd4ActionPerformed(evt);
            }
        });

        jLabel345.setText("Price :");

        offerp4.setText("2400");

        javax.swing.GroupLayout offercart4Layout = new javax.swing.GroupLayout(offercart4);
        offercart4.setLayout(offercart4Layout);
        offercart4Layout.setHorizontalGroup(
            offercart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel343, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(offern4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(offercart4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(offercart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(offercart4Layout.createSequentialGroup()
                        .addComponent(jLabel344, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(offerq4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(offeradd4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(offercart4Layout.createSequentialGroup()
                        .addComponent(jLabel345)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(offerp4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        offercart4Layout.setVerticalGroup(
            offercart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offercart4Layout.createSequentialGroup()
                .addComponent(jLabel343)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(offern4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(offercart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel345)
                    .addComponent(offerp4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(offercart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(offeradd4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(offercart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offerq4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel344))))
        );

        jPanel40.add(offercart4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        offercart5.setBackground(new java.awt.Color(153, 153, 153));
        offercart5.setForeground(new java.awt.Color(153, 153, 153));

        jLabel349.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Java Tution\\Bike_Accessories\\Bike_Accessories\\images\\main_frame\\tab5\\handle_bar_riser.png")); // NOI18N

        offern5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offern5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offern5.setText("HANDLEBAR RISER KTM");

        jLabel350.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel350.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel350.setText("Qty :");

        offerq5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offerq5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        offeradd5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offeradd5.setText("Add");
        offeradd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offeradd5ActionPerformed(evt);
            }
        });

        jLabel351.setText("Price :");

        offerp5.setText("350");

        javax.swing.GroupLayout offercart5Layout = new javax.swing.GroupLayout(offercart5);
        offercart5.setLayout(offercart5Layout);
        offercart5Layout.setHorizontalGroup(
            offercart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel349, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(offern5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(offercart5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(offercart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(offercart5Layout.createSequentialGroup()
                        .addComponent(jLabel350, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(offerq5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(offeradd5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(offercart5Layout.createSequentialGroup()
                        .addComponent(jLabel351)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(offerp5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        offercart5Layout.setVerticalGroup(
            offercart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offercart5Layout.createSequentialGroup()
                .addComponent(jLabel349)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(offern5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(offercart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel351)
                    .addComponent(offerp5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(offercart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(offeradd5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(offercart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offerq5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel350))))
        );

        jPanel40.add(offercart5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        offercart6.setBackground(new java.awt.Color(153, 153, 153));
        offercart6.setForeground(new java.awt.Color(153, 153, 153));

        jLabel334.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Java Tution\\Bike_Accessories\\Bike_Accessories\\images\\main_frame\\tab5\\back_rest.png")); // NOI18N

        offern6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offern6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offern6.setText("BACK REST UNIVERSAL");

        jLabel335.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel335.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel335.setText("Qty :");

        offerq6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offerq6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        offeradd6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        offeradd6.setText("Add");
        offeradd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offeradd6ActionPerformed(evt);
            }
        });

        jLabel336.setText("Price :");

        offerp6.setText("780");

        javax.swing.GroupLayout offercart6Layout = new javax.swing.GroupLayout(offercart6);
        offercart6.setLayout(offercart6Layout);
        offercart6Layout.setHorizontalGroup(
            offercart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel334, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(offern6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(offercart6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(offercart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(offercart6Layout.createSequentialGroup()
                        .addComponent(jLabel335, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(offerq6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(offeradd6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(offercart6Layout.createSequentialGroup()
                        .addComponent(jLabel336)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(offerp6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        offercart6Layout.setVerticalGroup(
            offercart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offercart6Layout.createSequentialGroup()
                .addComponent(jLabel334)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(offern6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(offercart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel336)
                    .addComponent(offerp6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(offercart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(offeradd6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(offercart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(offerq6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel335))))
        );

        jPanel40.add(offercart6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

        javax.swing.GroupLayout tab5Layout = new javax.swing.GroupLayout(tab5);
        tab5.setLayout(tab5Layout);
        tab5Layout.setHorizontalGroup(
            tab5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel110, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(tab5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tab5Layout.createSequentialGroup()
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        tab5Layout.setVerticalGroup(
            tab5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
        );

        tab6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel93.setBackground(new java.awt.Color(218, 228, 230));
        jLabel93.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("SUPPORT");
        jLabel93.setPreferredSize(new java.awt.Dimension(1810, 43));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("TYPE YOUR QUERY\n\nHave queries & concerns? The Bikers Squad is here to help!\nWrite down your concern and drop us an email at the below given email id and we will get back to you at the earliest possible second.\n\n\nSAY HELLO TO Bikers World Support\n\n+91-8830079582\nTimings 10:30am - 9:00pm(Mon-Sat)\n\n\nADDRESS\n\nMahal Ward, Bhandara, Maharashtra. 441904\n\nFor new part sales query from website\nonlinesales@bikersworld.com\n\nFor Offline sales and queries\nIncluding exports\nsales@bikersworld.com\n\nFor Aftersales,warranty, spares, courier related issues\nwarranty@bikersworld.com\n");
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout tab6Layout = new javax.swing.GroupLayout(tab6);
        tab6.setLayout(tab6Layout);
        tab6Layout.setHorizontalGroup(
            tab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(tab6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        tab6Layout.setVerticalGroup(
            tab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tab7.setBackground(new java.awt.Color(0, 0, 0));
        tab7.setPreferredSize(new java.awt.Dimension(660, 686));

        jLabel94.setBackground(new java.awt.Color(218, 228, 230));
        jLabel94.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("ABOUT US");
        jLabel94.setPreferredSize(new java.awt.Dimension(1810, 43));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setText("Bikers World is Riding GearsStore in Bhandara.\n\nDue to lack of awareness and availability of good quality riding gears like helmets, jackets, gloves, \nwe started this platform for all bikers across India.\n\nBikers World is riding gears store where you find multiple brands under single roof. All products \nhere listed are handpicked by our team. Here you can buy top quality riding gears, biking and \ntouring accessories.\n\nOur team has lots of experience in riding hence we suggest our customers with best riding gears as\nper their requirement.\n\nAll products showcased here are excellent in terms of quality and durability. Also most of these \nproducts are tested by our team as well.\n\nOur Strengths:\n\nRun by experienced riders\nOfficial retailer / Dealer of brands – provide authentic and genuine products only.\n100% risk free secure shopping online.\nSecured payment gateways and top logistics service providers associated with us for best service.\nBikers World is a Store by Rider, For the Riders");
        jTextArea3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextArea3.setPreferredSize(new java.awt.Dimension(224, 463));
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout tab7Layout = new javax.swing.GroupLayout(tab7);
        tab7.setLayout(tab7Layout);
        tab7Layout.setHorizontalGroup(
            tab7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(tab7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
        );
        tab7Layout.setVerticalGroup(
            tab7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(638, Short.MAX_VALUE))
            .addGroup(tab7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab7Layout.createSequentialGroup()
                    .addContainerGap(103, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        dashaddcustomer.setBackground(new java.awt.Color(0, 0, 0));
        dashaddcustomer.setPreferredSize(new java.awt.Dimension(660, 686));

        jLabel100.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("New Customer");

        backcustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slider_img/back.png"))); // NOI18N
        backcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backcustomerMouseClicked(evt);
            }
        });

        applicationid.setEditable(false);
        applicationid.setBackground(new java.awt.Color(0, 0, 0));
        applicationid.setForeground(new java.awt.Color(255, 255, 255));

        jLabel118.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel118.setText("Full Name :");

        jLabel119.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(255, 255, 255));
        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel119.setText("Application ID :");

        jLabel120.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(255, 255, 255));
        jLabel120.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel120.setText("Age :");

        jLabel121.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel121.setText("Address :");

        customerage.setBackground(new java.awt.Color(0, 0, 0));
        customerage.setForeground(new java.awt.Color(153, 153, 153));
        customerage.setText("age");
        customerage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customerageFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                customerageFocusLost(evt);
            }
        });
        customerage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customerageKeyPressed(evt);
            }
        });

        customerfullname.setBackground(new java.awt.Color(0, 0, 0));
        customerfullname.setForeground(new java.awt.Color(153, 153, 153));
        customerfullname.setText("full name");
        customerfullname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customerfullnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                customerfullnameFocusLost(evt);
            }
        });
        customerfullname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customerfullnameKeyPressed(evt);
            }
        });

        jLabel122.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(255, 255, 255));
        jLabel122.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel122.setText("D.O.B :");

        jLabel123.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel123.setText("Gender :");

        jLabel124.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(255, 255, 255));
        jLabel124.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel124.setText("Mobile :");

        jLabel125.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel125.setText("Aadhar no. :");

        jLabel126.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(255, 255, 255));
        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel126.setText("PIN Code :");

        customersubmit.setBackground(new java.awt.Color(255, 255, 255));
        customersubmit.setText("Submit");
        customersubmit.setBorderPainted(false);
        customersubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersubmitActionPerformed(evt);
            }
        });

        male.setBackground(new java.awt.Color(0, 0, 0));
        gendergroup.add(male);
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");

        female.setBackground(new java.awt.Color(0, 0, 0));
        gendergroup.add(female);
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");

        others.setBackground(new java.awt.Color(0, 0, 0));
        gendergroup.add(others);
        others.setForeground(new java.awt.Color(255, 255, 255));
        others.setText("Other");

        customerpincode.setBackground(new java.awt.Color(0, 0, 0));
        customerpincode.setForeground(new java.awt.Color(153, 153, 153));
        customerpincode.setText("pin code");
        customerpincode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customerpincodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                customerpincodeFocusLost(evt);
            }
        });
        customerpincode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customerpincodeKeyPressed(evt);
            }
        });

        customeraddress.setBackground(new java.awt.Color(0, 0, 0));
        customeraddress.setForeground(new java.awt.Color(153, 153, 153));
        customeraddress.setText("address");
        customeraddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customeraddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                customeraddressFocusLost(evt);
            }
        });

        jLabel127.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel127.setText("Email :");

        customermobile.setBackground(new java.awt.Color(0, 0, 0));
        customermobile.setForeground(new java.awt.Color(153, 153, 153));
        customermobile.setText("mobile number");
        customermobile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customermobileFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                customermobileFocusLost(evt);
            }
        });
        customermobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customermobileKeyPressed(evt);
            }
        });

        customeremail.setBackground(new java.awt.Color(0, 0, 0));
        customeremail.setForeground(new java.awt.Color(153, 153, 153));
        customeremail.setText("email address");
        customeremail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customeremailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                customeremailFocusLost(evt);
            }
        });
        customeremail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customeremailKeyPressed(evt);
            }
        });

        customeraadhar.setBackground(new java.awt.Color(0, 0, 0));
        customeraadhar.setForeground(new java.awt.Color(153, 153, 153));
        customeraadhar.setText("aadhar card number");
        customeraadhar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customeraadharFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                customeraadharFocusLost(evt);
            }
        });
        customeraadhar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customeraadharKeyPressed(evt);
            }
        });

        customercity.setBackground(new java.awt.Color(0, 0, 0));
        customercity.setForeground(new java.awt.Color(153, 153, 153));
        customercity.setText("city");
        customercity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customercityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                customercityFocusLost(evt);
            }
        });
        customercity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customercityKeyPressed(evt);
            }
        });

        jLabel128.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(255, 255, 255));
        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel128.setText("City :");

        customerclear.setBackground(new java.awt.Color(255, 255, 255));
        customerclear.setText("Clear");
        customerclear.setBorderPainted(false);
        customerclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerclearActionPerformed(evt);
            }
        });

        customergendererror.setBackground(new java.awt.Color(0, 0, 0));
        customergendererror.setForeground(new java.awt.Color(255, 0, 0));

        customerdoberror.setBackground(new java.awt.Color(0, 0, 0));
        customerdoberror.setForeground(new java.awt.Color(255, 0, 0));

        customeraadharerror.setBackground(new java.awt.Color(0, 0, 0));
        customeraadharerror.setForeground(new java.awt.Color(255, 0, 0));

        customeremailerror.setBackground(new java.awt.Color(0, 0, 0));
        customeremailerror.setForeground(new java.awt.Color(255, 0, 0));

        customernameerror.setBackground(new java.awt.Color(0, 0, 0));
        customernameerror.setForeground(new java.awt.Color(255, 0, 0));

        customerageerror.setBackground(new java.awt.Color(0, 0, 0));
        customerageerror.setForeground(new java.awt.Color(255, 0, 0));

        customermobileerror.setBackground(new java.awt.Color(0, 0, 0));
        customermobileerror.setForeground(new java.awt.Color(255, 0, 0));

        customeraddresserror.setBackground(new java.awt.Color(0, 0, 0));
        customeraddresserror.setForeground(new java.awt.Color(255, 0, 0));

        customercityerror.setBackground(new java.awt.Color(0, 0, 0));
        customercityerror.setForeground(new java.awt.Color(255, 0, 0));

        customerpincodeerror.setBackground(new java.awt.Color(0, 0, 0));
        customerpincodeerror.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout dashaddcustomerLayout = new javax.swing.GroupLayout(dashaddcustomer);
        dashaddcustomer.setLayout(dashaddcustomerLayout);
        dashaddcustomerLayout.setHorizontalGroup(
            dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashaddcustomerLayout.createSequentialGroup()
                .addGroup(dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addComponent(backcustomer)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(applicationid, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(customerfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(customernameerror, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(male)
                        .addGap(30, 30, 30)
                        .addComponent(female)
                        .addGap(34, 34, 34)
                        .addComponent(others))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(customergendererror, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(customerage, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(customerdoberror, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(customermobile, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(customermobileerror, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(customeremail, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(customeremailerror, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(customeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(customeraddresserror, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(customercity, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(customercityerror, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(customerpincode, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(customerpincodeerror, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel125)
                        .addGap(18, 18, 18)
                        .addComponent(customeraadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(customeraadharerror, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(customersubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(customerclear, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dashaddcustomerLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(customerageerror, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dashaddcustomerLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(customerdob, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
        );
        dashaddcustomerLayout.setVerticalGroup(
            dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashaddcustomerLayout.createSequentialGroup()
                .addGroup(dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(applicationid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(customerfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(customernameerror, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(male)
                            .addComponent(female)
                            .addComponent(others))))
                .addGap(2, 2, 2)
                .addComponent(customergendererror, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(customerage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(customerageerror, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel122, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(customerdob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(customerdoberror, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(customermobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(customermobileerror, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(customeremail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(customeremailerror, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(customeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(customeraddresserror, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(customercity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(customercityerror, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(customerpincode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(customerpincodeerror, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashaddcustomerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(customeraadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(customeraadharerror, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(dashaddcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customersubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerclear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        dashdealer.setBackground(new java.awt.Color(0, 0, 0));
        dashdealer.setPreferredSize(new java.awt.Dimension(660, 686));

        jLabel138.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(255, 255, 255));
        jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel138.setText("Dealer Details");

        backdealer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slider_img/back.png"))); // NOI18N
        backdealer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backdealerMouseClicked(evt);
            }
        });

        dealerid.setEditable(false);
        dealerid.setBackground(new java.awt.Color(0, 0, 0));
        dealerid.setForeground(new java.awt.Color(255, 255, 255));

        jLabel139.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(255, 255, 255));
        jLabel139.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel139.setText("Full Name :");

        jLabel140.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(255, 255, 255));
        jLabel140.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel140.setText("Dealer ID :");

        jLabel142.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(255, 255, 255));
        jLabel142.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel142.setText("Address :");

        dealerfullname.setBackground(new java.awt.Color(0, 0, 0));
        dealerfullname.setForeground(new java.awt.Color(153, 153, 153));
        dealerfullname.setText("full name");
        dealerfullname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dealerfullnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dealerfullnameFocusLost(evt);
            }
        });
        dealerfullname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dealerfullnameKeyPressed(evt);
            }
        });

        jLabel145.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(255, 255, 255));
        jLabel145.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel145.setText("Mobile :");

        jLabel147.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(255, 255, 255));
        jLabel147.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel147.setText("PIN Code :");

        dealersubmit.setBackground(new java.awt.Color(255, 255, 255));
        dealersubmit.setText("Submit");
        dealersubmit.setBorderPainted(false);
        dealersubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealersubmitActionPerformed(evt);
            }
        });

        dealerpincode.setBackground(new java.awt.Color(0, 0, 0));
        dealerpincode.setForeground(new java.awt.Color(153, 153, 153));
        dealerpincode.setText("pin code");
        dealerpincode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dealerpincodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dealerpincodeFocusLost(evt);
            }
        });
        dealerpincode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dealerpincodeKeyPressed(evt);
            }
        });

        dealeraddress.setBackground(new java.awt.Color(0, 0, 0));
        dealeraddress.setForeground(new java.awt.Color(153, 153, 153));
        dealeraddress.setText("address");
        dealeraddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dealeraddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dealeraddressFocusLost(evt);
            }
        });

        jLabel148.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(255, 255, 255));
        jLabel148.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel148.setText("Email :");

        dealermobile.setBackground(new java.awt.Color(0, 0, 0));
        dealermobile.setForeground(new java.awt.Color(153, 153, 153));
        dealermobile.setText("mobile number");
        dealermobile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dealermobileFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dealermobileFocusLost(evt);
            }
        });
        dealermobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dealermobileKeyPressed(evt);
            }
        });

        dealeremail.setBackground(new java.awt.Color(0, 0, 0));
        dealeremail.setForeground(new java.awt.Color(153, 153, 153));
        dealeremail.setText("email address");
        dealeremail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dealeremailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dealeremailFocusLost(evt);
            }
        });
        dealeremail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dealeremailKeyPressed(evt);
            }
        });

        jLabel149.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(255, 255, 255));
        jLabel149.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel149.setText("Agency Name :");

        dealeragencyname.setBackground(new java.awt.Color(0, 0, 0));
        dealeragencyname.setForeground(new java.awt.Color(153, 153, 153));
        dealeragencyname.setText("agency name");
        dealeragencyname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dealeragencynameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dealeragencynameFocusLost(evt);
            }
        });
        dealeragencyname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dealeragencynameKeyPressed(evt);
            }
        });

        dealercity.setBackground(new java.awt.Color(0, 0, 0));
        dealercity.setForeground(new java.awt.Color(153, 153, 153));
        dealercity.setText("city");
        dealercity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dealercityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dealercityFocusLost(evt);
            }
        });
        dealercity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dealercityKeyPressed(evt);
            }
        });

        jLabel150.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(255, 255, 255));
        jLabel150.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel150.setText("City :");

        dealerclear.setBackground(new java.awt.Color(255, 255, 255));
        dealerclear.setText("Clear");
        dealerclear.setBorderPainted(false);
        dealerclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealerclearActionPerformed(evt);
            }
        });

        dealeremailerror.setBackground(new java.awt.Color(0, 0, 0));
        dealeremailerror.setForeground(new java.awt.Color(255, 0, 0));

        dealeragencyerror.setBackground(new java.awt.Color(0, 0, 0));
        dealeragencyerror.setForeground(new java.awt.Color(255, 0, 0));

        dealernameerror.setBackground(new java.awt.Color(0, 0, 0));
        dealernameerror.setForeground(new java.awt.Color(255, 0, 0));

        dealermobileerror.setBackground(new java.awt.Color(0, 0, 0));
        dealermobileerror.setForeground(new java.awt.Color(255, 0, 0));

        dealeraddresserror.setBackground(new java.awt.Color(0, 0, 0));
        dealeraddresserror.setForeground(new java.awt.Color(255, 0, 0));

        dealercityerror.setBackground(new java.awt.Color(0, 0, 0));
        dealercityerror.setForeground(new java.awt.Color(255, 0, 0));

        dealerpincodeerror.setBackground(new java.awt.Color(0, 0, 0));
        dealerpincodeerror.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout dashdealerLayout = new javax.swing.GroupLayout(dashdealer);
        dashdealer.setLayout(dashdealerLayout);
        dashdealerLayout.setHorizontalGroup(
            dashdealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addComponent(backdealer)
                .addGap(6, 6, 6)
                .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(dealerid, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(dealerfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(dealernameerror, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(dealermobile, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(dealermobileerror, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(dealeremail, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(dealeremailerror, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(dealeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(dealeraddresserror, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(dealercity, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(dealercityerror, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(dealerpincode, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(dealerpincodeerror, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel149)
                .addGap(28, 28, 28)
                .addComponent(dealeragencyname, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(dealeragencyerror, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(dealersubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(dealerclear, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dashdealerLayout.setVerticalGroup(
            dashdealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashdealerLayout.createSequentialGroup()
                .addGroup(dashdealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backdealer, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(dashdealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashdealerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(dealerid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(dashdealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashdealerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(dealerfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(dealernameerror, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(dashdealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashdealerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(dealermobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(dealermobileerror, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(dashdealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dealeremail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(dealeremailerror, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(dashdealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashdealerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(dealeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(dealeraddresserror, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(dashdealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashdealerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(dealercity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(dealercityerror, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(dashdealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashdealerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(dealerpincode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(dealerpincodeerror, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(dashdealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashdealerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(dealeragencyname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(dealeragencyerror, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(dashdealerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dealersubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dealerclear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        dashaccessories.setBackground(new java.awt.Color(0, 0, 0));
        dashaccessories.setPreferredSize(new java.awt.Dimension(660, 686));

        jLabel104.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setText("Accessory Form");

        backaccessories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slider_img/back.png"))); // NOI18N
        backaccessories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backaccessoriesMouseClicked(evt);
            }
        });

        jLabel105.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setText("Accessory ID :");

        accessoryid.setEditable(false);
        accessoryid.setBackground(new java.awt.Color(0, 0, 0));
        accessoryid.setForeground(new java.awt.Color(255, 255, 255));

        jLabel130.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(255, 255, 255));
        jLabel130.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel130.setText("Brand :");

        accbrand.setBackground(new java.awt.Color(0, 0, 0));
        accbrand.setForeground(new java.awt.Color(153, 153, 153));
        accbrand.setText("brand name");
        accbrand.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                accbrandFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                accbrandFocusLost(evt);
            }
        });
        accbrand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                accbrandKeyPressed(evt);
            }
        });

        jLabel131.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel131.setText("Bike Model :");

        accbrandmodel.setBackground(new java.awt.Color(0, 0, 0));
        accbrandmodel.setForeground(new java.awt.Color(153, 153, 153));
        accbrandmodel.setText("brand model");
        accbrandmodel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                accbrandmodelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                accbrandmodelFocusLost(evt);
            }
        });

        jLabel132.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel132.setText("Accessory Name :");

        accaccessoryname.setBackground(new java.awt.Color(0, 0, 0));
        accaccessoryname.setForeground(new java.awt.Color(153, 153, 153));
        accaccessoryname.setText("accessory name");
        accaccessoryname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                accaccessorynameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                accaccessorynameFocusLost(evt);
            }
        });
        accaccessoryname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                accaccessorynameKeyPressed(evt);
            }
        });

        jLabel133.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(255, 255, 255));
        jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel133.setText("Accessory Price :");

        accaccessoryprice.setBackground(new java.awt.Color(0, 0, 0));
        accaccessoryprice.setForeground(new java.awt.Color(153, 153, 153));
        accaccessoryprice.setText("accessory price");
        accaccessoryprice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                accaccessorypriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                accaccessorypriceFocusLost(evt);
            }
        });
        accaccessoryprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                accaccessorypriceKeyPressed(evt);
            }
        });

        accsubmit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        accsubmit.setText("submit");
        accsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accsubmitActionPerformed(evt);
            }
        });

        accclear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        accclear.setText("Clear");
        accclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accclearActionPerformed(evt);
            }
        });

        accbranderror.setBackground(new java.awt.Color(0, 0, 0));
        accbranderror.setForeground(new java.awt.Color(255, 0, 0));

        accpriceerror.setBackground(new java.awt.Color(0, 0, 0));
        accpriceerror.setForeground(new java.awt.Color(255, 0, 0));

        accmodelerror.setBackground(new java.awt.Color(0, 0, 0));
        accmodelerror.setForeground(new java.awt.Color(255, 0, 0));

        accaccessoryerror.setBackground(new java.awt.Color(0, 0, 0));
        accaccessoryerror.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout dashaccessoriesLayout = new javax.swing.GroupLayout(dashaccessories);
        dashaccessories.setLayout(dashaccessoriesLayout);
        dashaccessoriesLayout.setHorizontalGroup(
            dashaccessoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashaccessoriesLayout.createSequentialGroup()
                .addComponent(backaccessories)
                .addGap(10, 10, 10)
                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashaccessoriesLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(accessoryid, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashaccessoriesLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(accbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashaccessoriesLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(accbranderror, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashaccessoriesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(accbrandmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashaccessoriesLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(accmodelerror, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashaccessoriesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel132)
                .addGap(32, 32, 32)
                .addComponent(accaccessoryname, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashaccessoriesLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(accaccessoryerror, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashaccessoriesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(accaccessoryprice, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashaccessoriesLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(accpriceerror, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashaccessoriesLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(accsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(accclear, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dashaccessoriesLayout.setVerticalGroup(
            dashaccessoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashaccessoriesLayout.createSequentialGroup()
                .addGroup(dashaccessoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backaccessories, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(dashaccessoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashaccessoriesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(accessoryid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(dashaccessoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashaccessoriesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(accbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(accbranderror, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(dashaccessoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashaccessoriesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(accbrandmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(accmodelerror, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(dashaccessoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashaccessoriesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(accaccessoryname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(accaccessoryerror, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(dashaccessoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashaccessoriesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(accaccessoryprice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(accpriceerror, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(dashaccessoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accclear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        dashpurchase.setBackground(new java.awt.Color(0, 0, 0));
        dashpurchase.setPreferredSize(new java.awt.Dimension(660, 686));

        jLabel106.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("Purchase ");

        backpurchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slider_img/back.png"))); // NOI18N
        backpurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backpurchaseMouseClicked(evt);
            }
        });

        jLabel107.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel107.setText("Dealer ID :");

        puragencyname.setEditable(false);
        puragencyname.setBackground(new java.awt.Color(0, 0, 0));
        puragencyname.setForeground(new java.awt.Color(255, 255, 255));

        purbrand.setEditable(false);
        purbrand.setBackground(new java.awt.Color(0, 0, 0));
        purbrand.setForeground(new java.awt.Color(255, 255, 255));

        purprice.setEditable(false);
        purprice.setBackground(new java.awt.Color(0, 0, 0));
        purprice.setForeground(new java.awt.Color(255, 255, 255));

        purbrandmodel.setEditable(false);
        purbrandmodel.setBackground(new java.awt.Color(0, 0, 0));
        purbrandmodel.setForeground(new java.awt.Color(255, 255, 255));

        purbill.setEditable(false);
        purbill.setBackground(new java.awt.Color(0, 0, 0));
        purbill.setForeground(new java.awt.Color(255, 255, 255));

        puraccessoryname.setEditable(false);
        puraccessoryname.setBackground(new java.awt.Color(0, 0, 0));
        puraccessoryname.setForeground(new java.awt.Color(255, 255, 255));

        purdealerid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select Dealer ID" }));
        purdealerid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                purdealeridItemStateChanged(evt);
            }
        });

        jLabel129.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(255, 255, 255));
        jLabel129.setText("Agency Name :");

        puraccessoryid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select Accessory ID" }));
        puraccessoryid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                puraccessoryidItemStateChanged(evt);
            }
        });

        jLabel134.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(255, 255, 255));
        jLabel134.setText("Accessory ID :");

        jLabel135.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(255, 255, 255));
        jLabel135.setText("Brand :");

        jLabel136.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(255, 255, 255));
        jLabel136.setText("Bike Model :");

        jLabel137.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(255, 255, 255));
        jLabel137.setText("Accessory Name :");

        jLabel141.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(255, 255, 255));
        jLabel141.setText("Quantity :");

        jLabel143.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(255, 255, 255));
        jLabel143.setText("Price :");

        jLabel146.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(255, 255, 255));
        jLabel146.setText("Total Bill :");

        purbuy.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        purbuy.setText("Buy");
        purbuy.setBorderPainted(false);
        purbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purbuyActionPerformed(evt);
            }
        });

        purquantity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select Quantity", "1", "2", "3", "4", "5", "10", "20", "30" }));
        purquantity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                purquantityItemStateChanged(evt);
            }
        });

        jLabel152.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(255, 255, 255));
        jLabel152.setText("Discount :");

        purdiscount.setBackground(new java.awt.Color(0, 0, 0));
        purdiscount.setForeground(new java.awt.Color(0, 204, 51));
        purdiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                purdiscountKeyPressed(evt);
            }
        });

        purquantityerror.setBackground(new java.awt.Color(0, 0, 0));
        purquantityerror.setForeground(new java.awt.Color(255, 0, 0));

        purdiscounterror.setBackground(new java.awt.Color(0, 0, 0));
        purdiscounterror.setForeground(new java.awt.Color(255, 0, 0));

        purpriceerror.setBackground(new java.awt.Color(0, 0, 0));
        purpriceerror.setForeground(new java.awt.Color(255, 0, 0));

        purdealeriderror.setBackground(new java.awt.Color(0, 0, 0));
        purdealeriderror.setForeground(new java.awt.Color(255, 0, 0));

        puraccessoryiderror.setBackground(new java.awt.Color(0, 0, 0));
        puraccessoryiderror.setForeground(new java.awt.Color(255, 0, 0));

        jLabel144.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(255, 255, 255));
        jLabel144.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel144.setText("Purchase ID :");

        purchaseid.setEditable(false);
        purchaseid.setBackground(new java.awt.Color(0, 0, 0));
        purchaseid.setForeground(new java.awt.Color(255, 255, 255));

        jLabel165.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(0, 204, 51));
        jLabel165.setText("%");

        purbuyerror.setBackground(new java.awt.Color(0, 0, 0));
        purbuyerror.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout dashpurchaseLayout = new javax.swing.GroupLayout(dashpurchase);
        dashpurchase.setLayout(dashpurchaseLayout);
        dashpurchaseLayout.setHorizontalGroup(
            dashpurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashpurchaseLayout.createSequentialGroup()
                .addComponent(backpurchase)
                .addGap(10, 10, 10)
                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashpurchaseLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(purchaseid, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashpurchaseLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(purdealerid, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(purdealeriderror, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashpurchaseLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel129)
                .addGap(18, 18, 18)
                .addComponent(puragencyname, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashpurchaseLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel134)
                .addGap(18, 18, 18)
                .addComponent(puraccessoryid, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(puraccessoryiderror, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashpurchaseLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel135)
                .addGap(18, 18, 18)
                .addComponent(purbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashpurchaseLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel136)
                .addGap(18, 18, 18)
                .addComponent(purbrandmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashpurchaseLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel137)
                .addGap(18, 18, 18)
                .addComponent(puraccessoryname, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashpurchaseLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel143)
                .addGap(21, 21, 21)
                .addComponent(purprice, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel152)
                .addGap(18, 18, 18)
                .addComponent(purdiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel165)
                .addGap(10, 10, 10)
                .addComponent(purdiscounterror, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashpurchaseLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(purpriceerror, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashpurchaseLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel141)
                .addGap(21, 21, 21)
                .addComponent(purquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashpurchaseLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(purquantityerror, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashpurchaseLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel146)
                .addGap(18, 18, 18)
                .addComponent(purbill, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashpurchaseLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(purbuyerror, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(purbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dashpurchaseLayout.setVerticalGroup(
            dashpurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashpurchaseLayout.createSequentialGroup()
                .addGroup(dashpurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backpurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(dashpurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashpurchaseLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(purchaseid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(dashpurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashpurchaseLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(purdealerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashpurchaseLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(purdealeriderror, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(dashpurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashpurchaseLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(puragencyname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(dashpurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashpurchaseLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(puraccessoryid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashpurchaseLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(puraccessoryiderror, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(dashpurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashpurchaseLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(purbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(dashpurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashpurchaseLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(purbrandmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(dashpurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashpurchaseLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(puraccessoryname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(dashpurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashpurchaseLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(purprice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashpurchaseLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(purdiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashpurchaseLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(purdiscounterror, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(purpriceerror, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(dashpurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashpurchaseLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(purquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(purquantityerror, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(dashpurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashpurchaseLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(purbill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(dashpurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashpurchaseLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(purbuyerror, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(purbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        dashsale.setBackground(new java.awt.Color(0, 0, 0));
        dashsale.setPreferredSize(new java.awt.Dimension(660, 686));
        dashsale.setLayout(null);

        jLabel108.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("Sale");
        dashsale.add(jLabel108);
        jLabel108.setBounds(60, 0, 540, 60);

        backsale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slider_img/back.png"))); // NOI18N
        backsale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backsaleMouseClicked(evt);
            }
        });
        dashsale.add(backsale);
        backsale.setBounds(0, 0, 50, 60);

        jLabel109.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(255, 255, 255));
        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel109.setText("Customer ID :");
        dashsale.add(jLabel109);
        jLabel109.setBounds(24, 98, 129, 40);

        jLabel151.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(255, 255, 255));
        jLabel151.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel151.setText("Sale ID :");
        dashsale.add(jLabel151);
        jLabel151.setBounds(212, 60, 100, 30);

        saleid.setEditable(false);
        saleid.setBackground(new java.awt.Color(0, 0, 0));
        saleid.setForeground(new java.awt.Color(255, 255, 255));
        dashsale.add(saleid);
        saleid.setBounds(322, 62, 148, 30);

        salecustomerid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select Customer ID" }));
        salecustomerid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                salecustomeridItemStateChanged(evt);
            }
        });
        dashsale.add(salecustomerid);
        salecustomerid.setBounds(171, 105, 173, 30);

        jLabel153.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(255, 255, 255));
        jLabel153.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel153.setText("Customer Name :");
        dashsale.add(jLabel153);
        jLabel153.setBounds(14, 146, 139, 30);

        jLabel154.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(255, 255, 255));
        jLabel154.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel154.setText("Purchase ID :");
        dashsale.add(jLabel154);
        jLabel154.setBounds(24, 182, 129, 40);

        salepurchaseid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select Purchase ID" }));
        salepurchaseid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                salepurchaseidItemStateChanged(evt);
            }
        });
        dashsale.add(salepurchaseid);
        salepurchaseid.setBounds(171, 189, 173, 30);

        salecustomername.setEditable(false);
        salecustomername.setBackground(new java.awt.Color(0, 0, 0));
        salecustomername.setForeground(new java.awt.Color(255, 255, 255));
        dashsale.add(salecustomername);
        salecustomername.setBounds(171, 146, 443, 30);

        jLabel155.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(255, 255, 255));
        jLabel155.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel155.setText("Brand :");
        dashsale.add(jLabel155);
        jLabel155.setBounds(24, 230, 129, 30);

        jLabel156.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel156.setForeground(new java.awt.Color(255, 255, 255));
        jLabel156.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel156.setText("Brand Model :");
        dashsale.add(jLabel156);
        jLabel156.setBounds(14, 280, 139, 30);

        jLabel157.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel157.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel157.setText("Accessory Name :");
        dashsale.add(jLabel157);
        jLabel157.setBounds(9, 330, 144, 30);

        salebrand.setEditable(false);
        salebrand.setBackground(new java.awt.Color(0, 0, 0));
        salebrand.setForeground(new java.awt.Color(255, 255, 255));
        dashsale.add(salebrand);
        salebrand.setBounds(171, 232, 443, 30);

        salebrandmodel.setEditable(false);
        salebrandmodel.setBackground(new java.awt.Color(0, 0, 0));
        salebrandmodel.setForeground(new java.awt.Color(255, 255, 255));
        dashsale.add(salebrandmodel);
        salebrandmodel.setBounds(171, 282, 443, 30);

        salepurchaseprice.setEditable(false);
        salepurchaseprice.setBackground(new java.awt.Color(0, 0, 0));
        salepurchaseprice.setForeground(new java.awt.Color(255, 255, 255));
        dashsale.add(salepurchaseprice);
        salepurchaseprice.setBounds(170, 382, 183, 30);

        jLabel158.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel158.setForeground(new java.awt.Color(255, 255, 255));
        jLabel158.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel158.setText("Purchase Price :");
        dashsale.add(jLabel158);
        jLabel158.setBounds(0, 380, 153, 30);

        saleaccessoryname.setEditable(false);
        saleaccessoryname.setBackground(new java.awt.Color(0, 0, 0));
        saleaccessoryname.setForeground(new java.awt.Color(255, 255, 255));
        dashsale.add(saleaccessoryname);
        saleaccessoryname.setBounds(171, 332, 443, 30);

        jLabel159.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(255, 255, 255));
        jLabel159.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel159.setText("Stock :");
        dashsale.add(jLabel159);
        jLabel159.setBounds(395, 382, 55, 40);

        jLabel160.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel160.setForeground(new java.awt.Color(255, 255, 255));
        jLabel160.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel160.setText("Sale Price :");
        dashsale.add(jLabel160);
        jLabel160.setBounds(24, 432, 129, 30);

        jLabel161.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(255, 255, 255));
        jLabel161.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel161.setText("Total :");
        dashsale.add(jLabel161);
        jLabel161.setBounds(24, 482, 129, 30);

        jLabel162.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(255, 255, 255));
        jLabel162.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel162.setText("Discount :");
        dashsale.add(jLabel162);
        jLabel162.setBounds(10, 530, 139, 30);

        jLabel163.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel163.setForeground(new java.awt.Color(255, 255, 255));
        jLabel163.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel163.setText("GST :");
        dashsale.add(jLabel163);
        jLabel163.setBounds(370, 520, 80, 50);

        jLabel164.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(255, 255, 255));
        jLabel164.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel164.setText("Total Bill :");
        dashsale.add(jLabel164);
        jLabel164.setBounds(24, 576, 129, 30);

        saleprice.setBackground(new java.awt.Color(0, 0, 0));
        saleprice.setForeground(new java.awt.Color(255, 255, 255));
        saleprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                salepriceKeyPressed(evt);
            }
        });
        dashsale.add(saleprice);
        saleprice.setBounds(171, 434, 183, 30);

        saletotal.setEditable(false);
        saletotal.setBackground(new java.awt.Color(0, 0, 0));
        saletotal.setForeground(new java.awt.Color(255, 255, 255));
        dashsale.add(saletotal);
        saletotal.setBounds(170, 480, 183, 30);

        salediscount.setBackground(new java.awt.Color(0, 0, 0));
        salediscount.setForeground(new java.awt.Color(255, 255, 255));
        salediscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                salediscountKeyPressed(evt);
            }
        });
        dashsale.add(salediscount);
        salediscount.setBounds(170, 530, 150, 30);

        salegst.setBackground(new java.awt.Color(0, 0, 0));
        salegst.setForeground(new java.awt.Color(255, 255, 255));
        salegst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                salegstKeyPressed(evt);
            }
        });
        dashsale.add(salegst);
        salegst.setBounds(460, 530, 140, 30);

        salebill.setEditable(false);
        salebill.setBackground(new java.awt.Color(0, 0, 0));
        salebill.setForeground(new java.awt.Color(255, 255, 255));
        dashsale.add(salebill);
        salebill.setBounds(171, 578, 150, 30);

        salequantity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select Quantity", "1", "2", "3", "4", "5", "10", "20", "30" }));
        salequantity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                salequantityItemStateChanged(evt);
            }
        });
        dashsale.add(salequantity);
        salequantity.setBounds(460, 434, 160, 30);

        salesubmitbtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        salesubmitbtn.setText("Submit");
        salesubmitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesubmitbtnActionPerformed(evt);
            }
        });
        dashsale.add(salesubmitbtn);
        salesubmitbtn.setBounds(80, 620, 133, 35);

        saleviewbill.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        saleviewbill.setText("View My Bill");
        saleviewbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleviewbillActionPerformed(evt);
            }
        });
        dashsale.add(saleviewbill);
        saleviewbill.setBounds(450, 620, 140, 35);

        jLabel166.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(255, 255, 255));
        jLabel166.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel166.setText("Quantity :");
        dashsale.add(jLabel166);
        jLabel166.setBounds(372, 432, 77, 40);

        salestock.setEditable(false);
        salestock.setBackground(new java.awt.Color(0, 0, 0));
        salestock.setForeground(new java.awt.Color(255, 255, 255));
        dashsale.add(salestock);
        salestock.setBounds(460, 384, 160, 30);

        salecalculatebtn.setText("Calculate");
        salecalculatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salecalculatebtnActionPerformed(evt);
            }
        });
        dashsale.add(salecalculatebtn);
        salecalculatebtn.setBounds(340, 580, 120, 30);

        salecustomeriderror.setBackground(new java.awt.Color(0, 0, 0));
        salecustomeriderror.setForeground(new java.awt.Color(255, 0, 0));
        dashsale.add(salecustomeriderror);
        salecustomeriderror.setBounds(348, 110, 190, 18);

        salepurchaseiderror.setBackground(new java.awt.Color(0, 0, 0));
        salepurchaseiderror.setForeground(new java.awt.Color(255, 0, 0));
        dashsale.add(salepurchaseiderror);
        salepurchaseiderror.setBounds(350, 190, 190, 18);

        salediscounterror.setBackground(new java.awt.Color(0, 0, 0));
        salediscounterror.setForeground(new java.awt.Color(255, 0, 0));
        dashsale.add(salediscounterror);
        salediscounterror.setBounds(170, 560, 180, 10);

        salegsterror.setBackground(new java.awt.Color(0, 0, 0));
        salegsterror.setForeground(new java.awt.Color(255, 0, 0));
        dashsale.add(salegsterror);
        salegsterror.setBounds(460, 560, 160, 10);

        saletotalerror.setBackground(new java.awt.Color(0, 0, 0));
        saletotalerror.setForeground(new java.awt.Color(255, 0, 0));
        dashsale.add(saletotalerror);
        saletotalerror.setBounds(170, 510, 180, 10);

        salequantityerror.setBackground(new java.awt.Color(0, 0, 0));
        salequantityerror.setForeground(new java.awt.Color(255, 0, 0));
        dashsale.add(salequantityerror);
        salequantityerror.setBounds(460, 460, 180, 20);

        salepriceerror.setBackground(new java.awt.Color(0, 0, 0));
        salepriceerror.setForeground(new java.awt.Color(255, 0, 0));
        dashsale.add(salepriceerror);
        salepriceerror.setBounds(170, 470, 180, 10);

        salebillerror.setBackground(new java.awt.Color(0, 0, 0));
        salebillerror.setForeground(new java.awt.Color(255, 0, 0));
        dashsale.add(salebillerror);
        salebillerror.setBounds(10, 70, 190, 18);

        saleanother.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        saleanother.setText("Add Another Product");
        saleanother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleanotherActionPerformed(evt);
            }
        });
        dashsale.add(saleanother);
        saleanother.setBounds(250, 620, 160, 35);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("%");
        dashsale.add(jLabel4);
        jLabel4.setBounds(320, 530, 40, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("%");
        dashsale.add(jLabel15);
        jLabel15.setBounds(600, 530, 30, 30);

        dashreport.setBackground(new java.awt.Color(0, 0, 0));
        dashreport.setPreferredSize(new java.awt.Dimension(660, 686));
        dashreport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel114.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel114.setText("REPORT");
        dashreport.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 540, 60));

        backreport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slider_img/back.png"))); // NOI18N
        backreport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backreportMouseClicked(evt);
            }
        });
        dashreport.add(backreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 60));

        jButton13.setText("VIEW REPORT");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        dashreport.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 150, 50));

        jLabel173.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel173.setForeground(new java.awt.Color(255, 255, 255));
        jLabel173.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel173.setText("Sale ID :");
        dashreport.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, 30));

        reportsaleid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select Sale ID" }));
        dashreport.add(reportsaleid, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 150, 30));

        dashcart.setBackground(new java.awt.Color(0, 0, 0));
        dashcart.setPreferredSize(new java.awt.Dimension(660, 686));
        dashcart.setLayout(null);

        backcart.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Java Tution\\Bike_Accessories\\Bike_Accessories\\images\\main_frame\\tab2\\back.png")); // NOI18N
        backcart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backcartMouseClicked(evt);
            }
        });
        dashcart.add(backcart);
        backcart.setBounds(0, 0, 50, 50);

        jLabel115.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setText("My Cart");
        dashcart.add(jLabel115);
        jLabel115.setBounds(0, 0, 660, 58);

        carttable.setBackground(new java.awt.Color(0, 0, 0));
        carttable.setForeground(new java.awt.Color(255, 255, 255));
        carttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ", "price", "Quantity", "Amount"
            }
        ));
        carttable.setFocusable(false);
        carttable.setGridColor(new java.awt.Color(153, 153, 153));
        carttable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        carttable.setName(""); // NOI18N
        carttable.setRowHeight(28);
        carttable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(carttable);

        dashcart.add(jScrollPane4);
        jScrollPane4.setBounds(0, 220, 660, 230);

        jLabel175.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel175.setForeground(new java.awt.Color(255, 255, 255));
        jLabel175.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel175.setText("Name :");
        dashcart.add(jLabel175);
        jLabel175.setBounds(40, 150, 109, 30);

        jLabel176.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(255, 255, 255));
        jLabel176.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel176.setText("Total :");
        dashcart.add(jLabel176);
        jLabel176.setBounds(140, 470, 120, 30);
        dashcart.add(jSeparator28);
        jSeparator28.setBounds(70, 70, 530, 10);

        carttotal.setEditable(false);
        carttotal.setBackground(new java.awt.Color(0, 0, 0));
        carttotal.setForeground(new java.awt.Color(255, 255, 255));
        dashcart.add(carttotal);
        carttotal.setBounds(280, 470, 120, 30);

        cartcalbtn.setText("Calculate");
        cartcalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartcalbtnActionPerformed(evt);
            }
        });
        dashcart.add(cartcalbtn);
        cartcalbtn.setBounds(420, 470, 100, 30);

        jButton41.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton41.setText("Print My Bill");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        dashcart.add(jButton41);
        jButton41.setBounds(250, 540, 180, 40);

        cartid.setEditable(false);
        cartid.setBackground(new java.awt.Color(0, 0, 0));
        cartid.setForeground(new java.awt.Color(255, 255, 255));
        dashcart.add(cartid);
        cartid.setBounds(340, 80, 160, 30);

        jLabel199.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel199.setForeground(new java.awt.Color(255, 255, 255));
        jLabel199.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel199.setText("Purchase ID :");
        dashcart.add(jLabel199);
        jLabel199.setBounds(210, 80, 109, 30);

        cartcustomername.setBackground(new java.awt.Color(0, 0, 0));
        cartcustomername.setForeground(new java.awt.Color(153, 153, 153));
        cartcustomername.setText("full name");
        cartcustomername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cartcustomernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cartcustomernameFocusLost(evt);
            }
        });
        cartcustomername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cartcustomernameKeyPressed(evt);
            }
        });
        dashcart.add(cartcustomername);
        cartcustomername.setBounds(160, 150, 440, 30);

        dashsetting.setBackground(new java.awt.Color(0, 0, 0));
        dashsetting.setPreferredSize(new java.awt.Dimension(660, 686));
        dashsetting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel116.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setText("New Customer");
        dashsetting.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 600, 60));

        backsetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slider_img/back.png"))); // NOI18N
        backsetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backsettingMouseClicked(evt);
            }
        });
        dashsetting.add(backsetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 60));

        jLabel117.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("Full Name :");
        dashsetting.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 30));
        dashsetting.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 230, 30));

        bmw.setBackground(new java.awt.Color(0, 0, 0));
        bmw.setPreferredSize(new java.awt.Dimension(660, 686));
        bmw.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("BMW");
        jLabel10.setPreferredSize(new java.awt.Dimension(1810, 43));
        bmw.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 660, -1));
        bmw.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 60, 586, 10));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmw/front disc.jpg"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("FRONT DISC PROTECTOR G310GS");

        jLabel30.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Qty :");

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton1.setText("Add");

        jLabel8.setText("Price :");

        jLabel9.setText("899");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))))
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30))))
        );

        bmw.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, -1, -1));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setForeground(new java.awt.Color(153, 153, 153));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmw/crash.jpg"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("BLACK CRASH GUARD G310GS");

        jLabel31.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Qty :");

        jComboBox31.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox31.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton2.setText("Add");

        jLabel20.setText("Price :");

        jLabel21.setText("16000");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31))))
        );

        bmw.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setForeground(new java.awt.Color(153, 153, 153));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmw/saddle stay.jpg"))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("SADDLESTAY G310GS");

        jLabel35.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Qty :");

        jComboBox32.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox32.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton32.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton32.setText("Add");

        jLabel36.setText("Price :");

        jLabel37.setText("1700");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35))))
        );

        bmw.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 88, -1, -1));

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));
        jPanel10.setForeground(new java.awt.Color(153, 153, 153));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmw/top_rack.jpg"))); // NOI18N

        jLabel43.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("TOPRACK PLATE NEW BLACK G310GS");

        jLabel44.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Qty :");

        jComboBox33.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox33.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton35.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton35.setText("Add");

        jLabel45.setText("Price :");

        jLabel98.setText("2199");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel98))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel44))))
        );

        bmw.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 380, -1, -1));

        jPanel15.setBackground(new java.awt.Color(153, 153, 153));
        jPanel15.setForeground(new java.awt.Color(153, 153, 153));

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmw/radiator.jpg"))); // NOI18N

        jLabel101.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("RADIATOR GUARD GRILL BLACK");

        jLabel102.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("Qty :");

        jComboBox34.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox34.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton36.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton36.setText("Add");

        jLabel103.setText("Price :");

        jLabel171.setText("3100");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel101, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel103)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(jLabel171))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel102))))
        );

        bmw.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 88, -1, -1));

        honda.setBackground(new java.awt.Color(0, 0, 0));
        honda.setPreferredSize(new java.awt.Dimension(660, 686));
        honda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel297.setBackground(new java.awt.Color(0, 0, 0));
        jLabel297.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel297.setForeground(new java.awt.Color(255, 255, 255));
        jLabel297.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel297.setText("HONDA");
        jLabel297.setPreferredSize(new java.awt.Dimension(1810, 43));
        honda.add(jLabel297, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 660, -1));
        honda.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 60, 586, 10));

        jPanel47.setBackground(new java.awt.Color(153, 153, 153));
        jPanel47.setForeground(new java.awt.Color(153, 153, 153));

        jLabel298.setIcon(new javax.swing.ImageIcon(getClass().getResource("/honda/toprack.jpg"))); // NOI18N

        jLabel299.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel299.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel299.setText("TOPRACK PILLION BACKREST CB350");

        jLabel300.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel300.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel300.setText("Qty :");

        jComboBox6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton11.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton11.setText("Add");

        jLabel301.setText("Price :");

        jLabel302.setText("2599");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel298, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel299, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addComponent(jLabel300, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addComponent(jLabel301)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel302, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addComponent(jLabel298)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel299, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel301)
                    .addComponent(jLabel302))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel300))))
        );

        honda.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, -1, -1));

        jPanel48.setBackground(new java.awt.Color(153, 153, 153));
        jPanel48.setForeground(new java.awt.Color(153, 153, 153));

        jLabel303.setIcon(new javax.swing.ImageIcon(getClass().getResource("/honda/headlight.jpg"))); // NOI18N

        jLabel304.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel304.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel304.setText("HEAD LIGHT GRILL CB350");

        jLabel305.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel305.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel305.setText("Qty :");

        jComboBox56.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox56.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton12.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton12.setText("Add");

        jLabel306.setText("Price :");

        jLabel307.setText("1200");

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel303, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel304, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addComponent(jLabel305, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addComponent(jLabel306)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel307, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addComponent(jLabel303)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel304, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel306)
                    .addComponent(jLabel307))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox56, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel305))))
        );

        honda.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jPanel49.setBackground(new java.awt.Color(153, 153, 153));
        jPanel49.setForeground(new java.awt.Color(153, 153, 153));

        jLabel308.setIcon(new javax.swing.ImageIcon(getClass().getResource("/honda/bashplate.jpg"))); // NOI18N

        jLabel309.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel309.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel309.setText("BASH PLATE ALUMINIUM CB350");

        jLabel310.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel310.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel310.setText("Qty :");

        jComboBox57.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox57.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton54.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton54.setText("Add");

        jLabel311.setText("Price :");

        jLabel312.setText("2650");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel308, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel309, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addComponent(jLabel310, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addComponent(jLabel311)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel312, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addComponent(jLabel308)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel309, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel311)
                    .addComponent(jLabel312))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox57, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel310))))
        );

        honda.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 88, -1, -1));

        jPanel51.setBackground(new java.awt.Color(153, 153, 153));
        jPanel51.setForeground(new java.awt.Color(153, 153, 153));

        jLabel318.setIcon(new javax.swing.ImageIcon(getClass().getResource("/honda/crashguard.jpg"))); // NOI18N

        jLabel319.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel319.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel319.setText("CRASH GUARD CB300R ");

        jLabel320.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel320.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel320.setText("Qty :");

        jComboBox59.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox59.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton56.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton56.setText("Add");

        jLabel321.setText("Price :");

        jLabel322.setText("4200");

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel318, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel319, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addComponent(jLabel320, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addComponent(jLabel321)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel322, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addComponent(jLabel318)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel319, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel321)
                    .addComponent(jLabel322))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox59, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel320))))
        );

        honda.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 88, -1, -1));

        royal_enfield.setBackground(new java.awt.Color(0, 0, 0));
        royal_enfield.setPreferredSize(new java.awt.Dimension(660, 686));
        royal_enfield.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel266.setBackground(new java.awt.Color(0, 0, 0));
        jLabel266.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel266.setForeground(new java.awt.Color(255, 255, 255));
        jLabel266.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel266.setText("ROYAL ENFIELD");
        jLabel266.setPreferredSize(new java.awt.Dimension(1810, 43));
        royal_enfield.add(jLabel266, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 660, -1));
        royal_enfield.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 60, 586, 10));

        jPanel41.setBackground(new java.awt.Color(153, 153, 153));
        jPanel41.setForeground(new java.awt.Color(153, 153, 153));

        jLabel267.setIcon(new javax.swing.ImageIcon(getClass().getResource("/royalenfield/foglight.jpg"))); // NOI18N

        jLabel268.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel268.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel268.setText("FOG LIGHT MOUNT HIMALAYAN BS6");

        jLabel269.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel269.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel269.setText("Qty :");

        jComboBox5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton9.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton9.setText("Add");

        jLabel270.setText("Price :");

        jLabel271.setText("699");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel267, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel268, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jLabel269, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jLabel270)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel271, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addComponent(jLabel267)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel268, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel270)
                    .addComponent(jLabel271))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel269))))
        );

        royal_enfield.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, -1, -1));

        jPanel42.setBackground(new java.awt.Color(153, 153, 153));
        jPanel42.setForeground(new java.awt.Color(153, 153, 153));

        jLabel272.setIcon(new javax.swing.ImageIcon(getClass().getResource("/royalenfield/toprack.jpg"))); // NOI18N

        jLabel273.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel273.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel273.setText("TOPRACK W-1 COMPATIBLE ");

        jLabel274.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel274.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel274.setText("Qty :");

        jComboBox51.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox51.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton10.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton10.setText("Add");

        jLabel275.setText("Price :");

        jLabel276.setText("3100");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel272, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel273, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel274, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel275)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel276, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(jLabel272)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel273, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel275)
                    .addComponent(jLabel276))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox51, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel274))))
        );

        royal_enfield.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jPanel43.setBackground(new java.awt.Color(153, 153, 153));
        jPanel43.setForeground(new java.awt.Color(153, 153, 153));

        jLabel277.setIcon(new javax.swing.ImageIcon(getClass().getResource("/royalenfield/frontfluid.jpg"))); // NOI18N

        jLabel278.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel278.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel278.setText("FRONT FLUID RESERVOIR COVER ");

        jLabel279.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel279.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel279.setText("Qty :");

        jComboBox52.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox52.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton50.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton50.setText("Add");

        jLabel280.setText("Price :");

        jLabel281.setText("599");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel277, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel278, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel279, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel280)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel281, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addComponent(jLabel277)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel278, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel280)
                    .addComponent(jLabel281))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox52, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel279))))
        );

        royal_enfield.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 88, -1, -1));

        jPanel44.setBackground(new java.awt.Color(153, 153, 153));
        jPanel44.setForeground(new java.awt.Color(153, 153, 153));

        jLabel282.setIcon(new javax.swing.ImageIcon(getClass().getResource("/royalenfield/grill.jpg"))); // NOI18N

        jLabel283.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel283.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel283.setText("HEAD LIGHT GRILL TYPE 4A BLACK");

        jLabel284.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel284.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel284.setText("Qty :");

        jComboBox53.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox53.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton51.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton51.setText("Add");

        jLabel285.setText("Price :");

        jLabel286.setText("1599");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel282, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel283, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel284, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel285)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel286, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(jLabel282)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel283, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel285)
                    .addComponent(jLabel286))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox53, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel284))))
        );

        royal_enfield.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 380, -1, -1));

        jPanel45.setBackground(new java.awt.Color(153, 153, 153));
        jPanel45.setForeground(new java.awt.Color(153, 153, 153));

        jLabel287.setIcon(new javax.swing.ImageIcon(getClass().getResource("/royalenfield/legguard.jpg"))); // NOI18N

        jLabel288.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel288.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel288.setText("LEG GUARD WITH SLIDER");

        jLabel289.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel289.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel289.setText("Qty :");

        jComboBox54.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox54.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton52.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton52.setText("Add");

        jLabel290.setText("Price :");

        jLabel291.setText("4800");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel287, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel288, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel289, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel290)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel291, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addComponent(jLabel287)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel288, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel290)
                    .addComponent(jLabel291))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox54, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel289))))
        );

        royal_enfield.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 88, -1, -1));

        jPanel46.setBackground(new java.awt.Color(153, 153, 153));
        jPanel46.setForeground(new java.awt.Color(153, 153, 153));

        jLabel292.setIcon(new javax.swing.ImageIcon(getClass().getResource("/royalenfield/rearmaster.jpg"))); // NOI18N

        jLabel293.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel293.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel293.setText("REAR MASTER CYLINDER PROTECTOR");

        jLabel294.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel294.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel294.setText("Qty :");

        jComboBox55.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox55.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton53.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton53.setText("Add");

        jLabel295.setText("Price :");

        jLabel296.setText("999");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel292, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel293, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addComponent(jLabel294, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addComponent(jLabel295)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel296, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addComponent(jLabel292)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel293, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel295)
                    .addComponent(jLabel296))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox55, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel294))))
        );

        royal_enfield.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        ktm.setBackground(new java.awt.Color(0, 0, 0));
        ktm.setPreferredSize(new java.awt.Dimension(660, 686));
        ktm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel235.setBackground(new java.awt.Color(0, 0, 0));
        jLabel235.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel235.setForeground(new java.awt.Color(255, 255, 255));
        jLabel235.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel235.setText("KTM");
        jLabel235.setPreferredSize(new java.awt.Dimension(1810, 43));
        ktm.add(jLabel235, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 660, -1));
        ktm.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 60, 586, 10));

        jPanel14.setBackground(new java.awt.Color(153, 153, 153));
        jPanel14.setForeground(new java.awt.Color(153, 153, 153));

        jLabel236.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ktm/frontdisc.jpg"))); // NOI18N

        jLabel237.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel237.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel237.setText("FRONT DISC CALIPER PROTECTOR");

        jLabel238.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel238.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel238.setText("Qty :");

        jComboBox4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton7.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton7.setText("Add");

        jLabel239.setText("Price :");

        jLabel240.setText("899");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel236, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel237, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel238, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel239)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel240, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel236)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel237, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel239)
                    .addComponent(jLabel240))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel238))))
        );

        ktm.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, -1, -1));

        jPanel23.setBackground(new java.awt.Color(153, 153, 153));
        jPanel23.setForeground(new java.awt.Color(153, 153, 153));

        jLabel241.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ktm/fluid.jpg"))); // NOI18N

        jLabel242.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel242.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel242.setText("FRONT FLUID RESERVOIR COVER ADV");

        jLabel243.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel243.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel243.setText("Qty :");

        jComboBox46.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox46.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton8.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton8.setText("Add");

        jLabel244.setText("Price :");

        jLabel245.setText("599");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel241, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel242, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel243, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel244)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel245, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel241)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel242, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel244)
                    .addComponent(jLabel245))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox46, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel243))))
        );

        ktm.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jPanel37.setBackground(new java.awt.Color(153, 153, 153));
        jPanel37.setForeground(new java.awt.Color(153, 153, 153));

        jLabel246.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ktm/saddlestay.jpg"))); // NOI18N

        jLabel247.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel247.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel247.setText("SADDLESTAY MATT BLACK RC200/390");

        jLabel248.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel248.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel248.setText("Qty :");

        jComboBox47.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox47.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton46.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton46.setText("Add");

        jLabel249.setText("Price :");

        jLabel250.setText("2500");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel246, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel247, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jLabel248, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jLabel249)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel250, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(jLabel246)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel247, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel249)
                    .addComponent(jLabel250))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel248))))
        );

        ktm.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 88, -1, -1));

        jPanel38.setBackground(new java.awt.Color(153, 153, 153));
        jPanel38.setForeground(new java.awt.Color(153, 153, 153));

        jLabel251.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ktm/frame.jpg"))); // NOI18N

        jLabel252.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel252.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel252.setText("FRAME SLIDERS KTM RC200/390");

        jLabel253.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel253.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel253.setText("Qty :");

        jComboBox48.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox48.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton47.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton47.setText("Add");

        jLabel254.setText("Price :");

        jLabel255.setText("2800");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel251, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel252, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jLabel253, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jLabel254)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel255, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addComponent(jLabel251)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel252, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel254)
                    .addComponent(jLabel255))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox48, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel253))))
        );

        ktm.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 380, -1, -1));

        jPanel39.setBackground(new java.awt.Color(153, 153, 153));
        jPanel39.setForeground(new java.awt.Color(153, 153, 153));

        jLabel256.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ktm/crashguard.jpg"))); // NOI18N

        jLabel257.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel257.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel257.setText("CRASH GUARD DUKE200 BS6");

        jLabel258.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel258.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel258.setText("Qty :");

        jComboBox49.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox49.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton48.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton48.setText("Add");

        jLabel259.setText("Price :");

        jLabel260.setText("4800");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel256, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel257, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(jLabel258, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(jLabel259)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel260, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addComponent(jLabel256)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel257, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel259)
                    .addComponent(jLabel260))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox49, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel258))))
        );

        ktm.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 88, -1, -1));

        kawasaki.setBackground(new java.awt.Color(0, 0, 0));
        kawasaki.setPreferredSize(new java.awt.Dimension(660, 686));
        kawasaki.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel204.setBackground(new java.awt.Color(0, 0, 0));
        jLabel204.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel204.setForeground(new java.awt.Color(255, 255, 255));
        jLabel204.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel204.setText("KAWASAKI");
        jLabel204.setPreferredSize(new java.awt.Dimension(1810, 43));
        kawasaki.add(jLabel204, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 660, -1));
        kawasaki.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 60, 586, 10));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        jLabel205.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kawasaki/radiator.jpg"))); // NOI18N

        jLabel206.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel206.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel206.setText("RADIATOR GUARD GRILL BLACK");

        jLabel207.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel207.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel207.setText("Qty :");

        jComboBox3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton5.setText("Add");

        jLabel208.setText("Price :");

        jLabel209.setText("3100");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel205, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel206, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel207, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel208)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel209, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel205)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel206, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel208)
                    .addComponent(jLabel209))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel207))))
        );

        kawasaki.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, -1, -1));

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setForeground(new java.awt.Color(153, 153, 153));

        jLabel210.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kawasaki/crashguardz900.jpg"))); // NOI18N

        jLabel211.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel211.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel211.setText("CRASH GUARD FOR Z900 2017-2019");

        jLabel212.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel212.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel212.setText("Qty :");

        jComboBox41.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox41.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton6.setText("Add");

        jLabel213.setText("Price :");

        jLabel214.setText("6000");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel210, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel211, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel212, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel213)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel214, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel210)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel211, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel213)
                    .addComponent(jLabel214))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel212))))
        );

        kawasaki.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jPanel12.setBackground(new java.awt.Color(153, 153, 153));
        jPanel12.setForeground(new java.awt.Color(153, 153, 153));

        jLabel215.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kawasaki/crashguard.jpg"))); // NOI18N

        jLabel216.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel216.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel216.setText("CRASH GUARD WITH SLIDER BLACK  ");

        jLabel217.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel217.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel217.setText("Qty :");

        jComboBox42.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox42.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton42.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton42.setText("Add");

        jLabel218.setText("Price :");

        jLabel219.setText("10000");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel215, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel216, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel217, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel218)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel219, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel215)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel216, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel218)
                    .addComponent(jLabel219))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel217))))
        );

        kawasaki.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 88, -1, -1));

        jPanel19.setBackground(new java.awt.Color(153, 153, 153));
        jPanel19.setForeground(new java.awt.Color(153, 153, 153));

        jLabel225.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kawasaki/saddlestay.jpg"))); // NOI18N

        jLabel226.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel226.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel226.setText("SADDLE STAY VERSYS 650");

        jLabel227.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel227.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel227.setText("Qty :");

        jComboBox44.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox44.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton44.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton44.setText("Add");

        jLabel228.setText("Price :");

        jLabel229.setText("3300");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel225, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel226, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel227, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel228)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel229, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel225)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel226, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel228)
                    .addComponent(jLabel229))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel227))))
        );

        kawasaki.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 88, -1, -1));

        bajaj.setBackground(new java.awt.Color(0, 0, 0));
        bajaj.setPreferredSize(new java.awt.Dimension(660, 686));
        bajaj.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("BAJAJ");
        jLabel34.setPreferredSize(new java.awt.Dimension(1810, 43));
        bajaj.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 660, -1));
        bajaj.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 60, 586, 10));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bajaj/crash guard.jpg"))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("CRASH GUARD WITH SLIDER NS200");

        jLabel97.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("Qty :");

        jComboBox2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton3.setText("Add");

        jLabel177.setText("Price :");

        jLabel178.setText("4400");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel177)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel178, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel177)
                    .addComponent(jLabel178))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel97))))
        );

        bajaj.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, -1, -1));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setForeground(new java.awt.Color(153, 153, 153));

        jLabel179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bajaj/radiator.jpg"))); // NOI18N

        jLabel180.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel180.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel180.setText("RADIATOR GRILL BLACK DOMINAR");

        jLabel181.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel181.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel181.setText("Qty :");

        jComboBox36.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox36.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton4.setText("Add");

        jLabel182.setText("Price :");

        jLabel183.setText("1699");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel179, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel180, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel182)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel179)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel180, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel182)
                    .addComponent(jLabel183))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel181))))
        );

        bajaj.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setForeground(new java.awt.Color(153, 153, 153));

        jLabel184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bajaj/crash_guard.jpg"))); // NOI18N

        jLabel185.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel185.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel185.setText("CRASH GUARD BLACK DOMINAR400");

        jLabel186.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel186.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel186.setText("Qty :");

        jComboBox37.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox37.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton38.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton38.setText("Add");

        jLabel187.setText("Price :");

        jLabel188.setText("4800");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel184, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel185, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel186, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel187)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel188, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel184)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel185, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel187)
                    .addComponent(jLabel188))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox37, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel186))))
        );

        bajaj.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 88, -1, -1));

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));
        jPanel11.setForeground(new java.awt.Color(153, 153, 153));

        jLabel189.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bajaj/top rack.jpg"))); // NOI18N

        jLabel190.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel190.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel190.setText("TOP RACK WITH PILLION SEAT");

        jLabel191.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel191.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel191.setText("Qty :");

        jComboBox38.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox38.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton39.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton39.setText("Add");

        jLabel192.setText("Price :");

        jLabel193.setText("4200");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel189, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel190, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel191, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel192)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel193, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel189)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel190, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel192)
                    .addComponent(jLabel193))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel191))))
        );

        bajaj.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 380, -1, -1));

        jPanel17.setBackground(new java.awt.Color(153, 153, 153));
        jPanel17.setForeground(new java.awt.Color(153, 153, 153));

        jLabel194.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bajaj/fluid reservoir.jpg"))); // NOI18N

        jLabel195.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel195.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel195.setText("FLUID RESERVOIR COVER DOMINAR400");

        jLabel196.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel196.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel196.setText("Qty :");

        jComboBox39.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox39.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "10", "20" }));

        jButton40.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton40.setText("Add");

        jLabel197.setText("Price :");

        jLabel198.setText("599");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel194, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel195, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel197)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel194)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel197)
                    .addComponent(jLabel198))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel196))))
        );

        bajaj.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 88, -1, -1));

        billtable.setBackground(new java.awt.Color(0, 0, 0));
        billtable.setPreferredSize(new java.awt.Dimension(660, 686));
        billtable.setLayout(null);

        jLabel167.setFont(new java.awt.Font("Bodoni MT", 0, 48)); // NOI18N
        jLabel167.setForeground(new java.awt.Color(255, 255, 255));
        jLabel167.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel167.setText("BILL");
        billtable.add(jLabel167);
        jLabel167.setBounds(70, 10, 530, 60);

        btable.setBackground(new java.awt.Color(0, 0, 0));
        btable.setForeground(new java.awt.Color(255, 255, 255));
        btable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sale ID", "Brand", "Model", "Accessory", "Quantity", "Price"
            }
        ));
        btable.setFocusable(false);
        btable.setGridColor(new java.awt.Color(153, 153, 153));
        btable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        btable.setName(""); // NOI18N
        btable.setRowHeight(28);
        btable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(btable);

        billtable.add(jScrollPane1);
        jScrollPane1.setBounds(0, 250, 660, 110);

        jLabel168.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(255, 255, 255));
        jLabel168.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel168.setText("Sale ID :");
        billtable.add(jLabel168);
        jLabel168.setBounds(50, 90, 109, 30);

        billcustomername.setEditable(false);
        billcustomername.setBackground(new java.awt.Color(0, 0, 0));
        billcustomername.setForeground(new java.awt.Color(255, 255, 255));
        billtable.add(billcustomername);
        billcustomername.setBounds(170, 190, 450, 30);

        jLabel169.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(255, 255, 255));
        jLabel169.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel169.setText("Total :");
        billtable.add(jLabel169);
        jLabel169.setBounds(140, 390, 120, 30);

        billcustomerid.setEditable(false);
        billcustomerid.setBackground(new java.awt.Color(0, 0, 0));
        billcustomerid.setForeground(new java.awt.Color(255, 255, 255));
        billtable.add(billcustomerid);
        billcustomerid.setBounds(170, 140, 450, 30);
        billtable.add(jSeparator22);
        jSeparator22.setBounds(70, 70, 530, 10);

        jLabel170.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(255, 255, 255));
        jLabel170.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel170.setText("Customer Name :");
        billtable.add(jLabel170);
        jLabel170.setBounds(20, 190, 139, 30);

        billtotal.setEditable(false);
        billtotal.setBackground(new java.awt.Color(0, 0, 0));
        billtotal.setForeground(new java.awt.Color(255, 255, 255));
        billtable.add(billtotal);
        billtotal.setBounds(280, 390, 120, 30);

        jButton33.setText("Calculate");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        billtable.add(jButton33);
        jButton33.setBounds(420, 390, 100, 30);

        jButton34.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton34.setText("Save My Bill");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        billtable.add(jButton34);
        jButton34.setBounds(250, 450, 180, 40);

        billid.setEditable(false);
        billid.setBackground(new java.awt.Color(0, 0, 0));
        billid.setForeground(new java.awt.Color(255, 255, 255));
        billtable.add(billid);
        billid.setBounds(170, 90, 450, 30);

        jLabel172.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(255, 255, 255));
        jLabel172.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel172.setText("Customer ID :");
        billtable.add(jLabel172);
        jLabel172.setBounds(50, 140, 109, 30);

        javax.swing.GroupLayout contentpanelLayout = new javax.swing.GroupLayout(contentpanel);
        contentpanel.setLayout(contentpanelLayout);
        contentpanelLayout.setHorizontalGroup(
            contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentpanelLayout.createSequentialGroup()
                .addComponent(tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tab4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tab6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tab7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashaddcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashaccessories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashpurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashsale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashreport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashsetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashdealer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bmw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(billtable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(honda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(royal_enfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ktm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kawasaki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bajaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashcart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tab5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentpanelLayout.setVerticalGroup(
            contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tab3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tab4, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tab6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tab7, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashaddcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashaccessories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashpurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashsale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashreport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashsetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashdealer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bmw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(billtable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(honda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(royal_enfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ktm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kawasaki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bajaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dashcart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentpanelLayout.createSequentialGroup()
                    .addComponent(tab5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );

        mainpanel.add(contentpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 660, 670));

        sidepanel.setBackground(new java.awt.Color(102, 102, 102));
        sidepanel.setPreferredSize(new java.awt.Dimension(210, 867));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepanellogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sidepanellogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/sidepanel.png"))); // NOI18N
        sidepanel.add(sidepanellogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 180, 70));

        usernamelbl.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        usernamelbl.setForeground(new java.awt.Color(255, 255, 255));
        usernamelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernamelbl.setText("Username");
        sidepanel.add(usernamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 180, 30));

        hometab.setBackground(new java.awt.Color(153, 153, 153));
        hometab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hometab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hometabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hometabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hometabMouseExited(evt);
            }
        });
        hometab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeimg.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        homeimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/home.png"))); // NOI18N
        homeimg.setToolTipText("");
        homeimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeimgMouseClicked(evt);
            }
        });
        hometab.add(homeimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        tab1lbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tab1lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tab1lbl.setText("Home");
        hometab.add(tab1lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 60));

        sidepanel.add(hometab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 180, 60));

        dashboardtab.setBackground(new java.awt.Color(102, 102, 102));
        dashboardtab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardtab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardtabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardtabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardtabMouseExited(evt);
            }
        });
        dashboardtab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardimg.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        dashboardimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/dashboard.png"))); // NOI18N
        dashboardimg.setToolTipText("");
        dashboardtab.add(dashboardimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        tab2lbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tab2lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tab2lbl.setText("Dashboard");
        dashboardtab.add(tab2lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 60));

        sidepanel.add(dashboardtab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 180, 60));

        brandstab.setBackground(new java.awt.Color(102, 102, 102));
        brandstab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brandstab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brandstabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                brandstabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                brandstabMouseExited(evt);
            }
        });
        brandstab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brandsimg.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        brandsimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        brandsimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/brands.png"))); // NOI18N
        brandsimg.setToolTipText("");
        brandstab.add(brandsimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        tab3lbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tab3lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tab3lbl.setText("Brands");
        brandstab.add(tab3lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 60));

        sidepanel.add(brandstab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 180, 60));

        accessoriestab.setBackground(new java.awt.Color(102, 102, 102));
        accessoriestab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accessoriestab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accessoriestabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accessoriestabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accessoriestabMouseExited(evt);
            }
        });
        accessoriestab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accessoriesimg.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        accessoriesimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accessoriesimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/accessories.png"))); // NOI18N
        accessoriesimg.setToolTipText("");
        accessoriestab.add(accessoriesimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        tab4lbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tab4lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tab4lbl.setText("Accessories");
        accessoriestab.add(tab4lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 60));

        jPanel21.setBackground(new java.awt.Color(204, 0, 0));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/home.png"))); // NOI18N
        jLabel40.setToolTipText("");
        jPanel21.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        jLabel41.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Home");
        jPanel21.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 180, 20));

        accessoriestab.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 180, 60));

        sidepanel.add(accessoriestab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 180, 60));

        offerstab.setBackground(new java.awt.Color(102, 102, 102));
        offerstab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        offerstab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                offerstabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                offerstabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                offerstabMouseExited(evt);
            }
        });
        offerstab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        offersimg.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        offersimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offersimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/offers.png"))); // NOI18N
        offersimg.setToolTipText("");
        offerstab.add(offersimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        tab5lbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tab5lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tab5lbl.setText("Offers");
        offerstab.add(tab5lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 60));

        sidepanel.add(offerstab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 180, 60));

        supporttab.setBackground(new java.awt.Color(102, 102, 102));
        supporttab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        supporttab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supporttabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                supporttabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                supporttabMouseExited(evt);
            }
        });
        supporttab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        supportimg.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        supportimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        supportimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/support.png"))); // NOI18N
        supportimg.setToolTipText("");
        supporttab.add(supportimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        tab6lbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tab6lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tab6lbl.setText("Support");
        supporttab.add(tab6lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 60));

        sidepanel.add(supporttab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 180, 60));

        abouttab.setBackground(new java.awt.Color(102, 102, 102));
        abouttab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abouttab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abouttabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                abouttabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                abouttabMouseExited(evt);
            }
        });
        abouttab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aboutimg.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        aboutimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aboutimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/About.png"))); // NOI18N
        aboutimg.setToolTipText("");
        abouttab.add(aboutimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        tab7lbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tab7lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tab7lbl.setText("About");
        abouttab.add(tab7lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 60));

        sidepanel.add(abouttab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 180, 60));

        logouttab.setBackground(new java.awt.Color(102, 102, 102));
        logouttab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logouttab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logouttabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logouttabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logouttabMouseExited(evt);
            }
        });
        logouttab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/logout.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        logouttab.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        tab8lbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tab8lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tab8lbl.setText("Logout");
        tab8lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab8lblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab8lblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab8lblMouseExited(evt);
            }
        });
        logouttab.add(tab8lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 60));

        sidepanel.add(logouttab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 180, 60));

        instagramtab.setBackground(new java.awt.Color(102, 102, 102));
        instagramtab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        instagramtab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instagramtabMouseClicked(evt);
            }
        });

        instagrambtn.setBackground(new java.awt.Color(102, 102, 102));
        instagrambtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/instagram.png"))); // NOI18N
        instagrambtn.setBorder(null);
        instagrambtn.setBorderPainted(false);
        instagrambtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        instagrambtn.setFocusable(false);
        instagrambtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instagrambtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                instagrambtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                instagrambtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout instagramtabLayout = new javax.swing.GroupLayout(instagramtab);
        instagramtab.setLayout(instagramtabLayout);
        instagramtabLayout.setHorizontalGroup(
            instagramtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instagramtabLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(instagrambtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        instagramtabLayout.setVerticalGroup(
            instagramtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instagramtabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instagrambtn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        sidepanel.add(instagramtab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 90, 60));

        facebooktab.setBackground(new java.awt.Color(102, 102, 102));
        facebooktab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facebooktab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facebooktabMouseClicked(evt);
            }
        });

        facebookbtn.setBackground(new java.awt.Color(102, 102, 102));
        facebookbtn.setForeground(new java.awt.Color(255, 255, 255));
        facebookbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/facebook.png"))); // NOI18N
        facebookbtn.setBorder(null);
        facebookbtn.setBorderPainted(false);
        facebookbtn.setFocusable(false);
        facebookbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facebookbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                facebookbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facebookbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout facebooktabLayout = new javax.swing.GroupLayout(facebooktab);
        facebooktab.setLayout(facebooktabLayout);
        facebooktabLayout.setHorizontalGroup(
            facebooktabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(facebooktabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(facebooktabLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(facebookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );
        facebooktabLayout.setVerticalGroup(
            facebooktabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(facebooktabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(facebooktabLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(facebookbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        sidepanel.add(facebooktab, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 90, 60));
        sidepanel.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 180, 10));

        mainpanel.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 180, 670));

        titlepanel.setBackground(new java.awt.Color(255, 255, 255));
        titlepanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titlepanelMouseDragged(evt);
            }
        });
        titlepanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titlepanelMousePressed(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel95.setText("Bikers World");

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard_img/logo.png"))); // NOI18N

        closebtn.setBackground(new java.awt.Color(255, 255, 255));
        closebtn.setText("X");
        closebtn.setFocusable(false);
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closebtnMouseExited(evt);
            }
        });
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });

        minimizebtn.setBackground(new java.awt.Color(255, 255, 255));
        minimizebtn.setText("-");
        minimizebtn.setFocusable(false);
        minimizebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizebtnMouseExited(evt);
            }
        });
        minimizebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titlepanelLayout = new javax.swing.GroupLayout(titlepanel);
        titlepanel.setLayout(titlepanelLayout);
        titlepanelLayout.setHorizontalGroup(
            titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlepanelLayout.createSequentialGroup()
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 637, Short.MAX_VALUE)
                .addComponent(minimizebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closebtn))
        );
        titlepanelLayout.setVerticalGroup(
            titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlepanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(titlepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(closebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minimizebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        mainpanel.add(titlepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("bike accessories");
        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(840, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tab8lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab8lblMouseClicked
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_tab8lblMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void hometabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hometabMouseClicked
        tab1.setVisible(true);
        tab2.setVisible(false);
        tab3.setVisible(false);
        tab4.setVisible(false);
        tab5.setVisible(false);
        tab6.setVisible(false);
        tab7.setVisible(false);
        dashaddcustomer.setVisible(false);
        dashdealer.setVisible(false);
        dashaccessories.setVisible(false);
        dashpurchase.setVisible(false);
        dashsale.setVisible(false);
        dashcart.setVisible(false);
        dashreport.setVisible(false);
        dashsetting.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
        billtable.setVisible(false);
        hometab.setBackground(new Color(153, 153, 153));
        dashboardtab.setBackground(new Color(102, 102, 102));
        brandstab.setBackground(new Color(102, 102, 102));
        accessoriestab.setBackground(new Color(102, 102, 102));
        offerstab.setBackground(new Color(102, 102, 102));
        supporttab.setBackground(new Color(102, 102, 102));
        abouttab.setBackground(new Color(102, 102, 102));
        instagramtab.setBackground(new Color(102, 102, 102));
        facebooktab.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_hometabMouseClicked

    private void dashboardtabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardtabMouseClicked
        tab2.setVisible(true);
        tab1.setVisible(false);
        tab3.setVisible(false);
        tab4.setVisible(false);
        tab5.setVisible(false);
        tab6.setVisible(false);
        tab7.setVisible(false);
        dashaddcustomer.setVisible(false);
        dashdealer.setVisible(false);
        dashaccessories.setVisible(false);
        dashpurchase.setVisible(false);
        dashsale.setVisible(false);
        dashcart.setVisible(false);
        dashreport.setVisible(false);
        dashsetting.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
        billtable.setVisible(false);
        dashboardtab.setBackground(new Color(153, 153, 153));
        hometab.setBackground(new Color(102, 102, 102));
        brandstab.setBackground(new Color(102, 102, 102));
        accessoriestab.setBackground(new Color(102, 102, 102));
        offerstab.setBackground(new Color(102, 102, 102));
        supporttab.setBackground(new Color(102, 102, 102));
        abouttab.setBackground(new Color(102, 102, 102));
        instagramtab.setBackground(new Color(102, 102, 102));
        facebooktab.setBackground(new Color(102, 102, 102));
         salecustomerid.setEnabled(true);
    }//GEN-LAST:event_dashboardtabMouseClicked

    private void brandstabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandstabMouseClicked
        tab3.setVisible(true);
        tab1.setVisible(false);
        tab2.setVisible(false);
        tab4.setVisible(false);
        tab5.setVisible(false);
        tab6.setVisible(false);
        tab7.setVisible(false);
        dashaddcustomer.setVisible(false);
        dashdealer.setVisible(false);
        dashaccessories.setVisible(false);
        dashpurchase.setVisible(false);
        dashsale.setVisible(false);
        dashcart.setVisible(false);
        dashreport.setVisible(false);
        dashsetting.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
        billtable.setVisible(false);
        brandstab.setBackground(new Color(153, 153, 153));
        hometab.setBackground(new Color(102, 102, 102));
        dashboardtab.setBackground(new Color(102, 102, 102));
        accessoriestab.setBackground(new Color(102, 102, 102));
        offerstab.setBackground(new Color(102, 102, 102));
        supporttab.setBackground(new Color(102, 102, 102));
        abouttab.setBackground(new Color(102, 102, 102));
        instagramtab.setBackground(new Color(102, 102, 102));
        facebooktab.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_brandstabMouseClicked

    private void accessoriestabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accessoriestabMouseClicked
        tab4.setVisible(true);
        tab1.setVisible(false);
        tab2.setVisible(false);
        tab3.setVisible(false);
        tab5.setVisible(false);
        tab6.setVisible(false);
        tab7.setVisible(false);
        dashaddcustomer.setVisible(false);
        dashdealer.setVisible(false);
        dashaccessories.setVisible(false);
        dashpurchase.setVisible(false);
        dashsale.setVisible(false);
        dashcart.setVisible(false);
        dashreport.setVisible(false);
        dashsetting.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
        billtable.setVisible(false);
        accessoriestab.setBackground(new Color(153, 153, 153));
        hometab.setBackground(new Color(102, 102, 102));
        brandstab.setBackground(new Color(102, 102, 102));
        dashboardtab.setBackground(new Color(102, 102, 102));
        offerstab.setBackground(new Color(102, 102, 102));
        supporttab.setBackground(new Color(102, 102, 102));
        abouttab.setBackground(new Color(102, 102, 102));
        instagramtab.setBackground(new Color(102, 102, 102));
        facebooktab.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_accessoriestabMouseClicked

    private void offerstabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offerstabMouseClicked
        tab5.setVisible(true);
        tab1.setVisible(false);
        tab2.setVisible(false);
        tab3.setVisible(false);
        tab4.setVisible(false);
        tab6.setVisible(false);
        tab7.setVisible(false);
        dashaddcustomer.setVisible(false);
        dashdealer.setVisible(false);
        dashaccessories.setVisible(false);
        dashpurchase.setVisible(false);
        dashsale.setVisible(false);
        dashcart.setVisible(false);
        dashreport.setVisible(false);
        dashsetting.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
        billtable.setVisible(false);
        offerstab.setBackground(new Color(153, 153, 153));
        hometab.setBackground(new Color(102, 102, 102));
        brandstab.setBackground(new Color(102, 102, 102));
        accessoriestab.setBackground(new Color(102, 102, 102));
        dashboardtab.setBackground(new Color(102, 102, 102));
        supporttab.setBackground(new Color(102, 102, 102));
        abouttab.setBackground(new Color(102, 102, 102));
        instagramtab.setBackground(new Color(102, 102, 102));
        facebooktab.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_offerstabMouseClicked

    private void supporttabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supporttabMouseClicked
        tab6.setVisible(true);
        tab1.setVisible(false);
        tab2.setVisible(false);
        tab3.setVisible(false);
        tab4.setVisible(false);
        tab5.setVisible(false);
        tab7.setVisible(false);
        dashaddcustomer.setVisible(false);
        dashdealer.setVisible(false);
        dashaccessories.setVisible(false);
        dashpurchase.setVisible(false);
        dashsale.setVisible(false);
        dashcart.setVisible(false);
        dashreport.setVisible(false);
        dashsetting.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
        billtable.setVisible(false);
        supporttab.setBackground(new Color(153, 153, 153));
        hometab.setBackground(new Color(102, 102, 102));
        brandstab.setBackground(new Color(102, 102, 102));
        accessoriestab.setBackground(new Color(102, 102, 102));
        offerstab.setBackground(new Color(102, 102, 102));
        dashboardtab.setBackground(new Color(102, 102, 102));
        abouttab.setBackground(new Color(102, 102, 102));
        instagramtab.setBackground(new Color(102, 102, 102));
        facebooktab.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_supporttabMouseClicked

    private void abouttabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abouttabMouseClicked
        tab7.setVisible(true);
        tab1.setVisible(false);
        tab2.setVisible(false);
        tab3.setVisible(false);
        tab4.setVisible(false);
        tab5.setVisible(false);
        tab6.setVisible(false);
        dashaddcustomer.setVisible(false);
        dashdealer.setVisible(false);
        dashaccessories.setVisible(false);
        dashpurchase.setVisible(false);
        dashsale.setVisible(false);
        dashcart.setVisible(false);
        dashreport.setVisible(false);
        dashsetting.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
        billtable.setVisible(false);
        abouttab.setBackground(new Color(153, 153, 153));
        hometab.setBackground(new Color(102, 102, 102));
        brandstab.setBackground(new Color(102, 102, 102));
        accessoriestab.setBackground(new Color(102, 102, 102));
        offerstab.setBackground(new Color(102, 102, 102));
        supporttab.setBackground(new Color(102, 102, 102));
        dashboardtab.setBackground(new Color(102, 102, 102));
        instagramtab.setBackground(new Color(102, 102, 102));
        facebooktab.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_abouttabMouseClicked

    private void dashboardtabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardtabMouseEntered
        tab2lbl.setForeground(Color.white);
    }//GEN-LAST:event_dashboardtabMouseEntered

    private void dashboardtabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardtabMouseExited
        tab2lbl.setForeground(Color.black);
    }//GEN-LAST:event_dashboardtabMouseExited

    private void brandstabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandstabMouseEntered
        tab3lbl.setForeground(Color.white);
     }//GEN-LAST:event_brandstabMouseEntered

    private void brandstabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandstabMouseExited
        tab3lbl.setForeground(Color.black);
     }//GEN-LAST:event_brandstabMouseExited

    private void accessoriestabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accessoriestabMouseEntered
        tab4lbl.setForeground(Color.white);
     }//GEN-LAST:event_accessoriestabMouseEntered

    private void accessoriestabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accessoriestabMouseExited
        tab4lbl.setForeground(Color.black);
     }//GEN-LAST:event_accessoriestabMouseExited

    private void offerstabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offerstabMouseEntered
        tab5lbl.setForeground(Color.white);
     }//GEN-LAST:event_offerstabMouseEntered

    private void offerstabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offerstabMouseExited
        tab5lbl.setForeground(Color.black);
    }//GEN-LAST:event_offerstabMouseExited

    private void supporttabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supporttabMouseEntered
        tab6lbl.setForeground(Color.white);
    }//GEN-LAST:event_supporttabMouseEntered

    private void supporttabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supporttabMouseExited
        tab6lbl.setForeground(Color.black);
    }//GEN-LAST:event_supporttabMouseExited

    private void abouttabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abouttabMouseEntered
        tab7lbl.setForeground(Color.white);
    }//GEN-LAST:event_abouttabMouseEntered

    private void abouttabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abouttabMouseExited
        tab7lbl.setForeground(Color.black);
    }//GEN-LAST:event_abouttabMouseExited

    private void logouttabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logouttabMouseEntered
        tab8lbl.setForeground(Color.white);
    }//GEN-LAST:event_logouttabMouseEntered

    private void logouttabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logouttabMouseExited
        tab8lbl.setForeground(Color.black);
    }//GEN-LAST:event_logouttabMouseExited

    private void logouttabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logouttabMouseClicked
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logouttabMouseClicked

    private void facebooktabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebooktabMouseClicked
        facebooktab.setBackground(new Color(153, 153, 153));
        hometab.setBackground(new Color(102, 102, 102));
        brandstab.setBackground(new Color(102, 102, 102));
        accessoriestab.setBackground(new Color(102, 102, 102));
        offerstab.setBackground(new Color(102, 102, 102));
        supporttab.setBackground(new Color(102, 102, 102));
        dashboardtab.setBackground(new Color(102, 102, 102));
        abouttab.setBackground(new Color(102, 102, 102));
        instagramtab.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_facebooktabMouseClicked

    private void instagramtabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagramtabMouseClicked
        instagramtab.setBackground(new Color(153, 153, 153));
        hometab.setBackground(new Color(102, 102, 102));
        brandstab.setBackground(new Color(102, 102, 102));
        accessoriestab.setBackground(new Color(102, 102, 102));
        offerstab.setBackground(new Color(102, 102, 102));
        supporttab.setBackground(new Color(102, 102, 102));
        dashboardtab.setBackground(new Color(102, 102, 102));
        abouttab.setBackground(new Color(102, 102, 102));
        facebooktab.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_instagramtabMouseClicked

    private void facebookbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookbtnMouseClicked
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://www.facebook.com/mayank317.warkade/"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_facebookbtnMouseClicked

    private void instagrambtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagrambtnMouseClicked
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://www.instagram.com/_mayank_317_/"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_instagrambtnMouseClicked

    private void titlepanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlepanelMousePressed
        mousex = evt.getX();
        mousey = evt.getY();
    }//GEN-LAST:event_titlepanelMousePressed

    private void titlepanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlepanelMouseDragged
        this.setLocation(this.getX() + evt.getX() - mousex, this.getY() + evt.getY() - mousey);
    }//GEN-LAST:event_titlepanelMouseDragged

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        dispose();
    }//GEN-LAST:event_closebtnActionPerformed

    private void minimizebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizebtnActionPerformed
        setState(this.ICONIFIED);
    }//GEN-LAST:event_minimizebtnActionPerformed

    private void closebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseEntered
        closebtn.setBackground(Color.red);
        closebtn.setForeground(Color.white);
    }//GEN-LAST:event_closebtnMouseEntered

    private void closebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseExited
        closebtn.setBackground(Color.white);
        closebtn.setForeground(Color.black);
    }//GEN-LAST:event_closebtnMouseExited

    private void minimizebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizebtnMouseEntered
        minimizebtn.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_minimizebtnMouseEntered

    private void minimizebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizebtnMouseExited
        minimizebtn.setBackground(Color.white);
    }//GEN-LAST:event_minimizebtnMouseExited

    private void facebookbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookbtnMouseEntered
        facebookbtn.setBackground(Color.white);
    }//GEN-LAST:event_facebookbtnMouseEntered

    private void facebookbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookbtnMouseExited
        facebookbtn.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_facebookbtnMouseExited

    private void instagrambtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagrambtnMouseEntered
        instagrambtn.setBackground(Color.white);
    }//GEN-LAST:event_instagrambtnMouseEntered

    private void instagrambtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagrambtnMouseExited
        instagrambtn.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_instagrambtnMouseExited

    private void hometabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hometabMouseEntered
        tab1lbl.setForeground(Color.white);
    }//GEN-LAST:event_hometabMouseEntered

    private void hometabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hometabMouseExited
        tab1lbl.setForeground(Color.black);
    }//GEN-LAST:event_hometabMouseExited

    private void dash1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash1MouseClicked
        Random r1 = new Random();
        long l1 = (r1.nextLong() % 9000L) + 1000L;
        long last1 = Math.abs(l1);
        applicationid.setText("317" + last1);
        dashaddcustomer.setVisible(true);
        tab1.setVisible(false);
        tab2.setVisible(false);
        tab3.setVisible(false);
        tab4.setVisible(false);
        tab5.setVisible(false);
        tab6.setVisible(false);
        tab7.setVisible(false);
        dashdealer.setVisible(false);
        dashaccessories.setVisible(false);
        dashpurchase.setVisible(false);
        dashsale.setVisible(false);
        dashcart.setVisible(false);
        dashreport.setVisible(false);
        dashsetting.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
    }//GEN-LAST:event_dash1MouseClicked

    private void backcustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backcustomerMouseClicked
        dashaddcustomer.setVisible(false);
        tab2.setVisible(true);
        customerfullname.setText("full name");
        customerfullname.setForeground(new Color(153, 153, 153));
        male.setSelected(false);
        female.setSelected(false);
        others.setSelected(false);
        customerage.setText("age");
        customerage.setForeground(new Color(153, 153, 153));
        ((JTextField) customerdob.getDateEditor().getUiComponent()).setText("");
        customermobile.setText("mobile number");
        customermobile.setForeground(new Color(153, 153, 153));
        customeremail.setText("email address");
        customeremail.setForeground(new Color(153, 153, 153));
        customeraddress.setText("address");
        customeraddress.setForeground(new Color(153, 153, 153));
        customercity.setText("city");
        customercity.setForeground(new Color(153, 153, 153));
        customerpincode.setText("pin code");
        customerpincode.setForeground(new Color(153, 153, 153));
        customeraadhar.setText("aadhar card number");
        customeraadhar.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_backcustomerMouseClicked

    private void backaccessoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backaccessoriesMouseClicked
        dashaccessories.setVisible(false);
        tab2.setVisible(true);
        accbrand.setText("brand name");
        accbrand.setForeground(new Color(153, 153, 153));
        accbrandmodel.setText("brand model");
        accbrandmodel.setForeground(new Color(153, 153, 153));
        accaccessoryname.setText("accessory name");
        accaccessoryname.setForeground(new Color(153, 153, 153));
        accaccessoryprice.setText("accessory price");
        accaccessoryprice.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_backaccessoriesMouseClicked

    private void dash2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash2MouseClicked
        Random r2 = new Random();
        long l2 = (r2.nextLong() % 9000L) + 1000L;
        long last2 = Math.abs(l2);
        dealerid.setText("264" + last2);
        dashdealer.setVisible(true);
        tab1.setVisible(false);
        tab2.setVisible(false);
        tab3.setVisible(false);
        tab4.setVisible(false);
        tab5.setVisible(false);
        tab6.setVisible(false);
        tab7.setVisible(false);
        dashaddcustomer.setVisible(false);
        dashaccessories.setVisible(false);
        dashpurchase.setVisible(false);
        dashsale.setVisible(false);
        dashcart.setVisible(false);
        dashreport.setVisible(false);
        dashsetting.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
    }//GEN-LAST:event_dash2MouseClicked

    private void dash3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash3MouseClicked
        Random r3 = new Random();
        long l3 = (r3.nextLong() % 9000L) + 1000L;
        long last3 = Math.abs(l3);
        accessoryid.setText("420" + last3);
        dashaccessories.setVisible(true);
        tab1.setVisible(false);
        tab2.setVisible(false);
        tab3.setVisible(false);
        tab4.setVisible(false);
        tab5.setVisible(false);
        tab6.setVisible(false);
        tab7.setVisible(false);
        dashaddcustomer.setVisible(false);
        dashdealer.setVisible(false);
        dashpurchase.setVisible(false);
        dashsale.setVisible(false);
        dashcart.setVisible(false);
        dashreport.setVisible(false);
        dashsetting.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
    }//GEN-LAST:event_dash3MouseClicked

    private void dash4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash4MouseClicked
        Random r4 = new Random();
        long l4 = (r4.nextLong() % 9000L) + 1000L;
        long last4 = Math.abs(l4);
        purchaseid.setText("928" + last4);
        for (int i = purdealerid.getItemCount() - 1; i >= 1; i--) {
            purdealerid.removeItemAt(i);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories?zeroDateTimeBehavior=convertToNull", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select id from dealer");
            while (rs.next()) {
                purdealerid.addItem(rs.getInt(1) + "");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (int i = puraccessoryid.getItemCount() - 1; i >= 1; i--) {
            puraccessoryid.removeItemAt(i);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories?zeroDateTimeBehavior=convertToNull", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select id from accessory");
            while (rs.next()) {
                puraccessoryid.addItem(rs.getInt(1) + "");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dashpurchase.setVisible(true);
        tab1.setVisible(false);
        tab2.setVisible(false);
        tab3.setVisible(false);
        tab4.setVisible(false);
        tab5.setVisible(false);
        tab6.setVisible(false);
        tab7.setVisible(false);
        dashaddcustomer.setVisible(false);
        dashaccessories.setVisible(false);
        dashdealer.setVisible(false);
        dashsale.setVisible(false);
        dashcart.setVisible(false);
        dashreport.setVisible(false);
        dashsetting.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
//        purdealerid.setSelectedItem(1);
//        puragencyname.setText("agency name");
//        puragencyname.setForeground(new Color(153, 153, 153));
//        puraccessoryid.setSelectedItem(1);
//        purbrand.setText("brand");
//        purbrand.setForeground(new Color(153, 153, 153));
//        purbrandmodel.setText("brand model");
//        purbrandmodel.setForeground(new Color(153, 153, 153));
//        puraccessoryname.setText("accessory name");
//        puraccessoryname.setForeground(new Color(153, 153, 153));
//        purprice.setText("accessory price");
//        purprice.setForeground(new Color(153, 153, 153));
//        purdiscount.setText("discount");
//        purdiscount.setForeground(new Color(153, 153, 153));
//        purbill.setText("bill");
//        purbill.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_dash4MouseClicked

    private void dash5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash5MouseClicked
        Random r5 = new Random();
        long l5 = (r5.nextLong() % 9000L) + 1000L;
        long last5 = Math.abs(l5);
        saleid.setText("545" + last5);
        for (int i = salecustomerid.getItemCount() - 1; i >= 1; i--) {
            salecustomerid.removeItemAt(i);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories?zeroDateTimeBehavior=convertToNull", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select id from customer");
            while (rs.next()) {
                salecustomerid.addItem(rs.getInt(1) + "");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (int i = salepurchaseid.getItemCount() - 1; i >= 1; i--) {
            salepurchaseid.removeItemAt(i);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories?zeroDateTimeBehavior=convertToNull", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select id from purchase");
            while (rs.next()) {
                salepurchaseid.addItem(rs.getInt(1) + "");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dashsale.setVisible(true);
        tab1.setVisible(false);
        tab2.setVisible(false);
        tab3.setVisible(false);
        tab4.setVisible(false);
        tab5.setVisible(false);
        tab6.setVisible(false);
        tab7.setVisible(false);
        dashaddcustomer.setVisible(false);
        dashaccessories.setVisible(false);
        dashpurchase.setVisible(false);
        dashdealer.setVisible(false);
        dashcart.setVisible(false);
        dashreport.setVisible(false);
        dashsetting.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
    }//GEN-LAST:event_dash5MouseClicked

    private void dash7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash7MouseClicked
        Random r1 = new Random();
        long l1 = (r1.nextLong() % 9000L) + 1000L;
        long last1 = Math.abs(l1);
        cartid.setText("924" + last1);
        dashcart.setVisible(true);
        tab1.setVisible(false);
        tab2.setVisible(false);
        tab3.setVisible(false);
        tab4.setVisible(false);
        tab5.setVisible(false);
        tab6.setVisible(false);
        tab7.setVisible(false);
        dashaddcustomer.setVisible(false);
        dashaccessories.setVisible(false);
        dashpurchase.setVisible(false);
        dashdealer.setVisible(false);
        dashsale.setVisible(false);
        dashreport.setVisible(false);
        dashsetting.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
    }//GEN-LAST:event_dash7MouseClicked

    private void dash8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash8MouseClicked
        reportsaleid.removeAllItems();
        reportsaleid.addItem("Select Sale ID");
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories?zeroDateTimeBehavior=convertToNull", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select distinct(saleid) from bill");
            while (rs.next()) {
                reportsaleid.addItem(rs.getInt(1) + "");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dashreport.setVisible(true);
        tab1.setVisible(false);
        tab2.setVisible(false);
        tab3.setVisible(false);
        tab4.setVisible(false);
        tab5.setVisible(false);
        tab6.setVisible(false);
        tab7.setVisible(false);
        dashaddcustomer.setVisible(false);
        dashaccessories.setVisible(false);
        dashpurchase.setVisible(false);
        dashdealer.setVisible(false);
        dashcart.setVisible(false);
        dashsale.setVisible(false);
        dashsetting.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
    }//GEN-LAST:event_dash8MouseClicked

    private void dash9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash9MouseClicked
        dashsetting.setVisible(true);
        tab1.setVisible(false);
        tab2.setVisible(false);
        tab3.setVisible(false);
        tab4.setVisible(false);
        tab5.setVisible(false);
        tab6.setVisible(false);
        tab7.setVisible(false);
        dashaddcustomer.setVisible(false);
        dashaccessories.setVisible(false);
        dashpurchase.setVisible(false);
        dashdealer.setVisible(false);
        dashcart.setVisible(false);
        dashreport.setVisible(false);
        dashsale.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
    }//GEN-LAST:event_dash9MouseClicked

    private void backpurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backpurchaseMouseClicked
        dashpurchase.setVisible(false);
        tab2.setVisible(true);
    }//GEN-LAST:event_backpurchaseMouseClicked

    private void backsaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backsaleMouseClicked
        dashsale.setVisible(false);
        tab2.setVisible(true);
    }//GEN-LAST:event_backsaleMouseClicked

    private void backreportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backreportMouseClicked
        dashreport.setVisible(false);
        tab2.setVisible(true);
    }//GEN-LAST:event_backreportMouseClicked

    private void backsettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backsettingMouseClicked
        dashsetting.setVisible(false);
        tab2.setVisible(true);
    }//GEN-LAST:event_backsettingMouseClicked

    private void customerfullnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customerfullnameFocusGained
        String value = customerfullname.getText().trim().toLowerCase();
        if (value.equals("full name")) {
            customerfullname.setText("");
            customerfullname.setForeground(Color.white);
        }
    }//GEN-LAST:event_customerfullnameFocusGained

    private void customerfullnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customerfullnameFocusLost
        String value = customerfullname.getText().trim().toLowerCase();
        if (value.equals("full name") || value.equals("")) {
            customerfullname.setText("full name");
            customerfullname.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_customerfullnameFocusLost

    private void customerageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customerageFocusGained
        String value = customerage.getText().trim().toLowerCase();
        if (value.equals("age")) {
            customerage.setText("");
            customerage.setForeground(Color.white);
        }
    }//GEN-LAST:event_customerageFocusGained

    private void customerageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customerageFocusLost
        String value = customerage.getText().trim().toLowerCase();
        if (value.equals("age") || value.equals("")) {
            customerage.setText("age");
            customerage.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_customerageFocusLost

    private void customermobileFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customermobileFocusGained
        String value = customermobile.getText().trim().toLowerCase();
        if (value.equals("mobile number")) {
            customermobile.setText("");
            customermobile.setForeground(Color.white);
        }
    }//GEN-LAST:event_customermobileFocusGained

    private void customermobileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customermobileFocusLost
        String value = customermobile.getText().trim().toLowerCase();
        if (value.equals("mobile number") || value.equals("")) {
            customermobile.setText("mobile number");
            customermobile.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_customermobileFocusLost

    private void customeremailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customeremailFocusGained
        String value = customeremail.getText().trim().toLowerCase();
        if (value.equals("email address")) {
            customeremail.setText("");
            customeremail.setForeground(Color.white);
        }
    }//GEN-LAST:event_customeremailFocusGained

    private void customeremailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customeremailFocusLost
        String value = customeremail.getText().trim().toLowerCase();
        if (value.equals("email address") || value.equals("")) {
            customeremail.setText("email address");
            customeremail.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_customeremailFocusLost

    private void customeraddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customeraddressFocusGained
        String value = customeraddress.getText().trim().toLowerCase();
        if (value.equals("address")) {
            customeraddress.setText("");
            customeraddress.setForeground(Color.white);
        }
    }//GEN-LAST:event_customeraddressFocusGained

    private void customeraddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customeraddressFocusLost
        String value = customeraddress.getText().trim().toLowerCase();
        if (value.equals("address") || value.equals("")) {
            customeraddress.setText("address");
            customeraddress.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_customeraddressFocusLost

    private void customerpincodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customerpincodeFocusGained
        String value = customerpincode.getText().trim().toLowerCase();
        if (value.equals("pin code")) {
            customerpincode.setText("");
            customerpincode.setForeground(Color.white);
        }
    }//GEN-LAST:event_customerpincodeFocusGained

    private void customerpincodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customerpincodeFocusLost
        String value = customerpincode.getText().trim().toLowerCase();
        if (value.equals("pin code") || value.equals("")) {
            customerpincode.setText("pin code");
            customerpincode.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_customerpincodeFocusLost

    private void customeraadharFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customeraadharFocusGained
        String value = customeraadhar.getText().trim().toLowerCase();
        if (value.equals("aadhar card number")) {
            customeraadhar.setText("");
            customeraadhar.setForeground(Color.white);
        }
    }//GEN-LAST:event_customeraadharFocusGained

    private void customeraadharFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customeraadharFocusLost
        String value = customeraadhar.getText().trim().toLowerCase();
        if (value.equals("aadhar card number") || value.equals("")) {
            customeraadhar.setText("aadhar card number");
            customeraadhar.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_customeraadharFocusLost

    private void backdealerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backdealerMouseClicked
        dashdealer.setVisible(false);
        tab2.setVisible(true);
        dealerfullname.setText("full name");
        dealerfullname.setForeground(new Color(153, 153, 153));
        dealermobile.setText("mobile number");
        dealermobile.setForeground(new Color(153, 153, 153));
        dealeremail.setText("email address");
        dealeremail.setForeground(new Color(153, 153, 153));
        dealeraddress.setText("address");
        dealeraddress.setForeground(new Color(153, 153, 153));
        dealercity.setText("city");
        dealercity.setForeground(new Color(153, 153, 153));
        dealerpincode.setText("pin code");
        dealerpincode.setForeground(new Color(153, 153, 153));
        dealeragencyname.setText("agency name");
        dealeragencyname.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_backdealerMouseClicked

    private void dealerfullnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dealerfullnameFocusGained
        String value = dealerfullname.getText().trim().toLowerCase();
        if (value.equals("full name")) {
            dealerfullname.setText("");
            dealerfullname.setForeground(Color.white);
        }
    }//GEN-LAST:event_dealerfullnameFocusGained

    private void dealerfullnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dealerfullnameFocusLost
        String value = dealerfullname.getText().trim().toLowerCase();
        if (value.equals("full name") || value.equals("")) {
            dealerfullname.setText("full name");
            dealerfullname.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_dealerfullnameFocusLost

    private void dealerpincodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dealerpincodeFocusGained
        String value = dealerpincode.getText().trim().toLowerCase();
        if (value.equals("pin code")) {
            dealerpincode.setText("");
            dealerpincode.setForeground(Color.white);
        }
    }//GEN-LAST:event_dealerpincodeFocusGained

    private void dealerpincodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dealerpincodeFocusLost
        String value = dealerpincode.getText().trim().toLowerCase();
        if (value.equals("pin code") || value.equals("")) {
            dealerpincode.setText("pin code");
            dealerpincode.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_dealerpincodeFocusLost

    private void dealeraddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dealeraddressFocusGained
        String value = dealeraddress.getText().trim().toLowerCase();
        if (value.equals("address")) {
            dealeraddress.setText("");
            dealeraddress.setForeground(Color.white);
        }
    }//GEN-LAST:event_dealeraddressFocusGained

    private void dealeraddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dealeraddressFocusLost
        String value = dealeraddress.getText().trim().toLowerCase();
        if (value.equals("address") || value.equals("")) {
            dealeraddress.setText("address");
            dealeraddress.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_dealeraddressFocusLost

    private void dealermobileFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dealermobileFocusGained
        String value = dealermobile.getText().trim().toLowerCase();
        if (value.equals("mobile number")) {
            dealermobile.setText("");
            dealermobile.setForeground(Color.white);
        }
    }//GEN-LAST:event_dealermobileFocusGained

    private void dealermobileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dealermobileFocusLost
        String value = dealermobile.getText().trim().toLowerCase();
        if (value.equals("mobile number") || value.equals("")) {
            dealermobile.setText("mobile number");
            dealermobile.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_dealermobileFocusLost

    private void dealeremailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dealeremailFocusGained
        String value = dealeremail.getText().trim().toLowerCase();
        if (value.equals("email address")) {
            dealeremail.setText("");
            dealeremail.setForeground(Color.white);
        }
    }//GEN-LAST:event_dealeremailFocusGained

    private void dealeremailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dealeremailFocusLost
        String value = dealeremail.getText().trim().toLowerCase();
        if (value.equals("email address") || value.equals("")) {
            dealeremail.setText("email address");
            dealeremail.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_dealeremailFocusLost

    private void dealeragencynameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dealeragencynameFocusGained
        String value = dealeragencyname.getText().trim().toLowerCase();
        if (value.equals("agency name")) {
            dealeragencyname.setText("");
            dealeragencyname.setForeground(Color.white);
        }
    }//GEN-LAST:event_dealeragencynameFocusGained

    private void dealeragencynameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dealeragencynameFocusLost
        String value = dealeragencyname.getText().trim().toLowerCase();
        if (value.equals("agency name") || value.equals("")) {
            dealeragencyname.setText("agency name");
            dealeragencyname.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_dealeragencynameFocusLost

    private void customersubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersubmitActionPerformed
        String d;
        d = ((JTextField) customerdob.getDateEditor().getUiComponent()).getText();
        if (customerfullname.getText().equals("full name")) {
            customernameerror.setText("*Field required*");
            customergendererror.setText("");
            customerageerror.setText("");
            customerdoberror.setText("");
            customermobileerror.setText("");
            customeremailerror.setText("");
            customeraddresserror.setText("");
            customercityerror.setText("");
            customerpincodeerror.setText("");
            customeraadharerror.setText("");
        } //        else if (!male.isSelected() || !female.isSelected() || !others.isSelected()) {
        //            customergendererror.setText("*Field required*");
        //            customernameerror.setText("");
        //            customerageerror.setText("");
        //            customerdoberror.setText("");
        //            customermobileerror.setText("");
        //            customeremailerror.setText("");
        //            customeraddresserror.setText("");
        //            customercityerror.setText("");
        //            customerpincodeerror.setText("");
        //            customeraadharerror.setText("");
        //        }
        else if (customerage.getText().equals("age")) {
            customerageerror.setText("*Field required*");
            customergendererror.setText("");
            customernameerror.setText("");
            customerdoberror.setText("");
            customermobileerror.setText("");
            customeremailerror.setText("");
            customeraddresserror.setText("");
            customercityerror.setText("");
            customerpincodeerror.setText("");
            customeraadharerror.setText("");
        } else if (d == ("")) {
            customerdoberror.setText("*Field required*");
            customergendererror.setText("");
            customernameerror.setText("");
            customerageerror.setText("");
            customermobileerror.setText("");
            customeremailerror.setText("");
            customeraddresserror.setText("");
            customercityerror.setText("");
            customerpincodeerror.setText("");
            customeraadharerror.setText("");
        } else if (customermobile.getText().equals("mobile number")) {
            customermobileerror.setText("*Field required*");
            customergendererror.setText("");
            customernameerror.setText("");
            customerageerror.setText("");
            customerdoberror.setText("");
            customeremailerror.setText("");
            customeraddresserror.setText("");
            customercityerror.setText("");
            customerpincodeerror.setText("");
            customeraadharerror.setText("");
        } else if (customeremail.getText().equals("email address")) {
            customeremailerror.setText("*Field required*");
            customergendererror.setText("");
            customernameerror.setText("");
            customerageerror.setText("");
            customerdoberror.setText("");
            customermobileerror.setText("");
            customeraddresserror.setText("");
            customercityerror.setText("");
            customerpincodeerror.setText("");
            customeraadharerror.setText("");
        } else if (customeraddress.getText().equals("address")) {
            customeraddresserror.setText("*Field required*");
            customergendererror.setText("");
            customernameerror.setText("");
            customerageerror.setText("");
            customerdoberror.setText("");
            customermobileerror.setText("");
            customeremailerror.setText("");
            customercityerror.setText("");
            customerpincodeerror.setText("");
            customeraadharerror.setText("");
        } else if (customercity.getText().equals("city")) {
            customercityerror.setText("*Field required*");
            customeraddresserror.setText("");
            customergendererror.setText("");
            customernameerror.setText("");
            customerageerror.setText("");
            customerdoberror.setText("");
            customermobileerror.setText("");
            customeremailerror.setText("");
            customerpincodeerror.setText("");
            customeraadharerror.setText("");
        } else if (customerpincode.getText().equals("pin code")) {
            customerpincodeerror.setText("*Field required*");
            customeraddresserror.setText("");
            customergendererror.setText("");
            customernameerror.setText("");
            customerageerror.setText("");
            customerdoberror.setText("");
            customermobileerror.setText("");
            customeremailerror.setText("");
            customercityerror.setText("");
            customeraadharerror.setText("");
        } else if (customeraadhar.getText().equals("aadhar card number")) {
            customeraadharerror.setText("*Field required*");
            customeraddresserror.setText("");
            customergendererror.setText("");
            customernameerror.setText("");
            customerageerror.setText("");
            customerdoberror.setText("");
            customermobileerror.setText("");
            customeremailerror.setText("");
            customercityerror.setText("");
            customerpincodeerror.setText("");
        } else {
            String a1, a2, a3 = "", a4, a5, a6, a7, a8, a9, a10, a11;
            String gender = "";
            if (male.isSelected()) {
                gender = "Male";
            } else if (female.isSelected()) {
                gender = "Female";
            } else if (others.isSelected()) {
                gender = "Others";
            }
            a1 = applicationid.getText();
            a2 = customerfullname.getText();
            a3 = gender;
            a4 = customerage.getText();
            a5 = ((JTextField) customerdob.getDateEditor().getUiComponent()).getText();
            a6 = customermobile.getText();
            a7 = customeremail.getText();
            a8 = customeraddress.getText();
            a9 = customercity.getText();
            a10 = customerpincode.getText();
            a11 = customeraadhar.getText();
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories?zeroDateTimeBehavior=convertToNull", "root", "");
                Statement st = con.createStatement();
                st.executeUpdate("insert into customer values('" + a1 + "','" + a2 + "','" + a3 + "','" + a4 + "','" + a5 + "','" + a6 + "','" + a7 + "','" + a8 + "','" + a9 + "','" + a10 + "','" + a11 + "')");
                JOptionPane.showMessageDialog(this, "Your data has been added successfully");
                dashaddcustomer.setVisible(false);
                tab2.setVisible(true);
                customerfullname.setText("full name");
                customerfullname.setForeground(new Color(153, 153, 153));
                male.setSelected(false);
                female.setSelected(false);
                others.setSelected(false);
                customerage.setText("age");
                customerage.setForeground(new Color(153, 153, 153));
                ((JTextField) customerdob.getDateEditor().getUiComponent()).setText("");
                customermobile.setText("mobile number");
                customermobile.setForeground(new Color(153, 153, 153));
                customeremail.setText("email address");
                customeremail.setForeground(new Color(153, 153, 153));
                customeraddress.setText("address");
                customeraddress.setForeground(new Color(153, 153, 153));
                customercity.setText("city");
                customercity.setForeground(new Color(153, 153, 153));
                customerpincode.setText("pin code");
                customerpincode.setForeground(new Color(153, 153, 153));
                customeraadhar.setText("aadhar card number");
                customeraadhar.setForeground(new Color(153, 153, 153));
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_customersubmitActionPerformed

    private void customercityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customercityFocusGained
        String value = customercity.getText().trim().toLowerCase();
        if (value.equals("city")) {
            customercity.setText("");
            customercity.setForeground(Color.white);
        }
    }//GEN-LAST:event_customercityFocusGained

    private void customercityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customercityFocusLost

        String value = customercity.getText().trim().toLowerCase();
        if (value.equals("city") || value.equals("")) {
            customercity.setText("city");
            customercity.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_customercityFocusLost

    private void dealercityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dealercityFocusGained
        String value = dealercity.getText().trim().toLowerCase();
        if (value.equals("city")) {
            dealercity.setText("");
            dealercity.setForeground(Color.white);
        }
    }//GEN-LAST:event_dealercityFocusGained

    private void dealercityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dealercityFocusLost
        String value = dealercity.getText().trim().toLowerCase();
        if (value.equals("city") || value.equals("")) {
            dealercity.setText("city");
            dealercity.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_dealercityFocusLost

    private void dealersubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealersubmitActionPerformed
        if (dealerfullname.getText().equals("full name")) {
            dealernameerror.setText("*Field required*");
            dealermobileerror.setText("");
            dealeremailerror.setText("");
            dealeraddresserror.setText("");
            dealercityerror.setText("");
            dealerpincodeerror.setText("");
            dealeragencyerror.setText("");
        } else if (dealermobile.getText().equals("mobile number")) {
            dealernameerror.setText("");
            dealermobileerror.setText("*Field required*");
            dealeremailerror.setText("");
            dealeraddresserror.setText("");
            dealercityerror.setText("");
            dealerpincodeerror.setText("");
            dealeragencyerror.setText("");
        } else if (dealeremail.getText().equals("email address")) {
            dealernameerror.setText("");
            dealermobileerror.setText("");
            dealeremailerror.setText("*Field required*");
            dealeraddresserror.setText("");
            dealercityerror.setText("");
            dealerpincodeerror.setText("");
            dealeragencyerror.setText("");
        } else if (dealeraddress.getText().equals("address")) {
            dealernameerror.setText("");
            dealermobileerror.setText("");
            dealeremailerror.setText("");
            dealeraddresserror.setText("*Field required*");
            dealercityerror.setText("");
            dealerpincodeerror.setText("");
            dealeragencyerror.setText("");
        } else if (dealercity.getText().equals("city")) {
            dealernameerror.setText("");
            dealermobileerror.setText("");
            dealeremailerror.setText("");
            dealeraddresserror.setText("");
            dealercityerror.setText("*Field required*");
            dealerpincodeerror.setText("");
            dealeragencyerror.setText("");
        } else if (dealerpincode.getText().equals("pin code")) {
            dealernameerror.setText("");
            dealermobileerror.setText("");
            dealeremailerror.setText("");
            dealeraddresserror.setText("");
            dealercityerror.setText("");
            dealerpincodeerror.setText("*Field required*");
            dealeragencyerror.setText("");
        } else if (dealeragencyname.getText().equals("agency name")) {
            dealernameerror.setText("");
            dealermobileerror.setText("");
            dealeremailerror.setText("");
            dealeraddresserror.setText("");
            dealercityerror.setText("");
            dealerpincodeerror.setText("");
            dealeragencyerror.setText("*Field required*");
        } else {
            String a1, a2, a3, a4, a5, a6, a7, a8;
            a1 = dealerid.getText();
            a2 = dealerfullname.getText();
            a3 = dealermobile.getText();
            a4 = dealeremail.getText();
            a5 = dealeraddress.getText();
            a6 = dealercity.getText();
            a7 = dealerpincode.getText();
            a8 = dealeragencyname.getText();

            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories?zeroDateTimeBehavior=convertToNull", "root", "");
                Statement st = con.createStatement();
                st.executeUpdate("insert into dealer values('" + a1 + "','" + a2 + "','" + a3 + "','" + a4 + "','" + a5 + "','" + a6 + "','" + a7 + "','" + a8 + "')");
                JOptionPane.showMessageDialog(this, "Data has been added successfully");
                dashdealer.setVisible(false);
                tab2.setVisible(true);
                dealerfullname.setText("full name");
                dealerfullname.setForeground(new Color(153, 153, 153));
                dealermobile.setText("mobile number");
                dealermobile.setForeground(new Color(153, 153, 153));
                dealeremail.setText("email address");
                dealeremail.setForeground(new Color(153, 153, 153));
                dealeraddress.setText("address");
                dealeraddress.setForeground(new Color(153, 153, 153));
                dealercity.setText("city");
                dealercity.setForeground(new Color(153, 153, 153));
                dealerpincode.setText("pin code");
                dealerpincode.setForeground(new Color(153, 153, 153));
                dealeragencyname.setText("agency name");
                dealeragencyname.setForeground(new Color(153, 153, 153));
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_dealersubmitActionPerformed

    private void dealerclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealerclearActionPerformed
        dealerfullname.setText("full name");
        dealerfullname.setForeground(new Color(153, 153, 153));
        dealermobile.setText("mobile number");
        dealermobile.setForeground(new Color(153, 153, 153));
        dealeremail.setText("email address");
        dealeremail.setForeground(new Color(153, 153, 153));
        dealeraddress.setText("address");
        dealeraddress.setForeground(new Color(153, 153, 153));
        dealercity.setText("city");
        dealercity.setForeground(new Color(153, 153, 153));
        dealerpincode.setText("pin code");
        dealerpincode.setForeground(new Color(153, 153, 153));
        dealeragencyname.setText("agency name");
        dealeragencyname.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_dealerclearActionPerformed

    private void customerclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerclearActionPerformed
        customerfullname.setText("full name");
        customerfullname.setForeground(new Color(153, 153, 153));
        male.setSelected(false);
        female.setSelected(false);
        others.setSelected(false);
        customerage.setText("age");
        customerage.setForeground(new Color(153, 153, 153));
        ((JTextField) customerdob.getDateEditor().getUiComponent()).setText("");
        customermobile.setText("mobile number");
        customermobile.setForeground(new Color(153, 153, 153));
        customeremail.setText("email address");
        customeremail.setForeground(new Color(153, 153, 153));
        customeraddress.setText("address");
        customeraddress.setForeground(new Color(153, 153, 153));
        customercity.setText("city");
        customercity.setForeground(new Color(153, 153, 153));
        customerpincode.setText("pin code");
        customerpincode.setForeground(new Color(153, 153, 153));
        customeraadhar.setText("aadhar card number");
        customeraadhar.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_customerclearActionPerformed

    private void accbrandFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accbrandFocusGained
        String value = accbrand.getText().trim().toLowerCase();
        if (value.equals("brand name")) {
            accbrand.setText("");
            accbrand.setForeground(Color.white);
        }
    }//GEN-LAST:event_accbrandFocusGained

    private void accbrandFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accbrandFocusLost
        String value = accbrand.getText().trim().toLowerCase();
        if (value.equals("brand name") || value.equals("")) {
            accbrand.setText("brand name");
            accbrand.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_accbrandFocusLost

    private void accbrandmodelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accbrandmodelFocusGained
        String value = accbrandmodel.getText().trim().toLowerCase();
        if (value.equals("brand model")) {
            accbrandmodel.setText("");
            accbrandmodel.setForeground(Color.white);
        }
    }//GEN-LAST:event_accbrandmodelFocusGained

    private void accbrandmodelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accbrandmodelFocusLost
        String value = accbrandmodel.getText().trim().toLowerCase();
        if (value.equals("brand model") || value.equals("")) {
            accbrandmodel.setText("brand model");
            accbrandmodel.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_accbrandmodelFocusLost

    private void accaccessorynameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accaccessorynameFocusGained
        String value = accaccessoryname.getText().trim().toLowerCase();
        if (value.equals("accessory name")) {
            accaccessoryname.setText("");
            accaccessoryname.setForeground(Color.white);
        }
    }//GEN-LAST:event_accaccessorynameFocusGained

    private void accaccessorynameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accaccessorynameFocusLost
        String value = accaccessoryname.getText().trim().toLowerCase();
        if (value.equals("accessory name") || value.equals("")) {
            accaccessoryname.setText("accessory name");
            accaccessoryname.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_accaccessorynameFocusLost

    private void accaccessorypriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accaccessorypriceFocusGained
        String value = accaccessoryprice.getText().trim().toLowerCase();
        if (value.equals("accessory price")) {
            accaccessoryprice.setText("");
            accaccessoryprice.setForeground(Color.white);
        }
    }//GEN-LAST:event_accaccessorypriceFocusGained

    private void accaccessorypriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accaccessorypriceFocusLost
        String value = accaccessoryprice.getText().trim().toLowerCase();
        if (value.equals("accessory price") || value.equals("")) {
            accaccessoryprice.setText("accessory price");
            accaccessoryprice.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_accaccessorypriceFocusLost

    private void accsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accsubmitActionPerformed
        if (accbrand.getText().equals("brand name")) {
            accbranderror.setText("*Field required*");
            accmodelerror.setText("");
            accaccessoryerror.setText("");
            accpriceerror.setText("");
        } else if (accbrandmodel.getText().equals("brand model")) {
            accbranderror.setText("");
            accmodelerror.setText("*Field required*");
            accaccessoryerror.setText("");
            accpriceerror.setText("");
        } else if (accaccessoryname.getText().equals("accessory name")) {
            accbranderror.setText("");
            accmodelerror.setText("");
            accaccessoryerror.setText("*Field required*");
            accpriceerror.setText("");
        } else if (accaccessoryprice.getText().equals("accessory price")) {
            accbranderror.setText("");
            accmodelerror.setText("");
            accaccessoryerror.setText("");
            accpriceerror.setText("*Field required*");
        } else {
            String a1, a2, a3, a4;
            int a5;
            a1 = accessoryid.getText();
            a2 = accbrand.getText();
            a3 = accbrandmodel.getText();
            a4 = accaccessoryname.getText();
            a5 = Integer.parseInt(accaccessoryprice.getText());
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories?zeroDateTimeBehavior=convertToNull", "root", "");
                Statement st = con.createStatement();
                st.executeUpdate("insert into accessory values('" + a1 + "','" + a2 + "','" + a3 + "','" + a4 + "'," + a5 + ")");
                JOptionPane.showMessageDialog(this, "Data has been added successfully");
                dashaccessories.setVisible(false);
                tab2.setVisible(true);
                accbrand.setText("brand name");
                accbrand.setForeground(new Color(153, 153, 153));
                accbrandmodel.setText("brand model");
                accbrandmodel.setForeground(new Color(153, 153, 153));
                accaccessoryname.setText("accessory name");
                accaccessoryname.setForeground(new Color(153, 153, 153));
                accaccessoryprice.setText("accessory price");
                accaccessoryprice.setForeground(new Color(153, 153, 153));
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_accsubmitActionPerformed

    private void purdealeridItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_purdealeridItemStateChanged

        if ((purdealerid.getSelectedItem() + "").equals("select Dealer ID")) {
            purdealeriderror.setText("*select ID*");
            puragencyname.setText("");
        } else {
            try {
                purdealeriderror.setText("");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories?zeroDateTimeBehavior=convertToNull", "root", "");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from dealer where id=" + purdealerid.getSelectedItem() + "");
                rs.next();
                puragencyname.setText(rs.getString(8));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_purdealeridItemStateChanged

    private void puraccessoryidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_puraccessoryidItemStateChanged

        if ((puraccessoryid.getSelectedItem() + "").equals("select Accessory ID")) {
            puraccessoryiderror.setText("*select ID*");
            purbrand.setText("");
            purbrandmodel.setText("");
            puraccessoryname.setText("");
            purprice.setText("");
        } else {
            try {
                puraccessoryiderror.setText("");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories?zeroDateTimeBehavior=convertToNull", "root", "");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from accessory where id=" + puraccessoryid.getSelectedItem() + "");
                rs.next();
                purbrand.setText(rs.getString(2));
                purbrandmodel.setText(rs.getString(3));
                puraccessoryname.setText(rs.getString(4));
                purprice.setText(rs.getInt(5) + "");
                price = rs.getInt(5);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_puraccessoryidItemStateChanged

    private void purquantityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_purquantityItemStateChanged
        if ((purquantity.getSelectedItem() + "").equals("select Quantity")) {
            purquantityerror.setText("*select any number*");
        } else if (purprice.getText().isEmpty()) {
            purpriceerror.setText("*Field is Required*");
        } else if (purdiscount.getText().isEmpty()) {
            purdiscounterror.setText("*Field is Required*");
        } else if (!purprice.getText().isEmpty() || !purdiscount.getText().isEmpty()) {
            purquantityerror.setText("");
            purpriceerror.setText("");
            purdiscounterror.setText("");
            quantity = Integer.parseInt(purquantity.getSelectedItem() + "");
            total = price * quantity;
            double d = Integer.parseInt(purdiscount.getText());
            if (d == 0) {
                bill = total;
                purbill.setText(bill + "");
            } else {
                discount = (total * d) / 100d;
                bill = total - discount;
                bill = Math.round(bill * 100) / 100d;
                purbill.setText(bill + "");
            }
        }
    }//GEN-LAST:event_purquantityItemStateChanged

    private void salecustomeridItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_salecustomeridItemStateChanged
        if ((salecustomerid.getSelectedItem() + "").equals("select Customer ID")) {
            salecustomeriderror.setText("*select ID*");
            salecustomername.setText("");
        } else {
            try {
                salecustomeriderror.setText("");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories?zeroDateTimeBehavior=convertToNull", "root", "");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from customer where id=" + salecustomerid.getSelectedItem() + "");
                rs.next();
                salecustomername.setText(rs.getString(2));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_salecustomeridItemStateChanged

    private void salepurchaseidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_salepurchaseidItemStateChanged
        if ((salepurchaseid.getSelectedItem() + "").equals("select Purchase ID")) {
            salepurchaseiderror.setText("*select ID*");
            salebrand.setText("");
            salebrandmodel.setText("");
            saleaccessoryname.setText("");
            salepurchaseprice.setText("");
            salestock.setText("");
        } else {
            try {
                salepurchaseiderror.setText("");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories?zeroDateTimeBehavior=convertToNull", "root", "");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from purchase where id=" + salepurchaseid.getSelectedItem() + "");
                rs.next();
                salebrand.setText(rs.getString(5));
                salebrandmodel.setText(rs.getString(6));
                saleaccessoryname.setText(rs.getString(7));
                salepurchaseprice.setText(rs.getInt(8) + "");
                salestock.setText(rs.getInt(10) + "");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_salepurchaseidItemStateChanged

    private void purbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purbuyActionPerformed
        if (purbill.getText().isEmpty()) {
            purbuyerror.setText("*Please fill up all the fields*");
        } else {
            String a3, a5, a6, a7;
            int a1, a2, a4, a8, a9, a10;
            double a11;
            a1 = Integer.parseInt(purchaseid.getText());
            a2 = Integer.parseInt((purdealerid.getSelectedItem() + ""));
            a3 = puragencyname.getText();
            a4 = Integer.parseInt((puraccessoryid.getSelectedItem() + ""));
            a5 = purbrand.getText();;
            a6 = purbrandmodel.getText();;
            a7 = puraccessoryname.getText();;
            a8 = Integer.parseInt(purprice.getText());
            a9 = Integer.parseInt(purdiscount.getText());
            a10 = Integer.parseInt((purquantity.getSelectedItem() + ""));
            a11 = Double.parseDouble(purbill.getText());
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories?zeroDateTimeBehavior=convertToNull", "root", "");
                Statement st = con.createStatement();
                st.executeUpdate("insert into purchase values(" + a1 + "," + a2 + ",'" + a3 + "'," + a4 + ",'" + a5 + "','" + a6 + "','" + a7 + "'," + a8 + "," + a9 + "," + a10 + "," + a11 + ")");
                JOptionPane.showMessageDialog(this, "Successfully Purchased");
                dashpurchase.setVisible(false);
                tab2.setVisible(true);
                purchaseid.setText("");
                purdealerid.setSelectedItem(1);
                puragencyname.setText("");
                puraccessoryid.setSelectedItem(1);
                purbrand.setText("");
                purbrandmodel.setText("");
                puraccessoryname.setText("");
                purprice.setText("");
                purdiscount.setText("");
                purquantity.setSelectedItem("");
                purbill.setText("");
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_purbuyActionPerformed

    private void accclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accclearActionPerformed
        accbrand.setText("brand name");
        accbrand.setForeground(new Color(153, 153, 153));
        accbrandmodel.setText("brand model");
        accbrandmodel.setForeground(new Color(153, 153, 153));
        accaccessoryname.setText("accessory name");
        accaccessoryname.setForeground(new Color(153, 153, 153));
        accaccessoryprice.setText("accessory price");
        accaccessoryprice.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_accclearActionPerformed

    private void salequantityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_salequantityItemStateChanged
        if ((salequantity.getSelectedItem() + "").equals("select Quantity")) {
            salequantityerror.setText("*select any number*");
            salepriceerror.setText("");
        } else if (saleprice.getText().isEmpty()) {
            salepriceerror.setText("*Field Required*");
        } else {
            salepriceerror.setText("");
            int stock = Integer.parseInt(salestock.getText());
            int quan = Integer.parseInt(salequantity.getSelectedItem() + "");
            if (quan > stock) {
                salequantityerror.setText("*Out of Stock*");
            } else {
                salequantityerror.setText("");
                double sale_price = Double.parseDouble(saleprice.getText());
                double sale_total = sale_price * quan;
                saletotal.setText(sale_total + "");
            }
        }
    }//GEN-LAST:event_salequantityItemStateChanged

    private void salecalculatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salecalculatebtnActionPerformed
        if (saletotal.getText().isEmpty() && salediscount.getText().isEmpty() && salegst.getText().isEmpty()) {
            saletotalerror.setText("Field is Required");
            salediscounterror.setText("Field is Required");
            salegsterror.setText("Field is Required");
        } else if (salediscount.getText().isEmpty() && salegst.getText().isEmpty()) {
            saletotalerror.setText("");
            salediscounterror.setText("Field is Required");
            salegsterror.setText("Field is Required");
        } else if (saletotal.getText().isEmpty() && salegst.getText().isEmpty()) {
            saletotalerror.setText("Field is Required");
            salediscounterror.setText("");
            salegsterror.setText("Field is Required");
        } else if (saletotal.getText().isEmpty() && salediscount.getText().isEmpty()) {
            saletotalerror.setText("Field is Required");
            salediscounterror.setText("Field is Required");
            salegsterror.setText("");
        } else if (saletotal.getText().isEmpty()) {
            saletotalerror.setText("Field is Required");
            salediscounterror.setText("");
            salegsterror.setText("");
        } else if (salediscount.getText().isEmpty()) {
            salediscounterror.setText("Field is Required");
            saletotalerror.setText("");
            salegsterror.setText("");
        } else if (salegst.getText().isEmpty()) {
            salegsterror.setText("Field is Required");
            saletotalerror.setText("");
            salediscounterror.setText("");
        } else {
            saletotalerror.setText("");
            salediscounterror.setText("");
            salegsterror.setText("");
            double sale_total = Double.parseDouble(saletotal.getText());
            double sale_discount = Double.parseDouble(salediscount.getText());
            double sale_gst = Double.parseDouble(salegst.getText());
            double total_discount = 0;
            if (sale_discount == 0 && sale_gst == 0) {
                double sale_bill = sale_total;
                sale_bill = Math.round(sale_bill * 100) / 100d;
                salebill.setText(sale_bill + "");
            } else if (sale_discount == 0) {
                double gst = (sale_total * sale_gst) / 100d;
                double sale_bill = sale_total + gst;
                sale_bill = Math.round(sale_bill * 100) / 100d;
                salebill.setText(sale_bill + "");
            } else if (sale_gst == 0) {
                double dis = (sale_total * sale_discount) / 100d;
                double sale_bill = sale_total - dis;
                sale_bill = Math.round(sale_bill * 100) / 100d;
                salebill.setText(sale_bill + "");
            } else if (sale_discount >= sale_gst) {
                total_discount = sale_discount - sale_gst;
                double dis = (sale_total * total_discount) / 100d;
                double sale_bill = sale_total - dis;
                sale_bill = Math.round(sale_bill * 100) / 100d;
                salebill.setText(sale_bill + "");
            } else if (sale_discount <= sale_gst) {
                total_discount = sale_gst - sale_discount;
                double dis = (sale_total * total_discount) / 100d;
                double sale_bill = sale_total + dis;
                sale_bill = Math.round(sale_bill * 100) / 100d;
                salebill.setText(sale_bill + "");
            }
        }
    }//GEN-LAST:event_salecalculatebtnActionPerformed

    private void customerfullnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerfullnameKeyPressed
        int i = evt.getKeyCode();
        if (i >= 65 && i <= 90 || i >= 97 && i <= 122) {
            customerfullname.setEditable(true);
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            customerfullname.setEditable(true);
        } else {
            customerfullname.setEditable(false);
        }
    }//GEN-LAST:event_customerfullnameKeyPressed

    private void customercityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customercityKeyPressed
        int i = evt.getKeyCode();
        if (i >= 65 && i <= 90 || i >= 97 && i <= 122) {
            customercity.setEditable(true);

        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            customercity.setEditable(true);
        } else {
            customercity.setEditable(false);
        }
    }//GEN-LAST:event_customercityKeyPressed

    private void customeremailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customeremailKeyPressed
        String pattern = "^[a-z A-Z 0-9]{0,30}[@][a-z A-Z 0-9]{0,10}[.][a-z A-Z]{0,5}$";
        Pattern pa = Pattern.compile(pattern);
        Matcher match = pa.matcher(customeremail.getText());
        if (!match.matches()) {
            customeremailerror.setText("Email is Incorrect");
        } else {
            customeremailerror.setText(null);
        }
    }//GEN-LAST:event_customeremailKeyPressed

    private void customermobileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customermobileKeyPressed
        String mobile = customermobile.getText();
        int length = mobile.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 10) {
                customermobile.setEditable(true);
            } else {
                customermobile.setEditable(false);
            }
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
            customermobile.setEditable(true);
        } else {
            customermobile.setEditable(false);
        }
    }//GEN-LAST:event_customermobileKeyPressed

    private void customerageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerageKeyPressed
        String mobile = customerage.getText();
        int length = mobile.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 2) {
                customerage.setEditable(true);
            } else {
                customerage.setEditable(false);
            }
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
            customerage.setEditable(true);
        } else {
            customerage.setEditable(false);
        }
    }//GEN-LAST:event_customerageKeyPressed

    private void customerpincodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerpincodeKeyPressed
        String mobile = customerpincode.getText();
        int length = mobile.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 6) {
                customerpincode.setEditable(true);
            } else {
                customerpincode.setEditable(false);
            }
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
            customerpincode.setEditable(true);
        } else {
            customerpincode.setEditable(false);
        }
    }//GEN-LAST:event_customerpincodeKeyPressed

    private void customeraadharKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customeraadharKeyPressed
        String mobile = customeraadhar.getText();
        int length = mobile.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 12) {
                customeraadhar.setEditable(true);
            } else {
                customeraadhar.setEditable(false);
            }
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
            customeraadhar.setEditable(true);
        } else {
            customeraadhar.setEditable(false);
        }
    }//GEN-LAST:event_customeraadharKeyPressed

    private void dealerfullnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dealerfullnameKeyPressed
        int i = evt.getKeyCode();
        if (i >= 65 && i <= 90 || i >= 97 && i <= 122) {
            dealerfullname.setEditable(true);
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            dealerfullname.setEditable(true);
        } else {
            dealerfullname.setEditable(false);
        }
    }//GEN-LAST:event_dealerfullnameKeyPressed

    private void dealermobileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dealermobileKeyPressed
        String mobile = dealermobile.getText();
        int length = mobile.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 10) {
                dealermobile.setEditable(true);
            } else {
                dealermobile.setEditable(false);
            }
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
            dealermobile.setEditable(true);
        } else {
            dealermobile.setEditable(false);
        }
    }//GEN-LAST:event_dealermobileKeyPressed

    private void dealeremailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dealeremailKeyPressed
        String pattern = "^[a-z A-Z 0-9]{0,30}[@][a-z A-Z 0-9]{0,10}[.][a-z A-Z]{0,5}$";
        Pattern pa = Pattern.compile(pattern);
        Matcher match = pa.matcher(dealeremail.getText());
        if (!match.matches()) {
            dealeremailerror.setText("Email is Incorrect");
        } else {
            dealeremailerror.setText(null);
        }
    }//GEN-LAST:event_dealeremailKeyPressed

    private void dealercityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dealercityKeyPressed
        int i = evt.getKeyCode();
        if (i >= 65 && i <= 90 || i >= 97 && i <= 122) {
            dealercity.setEditable(true);
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            dealercity.setEditable(true);
        } else {
            dealercity.setEditable(false);
        }
    }//GEN-LAST:event_dealercityKeyPressed

    private void dealerpincodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dealerpincodeKeyPressed
        String mobile = dealerpincode.getText();
        int length = mobile.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 6) {
                dealerpincode.setEditable(true);
            } else {
                dealerpincode.setEditable(false);
            }
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
            dealerpincode.setEditable(true);
        } else {
            dealerpincode.setEditable(false);
        }
    }//GEN-LAST:event_dealerpincodeKeyPressed

    private void dealeragencynameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dealeragencynameKeyPressed
        int i = evt.getKeyCode();
        if (i >= 65 && i <= 90 || i >= 97 && i <= 122) {
            dealeragencyname.setEditable(true);
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            dealeragencyname.setEditable(true);
        } else {
            dealeragencyname.setEditable(false);
        }
    }//GEN-LAST:event_dealeragencynameKeyPressed

    private void accbrandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accbrandKeyPressed
        int i = evt.getKeyCode();
        if (i >= 65 && i <= 90 || i >= 97 && i <= 122) {
            accbrand.setEditable(true);
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            accbrand.setEditable(true);
        } else {
            accbrand.setEditable(false);
        }
    }//GEN-LAST:event_accbrandKeyPressed

    private void accaccessorypriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accaccessorypriceKeyPressed
        String mobile = accaccessoryprice.getText();
        int length = mobile.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 10) {
                accaccessoryprice.setEditable(true);
            } else {
                accaccessoryprice.setEditable(false);
            }
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
            accaccessoryprice.setEditable(true);
        } else {
            accaccessoryprice.setEditable(false);
        }
    }//GEN-LAST:event_accaccessorypriceKeyPressed

    private void accaccessorynameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accaccessorynameKeyPressed
        int i = evt.getKeyCode();
        if (i >= 65 && i <= 90 || i >= 97 && i <= 122) {
            accaccessoryname.setEditable(true);
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            accaccessoryname.setEditable(true);
        } else {
            accaccessoryname.setEditable(false);
        }
    }//GEN-LAST:event_accaccessorynameKeyPressed

    private void purdiscountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_purdiscountKeyPressed
        String mobile = purdiscount.getText();
        int length = mobile.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 2) {
                purdiscount.setEditable(true);
            } else {
                purdiscount.setEditable(false);
            }
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
            purdiscount.setEditable(true);
        } else {
            purdiscount.setEditable(false);
        }
    }//GEN-LAST:event_purdiscountKeyPressed

    private void salepriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salepriceKeyPressed
        String mobile = saleprice.getText();
        int length = mobile.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 10) {
                saleprice.setEditable(true);
            } else {
                saleprice.setEditable(false);
            }
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
            saleprice.setEditable(true);
        } else {
            saleprice.setEditable(false);
        }
    }//GEN-LAST:event_salepriceKeyPressed

    private void salediscountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salediscountKeyPressed
        String mobile = salediscount.getText();
        int length = mobile.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 2) {
                salediscount.setEditable(true);
            } else {
                salediscount.setEditable(false);
            }
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
            salediscount.setEditable(true);
        } else {
            salediscount.setEditable(false);
        }
    }//GEN-LAST:event_salediscountKeyPressed

    private void salegstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salegstKeyPressed
        String mobile = salegst.getText();
        int length = mobile.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 2) {
                salegst.setEditable(true);
            } else {
                salegst.setEditable(false);
            }
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
            salegst.setEditable(true);
        } else {
            salegst.setEditable(false);
        }
    }//GEN-LAST:event_salegstKeyPressed

    private void salesubmitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesubmitbtnActionPerformed
        if (salebill.getText().isEmpty()) {
            salebillerror.setText("*All Fields Are Required*");
        } else {
             salecustomerid.setEnabled(true);
            salebillerror.setText("");
            String a = saleid.getText();
            billid.setText(a);
            String sqty;
            sqty = (salequantity.getSelectedItem() + "");
            String d[] = {saleid.getText(), salebrand.getText(), salebrandmodel.getText(), saleaccessoryname.getText(), sqty, salebill.getText()};
            DefaultTableModel t1 = (DefaultTableModel) btable.getModel();
            t1.addRow(d);
            String cid;
            cid = (salecustomerid.getSelectedItem() + "");
            billcustomerid.setText(cid);
            billcustomername.setText(salecustomername.getText());
            JOptionPane.showMessageDialog(this, "Successfully added to bill");
            billtable.setVisible(true);
            dashsale.setVisible(false);
        }

//        billtable.setVisible(true);
//        dashsale.setVisible(false);
//        if (salebill.getText().isEmpty()) {
//            salebillerror.setText("*All Fields Are Required*");
//        } else {
//            salebillerror.setText("");
//            String a3, a5, a6, a7;
//            int a1, a2, a4, a8, a9, a10;
//            double a11, a12, a13, a14;
//            a1 = Integer.parseInt(saleid.getText());
//            a2 = Integer.parseInt((salecustomerid.getSelectedItem() + ""));
//            a3 = salecustomername.getText();
//            a4 = Integer.parseInt((salepurchaseid.getSelectedItem() + ""));
//            a5 = salebrand.getText();;
//            a6 = salebrandmodel.getText();;
//            a7 = saleaccessoryname.getText();;
//            a8 = Integer.parseInt(salepurchaseprice.getText());
//            a9 = Integer.parseInt(saleprice.getText());
//            a10 = Integer.parseInt((salequantity.getSelectedItem() + ""));
//            a11 = Double.parseDouble(saletotal.getText());
//            a12 = Integer.parseInt(salediscount.getText());
//            a13 = Integer.parseInt(salegst.getText());
//            a14 = Double.parseDouble(salebill.getText());
//            int stock = Integer.parseInt(salestock.getText());
//            int up = stock - a10;
//            try {
//                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories?zeroDateTimeBehavior=convertToNull", "root", "");
//                Statement st = con.createStatement();
//                st.executeUpdate("insert into sale values(" + a1 + "," + a2 + ",'" + a3 + "'," + a4 + ",'" + a5 + "','" + a6 + "','" + a7 + "'," + a8 + "," + a9 + "," + a10 + "," + a11 + "," + a12 + "," + a13 + "," + a14 + ")");
//                st.executeUpdate("update purchase set quantity=" + up + " where id=" + a4 + "");
//                dashsale.setVisible(false);
//                tab2.setVisible(true);
//                salecustomerid.setSelectedItem(0);
//                salecustomername.setText("");
//                salepurchaseid.setSelectedItem(0);
//                salebrand.setText("");
//                salebrandmodel.setText("");
//                saleaccessoryname.setText("");
//                salepurchaseprice.setText("");
//                salestock.setText("");
//                saleprice.setText("");
//                salequantity.setSelectedItem(0);
//                saletotal.setText("");
//                salediscount.setText("");
//                salegst.setText("");
//                salebill.setText("");
//            } catch (SQLException e) {
//                System.out.println(e);
//            }
//        }
    }//GEN-LAST:event_salesubmitbtnActionPerformed

    private void brandbmwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandbmwMouseClicked
        tab3.setVisible(false);
        bmw.setVisible(true);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
    }//GEN-LAST:event_brandbmwMouseClicked

    private void brandhondaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandhondaMouseClicked
        tab3.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(true);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
    }//GEN-LAST:event_brandhondaMouseClicked

    private void brandroyalenfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandroyalenfieldMouseClicked
        tab3.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(true);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
    }//GEN-LAST:event_brandroyalenfieldMouseClicked

    private void brandktmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandktmMouseClicked
        tab3.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(true);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
    }//GEN-LAST:event_brandktmMouseClicked

    private void brandkawasakiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandkawasakiMouseClicked
        tab3.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(true);
        bajaj.setVisible(false);
    }//GEN-LAST:event_brandkawasakiMouseClicked

    private void brandbajajMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandbajajMouseClicked
        tab3.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(true);
    }//GEN-LAST:event_brandbajajMouseClicked

    private void homeimgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeimgMouseClicked
        tab1.setVisible(true);
        tab2.setVisible(false);
        tab3.setVisible(false);
        tab4.setVisible(false);
        tab5.setVisible(false);
        tab6.setVisible(false);
        tab7.setVisible(false);
        dashaddcustomer.setVisible(false);
        dashdealer.setVisible(false);
        dashaccessories.setVisible(false);
        dashpurchase.setVisible(false);
        dashsale.setVisible(false);
        dashcart.setVisible(false);
        dashreport.setVisible(false);
        dashsetting.setVisible(false);
        bmw.setVisible(false);
        honda.setVisible(false);
        royal_enfield.setVisible(false);
        ktm.setVisible(false);
        kawasaki.setVisible(false);
        bajaj.setVisible(false);
        hometab.setBackground(new Color(153, 153, 153));
        dashboardtab.setBackground(new Color(102, 102, 102));
        brandstab.setBackground(new Color(102, 102, 102));
        accessoriestab.setBackground(new Color(102, 102, 102));
        offerstab.setBackground(new Color(102, 102, 102));
        supporttab.setBackground(new Color(102, 102, 102));
        abouttab.setBackground(new Color(102, 102, 102));
        instagramtab.setBackground(new Color(102, 102, 102));
        facebooktab.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_homeimgMouseClicked

    private void tab8lblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab8lblMouseEntered
        tab8lbl.setForeground(Color.white);
    }//GEN-LAST:event_tab8lblMouseEntered

    private void tab8lblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab8lblMouseExited
        tab8lbl.setForeground(Color.black);
    }//GEN-LAST:event_tab8lblMouseExited

    private void saleviewbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleviewbillActionPerformed
         DefaultTableModel t1 = (DefaultTableModel) btable.getModel();
        int row=t1.getRowCount();
         if (row==0) {
            salebillerror.setText("*Your Bill Is Empty*");
        } else {
            salecustomerid.setEnabled(true);
            salebillerror.setText("");
            String a = saleid.getText();
            billid.setText(a);
            String sqty;
            sqty = (salequantity.getSelectedItem() + "");
            String d[] = {saleid.getText(), salebrand.getText(), salebrandmodel.getText(), saleaccessoryname.getText(), sqty, salebill.getText()};
            t1.addRow(d);
            String cid;
            cid = (salecustomerid.getSelectedItem() + "");
            billcustomerid.setText(cid);
            billcustomername.setText(salecustomername.getText());
            billtable.setVisible(true);
            dashsale.setVisible(false);
        }
    }//GEN-LAST:event_saleviewbillActionPerformed

    private void saleanotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleanotherActionPerformed
        if (salebill.getText().isEmpty()) {
            salebillerror.setText("*All Fields Are Required*");
        } else {
           salepurchaseid.setSelectedIndex(0);
            salecustomerid.setEnabled(false);
            salebillerror.setText("");
            String sqty;
            sqty = (salequantity.getSelectedItem() + "");
            String d[] = {saleid.getText(), salebrand.getText(), salebrandmodel.getText(), saleaccessoryname.getText(), sqty, salebill.getText()};
            DefaultTableModel t1 = (DefaultTableModel) btable.getModel();
            t1.addRow(d);
            JOptionPane.showMessageDialog(this, "Successfully added previous product");
            salecustomerid.setEditable(false);
            salepurchaseid.setSelectedItem(0);
            salebrand.setText("");
            salebrandmodel.setText("");
            saleaccessoryname.setText("");
            salepurchaseprice.setText("");
            salestock.setText("");
            saleprice.setText("");
            salequantity.setSelectedItem(0);
            saletotal.setText("");
            salediscount.setText("");
            salegst.setText("");
            salebill.setText("");
            salesubmitbtn.setEnabled(false);
        }
    }//GEN-LAST:event_saleanotherActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        DefaultTableModel t1 = (DefaultTableModel) btable.getModel();
        try {
            String bsaleid = "", bbrand = "", bmodel = "", bacc = "", bqty = "", bprice = "";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories?zeroDateTimeBehavior=convertToNull", "root", "");
            for (int i = 0; i < t1.getRowCount(); i++) {
                bsaleid = t1.getValueAt(i, 0).toString();
                bbrand = t1.getValueAt(i, 1).toString();
                bmodel = t1.getValueAt(i, 2).toString();
                bacc = t1.getValueAt(i, 3).toString();
                bqty = t1.getValueAt(i, 4).toString();
                bprice = t1.getValueAt(i, 5).toString();
                Statement st = con.createStatement();
                st.executeUpdate("insert into bill values('" + bsaleid + "','" + bbrand + "','" + bmodel + "','" + bacc + "','" + bqty + "','" + bprice + "')");
            }
            Double a, b,c;
            String d;
            a = Double.parseDouble(billid.getText());
            b = Double.parseDouble(billtotal.getText());
            c = Double.parseDouble(billcustomerid.getText());
            d = billcustomername.getText();
            Statement st = con.createStatement();
            st.executeUpdate("insert into finalbill values(" + a + "," + b + ","+c+",'"+d+"')");
            JOptionPane.showMessageDialog(this, "Data Successfully Added");
            billtable.setVisible(false);
            tab2.setVisible(true);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        DefaultTableModel t1 = (DefaultTableModel) btable.getModel();
        Double bprice, total1 = 0d;
        for (int i = 0; i < t1.getRowCount(); i++) {
            bprice = Double.parseDouble(t1.getValueAt(i, 5).toString());
            total1 += bprice;
        }
        billtotal.setText(total1 + "");
    }//GEN-LAST:event_jButton33ActionPerformed

    private void bajajlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bajajlblMouseClicked
        bajaj.setVisible(true);
        tab1.setVisible(false);
    }//GEN-LAST:event_bajajlblMouseClicked

    private void bmwlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bmwlblMouseClicked
        bmw.setVisible(true);
        tab1.setVisible(false);
    }//GEN-LAST:event_bmwlblMouseClicked

    private void kawasakilblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kawasakilblMouseClicked
        kawasaki.setVisible(true);
        tab1.setVisible(false);
    }//GEN-LAST:event_kawasakilblMouseClicked

    private void royal_enfieldlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_royal_enfieldlblMouseClicked
        royal_enfield.setVisible(true);
        tab1.setVisible(false);
    }//GEN-LAST:event_royal_enfieldlblMouseClicked

    private void hondalblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hondalblMouseClicked
        honda.setVisible(true);
        tab1.setVisible(false);
    }//GEN-LAST:event_hondalblMouseClicked

    private void ktmlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ktmlblMouseClicked
        ktm.setVisible(true);
        tab1.setVisible(false);
    }//GEN-LAST:event_ktmlblMouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories", "root", "");
            JasperDesign jsd = JRXmlLoader.load("C:\\Users\\USER\\Desktop\\Java Tution\\Bike_Accessories\\Bike_Accessories\\src\\bike_accessories\\bill.jrxml");
            String sql = "select b.saleid,b.brand,b.model,b.accessory,b.quantity,b.price,f.id,f.total,f.custid,f.custname from bill b, finalbill f where b.saleid=" + reportsaleid.getSelectedItem() + " AND f.id=" + reportsaleid.getSelectedItem() + "";
            JRDesignQuery nq = new JRDesignQuery();
            nq.setText(sql);
            jsd.setQuery(nq);
            JasperReport jr = JasperCompileManager.compileReport(jsd);
            JasperPrint j = JasperFillManager.fillReport(jr, null, con);
            JasperViewer.viewReport(j);
            setState(this.ICONIFIED);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void backcartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backcartMouseClicked
        dashcart.setVisible(false);
        tab2.setVisible(true);
    }//GEN-LAST:event_backcartMouseClicked

    private void cartcalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartcalbtnActionPerformed
        DefaultTableModel t1 = (DefaultTableModel) carttable.getModel();
        Double camt, total1 = 0d;
        for (int i = 0; i < t1.getRowCount(); i++) {
            camt = Double.parseDouble(t1.getValueAt(i, 3).toString());
            total1 += camt;
        }
        carttotal.setText(total1 + "");
    }//GEN-LAST:event_cartcalbtnActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        DefaultTableModel t1 = (DefaultTableModel) carttable.getModel();
        try {
            String cid = "", product = "", price = "", quantity = "", amount = "";
            cid = cartid.getText();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories?zeroDateTimeBehavior=convertToNull", "root", "");
            for (int i = 0; i < t1.getRowCount(); i++) {
                product = t1.getValueAt(i, 0).toString();
                price = t1.getValueAt(i, 1).toString();
                quantity = t1.getValueAt(i, 2).toString();
                amount = t1.getValueAt(i, 3).toString();
                Statement st = con.createStatement();
                st.executeUpdate("insert into cart values('" + cid + "','" + product + "','" + price + "','" + quantity + "','" + amount + "')");
            }
            Double a, b;
            String c;
            a = Double.parseDouble(cartid.getText());
            b = Double.parseDouble(carttotal.getText());
            c = cartcustomername.getText();
            Statement st = con.createStatement();
            st.executeUpdate("insert into carttotal values(" + a + "," + b + ",'" + c + "')");
            //JOptionPane.showMessageDialog(this, "You can print your bill now!");
        } catch (SQLException e) {
            System.out.println(e);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike_accessories", "root", "");
            JasperDesign jsd = JRXmlLoader.load("C:\\Users\\USER\\Desktop\\Java Tution\\Bike_Accessories\\Bike_Accessories\\src\\bike_accessories\\cart.jrxml");
            String sql = "select c.purchaseid,c.product,c.price,c.quantity,c.amount,ct.cartid,ct.total,ct.name from cart c, carttotal ct where c.purchaseid=" + cartid.getText() + " AND ct.cartid=" + cartid.getText() + "";
            JRDesignQuery nq = new JRDesignQuery();
            nq.setText(sql);
            jsd.setQuery(nq);
            JasperReport jr = JasperCompileManager.compileReport(jsd);
            JasperPrint j = JasperFillManager.fillReport(jr, null, con);
            JasperViewer.viewReport(j);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton41ActionPerformed

    private void cartcustomernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cartcustomernameFocusGained
        String value = cartcustomername.getText().trim().toLowerCase();
        if (value.equals("full name")) {
            cartcustomername.setText("");
            cartcustomername.setForeground(Color.white);
        }
    }//GEN-LAST:event_cartcustomernameFocusGained

    private void cartcustomernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cartcustomernameFocusLost
        String value = cartcustomername.getText().trim().toLowerCase();
        if (value.equals("full name") || value.equals("")) {
            cartcustomername.setText("full name");
            cartcustomername.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_cartcustomernameFocusLost

    private void cartcustomernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cartcustomernameKeyPressed
        int i = evt.getKeyCode();
        if (i >= 65 && i <= 90 || i >= 97 && i <= 122) {
            cartcustomername.setEditable(true);
        } else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE) {
            cartcustomername.setEditable(true);
        } else {
            cartcustomername.setEditable(false);
        }
    }//GEN-LAST:event_cartcustomernameKeyPressed

    private void offeradd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offeradd1ActionPerformed
        DefaultTableModel t1 = (DefaultTableModel) carttable.getModel();
        String qnt;
        qnt = (offerq1.getSelectedItem() + "");
        Double q = Double.parseDouble(offerq1.getSelectedItem() + "");
        Double a = Double.parseDouble(offerp1.getText());
        Double amt;
        amt = a * q;
        String amt1 = Double.toString(amt);
        String d[] = {offern1.getText(), offerp1.getText(), qnt, amt1};
        t1.addRow(d);
    }//GEN-LAST:event_offeradd1ActionPerformed

    private void offeradd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offeradd2ActionPerformed
        DefaultTableModel t1 = (DefaultTableModel) carttable.getModel();
        String qnt;
        qnt = (offerq2.getSelectedItem() + "");
        Double q = Double.parseDouble(offerq2.getSelectedItem() + "");
        Double a = Double.parseDouble(offerp2.getText());
        Double amt;
        amt = a * q;
        String amt1 = Double.toString(amt);
        String d[] = {offern2.getText(), offerp2.getText(), qnt, amt1};
        t1.addRow(d);
    }//GEN-LAST:event_offeradd2ActionPerformed

    private void offeradd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offeradd3ActionPerformed
        DefaultTableModel t1 = (DefaultTableModel) carttable.getModel();
        String qnt;
        qnt = (offerq3.getSelectedItem() + "");
        Double q = Double.parseDouble(offerq3.getSelectedItem() + "");
        Double a = Double.parseDouble(offerp3.getText());
        Double amt;
        amt = a * q;
        String amt1 = Double.toString(amt);
        String d[] = {offern3.getText(), offerp3.getText(), qnt, amt1};
        t1.addRow(d);
    }//GEN-LAST:event_offeradd3ActionPerformed

    private void offeradd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offeradd4ActionPerformed
        DefaultTableModel t1 = (DefaultTableModel) carttable.getModel();
        String qnt;
        qnt = (offerq4.getSelectedItem() + "");
        Double q = Double.parseDouble(offerq4.getSelectedItem() + "");
        Double a = Double.parseDouble(offerp4.getText());
        Double amt;
        amt = a * q;
        String amt1 = Double.toString(amt);
        String d[] = {offern4.getText(), offerp4.getText(), qnt, amt1};
        t1.addRow(d);
    }//GEN-LAST:event_offeradd4ActionPerformed

    private void offeradd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offeradd5ActionPerformed
        DefaultTableModel t1 = (DefaultTableModel) carttable.getModel();
        String qnt;
        qnt = (offerq5.getSelectedItem() + "");
        Double q = Double.parseDouble(offerq5.getSelectedItem() + "");
        Double a = Double.parseDouble(offerp5.getText());
        Double amt;
        amt = a * q;
        String amt1 = Double.toString(amt);
        String d[] = {offern5.getText(), offerp5.getText(), qnt, amt1};
        t1.addRow(d);
    }//GEN-LAST:event_offeradd5ActionPerformed

    private void offeradd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offeradd6ActionPerformed
        DefaultTableModel t1 = (DefaultTableModel) carttable.getModel();
        String qnt;
        qnt = (offerq6.getSelectedItem() + "");
        Double q = Double.parseDouble(offerq6.getSelectedItem() + "");
        Double a = Double.parseDouble(offerp6.getText());
        Double amt;
        amt = a * q;
        String amt1 = Double.toString(amt);
        String d[] = {offern6.getText(), offerp6.getText(), qnt, amt1};
        t1.addRow(d);
    }//GEN-LAST:event_offeradd6ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Frame().setVisible(true);;

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutimg;
    private javax.swing.JPanel abouttab;
    private javax.swing.JLabel accaccessoryerror;
    private javax.swing.JTextField accaccessoryname;
    private javax.swing.JTextField accaccessoryprice;
    private javax.swing.JTextField accbrand;
    private javax.swing.JLabel accbranderror;
    private javax.swing.JTextField accbrandmodel;
    private javax.swing.JButton accclear;
    private javax.swing.JLabel accessoriesimg;
    private javax.swing.JPanel accessoriestab;
    private javax.swing.JTextField accessoryid;
    private javax.swing.JLabel accmodelerror;
    private javax.swing.JLabel accpriceerror;
    private javax.swing.JButton accsubmit;
    private javax.swing.JTextField applicationid;
    private javax.swing.JLabel backaccessories;
    private javax.swing.JLabel backcart;
    private javax.swing.JLabel backcustomer;
    private javax.swing.JLabel backdealer;
    private javax.swing.JLabel backpurchase;
    private javax.swing.JLabel backreport;
    private javax.swing.JLabel backsale;
    private javax.swing.JLabel backsetting;
    private javax.swing.JPanel bajaj;
    private javax.swing.JLabel bajajlbl;
    private javax.swing.JTextField billcustomerid;
    private javax.swing.JTextField billcustomername;
    private javax.swing.JTextField billid;
    private javax.swing.JPanel billtable;
    private javax.swing.JTextField billtotal;
    private javax.swing.JPanel bmw;
    private javax.swing.JLabel bmwlbl;
    private javax.swing.JPanel brandbajaj;
    private javax.swing.JPanel brandbmw;
    private javax.swing.JPanel brandhonda;
    private javax.swing.JPanel brandkawasaki;
    private javax.swing.JPanel brandktm;
    private javax.swing.JPanel brandroyalenfield;
    private javax.swing.JLabel brandsimg;
    private javax.swing.JPanel brandstab;
    private javax.swing.JTable btable;
    private javax.swing.JButton cartcalbtn;
    private javax.swing.JTextField cartcustomername;
    private javax.swing.JTextField cartid;
    private javax.swing.JTable carttable;
    private javax.swing.JTextField carttotal;
    private javax.swing.JPanel centerpanel;
    private javax.swing.JButton closebtn;
    private javax.swing.JPanel contentpanel;
    private javax.swing.JTextField customeraadhar;
    private javax.swing.JLabel customeraadharerror;
    private javax.swing.JTextField customeraddress;
    private javax.swing.JLabel customeraddresserror;
    private javax.swing.JTextField customerage;
    private javax.swing.JLabel customerageerror;
    private javax.swing.JTextField customercity;
    private javax.swing.JLabel customercityerror;
    private javax.swing.JButton customerclear;
    private com.toedter.calendar.JDateChooser customerdob;
    private javax.swing.JLabel customerdoberror;
    private javax.swing.JTextField customeremail;
    private javax.swing.JLabel customeremailerror;
    private javax.swing.JTextField customerfullname;
    private javax.swing.JLabel customergendererror;
    private javax.swing.JTextField customermobile;
    private javax.swing.JLabel customermobileerror;
    private javax.swing.JLabel customernameerror;
    private javax.swing.JTextField customerpincode;
    private javax.swing.JLabel customerpincodeerror;
    private javax.swing.JButton customersubmit;
    private javax.swing.JPanel dash1;
    private javax.swing.JPanel dash2;
    private javax.swing.JPanel dash3;
    private javax.swing.JPanel dash4;
    private javax.swing.JPanel dash5;
    private javax.swing.JPanel dash7;
    private javax.swing.JPanel dash8;
    private javax.swing.JPanel dash9;
    private javax.swing.JPanel dashaccessories;
    private javax.swing.JPanel dashaddcustomer;
    private javax.swing.JLabel dashboardimg;
    private javax.swing.JPanel dashboardtab;
    private javax.swing.JPanel dashcart;
    private javax.swing.JPanel dashdealer;
    private javax.swing.JPanel dashpurchase;
    private javax.swing.JPanel dashreport;
    private javax.swing.JPanel dashsale;
    private javax.swing.JPanel dashsetting;
    private javax.swing.JTextField dealeraddress;
    private javax.swing.JLabel dealeraddresserror;
    private javax.swing.JLabel dealeragencyerror;
    private javax.swing.JTextField dealeragencyname;
    private javax.swing.JTextField dealercity;
    private javax.swing.JLabel dealercityerror;
    private javax.swing.JButton dealerclear;
    private javax.swing.JTextField dealeremail;
    private javax.swing.JLabel dealeremailerror;
    private javax.swing.JTextField dealerfullname;
    private javax.swing.JTextField dealerid;
    private javax.swing.JTextField dealermobile;
    private javax.swing.JLabel dealermobileerror;
    private javax.swing.JLabel dealernameerror;
    private javax.swing.JTextField dealerpincode;
    private javax.swing.JLabel dealerpincodeerror;
    private javax.swing.JButton dealersubmit;
    private javax.swing.JButton facebookbtn;
    private javax.swing.JPanel facebooktab;
    private javax.swing.JRadioButton female;
    private javax.swing.ButtonGroup gendergroup;
    private javax.swing.JLabel homeimg;
    private javax.swing.JPanel hometab;
    private javax.swing.JPanel honda;
    private javax.swing.JLabel hondalbl;
    private javax.swing.JButton instagrambtn;
    private javax.swing.JPanel instagramtab;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox31;
    private javax.swing.JComboBox<String> jComboBox32;
    private javax.swing.JComboBox<String> jComboBox33;
    private javax.swing.JComboBox<String> jComboBox34;
    private javax.swing.JComboBox<String> jComboBox36;
    private javax.swing.JComboBox<String> jComboBox37;
    private javax.swing.JComboBox<String> jComboBox38;
    private javax.swing.JComboBox<String> jComboBox39;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox41;
    private javax.swing.JComboBox<String> jComboBox42;
    private javax.swing.JComboBox<String> jComboBox44;
    private javax.swing.JComboBox<String> jComboBox46;
    private javax.swing.JComboBox<String> jComboBox47;
    private javax.swing.JComboBox<String> jComboBox48;
    private javax.swing.JComboBox<String> jComboBox49;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox51;
    private javax.swing.JComboBox<String> jComboBox52;
    private javax.swing.JComboBox<String> jComboBox53;
    private javax.swing.JComboBox<String> jComboBox54;
    private javax.swing.JComboBox<String> jComboBox55;
    private javax.swing.JComboBox<String> jComboBox56;
    private javax.swing.JComboBox<String> jComboBox57;
    private javax.swing.JComboBox<String> jComboBox59;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel305;
    private javax.swing.JLabel jLabel306;
    private javax.swing.JLabel jLabel307;
    private javax.swing.JLabel jLabel308;
    private javax.swing.JLabel jLabel309;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel310;
    private javax.swing.JLabel jLabel311;
    private javax.swing.JLabel jLabel312;
    private javax.swing.JLabel jLabel318;
    private javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel320;
    private javax.swing.JLabel jLabel321;
    private javax.swing.JLabel jLabel322;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel334;
    private javax.swing.JLabel jLabel335;
    private javax.swing.JLabel jLabel336;
    private javax.swing.JLabel jLabel337;
    private javax.swing.JLabel jLabel338;
    private javax.swing.JLabel jLabel339;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel340;
    private javax.swing.JLabel jLabel341;
    private javax.swing.JLabel jLabel342;
    private javax.swing.JLabel jLabel343;
    private javax.swing.JLabel jLabel344;
    private javax.swing.JLabel jLabel345;
    private javax.swing.JLabel jLabel346;
    private javax.swing.JLabel jLabel347;
    private javax.swing.JLabel jLabel348;
    private javax.swing.JLabel jLabel349;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel350;
    private javax.swing.JLabel jLabel351;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JPanel kawasaki;
    private javax.swing.JLabel kawasakilbl;
    private javax.swing.JPanel ktm;
    private javax.swing.JLabel ktmlbl;
    private javax.swing.JPanel logouttab;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JRadioButton male;
    private javax.swing.JButton minimizebtn;
    private javax.swing.JButton offeradd1;
    private javax.swing.JButton offeradd2;
    private javax.swing.JButton offeradd3;
    private javax.swing.JButton offeradd4;
    private javax.swing.JButton offeradd5;
    private javax.swing.JButton offeradd6;
    private javax.swing.JPanel offercart1;
    private javax.swing.JPanel offercart2;
    private javax.swing.JPanel offercart3;
    private javax.swing.JPanel offercart4;
    private javax.swing.JPanel offercart5;
    private javax.swing.JPanel offercart6;
    private javax.swing.JLabel offern1;
    private javax.swing.JLabel offern2;
    private javax.swing.JLabel offern3;
    private javax.swing.JLabel offern4;
    private javax.swing.JLabel offern5;
    private javax.swing.JLabel offern6;
    private javax.swing.JLabel offerp1;
    private javax.swing.JLabel offerp2;
    private javax.swing.JLabel offerp3;
    private javax.swing.JLabel offerp4;
    private javax.swing.JLabel offerp5;
    private javax.swing.JLabel offerp6;
    private javax.swing.JComboBox<String> offerq1;
    private javax.swing.JComboBox<String> offerq2;
    private javax.swing.JComboBox<String> offerq3;
    private javax.swing.JComboBox<String> offerq4;
    private javax.swing.JComboBox<String> offerq5;
    private javax.swing.JComboBox<String> offerq6;
    private javax.swing.JLabel offersimg;
    private javax.swing.JPanel offerstab;
    private javax.swing.JRadioButton others;
    private javax.swing.JComboBox<String> puraccessoryid;
    private javax.swing.JLabel puraccessoryiderror;
    private javax.swing.JTextField puraccessoryname;
    private javax.swing.JTextField puragencyname;
    private javax.swing.JTextField purbill;
    private javax.swing.JTextField purbrand;
    private javax.swing.JTextField purbrandmodel;
    private javax.swing.JButton purbuy;
    private javax.swing.JLabel purbuyerror;
    private javax.swing.JTextField purchaseid;
    private javax.swing.JComboBox<String> purdealerid;
    private javax.swing.JLabel purdealeriderror;
    private javax.swing.JTextField purdiscount;
    private javax.swing.JLabel purdiscounterror;
    private javax.swing.JTextField purprice;
    private javax.swing.JLabel purpriceerror;
    private javax.swing.JComboBox<String> purquantity;
    private javax.swing.JLabel purquantityerror;
    private javax.swing.JComboBox<String> reportsaleid;
    private javax.swing.JPanel royal_enfield;
    private javax.swing.JLabel royal_enfieldlbl;
    private javax.swing.JTextField saleaccessoryname;
    private javax.swing.JButton saleanother;
    private javax.swing.JTextField salebill;
    private javax.swing.JLabel salebillerror;
    private javax.swing.JTextField salebrand;
    private javax.swing.JTextField salebrandmodel;
    private javax.swing.JButton salecalculatebtn;
    private javax.swing.JComboBox<String> salecustomerid;
    private javax.swing.JLabel salecustomeriderror;
    private javax.swing.JTextField salecustomername;
    private javax.swing.JTextField salediscount;
    private javax.swing.JLabel salediscounterror;
    private javax.swing.JTextField salegst;
    private javax.swing.JLabel salegsterror;
    private javax.swing.JTextField saleid;
    private javax.swing.JTextField saleprice;
    private javax.swing.JLabel salepriceerror;
    private javax.swing.JComboBox<String> salepurchaseid;
    private javax.swing.JLabel salepurchaseiderror;
    private javax.swing.JTextField salepurchaseprice;
    private javax.swing.JComboBox<String> salequantity;
    private javax.swing.JLabel salequantityerror;
    private javax.swing.JTextField salestock;
    private javax.swing.JButton salesubmitbtn;
    private javax.swing.JTextField saletotal;
    private javax.swing.JLabel saletotalerror;
    private javax.swing.JButton saleviewbill;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JLabel sidepanellogo;
    private javax.swing.JLabel supportimg;
    private javax.swing.JPanel supporttab;
    private javax.swing.JPanel tab1;
    private javax.swing.JLabel tab1lbl;
    private javax.swing.JPanel tab2;
    private javax.swing.JLabel tab2lbl;
    private javax.swing.JPanel tab3;
    private javax.swing.JLabel tab3lbl;
    private javax.swing.JPanel tab4;
    private javax.swing.JLabel tab4lbl;
    private javax.swing.JPanel tab5;
    private javax.swing.JLabel tab5lbl;
    private javax.swing.JPanel tab6;
    private javax.swing.JLabel tab6lbl;
    private javax.swing.JPanel tab7;
    private javax.swing.JLabel tab7lbl;
    private javax.swing.JLabel tab8lbl;
    private javax.swing.JPanel titlepanel;
    public static javax.swing.JLabel usernamelbl;
    // End of variables declaration//GEN-END:variables

}
