import java.io.File
import groovy.xml.MarkupBuilder
class readLineByLine {
static main(args) {

def varStringWriter = new StringWriter();
def varXMLBuilder   = new MarkupBuilder(varStringWriter);

String lineItems = "20171118AAAB0009C707000001111       +1234567.11    OSuser - ABC Primary                      00  +7654321.22"+'\n'+
'20161118AAAB0009C707000001111       +1234567.11    )Suser - ABC Primary                      00  +7654321.22  ' + '\n'+
"20151118AAAB0009C707000001111       +1234567.11    OSuser - ABC Primary                      00  +7654321.22      "
String newItem ;
lineItems.eachLine{

line -> newItem = line ;
String newItem1 = newItem.substring(0,29);
String newItem2 = newItem.substring(30,37);
String newItem3 = newItem.substring(37,48);

varXMLBuilder.RECORD{
node1(newItem1);
node2(newItem2);
node3(newItem3);
}
}
def xml = varStringWriter.toString();
xml="<RECORDS>"+xml+"</RECORDS>" ;

println xml ;
}
}