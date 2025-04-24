import customtkinter as ctk
from tkinter import *
from tkinter import messagebox

def add_contato():
    n = nome.get()
    t = telefone.get()
    e = email.get()
    
    if(n,t,e):
        lista_contatos.insert(0,n,t,e)
        nome.delete(0,'end')
        telefone.delete(0,'end')
        email.delete(0,'end')
        salvar_contatos()
    else:
        messagebox.showerror("ERRO",'O campo Contatos está Vazio')

def salvar_contatos():
    with open('contatos.txt','w') as ta:
        contatos = lista_contatos.get(0,END)

        for x in contatos:
            ta.write(x+'\n')
            
def carregar_contatos():
    
    if(salvar_contatos()):
        with open('contatos.txt','r') as ta:
            contatos = ta.readlines()
            for x in contatos:
                lista_contatos.insert(0,x.strip())
    else:
        with open('contatos.txt','w') as ta:
            contatos = lista_contatos.get(0,END)

            for x in contatos:
                ta.write(x+'\n')
            
def del_contatos():                 
    selecionada = lista_contatos.curselection()
    if(selecionada):
        lista_contatos.delete(selecionada)
        salvar_contatos()
    else:
        messagebox.showerror("ERRO",'selecione um contato !!!')
        
            
#------------------------------------Janela--------------------------------        
ctk.set_appearance_mode('dark')
janela = ctk.CTk()
janela.geometry('550x650')
janela.title('Agenda de Contatos')
janela.resizable(False,False)

#----------------------------------------------------------------------
nome = ctk.CTkEntry(janela,
                    width=320,
                    height=40,
                    border_color='hotpink',
                    placeholder_text='Informe seu nome')
nome.pack(pady=10)

telefone = ctk.CTkEntry(janela,
                    width=320,
                    height=40,
                    border_color='hotpink',
                    placeholder_text='Informe seu Telefone')
telefone.pack(pady=10)

email = ctk.CTkEntry(janela,
                    width=320,
                    height=40,
                    border_color='hotpink',
                    placeholder_text='Informe seu Email')
email.pack(pady=10)

adcionar = ctk.CTkButton(janela,
                      width=100,
                      height=40,
                      fg_color='blue',
                      hover_color='#1E8CE6',
                      text='Adicionar',
                      text_color='white',
                      cursor='hand2',
                      font=('arial',13,'bold'),
                      command=add_contato)

adcionar.place(x=115,y=200)

excluir = ctk.CTkButton(janela,
                      width=100,
                      height=40,
                      fg_color='red',
                      hover_color='darkred',
                      text='Excluir',
                      text_color='white',
                      cursor='hand2',
                      font=('arial',13,'bold'),
                      command=del_contatos)
excluir.place(x=335,y=200)


lista_contatos = Listbox(janela,
                         width=46,
                         height=20,
                         font=('verdana',12,'bold'),
                         background='#363636',
                         highlightbackground='hotpink',
                         highlightthickness=2,
                         fg='white')
lista_contatos.place(x=20,y=250)


carregar_contatos()
janela.mainloop()