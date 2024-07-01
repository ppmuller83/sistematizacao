![image](https://github.com/ppmuller83/poo_sistematizacao/assets/169911733/a499be28-16de-4df8-a4c0-9abb96e5d55e)

# Programação Orientada a Objetos

> 👨‍🎓 Aluno: Pedro Polenz Muller;
RA: 72401544;
Turma B - 0424 - Virtual;

### :movie_camera: Links para o vídeo de apresentação:
https://youtu.be/Y-bejBm9cos

### Link para arquivo PDF:
https://drive.google.com/file/d/1Ccek1TEL7Ywt-y8LYKS4BXLXxV8zs1ql/view?usp=sharing

### Link para a pasta do Google Drive com arquivos do trabalho:
https://drive.google.com/drive/folders/1xkj5-vKMrytPFvZ_XSKv7pNtKQjwk-wH?usp=sharing

## Descrição
**Contextualização da sistematização:** A empresa MGS (Max Global Sports) atua no ramo de representação de empresas que produzem artigos esportivos em todo o mundo. Seus funcionários viajam pelos quatro cantos do planeta oferecendo os produtos que a MGS representa para diversas empresas. A rotina pesada dos seus funcionários resultou em vários episódios de saúde no quais os empregados ficaram inconscientes e precisaram de auxílio de pessoas desconhecidas. Para apoiar seus funcionários nessas situações, a MGS encomendou um sistema de geração de cartões com as principais informações dos funcionários, alergias, problemas médicos, bem como telefones e e-mails de contato. O sistema deve ser capaz de armazenar as informações dos empregados e apresentá-las quando o respectivo identificador for fornecido.

**Projeto escolhido para a sistematização:** Projeto C:  Definir e instanciar as classes que permitam o gerenciamento das informações dos empregados. O sistema deve coletar as informações pelo terminal e retorná-las da mesma forma. Não é necessário implementar persistência, ou seja, quando o sistema for interrompido os dados serão perdidos.


## Ferramentas Utilizadas
Eclipse IDE for Java Developers 
Version: 2024-03 (4.31.0)

## Descrição do Sistema
**1. package sistematizacao_poo;:** Este é o pacote no qual a classe empregados está contida.

**2. public class empregados { ... }:** Aqui é definida a classe empregados. Tudo que está entre as chaves {} faz parte desta classe.

**3. Atributos:** Dentro da classe empregados, temos vários atributos privados, como "Matrícula", "Nome", "Telefone", "E-mail","Nome do contato de emergência", "Telefone do contato de emergência", "Alergias", "Problemas médicos" e "Plano de Saúde". Esses são os dados que cada objeto da classe empregados vai armazenar.

**4. Constructor:** Em seguida, temos um construtor para a classe empregados. Este construtor é um método especial que é chamado quando um novo objeto da classe empregados é criado. Ele recebe vários parâmetros e usa esses parâmetros para inicializar os atributos do objeto.

**5. O método exibirInformacoes():** Método público que exibe as informações do empregado. Ele usa o comando System.out.println para imprimir as informações na saída padrão.

**6. O Método main():** Onde um novo objeto da classe empregados é criado e o método exibirInformacoes() é chamado, o que resultará na impressão das informações do empregado no console.
