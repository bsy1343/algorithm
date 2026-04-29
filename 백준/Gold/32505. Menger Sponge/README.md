# [Gold V] Menger Sponge - 32505

[문제 링크](https://www.acmicpc.net/problem/32505)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 62, 정답: 36, 맞힌 사람: 33, 정답 비율: 78.571%

### 분류

구현, 수학, 재귀

### 문제 설명

<p>The Menger sponge is a simple 3D fractal. Its level-$L$ approximation can be constructed with the following algorithm:</p>

<ul>
	<li>Start with a single solid $1 \times 1 \times 1$ cube with opposite corners at $(0,0,0)$ and $(1,1,1)$.</li>
	<li>For each iteration $i=1, \dots ,L$:
	<ul>
		<li>For each cube:
		<ul>
			<li>Cut the cube into a regular $3 \times 3 \times 3$ grid of $27$ subcubes.</li>
			<li>Delete the seven subcubes that don’t touch an edge of the parent cube (see illustration).</li>
		</ul>
		</li>
	</ul>
	</li>
</ul>

<p>The points in the level-$L$ Menger sponge are those that remain after running the above algorithm. Points exactly on the boundary of cubes that remain in the sponge <b>are</b> part of the sponge.</p>

<p>The picture below shows the result for $L=0$ through $L=3$:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32505.%E2%80%85Menger%E2%80%85Sponge/e598fd26.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32505-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p>Given a level $L$ and a point in space given by three rational coordinates, determine if the point is in the level-$L$ Menger sponge.</p>

### 입력

<p>The single line of input contains seven integers $L$, $x_{\text{num}}$, $x_{\text{denom}}$, $y_{\text{num}}$, $y_{\text{denom}}$, $z_{\text{num}}$, $z_{\text{denom}}$:</p>

<ul>
	<li>$0≤L≤10^5$</li>
	<li>$0&lt;x_{\text{num}}&lt;x_{\text{denom}}≤10^6$</li>
	<li>$0&lt;y_{\text{num}}&lt;y_{\text{denom}}≤10^6$</li>
	<li>$0&lt;z_{\text{num}}&lt;z_{\text{denom}}≤10^6$</li>
</ul>

<p>where $L$ is the level of the Menger Sponge and the point in question is $\displaystyle\left(\frac{x_{\text{num}}}{x_{\text{denom}}}, \frac{y_{\text{num}}}{y_{\text{denom}}}, \frac{z_{\text{num}}}{z_{\text{denom}}}\right)$.</p>

### 출력

<p>Output a single integer, which is $1$ if the point is in the level-$L$ Menger Sponge, or $0$ if not.</p>