# [Bronze I] Train Boarding - 21207

[문제 링크](https://www.acmicpc.net/problem/21207)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 152, 정답: 79, 맞힌 사람: 66, 정답 비율: 54.098%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Punctual City is well known for the punctuality of its citizens and its public transportation system. &nbsp;It is particularly famous for its train system. &nbsp;It is always on time, and never too late (or even too early). &nbsp;Statistics about train boarding is regularly collected to keep things running smoothly.</p>

<p>A train has cars numbered $1$ to $N$ (from front to back), each of length $L$ meters. Each car has exactly one door for boarding located at the center ($L/2$ meters from each end of the car). There are no gaps between cars.</p>

<p>When the train stops at the boarding platform, each passenger waiting for the train walks to the door of the car which is closest to them, taking the higher numbered car in the case of a tie.</p>

<p>Given the location of the passengers relative to the train, help the city by reporting the longest distance that any passenger has to walk and the maximum number of passengers boarding any single car.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/8288c350-d229-44b4-a9aa-0b1161dc4065/-/preview/" style="width: 400px; height: 73px;" /></p>

### 입력

<p>The first line of input contains three integers $N$ ($1 \leq N \leq 100$), which is the number of cars of the train, $L$ ($2 \leq L \leq 100$), which is the length of each car, and $P$ ($1 \leq P \leq 1\,000$), which is the number of passengers waiting for the train. It is guaranteed that $L$ is an even number.</p>

<p>The next $P$ lines describe the location of the passengers relative to the train. Each line contains a single integer $x$ ($0 \leq x \leq 10\,000$), which is the distance the passenger is behind the front-end of the train.</p>

### 출력

<p>Display the longest distance that any passenger has to walk on one line. &nbsp;On the next line, display the maximum number of passengers boarding any single car.</p>