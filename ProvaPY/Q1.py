# João Luiz Sacramento Freitas De Alcantara

import customtkinter as ctk
from tkinter import messagebox

# menor que 40KG - Entre 40KG e 80KG - maior que 80KG

def calcular():
    p1 = int(peso1.get())
    p2 = int(peso2.get())
    p3 = int(peso3.get())
    
    media = (p1+p2+p3)/3
    
    if(media < 40):
        resultado.configure(text=f'Sr(a) {nome.get()}, sua media é {media}\n, Continue firme! O importante é aconstância! ',
                            text_color='Yellow')
    elif(media >=40 and media <80):
        resultado.configure(text=f'Sr(a) {nome.get()}, sua media é {media}\n, Ótimo trabalho! Você está evoluindo bem! ',
                            text_color='Yellow')
    else:
        resultado.configure(text=f'Sr(a) {nome.get()}, sua media é {media}\n, Incrível! Seu desempenho está excelente! ',
                            text_color='Yellow')    

def clear():
    resultado.configure(text='')
    nome.delete(0,'end')
    peso1.delete(0,'end')
    peso2.delete(0,'end')
    peso3.delete(0,'end')
        
janela = ctk.CTk()
janela.minsize(600,500)
janela.maxsize(700,550)

ctk.set_appearance_mode('dark')

janela.title('Aplicativo De Academeia')

ctk.CTkLabel(janela,
             text='App de Academia',
             text_color='yellow',
             font=('arial',40,'bold')).pack(pady=5)

nome = ctk.CTkEntry(janela,
                    width=400,
                    height=40,
                    fg_color='White',
                    text_color='black',
                    placeholder_text='Digite seu nome',
                    font=('arial',20))

ctk.CTkLabel(janela,
             text='Informe os pesos que voçê levanta, em tres treinos diferentes: ',
             text_color='yellow',
             font=('arial',15,'bold')).pack(pady=100)

peso1 =  ctk.CTkEntry(janela,
                     width=400,
                     height=40,
                     fg_color='white',
                     text_color='black',
                     placeholder_text='Informe o 1º peso')

peso2 =   ctk.CTkEntry(janela,
                     width=400,
                     height=40,
                     fg_color='white',
                     text_color='black',
                     placeholder_text='Informe o 2º peso')

peso3 =  ctk.CTkEntry(janela,
                     width=400,
                     height=40,
                     fg_color='white',
                     text_color='black',
                     placeholder_text='Informe o 3º peso')


botao =  ctk.CTkButton(janela,
                       width=150,
                       height=40,
                       fg_color='blue',
                       text='Calcular',
                       font=('arial',18),
                       hover_color='green',
                       command=calcular)

limpar = ctk.CTkButton(janela,
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
resultado.place(x=100,y=400)



nome.place(x=100,y=100)
peso1.place(x=100,y=200)
peso2.place(x=100,y=250)
peso3.place(x=100,y=300)
botao.place(x=120,y=350)
limpar.place(x=320,y=350)
janela.mainloop()