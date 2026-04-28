# [Silver II] Illumination Optimization - 29780

[문제 링크](https://www.acmicpc.net/problem/29780)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 27, 맞힌 사람: 23, 정답 비율: 56.098%

### 분류

구현, 그리디 알고리즘

### 문제 설명

<p>Onyaomale is leading a project to exchange the lightbulbs from street lights along a freeway from incandescent ones to LED lightbulbs that are both more energy-efficient and powerful. She started by taking all the old incandescent lightbulbs out, and is now focused on installing the new LED ones. Because the new lightbulbs are more powerful, Onyaomale thinks it is possible that some street lights are not necessary and she can save even more energy by not using them.</p>

<p>We model the freeway as a straight line measuring $\mathbf{M}$ meters that goes from west to east. The $x$-th meter is a point that is $x$ meters to the east of the western end of the freeway. If a street light is located at the $x$-th meter, and a lightbulb with an illumination radius of $\mathbf{R}$ meters is installed on it, then the street light illuminates the segment of freeway starting at the $\max(0, x - \mathbf{R})$-th meter and ending at the $\min(\mathbf{M}, x + \mathbf{R})$-th meter, inclusive. Onyaomale needs to install lightbulbs in such a way that every point of the freeway is illuminated by at least one of them. Notice that this includes illuminating points that are not an integer number of meters away from the freeway endpoints. Street lights that are left without a lightbulb do not illuminate anything.</p>

<p>Given the length of the freeway in meters $\mathbf{M}$, the illumination radius of the new lightbulbs $\mathbf{R}$ and the locations of all street lights, find the minimum number of lightbulbs Onyaomale needs to install to illuminate the whole freeway, or report that it is impossible to do so.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow. Each test case consists of two lines. The first line contains three integers $\mathbf{M}$, $\mathbf{R}$, and $\mathbf{N}$: the length, in meters, of the freeway, the illumination radius, in meters, of the lightbulbs and the number of street lights, respectively. The second line of a test case contains $\mathbf{N}$ sorted integers $\mathbf{X_1}, \mathbf{X_2}, \dots, \mathbf{X_N}$ representing the meters of the freeway where street lights are located.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the minimum number of lightbulbs Onyaomale needs to install to illuminate the whole freeway, if it is possible. If there is no way to illuminate the entire freeway using the current street lights, $y$ should be <code>IMPOSSIBLE</code> instead.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$1 \le \mathbf{M} \le 10^9$.</li>
	<li>$1 \le \mathbf{R} \le 10^9$.</li>
	<li>$0 \le \mathbf{X_1}$.</li>
	<li>$\mathbf{X_i} \lt \mathbf{X_{i+1}}$, for all $i$.</li>
	<li>$\mathbf{X_N} \le \mathbf{M}$.</li>
</ul>

### 힌트

<p>In Sample Case #1, Onyaomale can illuminate the entire freeway by placing bulbs in the western-most and middle street lights only, leaving the eastern-most one unused. With these two lights covering $[0, 5]$ and $[4, 10]$, the entire freeway ($[0, 10]$) is illuminated.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/bb78904f-86f5-4de2-afd2-7c3ca657ed00/-/preview/" /></p>

<p>In Sample Case #2, Onyaomale has the same configuration as in Sample Case #1, but with weaker lightbulbs. In this case, there is no way for her to illuminate the entire freeway. In particular, even if all the street lights are lit, the middle point between the $4$-th and $5$-th meters would still not be illuminated.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/d8735a37-bf6e-4a7d-8bf5-f5ced437cc6b/-/preview/" /></p>

<p>For Sample Case #3 Onyaomale has an additional street light at the $3$-th meter, compared to Sample Case #2, while all other conditions are the same. In this case, installing a lightbulb in every street light is the only way to have the entire freeway illuminated.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c0feb206-926a-43e0-be91-707b0aff0503/-/preview/" /></p>