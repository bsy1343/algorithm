# [Platinum I] Jump - 35225

[문제 링크](https://www.acmicpc.net/problem/35225)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 8, 정답: 7, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

수학

### 문제 설명

<p>The Unsightly Halfwits are putting on a wild concert in their natural habitat of Húsavík. Their lead singer, Sveinn “Springheel” Jónsson, is leaping about the stage with vigorous energy, turning every note into a spectacle. But keeping in rhythm while bouncing so chaotically is no easy task, and you can’t help but wonder how long he can keep this up.</p>

<p>Sveinn starts with an energy level of $E$. The song plays a beat exactly every $N$ milliseconds. His first jump launches at time $0$, perfectly in sync with the music. As long as his energy $E$ is strictly positive ($E&gt;0$), each jump lasts exactly $E$ milliseconds. When his energy runs out with $E=0$, he collapses and the show is over. If he still has energy after landing, he immediately springs up again for the next jump. When Sveinn lands exactly on a beat, he gains $+1$ energy from sheer enjoyment. But if he’s even slightly off-beat, his energy drops by $1$.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with two integers $N, E$, the number of milliseconds between beats and the initial energy level of the lead singer. These will satisfy $1 \leq N \leq 3 \cdot 10^5$ and $1 \leq E \leq 10^9$.</li>
</ul>

### 출력

<p>Output a single integer, the number of milliseconds that will pass before Sveinn stops jumping. If he never stops, instead print <code>infinity</code>.</p>