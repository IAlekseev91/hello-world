package mapping
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import com.sap.aii.mapping.api.AbstractTransformation
import com.sap.aii.mapping.api.DynamicConfiguration;
import com.sap.aii.mapping.api.DynamicConfigurationKey;
import com.sap.aii.mapping.api.StreamTransformationException
import com.sap.aii.mapping.api.TransformationInput
import com.sap.aii.mapping.api.TransformationOutput
import com.sap.aii.mapping.value.api.XIVMService;
class GM_PIMON2019 extends AbstractTransformation{
	public void transform(TransformationInput tin, TransformationOutput tout){
		def source = new XmlSlurper().parse(tin.getInputPayload().getInputStream())

		def writer = new StringWriter()
		def builder = new groovy.xml.MarkupBuilder(writer)

		builder.



		tout.getOutputPayload().getOutputStream().write(writer.toString().getBytes())
		tout.copyInputAttachments()
	}
}