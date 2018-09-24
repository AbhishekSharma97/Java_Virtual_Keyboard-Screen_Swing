import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class Msg extends JApplet implements ActionListener
{	
	TextArea jta=new TextArea();
	String str="";
	String msg="";
	int i=1;
	int c=0;

	public void init()
	{
Container contentpane=getContentPane();
setLayout(new FlowLayout(FlowLayout.CENTER));
 Font f1=new Font("Dialog",Font.BOLD,12);
 jta.setFont(f1);
JButton q = new JButton("q");
JButton w = new JButton("w");
JButton e = new JButton("e");
JButton r = new JButton("r");
JButton t = new JButton("t");
JButton y = new JButton("y");
JButton u = new JButton("u");
JButton i = new JButton("i");
JButton o = new JButton("o");
JButton p = new JButton("p");
JButton Space= new JButton("__________SPACE__________");


JLabel blank1 = new JLabel("____");
JButton a = new JButton("a");
JButton s= new JButton("s");
JButton d= new JButton("d");
JButton f= new JButton("f");
JButton g= new JButton("g");
JButton h= new JButton("h");
JButton j= new JButton("j");
JButton k= new JButton("k");
JButton l= new JButton("l");
JLabel blank2 = new JLabel("___");

JButton z= new JButton("z");
JButton x= new JButton("x");
JButton c= new JButton("c");
JButton v= new JButton("v");
JButton b= new JButton("b");
JButton n= new JButton("n");
JButton m= new JButton("m");

add(jta);


JButton num0=new JButton("0");
JButton num1=new JButton("1");
JButton num2=new JButton("2");
JButton num3=new JButton("3");
JButton num4=new JButton("4");
JButton num5=new JButton("5");
JButton num6=new JButton("6");
JButton num7=new JButton("7");
JButton num8=new JButton("8");
JButton num9=new JButton("9");

JButton fstp=new JButton(".");
JButton qmark= new JButton("?");
JButton en=new JButton("Enter <-'");
en.setActionCommand("\n");
JButton back=new JButton("BACK");
JButton up= new JButton("cps lck");
up.setActionCommand("");

JButton ex=new JButton("!");
JButton at=new JButton("@");
JButton ha=new JButton("#");
JButton co=new JButton(":");
JButton te=new JButton(";");
JButton pe=new JButton("%");
JButton sl=new JButton("/");
JButton col=new JButton(",");
JButton an=new JButton("&");
JButton da=new JButton("-");

contentpane.add(ex);
contentpane.add(at);
contentpane.add(ha);
contentpane.add(co);
contentpane.add(te);
contentpane.add(pe);
contentpane.add(sl);
contentpane.add(col);
contentpane.add(an);
contentpane.add(da);




contentpane.add(num0);
contentpane.add(num1);
contentpane.add(num2);
contentpane.add(num3);
contentpane.add(num4);
contentpane.add(num5);
contentpane.add(num6);
contentpane.add(num7);
contentpane.add(num8);
contentpane.add(num9);

contentpane.add(q);
contentpane.add(w);
contentpane.add(e);
contentpane.add(r);
contentpane.add(t);
contentpane.add(y);
contentpane.add(u);
contentpane.add(i);
contentpane.add(o);
contentpane.add(p);
contentpane.add(blank1);
contentpane.add(a);
contentpane.add(s);
contentpane.add(d);
contentpane.add(f);
contentpane.add(g);
contentpane.add(h);
contentpane.add(j);
contentpane.add(k);
contentpane.add(l);
contentpane.add(blank2);
contentpane.add(z);
contentpane.add(x);
contentpane.add(c);
contentpane.add(v);
contentpane.add(b);
contentpane.add(n);
contentpane.add(m);

contentpane.add(en);
contentpane.add(up);
contentpane.add(fstp);
contentpane.add(Space);
contentpane.add(qmark);
contentpane.add(back);

num0.addActionListener(this);
num1.addActionListener(this);
num2.addActionListener(this);
num3.addActionListener(this);
num4.addActionListener(this);
num5.addActionListener(this);
num6.addActionListener(this);
num7.addActionListener(this);
num8.addActionListener(this);
num9.addActionListener(this);

fstp.addActionListener(this);
qmark.addActionListener(this);
en.addActionListener(this);

e.addActionListener(this);
q.addActionListener(this);
w.addActionListener(this);
e.addActionListener(this);
r.addActionListener(this);
t.addActionListener(this);
y.addActionListener(this);
u.addActionListener(this);
i.addActionListener(this);
o.addActionListener(this);
p.addActionListener(this);
a.addActionListener(this);
s.addActionListener(this);
d.addActionListener(this);
f.addActionListener(this);
g.addActionListener(this);
h.addActionListener(this);
j.addActionListener(this);
k.addActionListener(this);
l.addActionListener(this);
z.addActionListener(this);
x.addActionListener(this);
c.addActionListener(this);
v.addActionListener(this);
b.addActionListener(this);
n.addActionListener(this);
m.addActionListener(this);

ex.addActionListener(this);
at.addActionListener(this);
ha.addActionListener(this);
co.addActionListener(this);
te.addActionListener(this);
col.addActionListener(this);
sl.addActionListener(this);
pe.addActionListener(this);
an.addActionListener(this);
da.addActionListener(this);






Space.addActionListener(this);
Space.setActionCommand(" ");
back.addActionListener(this);
up.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{	
	
	msg=ae.getActionCommand();
	if(msg.equals(""))
	
		{
		if(i%2!=0)
		{
		c=1;
		showStatus("Caps Lock is ON");
		i++;
		}
		else
			{	
			showStatus("Caps Lock is OFF");
			c=0;
			i++;
			}
		}
		
	if(msg.equals("BACK"))
	{
	int  l=str.length();
	String str1=str.substring(0,(l-1));
	str=str1;
	jta.setText(str);
	}
	else{
	if(c==1)
	{
	String str2=msg.toUpperCase();
		str=str+str2;
		jta.setText(str);

	}
	else
	{
	str=str+msg;
	jta.setText(str);
	}
		}
	
}


}