import os

lista=[]
maior:int=0
menor:int=9999

SIZE=2
for i in range(SIZE):
    valor =int(input("Digite um número: "))
    lista.append(valor)
    
    if lista[i]>maior:
        maior = lista[i]
    if lista[i]<menor:
        menor=lista[i]

print(f"Esse é o maior número: {maior}")