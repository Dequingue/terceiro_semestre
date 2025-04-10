import customtkinter as ctk
import qrcode
from PIL import Image, ImageDraw, ImageTk
import qrcode.constants


def gerar():
    t= texto.get()
    if t:
        qr = qrcode.QRCode(
        version = 1,
        box_size= 10,
        border=4,
        error_correction=qrcode.constants.ERROR_CORRECT_L
        )
        
        qr.add_data(t)
        qr.make(fit=True)
        imagem = qr.make_image(fill='black',back_color='white')
        img_Tk = ImageTk.PhotoImage(imagem)

        resultado.configure(image=img_Tk)
        resultado.image= img_Tk
        
    
    

janela = ctk.CTk()

janela.geometry('700x500')
janela.resizable(True,True)
janela.title('Gerador de QRcode')
ctk.set_appearance_mode('dark')

texto = ctk.CTkEntry(janela
                     ,width=400
                     ,height=40
                     ,fg_color='white'
                     ,text_color='black'
                     ,placeholder_text='Digite a URL'
                     ,font=('arial',20))


botao = ctk.CTkButton(janela
                      ,width=120
                      ,height=40
                      ,text='Gerar'
                      ,fg_color='blue'
                      ,font=('arial',18)
                      ,hover_color='green'
                      ,command=gerar)


resultado = ctk.CTkLabel(janela,text='') 
resultado.pack(pady=60)

texto.place(x=30,y=10)
botao.place(x=450,y=10)
janela.mainloop()