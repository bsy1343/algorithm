# [Silver I] Amazing Divisibility - 26227

[문제 링크](https://www.acmicpc.net/problem/26227)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 19, 맞힌 사람: 16, 정답 비율: 69.565%

### 분류

수학, 정수론, 조합론

### 문제 설명

<p>The sun was setting. Teddy sat in the bus 127, stuck in traffic. Bored, he&#39;d already figured out how to get a hundred by juggling with the digits of his ticket number. He noticed that if he added the digits of the number of the bus to those of the year of his birth, 1997, he got a number divisible by 7. &lt;&lt;Heh!&gt;&gt;, --- Teddy thought and wrote 12 after the bus number, because that day was the 12th. Again, he got a number divisible by 7. The evening was becoming fun. Finally, he wrote the day of the month after the year of his birth.</p>

<p>&quot;Coincidence? I don&#39;t think so!&quot;, --- Teddy wondered and dashed out of the bus to get home as fast as he could run, to write a program to evaluate the probability of his results.</p>

<p>Help Teddy write a program that finds the number of ways to choose a pair of numbers from a given set, such that if the digits of the second number are added to those of the first, the resulting number is divisible by 7.</p>

### 입력

<p>The first line of the input file contains an integer $N$ --- the number of numbers($2\leq N\leq 10^5$).</p>

<p>The second line contains $N$ space-separated different integers$a_i$ ($1\leq i\leq N$, $1\leq a_i\leq 10^9$).</p>

### 출력

<p>The output file must contain a single number - the number of ways to choose a pair of numbers from a given set, such that if the digits of the second number are added to those of the first, the resulting number is divisible  by 7.</p>

### 힌트

<p>In the first test a total of $6$ pairs can be made of the three numbers. If the number 1996 is written after 12, the resulting number is $121996 = 7 \cdot 17428$. The three remaining pairs are described in the problem body.</p>