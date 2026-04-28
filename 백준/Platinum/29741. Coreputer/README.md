# [Platinum III] Coreputer - 29741

[문제 링크](https://www.acmicpc.net/problem/29741)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 1024 MB

### 통계

제출: 43, 정답: 12, 맞힌 사람: 11, 정답 비율: 28.947%

### 분류

애드 혹, 이분 탐색

### 문제 설명

<p>Coreputer, the brand new computing machine has $N$ <strong>core</strong>s numbered from $0$ to $N - 1$. Recent maintenance revealed that some of the cores are malfunctioning. It is unknown which specific cores are malfunctioning, but there is <em>at least</em> one malfunctioning core.</p>

<p>To find the malfunctioning cores, Coreputer can run <strong>diagnostic scan</strong>s. In each scan, the user tags a (possibly empty) group of <em>distinct</em> cores $T[0],\dots ,T[l - 1]$ for some $0 &le; l &le; N$. The rest of the cores are untagged. Coreputer then benchmarks the tagged cores and the untagged ones. Finally, it reports which of the two groups contains a greater number of malfunctioning cores, or that the two groups contain an equal number of malfunctioning cores. Note that an empty group contains 0 malfunctioning cores.</p>

<p>Your task is to find the malfunctioning cores by running diagnostic scans on Coreputer.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$2 &le; N &le; 16$</li>
</ul>