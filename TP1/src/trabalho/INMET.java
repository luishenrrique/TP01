package trabalho;

import java.util.Scanner;


public class INMET {

		//2011
		static int jan11[] = new int[31];
		static int fev11[] = new int[28];
		static int mar11[] = new int[31];
		static int abr11[] = new int[30];
		static int mai11[] = new int[31];
		static int jun11[] = new int[30];
		static int jul11[] = new int[31];
		static int ago11[] = new int[31];
		static int set11[] = new int[30];
		static int out11[] = new int[31];
		static int nov11[] = new int[30];
		static int dez11[] = new int[31];
		
		//2012
		static int jan12[] = new int[31];
		static int fev12[] = new int[28];
		static int mar12[] = new int[31];
		static int abr12[] = new int[30];
		static int mai12[] = new int[31];
		static int jun12[] = new int[30];
		static int jul12[] = new int[31];
		static int ago12[] = new int[31];
		static int set12[] = new int[30];
		static int out12[] = new int[31];
		static int nov12[] = new int[30];
		static int dez12[] = new int[31];
		
		//2013
		static int jan13[] = new int[31];
		static int fev13[] = new int[28];
		static int mar13[] = new int[31];
		static int abr13[] = new int[30];
		static int mai13[] = new int[31];
		static int jun13[] = new int[30];
		static int jul13[] = new int[31];
		static int ago13[] = new int[31];
		static int set13[] = new int[30];
		static int out13[] = new int[31];
		static int nov13[] = new int[30];
		static int dez13[] = new int[31];
		
		//2014
		static int jan14[] = new int[31];
		static int fev14[] = new int[28];
		static int mar14[] = new int[31];
		static int abr14[] = new int[30];
		static int mai14[] = new int[31];
		static int jun14[] = new int[30];
		static int jul14[] = new int[31];
		static int ago14[] = new int[31];
		static int set14[] = new int[30];
		static int out14[] = new int[31];
		static int nov14[] = new int[30];
		static int dez14[] = new int[31];
		
		//2015
		static int jan15[] = new int[31];
		static int fev15[] = new int[28];
		static int mar15[] = new int[31];
		static int abr15[] = new int[30];
		static int mai15[] = new int[31];
		static int jun15[] = new int[30];
		static int jul15[] = new int[31];
		static int ago15[] = new int[31];
		static int set15[] = new int[30];
		static int out15[] = new int[31];
		static int nov15[] = new int[30];
		static int dez15[] = new int[31];
		
		//2016
		static int jan16[] = new int[31];
		static int fev16[] = new int[28];
		static int mar16[] = new int[31];
		static int abr16[] = new int[30];
		static int mai16[] = new int[31];
		static int jun16[] = new int[30];
		static int jul16[] = new int[31];
		static int ago16[] = new int[31];
		static int set16[] = new int[30];
		static int out16[] = new int[31];
		static int nov16[] = new int[30];
		static int dez16[] = new int[31];
		
		//2017
		static int jan17[] = new int[31];
		static int fev17[] = new int[28];
		static int mar17[] = new int[31];
		static int abr17[] = new int[30];
		static int mai17[] = new int[31];
		static int jun17[] = new int[30];
		static int jul17[] = new int[31];
		static int ago17[] = new int[31];
		static int set17[] = new int[30];
		static int out17[] = new int[31];
		static int nov17[] = new int[30];
		static int dez17[] = new int[31];
		
		//2018
		static int jan18[] = new int[31];
		static int fev18[] = new int[28];
		static int mar18[] = new int[31];
		static int abr18[] = new int[30];
		static int mai18[] = new int[31];
		static int jun18[] = new int[30];
		static int jul18[] = new int[31];
		static int ago18[] = new int[31];
		static int set18[] = new int[30];
		static int out18[] = new int[31];
		static int nov18[] = new int[30];
		static int dez18[] = new int[31];
		
		//2019
		static int jan19[] = new int[31];
		static int fev19[] = new int[28];
		static int mar19[] = new int[31];
		static int abr19[] = new int[30];
		static int mai19[] = new int[31];
		static int jun19[] = new int[30];
		static int jul19[] = new int[31];
		static int ago19[] = new int[31];
		static int set19[] = new int[30];
		static int out19[] = new int[31];
		static int nov19[] = new int[30];
		static int dez19[] = new int[31];
		
		//2020
		//int jan20[] = new int[31];
		static int fev20[] = new int[28];
		static int mar20[] = new int[31];
		static int abr20[] = new int[30];
		static int mai20[] = new int[31];
		static int jun20[] = new int[30];
		static int jul20[] = new int[31];
		static int ago20[] = new int[31];
		static int set20[] = new int[30];
		static int out20[] = new int[31];
		static int nov20[] = new int[30];
		static int dez20[] = new int[31];
		
		// Para testes JANEIRO 2020
		static int jan20[] = {13, 17, 17, 22, 23, 25, 27,
					   13, 17, 17, 22, 23, 25, 27,
					   13, 17, 17, 22, 23, 25, 27,
					   13, 17, 17, 22, 23, 25, 27,
					   24, 24, 21};
	
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int op = 0;
		
