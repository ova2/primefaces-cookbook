PrimeFaces.validator['UnicodeValidator'] = {
    regex: XRegExp("^[\\p{L}-'´`\\s]+$"),

    MESSAGE_ID: 'invalid.unicode',

    validate: function (element, value) {
        if (!this.regex.test(value)) {
            throw PrimeFaces.util.ValidationContext.getMessage(this.MESSAGE_ID, element.data('param'));
        }
    }
};

PrimeFaces.validator['ValidCVC'] = {
    MESSAGE_ID: 'invalid.cvc',

    validate: function (element, value) {
        // trim value
        var val = (value != null ?
            value.toString().replace(/^\s+|\s+$/g, "") : "");

        // check if numeric
        var isNumeric = (val.match(/^[0-9]+$/) !== null);
        if (!isNumeric) {
            throw PrimeFaces.util.ValidationContext.
                getMessage(this.MESSAGE_ID);
        }

        // find out selected menu value
        var forCardMenu = element.data('forcardmenu');
        var selOption = forCardMenu ?
            PrimeFaces.expressions.SearchExpressionFacade.
                resolveComponentsAsSelector(forCardMenu).
                    find("select").val() : null;

        var valid = false;
        if (selOption && selOption === 'MCD') {
            // MasterCard
            valid = val.length == 3;
        } else if (selOption && selOption === 'AMEX') {
            // American Express
            valid = val.length == 4;
        }

        if (!valid) {
            throw PrimeFaces.util.ValidationContext.
                getMessage(this.MESSAGE_ID);
        }
    }
};