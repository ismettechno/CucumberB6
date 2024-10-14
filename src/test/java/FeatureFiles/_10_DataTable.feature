Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create a Country

    And Click on the Element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the Element in Dialog
      | addButton |

    And User sending the keys in Dialog
      | nameInput | ismetUlkesi1898 |
      | codeInput | ismetKod1    |

    And Click on the Element in Dialog
      | saveButton |

    Then Success message should be displayed