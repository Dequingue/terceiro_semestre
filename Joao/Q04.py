import os


lista=[]

SIZE=5
for i in range(SIZE):
    nome=input("Digite seu nome: ").lower()
    lista.append(nome)
    
    
lista.sort() 
 
for i in range(SIZE):
    print(f"{lista[i]}")    