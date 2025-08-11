#!/bin/bash
# Script para compilar o analisador léxico e sintático

echo "Compilar Analizador lexico e sintatico"
read -p "Pressione Enter para continuar..."

echo "Gerando scanner a partir do arquivo .jflex..."
java -jar jflex-full-1.9.1.jar ./Analisador_Lexico.jflex
read -p "Pressione Enter para continuar..."

echo "Gerando parser a partir do arquivo .cup..."
java -jar java-cup-11b.jar -parser Parser -expect 420 ./Analisador_Sintatico.cup
read -p "Pressione Enter para continuar..."

echo "Compilando arquivos Java..."
javac -Xlint -cp ".:java-cup-11b-runtime.jar" *.java
read -p "Pressione Enter para continuar..."

if [ $? -eq 0 ]; then
    echo "=== Compilação bem-sucedida! ==="
else
    echo "=== Erro na compilação! ==="
fi