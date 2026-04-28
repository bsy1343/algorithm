# [Gold II] Gwen's Gift - 22280

[문제 링크](https://www.acmicpc.net/problem/22280)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 10, 정답 비율: 76.923%

### 분류

수학, 누적 합, 조합론

### 문제 설명

<p>Gwen loves most numbers. In fact, she loves every number that is <em>not</em> a multiple of $n$ (she really hates the number $n$). For her friends&#39; birthdays this year, Gwen has decided to draw each of them a sequence of $n-1$ flowers. Each of the flowers will contain between $1$ and $n-1$ flower petals (inclusive). Because of her hatred of multiples of $n$, the total number of petals in any non-empty contiguous subsequence of flowers cannot be a multiple of $n$. For example, if $n = 5$, then the top two paintings are valid, while the bottom painting is not valid since the second, third and fourth flowers have a total of $10$ petals. (The top two images are Sample Input $3$ and $4$.)</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22280.%E2%80%85Gwen's%E2%80%85Gift/dbf8c592.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22280.%E2%80%85Gwen's%E2%80%85Gift/dbf8c592.png" data-original-src="https://upload.acmicpc.net/c31811c9-b7de-4d8f-b2b6-f02774be6a02/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 572px; height: 160px;" /></p>

<p>Gwen wants her paintings to be unique, so no two paintings will have the same sequence of flowers. &nbsp;To keep track of this, Gwen recorded each painting as a sequence of $n-1$ numbers specifying the number of petals in each flower from left to right. &nbsp;She has written down all valid sequences of length $n-1$ in lexicographical order. A sequence $a_1,a_2,\dots, a_{n-1}$ is lexicographically smaller than $b_1, b_2, \dots, b_{n-1}$ if there exists an index $k$ such that $a_i = b_i$ for $i &lt; k$ and $a_k &lt; b_k$.</p>

<p>What is the $k$th sequence on Gwen&#39;s list?</p>

### 입력

<p>The input consists of a single line containing two integers $n$ ($2 \leq n \leq 1\,000$), which is Gwen&#39;s hated number, and $k$ ($1 \leq k \leq 10^{18}$), which is the index of the valid sequence in question if all valid sequences were ordered lexicographically. It is guaranteed that there exist at least $k$ valid sequences for this value of $n$.</p>

### 출력

<p>Display the $k$th sequence on Gwen&#39;s list.</p>