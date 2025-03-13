import customtkinter as ctk
from tkinter import messagebox

#Interface janela --------------------------------------
janela = ctk.CTk()

janela.geometry('600x450')

janela.configure(fg_color='#a9a9a9')
ctk.set_appearance_mode('dark')

janela.resizable(False,False)
janela.title('App Consumo de Viagem')
janela.iconbitmap('gasolina/image/49_85223.ico')

#--------------------------------------------------------

# Modificação dos componentes dos textos e caixas----------------------------------


ctk.CTkLabel(janela,text='App De Gasolina',
             font=('Arial',40,'bold'),
             text_color='white').pack(pady=5)

ctk.CTkLabel(janela,text='03/2025-Senai Bahia',
             text_color='white',
             font=('Arial',20,'bold')).pack()

ctk.CTkLabel(janela,text='Distancia:',
             text_color='black',
             font=('Arial',15,'bold')).place(x=100,y=85)

distancia = ctk.CTkEntry(janela,width=400,height=40,
                         placeholder_text=('Infome a Distancia em KM'),
                         fg_color='white',
                         font=('arial',20))

ctk.CTkLabel(janela,text='Consumo:',
             text_color='black',
             font=('Arial',15,'bold')).place(x=100,y=175)

consumo = ctk.CTkEntry(janela,width=400,height=40,
                       placeholder_text=('Infome o consumo em L(litros)'),
                       fg_color='white',
                       font=('arial',20))

ctk.CTkLabel(janela,text='Preço:',
             text_color='black',
             font=('Arial',15,'bold')).place(x=100,y=265)

preco = ctk.CTkEntry(janela,width=400,height=40,
                       placeholder_text=('Infome o preço em R$'),
                       fg_color='white',
                       font=('arial',20))

botao = ctk.CTkButton(janela, width=150,
                      height=40,fg_color='gray',
                      text_color='black',
                      text='Calcular',font=('arial',18),
                      hover_color='green')

#-------------------------------------------------------------------------------

distancia.pack(pady=25)
consumo.pack(pady=25)
preco.pack(pady=25)
botao.pack()


janela.mainloop()