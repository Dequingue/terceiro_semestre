import os

def limpar():
    os.system("cls || clear")


def calculo(distancia,consumo,preco):
    
    total = (distancia / consumo)*preco
    
    return total



    
distancia = int(input("Digite a distaçia em KM: "))
consumo = int(input("Digite o consumo de gasolina em L:"))
preco = float(input("Digite o preço do combustivel em R$: "))    

limpar()

totalF = calculo(distancia,consumo,preco)

print(f"Esse é o gasto que vc terá em R$: {totalF}")    