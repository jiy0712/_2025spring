import java.awt.*;
import java.awt.event.*;
import java.io.*;

class NotePad extends Frame implements ActionListener{

    TextArea ta=new TextArea("",500,500,TextArea.SCROLLBARS_VERTICAL_ONLY);
    FileDialog fd=new FileDialog(this,"열기",FileDialog.LOAD);
    FileDialog fd2=new FileDialog(this,"저장",FileDialog.SAVE);
    FileDialog fd3=new FileDialog(this,"다른 이름으로 저장",FileDialog.SAVE);
    Image img=null;
    Dialog d=new Dialog(this,"시간/날짜",true);
    java.util.Calendar c= java.util.Calendar.getInstance();
    Label l=new Label(c.getTime()+"");
    Label d2_l=new Label("메모장 _ 미림여자정보과학고등학교 ^.^");
    Dialog d2=new Dialog(this,"메모장 정보(A)",true);
    Panel p=new Panel();
    Panel p2=new Panel();
    Button btn=new Button("확인");
    Button btn2=new Button("확인");

    MenuBar mb=new MenuBar();
    Menu m1=new Menu("파일(F)");
    Menu m2=new Menu("편집(E)");
    Menu m3=new Menu("서식(O)");
    Menu m4=new Menu("보기(V)");
    Menu m5=new Menu("도움말(H)");

    MenuItem m1_1=new MenuItem("새로 만들기(N)");
    MenuItem m1_2=new MenuItem("열기(O)...");
    MenuItem m1_3=new MenuItem("저장(S)");
    MenuItem m1_4=new MenuItem("다른 이름으로 저장(A)...");
    MenuItem m1_5=new MenuItem("페이지 설정(U)...");
    MenuItem m1_6=new MenuItem("인쇄(P)...");
    MenuItem m1_7=new MenuItem("끝내기(X)");

    MenuItem m2_1=new MenuItem("실행 취소(U)");
    MenuItem m2_2=new MenuItem("잘라내기(T)");
    MenuItem m2_3=new MenuItem("복사(C)");
    MenuItem m2_4=new MenuItem("붙여넣기(P)");
    MenuItem m2_5=new MenuItem("삭제(L)");
    MenuItem m2_6=new MenuItem("찾기(F)...");
    MenuItem m2_7=new MenuItem("다음 찾기(N)");
    MenuItem m2_8=new MenuItem("바꾸기(R)...");
    MenuItem m2_9=new MenuItem("이동(G)...");
    MenuItem m2_10=new MenuItem("모두 선택(A)");
    MenuItem m2_11=new MenuItem("시간/날짜(D)");

    CheckboxMenuItem m3_1=new CheckboxMenuItem("자동 줄 바꿈(W)");
    MenuItem m3_2=new MenuItem("글꼴(F)...");

    MenuItem m4_1=new MenuItem("상태 표시줄(S)");

    MenuItem m5_1=new MenuItem("도움말 항목(H)");
    MenuItem m5_2=new MenuItem("메모장 정보(A)");

    Dialog fontd=new Dialog(this,"글꼴",true);
    BorderLayout bl1=new BorderLayout();
    Panel fp1=new Panel();
    Label f1=new Label("글꼴(F):");
    TextField tf1=new TextField(10);
    List fontlist=new List(6,false);

    Panel fp23=new Panel();
    BorderLayout bl23=new BorderLayout();

    Panel fp2=new Panel();
    BorderLayout bl2=new BorderLayout();
    Label f2=new Label("글꼴 스타일(Y):");
    TextField tf2=new TextField(7);
    List fontstyle=new List(6,false);

    Panel fp3=new Panel();
    BorderLayout bl3=new BorderLayout();
    Label f3=new Label("크기(S):");
    TextField tf3=new TextField(7);
    List fontsize=new List(6,false);

    GridLayout gl=new GridLayout(4,1);
    Panel fp4=new Panel();
    Button btn_ok=new Button("확인");
    Button btn_c=new Button("취소");

    String clipboard=null;

    NotePad(){
        super("2204 김아영");
        this.setSize(500,300);
        this.setVisible(true);
        this.setMenuBar(mb);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);

