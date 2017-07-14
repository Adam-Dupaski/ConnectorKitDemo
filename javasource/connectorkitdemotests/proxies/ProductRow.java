// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package connectorkitdemotests.proxies;

public class ProductRow
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject productRowMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ConnectorKitDemoTests.ProductRow";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		N("N"),
		P("P"),
		D("D");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ProductRow(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ConnectorKitDemoTests.ProductRow"));
	}

	protected ProductRow(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject productRowMendixObject)
	{
		if (productRowMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ConnectorKitDemoTests.ProductRow", productRowMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ConnectorKitDemoTests.ProductRow");

		this.productRowMendixObject = productRowMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ProductRow.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static connectorkitdemotests.proxies.ProductRow initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return connectorkitdemotests.proxies.ProductRow.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static connectorkitdemotests.proxies.ProductRow initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new connectorkitdemotests.proxies.ProductRow(context, mendixObject);
	}

	public static connectorkitdemotests.proxies.ProductRow load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return connectorkitdemotests.proxies.ProductRow.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of N
	 */
	public final java.lang.String getN()
	{
		return getN(getContext());
	}

	/**
	 * @param context
	 * @return value of N
	 */
	public final java.lang.String getN(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.N.toString());
	}

	/**
	 * Set value of N
	 * @param n
	 */
	public final void setN(java.lang.String n)
	{
		setN(getContext(), n);
	}

	/**
	 * Set value of N
	 * @param context
	 * @param n
	 */
	public final void setN(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String n)
	{
		getMendixObject().setValue(context, MemberNames.N.toString(), n);
	}

	/**
	 * @return value of P
	 */
	public final java.math.BigDecimal getP()
	{
		return getP(getContext());
	}

	/**
	 * @param context
	 * @return value of P
	 */
	public final java.math.BigDecimal getP(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.P.toString());
	}

	/**
	 * Set value of P
	 * @param p
	 */
	public final void setP(java.math.BigDecimal p)
	{
		setP(getContext(), p);
	}

	/**
	 * Set value of P
	 * @param context
	 * @param p
	 */
	public final void setP(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal p)
	{
		getMendixObject().setValue(context, MemberNames.P.toString(), p);
	}

	/**
	 * @return value of D
	 */
	public final java.lang.String getD()
	{
		return getD(getContext());
	}

	/**
	 * @param context
	 * @return value of D
	 */
	public final java.lang.String getD(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.D.toString());
	}

	/**
	 * Set value of D
	 * @param d
	 */
	public final void setD(java.lang.String d)
	{
		setD(getContext(), d);
	}

	/**
	 * Set value of D
	 * @param context
	 * @param d
	 */
	public final void setD(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String d)
	{
		getMendixObject().setValue(context, MemberNames.D.toString(), d);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return productRowMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final connectorkitdemotests.proxies.ProductRow that = (connectorkitdemotests.proxies.ProductRow) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "ConnectorKitDemoTests.ProductRow";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}