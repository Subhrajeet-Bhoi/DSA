from tkinter import *
from tkinter import messagebox
from pymysql import *
conobj = connect ( host = "localhost", user = 'root',password = 'root12345', port = 3306, db = 'bcaproject' )
#print (conobj)
curobj = conobj .cursor ()
root1 = Tk ()
#===================
def Signup ():
	root1.destroy ()
	sroot =Tk ()
#=================================================================
	def submit ():
		print(Ruid.get(),Rsname.get(),Rphn.get(),RGender.get(),RAccYear.get(),RDept.get(),Rpwd.get())
#----------------------------------
	def exit():
		sroot.destroy()
#==================================================================
	sroot.maxsize (600,600)
	sroot.minsize(600,600)
	sroot. title ("Signup page")
	Label(sroot, text = "Set StudentUserId", font = ("Century Schoolbook", 15), width = 18, bg = 'orange', fg = "black", height = 1, relief = 'groove'). place (x= 50 , y= 50)
	Ruid = Entry(sroot,font =("Century Schoolbook",15),width =25, bg='orange',fg= "black", relief= 'sunken')
	Ruid.place(x=350,y=50)

	Label(sroot, text = "Set StudentName", font = ("Century Schoolbook", 15), width = 18, bg = 'orange', fg = "black", height = 1, relief = 'groove'). place (x= 50 , y= 100)
	Rsname=Entry(sroot,font =("Century Schoolbook",15),width =25, bg='orange',fg= "black", relief= 'sunken')
	Rsname.place(x=350,y=100)

	Label(sroot, text = "Student PhoneNumber", font = ("Century Schoolbook", 15), width = 18, bg = 'orange', fg = "black", height = 1, relief = 'groove'). place (x= 50 , y= 150)
	Rphn= Entry(sroot,font =("Century Schoolbook",15),width =25, bg='orange',fg= "black", relief= 'sunken')
	Rphn.place(x=350,y=150)

	Label(sroot, text = "Select StudentGender", font = ("Century Schoolbook", 15), width = 18, bg = 'orange', fg = "black", height = 1, relief = 'groove'). place (x= 50 , y= 200)
	#Entry(sroot,font =("Century Schoolbook",15),width =25, bg='orange',fg= "black", relief= 'sunken').place(x=350,y=200)
	RGender = StringVar()
	RGender.set = ("select student gender")	
	Radiobutton (sroot, text = "M",variable = RGender, value = "Male").place(x=350,y=200)
	Radiobutton (sroot,text = "F",variable = RGender, value = "Female").place(x=400,y=200)


	Label(sroot, text = "Select AccYear", font = ("Century Schoolbook", 15), width = 18, bg = 'orange', fg = "black", height = 1, relief = 'groove'). place (x= 50 , y= 250)

	#Entry(sroot,font =("Century Schoolbook",15),width =25, bg='orange',fg= "black", relief= 'sunken').place(x=350,y=250)
	RAccYear = StringVar()
	RAccYear.set("--Select ACC Year--")
	OptionMenu (sroot,RAccYear, *['2020-2023','2021-2024','2022-2025', '2023-2026','2024-2027','2025-2028']).place(x=320,y=250)

	
	Label(sroot, text = "Select DeptName", font = ("Century Schoolbook", 15), width = 18, bg = 'orange', fg = "black", height = 1, relief = 'groove'). place (x= 50 , y= 300)

	#Entry(sroot,font =("Century Schoolbook",15),width =25, bg='orange',fg= "black", relief= 'sunken').place(x=350,y=300)
	RDept = StringVar ()
	RDept.set ("__select dept name __")
	OptionMenu(sroot,RDept,*["Bca","ITM","CS","DS"]).place(x = 350,y= 300)

	Label(sroot, text = "Set Password", font = ("Century Schoolbook", 15), width = 18, bg = 'orange', fg = "black", height = 1, relief = 'groove'). place (x= 50 , y= 350)

	Rpwd =Entry(sroot,font =("Century Schoolbook",15),width =25, bg='orange',fg= "black", relief= 'sunken',show = "*")
	Rpwd.place(x=350,y=350)

	Button(sroot,text ="submit",font=("Century Schoolbook",15),width=8, bg='orange',fg= "black",  relief= 'groove',command = submit).place(x=150,y=450)
	Button(sroot,text ="exit",font=("Century Schoolbook",15),width=8, bg='orange',fg= "black",  relief= 'groove', command = exit).place(x=300,y=450)

	sroot.mainloop ()
