#João Luiz Sacramento Freitas De Alcantara

import customtkinter as ctk
from tkinter import messagebox



#Permita que o usuário insira suas receitas e despesas mensais, calcule o saldo final.
#No mínimo (4 Receitas e 4 Despesas).

def calcular():
    r1 = float(receita1.get())
    r2 = float(receita2.get())
    r3 = float(receita3.get())
    r4 = float(receita4.get())
    
    des1 = float(despesa1.get())
    des2 = float(despesa2.get())
    des3 = float(despesa3.get())
    des4 = float(despesa4.get())
    
    saldoF = (r1+r2+r3+r4) - (des1+des2+des3+des4)
    
    if(saldoF < 0):
        resultado.configure(text=f'Seu Saldo está negativado {saldoF: .1f}'
                            ,text_color='red')
    else:
        resultado.configure(text=f'Seu Saldo atual é {saldoF: .1f}'
                            ,text_color='yellow')
    
    
    
def clear():
    resultado.configure(text='')
    receita1.delete(0,'end')
    receita2.delete(0,'end')
    receita3.delete(0,'end')
    receita4.delete(0,'end')
    
    despesa1.delete(0,'end')
    despesa2.delete(0,'end')
    despesa3.delete(0,'end')
    despesa4.delete(0,'end')

janela = ctk.CTk()

janela.minsize(600,500)
janela.maxsize(700,500)

ctk.set_appearance_mode('dark')


janela.title('App de Despesas')

ctk.CTkLabel(janela,
             text='App de Despesas',
             text_color='yellow',
             font=('arial',40,'bold')).pack(pady=5)

ctk.CTkLabel(janela,
             text='Suas receitas:',
             text_color='yellow',
             font=('arial',20,'bold')).place(x=47,y=80)

receita1 = ctk.CTkEntry(janela,
                     width=200,
                     height=40,
                     fg_color='white',
                     text_color='black',
                     placeholder_text='Informe a 1ª receita')

receita2 = ctk.CTkEntry(janela,
                     width=200,
                     height=40,
                     fg_color='white',
                     text_color='black',
                     placeholder_text='Informe a 2ª receita')

receita3 = ctk.CTkEntry(janela,
                     width=200,
                     height=40,
                     fg_color='white',
                     text_color='black',
                     placeholder_text='Informe a 3ª receita')

receita4 = ctk.CTkEntry(janela,
                     width=200,
                     height=40,
                     fg_color='white',
                     text_color='black',
                     placeholder_text='Informe a 4ª receita')

ctk.CTkLabel(janela,
             text='Suas despesas:',
             text_color='yellow',
             font=('arial',20,'bold')).place(x=370,y=80)

despesa1 = ctk.CTkEntry(janela,
                     width=200,
                     height=40,
                     fg_color='white',
                     text_color='black',
                     placeholder_text='Informe a 1ª despesa')

despesa2 = ctk.CTkEntry(janela,
                     width=200,
                     height=40,
                     fg_color='white',
                     text_color='black',
                     placeholder_text='Informe a 2ª receita')

despesa3 = ctk.CTkEntry(janela,
                     width=200,
                     height=40,
                     fg_color='white',
                     text_color='black',
                     placeholder_text='Informe a 3ª receita')

despesa4 = ctk.CTkEntry(janela,
                     width=200,
                     height=40,
                     fg_color='white',
                     text_color='black',
                     placeholder_text='Informe a 4ª receita')


botao =  ctk.CTkButton(janela,
                       width=150,
                       height=40,
                       fg_color='blue',
                       text='Calcular',
                       font=('arial',18),
                       hover_color='green',
                       command=calcular)

limpar =  ctk.CTkButton(janela,
                       width=150,
                       height=40,
                       fg_color='red',
                       text='Limpar',
                       font=('arial',18),
                       hover_color='green',
                       command=clear)


resultado = ctk.CTkLabel(janela,
                         text='',
                         text_color='black',
                         font=('arial',20))
resultado.place(x=155,y=420)

receita1.place(x=40,y=120)
receita2.place(x=40,y=170)
receita3.place(x=40,y=220)
receita4.place(x=40,y=270)

despesa1.place(x=360,y=120)
despesa2.place(x=360,y=170)
despesa3.place(x=360,y=220)
despesa4.place(x=360,y=270)

botao.place(x=120,y=350)
limpar.place(x=320,y=350)
janela.mainloop()