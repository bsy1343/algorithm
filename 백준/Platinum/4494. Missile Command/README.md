# [Platinum II] Missile Command - 4494

[문제 링크](https://www.acmicpc.net/problem/4494)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 1, 맞힌 사람: 1, 정답 비율: 16.667%

### 분류

비트마스킹, 브루트포스 알고리즘, 많은 조건 분기, 수학, 물리학

### 문제 설명

<p>As Chief Bureaucrat at Missile Command, it has recently come to your attention that the existing performance guidelines do not sufficiently penalize frivolous use of expensive ammunition. Therefore, you must write a new battle summary analysis tool which takes into account excess ammunition consumption during battle.</p>

<p>A battle consists of the following elements:</p>

<ul>
	<li>Shots. A shot is a circularly explosive countermeasure. A shot has a fixed position and is active for 2 seconds, during which its radius varies from 0 to 1km and then back to 0 according to the formula:
	<ul>
		<li>r = (1 &ndash; (t &ndash; 1)<sup>2</sup>)<sup>1/2</sup></li>
	</ul>
	</li>
	<li>The ground, at y = 0.</li>
	<li>Missiles. A missile is a point particle that moves at a constant velocity. If a missile collides with an active shot, the missile is neutralized (the shot persists). If a missile hits the ground before being neutralized, it is considered to have hit its target.</li>
</ul>

<p>Performance is evaluated on a simple point scale. The performance criteria are as follows:</p>

<ul>
	<li>Every neutralized missile adds 1 point.</li>
	<li>Every missile allowed to hit its target subtracts 5 points.</li>
	<li>Every unnecessary shot subtracts 20 points. The number of unnecessary shots in a battle is&nbsp;the difference between the actual number of shots fired and size of the minimum subset of those shots that would have neutralized the same number of missiles.</li>
</ul>

### 입력

<p>Input will be given in the following format (legend follows):</p>

<pre>
nb
nm
mx my mdx mdy mt ...
ns
sx sy st
...
...</pre>

<p>In the following legend, indentation denotes repetition of the indented block a number of times equal to the value of the preceding input item:</p>

<ul>
	<li>nb (0 &lt; nb) &ndash; number of battles
	<ul>
		<li>nm (0 &lt;= nm &lt;= 20) &ndash; number of missiles
		<ul>
			<li>mx/my (0.0 &lt; my) &ndash; initial missile position (in km)</li>
			<li>mdx/mdy &ndash; missile velocity (in km/s)</li>
			<li>mt (0.0 &lt;= mt) &ndash; time since battle start of the missile&#39;s entrance (in seconds)</li>
		</ul>
		</li>
		<li>ns (0 &lt;= ns &lt;= 20) &ndash; number of shots
		<ul>
			<li>sx/sy (1.0 &lt;= sy) &ndash; shot position at time of detonation (in km)</li>
			<li>st (0.0 &lt;= st) &ndash; time since battle start of the shot&#39;s detonation (in seconds)</li>
		</ul>
		</li>
	</ul>
	</li>
</ul>

### 출력

<p>For each battle, output a line containing the score for that battle.</p>