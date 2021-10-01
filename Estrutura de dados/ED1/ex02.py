paginafinal = [] 

for j in range(4):
    print("Enchendo memória...")
    paginafinal.append([])
    for r in range(4):
        paginafinal[j].append([])
        for t in range(8):
            paginafinal[j][r].append(t)


print("\nMemória cheia!!\n")

for t in range(2):
  print(paginafinal)
  print("\nRetirando 20%...\n")
  p = 0
  for m in range(4):#ENTRAR DA PAGINA COMO UMA FILA
    for n in range(3, -1, -1):#ENTRANDO NAS PILHAS COMO PILHA
      while p <= 25:# 20% de 128 bytes e aproximadamente 25,6 arredondei  para 26
        if paginafinal[m][n] == []:
          break
        p = p + 1
        paginafinal[m][n].pop()
        





print(paginafinal)
print("\n Lista Final!!\n")
print(paginafinal)


