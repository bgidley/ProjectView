package org.apache.tapestry5.internal.antlr;
// $ANTLR 3.1.1 org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g 2009-12-10 22:52:32

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

public class PropertyExpressionLexer extends
		org.apache.tapestry5.internal.antlr.BaseLexer {
	public static final int INTEGER = 4;
	public static final int SIGN = 10;
	public static final int RANGEOP = 6;
	public static final int E = 19;
	public static final int F = 20;
	public static final int A = 18;
	public static final int L = 23;
	public static final int N = 24;
	public static final int LETTER = 8;
	public static final int H = 21;
	public static final int NULL = 29;
	public static final int I = 22;
	public static final int U = 28;
	public static final int T = 27;
	public static final int DEREF = 5;
	public static final int BANG = 16;
	public static final int S = 26;
	public static final int R = 25;
	public static final int EOF = -1;
	public static final int TRUE = 30;
	public static final int LPAREN = 11;
	public static final int LBRACKET = 13;
	public static final int RPAREN = 12;
	public static final int QUOTE = 17;
	public static final int WS = 35;
	public static final int SAFEDEREF = 34;
	public static final int DECIMAL = 7;
	public static final int COMMA = 15;
	public static final int IDENTIFIER = 33;
	public static final int THIS = 32;
	public static final int NUMBER_OR_RANGEOP = 37;
	public static final int DIGIT = 9;
	public static final int RBRACKET = 14;
	public static final int FALSE = 31;
	public static final int STRING = 36;

	// delegates
	// delegators

	public PropertyExpressionLexer() {
		;
	}

	public PropertyExpressionLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public PropertyExpressionLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);

	}

	@Override
	public String getGrammarFileName() {
		return "org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g";
	}

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:31:2:
			// ()
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:31:4:
			{
				this.getClass(); /*
								 * Fix java.lang.VerifyError: Stack size too
								 * large
								 */

			}

		} finally {
		}
	}

	// $ANTLR end "INTEGER"

	// $ANTLR start "DEREF"
	public final void mDEREF() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:35:2:
			// ()
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:35:4:
			{
				this.getClass(); /*
								 * Fix java.lang.VerifyError: Stack size too
								 * large
								 */

			}

		} finally {
		}
	}

	// $ANTLR end "DEREF"

	// $ANTLR start "RANGEOP"
	public final void mRANGEOP() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:39:2:
			// ()
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:39:4:
			{
				this.getClass(); /*
								 * Fix java.lang.VerifyError: Stack size too
								 * large
								 */

			}

		} finally {
		}
	}

	// $ANTLR end "RANGEOP"

	// $ANTLR start "DECIMAL"
	public final void mDECIMAL() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:43:2:
			// ()
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:43:4:
			{
				this.getClass(); /*
								 * Fix java.lang.VerifyError: Stack size too
								 * large
								 */

			}

		} finally {
		}
	}

	// $ANTLR end "DECIMAL"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:46:2:
			// ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:46:4:
			// ( 'a' .. 'z' | 'A' .. 'Z' )
			{
				if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z')
						|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:48:2:
			// ( '0' .. '9' )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:48:4:
			// '0' .. '9'
			{
				matchRange('0', '9');

			}

		} finally {
		}
	}

	// $ANTLR end "DIGIT"

	// $ANTLR start "SIGN"
	public final void mSIGN() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:50:2:
			// ( ( '+' | '-' ) )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:50:4:
			// ( '+' | '-' )
			{
				if (input.LA(1) == '+' || input.LA(1) == '-') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "SIGN"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:51:9:
			// ( '(' )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:51:11:
			// '('
			{
				match('(');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:52:9:
			// ( ')' )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:52:11:
			// ')'
			{
				match(')');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACKET"
	public final void mLBRACKET() throws RecognitionException {
		try {
			int _type = LBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:53:9:
			// ( '[' )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:53:11:
			// '['
			{
				match('[');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "LBRACKET"

	// $ANTLR start "RBRACKET"
	public final void mRBRACKET() throws RecognitionException {
		try {
			int _type = RBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:54:9:
			// ( ']' )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:54:11:
			// ']'
			{
				match(']');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RBRACKET"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:55:7:
			// ( ',' )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:55:9:
			// ','
			{
				match(',');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "COMMA"

	// $ANTLR start "BANG"
	public final void mBANG() throws RecognitionException {
		try {
			int _type = BANG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:56:9:
			// ( '!' )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:56:11:
			// '!'
			{
				match('!');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "BANG"

	// $ANTLR start "QUOTE"
	public final void mQUOTE() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:59:2:
			// ( '\\'' )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:59:4:
			// '\\''
			{
				match('\'');

			}

		} finally {
		}
	}

	// $ANTLR end "QUOTE"

	// $ANTLR start "A"
	public final void mA() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:64:2:
			// ( ( 'a' | 'A' ) )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:64:4:
			// ( 'a' | 'A' )
			{
				if (input.LA(1) == 'A' || input.LA(1) == 'a') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "A"

	// $ANTLR start "E"
	public final void mE() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:66:2:
			// ( ( 'e' | 'E' ) )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:66:4:
			// ( 'e' | 'E' )
			{
				if (input.LA(1) == 'E' || input.LA(1) == 'e') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "E"

	// $ANTLR start "F"
	public final void mF() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:68:2:
			// ( ( 'f' | 'F' ) )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:68:4:
			// ( 'f' | 'F' )
			{
				if (input.LA(1) == 'F' || input.LA(1) == 'f') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "F"

	// $ANTLR start "H"
	public final void mH() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:70:2:
			// ( ( 'h' | 'H' ) )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:70:4:
			// ( 'h' | 'H' )
			{
				if (input.LA(1) == 'H' || input.LA(1) == 'h') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "H"

	// $ANTLR start "I"
	public final void mI() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:72:2:
			// ( ( 'i' | 'I' ) )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:72:4:
			// ( 'i' | 'I' )
			{
				if (input.LA(1) == 'I' || input.LA(1) == 'i') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "I"

	// $ANTLR start "L"
	public final void mL() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:74:2:
			// ( ( 'l' | 'L' ) )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:74:5:
			// ( 'l' | 'L' )
			{
				if (input.LA(1) == 'L' || input.LA(1) == 'l') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "L"

	// $ANTLR start "N"
	public final void mN() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:76:2:
			// ( ( 'n' | 'N' ) )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:76:4:
			// ( 'n' | 'N' )
			{
				if (input.LA(1) == 'N' || input.LA(1) == 'n') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "N"

	// $ANTLR start "R"
	public final void mR() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:78:2:
			// ( ( 'r' | 'R' ) )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:78:4:
			// ( 'r' | 'R' )
			{
				if (input.LA(1) == 'R' || input.LA(1) == 'r') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "R"

	// $ANTLR start "S"
	public final void mS() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:80:2:
			// ( ( 's' | 'S' ) )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:80:4:
			// ( 's' | 'S' )
			{
				if (input.LA(1) == 'S' || input.LA(1) == 's') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "S"

	// $ANTLR start "T"
	public final void mT() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:82:2:
			// ( ( 't' | 'T' ) )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:82:4:
			// ( 't' | 'T' )
			{
				if (input.LA(1) == 'T' || input.LA(1) == 't') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "T"

	// $ANTLR start "U"
	public final void mU() throws RecognitionException {
		try {
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:84:2:
			// ( ( 'u' | 'U' ) )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:84:4:
			// ( 'u' | 'U' )
			{
				if (input.LA(1) == 'U' || input.LA(1) == 'u') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "U"

	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:88:7:
			// ( N U L L )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:88:9:
			// N U L L
			{
				mN();
				mU();
				mL();
				mL();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "NULL"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:89:6:
			// ( T R U E )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:89:8:
			// T R U E
			{
				mT();
				mR();
				mU();
				mE();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:90:7:
			// ( F A L S E )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:90:9:
			// F A L S E
			{
				mF();
				mA();
				mL();
				mS();
				mE();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "FALSE"

	// $ANTLR start "THIS"
	public final void mTHIS() throws RecognitionException {
		try {
			int _type = THIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:91:6:
			// ( T H I S )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:91:8:
			// T H I S
			{
				mT();
				mH();
				mI();
				mS();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "THIS"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:94:2:
			// ( LETTER ( LETTER | DIGIT | '_' )* )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:94:4:
			// LETTER ( LETTER | DIGIT | '_' )*
			{
				mLETTER();
				// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:94:11:
				// ( LETTER | DIGIT | '_' )*
				loop1: do {
					int alt1 = 2;
					int LA1_0 = input.LA(1);

					if (((LA1_0 >= '0' && LA1_0 <= '9')
							|| (LA1_0 >= 'A' && LA1_0 <= 'Z') || LA1_0 == '_' || (LA1_0 >= 'a' && LA1_0 <= 'z'))) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
						// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:
					{
						if ((input.LA(1) >= '0' && input.LA(1) <= '9')
								|| (input.LA(1) >= 'A' && input.LA(1) <= 'Z')
								|| input.LA(1) == '_'
								|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						break loop1;
					}
				} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "SAFEDEREF"
	public final void mSAFEDEREF() throws RecognitionException {
		try {
			int _type = SAFEDEREF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:100:2:
			// ( '?.' )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:100:5:
			// '?.'
			{
				match("?.");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "SAFEDEREF"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:102:5:
			// ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:102:7:
			// ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
				// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:102:7:
				// ( ' ' | '\\t' | '\\n' | '\\r' )+
				int cnt2 = 0;
				loop2: do {
					int alt2 = 2;
					int LA2_0 = input.LA(1);

					if (((LA2_0 >= '\t' && LA2_0 <= '\n') || LA2_0 == '\r' || LA2_0 == ' ')) {
						alt2 = 1;
					}

					switch (alt2) {
					case 1:
						// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:
					{
						if ((input.LA(1) >= '\t' && input.LA(1) <= '\n')
								|| input.LA(1) == '\r' || input.LA(1) == ' ') {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						if (cnt2 >= 1)
							break loop2;
						EarlyExitException eee = new EarlyExitException(2,
								input);
						throw eee;
					}
					cnt2++;
				} while (true);

				skip();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:107:2:
			// ( QUOTE ( options {greedy=false; } : . )* QUOTE )
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:107:4:
			// QUOTE ( options {greedy=false; } : . )* QUOTE
			{
				mQUOTE();
				// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:107:10:
				// ( options {greedy=false; } : . )*
				loop3: do {
					int alt3 = 2;
					int LA3_0 = input.LA(1);

					if ((LA3_0 == '\'')) {
						alt3 = 2;
					} else if (((LA3_0 >= '\u0000' && LA3_0 <= '&') || (LA3_0 >= '(' && LA3_0 <= '\uFFFF'))) {
						alt3 = 1;
					}

					switch (alt3) {
					case 1:
						// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:107:37:
						// .
					{
						matchAny();

					}
						break;

					default:
						break loop3;
					}
				} while (true);

				mQUOTE();
				setText(getText().substring(1, getText().length() - 1));

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "STRING"

	// $ANTLR start "NUMBER_OR_RANGEOP"
	public final void mNUMBER_OR_RANGEOP() throws RecognitionException {
		try {
			int _type = NUMBER_OR_RANGEOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:120:2:
			// ( ( SIGN )? ( DIGIT )+ ({...}? => '.' ( DIGIT )* | ) | SIGN '.' (
			// DIGIT )+ | '.' ( ( DIGIT )+ | '.' | ) )
			int alt11 = 3;
			switch (input.LA(1)) {
			case '+':
			case '-': {
				int LA11_1 = input.LA(2);

				if (((LA11_1 >= '0' && LA11_1 <= '9'))) {
					alt11 = 1;
				} else if ((LA11_1 == '.')) {
					alt11 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException("",
							11, 1, input);

					throw nvae;
				}
			}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9': {
				alt11 = 1;
			}
				break;
			case '.': {
				alt11 = 3;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 11, 0,
						input);

				throw nvae;
			}

			switch (alt11) {
			case 1:
				// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:120:4:
				// ( SIGN )? ( DIGIT )+ ({...}? => '.' ( DIGIT )* | )
			{
				// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:120:4:
				// ( SIGN )?
				int alt4 = 2;
				int LA4_0 = input.LA(1);

				if ((LA4_0 == '+' || LA4_0 == '-')) {
					alt4 = 1;
				}
				switch (alt4) {
				case 1:
					// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:120:4:
					// SIGN
				{
					mSIGN();

				}
					break;

				}

				// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:120:10:
				// ( DIGIT )+
				int cnt5 = 0;
				loop5: do {
					int alt5 = 2;
					int LA5_0 = input.LA(1);

					if (((LA5_0 >= '0' && LA5_0 <= '9'))) {
						alt5 = 1;
					}

					switch (alt5) {
					case 1:
						// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:120:10:
						// DIGIT
					{
						mDIGIT();

					}
						break;

					default:
						if (cnt5 >= 1)
							break loop5;
						EarlyExitException eee = new EarlyExitException(5,
								input);
						throw eee;
					}
					cnt5++;
				} while (true);

				// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:121:3:
				// ({...}? => '.' ( DIGIT )* | )
				int alt7 = 2;
				int LA7_0 = input.LA(1);

				if ((LA7_0 == '.') && ((input.LA(2) != '.'))) {
					alt7 = 1;
				} else {
					alt7 = 2;
				}
				switch (alt7) {
				case 1:
					// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:122:4:
					// {...}? => '.' ( DIGIT )*
				{
					if (!((input.LA(2) != '.'))) {
						throw new FailedPredicateException(input,
								"NUMBER_OR_RANGEOP", " input.LA(2) != '.' ");
					}
					match('.');
					// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:122:35:
					// ( DIGIT )*
					loop6: do {
						int alt6 = 2;
						int LA6_0 = input.LA(1);

						if (((LA6_0 >= '0' && LA6_0 <= '9'))) {
							alt6 = 1;
						}

						switch (alt6) {
						case 1:
							// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:122:35:
							// DIGIT
						{
							mDIGIT();

						}
							break;

						default:
							break loop6;
						}
					} while (true);

					_type = DECIMAL;
					stripLeadingPlus();

				}
					break;
				case 2:
					// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:123:6:
				{
					_type = INTEGER;
					stripLeadingPlus();

				}
					break;

				}

			}
				break;
			case 2:
				// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:126:4:
				// SIGN '.' ( DIGIT )+
			{
				mSIGN();
				match('.');
				// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:126:13:
				// ( DIGIT )+
				int cnt8 = 0;
				loop8: do {
					int alt8 = 2;
					int LA8_0 = input.LA(1);

					if (((LA8_0 >= '0' && LA8_0 <= '9'))) {
						alt8 = 1;
					}

					switch (alt8) {
					case 1:
						// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:126:13:
						// DIGIT
					{
						mDIGIT();

					}
						break;

					default:
						if (cnt8 >= 1)
							break loop8;
						EarlyExitException eee = new EarlyExitException(8,
								input);
						throw eee;
					}
					cnt8++;
				} while (true);

				_type = DECIMAL;
				stripLeadingPlus();

			}
				break;
			case 3:
				// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:128:4:
				// '.' ( ( DIGIT )+ | '.' | )
			{
				match('.');
				// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:129:3:
				// ( ( DIGIT )+ | '.' | )
				int alt10 = 3;
				switch (input.LA(1)) {
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9': {
					alt10 = 1;
				}
					break;
				case '.': {
					alt10 = 2;
				}
					break;
				default:
					alt10 = 3;
				}

				switch (alt10) {
				case 1:
					// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:130:4:
					// ( DIGIT )+
				{
					// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:130:4:
					// ( DIGIT )+
					int cnt9 = 0;
					loop9: do {
						int alt9 = 2;
						int LA9_0 = input.LA(1);

						if (((LA9_0 >= '0' && LA9_0 <= '9'))) {
							alt9 = 1;
						}

						switch (alt9) {
						case 1:
							// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:130:4:
							// DIGIT
						{
							mDIGIT();

						}
							break;

						default:
							if (cnt9 >= 1)
								break loop9;
							EarlyExitException eee = new EarlyExitException(9,
									input);
							throw eee;
						}
						cnt9++;
					} while (true);

					_type = DECIMAL;
					stripLeadingPlus();

				}
					break;
				case 2:
					// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:131:6:
					// '.'
				{
					match('.');
					_type = RANGEOP;

				}
					break;
				case 3:
					// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:132:6:
				{
					_type = DEREF;

				}
					break;

				}

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "NUMBER_OR_RANGEOP"

	@Override
	public void mTokens() throws RecognitionException {
		// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:1:8: (
		// LPAREN | RPAREN | LBRACKET | RBRACKET | COMMA | BANG | NULL | TRUE |
		// FALSE | THIS | IDENTIFIER | SAFEDEREF | WS | STRING |
		// NUMBER_OR_RANGEOP )
		int alt12 = 15;
		alt12 = dfa12.predict(input);
		switch (alt12) {
		case 1:
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:1:10:
			// LPAREN
		{
			mLPAREN();

		}
			break;
		case 2:
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:1:17:
			// RPAREN
		{
			mRPAREN();

		}
			break;
		case 3:
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:1:24:
			// LBRACKET
		{
			mLBRACKET();

		}
			break;
		case 4:
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:1:33:
			// RBRACKET
		{
			mRBRACKET();

		}
			break;
		case 5:
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:1:42:
			// COMMA
		{
			mCOMMA();

		}
			break;
		case 6:
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:1:48:
			// BANG
		{
			mBANG();

		}
			break;
		case 7:
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:1:53:
			// NULL
		{
			mNULL();

		}
			break;
		case 8:
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:1:58:
			// TRUE
		{
			mTRUE();

		}
			break;
		case 9:
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:1:63:
			// FALSE
		{
			mFALSE();

		}
			break;
		case 10:
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:1:69:
			// THIS
		{
			mTHIS();

		}
			break;
		case 11:
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:1:74:
			// IDENTIFIER
		{
			mIDENTIFIER();

		}
			break;
		case 12:
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:1:85:
			// SAFEDEREF
		{
			mSAFEDEREF();

		}
			break;
		case 13:
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:1:95:
			// WS
		{
			mWS();

		}
			break;
		case 14:
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:1:98:
			// STRING
		{
			mSTRING();

		}
			break;
		case 15:
			// org/apache/tapestry5/internal/antlr/PropertyExpressionLexer.g:1:105:
			// NUMBER_OR_RANGEOP
		{
			mNUMBER_OR_RANGEOP();

		}
			break;

		}

	}

	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA12_eotS = "\7\uffff\3\12\5\uffff\10\12\1\33\1\34\1\35\1\12\3\uffff\1\37\1\uffff";
	static final String DFA12_eofS = "\40\uffff";
	static final String DFA12_minS = "\1\11\6\uffff\1\125\1\110\1\101\5\uffff\1\114\1\125\1\111\2\114"
			+ "\1\105\2\123\3\60\1\105\3\uffff\1\60\1\uffff";
	static final String DFA12_maxS = "\1\172\6\uffff\1\165\1\162\1\141\5\uffff\1\154\1\165\1\151\2\154"
			+ "\1\145\2\163\3\172\1\145\3\uffff\1\172\1\uffff";
	static final String DFA12_acceptS = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff\1\13\1\14\1\15\1\16\1\17"
			+ "\14\uffff\1\7\1\10\1\12\1\uffff\1\11";
	static final String DFA12_specialS = "\40\uffff}>";
	static final String[] DFA12_transitionS = {
			"\2\14\2\uffff\1\14\22\uffff\1\14\1\6\5\uffff\1\15\1\1\1\2\1"
					+ "\uffff\1\16\1\5\2\16\1\uffff\12\16\5\uffff\1\13\1\uffff\5\12"
					+ "\1\11\7\12\1\7\5\12\1\10\6\12\1\3\1\uffff\1\4\3\uffff\5\12\1"
					+ "\11\7\12\1\7\5\12\1\10\6\12", "", "", "", "", "", "",
			"\1\17\37\uffff\1\17",
			"\1\21\11\uffff\1\20\25\uffff\1\21\11\uffff\1\20",
			"\1\22\37\uffff\1\22", "", "", "", "", "", "\1\23\37\uffff\1\23",
			"\1\24\37\uffff\1\24", "\1\25\37\uffff\1\25",
			"\1\26\37\uffff\1\26", "\1\27\37\uffff\1\27",
			"\1\30\37\uffff\1\30", "\1\31\37\uffff\1\31",
			"\1\32\37\uffff\1\32",
			"\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
			"\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
			"\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
			"\1\36\37\uffff\1\36", "", "", "",
			"\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12", "" };

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA
			.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}

		@Override
		public String getDescription() {
			return "1:1: Tokens : ( LPAREN | RPAREN | LBRACKET | RBRACKET | COMMA | BANG | NULL | TRUE | FALSE | THIS | IDENTIFIER | SAFEDEREF | WS | STRING | NUMBER_OR_RANGEOP );";
		}
	}

}