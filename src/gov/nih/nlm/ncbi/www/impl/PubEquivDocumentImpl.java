/*
 * An XML document type.
 * Localname: Pub-equiv
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.PubEquivDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Pub-equiv(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class PubEquivDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubEquivDocument
{
    
    public PubEquivDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBEQUIV$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Pub-equiv");
    
    
    /**
     * Gets the "Pub-equiv" element
     */
    public gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv getPubEquiv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv target = null;
            target = (gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv)get_store().find_element_user(PUBEQUIV$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Pub-equiv" element
     */
    public void setPubEquiv(gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv pubEquiv)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv target = null;
            target = (gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv)get_store().find_element_user(PUBEQUIV$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv)get_store().add_element_user(PUBEQUIV$0);
            }
            target.set(pubEquiv);
        }
    }
    
    /**
     * Appends and returns a new empty "Pub-equiv" element
     */
    public gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv addNewPubEquiv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv target = null;
            target = (gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv)get_store().add_element_user(PUBEQUIV$0);
            return target;
        }
    }
    /**
     * An XML Pub-equiv(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class PubEquivImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.PubEquivDocument.PubEquiv
    {
        
        public PubEquivImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PUB$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Pub");
        
        
        /**
         * Gets array of all "Pub" elements
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub[] getPubArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PUB$0, targetList);
                gov.nih.nlm.ncbi.www.PubDocument.Pub[] result = new gov.nih.nlm.ncbi.www.PubDocument.Pub[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Pub" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub getPubArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub)get_store().find_element_user(PUB$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Pub" element
         */
        public int sizeOfPubArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUB$0);
            }
        }
        
        /**
         * Sets array of all "Pub" element
         */
        public void setPubArray(gov.nih.nlm.ncbi.www.PubDocument.Pub[] pubArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pubArray, PUB$0);
            }
        }
        
        /**
         * Sets ith "Pub" element
         */
        public void setPubArray(int i, gov.nih.nlm.ncbi.www.PubDocument.Pub pub)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub)get_store().find_element_user(PUB$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pub);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Pub" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub insertNewPub(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub)get_store().insert_element_user(PUB$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Pub" element
         */
        public gov.nih.nlm.ncbi.www.PubDocument.Pub addNewPub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.PubDocument.Pub target = null;
                target = (gov.nih.nlm.ncbi.www.PubDocument.Pub)get_store().add_element_user(PUB$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Pub" element
         */
        public void removePub(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUB$0, i);
            }
        }
    }
}
