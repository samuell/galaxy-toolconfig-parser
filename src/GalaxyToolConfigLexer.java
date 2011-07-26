// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g 2011-07-26 16:31:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GalaxyToolConfigLexer extends Lexer {
    public static final int EOF=-1;
    public static final int IF=4;
    public static final int ELSE=5;
    public static final int ENDIF=6;
    public static final int CHAR=7;
    public static final int WS=8;

    // delegates
    // delegators

    public GalaxyToolConfigLexer() {;} 
    public GalaxyToolConfigLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GalaxyToolConfigLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g"; }

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:10:4: ( '#if' )
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:10:6: '#if'
            {
            match("#if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:13:6: ( '#else' )
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:13:8: '#else'
            {
            match("#else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:16:8: ( '#end if' )
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:16:10: '#end if'
            {
            match("#end if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:23:6: (~ ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:23:8: ~ ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:26:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:26:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:1:8: ( IF | ELSE | ENDIF | CHAR | WS )
        int alt1=5;
        int LA1_0 = input.LA(1);

        if ( (LA1_0=='#') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                alt1=1;
                }
                break;
            case 'e':
                {
                int LA1_5 = input.LA(3);

                if ( (LA1_5=='l') ) {
                    alt1=2;
                }
                else if ( (LA1_5=='n') ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                alt1=4;}

        }
        else if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\u001F')||(LA1_0>='!' && LA1_0<='\"')||(LA1_0>='$' && LA1_0<='\uFFFF')) ) {
            alt1=4;
        }
        else if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
            alt1=5;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;
        }
        switch (alt1) {
            case 1 :
                // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:1:10: IF
                {
                mIF(); 

                }
                break;
            case 2 :
                // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:1:13: ELSE
                {
                mELSE(); 

                }
                break;
            case 3 :
                // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:1:18: ENDIF
                {
                mENDIF(); 

                }
                break;
            case 4 :
                // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:1:24: CHAR
                {
                mCHAR(); 

                }
                break;
            case 5 :
                // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:1:29: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}