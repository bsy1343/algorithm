# [Silver I] Leaps Tall Buildings (in a single bound) - 4427

[문제 링크](https://www.acmicpc.net/problem/4427)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 12, 맞힌 사람: 12, 정답 비율: 75.000%

### 분류

수학, 물리학

### 문제 설명

<p><em>It&#39;s a bird! It&#39;s a plane! It&#39;s coming right at us!</em></p>

<p>Although it sometimes seems like it, Superman can&#39;t fly (without a plane). Instead, he makes super-human leaps, especially over tall buildings. Since he never knows when he will need to catch a criminal, he can&#39;t register flight paths. To avoid hitting planes, he tries to keep his jumps as low to the ground as he can. Given a city-scape as input, find the angle and velocity of Superman&#39;s jump that minimizes his maximum altitude.</p>

<p>Recall that gravity provides an acceleration of 9.8 m/s<sup>2</sup>&nbsp;downwards and the formula for Superman&#39;s vertical distance from his starting location is&nbsp;<var>d(t)</var>=<var>v</var>&nbsp;<var>t</var>&nbsp;+ 0.5&nbsp;<var>a</var>&nbsp;<var>t</var><sup>2</sup>&nbsp;where&nbsp;<var>v</var>&nbsp;is his initial velocity,&nbsp;<var>a</var>&nbsp;is his acceleration and&nbsp;<var>t</var>&nbsp;is time in seconds since the start of the leap.</p>

### 입력

<p>Input consists of a sequence of city-scapes, each of the form</p>

<pre>
n
0 d<sub>1</sub>
h<sub>2</sub> d<sub>2</sub>
:
h<sub>(n-1)</sub> d<sub>(n-1)</sub>
0 d<sub>n</sub></pre>

<p>Superman starts at ground level and leaps&nbsp;d<sub>1</sub>+...+d<sub>n</sub>&nbsp;metres, landing at ground level and clearing all of the buildings at heights&nbsp;h<sub>2</sub>&nbsp;to&nbsp;h<sub>(n-1)</sub>, each with the given widths.&nbsp;n&nbsp;will be at most 100.</p>

### 출력

<p>Output is the angle and initial velocity that minimizes the height that Superman attains, both appearing on the same line. The values should be given to two decimal places and be accurate within 0.01 degrees or m/s, as appropriate.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/4427.%E2%80%85Leaps%E2%80%85Tall%E2%80%85Buildings%E2%80%85(in%E2%80%85a%E2%80%85single%E2%80%85bound)/341f8688.png" data-original-src="https://upload.acmicpc.net/2a1d0777-1c98-4fee-a785-8374262a32fe/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>