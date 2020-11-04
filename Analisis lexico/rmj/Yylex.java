/* The following code was generated by JFlex 1.7.0 */



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>rmj.lex</tt>
 */
class Yylex {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRINGVARIABLE = 2;
  public static final int STRINGPRINT = 4;
  public static final int PRINTMODE = 6;
  public static final int VARIABLE = 8;
  public static final int VALORVARIABLE = 10;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5, 5
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\5\1\23\1\24\1\24\1\24\22\0\1\5\1\0\1\34"+
    "\5\0\1\25\1\32\1\0\1\35\2\0\1\14\1\0\12\6\1\0"+
    "\1\37\1\0\1\33\3\0\22\27\1\7\7\27\1\30\1\36\1\31"+
    "\1\0\1\27\1\0\1\3\1\27\1\1\1\27\1\12\1\27\1\26"+
    "\1\27\1\21\2\27\1\2\1\13\1\22\1\15\1\17\1\27\1\20"+
    "\1\4\1\11\1\16\3\27\1\10\1\27\12\0\1\24\u1fa2\0\1\24"+
    "\1\24\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\5\0\1\1\5\2\1\3\1\4\1\0\1\5\1\6"+
    "\1\7\1\1\1\10\1\1\1\11\1\12\1\1\1\0"+
    "\1\13\1\1\1\14\1\15\2\0\1\16\4\0\1\17"+
    "\6\0\1\20\1\21\13\0\1\22\1\0\1\23\4\0"+
    "\1\16\1\22\20\0\1\16\24\0\1\24\2\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[104];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\40\0\100\0\140\0\200\0\240\0\300\0\340"+
    "\0\u0100\0\u0120\0\u0140\0\u0160\0\300\0\u0180\0\u01a0\0\300"+
    "\0\u01c0\0\300\0\u01e0\0\u0200\0\300\0\300\0\u0220\0\u0100"+
    "\0\u0240\0\u0260\0\300\0\300\0\u0280\0\u02a0\0\u02c0\0\u02e0"+
    "\0\u0300\0\u0320\0\u0340\0\300\0\u0360\0\u0200\0\u0380\0\u03a0"+
    "\0\u03c0\0\u03e0\0\300\0\300\0\u0400\0\u0420\0\u0440\0\u0460"+
    "\0\u0480\0\u04a0\0\u04c0\0\u04e0\0\u0500\0\u0520\0\u0540\0\u0560"+
    "\0\u0580\0\u05a0\0\u05c0\0\u05e0\0\u0600\0\u0620\0\u0640\0\u0660"+
    "\0\u0680\0\u06a0\0\u06c0\0\u06e0\0\u0700\0\u0720\0\u0740\0\u0760"+
    "\0\u0780\0\u07a0\0\u07c0\0\u07e0\0\u0800\0\u0820\0\u0840\0\u0860"+
    "\0\u0880\0\u08a0\0\u08c0\0\u08e0\0\u0900\0\u0920\0\u0940\0\u0960"+
    "\0\u0980\0\u09a0\0\u09c0\0\u09e0\0\u0a00\0\u0a20\0\u0a40\0\u0a60"+
    "\0\u0a80\0\u0aa0\0\u0ac0\0\u0ae0\0\u0b00\0\300\0\u0b20\0\u0b40";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[104];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\7\1\10\3\11\2\7\1\12\3\11\1\13\1\7"+
    "\6\11\3\7\2\11\10\7\34\14\1\15\1\14\1\16"+
    "\1\14\34\17\1\20\1\17\1\21\1\17\1\22\4\23"+
    "\1\24\6\23\1\22\6\23\1\24\2\22\2\23\2\22"+
    "\1\25\1\22\1\26\1\27\2\22\1\0\4\30\2\0"+
    "\5\30\1\0\6\30\3\0\2\30\11\0\4\31\1\32"+
    "\1\0\5\31\1\0\6\31\1\32\2\0\2\31\4\0"+
    "\1\33\1\27\1\0\1\34\41\0\1\30\1\35\2\30"+
    "\1\36\6\30\1\0\6\30\1\36\2\0\2\30\3\0"+
    "\1\37\5\0\4\30\1\36\6\30\1\0\6\30\1\36"+
    "\2\0\2\30\3\0\1\37\5\0\4\30\1\36\2\30"+
    "\1\40\1\41\2\30\1\0\6\30\1\36\2\0\2\30"+
    "\3\0\1\37\5\0\2\30\1\42\1\30\1\36\6\30"+
    "\1\0\6\30\1\36\2\0\2\30\3\0\1\37\4\0"+
    "\34\14\1\0\1\14\1\0\1\14\36\0\1\43\1\0"+
    "\34\17\1\0\1\17\1\0\1\17\34\0\1\44\1\0"+
    "\1\45\2\0\4\23\1\0\6\23\1\0\6\23\3\0"+
    "\2\23\15\0\1\46\15\0\1\46\11\0\1\27\7\0"+
    "\1\27\15\0\1\27\15\0\4\31\1\0\6\31\1\0"+
    "\6\31\3\0\2\31\15\0\1\32\15\0\1\32\11\0"+
    "\1\27\3\0\2\30\1\47\1\30\1\36\6\30\1\0"+
    "\6\30\1\36\2\0\2\30\3\0\1\37\11\0\1\36"+
    "\15\0\1\36\7\0\1\37\11\0\1\37\15\0\1\37"+
    "\15\0\3\30\1\50\1\36\6\30\1\0\6\30\1\36"+
    "\2\0\2\30\3\0\1\37\5\0\4\30\1\36\6\30"+
    "\1\0\3\30\1\51\2\30\1\36\2\0\2\30\3\0"+
    "\1\37\5\0\4\30\1\36\6\30\1\0\4\30\1\52"+
    "\1\30\1\36\2\0\2\30\3\0\1\37\40\0\1\53"+
    "\37\0\1\54\4\0\3\30\1\55\1\36\6\30\1\0"+
    "\6\30\1\36\2\0\2\30\3\0\1\37\5\0\4\30"+
    "\1\36\3\30\1\56\2\30\1\0\6\30\1\36\2\0"+
    "\2\30\3\0\1\37\5\0\4\30\1\36\6\30\1\0"+
    "\4\30\1\57\1\30\1\36\2\0\2\30\3\0\1\37"+
    "\5\0\4\30\1\36\6\30\1\0\5\30\1\60\1\36"+
    "\2\0\2\30\3\0\1\37\5\0\3\30\1\61\1\36"+
    "\6\30\1\0\6\30\1\36\2\0\2\30\3\0\1\37"+
    "\5\0\4\30\1\36\4\30\1\62\1\30\1\0\6\30"+
    "\1\36\2\0\2\30\3\0\1\37\5\0\4\30\1\36"+
    "\6\30\1\0\5\30\1\63\1\36\2\0\2\30\3\0"+
    "\1\37\5\0\4\30\1\64\6\30\1\0\6\30\1\64"+
    "\1\0\1\65\2\30\3\0\1\37\5\0\4\30\1\66"+
    "\6\30\1\0\6\30\1\66\2\0\2\30\3\0\1\37"+
    "\5\0\4\30\1\36\5\30\1\67\1\0\6\30\1\36"+
    "\2\0\2\30\3\0\1\37\5\0\4\30\1\36\6\30"+
    "\1\0\6\30\1\36\2\0\1\70\1\30\3\0\1\37"+
    "\11\0\1\64\15\0\1\64\1\0\1\65\5\0\1\37"+
    "\11\0\1\65\1\0\1\71\13\0\1\65\15\0\4\72"+
    "\1\66\6\72\1\0\6\72\1\66\2\0\2\72\3\0"+
    "\1\37\4\0\1\73\4\74\1\75\6\74\1\76\6\74"+
    "\1\36\1\0\1\73\2\74\3\73\1\77\4\73\1\0"+
    "\4\30\1\100\6\30\1\0\6\30\1\100\2\0\2\30"+
    "\3\0\1\37\15\0\1\101\27\0\4\72\1\0\6\72"+
    "\1\0\6\72\3\0\2\72\25\0\1\102\23\0\4\30"+
    "\1\36\6\30\1\0\1\103\5\30\1\36\2\0\2\30"+
    "\3\0\1\37\11\0\1\36\7\0\1\102\5\0\1\36"+
    "\7\0\1\37\21\0\1\104\27\0\1\37\7\0\1\102"+
    "\5\0\1\37\21\0\1\100\15\0\1\100\7\0\1\37"+
    "\24\0\1\105\35\0\1\106\22\0\4\30\1\36\6\30"+
    "\1\0\1\30\1\107\4\30\1\36\2\0\2\30\3\0"+
    "\1\37\22\0\1\110\42\0\1\111\27\0\1\112\27\0"+
    "\4\30\1\36\3\30\1\113\2\30\1\0\6\30\1\36"+
    "\2\0\2\30\3\0\1\37\15\0\1\114\50\0\1\115"+
    "\15\0\23\116\2\0\14\116\4\117\1\120\6\117\1\116"+
    "\6\117\1\36\1\0\1\116\2\117\3\116\1\121\20\116"+
    "\1\122\6\116\2\0\13\116\26\0\1\123\30\0\1\124"+
    "\21\0\4\30\1\36\6\30\1\0\2\30\1\125\3\30"+
    "\1\36\2\0\2\30\3\0\1\37\11\0\1\36\11\0"+
    "\1\124\3\0\1\36\7\0\1\37\11\0\1\37\11\0"+
    "\1\124\3\0\1\37\33\0\1\126\21\0\4\127\1\123"+
    "\1\0\5\127\1\0\6\127\1\123\2\0\2\127\30\0"+
    "\1\130\20\0\4\30\1\36\6\30\1\0\3\30\1\131"+
    "\2\30\1\36\2\0\2\30\3\0\1\37\24\0\1\132"+
    "\20\0\4\127\1\0\6\127\1\0\6\127\3\0\2\127"+
    "\1\133\30\0\1\134\17\0\4\30\1\36\6\30\1\0"+
    "\4\30\1\135\1\30\1\36\2\0\2\30\3\0\1\37"+
    "\25\0\1\136\47\0\1\137\30\0\1\140\16\0\4\30"+
    "\1\36\6\30\1\0\5\30\1\141\1\36\2\0\2\30"+
    "\3\0\1\37\26\0\1\142\47\0\1\7\16\0\1\143"+
    "\27\0\4\30\1\36\3\30\1\144\2\30\1\0\6\30"+
    "\1\36\2\0\2\30\3\0\1\37\15\0\1\145\33\0"+
    "\1\143\15\0\1\143\1\0\1\146\13\0\4\30\1\147"+
    "\6\30\1\0\6\30\1\147\1\0\1\146\2\30\3\0"+
    "\1\37\6\0\1\150\2\0\1\143\15\0\1\143\1\0"+
    "\1\146\17\0\1\147\15\0\1\147\1\0\1\146\5\0"+
    "\1\37\26\0\1\143\15\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2912];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\5\0\1\1\1\11\5\1\1\11\1\0\1\1\1\11"+
    "\1\1\1\11\2\1\2\11\1\1\1\0\2\1\2\11"+
    "\2\0\1\1\4\0\1\11\6\0\2\11\13\0\1\1"+
    "\1\0\1\1\4\0\2\1\20\0\1\1\24\0\1\11"+
    "\2\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[104];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    String nombreVar="";
    String valorVar="";
    //class Yytoken {}; //para evitar el error Yytoken 
    String variable_string="";


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 156) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            } 
            // fall through
          case 21: break;
          case 2: 
            { System.out.print(yytext());
            } 
            // fall through
          case 22: break;
          case 3: 
            { valorVar += yytext() ;
            } 
            // fall through
          case 23: break;
          case 4: 
            { yybegin(VALORVARIABLE);
            } 
            // fall through
          case 24: break;
          case 5: 
            { variable_string += yytext() ;
            } 
            // fall through
          case 25: break;
          case 6: 
            { System.out.print(variable_string);
                                yybegin(PRINTMODE);
            } 
            // fall through
          case 26: break;
          case 7: 
            { variable_string += '\\' ;
            } 
            // fall through
          case 27: break;
          case 8: 
            { System.out.print(TablaSimbolos.get(yytext()));
            } 
            // fall through
          case 28: break;
          case 9: 
            { System.out.print("\")");
                    yybegin(YYINITIAL);
            } 
            // fall through
          case 29: break;
          case 10: 
            { variable_string="";
                    yybegin(STRINGPRINT);
            } 
            // fall through
          case 30: break;
          case 11: 
            { valorVar += TablaSimbolos.get(yytext());
            } 
            // fall through
          case 31: break;
          case 12: 
            { yybegin(STRINGVARIABLE);
            } 
            // fall through
          case 32: break;
          case 13: 
            { System.out.print(nombreVar+" = "+valorVar+"\n");  //BORRAR
                                TablaSimbolos.put(nombreVar, valorVar); 
                                yybegin(YYINITIAL);
            } 
            // fall through
          case 33: break;
          case 14: 
            { nombreVar=yytext().replaceAll("\\s|=|\"", "") ; 
                                                        valorVar="";
                                                        yybegin(VALORVARIABLE);
            } 
            // fall through
          case 34: break;
          case 15: 
            { variable_string += '\\' ; variable_string += '\"' ;
            } 
            // fall through
          case 35: break;
          case 16: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzStartRead, 2);
            { valorVar += '\\' ; valorVar += '\\' ;
            } 
            // fall through
          case 36: break;
          case 17: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzStartRead, 2);
            { variable_string += '\\' ; variable_string += '\\' ;
            } 
            // fall through
          case 37: break;
          case 18: 
            { valorVar="";
                                        yybegin(VARIABLE);
            } 
            // fall through
          case 38: break;
          case 19: 
            { System.out.print(yytext()+"_rmj");
            } 
            // fall through
          case 39: break;
          case 20: 
            { System.out.print(yytext()+"\"");
                                                            yybegin(PRINTMODE);
            } 
            // fall through
          case 40: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}