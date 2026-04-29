# [Silver III] Honey Cake - 35046

[문제 링크](https://www.acmicpc.net/problem/35046)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 39, 정답: 30, 맞힌 사람: 27, 정답 비율: 81.818%

### 분류

그리디 알고리즘, 수학, 유클리드 호제법, 정수론

### 문제 설명

<p>Hannah and Henry are going to host a party for $n$ people, including themselves.</p>

<p>They bought a honey cake of size $w \times h \times d$ inches for the party, and want to split it into $n$ equal pieces.</p>

<p>The honey cake can be cut parallel to any of its faces. To make cuts precise, each edge of length $w$ is cut into the same number of equal parts, each having integer length; similarly for edges of lengths $h$ and $d$.</p>

<p>Given the dimensions of the honey cake, determine whether it is possible to cut it into $n$ equal pieces, and if so, how.</p>

### 입력

<p>The first line of input contains three integers: $w$, $h$, and $d$, the dimensions of the honey cake in inches ($1 \le w, h, d \le 10^9$).</p>

<p>The second line contains a single integer $n$ ($1 \le n \le 10^9$).</p>

### 출력

<p>Output three integers $w_c$, $h_c$, $d_c$, the number of cuts to be made along each of the dimensions $w$, $h$, and $d$, respectively, if it is possible to cut the cake, or a single integer $-1$ otherwise. Note that making zero cuts along a dimension is allowed, too.</p>

### 힌트

<p>In the first example, the cake will be cut into $5 \cdot 4 \cdot 2 = 40$ pieces of size $2 \times 5 \times 3$ inches.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/35046.%E2%80%85Honey%E2%80%85Cake/1f15af82.png" data-original-src="https://boja.mercury.kr/assets/problem/35046-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 246px; height: 360px;"></p>