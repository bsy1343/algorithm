# [Gold IV] Magical Well Of Lilies - 26437

[문제 링크](https://www.acmicpc.net/problem/26437)

### 성능 요약

시간 제한: 15 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 47, 정답: 24, 맞힌 사람: 22, 정답 비율: 53.659%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>There is a deep magical well in a forest that has some lilies on its waters. You have a large empty basket and some coins, and are standing next to the well. You have more coins than there are lilies in the well. The well has taken note of the fact that your basket is empty.</p>

<p>If you toss one coin into the well, the well will toss out one lily into your basket. If you toss four coins at once into the well, the well will take note of how many lilies it has tossed out into your basket so far. If you toss two coins at once into the well, the well will toss out as many lilies into your basket as it had last taken note of. If you toss one coin, or two coins at once, into the well, and there are not enough lilies left in the well, the well will not toss out any lilies.</p>

<p>Given the number of lilies $\mathbf{L}$ in the well at the beginning, return the minimum number of coins you will need to toss into the well to make it toss all of its lilies into your basket.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ lines follow.</p>

<p>Each line contains a single integer $\mathbf{L}$, representing the number of lilies in the well at the beginning.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the minimum number of coins you will need to toss into the well to make it toss out all of its $\mathbf{L}$ lilies into your basket.</p>