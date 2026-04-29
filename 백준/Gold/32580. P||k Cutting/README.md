# [Gold I] P||k Cutting - 32580

[문제 링크](https://www.acmicpc.net/problem/32580)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 59, 정답: 21, 맞힌 사람: 15, 정답 비율: 44.118%

### 분류

두 포인터

### 문제 설명

<p>The farmer needs some pork to be packed. This may take several days, so the farmer has allocated $N$ possible days when the packing can be performed. The whole packing process needs to be completed in a sequence of consecutive days with at least one day. This sequence of days, also called an interval, may not necessarily contain all allocated days.</p>

<p>The farmer has called the bulls and donkeys to help and to do the entire packing job. The bulls and donkeys do not work for free, so the farmer assigned to each day a particular number of cookies he is willing to pay, if the animals work on that day.</p>

<p>The bulls, not being the smartest animals, protested against using such advanced mathematics as summing several numbers of cookies in several consecutive days. They insist on being paid a fixed amount of $K$ cookies, no matter when or for how long they work.</p>

<p>On the other hand, the donkeys considered the sum to be a too ordinary mathematical operation and required that they are paid the bitwise OR of the numbers of cookies offered for the individual days.</p>

<p>Bitwise OR of two given integers is computed by taking their binary representation and keeping the digit 1 in the result on exactly those positions where at least one of the given two integers has digit 1. For instance, bitwise OR of $9$ and $5$ is $13$.</p>

<p>Furthermore, the bulls and donkeys are willing to work only when they are both paid the exact same total amount. The farmer, finding himself unwilling to deal with the animals any longer, agreed to their conditions and wants to know how many options does he have for scheduling the work. As such, your task is to count the total number of distinct non-empty intervals of days on which the animals are willing to work. Counted intervals may overlap.</p>

### 입력

<p>The first input line contains two integers $N$, $K$ ($1 ≤ N ≤ 4 \cdot 10^5$, $0 ≤ K ≤ 10^9$), the total number of days in which pork can be packed on the farm, and the amount of cookies the bulls want to be paid.</p>

<p>The second line contains $N$ integers $a_i$ ($0 ≤ a_i ≤ 10^9$), the offered number of cookies on the $i$-th day.</p>

### 출력

<p>Output single integer $P$, the number of intervals in which the animals are willing to work together.</p>