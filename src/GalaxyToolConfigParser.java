// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g 2011-07-26 16:31:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class GalaxyToolConfigParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IF", "ELSE", "ENDIF", "CHAR", "WS"
    };
    public static final int EOF=-1;
    public static final int IF=4;
    public static final int ELSE=5;
    public static final int ENDIF=6;
    public static final int CHAR=7;
    public static final int WS=8;

    // delegates
    // delegators


        public GalaxyToolConfigParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GalaxyToolConfigParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return GalaxyToolConfigParser.tokenNames; }
    public String getGrammarFileName() { return "/home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g"; }


    public static class command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:1: command : ( text )? IF ( text )? ELSE ( text )? ENDIF ( text )? ;
    public final GalaxyToolConfigParser.command_return command() throws RecognitionException {
        GalaxyToolConfigParser.command_return retval = new GalaxyToolConfigParser.command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF2=null;
        Token ELSE4=null;
        Token ENDIF6=null;
        GalaxyToolConfigParser.text_return text1 = null;

        GalaxyToolConfigParser.text_return text3 = null;

        GalaxyToolConfigParser.text_return text5 = null;

        GalaxyToolConfigParser.text_return text7 = null;


        Object IF2_tree=null;
        Object ELSE4_tree=null;
        Object ENDIF6_tree=null;

        try {
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:9: ( ( text )? IF ( text )? ELSE ( text )? ENDIF ( text )? )
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:11: ( text )? IF ( text )? ELSE ( text )? ENDIF ( text )?
            {
            root_0 = (Object)adaptor.nil();

            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:11: ( text )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==CHAR) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:11: text
                    {
                    pushFollow(FOLLOW_text_in_command17);
                    text1=text();

                    state._fsp--;

                    adaptor.addChild(root_0, text1.getTree());

                    }
                    break;

            }

            IF2=(Token)match(input,IF,FOLLOW_IF_in_command20); 
            IF2_tree = (Object)adaptor.create(IF2);
            adaptor.addChild(root_0, IF2_tree);

            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:20: ( text )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CHAR) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:20: text
                    {
                    pushFollow(FOLLOW_text_in_command22);
                    text3=text();

                    state._fsp--;

                    adaptor.addChild(root_0, text3.getTree());

                    }
                    break;

            }

            ELSE4=(Token)match(input,ELSE,FOLLOW_ELSE_in_command25); 
            ELSE4_tree = (Object)adaptor.create(ELSE4);
            adaptor.addChild(root_0, ELSE4_tree);

            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:31: ( text )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CHAR) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:31: text
                    {
                    pushFollow(FOLLOW_text_in_command27);
                    text5=text();

                    state._fsp--;

                    adaptor.addChild(root_0, text5.getTree());

                    }
                    break;

            }

            ENDIF6=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_command30); 
            ENDIF6_tree = (Object)adaptor.create(ENDIF6);
            adaptor.addChild(root_0, ENDIF6_tree);

            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:43: ( text )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CHAR) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:43: text
                    {
                    pushFollow(FOLLOW_text_in_command32);
                    text7=text();

                    state._fsp--;

                    adaptor.addChild(root_0, text7.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "command"

    public static class text_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "text"
    // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:7:1: text : ( CHAR )+ ;
    public final GalaxyToolConfigParser.text_return text() throws RecognitionException {
        GalaxyToolConfigParser.text_return retval = new GalaxyToolConfigParser.text_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHAR8=null;

        Object CHAR8_tree=null;

        try {
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:7:6: ( ( CHAR )+ )
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:7:8: ( CHAR )+
            {
            root_0 = (Object)adaptor.nil();

            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:7:8: ( CHAR )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==CHAR) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:7:8: CHAR
            	    {
            	    CHAR8=(Token)match(input,CHAR,FOLLOW_CHAR_in_text44); 
            	    CHAR8_tree = (Object)adaptor.create(CHAR8);
            	    adaptor.addChild(root_0, CHAR8_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "text"

    // Delegated rules


 

    public static final BitSet FOLLOW_text_in_command17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IF_in_command20 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_text_in_command22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ELSE_in_command25 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_text_in_command27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ENDIF_in_command30 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_text_in_command32 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_text44 = new BitSet(new long[]{0x0000000000000082L});

}