#...........
def Login ():
	root1.destroy ()
	lroot =Tk ()
	#================
	def ULogin ():
		#print(Uid.get(),AccYear.get(),Pwd.get())	
		curobj.execute (f'select * from student where Regno={Uid.get ()} and Acc_Year= "{AccYear.get ()}" and password= "{Pwd.get ()}";')
		record = curobj.fetchall ()
		#print (record)
		if len (record):
			lroot. destroy ()
			root2 = Tk()
			root2.mainloop ()
		else :
			lroot.destroy ()
	#================
	def UReset ():
		pass
	#================
	def UExit ():
		lroot.destroy ()

	lroot.maxsize (600,600)
	lroot.minsize(600,600)
	lroot. title ("Login Page")
	lroot.configure(bg="#cacaca")
	Label (lroot, text="Please login here",font =("Century Schoolbook",16),width =25, bg='orange',fg= "black",height= 2, relief= 'groove').place(x=150,y=50)
	Label (lroot, text="Enter User ID",font =("Century Schoolbook",15),width =18, bg='orange',fg= "black",height= 1, relief= 'groove').place(x=50,y=150)

	Uid = Entry(lroot,font =("Century Schoolbook",15),width =18, bg='orange',fg= "black", relief= 'sunken')
	Uid.place(x=320,y=150)
	
	Label (lroot, text="Select ACC Year",font =("Century Schoolbook",15),width =18, bg='orange',fg= "black",height= 1, relief= 'groove').place(x=50,y=250)

	#Entry(lroot,font =("Century Schoolbook",15),width =18, bg='orange',fg= "black", relief= 'sunken').place(x=320,y=250)	
	AccYear = StringVar()
	AccYear.set("--Select ACC Year--")
	OptionMenu (lroot,AccYear, *['2020-2023','2021-2024','2022-2025', '2023-2026','2024-2027','2025-2028']).place(x=320,y=250)
	
	Label (lroot, text="Enter Password",font =("Century Schoolbook",15),width =18, bg='orange',fg= "black",height= 1, relief= 'groove').place(x=50,y=350)

	Pwd=Entry(lroot,font =("Century Schoolbook",15),width =18, bg='orange',fg= "black", relief= 'sunken', show="*")
	Pwd.place(x=320,y=350)
	Button(lroot,text ="Login",font=("Century Schoolbook",15),width=8, bg='orange',fg= "black",  relief= 'sunken',command =ULogin).place(x=120,y=500)
	Button(lroot,text ="Reset",font=("Century Schoolbook",15),width=8, bg='orange',fg= "black",  relief= 'sunken',command =UReset).place(x=250,y=500)
	Button(lroot,text ="Exit",font=("Century Schoolbook",15),width=8 , bg='orange',fg= "black",  relief= 'sunken',command =UExit).place(x=380,y=500)

	lroot.mainloop ()
#...........
def Exit ():
	messagebox.showinfo("Do u want to exit","Exit")
	root1.destroy()
#===================
root1 . maxsize (600,400) # w, h
root1 . minsize (600,400)
root1.title ("My Project")
root1.configure (bg = '#cfcfcf')
Button (root1, text = "Signup", font = ('arial',20), width = 15, bg = 'blue', fg = 'white', activebackground = 'red', relief= 'sunken', command = Signup).place (x= 50, y= 50) #x means from left & y means from top
Button (root1, text = "Login", font = ('arial',20), width = 15, bg = 'blue', fg = 'white', activebackground = 'red', relief= 'sunken', command = Login ).place (x= 50, y= 150) #x means from left & y means from top
Button (root1, text = "Exit", font = ('arial',10), width = 8, bg = 'red', fg = 'white', activebackground = 'green', relief= 'sunken', command = Exit).place (x= 470, y= 350) #x means from left & y means from top

root1. mainloop ()