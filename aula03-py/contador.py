import os
import random
import time

def limpar():
    os.system("cls||clear")

limpar()

numeroSorte= random.randint(1,100)
contador = 0

while True:
    
    numero = int(input("Digite um número: "))
    contador = contador+1
    
    if numero == numeroSorte:
        print("==== Parabens ====")
        print(f"O número sorteado é: {numeroSorte}")
    elif numeroSorte < numero:
        print("O número sorteado é menor!!!")
    elif numeroSorte > numero:
        print("O número sorteado é maior!!!")
    if contador == 3:
        limpar()
        print(f"\nO número sorteado era: {numeroSorte}")
        print("tentativas acabaram!!!")
        break            


