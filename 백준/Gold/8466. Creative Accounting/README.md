# [Gold II] Creative Accounting - 8466

[문제 링크](https://www.acmicpc.net/problem/8466)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 22, 정답: 14, 맞힌 사람: 9, 정답 비율: 60.000%

### 분류

자료 구조, 집합과 맵, 누적 합, 트리를 사용한 집합과 맵

### 문제 설명

<p>Byteasar and his friends were spending their summer vacation in the well known Byten-Byten resort. Where there are lots of tourists, the prices are high, so Byteasar and his friends decided to perform some work to earn additional money from time to time. Byteasar was a treasurer of the whole group.</p>

<p>After coming home the group is going to count up. The friends have decided that they will divide the whole surplus (or debt) evenly. If even division is not possible, Byteasar, as a reward for his work as a treasurer, will receive some additional money from the common budget so that the final amount of money is divisible by the size of the group. In particular, if the total balance is negative (a debt), Byteasar&#39;s reward will increase the debt.</p>

<p>Byteasar has invented a nasty plan. He has decided to show his friends only a part of his transcript corresponding to a period of time between the -th and the -th day. He would like to select those days in such a way that the corresponding total balance would yield him the maximum amount of money. Obviously, in such way the surplus or debt might still not be divisible by the size of the group after Byteasar takes the money, but if so, he will surely think of some good explanation for that.</p>

<p>Write a program that computes the amount of money that Byteasar will receive for serving as a treasurer if he chooses the period of time in an optimal way.</p>

### 입력

<p>The first line of input contains two integers n and m (1 &le; n &le; 200 000, 2 &le; m &le; 10<sup>18</sup>) that represent the duration of the vacation (in days) and the size of the group of friends (including Byteasar). The second line contains a sequence of n integers a<sub>i</sub> (|a<sub>i</sub>| &le; 10<sup>18</sup>) that describes the financial outcomes on the consecutive days (in bythalers). A positive value means that the income is greater than the spending.</p>

### 출력

<p>Your program should print a single integer - the maximum amount of bythalers that Byteasar can receive for serving as a treasurer.</p>

### 힌트

<p>Byteasar will show a part of his transcript corresponding to days 1 to 3. During this period the group earned 24 bythalers. The remainder of this number by 13 is 11, which is Byteasar&#39;s income for serving as a treasurer.</p>