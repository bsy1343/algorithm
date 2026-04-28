# [Platinum III] Form the Maximal Set - 19034

[문제 링크](https://www.acmicpc.net/problem/19034)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 53, 정답: 25, 맞힌 사람: 14, 정답 비율: 43.750%

### 분류

가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>Consider $n$ points placed around a circumference so that they form a regular polygon. Points are enumerated in clockwise order by sequential integers between $1$ and $n$. The number of points is even.</p>

<p>Each point is connected with exactly one other point, so $n / 2$ chords are formed. You may replace $k$ of those chords with arbitrary chords (even if they don&#39;t end in any of the given points), and then select set of chords such that each pair of chords in the set is intersecting. Your goal is to replace the chords and and select the set in such a way that the size of the set is maximum possible.</p>

### 입력

<p>The first line of input contains two integers $n$ and $k$ ($2 \le n \le 8000$, $n$ is even, $0 \le k \le \min (n / 2, 20)$).</p>

<p>The second line contains a permutation $P$ of the first $n$ integers denoting the connection. If $P_i = j$, it means that points $i$ and $j$ are connected by a chord. It is guaranteed that if $P_i = j$ then $P_j = i$, and that $P_i \ne i$.</p>

### 출력

<p>Print one integer: the maximal size of a set of intersecting chords which may be selected after changing $k$ of the given chords.</p>

### 힌트

<p>In the second example, you may replace the chord $(1, 7)$ to obtain a set of three intersecting chords: for example, all chords except $(2, 4)$ form a pairwise intersecting set.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19034.%E2%80%85Form%E2%80%85the%E2%80%85Maximal%E2%80%85Set/edb513f0.png" data-original-src="https://upload.acmicpc.net/48623b79-d971-4d75-a7a4-2057309660ab/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 307px;" /></p>