		do
		{
			System.out.println("--------------- MENU ---------------");
			System.out.println("  1 - Entrada das temperaturas");
			System.out.println("  2 - Cálculo da temperatura média");
			System.out.println("  3 - Cálculo da temperatura mínima");
			System.out.println("  4 - Cálculo da temperatura máxima");
			System.out.println("  5 - Relatório metereológico");
			System.out.println("  0 - Sair");
			System.out.print("\nDigite uma opção: ");
			
			op = ler.nextInt();
	
			switch (op)
			{
				case 1:
				{
					System.out.print("Digite o mês/ano para cadastro: ");
					String entrada = ler.next();

					cadastrar(entrada);
					
					break;
				}
				
				
				case 2:
				{
					System.out.print("Digite o mês/ano para consultar a temperatura média: ");
					String entrada = ler.next();
					
					media(entrada);
					
					break;
				}
				
				
				case 3:
				{
					
					System.out.print("Digite o mês/ano para consultar a temperatura mínima: ");
					String entrada = ler.next();
					
					temperaturaMinima(entrada);
					
					break;
				}
				
				
				case 4:
				{
					
					System.out.print("Digite o mês/ano para consultar a temperatura máxima: ");
					String entrada = ler.next();
					
					temperaturaMaxima(entrada);
					
					break;
				}
				
				
				case 5:
				{
					System.out.print("Digite o mês/ano para gerar relatório: ");
					String entrada = ler.next();
					
					System.out.println("------------- RELATÓRIO --------------");
					temperaturaDia(entrada);
					System.out.println(" ------------------------------- ");
					media(entrada);
					System.out.println(" ------------------------------- ");
					temperaturaMinima(entrada);
					System.out.println(" ------------------------------- ");
					temperaturaMaxima(entrada);
					System.out.println(" ------------------------------- ");
					
					break;
				}
				
				
				case 0:
				{
					System.exit(0);
					break;
				}
				
				
				default:
					System.out.println("Opção inválida!");
					break;
					
			}
			
		}while(op != 0);
			
	}

	
	
	
	
	
	
	
	// MÉTODOS
	
	static void cadastrar(String entrada) {
		Scanner ler = new Scanner(System.in);
		
		//2011
		if (entrada.equals("Janeiro/2011") || entrada.equals("janeiro/2011") ||
				entrada.equals("Março/2011") || entrada.equals("março/2011") ||
				entrada.equals("Maio/2011") || entrada.equals("maio/2011") ||
				entrada.equals("Julho/2011") || entrada.equals("julho/2011") ||
				entrada.equals("Agosto/2011") || entrada.equals("agosto/2011") ||
				entrada.equals("Outubro/2011") || entrada.equals("outubro/2011") ||
				entrada.equals("Dezembro/2011") || entrada.equals("dezembro/2011"))
			{
				System.out.println("\nEntre com as médias de temperaturas");
				for (int i = 0; i < 31; i++)
				{
					System.out.print("Dia " + (i+1) + ": ");	
					
					if (entrada.startsWith("Janeiro/2011") || entrada.startsWith("janeiro/2011")) 
					{
						jan11[i] = ler.nextInt();
					}
					else if (entrada.startsWith("Março/2011") || entrada.startsWith("março/2011"))
					{
						mar11[i] = ler.nextInt();
					}
					else if (entrada.startsWith("Maio/2011") || entrada.startsWith("maio/2011"))
					{
						mai11[i] = ler.nextInt();
					}
					else if (entrada.startsWith("Julho/2011") || entrada.startsWith("julho/2011"))
					{
						jul11[i] = ler.nextInt();
					}
					else if (entrada.startsWith("Agosto/2011") || entrada.startsWith("agosto/2011"))
					{
						ago11[i] = ler.nextInt();
					}
					else if (entrada.startsWith("Outubro/2011") || entrada.startsWith("outubro/2011"))
					{
						out11[i] = ler.nextInt();
					}
					else if (entrada.startsWith("Dezembro/2011") || entrada.startsWith("dezembro/2011"))
					{
						dez11[i] = ler.nextInt();
					}
				}
			}
			
		else if (entrada.equals("Abril/2011") || entrada.equals("abril/2011") ||
				entrada.equals("Junho/2011") || entrada.equals("junho/2011") ||
				entrada.equals("Setembro/2011") || entrada.equals("setembro/2011") ||
				entrada.equals("Novembro/2011") || entrada.equals("novembro/2011"))
		{
			System.out.println("\nEntre com as médias de temperaturas");
			for (int i = 0; i < 30; i++)
			{
				System.out.print("Dia " + (i+1) + ": ");
				
				if (entrada.startsWith("Abril/2011") || entrada.startsWith("abril/2011")) 
				{
					abr11[i] = ler.nextInt();
				}
				else if (entrada.startsWith("Junho/2011") || entrada.startsWith("junho/2011"))
				{
					jun11[i] = ler.nextInt();
				}
				else if (entrada.startsWith("Setembro/2011") || entrada.startsWith("setembro/2011"))
				{
					set11[i] = ler.nextInt();
				}
				else if (entrada.startsWith("Novembro/2011") || entrada.startsWith("novembro/2011"))
				{
					nov11[i] = ler.nextInt();
				}
			}
		}
		
		
		//2012
				if (entrada.equals("Janeiro/2012") || entrada.equals("janeiro/2012") ||
						entrada.equals("Março/2012") || entrada.equals("março/2012") ||
						entrada.equals("Maio/2012") || entrada.equals("maio/2012") ||
						entrada.equals("Julho/2012") || entrada.equals("julho/2012") ||
						entrada.equals("Agosto/2012") || entrada.equals("agosto/2012") ||
						entrada.equals("Outubro/2012") || entrada.equals("outubro/2012") ||
						entrada.equals("Dezembro/2012") || entrada.equals("dezembro/2012"))
					{
						System.out.println("\nEntre com as médias de temperaturas");
						for (int i = 0; i < 31; i++)
						{
							System.out.print("Dia " + (i+1) + ": ");	
							
							if (entrada.startsWith("Janeiro/2012") || entrada.startsWith("janeiro/2012")) 
							{
								jan12[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Março/2012") || entrada.startsWith("março/2012"))
							{
								mar12[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Maio/2012") || entrada.startsWith("maio/2012"))
							{
								mai12[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Julho/2012") || entrada.startsWith("julho/2012"))
							{
								jul12[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Agosto/2012") || entrada.startsWith("agosto/2012"))
							{
								ago12[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Outubro/2012") || entrada.startsWith("outubro/2012"))
							{
								out12[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Dezembro/2012") || entrada.startsWith("dezembro/2012"))
							{
								dez12[i] = ler.nextInt();
							}
						}
					}
					
				else if (entrada.equals("Abril/2012") || entrada.equals("abril/2011") ||
						entrada.equals("Junho/2012") || entrada.equals("junho/2011") ||
						entrada.equals("Setembro/2012") || entrada.equals("setembro/2011") ||
						entrada.equals("Novembro/2011") || entrada.equals("novembro/2011"))
				{
					System.out.println("\nEntre com as médias de temperaturas");
					for (int i = 0; i < 30; i++)
					{
						System.out.print("Dia " + (i+1) + ": ");
						
						if (entrada.startsWith("Abril/2012") || entrada.startsWith("abril/2012")) 
						{
							abr12[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Junho/2012") || entrada.startsWith("junho/2012"))
						{
							jun12[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Setembro/2012") || entrada.startsWith("setembro/2012"))
						{
							set12[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Novembro/2012") || entrada.startsWith("novembro/2012"))
						{
							nov12[i] = ler.nextInt();
						}
					}
				}
				
				
				
				//2013
				if (entrada.equals("Janeiro/2013") || entrada.equals("janeiro/2013") ||
						entrada.equals("Março/2013") || entrada.equals("março/2013") ||
						entrada.equals("Maio/2013") || entrada.equals("maio/2013") ||
						entrada.equals("Julho/2013") || entrada.equals("julho/2013") ||
						entrada.equals("Agosto/2013") || entrada.equals("agosto/2013") ||
						entrada.equals("Outubro/2013") || entrada.equals("outubro/2013") ||
						entrada.equals("Dezembro/2013") || entrada.equals("dezembro/2013"))
					{
						System.out.println("\nEntre com as médias de temperaturas");
						for (int i = 0; i < 31; i++)
						{
							System.out.print("Dia " + (i+1) + ": ");	
							
							if (entrada.startsWith("Janeiro/2013") || entrada.startsWith("janeiro/2013")) 
							{
								jan13[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Março/2013") || entrada.startsWith("março/2013"))
							{
								mar13[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Maio/2013") || entrada.startsWith("maio/2013"))
							{
								mai13[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Julho/2013") || entrada.startsWith("julho/2013"))
							{
								jul13[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Agosto/2013") || entrada.startsWith("agosto/2013"))
							{
								ago13[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Outubro/2013") || entrada.startsWith("outubro/2013"))
							{
								out13[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Dezembro/2013") || entrada.startsWith("dezembro/2013"))
							{
								dez13[i] = ler.nextInt();
							}
						}
					}
					
				else if (entrada.equals("Abril/2013") || entrada.equals("abril/2013") ||
						entrada.equals("Junho/2013") || entrada.equals("junho/2013") ||
						entrada.equals("Setembro/2013") || entrada.equals("setembro/2013") ||
						entrada.equals("Novembro/2013") || entrada.equals("novembro/2013"))
				{
					System.out.println("\nEntre com as médias de temperaturas");
					for (int i = 0; i < 30; i++)
					{
						System.out.print("Dia " + (i+1) + ": ");
						
						if (entrada.startsWith("Abril/2013") || entrada.startsWith("abril/2013")) 
						{
							abr13[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Junho/2013") || entrada.startsWith("junho/2013"))
						{
							jun13[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Setembro/2013") || entrada.startsWith("setembro/2013"))
						{
							set13[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Novembro/2013") || entrada.startsWith("novembro/2013"))
						{
							nov13[i] = ler.nextInt();
						}
					}
				}
				
				
				//2014
				if (entrada.equals("Janeiro/2014") || entrada.equals("janeiro/2014") ||
						entrada.equals("Março/2014") || entrada.equals("março/2014") ||
						entrada.equals("Maio/2014") || entrada.equals("maio/2014") ||
						entrada.equals("Julho/2014") || entrada.equals("julho/2014") ||
						entrada.equals("Agosto/2014") || entrada.equals("agosto/2014") ||
						entrada.equals("Outubro/2014") || entrada.equals("outubro/2014") ||
						entrada.equals("Dezembro/2014") || entrada.equals("dezembro/2014"))
					{
						System.out.println("\nEntre com as médias de temperaturas");
						for (int i = 0; i < 31; i++)
						{
							System.out.print("Dia " + (i+1) + ": ");	
							
							if (entrada.startsWith("Janeiro/2014") || entrada.startsWith("janeiro/2014")) 
							{
								jan14[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Março/2014") || entrada.startsWith("março/2014"))
							{
								mar14[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Maio/2014") || entrada.startsWith("maio/2014"))
							{
								mai14[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Julho/2014") || entrada.startsWith("julho/2014"))
							{
								jul14[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Agosto/2014") || entrada.startsWith("agosto/2014"))
							{
								ago14[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Outubro/2014") || entrada.startsWith("outubro/2014"))
							{
								out14[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Dezembro/2014") || entrada.startsWith("dezembro/2014"))
							{
								dez14[i] = ler.nextInt();
							}
						}
					}
					
				else if (entrada.equals("Abril/2014") || entrada.equals("abril/2014") ||
						entrada.equals("Junho/2014") || entrada.equals("junho/2014") ||
						entrada.equals("Setembro/2014") || entrada.equals("setembro/2014") ||
						entrada.equals("Novembro/2014") || entrada.equals("novembro/2014"))
				{
					System.out.println("\nEntre com as médias de temperaturas");
					for (int i = 0; i < 30; i++)
					{
						System.out.print("Dia " + (i+1) + ": ");
						
						if (entrada.startsWith("Abril/2014") || entrada.startsWith("abril/2014")) 
						{
							abr14[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Junho/2014") || entrada.startsWith("junho/2014"))
						{
							jun14[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Setembro/2014") || entrada.startsWith("setembro/2014"))
						{
							set14[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Novembro/2014") || entrada.startsWith("novembro/2014"))
						{
							nov14[i] = ler.nextInt();
						}
					}
				}
				
				//2015
				if (entrada.equals("Janeiro/2015") || entrada.equals("janeiro/2015") ||
						entrada.equals("Março/2015") || entrada.equals("março/2015") ||
						entrada.equals("Maio/2015") || entrada.equals("maio/2015") ||
						entrada.equals("Julho/2015") || entrada.equals("julho/2015") ||
						entrada.equals("Agosto/2015") || entrada.equals("agosto/2015") ||
						entrada.equals("Outubro/2015") || entrada.equals("outubro/2015") ||
						entrada.equals("Dezembro/2015") || entrada.equals("dezembro/2015"))
					{
						System.out.println("\nEntre com as médias de temperaturas");
						for (int i = 0; i < 31; i++)
						{
							System.out.print("Dia " + (i+1) + ": ");	
							
							if (entrada.startsWith("Janeiro/2015") || entrada.startsWith("janeiro/2015")) 
							{
								jan15[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Março/2015") || entrada.startsWith("março/2015"))
							{
								mar15[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Maio/2015") || entrada.startsWith("maio/2015"))
							{
								mai15[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Julho/2015") || entrada.startsWith("julho/2015"))
							{
								jul15[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Agosto/2015") || entrada.startsWith("agosto/2015"))
							{
								ago15[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Outubro/2015") || entrada.startsWith("outubro/2015"))
							{
								out15[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Dezembro/2015") || entrada.startsWith("dezembro/2015"))
							{
								dez15[i] = ler.nextInt();
							}
						}
					}
					
				else if (entrada.equals("Abril/2015") || entrada.equals("abril/2015") ||
						entrada.equals("Junho/2015") || entrada.equals("junho/2015") ||
						entrada.equals("Setembro/2015") || entrada.equals("setembro/2015") ||
						entrada.equals("Novembro/2015") || entrada.equals("novembro/2015"))
				{
					System.out.println("\nEntre com as médias de temperaturas");
					for (int i = 0; i < 30; i++)
					{
						System.out.print("Dia " + (i+1) + ": ");
						
						if (entrada.startsWith("Abril/2015") || entrada.startsWith("abril/2015")) 
						{
							abr15[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Junho/2015") || entrada.startsWith("junho/2015"))
						{
							jun15[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Setembro/2015") || entrada.startsWith("setembro/2015"))
						{
							set15[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Novembro/2015") || entrada.startsWith("novembro/2015"))
						{
							nov15[i] = ler.nextInt();
						}
					}
				}
				
				
				//2016
				if (entrada.equals("Janeiro/2016") || entrada.equals("janeiro/2016") ||
						entrada.equals("Março/2016") || entrada.equals("março/2016") ||
						entrada.equals("Maio/2016") || entrada.equals("maio/2016") ||
						entrada.equals("Julho/2016") || entrada.equals("julho/2016") ||
						entrada.equals("Agosto/2016") || entrada.equals("agosto/2016") ||
						entrada.equals("Outubro/2016") || entrada.equals("outubro/2016") ||
						entrada.equals("Dezembro/2016") || entrada.equals("dezembro/2016"))
					{
						System.out.println("\nEntre com as médias de temperaturas");
						for (int i = 0; i < 31; i++)
						{
							System.out.print("Dia " + (i+1) + ": ");	
							
							if (entrada.startsWith("Janeiro/2016") || entrada.startsWith("janeiro/2016")) 
							{
								jan16[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Março/2016") || entrada.startsWith("março/2016"))
							{
								mar16[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Maio/2016") || entrada.startsWith("maio/2016"))
							{
								mai16[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Julho/2016") || entrada.startsWith("julho/2016"))
							{
								jul16[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Agosto/2016") || entrada.startsWith("agosto/2016"))
							{
								ago16[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Outubro/2016") || entrada.startsWith("outubro/2016"))
							{
								out16[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Dezembro/2016") || entrada.startsWith("dezembro/2016"))
							{
								dez16[i] = ler.nextInt();
							}
						}
					}
					
				else if (entrada.equals("Abril/2016") || entrada.equals("abril/2016") ||
						entrada.equals("Junho/2016") || entrada.equals("junho/2016") ||
						entrada.equals("Setembro/2016") || entrada.equals("setembro/2016") ||
						entrada.equals("Novembro/2016") || entrada.equals("novembro/2016"))
				{
					System.out.println("\nEntre com as médias de temperaturas");
					for (int i = 0; i < 30; i++)
					{
						System.out.print("Dia " + (i+1) + ": ");
						
						if (entrada.startsWith("Abril/2016") || entrada.startsWith("abril/2016")) 
						{
							abr16[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Junho/2016") || entrada.startsWith("junho/2016"))
						{
							jun16[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Setembro/2016") || entrada.startsWith("setembro/2016"))
						{
							set16[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Novembro/2016") || entrada.startsWith("novembro/2016"))
						{
							nov16[i] = ler.nextInt();
						}
					}
				}
				
				
				//2017
				if (entrada.equals("Janeiro/2017") || entrada.equals("janeiro/2017") ||
						entrada.equals("Março/2017") || entrada.equals("março/2017") ||
						entrada.equals("Maio/2017") || entrada.equals("maio/2017") ||
						entrada.equals("Julho/2017") || entrada.equals("julho/2017") ||
						entrada.equals("Agosto/2017") || entrada.equals("agosto/2017") ||
						entrada.equals("Outubro/2017") || entrada.equals("outubro/2017") ||
						entrada.equals("Dezembro/2017") || entrada.equals("dezembro/2017"))
					{
						System.out.println("\nEntre com as médias de temperaturas");
						for (int i = 0; i < 31; i++)
						{
							System.out.print("Dia " + (i+1) + ": ");	
							
							if (entrada.startsWith("Janeiro") || entrada.startsWith("janeiro")) 
							{
								jan17[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Março") || entrada.startsWith("março"))
							{
								mar17[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Maio") || entrada.startsWith("maio"))
							{
								mai17[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Julho") || entrada.startsWith("julho"))
							{
								jul17[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Agosto") || entrada.startsWith("agosto"))
							{
								ago17[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Outubro") || entrada.startsWith("outubro"))
							{
								out17[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Dezembro") || entrada.startsWith("dezembro"))
							{
								dez17[i] = ler.nextInt();
							}
						}
					}
					
				else if (entrada.equals("Abril/2017") || entrada.equals("abril/2017") ||
						entrada.equals("Junho/2017") || entrada.equals("junho/2017") ||
						entrada.equals("Setembro/2017") || entrada.equals("setembro/2017") ||
						entrada.equals("Novembro/2017") || entrada.equals("novembro/2017"))
				{
					System.out.println("\nEntre com as médias de temperaturas");
					for (int i = 0; i < 30; i++)
					{
						System.out.print("Dia " + (i+1) + ": ");
						
						if (entrada.startsWith("Abril") || entrada.startsWith("abril")) 
						{
							abr17[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Junho") || entrada.startsWith("junho"))
						{
							jun17[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Setembro") || entrada.startsWith("setembro"))
						{
							set17[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Novembro") || entrada.startsWith("novembro"))
						{
							nov17[i] = ler.nextInt();
						}
					}
				}
				
				
				//2018
				if (entrada.equals("Janeiro/2018") || entrada.equals("janeiro/2018") ||
						entrada.equals("Março/2018") || entrada.equals("março/2018") ||
						entrada.equals("Maio/2018") || entrada.equals("maio/2018") ||
						entrada.equals("Julho/2018") || entrada.equals("julho/2018") ||
						entrada.equals("Agosto/2018") || entrada.equals("agosto/2018") ||
						entrada.equals("Outubro/2018") || entrada.equals("outubro/2018") ||
						entrada.equals("Dezembro/2018") || entrada.equals("dezembro/2018"))
					{
						System.out.println("\nEntre com as médias de temperaturas");
						for (int i = 0; i < 31; i++)
						{
							System.out.print("Dia " + (i+1) + ": ");	
							
							if (entrada.startsWith("Janeiro") || entrada.startsWith("janeiro")) 
							{
								jan18[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Março") || entrada.startsWith("março"))
							{
								mar18[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Maio") || entrada.startsWith("maio"))
							{
								mai18[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Julho") || entrada.startsWith("julho"))
							{
								jul18[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Agosto") || entrada.startsWith("agosto"))
							{
								ago18[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Outubro") || entrada.startsWith("outubro"))
							{
								out18[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Dezembro") || entrada.startsWith("dezembro"))
							{
								dez18[i] = ler.nextInt();
							}
						}
					}
					
				else if (entrada.equals("Abril/2018") || entrada.equals("abril/2018") ||
						entrada.equals("Junho/2017") || entrada.equals("junho/2018") ||
						entrada.equals("Setembro/2017") || entrada.equals("setembro/2018") ||
						entrada.equals("Novembro/2017") || entrada.equals("novembro/2018"))
				{
					System.out.println("\nEntre com as médias de temperaturas");
					for (int i = 0; i < 30; i++)
					{
						System.out.print("Dia " + (i+1) + ": ");
						
						if (entrada.startsWith("Abril") || entrada.startsWith("abril")) 
						{
							abr18[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Junho") || entrada.startsWith("junho"))
						{
							jun18[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Setembro") || entrada.startsWith("setembro"))
						{
							set18[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Novembro") || entrada.startsWith("novembro"))
						{
							nov18[i] = ler.nextInt();
						}
					}
				}
				
				
				//2019
				if (entrada.equals("Janeiro/2019") || entrada.equals("janeiro/2019") ||
						entrada.equals("Março/2019") || entrada.equals("março/2019") ||
						entrada.equals("Maio/2019") || entrada.equals("maio/2019") ||
						entrada.equals("Julho/2019") || entrada.equals("julho/2019") ||
						entrada.equals("Agosto/2019") || entrada.equals("agosto/2019") ||
						entrada.equals("Outubro/2019") || entrada.equals("outubro/2019") ||
						entrada.equals("Dezembro/2019") || entrada.equals("dezembro/2019"))
					{
						System.out.println("\nEntre com as médias de temperaturas");
						for (int i = 0; i < 31; i++)
						{
							System.out.print("Dia " + (i+1) + ": ");	
							
							if (entrada.startsWith("Janeiro") || entrada.startsWith("janeiro")) 
							{
								jan19[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Março") || entrada.startsWith("março"))
							{
								mar19[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Maio") || entrada.startsWith("maio"))
							{
								mai19[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Julho") || entrada.startsWith("julho"))
							{
								jul19[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Agosto") || entrada.startsWith("agosto"))
							{
								ago19[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Outubro") || entrada.startsWith("outubro"))
							{
								out19[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Dezembro") || entrada.startsWith("dezembro"))
							{
								dez19[i] = ler.nextInt();
							}
						}
					}
					
				else if (entrada.equals("Abril/2019") || entrada.equals("abril/2019") ||
						entrada.equals("Junho/2019") || entrada.equals("junho/2019") ||
						entrada.equals("Setembro/2019") || entrada.equals("setembro/2019") ||
						entrada.equals("Novembro/2019") || entrada.equals("novembro/2019"))
				{
					System.out.println("\nEntre com as médias de temperaturas");
					for (int i = 0; i < 30; i++)
					{
						System.out.print("Dia " + (i+1) + ": ");
						
						if (entrada.startsWith("Abril") || entrada.startsWith("abril")) 
						{
							abr19[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Junho") || entrada.startsWith("junho"))
						{
							jun19[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Setembro") || entrada.startsWith("setembro"))
						{
							set19[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Novembro") || entrada.startsWith("novembro"))
						{
							nov19[i] = ler.nextInt();
						}
					}
				}
				
				
				//2020
				if (entrada.equals("Janeiro/2020") || entrada.equals("janeiro/2020") ||
						entrada.equals("Março/2020") || entrada.equals("março/2020") ||
						entrada.equals("Maio/2020") || entrada.equals("maio/2020") ||
						entrada.equals("Julho/2020") || entrada.equals("julho/2020") ||
						entrada.equals("Agosto/2020") || entrada.equals("agosto/2020") ||
						entrada.equals("Outubro/2020") || entrada.equals("outubro/2020") ||
						entrada.equals("Dezembro/2020") || entrada.equals("dezembro/2020"))
					{
						System.out.println("\nEntre com as médias de temperaturas");
						for (int i = 0; i < 31; i++)
						{
							System.out.print("Dia " + (i+1) + ": ");	
							
							//if (entrada.startsWith("Janeiro/2020") || entrada.startsWith("janeiro/2020")) 
							//{
								//jan20[i] = ler.nextInt();
							//}
							if (entrada.startsWith("Março/2020") || entrada.startsWith("março/2020"))
							{
								mar20[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Maio/2020") || entrada.startsWith("maio/2020"))
							{
								mai20[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Julho/2020") || entrada.startsWith("julho/2020"))
							{
								jul20[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Agosto/2020") || entrada.startsWith("agosto/2020"))
							{
								ago20[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Outubro/2020") || entrada.startsWith("outubro/2020"))
							{
								out20[i] = ler.nextInt();
							}
							else if (entrada.startsWith("Dezembro/2020") || entrada.startsWith("dezembro/2020"))
							{
								dez20[i] = ler.nextInt();
							}
						}
					}
					
				else if (entrada.equals("Abril/2011") || entrada.equals("abril/2011") ||
						entrada.equals("Junho/2011") || entrada.equals("junho/2011") ||
						entrada.equals("Setembro/2011") || entrada.equals("setembro/2011") ||
						entrada.equals("Novembro/2011") || entrada.equals("novembro/2011"))
				{
					System.out.println("\nEntre com as médias de temperaturas");
					for (int i = 0; i < 30; i++)
					{
						System.out.print("Dia " + (i+1) + ": ");
						
						if (entrada.startsWith("Abril/2020") || entrada.startsWith("abril/2020")) 
						{
							abr20[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Junho/2020") || entrada.startsWith("junho/2020"))
						{
							jun20[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Setembro/2020") || entrada.startsWith("setembro/2020"))
						{
							set20[i] = ler.nextInt();
						}
						else if (entrada.startsWith("Novembro/2020") || entrada.startsWith("novembro/2020"))
						{
							nov20[i] = ler.nextInt();
						}
					}
				}
				
				
	}
	
	static void media(String entrada){
		int media = 0;
		
		// ANO 2011
		for (int i = 0; i < 31; i++)
		{	
			
			if (entrada.startsWith("Janeiro/2011") || entrada.startsWith("janeiro/2011")) 
			{
				media += jan11[i];
			}
			else if (entrada.startsWith("Março/2011") || entrada.startsWith("março/2011"))
			{
				media += mar11[i];
			}
			else if (entrada.startsWith("Maio/2011") || entrada.startsWith("maio/2011"))
			{
				media += mai11[i];
			}
			else if (entrada.startsWith("Julho/2011") || entrada.startsWith("julho/2011"))
			{
				media += jul11[i];
			}
			else if (entrada.startsWith("Agosto/2011") || entrada.startsWith("agosto/2011"))
			{
				media += ago11[i];
			}
			else if (entrada.startsWith("Outubro/2011") || entrada.startsWith("outubro/2011"))
			{
				media += out11[i];
			}
			else if (entrada.startsWith("Dezembro/2011") || entrada.startsWith("dezembro/2011"))
			{
				media += dez11[i];
			}
		}
		
		for (int i = 0; i < 30; i++)
		{	
			if (entrada.startsWith("Abril/2011") || entrada.startsWith("abril/2011")) 
			{
				media += abr11[i];
			}
			else if (entrada.startsWith("Junho/2011") || entrada.startsWith("junho/2011"))
			{
				media += jun11[i];
			}
			else if (entrada.startsWith("Setembro/2011") || entrada.startsWith("setembro/2011"))
			{
				media += set11[i];
			}
			else if (entrada.startsWith("Novembro/2011") || entrada.startsWith("novembro/2011"))
			{
				media += nov11[i];
			}
			
		}
		
		// ANO 2012
				for (int i = 0; i < 31; i++)
				{	
					
					if (entrada.startsWith("Janeiro/2012") || entrada.startsWith("janeiro/2012")) 
					{
						media += jan12[i];
					}
					else if (entrada.startsWith("Março/2012") || entrada.startsWith("março/2012"))
					{
						media += mar12[i];
					}
					else if (entrada.startsWith("Maio/2012") || entrada.startsWith("maio/2012"))
					{
						media += mai12[i];
					}
					else if (entrada.startsWith("Julho/2012") || entrada.startsWith("julho/2012"))
					{
						media += jul12[i];
					}
					else if (entrada.startsWith("Agosto/2012") || entrada.startsWith("agosto/2012"))
					{
						media += ago12[i];
					}
					else if (entrada.startsWith("Outubro/2012") || entrada.startsWith("outubro/2012"))
					{
						media += out12[i];
					}
					else if (entrada.startsWith("Dezembro/2012") || entrada.startsWith("dezembro/2012"))
					{
						media += dez12[i];
					}
				}
				
				for (int i = 0; i < 30; i++)
				{	
					if (entrada.startsWith("Abril/2012") || entrada.startsWith("abril/2012")) 
					{
						media += abr12[i];
					}
					else if (entrada.startsWith("Junho/2012") || entrada.startsWith("junho/2012"))
					{
						media += jun12[i];
					}
					else if (entrada.startsWith("Setembro/2012") || entrada.startsWith("setembro/2012"))
					{
						media += set12[i];
					}
					else if (entrada.startsWith("Novembro/2012") || entrada.startsWith("novembro/2012"))
					{
						media += nov12[i];
					}
					
				}
				
				// ANO 2013
				for (int i = 0; i < 31; i++)
				{	
					
					if (entrada.startsWith("Janeiro/2013") || entrada.startsWith("janeiro/2013")) 
					{
						media += jan13[i];
					}
					else if (entrada.startsWith("Março/2013") || entrada.startsWith("março/2013"))
					{
						media += mar13[i];
					}
					else if (entrada.startsWith("Maio/2013") || entrada.startsWith("maio/2013"))
					{
						media += mai13[i];
					}
					else if (entrada.startsWith("Julho/2013") || entrada.startsWith("julho/2013"))
					{
						media += jul13[i];
					}
					else if (entrada.startsWith("Agosto/2013") || entrada.startsWith("agosto/2013"))
					{
						media += ago13[i];
					}
					else if (entrada.startsWith("Outubro/2013") || entrada.startsWith("outubro/2013"))
					{
						media += out13[i];
					}
					else if (entrada.startsWith("Dezembro/2013") || entrada.startsWith("dezembro/2013"))
					{
						media += dez13[i];
					}
				}
				
				for (int i = 0; i < 30; i++)
				{	
					if (entrada.startsWith("Abril/2013") || entrada.startsWith("abril/2013")) 
					{
						media += abr13[i];
					}
					else if (entrada.startsWith("Junho/2013") || entrada.startsWith("junho/2013"))
					{
						media += jun13[i];
					}
					else if (entrada.startsWith("Setembro/2013") || entrada.startsWith("setembro/2013"))
					{
						media += set13[i];
					}
					else if (entrada.startsWith("Novembro/2013") || entrada.startsWith("novembro/2013"))
					{
						media += nov13[i];
					}
					
				}
				
				// ANO 2014
				for (int i = 0; i < 31; i++)
				{	
					
					if (entrada.startsWith("Janeiro/2014") || entrada.startsWith("janeiro/2014")) 
					{
						media += jan14[i];
					}
					else if (entrada.startsWith("Março/2014") || entrada.startsWith("março/2014"))
					{
						media += mar14[i];
					}
					else if (entrada.startsWith("Maio/2014") || entrada.startsWith("maio/2014"))
					{
						media += mai14[i];
					}
					else if (entrada.startsWith("Julho/2014") || entrada.startsWith("julho/2014"))
					{
						media += jul14[i];
					}
					else if (entrada.startsWith("Agosto/2014") || entrada.startsWith("agosto/2014"))
					{
						media += ago14[i];
					}
					else if (entrada.startsWith("Outubro/2014") || entrada.startsWith("outubro/2014"))
					{
						media += out14[i];
					}
					else if (entrada.startsWith("Dezembro/2014") || entrada.startsWith("dezembro/2014"))
					{
						media += dez14[i];
					}
				}
				
				for (int i = 0; i < 30; i++)
				{	
					if (entrada.startsWith("Abril/2014") || entrada.startsWith("abril/2014")) 
					{
						media += abr14[i];
					}
					else if (entrada.startsWith("Junho/2014") || entrada.startsWith("junho/2014"))
					{
						media += jun14[i];
					}
					else if (entrada.startsWith("Setembro/2014") || entrada.startsWith("setembro/2014"))
					{
						media += set14[i];
					}
					else if (entrada.startsWith("Novembro/2014") || entrada.startsWith("novembro/2014"))
					{
						media += nov14[i];
					}
					
				}
				
				// ANO 2015
				for (int i = 0; i < 31; i++)
				{	
					
					if (entrada.startsWith("Janeiro/2015") || entrada.startsWith("janeiro/2015")) 
					{
						media += jan15[i];
					}
					else if (entrada.startsWith("Março/2015") || entrada.startsWith("março/2015"))
					{
						media += mar15[i];
					}
					else if (entrada.startsWith("Maio/2015") || entrada.startsWith("maio/2015"))
					{
						media += mai15[i];
					}
					else if (entrada.startsWith("Julho/2015") || entrada.startsWith("julho/2015"))
					{
						media += jul15[i];
					}
					else if (entrada.startsWith("Agosto/2015") || entrada.startsWith("agosto/2015"))
					{
						media += ago15[i];
					}
					else if (entrada.startsWith("Outubro/2015") || entrada.startsWith("outubro/2015"))
					{
						media += out15[i];
					}
					else if (entrada.startsWith("Dezembro/2015") || entrada.startsWith("dezembro/2015"))
					{
						media += dez15[i];
					}
				}
				
				for (int i = 0; i < 30; i++)
				{	
					if (entrada.startsWith("Abril/2015") || entrada.startsWith("abril/2015")) 
					{
						media += abr15[i];
					}
					else if (entrada.startsWith("Junho/2015") || entrada.startsWith("junho/2015"))
					{
						media += jun15[i];
					}
					else if (entrada.startsWith("Setembro/2015") || entrada.startsWith("setembro/2015"))
					{
						media += set15[i];
					}
					else if (entrada.startsWith("Novembro/2015") || entrada.startsWith("novembro/2015"))
					{
						media += nov15[i];
					}
					
				}
				
				// ANO 2016
				for (int i = 0; i < 31; i++)
				{	
					
					if (entrada.startsWith("Janeiro/2016") || entrada.startsWith("janeiro/2016")) 
					{
						media += jan16[i];
					}
					else if (entrada.startsWith("Março/2016") || entrada.startsWith("março/2016"))
					{
						media += mar16[i];
					}
					else if (entrada.startsWith("Maio/2016") || entrada.startsWith("maio/2016"))
					{
						media += mai16[i];
					}
					else if (entrada.startsWith("Julho/2016") || entrada.startsWith("julho/2016"))
					{
						media += jul16[i];
					}
					else if (entrada.startsWith("Agosto/2016") || entrada.startsWith("agosto/2016"))
					{
						media += ago16[i];
					}
					else if (entrada.startsWith("Outubro/2016") || entrada.startsWith("outubro/2016"))
					{
						media += out16[i];
					}
					else if (entrada.startsWith("Dezembro/2016") || entrada.startsWith("dezembro/2016"))
					{
						media += dez16[i];
					}
				}
				
				for (int i = 0; i < 30; i++)
				{	
					if (entrada.startsWith("Abril/2016") || entrada.startsWith("abril/2016")) 
					{
						media += abr16[i];
					}
					else if (entrada.startsWith("Junho/2016") || entrada.startsWith("junho/2016"))
					{
						media += jun16[i];
					}
					else if (entrada.startsWith("Setembro/2016") || entrada.startsWith("setembro/2016"))
					{
						media += set16[i];
					}
					else if (entrada.startsWith("Novembro/2016") || entrada.startsWith("novembro/2016"))
					{
						media += nov16[i];
					}
					
				}
				
				// ANO 2017
				for (int i = 0; i < 31; i++)
				{	
					
					if (entrada.startsWith("Janeiro/2017") || entrada.startsWith("janeiro/2017")) 
					{
						media += jan17[i];
					}
					else if (entrada.startsWith("Março/2017") || entrada.startsWith("março/2017"))
					{
						media += mar17[i];
					}
					else if (entrada.startsWith("Maio/2017") || entrada.startsWith("maio/2017"))
					{
						media += mai17[i];
					}
					else if (entrada.startsWith("Julho/2017") || entrada.startsWith("julho/2017"))
					{
						media += jul17[i];
					}
					else if (entrada.startsWith("Agosto/2017") || entrada.startsWith("agosto/2017"))
					{
						media += ago17[i];
					}
					else if (entrada.startsWith("Outubro/2017") || entrada.startsWith("outubro/2017"))
					{
						media += out17[i];
					}
					else if (entrada.startsWith("Dezembro/2017") || entrada.startsWith("dezembro/2017"))
					{
						media += dez17[i];
					}
				}
				
				for (int i = 0; i < 30; i++)
				{	
					if (entrada.startsWith("Abril/2017") || entrada.startsWith("abril/2017")) 
					{
						media += abr17[i];
					}
					else if (entrada.startsWith("Junho/2017") || entrada.startsWith("junho/2017"))
					{
						media += jun17[i];
					}
					else if (entrada.startsWith("Setembro/2017") || entrada.startsWith("setembro/2017"))
					{
						media += set17[i];
					}
					else if (entrada.startsWith("Novembro/2017") || entrada.startsWith("novembro/2017"))
					{
						media += nov17[i];
					}
					
				}
				
				// ANO 2018
				for (int i = 0; i < 31; i++)
				{	
					
					if (entrada.startsWith("Janeiro/2018") || entrada.startsWith("janeiro/2018")) 
					{
						media += jan18[i];
					}
					else if (entrada.startsWith("Março/2018") || entrada.startsWith("março/2018"))
					{
						media += mar18[i];
					}
					else if (entrada.startsWith("Maio/2018") || entrada.startsWith("maio/2018"))
					{
						media += mai18[i];
					}
					else if (entrada.startsWith("Julho/2018") || entrada.startsWith("julho/2018"))
					{
						media += jul18[i];
					}
					else if (entrada.startsWith("Agosto/2018") || entrada.startsWith("agosto/2018"))
					{
						media += ago18[i];
					}
					else if (entrada.startsWith("Outubro/2018") || entrada.startsWith("outubro/2018"))
					{
						media += out18[i];
					}
					else if (entrada.startsWith("Dezembro/2018") || entrada.startsWith("dezembro/2018"))
					{
						media += dez18[i];
					}
				}
				
				for (int i = 0; i < 30; i++)
				{	
					if (entrada.startsWith("Abril/2018") || entrada.startsWith("abril/2018")) 
					{
						media += abr18[i];
					}
					else if (entrada.startsWith("Junho/2018") || entrada.startsWith("junho/2018"))
					{
						media += jun18[i];
					}
					else if (entrada.startsWith("Setembro/2018") || entrada.startsWith("setembro/2018"))
					{
						media += set18[i];
					}
					else if (entrada.startsWith("Novembro/2018") || entrada.startsWith("novembro/2018"))
					{
						media += nov18[i];
					}
					
				}
				
				// ANO 2019
				for (int i = 0; i < 31; i++)
				{	
					
					if (entrada.startsWith("Janeiro/2019") || entrada.startsWith("janeiro/2019")) 
					{
						media += jan19[i];
					}
					else if (entrada.startsWith("Março/2019") || entrada.startsWith("março/2019"))
					{
						media += mar19[i];
					}
					else if (entrada.startsWith("Maio/2019") || entrada.startsWith("maio/2019"))
					{
						media += mai19[i];
					}
					else if (entrada.startsWith("Julho/2019") || entrada.startsWith("julho/2019"))
					{
						media += jul19[i];
					}
					else if (entrada.startsWith("Agosto/2019") || entrada.startsWith("agosto/2019"))
					{
						media += ago19[i];
					}
					else if (entrada.startsWith("Outubro/2019") || entrada.startsWith("outubro/2019"))
					{
						media += out19[i];
					}
					else if (entrada.startsWith("Dezembro/2019") || entrada.startsWith("dezembro/2019"))
					{
						media += dez19[i];
					}
				}
				
				for (int i = 0; i < 30; i++)
				{	
					if (entrada.startsWith("Abril/2019") || entrada.startsWith("abril/2019")) 
					{
						media += abr19[i];
					}
					else if (entrada.startsWith("Junho/2019") || entrada.startsWith("junho/2019"))
					{
						media += jun19[i];
					}
					else if (entrada.startsWith("Setembro/2019") || entrada.startsWith("setembro/2019"))
					{
						media += set19[i];
					}
					else if (entrada.startsWith("Novembro/2019") || entrada.startsWith("novembro/2019"))
					{
						media += nov19[i];
					}
					
				}
				
				// ANO 2020
				for (int i = 0; i < 31; i++)
				{	
					
					if (entrada.startsWith("Janeiro/2020") || entrada.startsWith("janeiro/2020")) 
					{
						media += jan20[i];
					}
					else if (entrada.startsWith("Março/2020") || entrada.startsWith("março/2020"))
					{
						media += mar20[i];
					}
					else if (entrada.startsWith("Maio/2020") || entrada.startsWith("maio/2020"))
					{
						media += mai20[i];
					}
					else if (entrada.startsWith("Julho/2020") || entrada.startsWith("julho/2020"))
					{
						media += jul20[i];
					}
					else if (entrada.startsWith("Agosto/2020") || entrada.startsWith("agosto/2020"))
					{
						media += ago20[i];
					}
					else if (entrada.startsWith("Outubro/2020") || entrada.startsWith("outubro/2020"))
					{
						media += out20[i];
					}
					else if (entrada.startsWith("Dezembro/2020") || entrada.startsWith("dezembro/2020"))
					{
						media += dez20[i];
					}
				}
				
				for (int i = 0; i < 30; i++)
				{	
					if (entrada.startsWith("Abril/2020") || entrada.startsWith("abril/2020")) 
					{
						media += abr20[i];
					}
					else if (entrada.startsWith("Junho/2020") || entrada.startsWith("junho/2020"))
					{
						media += jun20[i];
					}
					else if (entrada.startsWith("Setembro/2020") || entrada.startsWith("setembro/2020"))
					{
						media += set20[i];
					}
					else if (entrada.startsWith("Novembro/2020") || entrada.startsWith("novembro/2020"))
					{
						media += nov20[i];
					}
					
				}
		
		
		
		
		
		if (entrada.startsWith("Janeiro") || entrada.startsWith("janeiro") ||
				entrada.startsWith("Março") || entrada.startsWith("março") ||
				entrada.startsWith("Maio") || entrada.startsWith("maio") ||
				entrada.startsWith("Julho") || entrada.startsWith("julho") ||
				entrada.startsWith("Agosto") || entrada.startsWith("agosto") ||
				entrada.startsWith("Outubro") || entrada.startsWith("outubro") ||
				entrada.startsWith("Dezembro") || entrada.startsWith("dezembro"))
		{
			media = media/31;
		} else if (entrada.startsWith("Abril") || entrada.startsWith("abril") ||
				entrada.startsWith("Junho") || entrada.startsWith("junho") ||
				entrada.startsWith("Setembro") || entrada.startsWith("setembro") ||
				entrada.startsWith("Novembro") || entrada.startsWith("novembro"))
		{
			media = media/30;
		}
		
		
		System.out.println("Temperatura média: " + media + "ºC");
	}
	
	static void temperaturaMinima(String entrada) {
		int menor = 0;
		
		// Verifica a menor temperatura registrada
		
		//2011
		for (int i = 0; i < 31; i++)
		{	
			if (entrada.startsWith("Janeiro/2011") || entrada.startsWith("janeiro/2011")) 
			{
				if (i == 0)
				{
					menor = jan11[i];
				}
				if (jan11[i] < menor)
				{
					menor = jan11[i];
				}
				
			}
			else if (entrada.startsWith("Março/2011") || entrada.startsWith("março/2011"))
			{
				if (i == 0)
				{
					menor = mar11[i];
				}
				if (mar11[i] < menor)
				{
					menor = mar11[i];
				}
			}
			else if (entrada.startsWith("Maio/2011") || entrada.startsWith("maio/2011"))
			{
				if (i == 0)
				{
					menor = mai11[i];
				}
				if (mai11[i] < menor)
				{
					menor = mai11[i];
				}
			}
			else if (entrada.startsWith("Julho/2011") || entrada.startsWith("julho/2011"))
			{
				if (i == 0)
				{
					menor = jul11[i];
				}
				if (jul11[i] < menor)
				{
					menor = jul11[i];
				}
			}
			else if (entrada.startsWith("Agosto/2011") || entrada.startsWith("agosto/2011"))
			{
				if (i == 0)
				{
					menor = ago11[i];
				}
				if (ago11[i] < menor)
				{
					menor = ago11[i];
				}
			}
			else if (entrada.startsWith("Outubro/2011") || entrada.startsWith("outubro/2011"))
			{
				if (i == 0)
				{
					menor = out11[i];
				}
				if (out11[i] < menor)
				{
					menor = out11[i];
				}
			}
			else if (entrada.startsWith("Dezembro/2011") || entrada.startsWith("dezembro/2011"))
			{
				if (i == 0)
				{
					menor = dez11[i];
				}
				if (dez11[i] < menor)
				{
					menor = dez11[i];
				}
			}
		}
		
		
		// Retorna os dias com menor temperatura
		for (int i = 0; i < 31; i++)
		{	
			// ANO 2011
			if (entrada.startsWith("Janeiro/2011") || entrada.startsWith("janeiro/2011")) 
			{
				if (jan11[i] == menor)
				{
					System.out.println((i+1) + "/Janeiro/2011");
				}
				
			}
			else if (entrada.startsWith("Março/2011") || entrada.startsWith("março/2011"))
			{
				if (mar11[i] == menor)
				{
					System.out.println((i+1) + "/Março/2011");
				}
			}
			else if (entrada.startsWith("Maio/2011") || entrada.startsWith("maio/2011"))
			{
				if (mai11[i] == menor)
				{
					System.out.println((i+1) + "/Maio/2011");
				}
			}
			else if (entrada.startsWith("Julho/2011") || entrada.startsWith("julho/2011"))
			{
				if (jul11[i] == menor)
				{
					System.out.println((i+1) + "/Julho/2011");
				}
			}
			else if (entrada.startsWith("Agosto/2011") || entrada.startsWith("agosto/2011"))
			{
				if (ago11[i] == menor)
				{
					System.out.println((i+1) + "/Agosto/2011");
				}
			}
			else if (entrada.startsWith("Outubro/2011") || entrada.startsWith("outubro/2011"))
			{
				if (out11[i] == menor)
				{
					System.out.println((i+1) + "/Outubro/2011");
				}
			}
			else if (entrada.startsWith("Dezembro/2011") || entrada.startsWith("dezembro/2011"))
			{
				if (dez11[i] == menor)
				{
					System.out.println((i+1) + "/Dezembro/2011");
				}
			}
		}
		
		
		// Verifica a menor temperatura registrada
		for (int i = 0; i < 30; i++)
		{	
			// ANO 2011
			if (entrada.startsWith("Abril/2011") || entrada.startsWith("abril/2011")) 
			{
				if (i == 0)
				{
					menor = abr11[i];
				}
				if (abr11[i] < menor)
				{
					menor = abr11[i];
				}
				
			}
			else if (entrada.startsWith("Junho/2011") || entrada.startsWith("junho/2011"))
			{
				if (i == 0)
				{
					menor = jun11[i];
				}
				if (jun11[i] < menor)
				{
					menor = jun11[i];
				}
			}
			else if (entrada.startsWith("Setembro/2011") || entrada.startsWith("setembro/2011"))
			{
				if (i == 0)
				{
					menor = set11[i];
				}
				if (set11[i] < menor)
				{
					menor = set11[i];
				}
			}
			else if (entrada.startsWith("Novembro/2011") || entrada.startsWith("novembro/2011"))
			{
				if (i == 0)
				{
					menor = nov11[i];
				}
				if (nov11[i] < menor)
				{
					menor = nov11[i];
				}
			}
			
		}
		
		
		// Retorna os dias com menor temperatura
		for (int i = 0; i < 30; i++)
		{	
			// ANO 2011
			if (entrada.startsWith("Abril/2011") || entrada.startsWith("abril/2011")) 
			{
				if (abr11[i] == menor)
				{
					System.out.println((i+1) + "/Abril/2011");
				}
				
			}
			else if (entrada.startsWith("Junho/2011") || entrada.startsWith("junho/2011"))
			{
				if (jun11[i] == menor)
				{
					System.out.println((i+1) + "/Junho/2011");
				}
			}
			else if (entrada.startsWith("Setembro/2011") || entrada.startsWith("setembro/2011"))
			{
				if (set11[i] == menor)
				{
					System.out.println((i+1) + "/Setembro/2011");
				}
			}
			else if (entrada.startsWith("Novembro/2011") || entrada.startsWith("novembro/2011"))
			{
				if (nov11[i] == menor)
				{
					System.out.println((i+1) + "/Novembro/2011");
				}
			}
		}
		
		
		
		
		//2020
		for (int i = 0; i < 31; i++)
		{	
			if (entrada.startsWith("Janeiro/2020") || entrada.startsWith("janeiro/2020")) 
			{
				if (i == 0)
				{
					menor = jan20[i];
				}
				if (jan20[i] < menor)
				{
					menor = jan20[i];
				}
				
			}
			else if (entrada.startsWith("Março/2020") || entrada.startsWith("março//2020"))
			{
				if (i == 0)
				{
					menor = mar20[i];
				}
				if (mar11[i] < menor)
				{
					menor = mar20[i];
				}
			}
			else if (entrada.startsWith("Maio/2011") || entrada.startsWith("maio/2011"))
			{
				if (i == 0)
				{
					menor = mai20[i];
				}
				if (mai20[i] < menor)
				{
					menor = mai20[i];
				}
			}
			else if (entrada.startsWith("Julho/2020") || entrada.startsWith("julho/2020"))
			{
				if (i == 0)
				{
					menor = jul20[i];
				}
				if (jul20[i] < menor)
				{
					menor = jul20[i];
				}
			}
			else if (entrada.startsWith("Agosto/2020") || entrada.startsWith("agosto/2020"))
			{
				if (i == 0)
				{
					menor = ago20[i];
				}
				if (ago20[i] < menor)
				{
					menor = ago20[i];
				}
			}
			else if (entrada.startsWith("Outubro/2020") || entrada.startsWith("outubro/2020"))
			{
				if (i == 0)
				{
					menor = out20[i];
				}
				if (out20[i] < menor)
				{
					menor = out20[i];
				}
			}
			else if (entrada.startsWith("Dezembro/2020") || entrada.startsWith("dezembro/2020"))
			{
				if (i == 0)
				{
					menor = dez20[i];
				}
				if (dez20[i] < menor)
				{
					menor = dez20[i];
				}
			}
		}
		
		
		// Retorna os dias com menor temperatura
		for (int i = 0; i < 31; i++)
		{	
			// ANO 2011
			if (entrada.startsWith("Janeiro/2020") || entrada.startsWith("janeiro/2020")) 
			{
				if (jan20[i] == menor)
				{
					System.out.println((i+1) + "/Janeiro/2020");
				}
				
			}
			else if (entrada.startsWith("Março/2020") || entrada.startsWith("março/2020"))
			{
				if (mar20[i] == menor)
				{
					System.out.println((i+1) + "/Março/2020");
				}
			}
			else if (entrada.startsWith("Maio/2020") || entrada.startsWith("maio/2020"))
			{
				if (mai20[i] == menor)
				{
					System.out.println((i+1) + "/Maio/2020");
				}
			}
			else if (entrada.startsWith("Julho/2020") || entrada.startsWith("julho/2020"))
			{
				if (jul20[i] == menor)
				{
					System.out.println((i+1) + "/Julho/2020");
				}
			}
			else if (entrada.startsWith("Agosto/2020") || entrada.startsWith("agosto/2020"))
			{
				if (ago20[i] == menor)
				{
					System.out.println((i+1) + "/Agosto/2020");
				}
			}
			else if (entrada.startsWith("Outubro/2020") || entrada.startsWith("outubro/2020"))
			{
				if (out20[i] == menor)
				{
					System.out.println((i+1) + "/Outubro/2020");
				}
			}
			else if (entrada.startsWith("Dezembro/2020") || entrada.startsWith("dezembro/2020"))
			{
				if (dez20[i] == menor)
				{
					System.out.println((i+1) + "/Dezembro/2020");
				}
			}
		}
		
		
		// Verifica a menor temperatura registrada
		for (int i = 0; i < 30; i++)
		{	
			// ANO 2011
			if (entrada.startsWith("Abril/2020") || entrada.startsWith("abril/2020")) 
			{
				if (i == 0)
				{
					menor = abr20[i];
				}
				if (abr20[i] < menor)
				{
					menor = abr20[i];
				}
				
			}
			else if (entrada.startsWith("Junho/2020") || entrada.startsWith("junho/2020"))
			{
				if (i == 0)
				{
					menor = jun20[i];
				}
				if (jun20[i] < menor)
				{
					menor = jun20[i];
				}
			}
			else if (entrada.startsWith("Setembro/2020") || entrada.startsWith("setembro/2020"))
			{
				if (i == 0)
				{
					menor = set20[i];
				}
				if (set20[i] < menor)
				{
					menor = set20[i];
				}
			}
			else if (entrada.startsWith("Novembro/2020") || entrada.startsWith("novembro/2020"))
			{
				if (i == 0)
				{
					menor = nov11[i];
				}
				if (nov11[i] < menor)
				{
					menor = nov11[i];
				}
			}
			
		}
		
		
		// Retorna os dias com menor temperatura
		for (int i = 0; i < 30; i++)
		{	
			// ANO 2011
			if (entrada.startsWith("Abril/2011") || entrada.startsWith("abril/2011")) 
			{
				if (abr11[i] == menor)
				{
					System.out.println((i+1) + "/Abril/2020");
				}
				
			}
			else if (entrada.startsWith("Junho/2020") || entrada.startsWith("junho/2020"))
			{
				if (jun20[i] == menor)
				{
					System.out.println((i+1) + "/Junho/2020");
				}
			}
			else if (entrada.startsWith("Setembro/2020") || entrada.startsWith("setembro/2020"))
			{
				if (set20[i] == menor)
				{
					System.out.println((i+1) + "/Setembro/2020");
				}
			}
			else if (entrada.startsWith("Novembro/2020") || entrada.startsWith("novembro/2020"))
			{
				if (nov20[i] == menor)
				{
					System.out.println((i+1) + "/Novembro/2020");
				}
			}
		}
		
		
		
		System.out.println("   Mínima: " + menor + "ºC");
	}
	
	
	static void temperaturaDia(String entrada) {
		
		System.out.println("Média de temperatura a cada dia:");
		
		//2011
		if (entrada.equals("Janeiro/2011") || entrada.equals("janeiro/2011") ||
				entrada.equals("Março/2011") || entrada.equals("março/2011") ||
				entrada.equals("Maio/2011") || entrada.equals("maio/2011") ||
				entrada.equals("Julho/2011") || entrada.equals("julho/2011") ||
				entrada.equals("Agosto/2011") || entrada.equals("agosto/2011") ||
				entrada.equals("Outubro/2011") || entrada.equals("outubro/2011") ||
				entrada.equals("Dezembro/2011") || entrada.equals("dezembro/2011"))
		{
			for (int i = 0; i < 31; i++)
			{	
				// ANO 2011
				if (entrada.startsWith("Janeiro/2011") || entrada.startsWith("janeiro/2011")) 
				{
					System.out.print(jan11[i] + "ºC ");
				}
				else if (entrada.startsWith("Março/2011") || entrada.startsWith("março/2011"))
				{
					System.out.print(mar11[i] + "ºC ");
				}
				else if (entrada.startsWith("Maio/2011") || entrada.startsWith("maio/2011"))
				{
					System.out.print(mai11[i] + "ºC ");
				}
				else if (entrada.startsWith("Julho/2011") || entrada.startsWith("julho/2011"))
				{
					System.out.print(jul11[i] + "ºC ");
				}
				else if (entrada.startsWith("Agosto/2011") || entrada.startsWith("agosto/2011"))
				{
					System.out.print(ago11[i] + "ºC ");
				}
				else if (entrada.startsWith("Outubro/2011") || entrada.startsWith("outubro/2011"))
				{
					System.out.print(out11[i] + "ºC ");
				}
				else if (entrada.startsWith("Dezembro/2011") || entrada.startsWith("dezembro/2011"))
				{
					System.out.print(dez11[i] + "ºC ");
				}
			}
			System.out.println(" ");
		} else if (entrada.equals("Abril/2011") || entrada.equals("abril/2011") ||
				entrada.equals("Junho/2011") || entrada.equals("junho/2011") ||
				entrada.equals("Setembro/2011") || entrada.equals("setembro/2011") ||
				entrada.equals("Novembro/2011") || entrada.equals("novembro/2011"))
		{
			for (int i = 0; i < 30; i++)
			{	
				// ANO 2011
				if (entrada.startsWith("Abril/2011") || entrada.startsWith("abril/2011")) 
				{
					System.out.print(abr11[i] + "ºC ");
				}
				else if (entrada.startsWith("Junho/2011") || entrada.startsWith("junho/2011"))
				{
					System.out.print(jun11[i] + "ºC ");
				}
				else if (entrada.startsWith("Setembro/2011") || entrada.startsWith("setembro/2011"))
				{
					System.out.print(set11[i] + "ºC ");
				}
				else if (entrada.startsWith("Novembro/2011") || entrada.startsWith("novembro/2011"))
				{
					System.out.print(nov11[i] + "ºC ");
				}
			}
			System.out.println(" ");
		}	
		
		
		//2020
				if (entrada.equals("Janeiro/2020") || entrada.equals("janeiro/2020") ||
						entrada.equals("Março/2020") || entrada.equals("março/2020") ||
						entrada.equals("Maio/2020") || entrada.equals("maio/2020") ||
						entrada.equals("Julho/2020") || entrada.equals("julho/2020") ||
						entrada.equals("Agosto/2020") || entrada.equals("agosto/2020") ||
						entrada.equals("Outubro/2020") || entrada.equals("outubro/2020") ||
						entrada.equals("Dezembro/2020") || entrada.equals("dezembro/2020"))
				{
					for (int i = 0; i < 31; i++)
					{	
						if (entrada.startsWith("Janeiro") || entrada.startsWith("janeiro")) 
						{
							System.out.print(jan20[i] + "ºC ");
						}
						else if (entrada.startsWith("Março") || entrada.startsWith("março"))
						{
							System.out.print(mar20[i] + "ºC ");
						}
						else if (entrada.startsWith("Maio") || entrada.startsWith("maio"))
						{
							System.out.print(mai20[i] + "ºC ");
						}
						else if (entrada.startsWith("Julho") || entrada.startsWith("julho"))
						{
							System.out.print(jul20[i] + "ºC ");
						}
						else if (entrada.startsWith("Agosto") || entrada.startsWith("agosto"))
						{
							System.out.print(ago20[i] + "ºC ");
						}
						else if (entrada.startsWith("Outubro") || entrada.startsWith("outubro"))
						{
							System.out.print(out20[i] + "ºC ");
						}
						else if (entrada.startsWith("Dezembro") || entrada.startsWith("dezembro"))
						{
							System.out.print(dez20[i] + "ºC ");
						}
					}
					System.out.println(" ");
				} else if (entrada.equals("Abril/2020") || entrada.equals("abril/2020") ||
						entrada.equals("Junho/2020") || entrada.equals("junho/2020") ||
						entrada.equals("Setembro/2020") || entrada.equals("setembro/2020") ||
						entrada.equals("Novembro/2020") || entrada.equals("novembro/2020"))
				{
					for (int i = 0; i < 30; i++)
					{	
						// ANO 2011
						if (entrada.startsWith("Abril") || entrada.startsWith("abril")) 
						{
							System.out.print(abr20[i] + "ºC ");
						}
						else if (entrada.startsWith("Junho/2011") || entrada.startsWith("junho"))
						{
							System.out.print(jun20[i] + "ºC ");
						}
						else if (entrada.startsWith("Setembro") || entrada.startsWith("setembro"))
						{
							System.out.print(set20[i] + "ºC ");
						}
						else if (entrada.startsWith("Novembro") || entrada.startsWith("novembro"))
						{
							System.out.print(nov20[i] + "ºC ");
						}
					}
					System.out.println(" ");
				}
		
		
		
	}
	
	
	static void temperaturaMaxima(String entrada) {
		int maior = 0;
		
		// Verifica a menor temperatura registrada
		for (int i = 0; i < 31; i++)
		{	
			// ANO 2011
			if (entrada.startsWith("Janeiro/2011") || entrada.startsWith("janeiro/2011")) 
			{
				if (i == 0)
				{
					maior = jan11[i];
				}
				if (jan11[i] > maior)
				{
					maior = jan11[i];
				}
				
			}
			else if (entrada.startsWith("Março/2011") || entrada.startsWith("março/2011"))
			{
				if (i == 0)
				{
					maior = mar11[i];
				}
				if (mar11[i] > maior)
				{
					maior = mar11[i];
				}
			}
			else if (entrada.startsWith("Maio/2011") || entrada.startsWith("maio/2011"))
			{
				if (i == 0)
				{
					maior = mai11[i];
				}
				if (mai11[i] > maior)
				{
					maior = mai11[i];
				}
			}
			else if (entrada.startsWith("Julho/2011") || entrada.startsWith("julho/2011"))
			{
				if (i == 0)
				{
					maior = jul11[i];
				}
				if (jul11[i] > maior)
				{
					maior = jul11[i];
				}
			}
			else if (entrada.startsWith("Agosto/2011") || entrada.startsWith("agosto/2011"))
			{
				if (i == 0)
				{
					maior = ago11[i];
				}
				if (ago11[i] > maior)
				{
					maior = ago11[i];
				}
			}
			else if (entrada.startsWith("Outubro/2011") || entrada.startsWith("outubro/2011"))
			{
				if (i == 0)
				{
					maior = out11[i];
				}
				if (out11[i] > maior)
				{
					maior = out11[i];
				}
			}
			else if (entrada.startsWith("Dezembro/2011") || entrada.startsWith("dezembro/2011"))
			{
				if (i == 0)
				{
					maior = dez11[i];
				}
				if (dez11[i] > maior)
				{
					maior = dez11[i];
				}
			}
		}
		
		
		// Retorna os dias com menor temperatura
		for (int i = 0; i < 31; i++)
		{	
			// ANO 2011
			if (entrada.startsWith("Janeiro/2011") || entrada.startsWith("janeiro/2011")) 
			{
				if (jan11[i] == maior)
				{
					System.out.println((i+1) + "/Janeiro/2011");
				}
				
			}
			else if (entrada.startsWith("Março/2011") || entrada.startsWith("março/2011"))
			{
				if (mar11[i] == maior)
				{
					System.out.println((i+1) + "/Março/2011");
				}
			}
			else if (entrada.startsWith("Maio/2011") || entrada.startsWith("maio/2011"))
			{
				if (mai11[i] == maior)
				{
					System.out.println((i+1) + "/Maio/2011");
				}
			}
			else if (entrada.startsWith("Julho/2011") || entrada.startsWith("julho/2011"))
			{
				if (jul11[i] == maior)
				{
					System.out.println((i+1) + "/Julho/2011");
				}
			}
			else if (entrada.startsWith("Agosto/2011") || entrada.startsWith("agosto/2011"))
			{
				if (ago11[i] == maior)
				{
					System.out.println((i+1) + "/Agosto/2011");
				}
			}
			else if (entrada.startsWith("Outubro/2011") || entrada.startsWith("outubro/2011"))
			{
				if (out11[i] == maior)
				{
					System.out.println((i+1) + "/Outubro/2011");
				}
			}
			else if (entrada.startsWith("Dezembro/2011") || entrada.startsWith("dezembro/2011"))
			{
				if (dez11[i] == maior)
				{
					System.out.println((i+1) + "/Dezembro/2011");
				}
			}
		}
		
		
		// Verifica a menor temperatura registrada
		for (int i = 0; i < 30; i++)
		{	
			// ANO 2011
			if (entrada.startsWith("Abril/2011") || entrada.startsWith("abril/2011")) 
			{
				if (i == 0)
				{
					maior = abr11[i];
				}
				if (abr11[i] > maior)
				{
					maior = abr11[i];
				}
				
			}
			else if (entrada.startsWith("Junho/2011") || entrada.startsWith("junho/2011"))
			{
				if (i == 0)
				{
					maior = jun11[i];
				}
				if (jun11[i] > maior)
				{
					maior = jun11[i];
				}
			}
			else if (entrada.startsWith("Setembro/2011") || entrada.startsWith("setembro/2011"))
			{
				if (i == 0)
				{
					maior = set11[i];
				}
				if (set11[i] > maior)
				{
					maior = set11[i];
				}
			}
			else if (entrada.startsWith("Novembro/2011") || entrada.startsWith("novembro/2011"))
			{
				if (i == 0)
				{
					maior = nov11[i];
				}
				if (nov11[i] > maior)
				{
					maior = nov11[i];
				}
			}
			
		}
		
		
		// Retorna os dias com menor temperatura
		for (int i = 0; i < 31; i++)
		{	
			// ANO 2011
			if (entrada.startsWith("Abril/2011") || entrada.startsWith("abril/2011")) 
			{
				if (abr11[i] == maior)
				{
					System.out.println((i+1) + "/Abril/2011");
				}
				
			}
			else if (entrada.startsWith("Junho/2011") || entrada.startsWith("junho/2011"))
			{
				if (jun11[i] == maior)
				{
					System.out.println((i+1) + "/Junho/2011");
				}
			}
			else if (entrada.startsWith("Setembro/2011") || entrada.startsWith("setembro/2011"))
			{
				if (set11[i] == maior)
				{
					System.out.println((i+1) + "/Setembro/2011");
				}
			}
			else if (entrada.startsWith("Novembro/2011") || entrada.startsWith("novembro/2011"))
			{
				if (nov11[i] == maior)
				{
					System.out.println((i+1) + "/Novembro/2011");
				}
			}
		}
		
		
		
		//2020
		for (int i = 0; i < 31; i++)
		{	
			if (entrada.startsWith("Janeiro/2020") || entrada.startsWith("janeiro/2020")) 
			{
				if (i == 0)
				{
					maior = jan20[i];
				}
				if (jan20[i] > maior)
				{
					maior = jan20[i];
				}
				
			}
			else if (entrada.startsWith("Março/2020") || entrada.startsWith("março/2020"))
			{
				if (i == 0)
				{
					maior = mar20[i];
				}
				if (mar20[i] > maior)
				{
					maior = mar20[i];
				}
			}
			else if (entrada.startsWith("Maio/2020") || entrada.startsWith("maio/2020"))
			{
				if (i == 0)
				{
					maior = mai20[i];
				}
				if (mai20[i] > maior)
				{
					maior = mai20[i];
				}
			}
			else if (entrada.startsWith("Julho/2020") || entrada.startsWith("julho/2020"))
			{
				if (i == 0)
				{
					maior = jul20[i];
				}
				if (jul20[i] > maior)
				{
					maior = jul20[i];
				}
			}
			else if (entrada.startsWith("Agosto/2020") || entrada.startsWith("agosto/2020"))
			{
				if (i == 0)
				{
					maior = ago20[i];
				}
				if (ago20[i] > maior)
				{
					maior = ago20[i];
				}
			}
			else if (entrada.startsWith("Outubro/2020") || entrada.startsWith("outubro/2020"))
			{
				if (i == 0)
				{
					maior = out20[i];
				}
				if (out20[i] > maior)
				{
					maior = out20[i];
				}
			}
			else if (entrada.startsWith("Dezembro/2020") || entrada.startsWith("dezembro/2020"))
			{
				if (i == 0)
				{
					maior = dez20[i];
				}
				if (dez11[i] > maior)
				{
					maior = dez20[i];
				}
			}
		}
		
		
		// Retorna os dias com menor temperatura
		for (int i = 0; i < 31; i++)
		{	
			// ANO 2011
			if (entrada.startsWith("Janeiro/2020") || entrada.startsWith("janeiro/2020")) 
			{
				if (jan20[i] == maior)
				{
					System.out.println((i+1) + "/Janeiro/2020");
				}
				
			}
			else if (entrada.startsWith("Março/2020") || entrada.startsWith("março/2020"))
			{
				if (mar20[i] == maior)
				{
					System.out.println((i+1) + "/Março/2020");
				}
			}
			else if (entrada.startsWith("Maio/2020") || entrada.startsWith("maio/2020"))
			{
				if (mai20[i] == maior)
				{
					System.out.println((i+1) + "/Maio/2020");
				}
			}
			else if (entrada.startsWith("Julho/2020") || entrada.startsWith("julho/2020"))
			{
				if (jul20[i] == maior)
				{
					System.out.println((i+1) + "/Julho/2020");
				}
			}
			else if (entrada.startsWith("Agosto/2011") || entrada.startsWith("agosto/2011"))
			{
				if (ago20[i] == maior)
				{
					System.out.println((i+1) + "/Agosto/2020");
				}
			}
			else if (entrada.startsWith("Outubro/2011") || entrada.startsWith("outubro/2011"))
			{
				if (out20[i] == maior)
				{
					System.out.println((i+1) + "/Outubro/2020");
				}
			}
			else if (entrada.startsWith("Dezembro/2020") || entrada.startsWith("dezembro/2020"))
			{
				if (dez20[i] == maior)
				{
					System.out.println((i+1) + "/Dezembro/2020");
				}
			}
		}
		
		
		// Verifica a menor temperatura registrada
		for (int i = 0; i < 30; i++)
		{	
			if (entrada.startsWith("Abril/2020") || entrada.startsWith("abril/2020")) 
			{
				if (i == 0)
				{
					maior = abr20[i];
				}
				if (abr20[i] > maior)
				{
					maior = abr20[i];
				}
				
			}
			else if (entrada.startsWith("Junho/2020") || entrada.startsWith("junho/2020"))
			{
				if (i == 0)
				{
					maior = jun20[i];
				}
				if (jun20[i] > maior)
				{
					maior = jun20[i];
				}
			}
			else if (entrada.startsWith("Setembro/2020") || entrada.startsWith("setembro/2020"))
			{
				if (i == 0)
				{
					maior = set20[i];
				}
				if (set20[i] > maior)
				{
					maior = set20[i];
				}
			}
			else if (entrada.startsWith("Novembro/2020") || entrada.startsWith("novembro/2020"))
			{
				if (i == 0)
				{
					maior = nov20[i];
				}
				if (nov20[i] > maior)
				{
					maior = nov20[i];
				}
			}
			
		}
		
		
		// Retorna os dias com menor temperatura
		for (int i = 0; i < 31; i++)
		{	
			// ANO 2011
			if (entrada.startsWith("Abril/2020") || entrada.startsWith("abril/2020")) 
			{
				if (abr20[i] == maior)
				{
					System.out.println((i+1) + "/Abril/2020");
				}
				
			}
			else if (entrada.startsWith("Junho/2011") || entrada.startsWith("junho/2020"))
			{
				if (jun20[i] == maior)
				{
					System.out.println((i+1) + "/Junho/2020");
				}
			}
			else if (entrada.startsWith("Setembro/2020") || entrada.startsWith("setembro/2020"))
			{
				if (set20[i] == maior)
				{
					System.out.println((i+1) + "/Setembro/2020");
				}
			}
			else if (entrada.startsWith("Novembro/2020") || entrada.startsWith("novembro/2020"))
			{
				if (nov20[i] == maior)
				{
					System.out.println((i+1) + "/Novembro/2020");
				}
			}
		}
		
		
		
		System.out.println("   Máxima: " + maior + "ºC");
	}
	
	
}
