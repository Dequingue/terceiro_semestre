import customtkinter as ctk
from tkinter import messagebox


def calcular():
    p=int(peso.get())
    a=float(altura.get())
    imc = p/(a*a)
    
    if(imc < 18.5):
        resultado.configure(text=f'Sr(a) {nome.get()}, o seu imc é {imc:.1f}\n, Voçê está magro!'
                            ,text_color='yellow')
    elif(imc >=18.5 and imc <25):
        resultado.configure(text=f'Sr(a) {nome.get()}, o seu imc é {imc: .1f}, peso normal!'
                            ,text_color='lightgreen')    
    elif(imc >=25 and imc <30):
        resultado.configure(text=f'Sr(a) {nome.get()}, o seu imc é {imc: .1f}, voçê esta com sobrepeso!'
                            ,text_color='yellow')
    else:
        resultado.configure(text=f'Sr(a) {nome.get()}, o seu imc é {imc: .1f}, voçê está com obesidade!'
                            ,text_color='red')      
    
def clear():
    resultado.configure(text='')
    nome.delete(0,'end')
    peso.delete(0,'end')
    altura.delete(0,'end')

janela = ctk.CTk()
janela.minsize(600,500)
janela.maxsize(700,550)
ctk.set_appearance_mode('dark')


janela.title('Aplicativo Saude')

ctk.CTkLabel(janela,
             text='Aplicativo Saúde'
             ,font=('Arial',40,'bold')
             ,text_color='yellow').pack(pady=5)

nome = ctk.CTkEntry(janela,width=400, height=40
                    ,fg_color='white'
                    ,text_color='black'
                    ,placeholder_text='Digite o seu Nome'
                    ,font=('arial',20))

peso = ctk.CTkEntry(janela,width=400, height=40
                    ,fg_color='white'
                    ,text_color='black'
                    ,placeholder_text='Digite o seu Peso'
                    ,font=('arial',20))

altura = ctk.CTkEntry(janela,width=400, height=40
                    ,fg_color='white'
                    ,text_color='black'
                    ,placeholder_text='Digite a sua Altura'
                    ,font=('arial',20))

botao = ctk.CTkButton(janela, width=150
                      ,height=40
                      ,fg_color='blue'
                      ,text='Calcular'
                      ,font=('arial',18)
                      ,hover_color='green'
                      ,command=calcular)

limpar = ctk.CTkButton(janela, width=150
                      ,height=40
                      ,fg_color='red'
                      ,text='Limpar'
                      ,font=('arial',18)
                      ,hover_color='green'
                      ,command=clear)

resultado = ctk.CTkLabel(janela,
                         text='',text_color='black',font=('arial',20))
resultado.place(x=100,y=400)

nome.place(x=100,y=100)
peso.place(x=100,y=160)
altura.place(x=100,y=220)
botao.place(x=130,y=300)
limpar.place(x=320,y=300)
janela.mainloop()

