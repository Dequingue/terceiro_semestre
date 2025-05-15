# integrantes:
# João luiz Alcantar | Iuri Cauan

from tkinter import *
from datetime import datetime, date
import locale

# Cores
cor1 = "#3d3d3d"  # preto
cor2 = "#fafcff"  # branco
cor3 = "#21c25c"  # verde
cor4 = "#eb463b"  # vermelho
cor5 = "#dedcdc"  # cinza
cor6 = "#3080f0"  # azul

fundo = cor1
cor = cor2

locale.setlocale(locale.LC_TIME, 'pt_BR.UTF-8')

def relogio():
    agora = datetime.now()
    hora = agora.strftime("%H:%M:%S")

    # Corrigido: trabalhar com date apenas
    hoje = date.today()
    fim_ano = date(hoje.year, 12, 31)
    dias_restantes = (fim_ano - hoje).days

    dia_semana = agora.strftime("%A")
    dia = agora.day
    mes = agora.strftime("%B")
    ano = agora.year

    l1.config(text=hora)
    l1.after(1000, relogio)
    l2.config(text=f"{dia_semana} | {dia} de {mes} de {ano}")
    l3.config(text=f"Faltam {dias_restantes} dias para o fim do ano")

# Janela
janela = Tk()
janela.title('Relógio Digital')
janela.geometry("440x220")
janela.resizable(width=FALSE, height=FALSE)
janela.configure(bg=cor1)

# Labels
l1 = Label(janela, text="", font=("Arial", 80), bg=fundo, fg=cor4)
l1.grid(row=0, column=0, sticky=NW, padx=5)

l2 = Label(janela, text="", font=("Arial", 20), bg=fundo, fg=cor)
l2.grid(row=1, column=0, sticky=NW, padx=5)

l3 = Label(janela, text="", font=("Arial", 16), bg=fundo, fg=cor3)
l3.grid(row=2, column=0, sticky=NW, padx=5)

relogio()
janela.mainloop()


