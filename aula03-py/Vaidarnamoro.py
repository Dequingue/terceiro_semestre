import os
import time
import random

def limpar():
    os.system("cls||clear")
    
limpar()

SIZE=10
lista=[]

for i in range(SIZE):
    nome= input(f"Digite o {i+1}º nome: ").lower()
    lista.append(nome)
    
nomesorte = random.choice(lista)

limpar()
print(f"O nome sorteado é: {nomesorte.capitalize()}")    
