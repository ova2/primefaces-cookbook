PrimeFaces.validator['UnicodeValidator'] = {
    regex: XRegExp("^[\\p{L}-'´`\\s]+$"),

    MESSAGE_ID: 'invalid.unicode',

    validate: function (element, value) {
        if (!this.regex.test(value)) {
            throw PrimeFaces.util.ValidationContext.getMessage(
                  this.MESSAGE_ID, element.data('param'));
        }
    }
};