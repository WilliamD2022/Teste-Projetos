***Settings***
Library     SeleniumLibrary



***Test Cases***
Abrir Navegador da pagina do itau        
    Open Browser  https://www.itau.com.br   chrome  
    maximize_browser_window    
    Title Should Be     Banco Itaú | Feito com você
    input Text  id=agencia    0996 
    input Text  id=conta      14850-0 
    Click Button    id=loginButton
    
    