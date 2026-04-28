# [Platinum II] Hotel - 3309

[문제 링크](https://www.acmicpc.net/problem/3309)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 128 MB

### 통계

제출: 108, 정답: 31, 맞힌 사람: 28, 정답 비율: 33.735%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 트리를 사용한 집합과 맵

### 문제 설명

<p>Your friend owns a hotel at the seaside in Gdynia. The summer season is just starting and he is overwhelmed by the number of offers from potential customers. He asked you for help in preparing a reservation system for the hotel.</p>

<p>There are n rooms for rent in the hotel, the i-th room costs your friend c<sub>i</sub> zlotys of upkeep (only if it is rented) and has a capacity of p<sub>i</sub> people. You may assume that the upkeep of a room is never cheaper than the upkeep of any smaller room, that is, of any room which can hold a smaller number of people.</p>

<p>The reservation system will be receiving multiple offers, each of them specifying the amount of zlotys for rental of any room (v<sub>j</sub>) for one particular day and the minimal capacity of the requested room (d<sub>j</sub>). For each offer, only a single room can be rented. And conversely: each room can accommodate only a single offer. Your friend has decided not to accept more than o offers.</p>

<p>Knowing you are a skilled programmer, your friend asked you to implement the part of the system which finds the maximum profit (total income from renting out rooms minus their upkeep) he can make by accepting some of the offers.</p>

### 입력

<p>The first line of the standard input contains three integers n, m, and o (1 &le; n, m &le; 500 000, 1 &le; o &le; min(m, n)), denoting the number of rooms in the hotel, the number of offers received and the maximum number of offers your friend is willing to accept. The next n lines describe the rooms, with the i-th of these lines containing two integers c<sub>i</sub>, p<sub>i</sub> representing the upkeep of the room in zlotys and the capacity of the room (1 &le; c<sub>i</sub>, p<sub>i</sub> &le; 10<sup>9</sup>).</p>

<p>The next m lines describe the offers, with the j-th of these lines containing two integers v<sub>j</sub>, d<sub>j</sub> representing the offered rental price in zlotys and the minimal capacity of the requested room (1 &le; v<sub>j</sub>, d<sub>j</sub> &le; 10<sup>9</sup>).</p>

### 출력

<p>The first and only line of the standard output should contain one integer equal to the maximum profit your friend can achieve accepting at most o of the offers. Note that the profit might get big.</p>

### 힌트

<p>Your friend can accept both offers, renting out rooms number 2 and 3.</p>