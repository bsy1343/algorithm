# [Silver I] Magic with Cards - 28233

[문제 링크](https://www.acmicpc.net/problem/28233)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 73, 정답: 53, 맞힌 사람: 44, 정답 비율: 73.333%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로

### 문제 설명

<p>Mahsa has been practicing shuffling cards for a few months now. Tonight, she finally decided to invite her friends over and show off her new skills. So she picks up a deck with 2n cards, shows her friends the face of the cards whithout changing the deck order and asks someone to pick two positions i and j in the deck. Then, she tells everyone that she is going to move the card in the i-th position to the j-th position by applying only two types of shuffles.</p>

<p>Assume the cards in the deck are &lang;c<sub>1</sub>, c<sub>2</sub>, ..., c<sub>2n</sub>&rang;. Mahsa can perform these two shuffles as many times as she wants:</p>

<p><strong>Riffle</strong>: Divide the cards into two parts&lang;c<sub>1</sub>, c<sub>2</sub>, ..., c<sub>n</sub>&rang; and &lang;c<sub>n+1</sub>, ..., c<sub>2n</sub>&rang; and produce &lang;c<sub>1</sub>, c<sub>n+1</sub>, c<sub>2</sub>, c<sub>n+2</sub>, ..., c<sub>n</sub>, c<sub>2n</sub>&rang;.</p>

<p><strong>Scuffle</strong>: From &lang;c<sub>1</sub>, c<sub>2</sub>, ..., c<sub>2n</sub>&rang;, produce &lang;c<sub>2</sub>, c<sub>1</sub>, c<sub>4</sub>, c<sub>3</sub>, ..., c<sub>2n</sub>, c<sub>2n-1</sub>&rang;.</p>

<p>Help Mahsa find out the minimum number of shuffles she needs, and she&rsquo;ll figure out the rest.</p>

### 입력

<p>The input consists of a single line containing three space-separated integers n, i and j (1 ⩽ n ⩽ 10<sup>5</sup> and 1 ⩽ i, j ⩽ 2n).</p>

### 출력

<p>Print a single integer, the minimum number of shuffles required to bring the i-th card to j-th position. If it is not possible to do so, print -1 instead.</p>