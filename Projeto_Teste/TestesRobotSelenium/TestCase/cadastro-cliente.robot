**Settings***
Library    SeleniumLibrary

**Variables***
${INPUT_NOME_DO_USERNAME}   id=username
${INPUT_NOME_DO_PASSWORD}   id=password
${CLICK_ELEMENT_LOGIN}      id=login
${CLICK_ELEMENT_CADASTRAR_CLIENTE}  id=btn-cadastro-cliente
${INPUT_NOME_DO_NOME_CLIENTE}     id=nome_cliente 
${INPUT_DATA_NASC_CLIENTE}     id=dtnasc  
${INPUT_CPF_CLIENTE}   id=cpf 
${CLICK_ELEMENT_SEXO}  xpath=//input[@value='masculino']
${INPUT_CEP_CLIENTE}  id=cep
${BUTTON_PESQUISAR}   xpath=//button[text()='Pesquisar']
${INPUT_NUMERO_CASA_END}       id=numero
${SELECT_ESTADO_CIVIL_DO_CLIENTE}   id=estado-civil
${CHECK_TESTE_AUTOMATIZADOS}    xpath=//span[contains(text(),'Testes Automatizados')]/preceding::input[1]
${CHECK_VIDEO_GAME}          xpath=//span[contains(text(),'Video Games')]/preceding::input[1]
${BUTTON_CADASTRAR}          id=cadastrar
${CAMPO_MENSSAGEM}           id=msg
${URL_CADASTRO_CLIENTE}       https://estivalet.github.io/robot-static-testing-site/index.html#
${NAVEGADOR_DO_TESTE}         Chrome

#Login
${LOGIN_PAGINA_USER_NAME}    Jeferson@Barbosa
${LOGIN_PAGINA_USER_SENHA}   26041975


#Valores para preenche nos vampos formularios
 #${CLIENTE_NOME_DO_CLIENTE}        Jferso Barbosa da Silva
 #${DATA_NASCIMENTO_DO_CLIENTE}          26041975
 #${CPF_CLIENTE}             34547541522
 #${CEP_DO_CLIENTE}             08151160
 #${NUMERO_DA_CASA_CLIENTE}          5595
 #${ESTAOD_CIVIl CLIENTE}     Casado(a)

***Test Cases***
Fazer o cadastro de um novo cliente
    Set Selenium Speed  0.3 seconds
    Open Browser  ${URL_CADASTRO_CLIENTE}    ${NAVEGADOR_DO_TESTE} 
    maximize_browser_window   
    input Text   ${INPUT_NOME_DO_USERNAME}  ${LOGIN_PAGINA_USER_NAME}
    input Text   ${INPUT_NOME_DO_PASSWORD}  ${LOGIN_PAGINA_USER_SENHA}
    Click Element  ${CLICK_ELEMENT_LOGIN} 
    Click Element  ${CLICK_ELEMENT_CADASTRAR_CLIENTE}
    input Text  ${INPUT_NOME_DO_NOME_CLIENTE}    Jferso Barbosa da Silva
    input Text  ${INPUT_DATA_NASC_CLIENTE}       26041975 
    input Text  ${INPUT_CPF_CLIENTE}             34547541522
    Click Element  ${CLICK_ELEMENT_SEXO}
    input Text  ${INPUT_CEP_CLIENTE}             08151160
    Click Element  ${BUTTON_PESQUISAR}
    input Text  ${INPUT_NUMERO_CASA_END}         5595
    #Wait Until KeyWords Succeds  10s  200ms  Aguardar o valor "Rua José Inocêncio da Costa" "id=rua" estar presente
    Select From List By Value  ${SELECT_ESTADO_CIVIL_DO_CLIENTE}   Casado(a)
    Click Element  ${CHECK_TESTE_AUTOMATIZADOS}
    Click Element  ${CHECK_VIDEO_GAME}
    Click Element  ${BUTTON_CADASTRAR}
    Wait Until Element Is Visible  ${CAMPO_MENSSAGEM}
    Wait until Page Contains  Cliente cadastrado com sucesso!
  
  
    Close Browser



***KeyWords***

Aguardar o valor "${valor_esperado}" no elemento "${elemento}" esta presente
        ${valor_atual}=  Get Element Attribute  ${elemento}  value
        Should Be Equal As Strings ${valor_atual}  ${valor_esperado}

