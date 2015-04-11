# Summary #
**xml-doclet** converts java-specific comments from source code into an XML representation.

Type information about the parsed source code, such as class, interface, and generics definitions, provides the structure of the XML content.

The project is a Maven-based project with integrated unit tests.

# Recent #
## May 3, 2008 ##
**FIX**: Annotation argument values were emitted directly 'as-is' from source.  Now the real value is emitted to the XML.

# Example #

If an entire source tree consisted of the below class,

```
package foo.bar;

/**
 * A test class
 */
public class Test
{
    /** A test method
     * @param arg1 A sample argument
     * @return Always returns 0
     */
    public int method1(String arg1)
    {
        return 0;
    } 
}
```

The resulting XML would be:

```
<?xml version="1.0" encoding="utf-8" ?>
<root>
  <packages>
    <package>
      <name>foo.bar</name>
      <comment><![CDATA[]]></comment>
      <classes>
        <class>
          <name>Test</name>
          <qualifiedName>foo.bar.Test</qualifiedName>
          <comment><![CDATA[A test class]]></comment>
          <isIncluded>true</isIncluded>
          <isSerializable>false</isSerializable>
          <isExternalizable>false</isExternalizable>
          <isAbstract>false</isAbstract>
          <isException>false</isException>
          <isError>false</isError>
          <scope>public</scope>
          <superClass>java.lang.Object</superClass>
          <constructors>
            <constructor>
              <name>Test</name>
              <comment><![CDATA[]]></comment>
            </constructor>
          </constructors>
          <methods>
            <method>
              <name>method1</name>
              <qualifiedName>foo.bar.Test.method1</qualifiedName>
              <comment><![CDATA[A test method]]></comment>
              <signature>(java.lang.String)</signature>
              <hash>8a8b9d921db976aeae3c17957b40e460</hash>
              <isFinal>false</isFinal>
              <isStatic>false</isStatic>
              <isNative>false</isNative>
              <isSynchronized>false</isSynchronized>
              <isVarArgs>false</isVarArgs>
              <scope>public</scope>
              <parameters>
                <parameter>
                  <name>arg1</name>
                  <comment><![CDATA[A sample argument]]></comment>
                  <type>
                    <qualifiedName>java.lang.String</qualifiedName>
                    <dimension></dimension>
                  </type>
                </parameter>
              </parameters>
              <result>
                <comment><![CDATA[Always returns 0]]></comment>
                <type>
                  <qualifiedName>int</qualifiedName>
                  <dimension></dimension>
                </type>
              </result>
            </method>
          </methods>
        </class>
      </classes>
    </package>
  </packages>
</root>
```