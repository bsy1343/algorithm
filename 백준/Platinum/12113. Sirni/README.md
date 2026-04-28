# [Platinum III] Sirni - 12113

[문제 링크](https://www.acmicpc.net/problem/12113)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 768 MB

### 통계

제출: 154, 정답: 38, 맞힌 사람: 22, 정답 비율: 17.742%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>Little Daniel has a bag of candy and N cards.</p>

<p>Each of the cards has a positive integer Pi written on it. While Daniel was eating his candy, he thought of a fun game. He can tie together two cards with labels a and b, and then he must eat min(P<sub>a</sub> % P<sub>b</sub> , P<sub>b</sub> % P<sub>a</sub>) of candy, where operation x % y denotes the remainder when dividing x with y.</p>

<p>He wants to tie together pairs of cards in a way that, when he lifts one of them, all the rest are also lifted up. Each card can be directly connected with a tie to any number of other cards. As Daniel is watching his figure, he doesn&rsquo;t want to consume too much, so he is asking you to calculate the minimal number of candy he must eat so all cards are connected.</p>

### 입력

<p>The first line of input contains the positive integer N. (1&nbsp;&le; N &le; 10<sup>5</sup>)&nbsp;</p>

<p>Each of the following N lines contains a positive integer P<sub>i</sub>(1 &le; P<sub>i</sub> &le; 10<sup>7</sup>).</p>

<p>In test cases worth 30% of total points, it will hold N &le; 10<sup>3</sup><br />
In test cases worth 40% of total points, it will hold P<sub>i</sub>&nbsp;&le; 10<sup>6</sup><br />
In test cases worth 70% of total points, at least one of the two conditions will hold.</p>

### 출력

<p>The first and only line of output must contain the required value from the task.</p>

### 힌트

<p>Daniel can connect the first and second card and eat 0 candy, the second and third and eat 0 candy, and the first and fourth and eat 1 candy.</p>