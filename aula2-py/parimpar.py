import os

def limpar():
    os.system("cls || clear")

limpar()

valor= int(input("Digite um valor: "))

limpar()
print("----- RESULTADO -----\n")
print("O número de sua escolha:",format(valor))
if valor %2 == 0:
    print("É um número [Par].")
else:
    print("É um número [Impar].")    