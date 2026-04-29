# [Gold IV] Faulty Fraction - 35023

[문제 링크](https://www.acmicpc.net/problem/35023)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 28, 정답: 17, 맞힌 사람: 15, 정답 비율: 57.692%

### 분류

수학, 이분 탐색, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>Felix is studying basic arithmetic at school. Today he learned division. As a final task, he calculated the result of the division of a positive integer $a$ by a positive integer $b$. The result was a positive integer $c$, since $a$ was divisible by $b$. Felix wrote $a \div b = c$ in his notebook and went outside to play football.</p>

<p>His little sister Fiona had been watching his studies with great interest. When Felix left, she decided to play a little trick on him: she took his notebook and erased the '$\div$' sign from the equation. As a result, the left-hand side of the equation became a single string of digits $s$.</p>

<p>Once Felix came back, he saw $s = c$ in his notebook. Unfortunately, he forgot the original values of $a$ and $b$. Now he needs to split $s$ back into two parts using the '$\div$' sign to restore a correct division equation.</p>

<p>Help Felix find positive integers $a$ and $b$ such that $s$ is the concatenation of the decimal representations of $a$ and $b$, and $a \div b = c$.</p>

### 입력

<p>The only line contains a string of digits $s$ and an integer $c$. Both $s$ and $c$ consist of at least $1$ and at most $10^5$ digits and do not have leading zeros.</p>

<p>It is guaranteed that $s$ is a concatenation of two positive integers $a$ and $b$ written without leading zeros such that $a \div b = c$.</p>

### 출력

<p>Print two positive integers $a$ and $b$ without leading zeros such that $s$ is the concatenation of $a$ and $b$, and $a \div b = c$. If there are multiple answers, print any of them.</p>