import org.antlr.grammar.v3.*;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeAdaptor;

public class Test {
	public static void main(String[] args) throws RecognitionException {
		System.out.println("Beginning ...");
		String testString = "	  sam_to_bampy"
				+ "      --input1=$source.input1"
				+ "      --dbkey=${input1.metadata.dbkey}"
				+ "      #if $source.index_source == \"history\":"
				+ "        --ref_file=$source.ref_file" + "      #else"
				+ "        --ref_file=\"None\"" + "      #end if"
				+ "      --output1=$output1"
				+ "      --index_dir=${GALAXY_DATA_INDEX_DIR};";
		CharStream charStream = new ANTLRStringStream(testString);
		GalaxyToolConfigLexer lexer = new GalaxyToolConfigLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		GalaxyToolConfigParser parser = new GalaxyToolConfigParser(tokenStream);
		System.out.println("Starting ...");
		GalaxyToolConfigParser.command_return command = parser.command();
		System.out.println("Command: " + ((Tree)command.tree).toStringTree());
		System.out.println("Done!");
	}
}
