***Settings***
Library     SeleniumLibrary

***Test Cases***
Abrir navegador da pagina do Google
    Abrir a pagina "https://www.google.com.br" com o navegador "chrome"   
    maximize_browser_window  
    Title Should Be     Google
    input Text  name=q  Robot Framework SeleniumLibrary
    Press keys  name=q  ENTER  
    

***KeyWords***
Abrir a pagina "${URL}" com o navegador "${navegador}"
  Open Browser  ${URL}  ${navegador} 
   
    
    