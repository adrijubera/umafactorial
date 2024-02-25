{\rtf1\ansi\ansicpg1252\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 Times-Bold;\f1\froman\fcharset0 Times-Roman;\f2\froman\fcharset0 Times-BoldItalic;
}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\b\fs20 \cf0 import java.util.Scanner; 
\f1\b0 \

\f0\b public class 
\f1\b0 factorial \{ \

\f0\b 	public static void 
\f1\b0 main(String []args) \{ \
		Scanner scanInput = 
\f0\b new 
\f1\b0 Scanner(System.
\f2\i\b in
\f1\i0\b0 ); \
		System.
\f2\i\b out
\f1\i0\b0 .print("Introduzca un numero: "); \

\f0\b 		long 
\f1\b0 num = scanInput.nextLong(); \

\f0\b 		long 
\f1\b0 fac = 1; \

\f0\b 		for 
\f1\b0 (
\f0\b long 
\f1\b0 i=1; i<=num; ++i) \{ \
		fac = fac * i; \
		\} \
		System.
\f2\i\b out
\f1\i0\b0 .println("El factorial de "+num+" es "+fac); \
		scanInput.close(); \
	\} \
\} }