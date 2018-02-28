/*
 * An XML document type.
 * Localname: CoreDef
 * Namespace: http://www.ncbi.nlm.nih.gov
 * Java type: gov.nih.nlm.ncbi.www.CoreDefDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nlm.ncbi.www.impl;
/**
 * A document containing one CoreDef(@http://www.ncbi.nlm.nih.gov) element.
 *
 * This is a complex type.
 */
public class CoreDefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CoreDefDocument
{
    
    public CoreDefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COREDEF$0 = 
        new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "CoreDef");
    
    
    /**
     * Gets the "CoreDef" element
     */
    public gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef getCoreDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef target = null;
            target = (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef)get_store().find_element_user(COREDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CoreDef" element
     */
    public void setCoreDef(gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef coreDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef target = null;
            target = (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef)get_store().find_element_user(COREDEF$0, 0);
            if (target == null)
            {
                target = (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef)get_store().add_element_user(COREDEF$0);
            }
            target.set(coreDef);
        }
    }
    
    /**
     * Appends and returns a new empty "CoreDef" element
     */
    public gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef addNewCoreDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef target = null;
            target = (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef)get_store().add_element_user(COREDEF$0);
            return target;
        }
    }
    /**
     * An XML CoreDef(@http://www.ncbi.nlm.nih.gov).
     *
     * This is a complex type.
     */
    public static class CoreDefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef
    {
        
        public CoreDefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NBLOCKS$0 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "nblocks");
        private static final javax.xml.namespace.QName BLOCKS$2 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "blocks");
        private static final javax.xml.namespace.QName LOOPS$4 = 
            new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "loops");
        
        
        /**
         * Gets the "nblocks" element
         */
        public java.math.BigInteger getNblocks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NBLOCKS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "nblocks" element
         */
        public org.apache.xmlbeans.XmlInteger xgetNblocks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NBLOCKS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "nblocks" element
         */
        public void setNblocks(java.math.BigInteger nblocks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NBLOCKS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NBLOCKS$0);
                }
                target.setBigIntegerValue(nblocks);
            }
        }
        
        /**
         * Sets (as xml) the "nblocks" element
         */
        public void xsetNblocks(org.apache.xmlbeans.XmlInteger nblocks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NBLOCKS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NBLOCKS$0);
                }
                target.set(nblocks);
            }
        }
        
        /**
         * Gets the "blocks" element
         */
        public gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks getBlocks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks target = null;
                target = (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks)get_store().find_element_user(BLOCKS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "blocks" element
         */
        public void setBlocks(gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks blocks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks target = null;
                target = (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks)get_store().find_element_user(BLOCKS$2, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks)get_store().add_element_user(BLOCKS$2);
                }
                target.set(blocks);
            }
        }
        
        /**
         * Appends and returns a new empty "blocks" element
         */
        public gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks addNewBlocks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks target = null;
                target = (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks)get_store().add_element_user(BLOCKS$2);
                return target;
            }
        }
        
        /**
         * Gets the "loops" element
         */
        public gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops getLoops()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops target = null;
                target = (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops)get_store().find_element_user(LOOPS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "loops" element
         */
        public void setLoops(gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops loops)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops target = null;
                target = (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops)get_store().find_element_user(LOOPS$4, 0);
                if (target == null)
                {
                    target = (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops)get_store().add_element_user(LOOPS$4);
                }
                target.set(loops);
            }
        }
        
        /**
         * Appends and returns a new empty "loops" element
         */
        public gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops addNewLoops()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops target = null;
                target = (gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops)get_store().add_element_user(LOOPS$4);
                return target;
            }
        }
        /**
         * An XML blocks(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class BlocksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Blocks
        {
            
            public BlocksImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName COREBLOCK$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "CoreBlock");
            
            
            /**
             * Gets array of all "CoreBlock" elements
             */
            public gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock[] getCoreBlockArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(COREBLOCK$0, targetList);
                    gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock[] result = new gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "CoreBlock" element
             */
            public gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock getCoreBlockArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock)get_store().find_element_user(COREBLOCK$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "CoreBlock" element
             */
            public int sizeOfCoreBlockArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(COREBLOCK$0);
                }
            }
            
            /**
             * Sets array of all "CoreBlock" element
             */
            public void setCoreBlockArray(gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock[] coreBlockArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(coreBlockArray, COREBLOCK$0);
                }
            }
            
            /**
             * Sets ith "CoreBlock" element
             */
            public void setCoreBlockArray(int i, gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock coreBlock)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock)get_store().find_element_user(COREBLOCK$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(coreBlock);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "CoreBlock" element
             */
            public gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock insertNewCoreBlock(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock)get_store().insert_element_user(COREBLOCK$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "CoreBlock" element
             */
            public gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock addNewCoreBlock()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock target = null;
                    target = (gov.nih.nlm.ncbi.www.CoreBlockDocument.CoreBlock)get_store().add_element_user(COREBLOCK$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "CoreBlock" element
             */
            public void removeCoreBlock(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(COREBLOCK$0, i);
                }
            }
        }
        /**
         * An XML loops(@http://www.ncbi.nlm.nih.gov).
         *
         * This is a complex type.
         */
        public static class LoopsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nlm.ncbi.www.CoreDefDocument.CoreDef.Loops
        {
            
            public LoopsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName LOOPCONSTRAINT$0 = 
                new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov", "LoopConstraint");
            
            
            /**
             * Gets array of all "LoopConstraint" elements
             */
            public gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint[] getLoopConstraintArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(LOOPCONSTRAINT$0, targetList);
                    gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint[] result = new gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "LoopConstraint" element
             */
            public gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint getLoopConstraintArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint target = null;
                    target = (gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint)get_store().find_element_user(LOOPCONSTRAINT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "LoopConstraint" element
             */
            public int sizeOfLoopConstraintArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(LOOPCONSTRAINT$0);
                }
            }
            
            /**
             * Sets array of all "LoopConstraint" element
             */
            public void setLoopConstraintArray(gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint[] loopConstraintArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(loopConstraintArray, LOOPCONSTRAINT$0);
                }
            }
            
            /**
             * Sets ith "LoopConstraint" element
             */
            public void setLoopConstraintArray(int i, gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint loopConstraint)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint target = null;
                    target = (gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint)get_store().find_element_user(LOOPCONSTRAINT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(loopConstraint);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "LoopConstraint" element
             */
            public gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint insertNewLoopConstraint(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint target = null;
                    target = (gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint)get_store().insert_element_user(LOOPCONSTRAINT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "LoopConstraint" element
             */
            public gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint addNewLoopConstraint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint target = null;
                    target = (gov.nih.nlm.ncbi.www.LoopConstraintDocument.LoopConstraint)get_store().add_element_user(LOOPCONSTRAINT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "LoopConstraint" element
             */
            public void removeLoopConstraint(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(LOOPCONSTRAINT$0, i);
                }
            }
        }
    }
}
