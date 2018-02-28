/*
 * An XML document type.
 * Localname: Annot-descr
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.AnnotDescrDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Annot-descr(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class AnnotDescrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AnnotDescrDocument
{
    
    public AnnotDescrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTDESCR$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Annot-descr");
    
    
    /**
     * Gets the "Annot-descr" element
     */
    public gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr getAnnotDescr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr target = null;
            target = (gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr)get_store().find_element_user(ANNOTDESCR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Annot-descr" element
     */
    public void setAnnotDescr(gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr annotDescr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr target = null;
            target = (gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr)get_store().find_element_user(ANNOTDESCR$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr)get_store().add_element_user(ANNOTDESCR$0);
            }
            target.set(annotDescr);
        }
    }
    
    /**
     * Appends and returns a new empty "Annot-descr" element
     */
    public gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr addNewAnnotDescr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr target = null;
            target = (gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr)get_store().add_element_user(ANNOTDESCR$0);
            return target;
        }
    }
    /**
     * An XML Annot-descr(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class AnnotDescrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.AnnotDescrDocument.AnnotDescr
    {
        
        public AnnotDescrImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ANNOTDESC$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Annotdesc");
        
        
        /**
         * Gets array of all "Annotdesc" elements
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc[] getAnnotdescArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ANNOTDESC$0, targetList);
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc[] result = new gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Annotdesc" element
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc getAnnotdescArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc)get_store().find_element_user(ANNOTDESC$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Annotdesc" element
         */
        public int sizeOfAnnotdescArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ANNOTDESC$0);
            }
        }
        
        /**
         * Sets array of all "Annotdesc" element
         */
        public void setAnnotdescArray(gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc[] annotdescArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(annotdescArray, ANNOTDESC$0);
            }
        }
        
        /**
         * Sets ith "Annotdesc" element
         */
        public void setAnnotdescArray(int i, gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc annotdesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc)get_store().find_element_user(ANNOTDESC$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(annotdesc);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Annotdesc" element
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc insertNewAnnotdesc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc)get_store().insert_element_user(ANNOTDESC$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Annotdesc" element
         */
        public gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc addNewAnnotdesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc target = null;
                target = (gov.nih.nlm.ncbi.www.AnnotdescDocument.Annotdesc)get_store().add_element_user(ANNOTDESC$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Annotdesc" element
         */
        public void removeAnnotdesc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ANNOTDESC$0, i);
            }
        }
    }
}
