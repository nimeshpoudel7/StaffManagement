    import java.awt.BorderLayout;
    import java.awt.Color;
    import java.awt.Dimension;
    import java.awt.Font;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.ArrayList;
    import java.util.ConcurrentModificationException;
    import javax.swing.BorderFactory;
    import javax.swing.BoxLayout;
    import javax.swing.ImageIcon;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JOptionPane;
    import javax.swing.JPanel;
    import javax.swing.JScrollBar;
    import javax.swing.JScrollPane;
    import javax.swing.JTextField;
    import javax.swing.UIManager;
    
    /**
     * 
     *
     * @Nimesh Poudel
     * @version v0.1
     */
    
    public class INGNepal implements ActionListener {
         public JFrame frame,frame1,framein,frame2,frameck,frametm,framedis;
         private String choice,realDesignation,realJob,realShift;
         private JPanel cointainfu,cointain,cointainfuap,InformationStaff,terminatepanel;
         private JButton Fullva,Fullap,Partva,Partap,display,terminate,hire,
         cancel,submit1,submit2,infoClear,infoSave,ckbtn,btnterminate,ckcl;
         private JTextField inputvano,inputde,inputjb,inputsa,inputwh,inputwg,
         inputsh,inputvcba,vivac,vijobtype,videsign,viappol,vishift,vistaff,viworkHour,
         vijoindate,viquali,viwageper,visalary,inputtem;
         private int realVacancy,realSalary,realWorkHour,realWage;
         boolean copyCheck=false;
         boolean toAddinside;
         boolean terbo=true;
         ArrayList<StaffHire> ingArray = new ArrayList<>(); //creating an arraylist of StaffHire ingArray
        public static void main(String[] args) { //main method
            INGNepal obj1=new INGNepal(); //creating object  of INGNepal
            obj1.GuiBox(); //Calling GuiBox method
            
            UIManager.put("OptionPane.background", Color.darkGray); // changing background color of JOptionPane
            UIManager.put("Panel.background", Color.darkGray); // changing panel color of JOptionPane
            UIManager.put("Button.background", Color.lightGray); // changing button color of JOptionPane
           
            UIManager.put("OptionPane.messageForeground",Color.lightGray); // changing background color of JOptionPane
        
         
        }
        
        private void GuiBox() { // creating method for main GUI home page
             frame=new JFrame("Main");
            frame.setSize(500, 270);
            frame.setPreferredSize(new Dimension(500,380));
            
             cointain=new JPanel(null);
            cointain.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            cointain.setBackground(Color.DARK_GRAY);
           
            //creaating jpanel
            
            ImageIcon img = new ImageIcon("image/6.png");
            ImageIcon img1 = new ImageIcon("image/4.png");
            ImageIcon img2 = new ImageIcon("image/7.png");
            ImageIcon img3 = new ImageIcon("image/8.png");
            JLabel titJLabel=new JLabel("ING Nepal");
            titJLabel.setBounds(150,0,250,40);
            titJLabel.setFont(new Font("SansSeri", Font.ITALIC, 38));
    
            titJLabel.setForeground(Color.white);
             Fullva = new JButton("Add Vacancy for Full Time",img);
            Fullva.setBounds(100,50,250,40);
            
            Fullva.setBackground(Color.GRAY);
            Fullap  = new JButton("Appoint Full Time Staff",img1);
               Fullap.setBounds(100,150,250,40);
               Fullap.setBackground(Color.GRAY);
             Partva = new JButton("Add Vacancy for Part Time",img);
            Partva.setBounds(100,100,250,40);
            Partva.setBackground(Color.LIGHT_GRAY);
            
             Partap = new JButton("Appoint Part Time Staff",img1);
            Partap.setBounds(100,200,250,40);
            Partap.setBackground(Color.LIGHT_GRAY);
             display = new JButton("Display the records!",img2);
            display.setBounds(100,245,250,40);
            display.setBackground(Color.GRAY);
             terminate = new JButton("Terminate a staff!",img3);
            terminate.setBounds(100,290,250,40);
            terminate.setBackground(Color.lightGray);
            //adding button in panel
            cointain.add(titJLabel);
            cointain.add(Fullva);
            cointain.add(Fullap);
            cointain.add(Partva);
           
            cointain.add(Partap);
            cointain.add(display);
            cointain.add(terminate);
            //action listener
            Fullva.addActionListener(this);
            Partva.addActionListener(this);
            Fullap.addActionListener(this);
            Partap.addActionListener(this);
            terminate.addActionListener(this);
            display.addActionListener(this);
           // adding panel in frame
            frame.add(cointain);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to exit whole program when x is clicked
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            
        
        }
        //method for add vacancy GUI
        private void Fulltimeva() {
            frame1=new JFrame("Add Vacancy");
            frame1.setSize(500, 250);
            JLabel titJLabel=new JLabel("ING Nepal");
            titJLabel.setBounds(150,0,250,40);
            titJLabel.setFont(new Font("SansSeri", Font.ITALIC, 38));
            titJLabel.setForeground(Color.white);
            frame1.setPreferredSize(new Dimension(500,380));
            ImageIcon img = new ImageIcon("image/9.png");
            ImageIcon img1 = new ImageIcon("image/10.png");
            //creaating jpanel
            cointainfu=new JPanel(null);
            cointainfu.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            cointainfu.setBackground(Color.DARK_GRAY);
            JLabel lbl1 =new JLabel("Vacancy Number:");
            lbl1.setBounds(20, 60, 150, 20);
            lbl1.setFont(new Font("SansSeri", Font.BOLD,15));
            lbl1.setForeground(Color.LIGHT_GRAY);
             inputvano=new JTextField(5);
             inputvano.setFont(new Font("Calibri",Font.BOLD,15));
            inputvano.setBounds(260, 60, 180, 25);
            JLabel lbl2 =new JLabel("Designation :");
            lbl2.setBounds(20, 95, 150, 20);
            lbl2.setFont(new Font("SansSeri", Font.BOLD,15));
            lbl2.setForeground(Color.LIGHT_GRAY);
             inputde=new JTextField(12);
            inputde.setBounds(260, 95, 180, 25);
            inputde.setFont(new Font("Calibri",Font.BOLD,15));
            JLabel lbl3 =new JLabel("Job Type :");
            lbl3.setBounds(20, 130, 150, 20);
            lbl3.setFont(new Font("SansSeri", Font.BOLD,15));
            lbl3.setForeground(Color.LIGHT_GRAY);
             inputjb=new JTextField(15);
             inputjb.setText(choice);
             inputjb.setBounds(260, 130, 180, 25);
             inputjb.setFont(new Font("Calibri",Font.BOLD,15));
             inputjb.setEditable(false);
            JLabel lbl4 =new JLabel("Salary :");
            lbl4.setBounds(20, 165, 150, 20);
            lbl4.setFont(new Font("SansSeri", Font.BOLD,15));
            lbl4.setForeground(Color.LIGHT_GRAY);
             inputsa=new JTextField(5);
            inputsa.setBounds(260, 165, 180, 25);
            JLabel lbl5 =new JLabel("Working Hour :");
            lbl5.setBounds(20, 200, 150, 20);
            lbl5.setFont(new Font("SansSeri", Font.BOLD,15));
            lbl5.setForeground(Color.LIGHT_GRAY);
             inputwh=new JTextField(4);
            inputwh.setBounds(260, 200, 180, 25);
            JLabel lbl6=new JLabel("Wages Per Hour");
            lbl6.setBounds(20, 165, 150, 20);
            lbl6.setFont(new Font("SansSeri", Font.BOLD,15));
            lbl6.setForeground(Color.LIGHT_GRAY);
             inputwg=new JTextField(10);
            inputwg.setBounds(260, 165, 180, 25);
            JLabel lbl7=new JLabel("Shift");
            lbl7.setBounds(20, 235, 150, 20);
            lbl7.setFont(new Font("SansSeri", Font.BOLD,15));
            lbl7.setForeground(Color.LIGHT_GRAY);
             inputsh=new JTextField(10);
            inputsh.setBounds(260, 235, 180, 25);
            inputsh.setFont(new Font("Calibri",Font.BOLD,15));
            inputwg.setFont(new Font("Calibri",Font.BOLD,15));
            inputwh.setFont(new Font("Calibri",Font.BOLD,15));
            inputsa.setFont(new Font("Calibri",Font.BOLD,15));
            
             hire = new JButton("Ok",img);
            hire.setBounds(80, 280, 120, 40);
            hire.setBackground(Color.lightGray);
            hire.addActionListener(this);// action listener for hire button
            
             cancel=new JButton("Clear",img1);
            cancel.setBounds(230, 280, 120, 40);
            cancel.setBackground(Color.lightGray);
            cancel.addActionListener(this); // aaction listener for cancel button
            // adding component in panel
            cointainfu.add(lbl1);
            cointainfu.add(inputvano);
            cointainfu.add(lbl2);
            cointainfu.add(inputde);
            cointainfu.add(lbl3);
            cointainfu.add(inputjb);
            
            cointainfu.add(lbl5);
            cointainfu.add(inputwh);
            cointainfu.add(hire);
            cointainfu.add(cancel);
            cointainfu.add(titJLabel);
            // adding panel in frame
            frame1.add(cointainfu);
            frame1.pack();
            frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// dispose when x is clicked
            frame1.setVisible(true);
            //i f conditon to look form different for full time and part time
            if(choice.equals("Full Time")){
                cointainfu.add(lbl4);
                cointainfu.add(inputsa);
            }
            if(choice.equals("Part Time")){
                cointainfu.add(lbl6);
                cointainfu.add(inputwg);
                cointainfu.add(lbl7);
                cointainfu.add(inputsh);
            }
        
        }
      //methof for apppointing staff
      public void Fulltimeapoint() {
          frame2=new JFrame("Appoint Staff");
            frame2.setSize(500, 250);
            JLabel titJLabel=new JLabel("ING Nepal");
            titJLabel.setBounds(150,0,250,40);
            titJLabel.setFont(new Font("SansSeri", Font.ITALIC, 38));
            titJLabel.setForeground(Color.white);
            frame2.setPreferredSize(new Dimension(500,380));
            ImageIcon img1= new ImageIcon("image/4.png");
            
            
            cointainfuap=new JPanel(null);
            cointainfuap.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            cointainfuap.setBackground(Color.DARK_GRAY);
            
            JLabel lbl1 =new JLabel("Please Enter Vacancy Number");
            lbl1.setBounds(140, 110, 300, 20);
            lbl1.setFont(new Font("SansSeri", Font.BOLD,15));
            lbl1.setForeground(Color.LIGHT_GRAY);
            
            inputvcba=new JTextField(5);
            inputvcba.setBounds(150, 140, 180, 30);
            inputvcba.setFont(new Font("Calibri",Font.BOLD,15));
            // ading component in panel
            cointainfuap.add(titJLabel);
            cointainfuap.add(lbl1);
            cointainfuap.add(inputvcba);
        
        
            // adding panel in frame
            frame2.add(cointainfuap);
            frame2.pack();
            frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame2.setVisible(true);
            // if condition for button . to add part time and full time staff
            if(choice.equals("Full Time")){
                submit1=new JButton("Hire",img1);
                submit1.setBounds(180, 180, 120, 40);
                submit1.setBackground(Color.lightGray);
                cointainfuap.add(submit1);
                submit1.addActionListener(this);
            }
            if(choice.equals("Part Time")){
                submit2=new JButton("Hire",img1);
                submit2.setBounds(180, 180, 120, 40);
                submit2.setBackground(Color.lightGray);
                cointainfuap.add(submit2);
                submit2.addActionListener(this);
            }
                  
      }
      //form for appointing staff staffname,qualification etc
      public void InsideHiring() {
          framein=new JFrame("Staff apointment");
            framein.setSize(500, 250);
            JLabel titJLabel=new JLabel("ING Nepal");
            titJLabel.setBounds(250,0,250,40);
            titJLabel.setFont(new Font("SansSeri", Font.ITALIC, 38));
            titJLabel.setForeground(Color.white);
            ImageIcon img1= new ImageIcon("image/10.png");
            ImageIcon img= new ImageIcon("image/save.png");
            InformationStaff=new JPanel(null);
            InformationStaff.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            InformationStaff.setBackground(Color.DARK_GRAY);
            JLabel lblvacancy = new JLabel("Vacancy Number:");
            JLabel lbljobtype = new JLabel("Job Type:");
            JLabel lblDesigna = new JLabel("Designation:");
            JLabel lblstaffName = new JLabel("Staff Name :");
            JLabel lblquali= new JLabel("Qualification :");
            JLabel lblworkHour = new JLabel("Working Hour :");
            JLabel lbljoinDate = new JLabel("Joining Date :");
            JLabel lblappol = new JLabel("Appointed By :");
            JLabel lblshift = new JLabel("Shift :");
            JLabel lblwageper = new JLabel("Wage per Hour :");
            JLabel lblsalary = new JLabel("Salary :");
            // changing integer to string
            String salar = Integer.toString(realSalary);
            String wage = Integer.toString(realWage);
            String hour = Integer.toString(realWorkHour);
            String vac = Integer.toString(realVacancy);
            vivac=new JTextField();
            vijobtype=new JTextField();
            videsign=new JTextField();
            vistaff=new JTextField();
            viquali=new JTextField();
           viworkHour=new JTextField();
            vijoindate=new JTextField();
            viappol=new JTextField();
           vishift=new JTextField();
           viwageper=new JTextField();
           visalary=new JTextField();
           //displaying in text field
          
           viworkHour.setText(hour);
           viwageper.setText(wage);
           vivac.setText(vac);
           vijobtype.setText(realJob);
          videsign.setText(realDesignation);
          vishift.setText(realShift);
           
            lblvacancy.setBounds(20, 60, 150, 20);
            lblvacancy.setFont(new Font("SansSeri", Font.BOLD,15));
            lblvacancy.setForeground(Color.LIGHT_GRAY);
            
            lbljobtype.setBounds(200, 60, 150, 20);
            lbljobtype.setFont(new Font("SansSeri", Font.BOLD,15));
            lbljobtype.setForeground(Color.LIGHT_GRAY);
            
            lblDesigna.setBounds(360, 60, 150, 20);
            lblDesigna.setFont(new Font("SansSeri", Font.BOLD,15));
            lblDesigna.setForeground(Color.LIGHT_GRAY);
    
            lblappol.setBounds(520, 130, 150, 20);
            lblappol.setFont(new Font("SansSeri", Font.BOLD,15));
            lblappol.setForeground(Color.LIGHT_GRAY);
            
            lblstaffName.setBounds(20, 130, 150, 20);
            lblstaffName.setFont(new Font("SansSeri", Font.BOLD,15));
            lblstaffName.setForeground(Color.LIGHT_GRAY);
            
            lblquali.setBounds(200, 130, 150, 20);
            lblquali.setFont(new Font("SansSeri", Font.BOLD,15));
            lblquali.setForeground(Color.LIGHT_GRAY);
            
            lblworkHour.setBounds(520, 60, 150, 20);
            lblworkHour.setFont(new Font("SansSeri", Font.BOLD,15));
            lblworkHour.setForeground(Color.LIGHT_GRAY);
            
            lbljoinDate.setBounds(360, 130, 150, 20);
            lbljoinDate.setFont(new Font("SansSeri", Font.BOLD,15));
            lbljoinDate.setForeground(Color.LIGHT_GRAY);
            
            lblshift.setBounds(20, 200, 150, 20);
            lblshift.setFont(new Font("SansSeri", Font.BOLD,15));
            lblshift.setForeground(Color.LIGHT_GRAY);
            
            lblwageper.setBounds(200, 200, 150, 20);
            lblwageper.setFont(new Font("SansSeri", Font.BOLD,15));
            lblwageper.setForeground(Color.LIGHT_GRAY);
            
            lblsalary.setBounds(20, 200, 150, 20);
            lblsalary.setFont(new Font("SansSeri", Font.BOLD,15));
            lblsalary.setForeground(Color.LIGHT_GRAY);
            
            vivac.setBounds(20, 95, 140, 26);
            vivac.setFont(new Font("Calibri",Font.BOLD,15));
            vijobtype.setBounds(200, 95, 140, 26);
            vijobtype.setFont(new Font("Calibri",Font.BOLD,15));
            videsign.setBounds(360, 95, 140, 26);
            videsign.setFont(new Font("Calibri",Font.BOLD,15));
            viappol.setBounds(520, 165, 140, 26);
            viappol.setFont(new Font("Calibri",Font.BOLD,15));
            vistaff.setBounds(20, 165, 140, 26);
            vistaff.setFont(new Font("Calibri",Font.BOLD,15));
            viquali.setBounds(200, 165, 140, 26);
            viquali.setFont(new Font("Calibri",Font.BOLD,15));
            viworkHour.setBounds(520, 95, 140, 26);
            viworkHour.setFont(new Font("Calibri",Font.BOLD,15));
            vijoindate.setBounds(360, 165, 140, 26);
            vijoindate.setFont(new Font("Calibri",Font.BOLD,15));
            vishift.setBounds(20, 235, 140, 26);
            vishift.setFont(new Font("Calibri",Font.BOLD,15));
            viwageper.setBounds(200, 235, 140,26);
            viwageper.setFont(new Font("Calibri",Font.BOLD,15));
            visalary.setBounds(20, 235, 140,26);
            visalary.setFont(new Font("Calibri",Font.BOLD,15));
            
            infoSave=new JButton("Save",img);
            infoClear=new JButton("Clear",img1);
            infoClear.setBackground(Color.lightGray);
            infoClear.setBounds(560, 290, 120, 40);
            infoSave.setBackground(Color.lightGray);
            infoSave.setBounds(420, 290, 120, 40);
            //adding component in panel
            InformationStaff.add(infoSave);
            InformationStaff.add(infoClear);
            //action lsnr for buton
            infoClear.addActionListener(this);
            infoSave.addActionListener(this);
          //adding component in panel
            InformationStaff.add(lblvacancy);
            InformationStaff.add(lbljobtype);
            InformationStaff.add(lblDesigna);
            InformationStaff.add(lblappol);
            InformationStaff.add(lblstaffName);
            InformationStaff.add(lblquali);
            InformationStaff.add(lblworkHour);
            InformationStaff.add(lbljoinDate);
            
            
            
            InformationStaff.add(vivac);
            InformationStaff.add(vijobtype);
            InformationStaff.add(videsign);
            InformationStaff.add(viappol);
            InformationStaff.add(vistaff);
            InformationStaff.add(viquali);
            InformationStaff.add(viworkHour);
            InformationStaff.add(vijoindate);
            
        
            
            InformationStaff.add(titJLabel);
            // if condition to look different form for different jot type
             if(choice.equals("Full Time")){
                 InformationStaff.add(lblsalary);
                    visalary.setText(salar);
                    InformationStaff.add(visalary);
                }
                
             if(choice.equals("Part Time")){
                    InformationStaff.add(lblshift);
                    InformationStaff.add(lblwageper);
                    InformationStaff.add(vishift);
                    InformationStaff.add(viwageper);
                }
             // making some text non editiable
              vivac.setEditable(false);
              vijobtype.setEditable(false);
              videsign.setEditable(false);
              viwageper.setEditable(false);
              viworkHour.setEditable(false);
              visalary.setEditable(false);
              vishift.setEditable(false);
                //adding panel in frame
            framein.add(InformationStaff);
            framein.setPreferredSize(new Dimension(700,380));
            framein.pack();
            framein.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            framein.setVisible(true);
      }
      // termination gui
      public void termGui(){
          frametm=new JFrame("Terminate Staff");
            frametm.setSize(500, 250);
            JLabel titJLabel=new JLabel("ING Nepal");
            titJLabel.setBounds(150,0,250,40);
            titJLabel.setFont(new Font("SansSeri", Font.ITALIC, 38));
            titJLabel.setForeground(Color.white);
            frametm.setPreferredSize(new Dimension(500,380));
            ImageIcon img1= new ImageIcon("image/8.png");
            
            terminatepanel=new JPanel(null);
            terminatepanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            terminatepanel.setBackground(Color.DARK_GRAY);
            
            JLabel lbltem =new JLabel("Please Enter Vacancy Number");
            lbltem.setBounds(140, 110, 300, 20);
            lbltem.setFont(new Font("SansSeri", Font.BOLD,15));
            lbltem.setForeground(Color.LIGHT_GRAY);
            
            btnterminate=new JButton("Terminate",img1);
            btnterminate.setBounds(165, 180, 150, 40);
            btnterminate.setBackground(Color.lightGray);
            terminatepanel.add(btnterminate);
            btnterminate.addActionListener(this);// action listener for button
            
            inputtem=new JTextField();
            inputtem.setBounds(150, 140, 180, 30);
            inputtem.setFont(new Font("Calibri",Font.BOLD,15));
            frametm.add(terminatepanel);// adding panel in frame
            terminatepanel.add(titJLabel);
            terminatepanel.add(lbltem);
            terminatepanel.add(inputtem);
            frametm.pack();
            frametm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frametm.setVisible(true);
            }
      // display Gui
      public void displaymethod(){
    
          framedis=new JFrame("Display");
          framedis.setSize(800, 380);
         
         JPanel panelDisplayJPanel=new JPanel(null);
          panelDisplayJPanel.setBackground(Color.darkGray);
          //calling fullTimeData and PartTimedata method and adding in jlabel
          JLabel titJLabel=new JLabel(fullTimeData() + partTimeData());
          JScrollPane scroll = new JScrollPane(null);
            scroll.setViewportView(titJLabel);
          titJLabel.setFont(new Font("Calibri", Font.BOLD, 18));
          titJLabel.setForeground(Color.lightGray);
          titJLabel.setOpaque(true);
          titJLabel.setBackground(Color.DARK_GRAY);
         // adding scroll bar
          scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
          scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
          scroll.getVerticalScrollBar().setBackground(Color.DARK_GRAY);
         
          
         
          scroll.setBounds(5, 50, 575, 470);
          JLabel DisplayLabel=new JLabel("ING Nepal");
          DisplayLabel.setBounds(220, 0, 250, 40);
          DisplayLabel.setFont(new Font("SansSeri", Font.ITALIC, 38));
          DisplayLabel.setForeground(Color.white);
          //adding component in panel
             panelDisplayJPanel.add(scroll);
            
            panelDisplayJPanel.add(DisplayLabel);
           
           //adding panel in frame
          framedis.setPreferredSize(new Dimension(600,580));
          framedis.add(panelDisplayJPanel);
         framedis.pack();
         framedis.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          framedis.setVisible(true);
      }
    // displaying full time staff data
      public String fullTimeData(){
    	  //creating com in order to store and return value
          String com = "<html> ----------------------------------------Full Time Staff----------------------------------";
          for( StaffHire temp : ingArray){ // for each loop
              if(temp instanceof FullTimeStaffHire){// checking  if temp is an instance of FullTimeStaffHire class or not
                  FullTimeStaffHire displayobj = (FullTimeStaffHire) temp;// Downcasting the object if FullTimeStaffHire
                //getting values from array list
                  com = com +"<br>Vacancy no. "+temp.getVacancyNo()+""; 
                  com = com +"<br>Staff Name : "+ displayobj.getstaffName();
                  com = com +"<br>Qualification : "+ displayobj.getqualification();
                  com = com +"<br>Job Type : "+ temp.getJobType();
                  com = com +"<br>Designation : " + temp.getDesignation();
                  
                  com = com +"<br>Salary : "+ displayobj.getsalary();
                  com = com +"<br>Work Hour : "+ displayobj.getworkHour();
                 
                  com = com +"<br>Join Date : "+ displayobj.getjoinDate();
               
                  com = com +"<br>Appointed By : "+ displayobj.getappointedBy();
                  com = com +"<br>";
              }
          }
          return com;// retuning data of full time staff
      }
    // method to display part time data
      public String partTimeData(){
    	  //creaating string com for store and return value for part time
          String com = "<br>----------------------------------------Part Time Staff----------------------------------";
          for( StaffHire temp : ingArray){// // for each loop
              if(temp instanceof PartTimeStaffHire){ // checking  if temp is an instance of PartTimeStaffHire class or not
                  PartTimeStaffHire displayobj = (PartTimeStaffHire) temp; // Downcasting the object if PartTimeStaffHire
                //getting values from array list
                  com = com +"<br>Vacancy no. "+temp.getVacancyNo();
               
                  com = com +"<br>Staff Name : "+displayobj.getstaffName();
                  com = com +"<br>Qualification : "+ displayobj.getqualification();
                  com = com +"<br>Job Type : "+temp.getJobType();
                  com = com +"<br>Designation : " + temp.getDesignation();
                  
                  com = com +"<br>Work Hour : "+displayobj.getworkHour();
                  com = com +"<br>Wage per Hour : "+ displayobj.getwagePerHour();
                  com = com +"<br>Shift : "+ displayobj.getshifts();
                 
                  com = com +"<br>Join Date : "+displayobj.getjoinDate();
                 
                  com = com +"<br>Appointed By : "+displayobj.getappointedBy();
                  com = com +"<br>";
                 
              }
          }
          return com+"</html>"; // returning data of part time
      }   
      
      //
     
          private void vacancyforward(){
                boolean flag = false;   // to check wether the text box is empty or not if empty show message 
                // if box in not empty the boolean value will true
                if(choice.equals("Full Time")) {
                    if (inputvano.getText().equals("") || inputde.getText().equals("") || inputsa.getText().equals("") || inputwh.getText().equals("")) {
                        JOptionPane.showMessageDialog(frame1, "Please fill out all the text fields", "Error", JOptionPane.ERROR_MESSAGE);
                        flag=true;
                        
                    }
                }
                // to check wether the text box is empty or not if empty show message 
                // if box in not empty the boolean value will true
                else if(choice.equals("Part Time")) {
                    if (inputvano.getText().equals("") || inputde.getText().equals("") || inputwg.getText().equals("") || inputsh.getText().equals("")
                    || inputwh.getText().equals("")){
                        JOptionPane.showMessageDialog(frame1, "Please fill out all the text fields", "Error", JOptionPane.ERROR_MESSAGE);
                        flag=true;
                        
                    }
                    
                }
                if(flag==false) {  
                   
                     // if textbocy is not empty and vacancy number is avaialbe then this code will excutive
                    try {
                        ImageIcon img1= new ImageIcon("image/suc.png");
                        if (choice.equals("Full Time")) {//adding staff for full time
                            FullTimeStaffHire objF = new FullTimeStaffHire(vacancyFrom(), designationFrom(), choice, salaryFrom(), workHourFrom());
                            ingArray.add(objF);
                            JOptionPane.showMessageDialog(frame1,"Sucessful \n vacancy Number "
                            +inputvano.getText()+" Added","Sucess",JOptionPane.PLAIN_MESSAGE,img1);
                        }
                        if (choice.equals("Part Time")) {// adding staff for part time
                            PartTimeStaffHire objP = new PartTimeStaffHire(vacancyFrom(), designationFrom(), choice,
                            workHourFrom(), wagePHourFrom(), shiftFrom());
                            ingArray.add(objP);
                            JOptionPane.showMessageDialog(frame1,"Sucessful \n vacancy Number "+inputvano.getText()
                            +" Added","Sucess",JOptionPane.PLAIN_MESSAGE,img1);
                        }
                    } catch (NumberFormatException exe) {
                        JOptionPane.showMessageDialog(frame1,exe ,"Error!", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        
      //actionperformed method when some component is clicked
      @Override
      public void actionPerformed(ActionEvent e)throws ConcurrentModificationException {
          if (e.getSource()==Fullva){ // if fullva button is clicked then string value is set and methos will be open
              choice = "Full Time";
              Fulltimeva(); 
            
          }
          
          
          if (e.getSource()==Partva){// if partva  button is clicked then string value is set and methos will be open
              choice = "Part Time";
              Fulltimeva(); 
            
          }
        
         
    
          if (e.getSource()==Fullap){ // if fullap button is clicked then string value is set and methos will be open
              choice = "Full Time";
              Fulltimeapoint();
          }
          if (e.getSource()==Partap){ // if partap button is clicked then string value is set and methos will be open
              choice = "Part Time";
              Fulltimeapoint();
                
          }
          if (e.getSource()==ckcl){// if ckcl is clicked the frameck will dispose
              frameck.dispose();
            
          }
          if (e.getSource()==terminate){// when terminate button is pressed ther termGyi method will open
            termGui(); 
            
          }
          if (e.getSource()==btnterminate){// action performed for btn terminate if it is empty the show message
              if (inputtem.getText().equals("")){
                  JOptionPane.showMessageDialog(frametm,"Please fill out the Text Field","Error",JOptionPane.ERROR_MESSAGE);
              }else {
                  backendterminat();
              }
          }
          if(e.getSource()==display){// when display buttonis clicked then displaymethd will invoke
              displaymethod();
          }
          if (e.getSource()==hire){// when hire button is cliked then repetation staff will opened
              repetationStaff();
          }
         
          if(e.getSource()==cancel){// when cancel button is clicked then value of text filed will empty
              inputvano.setText("");
             inputsh.setText("");
              inputwh.setText("");
              inputde.setText("");
              inputwg.setText("");
              inputsa.setText("");
          }
          if(e.getSource()==infoClear){ // when infoClear button is clicked then value of text filed will empty
              viappol.setText("");
              viquali.setText("");
              vistaff.setText("");
              vijoindate.setText("");
          }
          if(e.getSource()==infoSave){// to save data from hiring form if empty to show message
              if (vistaff.getText().equals("")||viquali.getText().equals("")||viappol.getText().equals("")||vijoindate.getText().equals("")){
                  JOptionPane.showMessageDialog(framein,"Please fill out all the text fields.","Error",JOptionPane.ERROR_MESSAGE);
              }else {
                  framein.dispose();
                  dataStore();
            }
              }
          
          if (e.getSource()==submit1){ //This code will be run when submit1 is clicked
              try {
                  boolean falgINbtn = false;    // checking whether vacancy number is vacant or not  if vacant then add other show message
                  for (StaffHire temp : ingArray) {     // for each loop 
                      if (temp.getVacancyNo() == Integer.parseInt(inputvcba.getText()) && temp.getJobType().equals("Full Time")) { 
                       
                          falgINbtn = true;
                          realVacancy = temp.getVacancyNo();
                          realDesignation = temp.getDesignation();
                          realJob = temp.getJobType();
                          FullTimeStaffHire objBtnfull = (FullTimeStaffHire) temp; // Downcasting the object if FullTimeStaffHire
                         realSalary = objBtnfull.getsalary();
                          realWorkHour = objBtnfull.getworkHour();
                          dataCheck();
                      }
                  }
                  if (falgINbtn == false) {   
                	  // checking if vacany number enter by user is equals to vacancy number present in array list or not  
                    // if text box is empty the show messageg
                	  if(inputvcba.getText().equals("")){
                          JOptionPane.showMessageDialog(frame2,"Please fill out the Text Field","Error",JOptionPane.ERROR_MESSAGE);
                      }
                	  else {
                      JOptionPane.showMessageDialog(frame2, "Not found!! Please enter correct vacancy number", "Error", JOptionPane.ERROR_MESSAGE);
                  }}
              }catch(Exception exe){
                  if(inputvcba.getText().equals("")){
                      JOptionPane.showMessageDialog(frame2,"Please fill out the Text Field","Error",JOptionPane.ERROR_MESSAGE);
                  }
                  else{
                      JOptionPane.showMessageDialog(frame2,exe);
                  }
              }
          }
          if (e.getSource()==submit2){
              try {
            	  // checking whether vacancy number is vacant or not  if vacant then add other show message
                  boolean falgINbtn = false; 
                  for(StaffHire temp: ingArray) {  // for each loop
                      if (temp.getVacancyNo() == Integer.parseInt(inputvcba.getText()) ) {
                         if (temp.getJobType()=="Part Time") {
                             falgINbtn = true;
                             realVacancy = temp.getVacancyNo();
                             realDesignation = temp.getDesignation();
                             realJob = temp.getJobType();
                             PartTimeStaffHire objBtnpart = (PartTimeStaffHire) temp; // Downcasting the object if PartTimeStaffHire
                             realWorkHour = objBtnpart.getworkHour();
                             realWage = objBtnpart.getwagePerHour();
                             realShift = objBtnpart.getshifts();
                             dataCheck();
                          }
                      }
    
                  }
                  if ( falgINbtn == false){ 
                	  //if text box is empty to show message.
                	  if(inputvcba.getText().equals("")){
                          JOptionPane.showMessageDialog(frame2,"Please fill out the Text Field","Error",JOptionPane.ERROR_MESSAGE);
                      }
                	  else {// checking if vacany number enter by user is equals to vacancy number present in array list or not
                      JOptionPane.showMessageDialog(frame2,"Not found!! Please enter correct vacancy number" ,"Error",JOptionPane.ERROR_MESSAGE);
                	  } }
              }catch(Exception exe){
                  if(inputvcba.getText().equals("")){
                      JOptionPane.showMessageDialog(frame2,"Please fill out the Text Field","Error",JOptionPane.ERROR_MESSAGE);
                  }
                  else{
                      JOptionPane.showMessageDialog(frame2,exe);
                  }
              }
          }
          if(e.getSource()==ckbtn){// checking wether the staff is appoint for particular vacancy or not
              frame2.dispose();
              if (choice=="Full Time") {
                  for (StaffHire temp : ingArray) { // for each loop
                      if (temp instanceof FullTimeStaffHire) { // checking  if temp is an instance of FullTimeStaffHire class or not
                          FullTimeStaffHire obful = (FullTimeStaffHire) temp; // Downcasting the object if FullTimeStaffHire
                          if (obful.getVacancyNo()==realVacancy) {
                              if (obful.getjoined() == false) {
                                  InsideHiring();
                                  frameck.dispose();
                              } else {
                            	  
                                  JOptionPane.showMessageDialog(frame, " Sorry Staff has already been appointed \n Try for next vacancy",
                                  "Message", JOptionPane.ERROR_MESSAGE);
                                  frameck.dispose();
                              }
                          }
                      }
                  }
              }
              if (choice=="Part Time") {
                  for (StaffHire temp : ingArray) { // for each loop
                      if (temp instanceof PartTimeStaffHire) { // checking  if temp is an instance of PartTimeStaffHire class or not
                          PartTimeStaffHire obpar = (PartTimeStaffHire) temp;// Downcasting the object if PartTimeStaffHire
                          if (obpar.getVacancyNo()==realVacancy) {
                          if (obpar.getjoined() == false) {
                                InsideHiring();
                                frameck.dispose();
                          } else {
                              JOptionPane.showMessageDialog(frame, "Sorry staff has been already appointed \n Try for next vacancy", 
                              "Message", JOptionPane.ERROR_MESSAGE);
                          } 
                          }
                      }
                  }
              }
          }
        
      }
      // returning methods
      public int vacancyFrom(){
          return Integer.parseInt(inputvano.getText());
      }
    
      public String designationFrom(){
          return inputde.getText();
      }
    
      public int workHourFrom(){
          return Integer.parseInt(inputwh.getText());
      }
    
      public int salaryFrom(){
          return Integer.parseInt(inputsa.getText());
      }
    
      public String shiftFrom(){
          return inputsh.getText();
      }
    
      public int wagePHourFrom(){
          return Integer.parseInt(inputwg.getText());
      }
    
      public String staffNameFrom(){
          return vistaff.getText();
      }
    
      public String appointeByFrom(){
          return viappol.getText();
      }
    
      public String joingDateFrom(){
          
          return vijoindate.getText();
      }
    
      public String qualificationFrom(){
          return viquali.getText();
      }
      public int inputtemret(){
          return Integer.parseInt(inputtem.getText());
      }//
      public void backendterminat(){
                boolean flagInTerminate = false;
                try {
                for (StaffHire termi : ingArray){ // for each loop
                    if (termi instanceof PartTimeStaffHire) {// checking  if termi is an instance of PartTimeStaffHire class or not
                         PartTimeStaffHire objTem = (PartTimeStaffHire) termi; // Downcasting the object if PartTimeStaffHire
                         if (termi.getVacancyNo() == inputtemret()){
                            if (objTem.getjoined() == true) {
                                flagInTerminate = true;
                                objTem.terminate();     //calling terminate method from part time staff hire.
                            } else {
                                JOptionPane.showMessageDialog(frame, "No Staff has been appointed", "Error!", JOptionPane.ERROR_MESSAGE);
                                terbo = false;
                            }
                        }
                    }
                }
                if (flagInTerminate==false && terbo==true){
                	if(inputtem.getText().equals("")){
                        JOptionPane.showMessageDialog(frametm,"Please fill out the Text Field","Error",JOptionPane.ERROR_MESSAGE);
                    }
                	else {
                    JOptionPane.showMessageDialog(frametm,"Sorry record not found","Error!",JOptionPane.WARNING_MESSAGE);
                	}} 
                
                }catch ( Exception ex) {
                	if(inputtem.getText().equals("")){
                        JOptionPane.showMessageDialog(frametm,"Please fill out the Text Field","Error",JOptionPane.ERROR_MESSAGE);
                    }
                	else {
                    JOptionPane.showMessageDialog(frametm,ex,"Error!",JOptionPane.WARNING_MESSAGE);
                	} }
                
            }
      
      private void repetationStaff(){
          boolean nimcheck = false;
          
              
                  
           try {
            
        
                  for (StaffHire temp : ingArray) {      // for each loop  
                      if (temp.getVacancyNo() == vacancyFrom()) {  // checking vacancy number is used or not
                          JOptionPane.showMessageDialog(frame1, "Sorry vacancy number is not available", "Error!", JOptionPane.ERROR_MESSAGE);
                         
                          nimcheck = true;
                          break;
                      } 
                           
                      }  
                  
                  if(nimcheck) {     // if vacancy number is not used then to add vacancy                  
                      
                  } else {
                     
                      vacancyforward();
                     
                      frame1.dispose();
                      frame.dispose();
                      GuiBox();
                }} catch (Exception e) {
                    if (inputvano.getText().equals("") || inputde.getText().equals("") || inputwg.getText().equals("") || inputsh.getText().equals("")|| inputwh.getText().equals("")){
                    vacancyforward();
                    }
                    else {
                         JOptionPane.showMessageDialog(frame1,e,"Error!",JOptionPane.ERROR_MESSAGE);
    
                    }
                }
                  }
          
      // method to store ata in arraylist
      public void dataStore(){
            ImageIcon img1= new ImageIcon("image/suc.png");
          if(choice.equals("Full Time")){
              for(StaffHire obj:ingArray){ // for each loop
                  if(obj instanceof FullTimeStaffHire){ 
                	  // checking  if obj is an instance of FullTimeStaffHire class or not
                      FullTimeStaffHire sto = (FullTimeStaffHire) obj; // Downcasting the object if FullTimeStaffHire
                      if(sto.getVacancyNo()==realVacancy) {
                      if(sto.getjoined()==false){
                          sto.fullhire(staffNameFrom(),joingDateFrom(),qualificationFrom(),appointeByFrom());
                          JOptionPane.showMessageDialog(framein,"Thank you !!! "+staffNameFrom()+" has been appointed \n for "+realDesignation,"Sucess",JOptionPane.PLAIN_MESSAGE,img1);
                      }
                    }
                  }
              }
          }
          if (choice=="Part Time"){
              for(StaffHire obj:ingArray){ // for each loop
                  if(obj instanceof PartTimeStaffHire){// checking  if obj is an instance of PartTimeStaffHire class or not
                      PartTimeStaffHire sto = (PartTimeStaffHire) obj; // Downcasting the object if PartTimeStaffHire
                      if(sto.getVacancyNo()==realVacancy) {
                      if(sto.getjoined()==false){
                          sto.partTimehire(staffNameFrom(),joingDateFrom(),qualificationFrom(),appointeByFrom());
                          JOptionPane.showMessageDialog(framein,"Thank you !!! "+staffNameFrom()+" has been appointed \n for "+realDesignation,"Sucess",JOptionPane.PLAIN_MESSAGE,img1);
                      }
                    }
                  }
              }
          }
      }
     
      //method for cheking vacacny is appointrd or not and are you sure box gui
      public void dataCheck(){
          for (StaffHire datas : ingArray) { // for each loop
        	  //coverting string to integer vacancy number
              if (datas.getVacancyNo() == Integer.parseInt(inputvcba.getText())) {
                  frameck = new JFrame("Check");//creating frame
                  JPanel panelck = new JPanel(null);//creating panel
                  JLabel titJLabel=new JLabel("ING Nepal");//creating label
                titJLabel.setBounds(95,0,250,40);
                titJLabel.setFont(new Font("SansSeri", Font.ITALIC, 38));
                titJLabel.setForeground(Color.white);
                ImageIcon img1= new ImageIcon("image/cancel.png");//adding image
                ImageIcon img= new ImageIcon("image/9.png");
                JLabel AreJLabel=new JLabel("Are You Sure?");
                AreJLabel.setBounds(120,100,250,40);
                AreJLabel.setFont(new Font("SansSeri", Font.BOLD,25));
                AreJLabel.setForeground(Color.white);
                frameck.setPreferredSize(new Dimension(400,300));
                
                panelck.setBackground(Color.DARK_GRAY);
                
                  ckbtn = new JButton("Confirm",img);//creatiing button
                  ckbtn.setBounds(75,150,120,40);
                  ckbtn.setBackground(Color.LIGHT_GRAY);
                  ckbtn.addActionListener(this);
                  panelck.add(ckbtn);
                  
                  ckcl = new JButton("Cancel",img1);//creating button
                  ckcl.setBounds(210,150,110,40);
                  ckcl.setBackground(Color.LIGHT_GRAY);
                  ckcl.addActionListener(this);//adding action listener
                  panelck.add(ckcl);// adding componeng to panel
                  panelck.add(titJLabel);
                  panelck.add(AreJLabel);
    
                  frameck.add(panelck); //adding panel to frame
                 frameck.setVisible(true); 
                 
               
                  frameck.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                  frameck.pack();
              }
               
          }
      }
    // end
           
}
      
    
