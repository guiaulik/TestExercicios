$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/CadastroGmail.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 2,
  "name": "Cadastro no Gmail",
  "description": "",
  "id": "cadastro-no-gmail",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 4,
  "name": "Cadastrar com dados armazenados",
  "description": "",
  "id": "cadastro-no-gmail;cadastrar-com-dados-armazenados",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 5,
  "name": "que estou na página de dados aleatórios",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "efetuo a geração",
  "keyword": "Quando "
});
formatter.step({
  "line": 7,
  "name": "posso ver as informações obtidas",
  "keyword": "Então "
});
formatter.step({
  "line": 8,
  "name": "que estou na página de cadastro do Gmail",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "efetuo cadastro com as informações geradas",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "acesso página para cadastrar telefone",
  "keyword": "Então "
});
formatter.step({
  "line": 11,
  "name": "que forneço telefone inválido",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "sistema não permite validação do telefone",
  "keyword": "Então "
});
formatter.match({
  "location": "TesteSteps.queEstouNaPáginaDeDadosAleatórios()"
});
formatter.result({
  "duration": 9576813950,
  "status": "passed"
});
formatter.match({
  "location": "TesteSteps.efetuoAGeração()"
});
formatter.result({
  "duration": 261825805,
  "status": "passed"
});
formatter.match({
  "location": "TesteSteps.possoVerAsInformaçõesObtidas()"
});
formatter.result({
  "duration": 410239806,
  "status": "passed"
});
formatter.match({
  "location": "TesteSteps.queEstouNaPáginaDeCadastroDoGmail()"
});
formatter.result({
  "duration": 6883726792,
  "status": "passed"
});
formatter.match({
  "location": "TesteSteps.efetuoCadastroComAsInformaçõesGeradas()"
});
formatter.result({
  "duration": 11426066812,
  "status": "passed"
});
formatter.match({
  "location": "TesteSteps.acessoPáginaParaCadastrarTelefone()"
});
formatter.result({
  "duration": 47889963,
  "status": "passed"
});
formatter.match({
  "location": "TesteSteps.queForneçoTelefoneInválido()"
});
formatter.result({
  "duration": 370636530,
  "status": "passed"
});
formatter.match({
  "location": "TesteSteps.sistemaNãoPermiteValidaçãoDoTelefone()"
});
formatter.result({
  "duration": 21704300,
  "status": "passed"
});
formatter.after({
  "duration": 1318398358,
  "status": "passed"
});
});