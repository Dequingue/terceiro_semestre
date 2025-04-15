import customtkinter as ctk
from tkinter import *
from tkinter import messagebox

def add_tarefa():
    t = tarefa.get()
    if(t):
        lista_tarefas.insert(0,t)
        tarefa.delete(0,'end')
        salvar_tarefas()
    else:
        messagebox.showerror('Erro', 'O campo tarefa Vazio')    
        
def salvar_tarefas():
    with open('tarefas.txt','w') as ta:
        tarefas = lista_tarefas.get(0,END)
        for x in tarefas:
            ta.write(x+'\n')

def carregar_tarefas():
    with open('tarefas.txt','r') as ta:
        tarefas = ta.readlines()
        for x in tarefas:
            lista_tarefas.insert(0,x.strip())
            
def del_tarefa():
    selecionada = lista_tarefas.curselection()
    if(selecionada):
        lista_tarefas.delete(selecionada)
        salvar_tarefas()
    else:
        messagebox.showerror('ERRO','selecione uma tarefa !!')
#------------------janela-------------------
ctk.set_appearance_mode('dark')

janela = ctk.CTk()

janela.geometry('350x500')
janela.title('Lista de Tarefas - Versão 1.0')
janela.resizable(False,False)
#-------------------------------------------

tarefa = ctk.CTkEntry(janela, 
                      width=320,
                      height=40,
                      border_color='hotpink',
                      placeholder_text='Digite a tarefa a ser criada',
                      )

tarefa.pack(pady=10)


btadicionar = ctk.CTkButton(janela,
                            width=100,
                            height=40,
                            fg_color='lightgreen',
                            hover_color='darkgreen',
                            text='Adicionar tarefa',
                            font=('verdana',15,'bold'),
                            cursor='hand2',
                            text_color='black',
                            command=add_tarefa)

btadicionar.place(x=15,y=60)

btexcluir =  ctk.CTkButton(janela,
                            width=100,
                            height=40,
                            fg_color='red',
                            hover_color='darkred',
                            text='Deletar tarefa',
                            font=('verdana',15,'bold'),
                            cursor='hand2',
                            text_color='black',
                            command=del_tarefa)

btexcluir.place(x=205,y=60)

lista_tarefas = Listbox(janela,
                        width=30,
                        height=17,
                        font=('verdana',12,'bold'),
                        background='#363636',
                        highlightbackground="hotpink",
                        highlightthickness=2,
                        fg='white')


lista_tarefas.place(x=7,y=160)


carregar_tarefas()
janela.mainloop()