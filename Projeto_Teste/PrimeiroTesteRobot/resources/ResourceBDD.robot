***Settings***
Library     SeleniumLibrary


*** Variables***
${BROWSER}       chrome
${URL}           https://www.amazon.com.br/
${CABEÇALHO}     xpath=.//span[@class = 'hm-icon-label']


*** Keywords ***
#### DADO
Que esteja na tela HOME do blog robotizando testes
    Open Browser    ${URL}  ${BROWSER}
    Wait Until Element Is Visible   ${CABEÇALHO}
    Title Should Be     Robotizando Testes