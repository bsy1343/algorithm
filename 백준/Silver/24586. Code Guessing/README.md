# [Silver V] Code Guessing - 24586

[문제 링크](https://www.acmicpc.net/problem/24586)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 192, 정답: 98, 맞힌 사람: 87, 정답 비율: 52.096%

### 분류

브루트포스 알고리즘, 많은 조건 분기

### 문제 설명

<p>Alice and Bob are playing a board game with a deck of nine cards. For each digit between 1 to 9, there is one card with that digit on it. Alice and Bob each draw two cards after shuffling the cards, and see the digits on their own cards without revealing the digits to each other. Then Alice gives her two cards to Bob. Bob sees the digits on Alice&rsquo;s cards and lays all the four cards on the table in increasing order by the digits. Cards are laid facing down.</p>

<p>Bob tells Alice the positions of her two cards. The goal of Alice is to guess the digits on Bob&rsquo;s two cards. Can Alice uniquely determine these two digits and guess them correctly?</p>

### 입력

<p>The input has two integers p, q (1 &le; p &lt; q &le; 9) on the first line, giving the digits on Alice&rsquo;s cards. The next line has a string containing two &lsquo;<code>A</code>&rsquo;s and two &lsquo;<code>B</code>&rsquo;s, giving the positions of Alice&rsquo;s and Bob&rsquo;s cards on the table. It is guaranteed that Bob correctly sorts the cards and gives the correct positions of Alice&rsquo;s cards.</p>

### 출력

<p>If Alice can uniquely determine the two digits on Bob&rsquo;s cards, output the two digits on a single line, starting with the smaller digit. Otherwise, output -1.</p>