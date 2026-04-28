# [Platinum IV] Haircut - 18874

[문제 링크](https://www.acmicpc.net/problem/18874)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 302, 정답: 195, 맞힌 사람: 168, 정답 비율: 67.470%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>Tired of his stubborn cowlick, Farmer John decides to get a haircut. He has $N$ ($1\le N\le 10^5$) strands of hair arranged in a line, and strand $i$ is initially $A_i$ micrometers long ($0\le A_i\le N$). Ideally, he wants his hair to be monotonically increasing in length, so he defines the &quot;badness&quot; of his hair as the number of inversions: pairs $(i,j)$ such that $i &lt; j$ and $A_i &gt; A_j$.</p>

<p>For each of $j=0,1,\ldots,N-1$, FJ would like to know the badness of his hair if all strands with length greater than $j$ are decreased to length exactly $j$.</p>

<p>(Fun fact: the average human head does indeed have about $10^5$ hairs!)</p>

### 입력

<p>The first line contains $N$.</p>

<p>The second line contains $A_1,A_2,\ldots,A_N.$</p>

### 출력

<p>For each of $j=0,1,\ldots,N-1$, output the badness of FJ&#39;s hair on a new line.</p>

<p>Note that the large size of integers involved in this problem may require the use of 64-bit integer data types (e.g., a &quot;long long&quot; in C/C++).</p>

### 힌트

<p>The fourth line of output describes the number of inversions when FJ&#39;s hairs are decreased to length 3. Then $A=[3,2,3,3,0]$ has five inversions: $A_1&gt;A_2,\,A_1&gt;A_5,\,A_2&gt;A_5,\,A_3&gt;A_5,$ and $A_4&gt;A_5$.</p>