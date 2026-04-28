# [Platinum IV] Boolean Expression Compressor - 14973

[문제 링크](https://www.acmicpc.net/problem/14973)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 49, 정답: 20, 맞힌 사람: 9, 정답 비율: 30.000%

### 분류

다이나믹 프로그래밍, 구현, 파싱, 런타임 전의 전처리, 문자열

### 문제 설명

<p>You are asked to build a compressor for Boolean expressions that transforms expressions to the shortest form keeping their meaning.</p>

<p>The grammar of the Boolean expressions has terminals&nbsp;<code>0</code>&nbsp;<code>1</code>&nbsp;<code>a</code>&nbsp;<code>b</code>&nbsp;<code>c</code>&nbsp;<code>d</code>&nbsp;<code>-</code>&nbsp;<code>^</code>&nbsp;<code>*</code>&nbsp;<code>(</code>&nbsp;<code>)</code>, start symbol &lt;E&gt; and the following production rule:</p>

<blockquote>&lt;E&gt; &nbsp;::=&nbsp;&nbsp;<code>0</code>&nbsp;&nbsp;|&nbsp;&nbsp;<code>1</code>&nbsp;&nbsp;|&nbsp;&nbsp;<code>a</code>&nbsp;&nbsp;|&nbsp;&nbsp;<code>b</code>&nbsp;&nbsp;|&nbsp;&nbsp;<code>c</code>&nbsp;&nbsp;|&nbsp;&nbsp;<code>d</code>&nbsp;&nbsp;|&nbsp;&nbsp;<code>-</code>&lt;E&gt; &nbsp;|&nbsp;&nbsp;<code>(</code>&lt;E&gt;<code>^</code>&lt;E&gt;<code>)</code>&nbsp;&nbsp;|&nbsp;&nbsp;<code>(</code>&lt;E&gt;<code>*</code>&lt;E&gt;<code>)</code></blockquote>

<p>Letters&nbsp;<code>a</code>,&nbsp;<code>b</code>,&nbsp;<code>c</code>&nbsp;and&nbsp;<code>d</code>&nbsp;represent Boolean variables that have values of either&nbsp;<code>0</code>&nbsp;or&nbsp;<code>1</code>. Operators are evaluated as shown in the Table below. In other words,&nbsp;<code>-</code>&nbsp;means negation (NOT),&nbsp;<code>^</code>&nbsp;means exclusive disjunction (XOR), and&nbsp;<code>*</code>&nbsp;means logical conjunction (AND).</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14973/1.png" style="height:81px; width:233px" /></p>

<p style="text-align: center;">Table: Evaluations of operators</p>

<p>Write a program that calculates the length of the shortest expression that evaluates equal to the given expression with whatever values of the four variables.</p>

<p>For example,&nbsp;<code>0</code>, that is the first expression in the sample input, cannot be shortened further. Therefore the shortest length for this expression is 1.</p>

<p>For another example,&nbsp;<code>(a*(1*b))</code>, the second in the sample input, always evaluates equal to&nbsp;<code>(a*b)</code>&nbsp;and&nbsp;<code>(b*a)</code>, which are the shortest. The output for this expression, thus, should be&nbsp;<code>5</code>.</p>

### 입력

<p>The input consists of multiple datasets. A dataset consists of one line, containing an expression conforming to the grammar described above. The length of the expression is less than or equal to 16 characters.</p>

<p>The end of the input is indicated by a line containing one &lsquo;<code>.</code>&rsquo; (period). The number of datasets in the input is at most 200.</p>

### 출력

<p>For each dataset, output a single line containing an integer which is the length of the shortest expression that has the same value as the given expression for all combinations of values in the variables.</p>