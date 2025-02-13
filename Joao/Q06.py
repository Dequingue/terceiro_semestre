import os
import random

nome=[]
SIZE=10
for i in range(SIZE):
    lista=input("Digite um nome: ")
    nome.append(lista)
    
    
nomeSorte=random.choice(nome)


print(f"Esse é o nome sorteado: {nomeSorte}")
