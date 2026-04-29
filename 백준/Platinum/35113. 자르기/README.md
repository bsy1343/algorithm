# [Platinum V] 자르기 - 35113

[문제 링크](https://www.acmicpc.net/problem/35113)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 170, 정답: 79, 맞힌 사람: 66, 정답 비율: 58.929%

### 분류

그리디 알고리즘, 누적 합

### 문제 설명

<p>$N$개의 양의 정수로 이루어진 배열 $A = [a_1, a_2, \dots, a_N]$가 주어진다. $1 \le i&lt;j&lt;k &lt; N$을 만족하는 세 정수 $i,j,k$에 대하여, 함수 $f(i,j,k)$를 다음과 같이 정의하자.</p>

<p>$$f(i,j,k) = \max(a_1, \dots, a_i) + \max(a_{i+1}, \dots, a_j) + \max(a_{j+1}, \dots, a_k) + \max(a_{k+1}, \dots, a_N)$$</p>

<p>즉, $f(i, j, k)$는 배열 $A$를 네 개의 연속된 구간 $[1, i], [i+1, j],[j+1, k], [k+1, N]$ 으로 나누었을 때 <strong>각 구간의 최댓값들을 모두 더한 합</strong>을 의미한다.</p>

<p>$\min_{1\leq i&lt;j&lt;k&lt;N}f(i,j,k)$의 값을 구해보자.</p>

### 입력

<p>첫 번째 줄에 배열 $A$의 길이를 나타내는 정수 $N$이 주어진다. $\left(4\leq N \leq 10^6\right)$</p>

<p>두 번째 줄에 $N$개의 양의 정수 $a_i$가 공백으로 구분되어 주어진다. $\left(1\leq a_i \leq 10^8\right)$</p>

### 출력

<p>$\min_{1\leq i&lt;j&lt;k&lt;N}f(i,j,k)$의 값을 출력한다.</p>