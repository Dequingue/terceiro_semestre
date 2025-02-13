import os

numero=[]
media:float = 0
somar:int=0
SIZE=10
for i in range(SIZE):
    valor = int(input("Digite um número: "))
    numero.append(valor)
    
    somar += numero[i]
    media = somar / SIZE


print(f"A soma é: {somar}")
print(f"Essa é a media: {media}")    