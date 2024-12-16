Feature: Je verifie l enregistrement d un nouvel utilisateur
  En tant qu utilisateur je souhaite creer un compte dans l application Mercury

  @register
  Scenario: Je verifie l enregistrement d un nouvel utilisateur
    Given Je me connecte à l application Mercury
    When Je clique sur le bouton REGISTER 
    Then Je me redirige vers le fomulaire d enregistrement "https://demo.guru99.com/test/newtours/images/mast_register.gif"
    And Je saisie le First Name "souhir"
    And Je saisie le Last Name "ber"
    And Je saisie le Phone "28509703"
    And Je saisis l email "souber@gmail.com"
    And Je saisie l adresse "Nabeul"
    And Je saisie City "Nabeul"
    And Je saisie State/Province "Tunisia"
    And Je saisie Postal Code "8010"
    And Je selectionne Country "Tunisia"
    And Je saisie User Name "Souhirber"
    And Je saisie Password "souhir20"
    And Je confirme Password "souhir20"
    And Je clique sur le bouton Envoyer
    Then Je me redirige vers la page de confirmation "Note: Your user name is souhirber."