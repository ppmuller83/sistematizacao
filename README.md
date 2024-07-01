![image](https://github.com/ppmuller83/sistematizacao/assets/169911733/610366a6-ba0d-4773-9333-9052c20682a1)

# Programação Orientada a Objetos

> 👨‍🎓 Aluno: Pedro Polenz Muller;
RA: 72401544;
Turma B - 0424 - Virtual;

### :movie_camera: Links para o vídeo de apresentação:
[https://youtu.be/Y-bejBm9cos](https://www.youtube.com/watch?v=ZTWTVd5Pka0)

### Link para arquivo PDF:
[https://drive.google.com/file/d/1Ccek1TEL7Ywt-y8LYKS4BXLXxV8zs1ql/view?usp=sharing](https://drive.google.com/file/d/1gE0PAQqCqAdKY3_blfh1nQkrNpkg-gAi/view?usp=sharing)

### Link para a pasta do Google Drive com arquivos do trabalho:
https://drive.google.com/drive/folders/1xkj5-vKMrytPFvZ_XSKv7pNtKQjwk-wH?usp=sharing

## Descrição
**Contextualização da sistematização:** A empresa MGS (Max Global Sports) atua no ramo de representação de empresas que produzem artigos esportivos em todo o mundo. Seus funcionários viajam pelos quatro cantos do planeta oferecendo os produtos que a MGS representa para diversas empresas. A rotina pesada dos seus funcionários resultou em vários episódios de saúde no quais os empregados ficaram inconscientes e precisaram de auxílio de pessoas desconhecidas. Para apoiar seus funcionários nessas situações, a MGS encomendou um sistema de geração de cartões com as principais informações dos funcionários, alergias, problemas médicos, bem como telefones e e-mails de contato. O sistema deve ser capaz de armazenar as informações dos empregados e apresentá-las quando o respectivo identificador for fornecido.

**Projeto escolhido para a sistematização:** Projeto C:  Definir e instanciar as classes que permitam o gerenciamento das informações dos empregados. O sistema deve coletar as informações pelo terminal e retorná-las da mesma forma. Não é necessário implementar persistência, ou seja, quando o sistema for interrompido os dados serão perdidos.


## Ferramentas Utilizadas
Eclipse IDE for Java Developers 
Version: 2024-03 (4.31.0)

## Descrição do Sistema

**Classe empregados_mgs:** Esta classe representa um empregado. Ela tem vários atributos privados para armazenar informações sobre um empregado, como matrícula, nome, telefone, email, contato de emergência, alergias, problemas médicos e plano de saúde.

**Construtor:** O construtor da classe empregados_mgs é usado para inicializar os atributos do objeto empregado quando um novo objeto é criado.

**Método exibirInformacoes():** Este método é usado para exibir as informações do empregado.

**Método getMatricula():** Este método é um ‘getter’ que retorna a matrícula do empregado.

**Método main():** Este é o ponto de entrada do programa. Ele contém um loop infinito que apresenta um menu de opções para o usuário:
Opção 1: Adicionar um novo empregado. O usuário é solicitado a fornecer todas as informações do empregado. Um novo objeto Empregados é criado e adicionado à lista de empregados.
Opção 2: Exibir informações de um empregado pela matrícula. O usuário é solicitado a fornecer a matrícula do empregado. O programa percorre a lista de empregados para encontrar o empregado com a matrícula fornecida e exibe suas informações.
Opção 3: Sair do programa.
Qualquer outra opção é considerada inválida e o usuário é solicitado a tentar novamente.
