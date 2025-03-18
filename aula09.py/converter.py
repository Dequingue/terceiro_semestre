import customtkinter as ctk
from tkinter import messagebox

def converter():
    v=float(valor.get())
    
    calcular = v/5.7782
    
    messagebox.showinfo('App converção',f'O valor em dolar é R${calcular:.2f}')
    
janela = ctk.CTk()


janela.geometry('600x450')
janela.configure(fg_color='#a9a9a9')

ctk.set_appearance_mode('dark')

janela.resizable(False,False)

janela.title('Conversão de Moedas')

ctk.CTkLabel(janela,text='Conversão de Moedas',
             font=('arial',40,'bold'),
             text_color='black').pack(pady=2)

ctk.CTkLabel(janela,text='Valor em Real:',
             text_color='black',
             font=('arial',15)).place(x=100,y=95)

valor = ctk.CTkEntry(janela,width=300,height=40,
                     fg_color='white',
                     placeholder_text=('Infome o Valor em R$'),
                     text_color='black',
                     font=('arial',20))

botao = ctk.CTkButton(janela,width=150,
                      height=40,
                      fg_color='gray',
                      text='Converter',
                      text_color='black',
                      hover_color='green',
                      font=('arial',18),
                      command=converter)


valor.place(x=100,y=120)
botao.place(x=200,y=200)
janela.mainloop()