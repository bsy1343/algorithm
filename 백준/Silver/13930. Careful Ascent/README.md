# [Silver V] Careful Ascent - 13930

[문제 링크](https://www.acmicpc.net/problem/13930)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 163, 정답: 110, 맞힌 사람: 95, 정답 비율: 68.841%

### 분류

수학, 구현

### 문제 설명

<p>That went well! As police sirens rang out around the palace, Mal Reynolds had already reached his lifting device outside of the city.</p>

<p>No spaceship can escape Planet Zarzos without permission from the High Priest. However, Mal&rsquo;s spaceship, Firefly, is in geostationary orbit well above the controlled zone and his small lifting device can avoid being recognised as an intruder if its vertical velocity is exactly 1 km/min.</p>

<p>There are still two problems. First, Mal will not be able to control the vehicle from his space suit, so he must set up the autopilot while on the ground. The vertical velocity must be exactly 1 km/min and the horizontal velocity must be set in such a way that Mal will hit the Firefly on the resulting trajectory. Second, the energy shields of the planet disturb the autopilot: They will decrease or increase the horizontal velocity by a given factor. The original horizontal velocity is restored as soon as there is no interference. For this problem we consider Firefly to be a single point &ndash; the shape shown in Figure C.1 is merely for decorative purposes.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/13930.%E2%80%85Careful%E2%80%85Ascent/56e67841.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13930/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-28%20%EC%98%A4%ED%9B%84%204.10.43.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:175px; width:350px" /></p>

<p>Figure C.1: Illustration of Sample Input 1.</p>

<p>Luckily, Mal recorded the positions of the shields and their influence on the autopilot during his descent. What he needs now is a program telling him the right horizontal velocity setting.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with two integers x, y (&minus;10<sup>7</sup> &le; x &le; 10<sup>7</sup> , |x| &le; y &le; 10<sup>8</sup> and 1 &le; y), Firefly&rsquo;s coordinates relatively to Mal&rsquo;s current position (in kilometres).</li>
	<li>one line with an integer n (0 &le; n &le; 100), the number of shields.</li>
	<li>n lines describing the n shields, the ith line containing three numbers:
	<ul>
		<li>an integer l<sub>i</sub> (0 &le; l<sub>i</sub> &lt; y), the lower boundary of shield i (in kilometres).</li>
		<li>an integer u<sub>i</sub> (l<sub>i</sub> &lt; u<sub>i</sub> &le; y), the upper boundary of shield i (in kilometres).</li>
		<li>a real value f<sub>i</sub> (0.1 &le; f<sub>i</sub> &le; 10.0), the factor with which the horizontal velocity is multiplied during the traversal of shield i.</li>
	</ul>
	</li>
</ul>

<p>It is guaranteed that shield ranges do not intersect, i.e., for every pair of shields i &ne; j either u<sub>i</sub> &le; l<sub>j</sub> or u<sub>j</sub> &le; l<sub>i </sub>must hold.</p>

<p>All real numbers will have at most 10 digits after the decimal point.</p>

### 출력

<p>Output the horizontal velocity in km/min which Mal must choose in order to reach Firefly. The output must be accurate to an absolute or relative error of at most 10<sup>&minus;6</sup> .</p>