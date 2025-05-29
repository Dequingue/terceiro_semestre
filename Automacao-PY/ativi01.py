import os
import openpyxl
from docxtpl import DocxTemplate
import datetime


def limpar():
    os.system('cls||clear')
    
#acessando a planilha e consumir os dados    
caminho = 'student_data 3.xlsx'
pasta_trabalho = openpyxl.load_workbook(caminho)
planilha = pasta_trabalho.active

valores = list(planilha.values)
print(valores)

#acessando o documento docx(Certificado)

caminhoDoc = 'certificate.docx'
doc = DocxTemplate(caminhoDoc)

#criando o certificado para cada aluno
for i in valores[1:]:#pular a primeira linha
    doc.render({
        'nome': i[0],
        'curso': i[1],
        'data': i[2].strftime('%d/%m/%Y'),
        'instrutor': i[3],        
        })
    
    
    nome = f'certificado de {i[0]}.docx'
    doc.save(nome)