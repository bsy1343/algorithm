# [Gold II] Empty Squares - 28044

[문제 링크](https://www.acmicpc.net/problem/28044)

### 성능 요약

시간 제한: 0.1 초, 메모리 제한: 1024 MB

### 통계

제출: 143, 정답: 60, 맞힌 사람: 55, 정답 비율: 52.885%

### 분류

그리디 알고리즘, 많은 조건 분기, 배낭 문제

### 문제 설명

<p>Mart&iacute;n has a board of $1 \times  N$ squares. He also has $N$ tiles of $1 \times 1, 1 \times 2, \dots , 1 \times N$ squares, one of each type. He has placed one of the tiles on the board. His friend, Nico, wants to place some of the remaining tiles in such a way that as many squares as possible are covered. How many squares will remain empty if he succeeds?</p>

<p>Tiles placed on the board cannot overlap each other. Besides, each placed tile must be located completely within the board and must cover whole squares.</p>

### 입력

<p>The input consists of a single line that contains three integers $N$ ($1 &le; N &le; 1000$), $K$ ($1 &le; K &le; N$) and $E$ ($0 &le; E &le; N - K$), indicating that the board has $1 \times N$ squares, and a tile of $1 \times K$ squares is placed leaving $E$ empty squares to its left.</p>

### 출력

<p>Output a single line with an integer indicating the number of squares that will remain empty if Nico covers as many squares as possible with the remaining tiles.</p>