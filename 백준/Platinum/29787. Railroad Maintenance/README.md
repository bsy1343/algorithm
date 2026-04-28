# [Platinum II] Railroad Maintenance - 29787

[문제 링크](https://www.acmicpc.net/problem/29787)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

단절점과 단절선, 그래프 이론

### 문제 설명

<p>You are in charge of the maintenance of a railroad network. The network consists of $\mathbf{N}$ stations and $\mathbf{L}$ train lines. Each train line serves a fixed list of stations bidirectionally (trains turn around in the first and last stations of the list). Transfers from one line to another in a station are possible, which means a trip in the network from station $a$ to station $b$ is possible if there is a list of train lines such that the first one serves station $a$, the last one serves station $b$, and for any consecutive pair of train lines in the list there is at least one station that they both serve.</p>

<p>The easiest way to do maintenance is to shut down entire lines, one at a time. However, some train lines may be <i>essential</i>. A train line is essential if removing it would make at least one trip between a pair of stations not possible.</p>

<p>Given the list of existing train lines, calculate how many of them are essential.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow. Each test case starts with a line containing two integers $\mathbf{N}$ and $\mathbf{L}$: the number of stations and train lines in the network. Then, $\mathbf{L}$ groups of 2 lines follow. The first line of the $i$-th group contains a single integer $\mathbf{K_i}$ the number of stations served by the $i$-th train line. The second line of the $i$-th group contains $\mathbf{K_i}$ integers $\mathbf{S_{i,1}}, \mathbf{S_{i,2}}, \dots, \mathbf{S_{i,{K_i}}}$ representing the stations served by the $i$-th train line.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the number of train lines that are essential.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$2 \le \mathbf{K_i} \le \mathbf{N}$ for all $i$.</li>
	<li>$1 \le \mathbf{S_{i,j}} \le \mathbf{N}$, for all $i, j$.</li>
	<li>$\mathbf{S_{i,j}} \ne \mathbf{S_{i,j&#39;}}$, for all $i, j, j&#39;$ such that $j \ne j&#39;$ (Each train line serves a station at most once).</li>
	<li>The trip between all pairs of stations is possible as per the definition above when no train line is shut down.</li>
</ul>

### 힌트

<p>In Sample Case #1, the first train line is essential because it is the only one serving station $2$. Since shutting any other line down would not make travel between at least one pair of stations impossible, they are not essential.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29787.%E2%80%85Railroad%E2%80%85Maintenance/354c6d0c.png" data-original-src="https://upload.acmicpc.net/5b7cb452-ee75-4b5e-9ca7-f01bb5c34e8f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>In Sample Case #2, no line is essential.</p>

<p align="center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29787.%E2%80%85Railroad%E2%80%85Maintenance/5da807a4.png" data-original-src="https://upload.acmicpc.net/c1afe4cb-c80e-4db3-9d7f-6ab41b2aadcf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Sample Case #3 is similar to Sample Case #2, but missing the last train line. That makes all remaining train lines essential.</p>

<p>In Sample Case #4, the last train line is essential as there is no way to go from station $1$ to station $4$ without it. As in Sample Case #1, since this train line already connects every station, no other line is essential.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29787.%E2%80%85Railroad%E2%80%85Maintenance/96e70810.png" data-original-src="https://upload.acmicpc.net/415c1d46-e8e8-409b-bd6e-900af3beb66e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>