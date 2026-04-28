# [Silver V] Perfect Shuffle - 9492

[문제 링크](https://www.acmicpc.net/problem/9492)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 510, 정답: 368, 맞힌 사람: 334, 정답 비율: 74.058%

### 분류

수학, 구현, 문자열, 사칙연산

### 문제 설명

<p>A Perfect Shuffle of a deck of cards is executed by dividing the deck exactly in half, and then alternating cards from the two halves, starting with the top half.&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/9492.%E2%80%85Perfect%E2%80%85Shuffle/32d3499c.png" data-original-src="https://www.acmicpc.net/upload/images2/ps.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:103px; width:593px" /></p>

<p>Given a deck of cards, perform a Perfect Shuffle. If there is an odd number of cards, give the top half split one more card than the bottom half.</p>

### 입력

<p>There will be several test cases in the input. Each test case will begin with a line with a single integer n (1&le;n&le;1,000), indicating the number of cards. On each of the next n lines will be a string from 1 to 80 characters in length, which is the name of a card. It will contain only capital letters and dashes. Within a test case, all card names will be unique. Input will end with a line with a single 0.</p>

### 출력

<p>For each test case, output n lines, consisting of the deck after a perfect shuffle. Output no extra spaces. Do not print a blank line between answers.</p>