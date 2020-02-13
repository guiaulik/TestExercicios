# language: pt
Funcionalidade: Cadastro no Gmail

  Cenário: Cadastrar com dados armazenados
    Dado que estou na página de dados aleatórios
    Quando efetuo a geração
    Então posso ver as informações obtidas
    Dado que estou na página de cadastro do Gmail
    Quando efetuo cadastro com as informações geradas
    Então acesso página para cadastrar telefone
    Dado que forneço telefone inválido
    Então sistema não permite validação do telefone
