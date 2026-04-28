# [Platinum I] New Barns - 15743

[문제 링크](https://www.acmicpc.net/problem/15743)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 301, 정답: 95, 맞힌 사람: 81, 정답 비율: 30.000%

### 분류

트리, 최소 공통 조상, 트리의 지름

### 문제 설명

<p>Farmer John notices that his cows tend to get into arguments if they are packed too closely together, so he wants to open a series of new barns to help spread them out.</p>

<p>Whenever FJ constructs a new barn, he connects it with at most one bidirectional pathway to an existing barn. In order to make sure his cows are spread sufficiently far apart, he sometimes wants to determine the distance from a certain barn to the farthest possible barn reachable from it (the distance between two barns is the number of paths one must traverse to go from one barn to the other).</p>

<p>FJ will give a total of $Q$ ($1 \leq Q \leq 10^5$) queries, each either of the form &quot;build&quot; or &quot;distance&quot;. For a build query, FJ builds a barn and links it with at most one previously built barn. For a distance query, FJ asks you the distance from a certain barn to the farthest barn reachable from it via a series of pathways. It is guaranteed that the queried barn has already been built. Please help FJ answer all of these queries.</p>

### 입력

<p>The first line contains the integer $Q$. Each of the next $Q$ lines contains a query. Each query is of the form &quot;B p&quot; or &quot;Q k&quot;, respectively telling you to build a barn and connect it with barn $p$, or give the farthest distance, as defined, from barn $k$. If $p = -1$, then the new barn will be connected to no other barn. Otherwise, $p$ is the index of a barn that has already been built. The barn indices start from $1$, so the first barn built is barn $1$, the second is barn $2$, and so on.</p>

### 출력

<p>Please write one line of output for each distance query. Note that a barn which is connected to no other barns has farthest distance $0$.</p>

### 힌트

<p>The example input corresponds to this network of barns:</p>

<pre>
  (1) 
    \   
     (2)---(4)
    /
  (3)
</pre>

<p>In query 1, we build barn number 1. In query 2, we ask for the distance of 1 to the farthest connected barn. Since barn 1 is connected to no other barns, the answer is 0. In query 3, we build barn number 2 and connect it to barn 1. In query 4, we build barn number 3 and connect it to barn 2. In query 5, we ask for the distance of 3 to the farthest connected barn. In this case, the farthest is barn 1, which is 2 units away. In query 6, we build barn number 4 and connect it to barn 2. In query 7, we ask for the distance of 2 to the farthest connected barn. All three barns 1, 3, 4 are the same distance away, which is 1, so this is our answer.</p>