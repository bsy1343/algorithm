# [Platinum IV] Product Oriented Recurrence - 30165

[문제 링크](https://www.acmicpc.net/problem/30165)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 76, 정답: 35, 맞힌 사람: 33, 정답 비율: 50.000%

### 분류

수학, 정수론, 분할 정복을 이용한 거듭제곱, 페르마의 소정리

### 문제 설명

<p>Let $f_{x} = c^{2x-6} \cdot f_{x-1} \cdot f_{x-2} \cdot f_{x-3}$ for $x \ge 4$.</p>

<p>You have given integers $n$, $f_{1}$, $f_{2}$, $f_{3}$, and $c$. Find $f_{n} \bmod (10^{9}+7)$.</p>

### 입력

<p>The only line contains five integers $n$, $f_{1}$, $f_{2}$, $f_{3}$, and $c$ ($4 \le n \le 10^{18}$, $1 \le f_{1}$, $f_{2}$, $f_{3}$, $c \le 10^{9}$).</p>

### 출력

<p>Print $f_{n} \bmod (10^{9} + 7)$.</p>

### 힌트

<p>In the first example, $f_{4} = 90$, $f_{5} = 72900$.</p>

<p>In the second example, $f_{17} \approx 2.28 \times 10^{29587}$.</p>