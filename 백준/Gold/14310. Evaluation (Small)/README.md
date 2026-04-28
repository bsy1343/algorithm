# [Gold IV] Evaluation (Small) - 14310

[문제 링크](https://www.acmicpc.net/problem/14310)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 55, 정답: 31, 맞힌 사람: 28, 정답 비율: 65.116%

### 분류

구현, 그래프 이론, 문자열, 그래프 탐색, 집합과 맵, 파싱, 방향 비순환 그래프

### 문제 설명

<p>Given an unordered list of assignment statements, write a program to determine whether the assignment statements can be put in some order in which all variables can be evaluated.</p>

<p>For our problem, an assignment statement will consist of an assignment variable, an assignment operator, and an expression, in that order. Statements will be evaluated one at a time, in the order you choose for them. A variable can be evaluated if and only if it has been the assignment variable of a previous assignment statement.</p>

<p>To simplify the problem, all the expressions are single function calls. Functions can take an arbitrary number of arguments, including zero; a function with zero arguments is always valid, and a function with variable arguments is valid as long as all of the variables are evaluatable.</p>

<p>For example, for the following list of assignment statements:</p>

<pre>
a=f(b,c)
b=g()
c=h()</pre>

<p>this is one order that makes every statement valid:</p>

<pre>
b=g()
c=h()
a=f(b,c)</pre>

<p>This is because: (1)&nbsp;<code>b</code>&nbsp;and&nbsp;<code>c</code>&nbsp;can be evaluated because the expressions&nbsp;<code>g()</code>&nbsp;and&nbsp;<code>h()</code>&nbsp;don&#39;t depend on any variables; and (2)<code>a</code>&nbsp;can also be evaluated because expression&nbsp;<code>a</code>&nbsp;depends on&nbsp;<code>b</code>&nbsp;and&nbsp;<code>c</code>, which are evaluatable.</p>

<p>However, the order</p>

<pre>
b=g()
a=f(b,c)
c=h()</pre>

<p>would not be valid, because&nbsp;<code>f(b, c)</code>&nbsp;has variable c as an argument, but variable c has not been an assignment variable yet.</p>

<p>Another example is:&nbsp;<code>a=f(a)</code>. This list of statements can&#39;t be evaluated because the expression&nbsp;<code>f(a)</code>&nbsp;depends on the variable&nbsp;<code>a</code>&nbsp;itself, which makes it impossible to evaluate the statement.</p>

<ul>
</ul>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. The first line of each test case contains an integer&nbsp;N: the number of assignment statements. Then,&nbsp;N&nbsp;lines follow. Each contains one assignment statement.</p>

<p>Each assignment statement consists of three parts: the assignment variable, the assignment operator, and the expression, with no spaces in between. The assignment operator is always&nbsp;<code>=</code>. All expressions consist of a function name, then&nbsp;<code>(</code>, then zero or more comma-separated variable names, then&nbsp;<code>)</code>. All variables and function names consist of one or more lowercase English alphabet letters. No variable has the same name as a function. No variable will appear more than once as the assignment variable. However, variables may appear more than once in various functions (even within the same function), and functions may appear more than once.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 20.</li>
	<li>All functions take between 0 and 10 arguments, inclusive. All variable names consist of between 1 and 20 lowercase English alphabet letters.</li>
	<li>1 &le;&nbsp;N&nbsp;&le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is&nbsp;<code>GOOD</code>&nbsp;if all variables are evaluatable or&nbsp;<code>BAD</code>&nbsp;otherwise.</p>