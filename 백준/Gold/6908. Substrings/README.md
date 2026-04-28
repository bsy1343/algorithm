# [Gold I] Substrings - 6908

[문제 링크](https://www.acmicpc.net/problem/6908)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 23, 맞힌 사람: 21, 정답 비율: 70.000%

### 분류

자료 구조, 문자열, 트리, 집합과 맵, 해싱, 트라이, 접미사 배열과 LCP 배열

### 문제 설명

<p>How many distinct substrings does a given string $S$ have?</p>

<p>For example, if $S =$ <code>abc</code>, $S$ has $7$ distinct substrings: , <code>a</code>, <code>b</code>, <code>c</code>, <code>ab</code>, <code>bc</code>, <code>abc</code>. Note that the empty string and $S$ itself are considered substrings of $S$.</p>

<p>On the other hand, if $S =$ <code>aaa</code>. $S$ has only $4$ distinct substrings: , <code>a</code>, <code>aa</code>, <code>aaa</code>.</p>

### 입력

<p>The first line of the input file contains $N$, the number of test cases. For each test case, a line follows giving $S$, a string of from $1$ to $5000$ alphanumeric characters.</p>

### 출력

<p>Your output consists of one line per case, giving the number of distinct substrings of $S$.</p>

### 제한

<p>50% of test cases will have $l$ (the length of the string) where $l \le 1000$. For all cases, $l \le 5000$.</p>