        m1.add(m1_1);
        m1.add(m1_2);
        m1_2.setShortcut(new MenuShortcut(KeyEvent.VK_O));
        m1.add(m1_3);
        m1_3.setShortcut(new MenuShortcut(KeyEvent.VK_S));
        m1.add(m1_4);
        m1_4.setShortcut(new MenuShortcut(KeyEvent.VK_O,true));
        m1.addSeparator();
        m1.add(m1_5);
        m1.add(m1_6);
        m1.addSeparator();
        m1.add(m1_7);
        m1_7.setShortcut(new MenuShortcut(KeyEvent.VK_X));

        m2.add(m2_1);
        m2.addSeparator();
        m2.add(m2_2);
        m2_2.setShortcut(new MenuShortcut(KeyEvent.VK_T));
        m2.add(m2_3);
        m2_3.setShortcut(new MenuShortcut(KeyEvent.VK_C));
        m2.add(m2_4);
        m2_4.setShortcut(new MenuShortcut(KeyEvent.VK_V));
        m2.add(m2_5);
        m2_5.setShortcut(new MenuShortcut(KeyEvent.VK_L));
        m2.addSeparator();
        m2.add(m2_6);
        m2.add(m2_7);
        m2.add(m2_8);
        m2.add(m2_9);
        m2.addSeparator();
        m2.add(m2_10);
        m2_10.setShortcut(new MenuShortcut(KeyEvent.VK_A));
        m2.add(m2_11);
        m2_11.setShortcut(new MenuShortcut(KeyEvent.VK_D));

        m3.add(m3_1);
        m3.add(m3_2);

        m4.add(m4_1);

        m5.add(m5_1);
        m5.addSeparator();
        m5.add(m5_2);

        this.add(ta);

        m1_2.addActionListener(this);
        m1_3.addActionListener(this);
        m1_4.addActionListener(this);
        m1_7.addActionListener(this);
        m2_11.addActionListener(this);
        m5_2.addActionListener(this);
        m1_1.addActionListener(this);
        m2_3.addActionListener(this);
        m2_4.addActionListener(this);
        m2_10.addActionListener(this);
        m2_2.addActionListener(this);
        m2_5.addActionListener(this);
        m3_2.addActionListener(this);

        Toolkit tk=Toolkit.getDefaultToolkit();
        img=tk.getImage("1.jpg");
        this.setIconImage(img);

        p.add(btn);
        d.add("North",l);
        d.add("Center",p);

        p2.add(btn2);
        d2.add("North",d2_l);
        d2.add("Center",p2);

        btn.addActionListener(this);
        btn2.addActionListener(this);

        fontlist.add("궁서");
        fontlist.add("Serif");
        fontlist.add("Sans_Serif");
        fontlist.add("Bodoni MT Black");
        fontlist.add("Arial");
        fontlist.add("Adobe Heiti Std R");
        fontlist.add("Arial Unicode MS");
        fontlist.addActionListener(this);

        fp1.setLayout(bl1);
        fp1.add("North",f1);
        fp1.add("Center",tf1);
        fp1.add("South",fontlist);

        fontstyle.add("보통");
        fontstyle.add("기울임꼴");
        fontstyle.add("굵게");
        fontstyle.add("굵은 기울임꼴");
        fontstyle.addActionListener(this);

        fp2.setLayout(bl2);
        fp2.add("North",f2);
        fp2.add("Center",tf2);
        fp2.add("South",fontstyle);

        fontsize.add("8");
        fontsize.add("10");
        fontsize.add("12");
        fontsize.add("14");
        fontsize.add("16");
        fontsize.addActionListener(this);

        fp3.setLayout(bl3);
        fp3.add("North",f3);
        fp3.add("Center",tf3);
        fp3.add("South",fontsize);

        fp23.setLayout(bl23);
        fp23.add(fp2);
        fp23.add("East",fp3);

        fp4.setLayout(gl);
        fp4.add(btn_ok);
        fp4.add(btn_c);

        btn_ok.addActionListener(this);
        btn_c.addActionListener(this);

