Algoritmo "agenciadeviagem"

Var
   destino: vetor[1..2] de caractere
   nome: vetor[1..2] de caractere
   telefone: vetor[1..2] de caractere
   email: vetor[1..2] de caractere
   endereco: vetor[1..2] de caractere
   uf: vetor[1..2] de caractere
   pais: vetor[1..2] de caractere
   estado: vetor[1..2] de caractere
   municipio: vetor[1..2] de caractere
   datachegada: vetor[1..2] de caractere
   datasaida: vetor[1..2] de caractere
   alternativa: inteiro
   contador: inteiro

Inicio
   repita
      escreval ("============Agência de Viagens Ethernum- Menu=========")
      escreval (" 1 - Cadastrar o cliente")
      escreval (" 2 - Cadastrar o destino")
      escreval (" 3 - Consultar os dados do cliente e destino")
      escreval (" 4 - Encerrar")
      leia(alternativa)
      escolha (alternativa)
      caso 1
         para contador de 1 ate 2 faca
            escreval ("Cadastre o nome do cliente ")
            leia (nome[contador])
            escreval ("Cadastre o telefone do cliente ")
            leia (telefone[contador])
            escreval ("Cadastre o e-mail do cliente ")
            leia (email[contador])
            escreval ("Cadastre o endereço do cliente ")
            leia (endereco[contador])
            escreval ("Cadastre o UF do cliente ")
            leia (uf[contador])
         fimpara
         escreval ("Os dados foram cadastrados com sucesso ")
      caso 2
         para contador de 1 ate 2 faca
            escreval ("Cadastre o país de destino ")
            leia (pais[contador])
            escreval ("Cadastre o estado: ")
            leia (estado[contador])
            escreval ("Cadastre o nome do município:  ")
            leia (municipio[contador])
            escreval ("Cadastre a data de chegada no destino, sem espaços ou / ")
            leia (datachegada[contador])
            escreval ("Cadastre a data de saída do destino, sem espaços ou /  ")
            leia (datasaida[contador])
         fimpara
      caso 3
         para contador de 1 ate 2 faca
            escreval (nome[contador])
            escreval (telefone[contador])
            escreval (email[contador])
            escreval (endereco[contador])
            escreval (uf[contador])
            escreval (pais[contador])
            escreval (estado[contador])
            escreval (municipio[contador])
            escreval (datachegada[contador])
            escreval (datasaida[contador])
         fimpara
      caso 4
         limpatela
         escreval ("O sistema foi encerrado")
      fimescolha
   ate (alternativa = 4)

Fimalgoritmo