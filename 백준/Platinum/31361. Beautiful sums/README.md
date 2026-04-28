# [Platinum II] Beautiful sums - 31361

[문제 링크](https://www.acmicpc.net/problem/31361)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 6, 맞힌 사람: 6, 정답 비율: 16.216%

### 분류

임의 정밀도 / 큰 수 연산, 백트래킹, 분할 정복을 이용한 거듭제곱, 수학, 정수론

### 문제 설명

<p><em>Beautiful sums</em> are the sums of several consequent positive integers. For example, the sums $7 + 8$ and $4 + 5 + 6$ are beautiful, and the sum $3 + 5 + 7$ is not beautiful even though the value in all cases equals $15$. (The sum of single summand $15$ also considered beautiful.)</p>

<p>Given this, <em>the beauty index</em> of integer is the number of its representations as a beautiful sum. For example, the beauty index of number 15 equals 4 as 15 is represented by a beautiful sum in four ways: $15 = 7 + 8 = 4 + 5 + 6 = 1 + 2 + 3 + 4 + 5$.</p>

<p>One number is more beautiful than another if its beauty index is higher. If numbers have equal beauty indexes the smaller one is considered more beautiful. For example, $15$ is the smallest integer having beauty index $4$.</p>

<p>You have to find the smallest integer for given beauty index $n$.</p>

### 입력

<p>Single line contains an integer $n$ ($1 \le n \le 10^5$).</p>

### 출력

<p>Output the smallest integer for given beauty index $n$ modulo ($10^9+9$).</p>