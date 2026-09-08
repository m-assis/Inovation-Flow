# Inovation Flow 🚀

> Projeto desenvolvido e premiado durante o programa **Rock Skills da FIAP**, focado na otimização, automação e personalização do atendimento via WhatsApp para futuros alunos de Graduação, Pós-Graduação e MBA, utilizando inteligência artificial generativa e arquitetura em nuvem.

---

## 💡 Sobre o Projeto

O **Inovation Flow** nasceu da necessidade de transformar a experiência de admissão de candidatos no setor educacional. O grande diferencial desta solução é a aplicação estratégica da Inteligência Artificial Generativa (**Google Gemini**), garantindo um atendimento ágil, humanizado e livre de ruídos de comunicação. 

Para este repositório de portfólio, a arquitetura foi evoluída para o ecossistema corporativo backend em **Java (Spring Boot)** e preparada para deploy e consumo de serviços na **AWS Cloud**, alinhando boas práticas de mercado e engenharia de software moderna.

### 🎯 Principais Diferenciais
* **Personalização de Tom de Voz:** Ajuste automático da comunicação (formal, consultivo, descontraído) de acordo com o perfil do lead e o nível pretendido (Graduação, Pós ou MBA).
* **Eficiência Operacional:** Redução do tempo de resposta no processo de admissão, otimizando o tempo da equipe humana.
* **Arquitetura Cloud-Ready:** Estruturado para rodar e escalar utilizando serviços da AWS.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17+ / Spring Boot
* **Inteligência Artificial:** Google Gemini API
* **Cloud & DevOps:** AWS (Serviços planejados/utilizados para infraestrutura e deploy)
* **Gerenciamento de Dependências:** Maven

---

## 📂 Estrutura do Repositório

```text
Inovation Flow/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── inovationflow/
│   │   │           ├── controller/   # Endpoints de atendimento / Webhooks
│   │   │           ├── service/      # Regra de negócio e integração com o Google Gemini
│   │   │           └── model/        # Personas e objetos de dados
│   │   │
│   │   └── resources/
│   │       └── application.yml       # Configurações do Spring e chaves de API
│
├── pom.xml                           # Gerenciador de dependências Maven
└── README.md                         # Documentação oficial do projeto
