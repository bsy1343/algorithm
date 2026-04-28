# [Platinum II] Cooperation Game - 28165

[문제 링크](https://www.acmicpc.net/problem/28165)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 76, 정답: 54, 맞힌 사람: 48, 정답 비율: 78.689%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 세그먼트 트리

### 문제 설명

<p>Athletic contests in schools sometimes get too heated. To promote cooperation, the teachers have devised a game where cooperation leads to better scores. </p>

<p>This cooperation game starts with $N$ students standing in a line. To get a score, two students from the same class will get out of the line. If they were $i$-th and $j$-th students along the line, just before they went out, they add $|i - j|$ to the total score. The empty places of the two students that just came out will be compacted. The game stops when there are no more pairs of students from the same class.</p>

<p>For example, consider six students initially standing in a line:</p>

<p>$$ 1, 2, 3, 3, 2, 1 $$</p>

<p>The numbers are class numbers of the students. If the students come out from the line in the order of class number $1$, then class number $2$, then class number $3$, the total score is $5 + 3 + 1 = 9$. However, in the same initial situation, if the students come out from the line in the order of $3$, $2$, $1$, then the total score is $1 + 1 + 1 = 3$.</p>

<p>Given the class numbers in the initial line, write a program to calculate the maximum possible score. </p>

### 입력

<p>The first line contains an integer $T$, the number of test cases ($1 \le T \le 48$). The test cases follow.</p>

<p>The first line of each test case contains a single integer $N$, the number of students ($1 \le N \le 300\,000$).</p>

<p>In the next line, the sequence of class numbers are given. The class numbers are integers from $1$ to $N$.</p>

<p>The sum of $N$ over all test cases does not exceed $7\,000\,000$.</p>

### 출력

<p>For each test case, print a line with a single integer: the maximum possible score.</p>