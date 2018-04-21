/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */
package gzotpa.parser;
import gzotpa.ast.*;
import gzotpa.entity.*;
import gzotpa.type.*;
import gzotpa.exception.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

/** Token Manager. */
public class ParserTokenManager implements ParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x7ffeL) != 0L)
         {
            jjmatchedKind = 15;
            return 1;
         }
         if ((active0 & 0x800001000000000L) != 0L)
            return 5;
         return -1;
      case 1:
         if ((active0 & 0x7efeL) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 15;
               jjmatchedPos = 1;
            }
            return 1;
         }
         if ((active0 & 0x100L) != 0L)
            return 1;
         return -1;
      case 2:
         if ((active0 & 0x76beL) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 2;
            return 1;
         }
         if ((active0 & 0x840L) != 0L)
            return 1;
         return -1;
      case 3:
         if ((active0 & 0x74a0L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 3;
            return 1;
         }
         if ((active0 & 0x21eL) != 0L)
            return 1;
         return -1;
      case 4:
         if ((active0 & 0x5000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 4;
            return 1;
         }
         if ((active0 & 0x24a0L) != 0L)
            return 1;
         return -1;
      case 5:
         if ((active0 & 0x1000L) != 0L)
            return 1;
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 5;
            return 1;
         }
         return -1;
      case 6:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 6;
            return 1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 63;
         return jjMoveStringLiteralDfa1_0(0x4000000000000L);
      case 34:
         return jjStopAtPos(0, 19);
      case 37:
         jjmatchedKind = 60;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 38:
         jjmatchedKind = 53;
         return jjMoveStringLiteralDfa1_0(0x104000000000L);
      case 40:
         return jjStopAtPos(0, 31);
      case 41:
         return jjStopAtPos(0, 24);
      case 42:
         jjmatchedKind = 58;
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 43:
         jjmatchedKind = 56;
         return jjMoveStringLiteralDfa1_0(0x2000000200000000L);
      case 44:
         return jjStopAtPos(0, 25);
      case 45:
         jjmatchedKind = 57;
         return jjMoveStringLiteralDfa1_0(0x4000000400000000L);
      case 46:
         return jjStopAtPos(0, 65);
      case 47:
         jjmatchedKind = 59;
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 59:
         return jjStopAtPos(0, 30);
      case 60:
         jjmatchedKind = 46;
         return jjMoveStringLiteralDfa1_0(0x81020000000000L);
      case 61:
         jjmatchedKind = 32;
         return jjMoveStringLiteralDfa1_0(0x2000000000000L);
      case 62:
         jjmatchedKind = 45;
         return jjMoveStringLiteralDfa1_0(0x40840000000000L);
      case 91:
         return jjStopAtPos(0, 28);
      case 93:
         return jjStopAtPos(0, 29);
      case 94:
         jjmatchedKind = 52;
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x2008L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x4080L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x820L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x140L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x4L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x10L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x2L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 123:
         return jjStopAtPos(0, 26);
      case 124:
         jjmatchedKind = 51;
         return jjMoveStringLiteralDfa1_0(0x88000000000L);
      case 125:
         return jjStopAtPos(0, 27);
      case 126:
         return jjStopAtPos(0, 64);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, 0L);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(1, 44);
         break;
      case 43:
         if ((active0 & 0x2000000000000000L) != 0L)
            return jjStopAtPos(1, 61);
         break;
      case 45:
         if ((active0 & 0x4000000000000000L) != 0L)
            return jjStopAtPos(1, 62);
         break;
      case 60:
         if ((active0 & 0x80000000000000L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000000L);
      case 61:
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStopAtPos(1, 47);
         else if ((active0 & 0x1000000000000L) != 0L)
            return jjStopAtPos(1, 48);
         else if ((active0 & 0x2000000000000L) != 0L)
            return jjStopAtPos(1, 49);
         else if ((active0 & 0x4000000000000L) != 0L)
            return jjStopAtPos(1, 50);
         break;
      case 62:
         if ((active0 & 0x40000000000000L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x20L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 102:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(1, 8, 1);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x280L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x480aL);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x2010L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x4L);
      case 124:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStopAtPos(1, 43);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, 0L);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(2, 41);
         else if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(2, 42);
         break;
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x402L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x24L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x8L);
      case 114:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(2, 11, 1);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 116:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(2, 6, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x10L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 100:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(3, 1, 1);
         break;
      case 101:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(3, 4, 1);
         else if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(3, 9, 1);
         break;
      case 108:
         if ((active0 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(3, 2, 1);
         else if ((active0 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(3, 3, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0xa0L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         else if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(4, 10, 1);
         break;
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 107:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 1);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 115:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(4, 7, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(5, 12, 1);
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(7, 14, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   //int[] nextStates; // not used
   int startsAt = 0;
   jjnewStateCnt = 11;
   int i = 1;
   jjstateSet[0] = startState;
   //int j; // not used
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 16)
                        kind = 16;
                     jjCheckNAdd(3);
                  }
                  else if ((0x100003600L & l) != 0L)
                  {
                     if (kind > 17)
                        kind = 17;
                     jjCheckNAdd(4);
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAdd(3);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAdd(3);
                  break;
               case 4:
                  if ((0x100003600L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  jjCheckNAdd(4);
                  break;
               case 5:
                  if (curChar != 47)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAddStates(0, 2);
                  break;
               case 6:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAddStates(0, 2);
                  break;
               case 7:
                  if ((0x2400L & l) != 0L && kind > 18)
                     kind = 18;
                  break;
               case 8:
                  if (curChar == 10 && kind > 18)
                     kind = 18;
                  break;
               case 9:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(1);
                  break;
               case 6:
                  if (kind > 18)
                     kind = 18;
                  jjAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 11 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjStopStringLiteralDfa_1(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_1(int pos, long active0)
{
   return jjMoveNfa_1(jjStopStringLiteralDfa_1(pos, active0), pos + 1);
}
private int jjStartNfaWithStates_1(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_1(state, pos + 1);
}
private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 34:
         return jjStopAtPos(0, 23);
      default :
         return jjMoveNfa_1(1, 0);
   }
}
private int jjMoveNfa_1(int startState, int curPos)
{
   //int[] nextStates; // not used
   int startsAt = 0;
   jjnewStateCnt = 6;
   int i = 1;
   jjstateSet[0] = startState;
   //int j; // not used
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 0:
                  if ((0xfffffffbffffdbffL & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if ((0xff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if ((0xff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 4:
                  if ((0xff000000000000L & l) != 0L && kind > 21)
                     kind = 21;
                  break;
               case 5:
                  if (kind > 22)
                     kind = 22;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0xffffffffefffffffL & l) != 0L)
                  {
                     if (kind > 20)
                        kind = 20;
                     jjCheckNAdd(0);
                  }
                  else if (curChar == 92)
                     jjAddStates(3, 4);
                  break;
               case 0:
                  if ((0xffffffffefffffffL & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  jjCheckNAdd(0);
                  break;
               case 5:
                  if (kind > 22)
                     kind = 22;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 0:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 20)
                     kind = 20;
                  jjCheckNAdd(0);
                  break;
               case 5:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2) && kind > 22)
                     kind = 22;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 6 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   6, 7, 9, 2, 5, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default : 
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\166\157\151\144", "\156\165\154\154", "\142\157\157\154", 
"\164\162\165\145", "\146\141\154\163\145", "\151\156\164", "\143\154\141\163\163", "\151\146", 
"\145\154\163\145", "\167\150\151\154\145", "\146\157\162", "\162\145\164\165\162\156", 
"\142\162\145\141\153", "\143\157\156\164\151\156\165\145", null, null, null, null, null, null, null, 
null, null, "\51", "\54", "\173", "\175", "\133", "\135", "\73", "\50", "\75", 
"\53\75", "\55\75", "\52\75", "\57\75", "\45\75", "\46\75", "\174\75", "\136\75", 
"\74\74\75", "\76\76\75", "\174\174", "\46\46", "\76", "\74", "\76\75", "\74\75", "\75\75", 
"\41\75", "\174", "\136", "\46", "\76\76", "\74\74", "\53", "\55", "\52", "\57", "\45", 
"\53\53", "\55\55", "\41", "\176", "\56", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT", 
   "IN_STRING", 
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, 0, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xffffffffff81ffffL, 0x3L, 
};
static final long[] jjtoSkip = {
   0x60000L, 0x0L, 
};
static final long[] jjtoSpecial = {
   0x60000L, 0x0L, 
};
static final long[] jjtoMore = {
   0x780000L, 0x0L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[11];
private final int[] jjstateSet = new int[22];
protected char curChar;
/** Constructor. */
public ParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public ParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 11; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String tokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   tokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, tokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  //int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
           }
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}