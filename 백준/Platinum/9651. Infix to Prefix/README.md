# [Platinum II] Infix to Prefix - 9651

[문제 링크](https://www.acmicpc.net/problem/9651)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 45, 정답: 14, 맞힌 사람: 12, 정답 비율: 35.294%

### 분류

다이나믹 프로그래밍, 구현

### 문제 설명

<p>Jaap wrote a solution to a lab assignment. The task was quite simple: convert an arithmetic expression in infix notation to an expression in Polish (prefix) notation. In infix notation operators are written between the operands (e.g. 12 + 5) while prefix notation places operators to the left of their operands (e.g. + 12 5).</p>

<p>This is the syntax of the expression Jaap had to convert:</p>

<pre>
Expression ::= Number
            |  &lsquo;(&rsquo; Expression Op Expression &lsquo;)&rsquo;
            |  &lsquo;(&rsquo; &lsquo;-&rsquo; Expression &lsquo;)&rsquo;
Op         ::= &lsquo;+&rsquo; | &lsquo;-&rsquo;
Number     ::= Digit | Number Digit
Digit      ::= &lsquo;0&rsquo; | &lsquo;1&rsquo; | &lsquo;2&rsquo; | &lsquo;3&rsquo; | &lsquo;4&rsquo; | &lsquo;5&rsquo; | &lsquo;6&rsquo; | &lsquo;7&rsquo; | &lsquo;8&rsquo; | &lsquo;9&rsquo;
</pre>

<p>If a Number has more than one digit, it will not start with a &lsquo;0&rsquo;.</p>

<p>A Number has no more than 9 digits.</p>

<p>At this point we have to admit that the assignment was not very well specified. More specific, the syntax of the resulting expression was not given. So Jaap had to make some decisions himself &mdash; and he made the wrong decisions.</p>

<p>This was his first mistake: he believed that in prefix notation spaces are superfluous. This is true in infix notation, as there will always be an operator between two numbers. In prefix notation, however, numbers must be separated from one another. Omitting spaces in prefix notation, as Jaap did, gives rise to expressions like +1234, which has three different interpretations. (Exercise: draw the three different syntax trees.)</p>

<p>This was Jaap&rsquo;s second mistake: he believed that in prefix notation parentheses are superfluous. Prefix notation without parentheses is unambiguous only if the arity of the operators is fixed. Ambiguity occurs, for example, in the presence of both a unary and a binary minus. The expression: --34, can be read as (- (- 3 4)), evaluating to 1, or as (- (- 3) 4), evaluating to &minus;7, and even as (- (- 34)), evaluating to 34.</p>

<p>We do not ask you to reconstruct Jaap&rsquo;s program. We ask you to find out how ambiguous his output is.</p>

### 입력

<p>Each test case consists of a single line with a nonempty string of length &le; 1000. The string contains only the characters &lsquo;+&rsquo; and &lsquo;-&rsquo; and digits &lsquo;0&rsquo; through &lsquo;9&rsquo;. This string is the output of Jaap&rsquo;s program.</p>

### 출력

<p>For each test case, print one line containing two numbers: the smallest and largest value that can be obtained by different interpretations of the input expression.</p>