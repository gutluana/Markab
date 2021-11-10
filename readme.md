<h1 align="center">
    <img src="https://ik.imagekit.io/aa0efwxn6ck/logomarkab_gvfSol1XN.png?updatedAt=1634003147790">
</h1>

### Indice
- [Introdução](#-Introdução)
- [Ajustes e melhorias](#-Ajustes-e-melhorias)
- [Tecnologias Utilizadas](#-Tecnologias-Utilizadas)
- [Colaboradores](#-Colaboradores)
- [Modelo C4](#-Modelo-C4)
- [Diagrama de Contexo](#-Diagrama-de-Contexto)
- [Diagrama de Containers](#-Diagrama-de-Containers)
- [Diagrama de Componentes (LOG)](#-Diagrama-de-Componentes)
- [Diagrama de Componentes (API)](#-Diagrama-de-Componentes)
- [Diagrama de Codigo](#-Diagrama-de-Codigo)


## Introdução
> O objetivo principal do Markab é ser um sistema funcional para moradores ou donos de empresas que oferecem automação inteligente para casas ou empresas, que consigam interagir com uma interface de de facil manuseio e pratica, para cadastrar, excluir, alterar componentes e realizar a comunicação entre o componente e o Markab. O foco do Markab não é o usuario final, no caso o cliente. Ele também está inserido no sistema como um usuario porém é possivel que seja uma empresa que oferece componentes para uma casa inteligente, então essa empresa pode contratar o sistema Markab e também cadastrar os componentes, excluir, ou alterar e realizar outras ações que o Markab oferece.


### Ajustes e melhorias

>O projeto ainda está em desenvolvimento e as próximas atualizações serão voltadas nas seguintes tarefas:

- [x] Levantamento de Requisitos
- [x] Casos de Uso
- [x] Modelo C4
- [ ] Codigo Fonte 
- [ ] 

## 💻 Tecnologias Utilizadas

- [Visual Studio Code](https://code.visualstudio.com/)
- [IntelliJ](https://www.jetbrains.com/pt-br/idea)
- [Astah](https://astah.net/downloads/)




## 🤝 Colaboradores



<table>
  <tr>
    <td align="center">
      <a href="#">
        <img src="https://ik.imagekit.io/aa0efwxn6ck/luana_Ur_CapjlLI.jpg?updatedAt=1634055534589" width="100px;" alt="Foto da Luana Gut no GitHub"/><br>
        <sub>
          <b>Luana Gut</b>
        </sub>
      </a>
    
</table>

## Modelo C4 

### (Diagrama de Contexo)
>Representa todo o sistema como um único processo os fluxos demonstram o comportamento do lado de fora de tracejado pessoas externas que utilizam o sistema Markab, no caso Pessoa e Admin de empresa terceira, a parte de dentro da linha tracejada apresenta o Markab em si, e a funcionalidade dele, um sistema que é uma interface para comunicação entre sistemas de automação

<img src="https://ik.imagekit.io/aa0efwxn6ck/contexto_X-BMUKpTFK.png?updatedAt=1634240153503">

### Diagrama de Containers 
>um diagrama de container, esse diagrama expande para a parte do software e mostra aplicativos, armazenamento de dados, que compõe o Markab, no caso a pessoa acessa pela web com com a API é feita a manipulação dos dados, que é armazenado em um banco, ao mesmo tempo um sistema de log é gerado para gerenciar os logs do sistema, que é armazenado em um NoSQL Log Store.

<img src="https://ik.imagekit.io/aa0efwxn6ck/hLJ1Rjj64BtpApP23p8WMOUcbm818ajgua2orL2kqHCn8iVq9kJkPcSfLoZwDJtq2_e5-R7EK1GhHcQGGtJHSkRjUszsPlSr1V2XAWirUvai2YpH18fUQ9CMLORgCGH7Fqyc7fukSnqUgsr5w5Dh0kCkKrjEN056zeyfP8NUJcOlnsi9tQsMa_RJMMtuos0.png?updatedAt=1634062432559">

### Diagrama de Componentes (API)
>Por trás da interface do Markab dentro da linha tracejada tempos os componentes que geram essa interface, também de sistemas terceiros pois esta incluso no sistema Markab, no caso Usuario sendo uma classe o controller é responsavel pelas entradas e saidas, o serviço usuario é responsavel pela regra de negocio, o usuario DAO faz o acesso aos dados, no caso o repositorio é a camada que faz acesso ao SQL. para os outros segue a mesma logica.

<img src="https://ik.imagekit.io/aa0efwxn6ck/compapi_EnMycrdIAw.png?updatedAt=1634238250466">

### Diagrama de Componentes (LOG)
>O diagrama de componentes mostra o relacionamento entre diferentes componentes de um sistema. Apresenta o comportamento dos logs no sistema.

<img src="https://ik.imagekit.io/aa0efwxn6ck/jPJDQXin4CVl-nJJfGSRulZGdWg5V3Wj1ITfOj9haAs98zZLB1fjIYXzdZn8NgnIl9xDVYpTGkg3qVxduoUD_kY8lNA-pBFadR6RhDG8zzuN_6a-T-hduTRu-t9TCheDMO_M7suednUPih5cnbvdPZq__JZx7gMRy-KyL-pH1UdsbFA2RAmf__9ETl9x0OYe.png?updatedAt=1634062432495">

### Diagrama de Codigo

<img src="https://ik.imagekit.io/t87uwojyrlw/diagrama2_XqwsKfTzn.png?updatedAt=1636077398368">

[⬆ Voltar ao topo](#-Indice)


 