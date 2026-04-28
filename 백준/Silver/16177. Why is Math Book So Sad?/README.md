# [Silver IV] Why is Math Book So Sad? - 16177

[문제 링크](https://www.acmicpc.net/problem/16177)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 77, 정답: 43, 맞힌 사람: 26, 정답 비율: 48.148%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>A boy played a joke with his father.<br />
<i>Boy: &quot;Dad, why is a math book so sad?&quot;</i><br />
<i>Dad: &quot;I don&#39;t know, why?&quot;</i><br />
<i>Boy: &quot;Because it has so many problems&quot;</i>.</p>

<p>Enough about the boy, you have found yourself a problem from a math book for yourself. Given 3 equations:</p>

<blockquote>x<sup>2</sup>+y<sup>2</sup>+z=100<br />
(x+y)<sup>2</sup>+y=130<br />
x<sup>2</sup>-y=-5</blockquote>

<p>What is the value of x, y, and z? The answer is: 2, 9, and 15. Too easy right? You are to write a solution for harder problem, that is:</p>

<p>Given 4 integers A, B, C, and D, output the value of x, y, z in these equations:</p>

<blockquote>x<sup>2</sup>+y<sup>2</sup>+z=A<br />
(x+y)<sup>B</sup>+y=C<br />
x<sup>2</sup>-y=D</blockquote>

<p>If there are multiple possible solutions, output the one with the smallest value of x. If there are still multiple solutions, output the one with the smallest y. We are only interested in non-negative integer value of x, y, and z, output &quot;No solution&quot; if there is no possible solution that match this criteria. You may safely assume that every number in both inputs and outputs are integers and they can be stored in 16-bit data.</p>

### 입력

<p>The input contains many lines (not more than 10000 lines). There are 4 integers separated by a space in each line denoting A, B, C, and D respectively.</p>

### 출력

<p>For each input line, you are to output 3 integers in one line separated by a space denoting the possible value of x, y, and z respectively.</p>