        fontd.add("West",fp1);
        fontd.add("Center",fp23);
        fontd.add("East",fp4);

    }

    public void loadFile(String fn,String fn2){
        File file=new File(fn);
        FileReader fr=null;
        BufferedReader br=null;

        try{
            fr=new FileReader(file);
            br=new BufferedReader(fr);

            String str=null;

            ta.setText("");

            while((str=br.readLine())!=null){
                ta.append(str+"\n");
            }
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        setTitle("메모장 - "+fn2);
    }

    public void saveFile(String fn,String fn2){
        File file=new File(fn);
        try{
            FileOutputStream fos=new FileOutputStream(file);
            PrintStream ps=new PrintStream(fos);
            ps.print(ta.getText());
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        setTitle("메모장 - "+fn2);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==m1_2){
            fd.setMode(fd.LOAD);
            fd.setVisible(true);
            String filename=fd.getDirectory()+fd.getFile();
            String filename2=fd.getFile();
            loadFile(filename,filename2);
        }
        else if(e.getSource()==m1_3){
            fd2.setMode(fd2.SAVE);
            fd2.setVisible(true);
            String filename=fd2.getDirectory()+fd2.getFile();
            String filename2=fd2.getFile();
            saveFile(filename,filename2);
        }
        else if(e.getSource()==m1_4){
            fd3.setMode(fd3.SAVE);
            fd3.setVisible(true);
            String filename=fd2.getDirectory()+fd2.getFile();
            String filename2=fd2.getFile();
            saveFile(filename,filename2);
        }
        else if(e.getSource()==m1_7){
            System.exit(0);
        }
        else if(e.getSource()==m2_11){
            d.setSize(150,100);
            d.setVisible(true);
        }
        else if(e.getSource()==m5_2){
            d2.setSize(200,150);
            d2.setVisible(true);
        }
        else if(e.getSource()==btn){
            d.setVisible(false);
        }
        else if(e.getSource()==btn2){
            d2.setVisible(false);
        }
        else if(e.getSource()==m1_1){
            setTitle("2204 김아영");
            ta.setText("");
        }
        else if(e.getSource()==m2_3){
            clipboard=ta.getSelectedText();
        }
        else if(e.getSource()==m2_4){
            ta.insert(clipboard,ta.getSelectionStart());
        }
        else if(e.getSource()==m2_10){
            ta.selectAll();
        }
        else if(e.getSource()==m2_2){
            clipboard=ta.getSelectedText();
            ta.replaceRange("",ta.getSelectionStart(),ta.getSelectionEnd());
        }
        else if(e.getSource()==m2_5){
            ta.replaceRange("",ta.getSelectionStart(),ta.getSelectionEnd());
        }
        else if(e.getSource()==m3_2){
            fontd.setSize(400,200);
            fontd.setVisible(true);
        }
        else if(e.getSource()==btn_c){
            fontd.setVisible(false);
        }
        else if(e.getSource()==fontlist){
            tf1.setText(fontlist.getSelectedItem()+"");
        }
        else if(e.getSource()==fontstyle){
            tf2.setText(fontstyle.getSelectedItem()+"");
        }
        else if(e.getSource()==fontsize){
            tf3.setText(fontsize.getSelectedItem()+"");
        }
        else if(e.getSource()==btn_ok){
            if(fontstyle.getSelectedItem()=="기울임꼴")	ta.setFont(new Font(fontlist.getSelectedItem(),Font.ITALIC,Integer.parseInt(fontsize.getSelectedItem())));
            else if(fontstyle.getSelectedItem()=="보통") ta.setFont(new Font(fontlist.getSelectedItem(),Font.PLAIN,Integer.parseInt(fontsize.getSelectedItem())));
            else if(fontstyle.getSelectedItem()=="굵게") ta.setFont(new Font(fontlist.getSelectedItem(),Font.BOLD,Integer.parseInt(fontsize.getSelectedItem())));
            else if(fontstyle.getSelectedItem()=="굵은 기울임꼴"){
                ta.setFont(new Font(fontlist.getSelectedItem(),Font.ITALIC+Font.BOLD,Integer.parseInt(fontsize.getSelectedItem())));
            }
            fontd.setVisible(false);
        }
    }

    public static void main(String[] args){
        NotePad np=new NotePad();
    }
}