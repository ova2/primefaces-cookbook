PrimeFaces.locales['en'] = {
    messages : PrimeFaces.locales['en_US'].messages
};

$.extend(PrimeFaces.locales['en'].messages, {
    'javax.faces.component.UIInput.REQUIRED':
        '{0}: Value is required.',
    'javax.faces.validator.LengthValidator.MINIMUM':
        '{1}: Length is less than allowable minimum of \'{0}\'',
    'javax.faces.validator.LengthValidator.MAXIMUM':
        '{1}: Length is greater than allowable maximum of \'{0}\'',
    'javax.faces.validator.RegexValidator.NOT_MATCHED':
        'Value does not match regex pattern {0}',
    
    'invalid.unicode':
        '{0} may only contain letters, spaces, hyphens and apostrophes',
    'invalid.cvc':
        'Card Validation Code is invalid'
});