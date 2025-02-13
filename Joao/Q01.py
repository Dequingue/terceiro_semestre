import os
import time

numeros=[]

SIZE=10
numeroMaior:int = 0
numeroMenor:int = 9999


for i in range(SIZE):
    valor= int(input("Digite um número: "))
    numeros.append(valor)
    
    if numeros[i]>numeroMaior:
        numeroMaior=numeros[i]
        
    if numeros[i]<numeroMenor:
        numeroMenor= numeros[i]   

os.system("cls||clear")
print(f"O maior número é: {numeroMaior}") 
print(f"O menor número é: {numeroMenor}")   