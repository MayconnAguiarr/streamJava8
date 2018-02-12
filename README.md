# streamJava8

## Exemplo
		List<String> funcionariosQuePagam = funcionarios.stream()
				.filter(f -> f.getSalario() > 1903.98F)
				.map(f -> f.getNome())
				.collect(Collectors.toList());
        
 ##   Explicando operações      
 1. Primeiro, uma Stream é obtida de alguma fonte de dados (coleção, array ou I/O);
 2. A operação filter(), que retorna uma nova Stream com os elementos filtrados, é aplicada;
 3. A Stream resultante do passo anterior é ordenada com a operação sorted() e, mais uma vez, uma nova Stream é retornada;
 4. Agora, a Stream resultante da operação sorted() é mapeada com a operação map();
 5. Por fim, a operação collect(), uma operação de redução, é aplicada para obter o resultado final em algum tipo de objeto diferente de Stream. 
