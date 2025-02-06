import os


import random

#append - ele insere um valor na ultima posição do vetor
#insert - escolhe a posição desejado 
#remove - Apaga pelo valor
#pop - Apaga a ultima posição ou uma posição desejada
#sort - ordena o vetor
#len - contar quantidade de elementos que tem em um vetor
#random - precisa de uma biblioteca 
#sum ele soma todo o vetor
#reverse - ele troca de lugar os objetos do vetor
#max procura o mair valor de um vetor
#min o menor valor de um vetor




#----------------------COMANDOS-----------------------
numeros =[12,21,2,23,33,45,67]
#numeros.append(67)
#numeros.insert(2,67)
#numeros.pop(1)
#numeros.remove(33)
#numeros.sort()
#numeros.reverse()
#contador = len(numeros)

os.system("cls || clear")
numerosorteado = random.randint(1,100)

numerosortevetor = random.choice(numeros)

print(f"Por vetor: {numerosortevetor}")
print(f"de 1 a 100: {numerosorteado}")