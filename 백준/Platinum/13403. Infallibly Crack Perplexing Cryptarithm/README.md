# [Platinum I] Infallibly Crack Perplexing Cryptarithm - 13403

[문제 링크](https://www.acmicpc.net/problem/13403)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 120, 정답: 55, 맞힌 사람: 34, 정답 비율: 40.000%

### 분류

브루트포스 알고리즘, 파싱, 문자열

### 문제 설명

<p>You are asked to crack an encrypted equation over binary numbers.</p>

<p>The original equation consists only of binary digits (&ldquo;0&rdquo; and &ldquo;1&rdquo;), operator symbols (&ldquo;+&rdquo;, &ldquo;-&rdquo;,&nbsp;and &ldquo;*&rdquo;), parentheses (&ldquo;(&rdquo; and &ldquo;)&rdquo;), and an equal sign (&ldquo;=&rdquo;). The encryption replaces some&nbsp;occurrences of characters in an original arithmetic equation by letters. Occurrences of one&nbsp;character are replaced, if ever, by the same letter. Occurrences of two different characters are&nbsp;never replaced by the same letter. Note that the encryption does not always replace all the&nbsp;occurrences of the same character; some of its occurrences may be replaced while others may&nbsp;be left as they are. Some characters may be left unreplaced. Any character in the Roman&nbsp;alphabet, in either lowercase or uppercase, may be used as a replacement letter. Note that cases&nbsp;are significant, that is, &ldquo;a&rdquo; and &ldquo;A&rdquo; are different letters. Note that not only digits but also&nbsp;operator symbols, parentheses and even the equal sign are possibly replaced.</p>

<p>The arithmetic equation is derived from the start symbol of Q of the following context-free&nbsp;grammar.</p>

<pre>
Q ::= E=E
E ::= T | E+T | E-T
T ::= F | T*F
F ::= N | -F | (E)
N ::= 0 | 1B
B ::= &epsilon; | 0B | 1B</pre>

<p>Here, &epsilon; means empty.</p>

<p>As shown in this grammar, the arithmetic equation should have one equal sign. Each side of the&nbsp;equation is an expression consisting of numbers, additions, subtractions, multiplications, and&nbsp;negations. Multiplication has precedence over both addition and subtraction, while negation&nbsp;precedes multiplication. Multiplication, addition and subtraction are left associative. For example,&nbsp;x-y+z means (x-y)+z, not x-(y+z). Numbers are in binary notation, represented by a&nbsp;sequence of binary digits, 0 and 1. Multi-digit numbers always start with 1. Parentheses and&nbsp;negations may appear redundantly in the equation, as in ((--x+y))+z.</p>

<p>Write a program that, for a given encrypted equation, counts the number of different possible&nbsp;original correct equations. Here, an equation should conform to the grammar and it is correct&nbsp;when the computed values of the both sides are equal.</p>

<p>For Sample Input 1, C must be = because any equation has one = between two expressions. Then,&nbsp;because A and M should be different, although there are equations conforming to the grammar,&nbsp;none of them can be correct.</p>

<p>For Sample Input 2, the only possible correct equation is -0=0.</p>

<p>For Sample Input 3 (B-A-Y-L-zero-R), there are three different correct equations, 0=-(0),&nbsp;0=(-0), and -0=(0). Note that one of the two occurrences of zero is not replaced with a&nbsp;letter in the encrypted equation.</p>

### 입력

<p>The input consists of a single test case which is a string of Roman alphabet characters, binary&nbsp;digits, operator symbols, parentheses and equal signs. The input string has at most 31 characters.</p>

### 출력

<p>Print in a line the number of correct equations that can be encrypted into the input string.</p>