# [Platinum II] Cowreography - 31766

[문제 링크](https://www.acmicpc.net/problem/31766)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 156, 정답: 46, 맞힌 사람: 41, 정답 비율: 33.607%

### 분류

그리디 알고리즘

### 문제 설명

<p>The cows have formed a dance team, and Farmer John is their choreographer! The team&#39;s latest and greatest dance involves $N$ cows ($2 \le N \le 10^6$) standing in a line. Each move in the dance involves two cows, up to $K$ positions apart ($1 \le K &lt; N$), gracefully jumping and landing in each other&#39;s position.</p>

<p>There are two types of cows in the line &ndash; Guernseys and Holsteins. As such, Farmer John has documented the dance as a sequence of <strong>length-$N$ binary strings</strong>, where a $0$ represents a Guernsey, a $1$ represents a Holstein, and the overall string represents how the cows are arranged in the line.</p>

<p>Unfortunately, Farmer Nhoj (who choreographs for a rival team) has sabotaged the dance and erased all but the first and last binary strings! With a big competition quickly approaching, Farmer John must waste no time in reconstructing the dance.</p>

<p>Given these two binary strings, help Farmer John find the minimum number of moves in the dance!</p>

### 입력

<p>The first line contains $N$ and $K$.</p>

<p>The second line contains the first binary string.</p>

<p>The third line contains the last binary string.</p>

<p>It is guaranteed that both binary strings contain the same number of ones.</p>

### 출력

<p>The minimum number of moves in the dance.</p>