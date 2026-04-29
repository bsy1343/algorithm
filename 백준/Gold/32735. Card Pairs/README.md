# [Gold II] Card Pairs - 32735

[문제 링크](https://www.acmicpc.net/problem/32735)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 15, 맞힌 사람: 12, 정답 비율: 36.364%

### 분류

많은 조건 분기, 불변량 찾기

### 문제 설명

<p>You have a hand of cards, where each card has one of $n$ types. For each $i$ from $1$ to $n$, you have $a_i$ cards with type $i$, and the bank has infinite cards with type $i$.</p>

<p>You can perform the following trade with the bank any number of times:</p>

<p>Choose any two cards with the same type from your hand, and exchange them for a single card from the bank with any type <strong>except</strong> the type of the cards you just exchanged. Note that the bank only has cards with types $1$ through $n$, so you <strong>cannot</strong> trade for cards with any other types.</p>

<p>For example, here is a valid sequence of trades on the first sample case:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32735.%E2%80%85Card%E2%80%85Pairs/cdd55f67.png" data-original-src="https://boja.mercury.kr/assets/problem/32735-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 606px; height: 150px;"></p>

<p>What is the maximum number of trades you can perform?</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 10^5$) --- the number of test cases. The description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$ ($2 \le n \le 2\cdot 10^5$) --- the number of card types.</p>

<p>The second line of each test case contains $n$ integers $a_1, a_2 \cdots a_n$ ($0 \le a_i \le 10^9$), where $a_i$ is the number of cards of type $i$ that you currently have.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $2\cdot 10^5$.</p>

### 출력

<p>For each test case, print a single integer --- the maximum number of trades you can perform.</p>

### 힌트

<p>The diagram above describes an optimal sequence of trades in the first test case.</p>

<p>In the fourth test case, it is impossible to perform any trades, since you don't start with any pair of cards with the same type, so the answer is $0$.</p>