# [Gold III] Interactive Number Guessing - 27417

[문제 링크](https://www.acmicpc.net/problem/27417)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 300, 정답: 111, 맞힌 사람: 95, 정답 비율: 38.306%

### 분류

수학, 애드 혹, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p><em>This is an interactive problem.</em></p>

<p>Your task is to write a program that guesses a secret number through repetitive queries and responses. The secret number is a non-negative integer less than $10^{18}$.</p>

<p>Let $x$ be the secret number. In a query, you specify a non-negative integer $a$. In response to this, the <em>digit sum</em> of $(x + a)$ will be returned. Here, the digit sum of a number means the sum of all the digits in its decimal notation. For example, the digit sum of $4096$ is $4 + 0 + 9 + 6 = 19$.</p>

### 입력



### 출력



### 힌트

<p>In this example, the secret number $x$ is $75$. In response to the first query, $15$ is returned because $x + a = 75 + 3 = 78$ and its digit sum is $7 + 8 = 15$. After the second response, you can conclude that the only possible secret number is $75$.</p>