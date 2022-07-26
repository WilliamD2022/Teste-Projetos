Resource        ../resources/ BDDpt-br.robot
Resource         ../resources/BDDpt-br.robot
Suite Teardown   Fechar Navegador

*** Test Cases ***
Cenário 01: Pesquisar postagem Season Premiere
    Dado que esteja na tela HOME do blog robotizando testes
    Quando pesquisar pela palavra "introdução ao robot framework"
    Então a postagem "Season Premiere: Introdução ao Robot Framework" deve ser listada no resultado da pesquisa
