package org.primefaces.cookbook.webapp;

import javax.servlet.*;
import java.io.IOException;

/**
 * Filter that sets the character encoding to be used in parsing the incoming request, either unconditionally or only if the
 * client did not specify a character encoding.
 *
 * @author  Oleg Varaksin / last modified by $Author: ovaraksin@gmail.com $
 * @version $Revision: 875 $
 */
public class CharacterEncodingFilter implements Filter {

	/** The default character encoding to set for requests that pass through this filter. */
	protected String encoding = null;

	/**
	 * The filter configuration object we are associated with. If this value is null, this filter instance is not currently
	 * configured.
	 */
	protected FilterConfig filterConfig = null;

	/** Should a character encoding specified by the client be ignored? */
	protected boolean ignore = true;

	public void destroy() {
		this.encoding = null;
		this.filterConfig = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	    throws IOException, ServletException {
		// Conditionally select and set the character encoding to be used
		if (ignore || (request.getCharacterEncoding() == null)) {
			if (this.encoding != null) {
				request.setCharacterEncoding(this.encoding);
			}
		}

		// Pass control on to the next filter
		chain.doFilter(request, response);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		this.encoding = filterConfig.getInitParameter("encoding");

		String value = filterConfig.getInitParameter("ignore");
		if (value == null) {
			this.ignore = true;
		} else if (value.equalsIgnoreCase("true")) {
			this.ignore = true;
		} else if (value.equalsIgnoreCase("yes")) {
			this.ignore = true;
		} else {
			this.ignore = false;
		}
	}
}
