***Settings***
Library     SeleniumLibrary

***Test Cases***
Abrir navegador da pagina do Youtube
    Abrir a pagina "https://www.youtube.com/watch?v=G4skutiuqgM" com o navegador "headlesschrome"  #headlesschrome ocultar navegador
    maximize_browser_window  
    add_argument  --start-maximized
 
    Title Should Be     JOGOS PS1 - Winning Eleven 3 - YouTube
    Click Element  id=text  Pular teste
    Sleep  451s
    Close Browser  

***KeyWords***
Abrir a pagina "${URL}" com o navegador "${navegador}"
  Open Browser  ${URL}  ${navegador} 

