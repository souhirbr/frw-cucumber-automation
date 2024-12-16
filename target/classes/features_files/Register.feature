Feature: Je verifie l enregistrement d un nouvel utilisateur

			En tant que uttilisateur je souhaite creer un compte dans l application Mercury



  @register

  Scenario: Je verifie l enregistrement d un nouvel utilisateur

    Given Je me connecte sur l application Mercury

    When Je clique sur le bouton REGISTER
  
     And Je saisie le First Name "souhir"

    And Je saisie le Last Name "ber"

    And Je saisie le Phone "28509703"

    And Je saisie l Email "souber@gmail.com"

    And Je saisie l Adresse "Nabeul"

    And Je saisie le City "Nabeul"

    And Je saisie le State/Province "Tunisia"

    And Je saisie le Postal Code "8010"

    And Je selectionne le Country "Tunisia"

    And Je saisie le User Name "Souhirber"

    And Je saisie le Password "souhir20"
    
    And Je confirme Password "souhir20"
    
    And Je clique sur le bouton Envoyer 

     Then Je me redirige vers la page de confirmation "Note: Your user name is souhirber."

    