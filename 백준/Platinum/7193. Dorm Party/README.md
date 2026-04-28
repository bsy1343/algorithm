# [Platinum I] Dorm Party - 7193

[문제 링크](https://www.acmicpc.net/problem/7193)

### 성능 요약

시간 제한: 15 초, 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 3, 맞힌 사람: 3, 정답 비율: 13.636%

### 분류

이분 매칭

### 문제 설명

<p>In a regular dorm, two stundents share a room: the freshman Jack and the party animal Jude. One day Jude got the idea of hosting a party in their room. Jack, on the other hand, likes peace and quiet and these are hard to come by in a dorm as it is. Since Jack also knows that Jude has a lot of friends, the thought of the party in their $18$ m<sup>2</sup> room makes him shiver.</p>

<p>Jude has decided to invite $N$ girls and $M$ boys to the party. Each girl is interested in some (possibly empty) set of boys and the same set of boys is interested in the girl. To make the party more lively, Jude wants to arrange pairs so that the largest possible number of guests would dance. He can&rsquo;t, however, make a pair dance unless they are interested in each other. Jude, being ignorant in sciences and having no clue what maximum flow even means, got stuck and asked Jack for help.</p>

<p>Jack is afraid that the party might be a success and inspire Jude to organize more of them. It is well known that the level of noise is the main indicator of a party&rsquo;s success. First, a dancing guest is louder than a non-dancing one. Second, if there are two not yet dancing people at the party who are interested in each other, they will spontaneously form a new pair and start dancing; being proud of their initiative (and also somewhat drunk), they will be extra noisy. Jack wants to avoid such pairs at all cost, and furthermore present Jude with a pairing plan that would keep the noise minimal (the least possible number of dancing pairs with no additional pairs of people interested in each other). After thinking for a while, he realized that, given the fairly large crowd Jude has invited, this is not trivial.</p>

<p>Find an arrangement suitable for Jack.</p>

### 입력

<p>The first line of input contains the number of girls $N$ ($1 &le; N &le; 19$), the number of boys $M$ ($1 &le; M &le; 19$), and the number of mutually interested pairs $K$ ($0 &le; K &le; N \cdot M$). Each of the following $K$ lines contains two integers $A_i$ ($1 &le; A_i &le; N$) and $B_i$ ($1 &le; B_i &le; M$) meaning that the girl $A_i$ and the boy $B_i$ are interested in each other.</p>

### 출력

<p>The first line of output should contain an integer $S$, the number of dancing pairs in the arrangement. Each of the following $S$ lines should contain two spaceseparated integers $X_i$ and $Y_i$ meaning that the girl $X_i$ and the boy $Y_i$ should form a pair.</p>