# [Gold IV] Refract Facts - 11514

[문제 링크](https://www.acmicpc.net/problem/11514)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 65, 정답: 40, 맞힌 사람: 37, 정답 비율: 60.656%

### 분류

수학, 이분 탐색, 물리학

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11514.%E2%80%85Refract%E2%80%85Facts/c3b101e9.png" data-original-src="https://upload.acmicpc.net/fe40bea4-020c-4f5e-84c3-6fcf1fa5cbc7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 241px; height: 170px; float: right;" />A submarine is using a communications laser to send a message to a jet cruising overhead. The sea surface is flat. The submarine is cruising at a depth $d$ below the surface. The jet is at height $h$ above the sea surface, and a horizontal distance $x$ from the sub. The submarine turns toward the jet before starting communications, but needs to know the angle of elevation, $\phi$, at which to aim the laser.</p>

<p>When the laser passes from the sea into the air, it is refracted (its path is bent). The refraction is described by Snell&#39;s law, which says that light approaching the horizontal surface at an angle $\theta_1$, measured from the vertical, will leave at an angle $\theta_2$, given by the formula</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11514.%E2%80%85Refract%E2%80%85Facts/d4625456.png" data-original-src="https://upload.acmicpc.net/e85887ff-f0e7-4df0-b587-55be299a6b40/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float: right; width: 151px; height: 171px;" />\[ \frac{\sin \theta_1}{\sin \theta_2} = \frac{n_1}{n_2} \]</p>

<p>where $n_1$ and $n_2$ are the respective <em>refraction indices</em> of the water and air. (The refraction index of a material is inversely proportional to how fast light can travel through that material.)</p>

### 입력

<p>Input will consist of one or more datasets.</p>

<p>Each dataset will consist of one line with 5 floating point numbers. In order:</p>

<ul>
	<li>$d$, the depth of the submarine (specifically, of the laser emitter) in feet, $1 \leq d \leq 800$</li>
	<li>$h$, the height of the plane in feet, $100 \leq h \leq 10\,000$</li>
	<li>$x$, the horizontal distance from the sub to the plane in feet, $0 \leq x \leq 10\,000$</li>
	<li>$n_1$, the refractive index of water, $1.0 &lt; n_1 \leq 2.5$,</li>
	<li>$n_2$, the refractive index of air, $1.0 \leq n_2 &lt; n_1$</li>
</ul>

<p>A value of 0 for $d$ will signal the end of input.</p>

### 출력

<p>For each dataset, print a single line containing the angle of elevation in degrees, to two decimals precision, at which the submarine should aim its laser to illuminate the jet.</p>

<p>The angle should be displayed in degrees and rounded to the closest 1/100 of a degree. Exactly two digits after the decimal point should be displayed.</p>