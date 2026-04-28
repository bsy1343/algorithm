# [Platinum III] Java2016 - 13482

[문제 링크](https://www.acmicpc.net/problem/13482)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 109, 정답: 72, 맞힌 사람: 51, 정답 비율: 62.963%

### 분류

수학, 애드 혹, 해 구성하기, 비트마스킹, 확률론

### 문제 설명

<p>John likes to learn esoteric programming languages. Recently he discovered the probabilistic programming&nbsp;language Java2K. Built-in functions of Java2K have only a certain probability to do whatever you intend&nbsp;them to do.</p>

<p>The Java2K programming is very hard, so John designed a much simpler language for training: Java2016.&nbsp;Built-in operators of Java2016 are deterministic, while their operands are random. Each value in Java2016&nbsp;is a positive integer in the range 0..255, inclusive.</p>

<p>Java2016 supports six operators of three precedencies:</p>

<p style="text-align: center;">&lang;expression&rang; ::= &lang;expression&rang;&lsquo;<code>min</code>&rsquo;&lang;sum&rang; | &lang;expression&rang;&lsquo;<code>max</code>&rsquo;&lang;sum&rang; | &lang;sum&rang;<br />
&lang;sum&rang; ::= &lang;sum&rang;&lsquo;<code>+</code>&rsquo;&lang;term&rang; | &lang;sum&rang;&lsquo;<code>-</code>&rsquo;&lang;term&rang; | &lang;term&rang;<br />
&lang;term&rang; ::= &lang;term&rang;&lsquo;<code>*</code>&rsquo;&lang;factor&rang; | &lang;term&rang;&lsquo;<code>/</code>&rsquo;&lang;factor&rang; | &lang;factor&rang;<br />
&lang;factor&rang; ::= &lsquo;<code>(</code>&rsquo;&lang;expression&rang;&lsquo;<code>)</code>&rsquo; | &lsquo;<code>?</code>&rsquo; | &lang;macro&rang;</p>

<p>Minimum (&lsquo;<code>min</code>&rsquo;) and maximum (&lsquo;<code>max</code>&rsquo;) operators are defined as usual. Addition (&lsquo;<code>+</code>&rsquo;), subtraction (&lsquo;<code>-</code>&rsquo;)&nbsp;and multiplication (&lsquo;<code>*</code>&rsquo;) are defined modulo 256. The result of the division (&lsquo;<code>/</code>&rsquo;) is rounded towards zero.&nbsp;If the divider is zero, the program crashes. The argument of the operator is a result of another operator,&nbsp;evenly distributed random value (&lsquo;<code>?</code>&rsquo;), or macro substitution.</p>

<p>For instance, the probability that &ldquo;<code>?/?/?</code>&rdquo; is evaluated to zero is 98.2%, while the probability of the&nbsp;crash is 0.8%.</p>

<p>The Java2016 program consists of zero or more macro definitions, followed by the resulting expression.&nbsp;Each macro definition has a form of</p>

<p style="text-align: center;">&lang;macrodef&rang; ::= &lang;macro&rang;&lsquo;=&rsquo;&lang;expression&rang;<br />
&lang;macro&rang; ::= &lsquo;<code>a</code>&rsquo; . . . &lsquo;<code>z</code>&rsquo;</p>

<p>The macro should be defined before the first use. It may not be redefined. The macro is expanded to its&nbsp;definition on each use. For instance,<br />
<code>a = ? max ?<br />
(a max a) / a</code><br />
is expanded to &ldquo;<code>((? max ?) max (? max ?)) / (? max ?)</code>&rdquo;.</p>

<p>John is going to add probabilistic constants to Java2016, so for each possible constant value he needs a&nbsp;program that successfully evaluates to this value with at least one-half probability. Crashes are counted&nbsp;toward failures.</p>

### 입력

<p>The input contains a single integer c &mdash; the target constant (0 &le; c &le; 255).</p>

### 출력

<p>Output a Java2016 program that successfully evaluates to constant c with probability no less than 1/2.&nbsp;The total length of the program should not exceed 256 characters (excluding spaces).</p>