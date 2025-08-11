#!/bin/bash
# Script para executar o analisador léxico

echo "=== Executando a análise léxica ==="

# Solicita ao usuário o número do teste
read -p "Digite o numero do teste: " resposta

# Executa o programa com o arquivo escolhido
java -cp ".:java-cup-11b-runtime.jar" Main src/${resposta}.txt

# Pausa para ver o resultado
read -p "Pressione Enter para continuar..."
