Feature: Je verifie la page d authentification 
  en tant que utilisateur je souhaite me connecter au site Mercury 

  @connexion
  Scenario: Je verifie la page d authentification
   Given Je me connecte sur l application Mercury
   When  Je saisie le User name "test"
   And   Je saisie le Password "test" 
   And   Je clique sur le bouton Submit 
Then Je me redirige vers la page home "Login Successfully"