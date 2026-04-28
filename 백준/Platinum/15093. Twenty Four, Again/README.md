# [Platinum III] Twenty Four, Again - 15093

[문제 링크](https://www.acmicpc.net/problem/15093)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 23, 맞힌 사람: 19, 정답 비율: 43.182%

### 분류

사칙연산, 브루트포스 알고리즘, 다이나믹 프로그래밍, 구현, 수학

### 문제 설명

<p>Yes, we know . . . we&rsquo;ve used Challenge 24 before for contest problems. In case you&rsquo;ve never heard of Challenge 24 (or have a very short memory) the object of the game is to take 4 given numbers (the base values) and determine if there is a way to produce the value 24 from them using the four basic arithmetic operations (and parentheses if needed). For example, given the four base values 3 5 5 2, you can produce 24 in many ways. Two of them are: 5*5-3+2 and (3+5)*(5-2). Recall that multiplication and division have precedence over addition and subtraction, and that equal-precedence operators are evaluated left-to-right.</p>

<p>This is all very familiar to most of you, but what you probably don&rsquo;t know is that you can grade the quality of the expressions used to produce 24. In fact, we&rsquo;re sure you don&rsquo;t know this since we&rsquo;ve just made it up. Here&rsquo;s how it works: A perfect grade for an expression is 0. Each use of parentheses adds one point to the grade. Furthermore, each inversion (that is, a swap of two adjacent values) of the original ordering of the four base values adds two points. The first expression above has a grade of 4, since two inversions are used to move the 3 to the third position. The second expression has a better grade of 2 since it uses no inversions but two sets of parentheses. As a further example, the initial set of four base values 3 6 2 3 could produce an expression of grade 3 &mdash; namely (3+6+3)*2 &mdash; but it also has a perfect grade 0 expression &mdash; namely 3*6+2*3. Needless to say, the lower the grade the &ldquo;better&rdquo; the expression.</p>

<p>Two additional rules we&rsquo;ll use: 1) you cannot use unary minus in any expression, so you can&rsquo;t take the base values 3 5 5 2 and produce the expression -3+5*5+2, and 2) division can only be used if the result is an integer, so you can&rsquo;t take the base values 2 3 4 9 and produce the expression 2/3*4*9.</p>

<p>Given a sequence of base values, determine the lowest graded expression resulting in the value 24. And by the way, the initial set of base values 3 5 5 2 has a grade 1 expression &mdash; can you find it?</p>

### 입력

<p>Input consists of a single line containing 4 base values. All base values are between 1 and 100, inclusive.</p>

### 출력

<p>Display the lowest grade possible using the sequence of base values. If it is not possible to produce 24, display impossible.</p>