# [Gold IV] Doner Time! - 33531

[문제 링크](https://www.acmicpc.net/problem/33531)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 32, 정답: 25, 맞힌 사람: 20, 정답 비율: 74.074%

### 분류

그래프 이론, 데이크스트라, 최단 경로

### 문제 설명

<p>Every student knows the practice: after having had one too many drinks in the \PUB, you will go to the Doner Shop to treat yourself with some comfort food.</p>

<p>But experience tells you that you and your friends will not recall the way to the Doner Shop when you are drunk. Besides there are a lot of Doner Shops in the city. Therefore you decide to write a program that will tell you how far away the nearest Doner store is from your current location. And tells you with Doner store is closest.</p>

<p>You may assume you can reach at least one Doner Shop from your current location. You always start at the crossing numbered 1.</p>

### 입력

<p>A line with two integers: $N, 1 &lt; N \le 10000$, the number of crossings in the city, and $S, 1 &lt; S \le 100000$, the number of streets in the city.</p>

<p>$S$ lines with three space seperated integers, $a, b, l, 1 \le a, b \le N , 1 \le l \le 1000$. Which indicate that a street with length $l$ connects crossing a with crossing b. All streets are bi-directional.</p>

<p>An integer $m, 1 \le m \le 1000$, the number of Doner Shops in the city.</p>

<p>$M$ lines with one integer $c, 1 \le c \le N$ which indicates that on crossing $c$ you can find a Doner shop.</p>

### 출력

<p>One line with two space separated integers:</p>

<p>$C$ The number of the crossing at which you can find the closest Doner Shop. If multiple doner stores are equally far away from you, give the one that has the lowest number.</p>

<p>$L$ The length of the shortest route to the closest Doner Shop.</p>