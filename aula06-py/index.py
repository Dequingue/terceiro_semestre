import customtkinter as ctk

janela = ctk.CTk()
janela.geometry('500x300')

ctk.set_appearance_mode('dark')

janela.resizable(False,False)
janela.title('Sistema de Acesso 2025')
ctk.CTkLabel(janela,text='Sistema de Acesso',
             font=('Arial',50,'bold'),
             text_color='yellow').pack(pady=20)

login = ctk.CTkEntry(janela,width=400,
                     height=40,
                     placeholder_text=('Digite o seu login'),
                     font=('arial',20))
senha= ctk.CTkEntry(janela,width=400,
                    height=40,
                    placeholder_text='Digite sua senha',
                    show='*',
                    font=('arial',20))
botao = ctk.CTkButton(janela,width=150,
                      height=40,fg_color='yellow',
                      text_color='black',
                      text='Acessar',font=('arial',18),
                      hover_color='orange')
login.pack(pady=10)
senha.pack()
botao.pack(pady=10)
janela.mainloop()