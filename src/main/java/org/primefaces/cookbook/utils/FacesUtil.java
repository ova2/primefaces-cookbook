package org.primefaces.cookbook.utils;

import javax.el.ExpressionFactory;
import javax.el.MethodExpression;
import javax.faces.context.FacesContext;
import javax.faces.event.MethodExpressionActionListener;

/**
 * FacesUtil
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
public class FacesUtil {

	public static MethodExpression createMethodExpression(String valueExpression, Class<?> expectedReturnType,
	                                                      Class<?>[] expectedParamTypes) {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExpressionFactory factory = fc.getApplication().getExpressionFactory();

		return factory.createMethodExpression(fc.getELContext(), valueExpression, expectedReturnType, expectedParamTypes);
	}

	public static MethodExpressionActionListener createMethodActionListener(String valueExpression, Class<?> expectedReturnType,
	                                                                        Class<?>[] expectedParamTypes) {
		return new MethodExpressionActionListener(createMethodExpression(valueExpression, expectedReturnType,
		                                                                 expectedParamTypes));
	}
}
