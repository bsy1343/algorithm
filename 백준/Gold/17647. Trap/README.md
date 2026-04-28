# [Gold IV] Trap - 17647

[문제 링크](https://www.acmicpc.net/problem/17647)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 23, 맞힌 사람: 18, 정답 비율: 75.000%

### 분류

브루트포스 알고리즘, 백트래킹, 재귀, 런타임 전의 전처리

### 문제 설명

<p>We form a sequence of points that are vertices with integer coordinates in a square grid. Each two consecutive points of the sequence define a single horizontal or vertical segment of length one. We call this sequence a walk. Consider such walks composed of n segments that are self-avoiding (i.e. segments in the walk are not intersecting themselves and do not touch each other, except any two consecutive segments). We also want the first segment in the walk to join the points with coordinates (0,0) and (1,0), and the first vertical segment to be going up.</p>

<p>Write program that computes the number of all self-avoiding walks on square grid that are trapped after n steps, i.e. which are not possible to continue, because adding the next (n + 1) segment will cause self-intersection.</p>

### 입력

<p>An integer n.</p>

### 출력

<p>An integer equal to the requested number.</p>

### 제한

<ul>
	<li>0 &lt; n &lt; 27</li>
</ul>

### 힌트

<p>The two walks are (0,0) (1,0) (2,0) (2,1) (2,2) (1,2) (0,2) (0,1) (1,1) and (0,0) (1,0) (1,1) (2,1) (3,1) (3,0) (3, -1) (2, -1) (2,0), and they are depicted in the figures:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17647.%E2%80%85Trap/50c90354.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/17647.%E2%80%85Trap/50c90354.png" data-original-src="https://upload.acmicpc.net/38edb3e0-b37d-4390-803a-222cbcacb900/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 640px; height: 259px;" /></p>