algoritmo "AplicPiso"
// Função : CALCULAR VALOR APROXIMADO DE GASTOS PARA APLICAÇÃO DE PISOS.
// Autor : BR PROGRAMAÇÃO
// Data : 23/03/2017
// Seção de Declarações
var
   L , C , LP , CP : REAL
   OPCAO , OPCAO2 : CARACTERE
   RESULTADO , RESULTADO2 : REAL
   AREA : REAL
   PRECOPISO : REAL
   ARGAMASSA , REJUNTE , VALOR_PISO , QESPACADOR , MAODEOBRA , TOTAL : REAL
inicio

      ESCREVA ("Digite a largura do local em metros: ")
      LEIA (L)
      ESCREVA ("Digite o comprimento do local em metros: ")
      LEIA (C)
      ESCREVA ("Digite o valor do m² do piso desejado: ")
      LEIA (PRECOPISO)
      ESCREVA ("Digite a largura em metros do piso: ")
      LEIA (LP)
      ESCREVA ("Digite o comprimento em metros do piso: ")
      LEIA (CP)

      ESCREVA ("Instalação feita na diagonal? 1-Sim 2-Não: ")
      LEIA (OPCAO)

              SE OPCAO = "1" ENTAO
              RESULTADO := L * C * 15 / 100
         SENAO
              SE OPCAO = "2" ENTAO
                 RESULTADO := L * C * 10 / 100
         SENAO
   FIMSE
 FIMSE

      ESCREVA ("Instalação com espaçadores? 1-Sim 2-Não: ")
      LEIA (OPCAO2)

              SE OPCAO2 = "1" ENTAO
                 RESULTADO2 := ((L * C) / (LP * CP) - (((L * C) / (LP * CP)/3)))
          SENAO
              SE OPCAO2 = "2" ENTAO
                 RESULTADO2 := 0
         SENAO
   FIMSE
 FIMSE

      //FÓRMULAS

              SE RESULTADO2 = 0 ENTAO
                 QESPACADOR <- (RESULTADO2/100)
         SENAO
              SE RESULTADO2 > 0 ENTAO
                 QESPACADOR <- INT (RESULTADO2/100) +1
         SENAO
   FIMSE
 FIMSE

      AREA <- L * C
      ARGAMASSA <- int((L * C) / 4)+1
      REJUNTE <- int((L * C) / 3) +1
      VALOR_PISO <- ( (RESULTADO + AREA) * PRECOPISO )
      MAODEOBRA <- (L * C) * 61
      TOTAL <- (ARGAMASSA * 35) + (REJUNTE * 4) + VALOR_PISO + (QESPACADOR * 5)+ MAODEOBRA

     //SAÍDA

      ESCREVAL("___________________________________________________________")
        ESCREVAL ("Material necessário:")
          ESCREVAL ("M² de pisos necessários:" , RESULTADO + AREA , "m²")
          ESCREVAL ("Quantidade de argamassa é:" , ARGAMASSA , "sacos de 20Kg")
          ESCREVAL ("Quantidade de espaçadores é:" , QESPACADOR, "Pacote(s) de 100 unidades")
          ESCREVAL ("Quantidade de rejunte é:" , REJUNTE :9:0 , "Kg")

      ESCREVAL("___________________________________________________________")
        ESCREVAL ("Custos:")
          ESCREVAL ("O custo do piso é R$" , (RESULTADO + AREA) * PRECOPISO)
          ESCREVAL ("Argamassa R$" , ARGAMASSA * 35)
          ESCREVAL ("Espaçador R$" , QESPACADOR * 5)
          ESCREVAL ("Rejunte R$" , REJUNTE * 4 :9:0)
          ESCREVAL ("Mão de obra R$" , MAODEOBRA)
          ESCREVAL ("Total R$" , total:9:2)

fimalgoritmo
