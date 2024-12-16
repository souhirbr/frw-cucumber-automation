Feature: je rempli le formulaire
  en tant que utilisateur je souhaite remplir le formulaire afin de l enregistrer

  @Module_Register
  Scenario Outline: Remplir le formulaire registre
    Given Je me connecte sur l application Mercury
    When Je clique sur le bouton REGISTER
    When Je saisi un data dans le champs FirstName "<username>"
    When Je saisi un data dans le champs LastName "<lastname>"

    Examples: 
      | username | lastname     |
      | souhir   | berrima      |
      | refka    | ben hammouda |
