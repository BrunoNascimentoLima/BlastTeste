/*
 * An XML document type.
 * Localname: Cit-jour
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CitJourDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one Cit-jour(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CitJourDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitJourDocument
{
    
    public CitJourDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITJOUR$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Cit-jour");
    
    
    /**
     * Gets the "Cit-jour" element
     */
    public gov.nih.nlm.ncbi.www.CitJourDocument.CitJour getCitJour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitJourDocument.CitJour target = null;
            target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour)get_store().find_element_user(CITJOUR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Cit-jour" element
     */
    public void setCitJour(gov.nih.nlm.ncbi.www.CitJourDocument.CitJour citJour)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitJourDocument.CitJour target = null;
            target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour)get_store().find_element_user(CITJOUR$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour)get_store().add_element_user(CITJOUR$0);
            }
            target.set(citJour);
        }
    }
    
    /**
     * Appends and returns a new empty "Cit-jour" element
     */
    public gov.nih.nlm.ncbi.www.CitJourDocument.CitJour addNewCitJour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CitJourDocument.CitJour target = null;
            target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour)get_store().add_element_user(CITJOUR$0);
            return target;
        }
    }
    /**
     * An XML Cit-jour(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CitJourImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitJourDocument.CitJour
    {
        
        public CitJourImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLE$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "title");
        private static final javax.xml.namespace.QName IMP$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "imp");
        
        
        /**
         * Gets the "title" element
         */
        public gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Title getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Title target = null;
                target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Title)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "title" element
         */
        public void setTitle(gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Title title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Title target = null;
                target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Title)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Title)get_store().add_element_user(TITLE$0);
                }
                target.set(title);
            }
        }
        
        /**
         * Appends and returns a new empty "title" element
         */
        public gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Title addNewTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Title target = null;
                target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Title)get_store().add_element_user(TITLE$0);
                return target;
            }
        }
        
        /**
         * Gets the "imp" element
         */
        public gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Imp getImp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Imp target = null;
                target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Imp)get_store().find_element_user(IMP$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "imp" element
         */
        public void setImp(gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Imp imp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Imp target = null;
                target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Imp)get_store().find_element_user(IMP$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Imp)get_store().add_element_user(IMP$2);
                }
                target.set(imp);
            }
        }
        
        /**
         * Appends and returns a new empty "imp" element
         */
        public gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Imp addNewImp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Imp target = null;
                target = (gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Imp)get_store().add_element_user(IMP$2);
                return target;
            }
        }
        /**
         * An XML title(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class TitleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Title
        {
            
            public TitleImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TITLE$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Title");
            
            
            /**
             * Gets the "Title" element
             */
            public gov.nih.nlm.ncbi.www.TitleDocument.Title getTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TitleDocument.Title target = null;
                    target = (gov.nih.nlm.ncbi.www.TitleDocument.Title)get_store().find_element_user(TITLE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Title" element
             */
            public void setTitle(gov.nih.nlm.ncbi.www.TitleDocument.Title title)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TitleDocument.Title target = null;
                    target = (gov.nih.nlm.ncbi.www.TitleDocument.Title)get_store().find_element_user(TITLE$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.TitleDocument.Title)get_store().add_element_user(TITLE$0);
                    }
                    target.set(title);
                }
            }
            
            /**
             * Appends and returns a new empty "Title" element
             */
            public gov.nih.nlm.ncbi.www.TitleDocument.Title addNewTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.TitleDocument.Title target = null;
                    target = (gov.nih.nlm.ncbi.www.TitleDocument.Title)get_store().add_element_user(TITLE$0);
                    return target;
                }
            }
        }
        /**
         * An XML imp(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class ImpImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CitJourDocument.CitJour.Imp
        {
            
            public ImpImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName IMPRINT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "Imprint");
            
            
            /**
             * Gets the "Imprint" element
             */
            public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint getImprint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ImprintDocument.Imprint target = null;
                    target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint)get_store().find_element_user(IMPRINT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Imprint" element
             */
            public void setImprint(gov.nih.nlm.ncbi.www.ImprintDocument.Imprint imprint)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ImprintDocument.Imprint target = null;
                    target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint)get_store().find_element_user(IMPRINT$0, 0);
                    if (target == null)
                    {
                      target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint)get_store().add_element_user(IMPRINT$0);
                    }
                    target.set(imprint);
                }
            }
            
            /**
             * Appends and returns a new empty "Imprint" element
             */
            public gov.nih.nlm.ncbi.www.ImprintDocument.Imprint addNewImprint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.ImprintDocument.Imprint target = null;
                    target = (gov.nih.nlm.ncbi.www.ImprintDocument.Imprint)get_store().add_element_user(IMPRINT$0);
                    return target;
                }
            }
        }
    }
}
