# [Platinum III] Equals are Equals - 15541

[문제 링크](https://www.acmicpc.net/problem/15541)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 8, 맞힌 사람: 5, 정답 비율: 45.455%

### 분류

구현, 파싱, 무작위화, 정규 표현식, 문자열

### 문제 설명

<p>Mr. Simpson got up with a slight feeling of tiredness. It was the start of another day of hard work. A bunch of papers were waiting for his inspection on his desk in his omce. The papers contained his students&#39; answers to questions in his Math class, but the answers looked as if they were just stains of ink.</p>

<p>His headache came from the &quot;creativity&quot; of his students. They provided him a variety of ways to answer each problem. He has his own answer to each problem, which is correct, of course, and the best from his aesthetic point of view.</p>

<p>Some of his students wrote algebraic expressions equivalent to the expected answer, but many of them look quite different from Mr. Simpson&#39;s answer in terms of their literal forms. Some wrote algebraic expressions not equivalent to his answer, but they look quite similar to it. Only a few of the students&#39; answers were exactly the same as his.</p>

<p>It is his duty to check if each expression is mathematicaly equivalent to the answer he has prepared. This is to prevent expressions that are equivalent to his hom being marked as &quot;incorrect&quot;, even if they are not acceptable to his aesthetic moral.</p>

<p>He had now spent five days checking the expressions. Suddenly, he stood up and yelled, &quot;I&#39;ve had enough! I must call for help.&quot;</p>

<p>Your job is to write a program to help Mr. Simpson to judge if each answer is equivalent to the &quot;correct&quot; one. Algebraic expressions written on the papers are multi-variable polynomials over variable symbols&nbsp;<em>a</em>,&nbsp;<em>b</em>,...,&nbsp;<em>z</em>&nbsp;with integer coefficients, e.g., (<em>a</em>&nbsp;+&nbsp;<em>b</em><sup>2</sup>)(<em>a</em>&nbsp;-&nbsp;<em>b</em><sup>2</sup>),&nbsp;<em>ax</em><sup>2</sup>&nbsp;+2<em>bx</em>&nbsp;+&nbsp;<em>c</em>&nbsp;and (<em>x</em><sup>2</sup>&nbsp;+5<em>x</em>&nbsp;+ 4)(<em>x</em><sup>2</sup>&nbsp;+ 5<em>x</em>&nbsp;+ 6) + 1.</p>

<p>Mr. Simpson will input every answer expression as it is written on the papers; he promises you that an algebraic expression he inputs is a sequence of tenns separated by additive operators &#39;+&#39; and &#39;-&#39;, representing the sum of the terms with those operators, if any; a term is a juxtaposition of multiplicands, representing their product; and a multiplicand is either (a) a non-negative integer as a digit sequence in decimal, (b) a variable symbol (one of the lowercase letters &#39;a&#39; to &#39;z&#39;), possibly followed by a symbol &#39;^&#39; and a non-zero digit, which represents the power of that variable, or (c) a parenthesized algebraic expression, recursively. Note that the operator &#39;+&#39; or &#39;-&#39; appears only as a binary operator and not as a unary operator to specify the sing of its operand.</p>

<p>He says that he will put one or more space characters before an integer if it immediately follows another integer or a digit following the symbol &#39;^&#39;. He also says he may put spaces here and there in an expression as an attempt to make it readable, but he will never put a space between two consecutive digits of an integer. He remarks that the expressions are not so complicated, and that any expression, having its &#39;-&#39;s replaced with &#39;+&#39;s, if any, would have no variable raised to its 10th power, nor coefficient more than a billion, even if it is fully expanded into a form of a sum of products of coefficients and powered variables.</p>

### 입력

<p>The input to your program is a sequence of blocks of lines. A block consists of lines, each containing an expression, and a terminating line. After the last block, there is another terminating line. A terminating line is a line solely consisting of a period symbol.</p>

<p>The first expression of a block is one prepared by Mr. Simpson; all that follow in a block are answers by the students. An expression consists of lowercase letters, digits, operators &#39;+&#39;, &#39;-&#39; and &#39;^&#39;, parentheses &#39;(&#39; and &#39;)&#39;, and spaces. A line containing an expression has no more than 80 characters.</p>

### 출력

<p>Your program should produce a line solely consisting of &quot;yes&quot; or &quot;no&quot; for each answer by the students corresponding to whether or not it is mathematically equivalent to the expected answer. Your program should produce a line solely containing a period symbol after each block.</p>