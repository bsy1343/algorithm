# [Gold III] Ambiguous Result - 6621

[문제 링크](https://www.acmicpc.net/problem/6621)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 13, 맞힌 사람: 13, 정답 비율: 86.667%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The ACM (Advanced Cosmos Monitor) recorded a set of messages transmitted by alien race of Space Invaders. Unfortunately, the antenna used for recording only handles lower frequencies representing numbers and two arithmetical operators in space-invaderian language, while all parentheses (corresponding to a high frequency) were lost.</p>

<p>Since numbers are important for those 8-bit creatures, we really need to know what number ranges these messages belong to &mdash; please, write a program that can do this for us!</p>

### 입력

<p>Input contains several legal arithmetical expressions, each expression on a separate line. Each expression consists only of non-negative integers x<sub>i</sub> (0 &le; x<sub>i</sub> &le; 100) and binary operators &ldquo;+&rdquo; and &ldquo;*&rdquo;. The expression starts with a number, then the operators and numbers alternate, and the last element is a number. Each expression contains P numbers (1 &le; P &le; 100) and P &minus; 1 operators. There are no parentheses, no other operators, no unary operator, etc.</p>

<p>The last input expression is followed by a line containing the single word &ldquo;END&rdquo;.</p>

### 출력

<p>For each input line (not counting the final END), output one line containing the minimum and maximum values (separated by a single space) that are achievable by adding parentheses to the input in a way that forms a legal expression and computing the result of that expression.</p>

<p>For example, the minimum value for 2 + 1 &lowast; 0 input is achieved by (2 + 1) &lowast; 0 and the maximum value is achieved by 2 + (1 &lowast; 0). Therefore, you should print &ldquo;0 2&rdquo;.</p>

<p>It is guaranteed that for any placement of parentheses, the value of each parenthesis will be less then 2<sup>63</sup>. This means that also the maximal result will be between 0 and 2<sup>63</sup> &minus; 1, inclusive.</p>