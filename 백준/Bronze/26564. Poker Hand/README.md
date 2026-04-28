# [Bronze III] Poker Hand - 26564

[문제 링크](https://www.acmicpc.net/problem/26564)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 332, 정답: 273, 맞힌 사람: 242, 정답 비율: 83.162%

### 분류

구현, 문자열

### 문제 설명

<p>You&#39;re given a five-card hand drawn from a standard 52-card deck. Each card has a rank (one of A, 2, 3, . . . , 9, T, J, Q, K), and a suit (one of C, D, H, S).The strength of your hand is defined as the maximum value k such that there are k cards in your hand that have the same rank.</p>

<p>Find the strength of your hand.</p>

### 입력

<p>The first line of input will contain a single integer n that indicates the number datasets to follow. Each dataset will consist a single line, with five two-character strings separated by spaces. The first character in each string will be the rank of the card, and will be one of A23456789TJQK. The second character in the string will be the suit of the card, and will be one of CDHS. It is guaranteed that all five strings are distinct.</p>

### 출력

<p>For each dataset output, on a single line, the strength of your hand.</p>