import os

def limpar():
    os.system("cls || clear")


limpar()

SIZE = 2
lista =[]    
for i in range(SIZE):
    name = str(input(f"Digite seu {i+1}º nome: "))
    lista.append(name)

limpar()

for i in range(len(lista)):
    print(f"Esse é o {i+1}º nome: {lista[i]}")      
    