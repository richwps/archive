/*
 * An XML document type.
 * Localname: Parser
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.ParserDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps.impl;
/**
 * A document containing one Parser(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public class ParserDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.ParserDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParserDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARSER$0 = 
        new javax.xml.namespace.QName("http://n52.org/wps", "Parser");
    
    
    /**
     * Gets the "Parser" element
     */
    public org.n52.wps.ParserDocument.Parser getParser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.ParserDocument.Parser target = null;
            target = (org.n52.wps.ParserDocument.Parser)get_store().find_element_user(PARSER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Parser" element
     */
    public void setParser(org.n52.wps.ParserDocument.Parser parser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.ParserDocument.Parser target = null;
            target = (org.n52.wps.ParserDocument.Parser)get_store().find_element_user(PARSER$0, 0);
            if (target == null)
            {
                target = (org.n52.wps.ParserDocument.Parser)get_store().add_element_user(PARSER$0);
            }
            target.set(parser);
        }
    }
    
    /**
     * Appends and returns a new empty "Parser" element
     */
    public org.n52.wps.ParserDocument.Parser addNewParser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.n52.wps.ParserDocument.Parser target = null;
            target = (org.n52.wps.ParserDocument.Parser)get_store().add_element_user(PARSER$0);
            return target;
        }
    }
    /**
     * An XML Parser(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public static class ParserImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.n52.wps.ParserDocument.Parser
    {
        private static final long serialVersionUID = 1L;
        
        public ParserImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROPERTY$0 = 
            new javax.xml.namespace.QName("http://n52.org/wps", "Property");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName CLASSNAME$4 = 
            new javax.xml.namespace.QName("", "className");
        private static final javax.xml.namespace.QName ACTIVE$6 = 
            new javax.xml.namespace.QName("", "active");
        
        
        /**
         * Gets array of all "Property" elements
         */
        public org.n52.wps.PropertyDocument.Property[] getPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROPERTY$0, targetList);
                org.n52.wps.PropertyDocument.Property[] result = new org.n52.wps.PropertyDocument.Property[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Property" element
         */
        public org.n52.wps.PropertyDocument.Property getPropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.PropertyDocument.Property target = null;
                target = (org.n52.wps.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Property" element
         */
        public int sizeOfPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTY$0);
            }
        }
        
        /**
         * Sets array of all "Property" element
         */
        public void setPropertyArray(org.n52.wps.PropertyDocument.Property[] propertyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(propertyArray, PROPERTY$0);
            }
        }
        
        /**
         * Sets ith "Property" element
         */
        public void setPropertyArray(int i, org.n52.wps.PropertyDocument.Property property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.PropertyDocument.Property target = null;
                target = (org.n52.wps.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(property);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Property" element
         */
        public org.n52.wps.PropertyDocument.Property insertNewProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.PropertyDocument.Property target = null;
                target = (org.n52.wps.PropertyDocument.Property)get_store().insert_element_user(PROPERTY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Property" element
         */
        public org.n52.wps.PropertyDocument.Property addNewProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.PropertyDocument.Property target = null;
                target = (org.n52.wps.PropertyDocument.Property)get_store().add_element_user(PROPERTY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Property" element
         */
        public void removeProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTY$0, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.n52.wps.ParserDocument.Parser.Name xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ParserDocument.Parser.Name target = null;
                target = (org.n52.wps.ParserDocument.Parser.Name)get_store().find_attribute_user(NAME$2);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.n52.wps.ParserDocument.Parser.Name name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ParserDocument.Parser.Name target = null;
                target = (org.n52.wps.ParserDocument.Parser.Name)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.n52.wps.ParserDocument.Parser.Name)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "className" attribute
         */
        public java.lang.String getClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSNAME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "className" attribute
         */
        public org.n52.wps.ParserDocument.Parser.ClassName xgetClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ParserDocument.Parser.ClassName target = null;
                target = (org.n52.wps.ParserDocument.Parser.ClassName)get_store().find_attribute_user(CLASSNAME$4);
                return target;
            }
        }
        
        /**
         * Sets the "className" attribute
         */
        public void setClassName(java.lang.String className)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSNAME$4);
                }
                target.setStringValue(className);
            }
        }
        
        /**
         * Sets (as xml) the "className" attribute
         */
        public void xsetClassName(org.n52.wps.ParserDocument.Parser.ClassName className)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.n52.wps.ParserDocument.Parser.ClassName target = null;
                target = (org.n52.wps.ParserDocument.Parser.ClassName)get_store().find_attribute_user(CLASSNAME$4);
                if (target == null)
                {
                    target = (org.n52.wps.ParserDocument.Parser.ClassName)get_store().add_attribute_user(CLASSNAME$4);
                }
                target.set(className);
            }
        }
        
        /**
         * Gets the "active" attribute
         */
        public boolean getActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVE$6);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "active" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ACTIVE$6);
                return target;
            }
        }
        
        /**
         * Sets the "active" attribute
         */
        public void setActive(boolean active)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIVE$6);
                }
                target.setBooleanValue(active);
            }
        }
        
        /**
         * Sets (as xml) the "active" attribute
         */
        public void xsetActive(org.apache.xmlbeans.XmlBoolean active)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ACTIVE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ACTIVE$6);
                }
                target.set(active);
            }
        }
        /**
         * An XML name(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.ParserDocument$Parser$Name.
         */
        public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.n52.wps.ParserDocument.Parser.Name
        {
            private static final long serialVersionUID = 1L;
            
            public NameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected NameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML className(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.ParserDocument$Parser$ClassName.
         */
        public static class ClassNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.n52.wps.ParserDocument.Parser.ClassName
        {
            private static final long serialVersionUID = 1L;
            
            public ClassNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ClassNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
