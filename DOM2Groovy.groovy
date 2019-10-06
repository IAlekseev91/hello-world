package test

import groovy.xml.MarkupBuilder
import org.codehaus.groovy.tools.xml.DomToGroovy
def xml = """
"""

def builder = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder()

def inputStream = new ByteArrayInputStream(xml.bytes)
def document = builder.parse(inputStream)
def output = new StringWriter()
def converter = new DomToGroovy(new PrintWriter(output)) 
converter.print(document) 

print output.toString()
