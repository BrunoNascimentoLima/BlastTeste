/*
 * An XML document type.
 * Localname: Blast4-common-options-nucleotide-query
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Blast4-common-options-nucleotide-query(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class Blast4CommonOptionsNucleotideQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument
{
    
    public Blast4CommonOptionsNucleotideQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLAST4COMMONOPTIONSNUCLEOTIDEQUERY$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-common-options-nucleotide-query");
    
    
    /**
     * Gets the "Blast4-common-options-nucleotide-query" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery getBlast4CommonOptionsNucleotideQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery)get_store().find_element_user(BLAST4COMMONOPTIONSNUCLEOTIDEQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Blast4-common-options-nucleotide-query" element
     */
    public void setBlast4CommonOptionsNucleotideQuery(gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery blast4CommonOptionsNucleotideQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery)get_store().find_element_user(BLAST4COMMONOPTIONSNUCLEOTIDEQUERY$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery)get_store().add_element_user(BLAST4COMMONOPTIONSNUCLEOTIDEQUERY$0);
            }
            target.set(blast4CommonOptionsNucleotideQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "Blast4-common-options-nucleotide-query" element
     */
    public gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery addNewBlast4CommonOptionsNucleotideQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery target = null;
            target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery)get_store().add_element_user(BLAST4COMMONOPTIONSNUCLEOTIDEQUERY$0);
            return target;
        }
    }
    /**
     * An XML Blast4-common-options-nucleotide-query(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class Blast4CommonOptionsNucleotideQueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery
    {
        
        public Blast4CommonOptionsNucleotideQueryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STRANDTYPELIST$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "strand-type-list");
        private static final javax.xml.namespace.QName DISCOMEGABLASTOPTIONS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "disco-megablast-options");
        
        
        /**
         * Gets the "strand-type-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList getStrandTypeList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList)get_store().find_element_user(STRANDTYPELIST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "strand-type-list" element
         */
        public boolean isSetStrandTypeList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRANDTYPELIST$0) != 0;
            }
        }
        
        /**
         * Sets the "strand-type-list" element
         */
        public void setStrandTypeList(gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList strandTypeList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList)get_store().find_element_user(STRANDTYPELIST$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList)get_store().add_element_user(STRANDTYPELIST$0);
                }
                target.set(strandTypeList);
            }
        }
        
        /**
         * Appends and returns a new empty "strand-type-list" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList addNewStrandTypeList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList)get_store().add_element_user(STRANDTYPELIST$0);
                return target;
            }
        }
        
        /**
         * Unsets the "strand-type-list" element
         */
        public void unsetStrandTypeList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRANDTYPELIST$0, 0);
            }
        }
        
        /**
         * Gets the "disco-megablast-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions getDiscoMegablastOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions)get_store().find_element_user(DISCOMEGABLASTOPTIONS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "disco-megablast-options" element
         */
        public boolean isSetDiscoMegablastOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISCOMEGABLASTOPTIONS$2) != 0;
            }
        }
        
        /**
         * Sets the "disco-megablast-options" element
         */
        public void setDiscoMegablastOptions(gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions discoMegablastOptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions)get_store().find_element_user(DISCOMEGABLASTOPTIONS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions)get_store().add_element_user(DISCOMEGABLASTOPTIONS$2);
                }
                target.set(discoMegablastOptions);
            }
        }
        
        /**
         * Appends and returns a new empty "disco-megablast-options" element
         */
        public gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions addNewDiscoMegablastOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions target = null;
                target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions)get_store().add_element_user(DISCOMEGABLASTOPTIONS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "disco-megablast-options" element
         */
        public void unsetDiscoMegablastOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISCOMEGABLASTOPTIONS$2, 0);
            }
        }
        /**
         * An XML strand-type-list(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class StrandTypeListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.StrandTypeList
        {
            
            public StrandTypeListImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4STRANDTYPE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-strand-type");
            
            
            /**
             * Gets array of all "Blast4-strand-type" elements
             */
            public gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType[] getBlast4StrandTypeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(BLAST4STRANDTYPE$0, targetList);
                    gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType[] result = new gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Blast4-strand-type" element
             */
            public gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType getBlast4StrandTypeArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType)get_store().find_element_user(BLAST4STRANDTYPE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Blast4-strand-type" element
             */
            public int sizeOfBlast4StrandTypeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BLAST4STRANDTYPE$0);
                }
            }
            
            /**
             * Sets array of all "Blast4-strand-type" element
             */
            public void setBlast4StrandTypeArray(gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType[] blast4StrandTypeArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(blast4StrandTypeArray, BLAST4STRANDTYPE$0);
                }
            }
            
            /**
             * Sets ith "Blast4-strand-type" element
             */
            public void setBlast4StrandTypeArray(int i, gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType blast4StrandType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType)get_store().find_element_user(BLAST4STRANDTYPE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(blast4StrandType);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Blast4-strand-type" element
             */
            public gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType insertNewBlast4StrandType(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType)get_store().insert_element_user(BLAST4STRANDTYPE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Blast4-strand-type" element
             */
            public gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType addNewBlast4StrandType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4StrandTypeDocument.Blast4StrandType)get_store().add_element_user(BLAST4STRANDTYPE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Blast4-strand-type" element
             */
            public void removeBlast4StrandType(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BLAST4STRANDTYPE$0, i);
                }
            }
        }
        /**
         * An XML disco-megablast-options(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class DiscoMegablastOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.Blast4CommonOptionsNucleotideQueryDocument.Blast4CommonOptionsNucleotideQuery.DiscoMegablastOptions
        {
            
            public DiscoMegablastOptionsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BLAST4COMMONOPTIONSDISCONTIGUOUSMEGABLAST$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Blast4-common-options-discontiguous-megablast");
            
            
            /**
             * Gets the "Blast4-common-options-discontiguous-megablast" element
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast getBlast4CommonOptionsDiscontiguousMegablast()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast)get_store().find_element_user(BLAST4COMMONOPTIONSDISCONTIGUOUSMEGABLAST$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Blast4-common-options-discontiguous-megablast" element
             */
            public void setBlast4CommonOptionsDiscontiguousMegablast(gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast blast4CommonOptionsDiscontiguousMegablast)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast)get_store().find_element_user(BLAST4COMMONOPTIONSDISCONTIGUOUSMEGABLAST$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast)get_store().add_element_user(BLAST4COMMONOPTIONSDISCONTIGUOUSMEGABLAST$0);
                    }
                    target.set(blast4CommonOptionsDiscontiguousMegablast);
                }
            }
            
            /**
             * Appends and returns a new empty "Blast4-common-options-discontiguous-megablast" element
             */
            public gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast addNewBlast4CommonOptionsDiscontiguousMegablast()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast target = null;
                    target = (gov.nih.nlm.ncbi.www.Blast4CommonOptionsDiscontiguousMegablastDocument.Blast4CommonOptionsDiscontiguousMegablast)get_store().add_element_user(BLAST4COMMONOPTIONSDISCONTIGUOUSMEGABLAST$0);
                    return target;
                }
            }
        }
    }
}
