# [Gold V] Aftermath - 19303

[문제 링크](https://www.acmicpc.net/problem/19303)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 328, 정답: 206, 맞힌 사람: 180, 정답 비율: 70.312%

### 분류

수학, 정수론

### 문제 설명

<p>Once upon a time, you had a nice positive integer $n$.</p>

<p>Since you like division, you quickly found all its positive integer divisors.</p>

<p>Not being a mean guy, you calculated $a$ --- the arithmetic mean of divisors of $n$. Surprisingly, this number turned out to be an integer.</p>

<p>Some time passed, and you calculated $h$ --- the harmonic mean of divisors of $n$. Even more surprisingly, this number turned out to be an integer, too!</p>

<p>Unfortunately, your memory let you down, and now you remember $a$ and $h$ but don&#39;t remember $n$. However, you remember that $n$ didn&#39;t exceed $10^{15}$.</p>

<p>Your muse suggested to bring good old times back and restore any value of $n$ matching your records.</p>

### 입력

<p>The first line of the input contains a single positive integer $a$.</p>

<p>The second line of the input contains a single positive integer $h$.</p>

<p>It&#39;s guaranteed that there exists a positive integer $n \le 10^{15}$ such that the arithmetic mean of divisors of $n$ is equal to $a$, which the harmonic mean of divisors of $n$ is equal to $h$.</p>

### 출력

<p>Output any positive integer $n$ not exceeding $10^{15}$ which doesn&#39;t contradict the given information.</p>

### 힌트

<p>The <em>arithmetic mean</em> is the sum of a collection of numbers divided by the number of numbers in the collection. For example, the arithmetic mean of 1, 2, 3 and 6 is equal to $\frac{1 + 2 + 3 + 6}{4} = 3$.</p>

<p>The <em>harmonic mean</em> is the reciprocal of the arithmetic mean of the reciprocals of numbers in the collection. For example, the harmonic mean of 1, 2, 3 and 6 is equal to $\big( \frac{1^{-1} + 2^{-1} + 3^{-1} + 6^{-1}}{4} \big)^{-1} = 2$.</p>

<p>Thus, in the first example test case, $n = 6$ satisfies the requirements since its divisors are 1, 2, 3 and 6.</p>