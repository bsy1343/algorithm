# [Platinum II] Prime Time - 22891

[문제 링크](https://www.acmicpc.net/problem/22891)

### 성능 요약

시간 제한: 45 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 59, 정답: 22, 맞힌 사람: 21, 정답 비율: 51.220%

### 분류

브루트포스 알고리즘, 수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>You are playing a new solitaire game called Prime Time. You are given a deck of cards, and each card has a prime number written on it. Multiple cards may have the same number.</p>

<p>Your goal is to divide the cards into two groups in such a way that the sum of the numbers in the first group is equal to the product of the numbers in the second group. Each card must belong to exactly one of the two groups, and each group must contain at least one card. The sum or product of a group that consists of a single card is simply the number on that card.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22891.%E2%80%85Prime%E2%80%85Time/7e9cc21f.png" data-original-src="https://upload.acmicpc.net/e1647cb9-527d-43ac-b01c-1c0aea1024ca/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 329px; height: 100px;" /></p>

<p>For example, in the image above, the left group has cards whose sum is 25 and the right group has cards whose product is 25. Therefore, this is a valid split into groups.</p>

<p>Your score is the sum of the numbers in the first group (which is equal to the product of the numbers in the second group), or 0 if you cannot split the cards this way at all. What is the maximum score you can achieve?</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T test cases follow. The first line of each test case contains a single integer M, representing the number of distinct prime numbers in your deck. Each of the next M lines contains two values: P<sub>i</sub> and N<sub>i</sub>, representing that you have exactly N<sub>i</sub> cards with the prime P<sub>i</sub> written on them.</p>

<p>Note that the total number of cards in your deck is the sum of all N<sub>i</sub>s.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;x&nbsp;is the test case number (starting from 1) and&nbsp;y&nbsp;is the maximum score you can achieve.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
	<li>1 &le; M &le; 95. (Note that there are exactly 95 distinct primes between 2 and 499)</li>
	<li>2 &le; P<sub>i</sub> &le; 499, for all i.</li>
	<li>Each P<sub>i</sub> is prime.</li>
	<li>P<sub>i</sub> &lt; P<sub>i+1</sub>, for all i. (The primes are given in strictly increasing order)</li>
	<li>1 &le; N<sub>i</sub>, for all i.</li>
</ul>

### 힌트

<p>In Sample Case #1, the optimal split is: 11+2+7+3+2=5&sdot;5. Another split is also possible: 5+7+3+2+5=11&sdot;2, but it gives a lower score.</p>

<p>In Sample Case #2, note that cards with the same number can be placed in different groups.</p>