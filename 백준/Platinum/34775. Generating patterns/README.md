# [Platinum I] Generating patterns - 34775

[문제 링크](https://www.acmicpc.net/problem/34775)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 2048 MB

### 통계

제출: 4, 정답: 3, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

가우스 소거법, 브루트포스 알고리즘, 선형대수학, 수학

### 문제 설명

<p>Sandy is developing a new computer as part of the ambitious System for Binary Compression (SBC) project. This project is part of a major technological challenge known as the Interface for Compact Pattern Coding (ICPC), whose goal is to achieve maximum efficiency in writing large volumes of data.</p>

<p>The SBC proposal is bold: choose a base pattern $B$, consisting of $8$ bits $b_0, \dots , b_7$, and from it generate any other pattern by applying only simple, fast operations.</p>

<p>Sandy wants to write a sequence of $N$ bits to memory, with $N ≥ 8$, denoted by $C = c_0, \dots , c_{N−1}$. Initially, memory contains only zeros. She may then repeat the following operation any number of times:</p>

<ul>
<li>Choose an integer $i$ between $−7$ and $N − 1$, the position at which $B$ will be applied;</li>
<li>For each position of $B$ that overlaps the sequence, that is, for every $j$ from $0$ to $7$ such that $0 ≤ i + j ≤ N − 1$, replace $c_{i+j}$ with $b_j ⊕ c_{i+j}$, where $⊕$ denotes the XOR (exclusive OR) operation.</li>
</ul>

<p>The following example illustrates two applications of the procedure: applying pattern $B$ to content $C$, the final result $C′$ is obtained.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34775.%E2%80%85Generating%E2%80%85patterns/000feb88.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34775-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 582px; height: 118px;"></p>

<p>Since the data we want to write to memory is usually not random, Sandy believes that, with a good choice of base pattern $B$, it will be possible to produce the desired content with few operations.</p>

<p>To test this hypothesis, she needs your help: given the content $C$ that must be written to memory, determine the base pattern $B$ that minimizes the number of operations needed to generate $C$ as described, and also the number $Q$ of operations required.</p>

<p>It can be proven that it is always possible to write any content using this procedure. However, for the SBC project to be successful and earn the ICPC seal of excellence, your solution needs to be fast and efficient!</p>

### 입력

<p>The first line contains an integer $N$ ($8 ≤ N ≤ 4096$), the length of $C$.</p>

<p>The second line contains a sequence of $N$ bits, representing $C$, the content that must be written to memory.</p>

### 출력

<p>Your program should print a single line containing the $8$-bit sequence $B$, representing the base pattern that minimizes the number of operations, and an integer $Q$, representing the minimum number of operations.</p>

<p>If there is more than one pattern $B$ that minimizes the number of operations, print the one with the smallest integer value when interpreted in base $2$, where $b_0$ is the most significant bit and $b_7$ is the least significant bit.</p>