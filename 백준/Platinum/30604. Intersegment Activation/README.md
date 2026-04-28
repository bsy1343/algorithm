# [Platinum III] Intersegment Activation - 30604

[문제 링크](https://www.acmicpc.net/problem/30604)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 83, 정답: 31, 맞힌 사람: 24, 정답 비율: 36.923%

### 분류

브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p><em>This is an interactive problem.</em></p>

<p>There is an array of $n$ cells, numbered from $1$ to $n$. For each pair of integers $(i, j)$, where $1 \le i \le j \le n$, there is a barrier covering all cells from $i$ to $j$, inclusive. Each barrier is either <em>active</em> or <em>inactive</em>. A cell is <em>visible</em> if there are no active barriers that cover it. Otherwise, the cell is <em>invisible</em>.</p>

<p>The state of each barrier is unknown to you. All you can observe is the number of visible cells. But you can flip the state of any barrier: if it&#39;s active, it turns inactive, and the other way around. Your task is to make all barriers inactive, so that all cells become visible.</p>

### 입력



### 출력



### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30604.%E2%80%85Intersegment%E2%80%85Activation/61d1e91d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/30604.%E2%80%85Intersegment%E2%80%85Activation/61d1e91d.png" data-original-src="https://upload.acmicpc.net/73d7f6f8-7b9b-4add-ba58-59d6b28fab6a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 237px; height: 130px;" /></p>

<p>In the example, initially, only two barriers, $(1, 2)$ and $(2, 3)$, are active. These two barriers cover all three cells, so $k$ is equal to 0 in the first round.</p>

<ul>
	<li>After flipping the $(2, 2)$ barrier, there are now three active barriers, and still $k = 0$ visible cells.</li>
	<li>After flipping the $(1, 2)$ barrier, cell $1$ becomes visible, so now there is $k = 1$ visible cell.</li>
	<li>After flipping the $(2, 3)$ barrier, cell $3$ also becomes visible. The only invisible cell now is $2$, covered by the only active barrier, $(2, 2)$, and there are $k = 2$ visible cells.</li>
	<li>After flipping the $(2, 2)$ barrier, all barriers are now inactive, and all cells are visible. After reading $k = 3$, the program terminates.</li>
</ul>