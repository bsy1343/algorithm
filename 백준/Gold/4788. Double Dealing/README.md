# [Gold II] Double Dealing - 4788

[문제 링크](https://www.acmicpc.net/problem/4788)

### 성능 요약

시간 제한: 15 초, 메모리 제한: 32 MB

### 통계

제출: 88, 정답: 27, 맞힌 사람: 24, 정답 비율: 33.803%

### 분류

수학, 순열 사이클 분할

### 문제 설명

<p>Take a deck of n unique cards. Deal the entire deck out to k players in the usual way: the top card to player 1, the next to player 2, the kth to player k, the k+1st to player 1, and so on. Then pick up the cards &ndash; place player 1&prime;s cards on top, then player 2, and so on, so that player k&rsquo;s cards are on the bottom. Each player&rsquo;s cards are in reverse order &ndash; the last card that they were dealt is on the top, and the first on the bottom.</p>

<p>How many times, including the first, must this process be repeated before the deck is back in its original order?</p>

### 입력

<p>There will be multiple test cases in the input. Each case will consist of a single line with two integers, n and k (1&le;n&le;800, 1&le;k&le;800). The input will end with a line with two 0s.</p>

### 출력

<p>For each test case in the input, print a single integer, indicating the number of deals required to return the deck to its original order. Output each integer on its own line, with no extra spaces, and no blank lines between answers. All possible inputs yield answers which will fit in a signed 64-bit integer.</p>