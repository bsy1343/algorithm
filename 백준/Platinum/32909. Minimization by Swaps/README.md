# [Platinum IV] Minimization by Swaps - 32909

[문제 링크](https://www.acmicpc.net/problem/32909)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 27, 정답: 10, 맞힌 사람: 9, 정답 비율: 47.368%

### 분류

그리디 알고리즘, 세그먼트 트리, 자료 구조, 큐

### 문제 설명

<p>Masha is studying large numbers. She has placed $n$ cards in a row. Each card has a digit from $1$ to $9$ written on it. Together, they form an $n$-digit integer $s$.</p>

<p>In one operation, Masha can take two <strong>adjacent</strong> cards and swap them (she cannot rotate the cards, turning one digit into another). Masha can perform no more than $k$ operations. What is the minimum $n$-digit number that can be obtained as a result?</p>

### 입력

<p>The first line contains an integer $t$: the number of test cases ($1 \le t \le 100\,000$). The following lines contain the test cases.</p>

<p>Each test case is given on a line containing two integers $s$ and $k$ separated by a space. The integer $s$ is positive and consists of digits from $1$ to $9$. Additionally, $0 \le k \le 10^{18}$.</p>

<p>The total number of digits in all numbers $s$ does not exceed $100\,000$.</p>

### 출력

<p>For each test case, print a line with the answer: the minimum $n$-digit number that can be obtained from $s$ by swapping two adjacent digits no more than $k$ times.</p>