package frontend;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;

import ast.*;
import grammar.*;

public class TigParser {

	protected final ASTfactory factory = new ASTfactory();

  public ASTprogram getProg(File file) throws ParseException {
		try {
      CharStream in = CharStreams.fromFileName(file.getAbsolutePath());
			// ANTLRInputStream in = new ANTLRInputStream(input.getText());
			// flux de caractères -> analyseur lexical
			TiggrammarLexer lexer = new TiggrammarLexer(in);
			// analyseur lexical -> flux de tokens
			CommonTokenStream tokens =	new CommonTokenStream(lexer);
			// flux tokens -> analyseur syntaxique
			TiggrammarParser parser =	new TiggrammarParser(tokens);
			// démarage de l'analyse syntaxique
			TiggrammarParser.ProgContext tree = parser.prog();
			// parcours de l'arbre syntaxique et appels du Listener
			ParseTreeWalker walker = new ParseTreeWalker();
			TigListener extractor = new TigListener(factory);
			walker.walk(extractor, tree);
			return tree.node;
		} catch (Exception e) {
			throw new ParseException(e);
		}
  }
}
