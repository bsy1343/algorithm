# [Silver III] Single Digit Adder - 9170

[문제 링크](https://www.acmicpc.net/problem/9170)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 177, 정답: 98, 맞힌 사람: 77, 정답 비율: 61.111%

### 분류

구현

### 문제 설명

<p>Write a program that can evaluate expressions from the following roughly BNF (Backus Naur Form) grammar:</p>

<pre>
expr ::=  term | expr &lsquo;+&rsquo; term | expr &lsquo;-&rsquo; term
unary_op ::= &lsquo;+&rsquo; term | &lsquo;-&rsquo; term
term ::= &lsquo;(&rsquo; expr &lsquo;)&rsquo; | &lsquo;(&rsquo; unary_op &lsquo;)&rsquo; | literal
literal ::= [0-9]</pre>

<p>There will be no whitespace within an expression. All expressions will consist solely of the characters (, ), +, -, and the digits 0 through 9. You may assume that all input is well-formed.</p>

### 입력

<p>The input will consist of one expression per line followed by a newline. The length of expression does not exceed 200.</p>

<p>There will be no blank lines in the file.</p>

### 출력

<p>For each expression, output its integer value, followed by a single newline.</p>