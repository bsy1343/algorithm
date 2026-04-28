# [Gold II] Bridge - 20777

[문제 링크](https://www.acmicpc.net/problem/20777)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 53, 정답: 18, 맞힌 사람: 17, 정답 비율: 39.535%

### 분류

그리디 알고리즘, 많은 조건 분기

### 문제 설명

<p>It&#39;s a sunny day with good scenery, and you come to the park for a walk. You feel curious that there are many old guys gathering by a bridge, and want to take a look at what happened.</p>

<p>There are exactly $n$ old guys on each side of the bridge, and they all want to go across the bridge, take some time for relaxing on the other side, and finally go across the bridge back to the original side. However, they are too old to cross the bridge by themselves.</p>

<p>Driven by the golden spirit in your heart, you want to help these $2n$ old guys. Initially, you are on one side of the bridge. It takes $t$ minutes for you to go across the bridge and $x$ minutes for an old guy relaxing. You may help an old guy when you cross the bridge, which doesn&#39;t take extra time.</p>

<p>As a master of time management, you want to know the minimum time needed to help all these $2n$ old guys. Please write a program to calculate this minimum time.</p>

### 입력

<p>The first line contains one integer $T$ $(1 \leq t \leq 10^4)$, indicating the total number of test cases.</p>

<p>For each of the next $T$ lines, there are three integers $n, x, t$ $(1 \leq n, x, t \leq 10^9)$, as explained in problem statement.</p>

### 출력

<p>You should output exactly $T$ lines. Each line should contain exactly one integer, indicating the minimum time you needed in each test case.</p>

### 힌트

<p>For the first case of the sample data, the optimal plan is shown below, where a numerical digit denotes an old guy, <code>|</code> denotes the bridge, and <code>x</code> denotes you.</p>

<pre>
   Time
     0     x 1 2 | 3 4
     2         2 | 3 4 1 x
     4     x 3 2 | 4 1
     6         3 | 4 1 2 x
     8     x 4 3 | 1 2 x
    10         4 | 1 2 3 x
    12     x 1 4 | 2 3
    14         1 | 2 3 4 x
    16     x 2 1 | 3 4</pre>