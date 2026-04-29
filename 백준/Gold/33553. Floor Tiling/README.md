# [Gold IV] Floor Tiling - 33553

[문제 링크](https://www.acmicpc.net/problem/33553)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 68, 정답: 39, 맞힌 사람: 34, 정답 비율: 58.621%

### 분류

다이나믹 프로그래밍, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>Your friend John has recently moved to the city of Delft. During the decoration of one of the rooms in his house, he decided that he does not like the current floor in the room. He has seen several interesting floor patterns but there's one pattern that has his favor: a floor that is covered domino planks. A domino plank is a special type of plank that has a width of one meter and a height of two meters. The planks can be laid out horizontally or vertically and cannot be sawed into smaller pieces. Now John still has to decided how the floor is going to look like because there are many possibilities to cover the whole floor. For example, if the room of John is 3x8 meters, there are already 153 possible ways of covering the floor!</p>

<p>John would like to know how many possibilities there are for each room in his house. Since he's very smart, he has come up with a program that outputs, given the height and width of the room, the number of ways to cover the floor of the room with domino tiles. He challenges you to do the same, but he made the problem easier: you can assume that the width of the rooms is always 3 meter. Moreover, you can assume that the width of the room is even (otherwise the floor cannot be fully covered with domino planks). Can you solve the challenge of John and tell how many possible coverings there are for a 3 x $ 2n $ floor?</p>

### 입력

<p>A single integer n, $1 \leq n \leq 100$.</p>

### 출력

<p>The number of different ways in which a $ 3 $ x $ 2n $ floor can be tiled with domino planks.</p>