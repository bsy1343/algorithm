# [Gold V] Expressions - 6514

[문제 링크](https://www.acmicpc.net/problem/6514)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 15, 맞힌 사람: 14, 정답 비율: 51.852%

### 분류

자료 구조, 스택, 큐

### 문제 설명

<p>Arithmetic expressions are usually written with the operators in
between the
two operands (which is called infix notation). For example, <i>(x+y)*(z-w)</i>
is an arithmetic expression in infix notation.
However, it is easier to write a program to evaluate an expression if
the expression is written in postfix notation (also known as reverse
polish
notation). In postfix notation, an operator is written behind its two
operands, which may be expressions themselves. For example, <i>x y + z
w
- *</i> is a postfix notation of the arithmetic expression
given above. Note that in this case parentheses are not required. </p>
<p>To evaluate an expression written in postfix notation, an algorithm
operating on a stack can be used. A stack is a data structure which
supports two operations: </p>
<ol>
<li>push: a number is inserted at the top of the
stack.</li>
<li>pop: the number from the top of the stack is
taken out.</li>
</ol>
<p>During the evaluation, we process the expression from left to right.
If we encounter a number, we push it onto the stack. If we encounter an
operator, we pop the first two numbers from the stack, apply the
operator
on them, and push
the result back onto the stack. More specifically, the following
pseudocode
shows how to handle the case when we encounter an operator O: </p>
<pre>a := pop();
b := pop();
push(b O a);</pre>
<p>The result of the expression will be left as the only number on the
stack. </p>
<p>Now imagine that we use a queue instead of the stack. A queue also
has a
push and pop operation, but their meaning is different: </p>
<ol>
<li>push: a number is inserted at the end of the
queue.</li>
<li>pop: the number from the front of the queue
is taken out of the queue.</li>
</ol>
<p>Can you rewrite the given expression such that the result of the
algorithm
using the queue is the same as the result of the original expression
evaluated
using the algorithm with the stack? </p>

### 입력

<p>The first line of the input contains a number T (<i>T
≤ 200</i>). The following T
lines each
contain one expression in postfix notation. Arithmetic operators are
represented by uppercase letters, numbers are represented by lowercase
letters.
You may assume that the length of each expression is less than <i>10000</i>
characters. </p>

### 출력

<p>For each given expression, print the expression with the equivalent
result
when using the algorithm with the queue instead of the stack. To make
the
solution unique, you are not allowed to assume that the operators are
associative or commutative. </p>