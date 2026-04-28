# [Bronze II] Outer Triangle Sum - 14542

[문제 링크](https://www.acmicpc.net/problem/14542)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 596, 정답: 346, 맞힌 사람: 312, 정답 비율: 60.465%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>You are to find the sum of the outer number of an isosceles right triangle.</p>

<p>For example, for n = 5 the isosceles right triangle grid are filled with non-negative integers that are less than 100:</p>

<pre>
<strong>5   </strong>
<strong>1</strong>   <strong>8</strong> 
<strong>9</strong>   6  <strong>1</strong> 
<strong>2</strong>   7  2  <strong>6</strong> 
<strong>3   5  7  8  9</strong></pre>

<p>The sums of the outer integers are calculated as below:</p>

<p>sum = 5 + 1 + 9 + 2 + 3 + 5 + 7 + 8 + 9 + 6 + 1 + 8 = 64</p>

### 입력

<p>The input consists of a few test cases. For each test case, the first line of input is a positive integer <strong>n (n &lt;= 10) </strong>that determines the dimension of the triangle. Each of the next <strong>n </strong>lines contains 1 to <strong>n </strong>integers respectively that will fill the isosceles right triangle. Input is terminated by a case where <strong>n </strong>is 0.</p>

### 출력

<p>Each line of output will start with &ldquo;Case #:&rdquo; where # is replaced by the case number. Then you have to output the sum of the outer numbers of the triangle.</p>