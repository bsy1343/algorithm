# [Platinum III] Knightsbridge Rises - 15037

[문제 링크](https://www.acmicpc.net/problem/15037)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 75, 정답: 32, 맞힌 사람: 23, 정답 비율: 35.938%

### 분류

그래프 이론, 그리디 알고리즘, 최대 유량

### 문제 설명

<p>High-rise buildings in the wealthy retail district of Knightsbridge are usually built with exotic hoisting machines known, in construction circles, as cranes.</p>

<p>While it is common to mount these devices on the ground, it&rsquo;s not always ideal&mdash;for example, a skyscraper building would need an equally tall crane. In these cases, the clever solution the industry has developed is for a smaller crane to be mounted directly on top of the tower.</p>

<p>However, this solution presents another challenge: how can such heavy equipment be brought to the summit in the first place? The industry&rsquo;s solution is to simply use a smaller crane to lift the main crane up. And if that smaller crane is still too massive, find another smaller still, and so on, until said device fits inside a pocket and can be carried up by some enterprising engineer.</p>

<p>Once on top of the building, whether by being carried up, or by being lifted up by another crane capable of holding its weight, a crane can be used to lift others up onto its tower. Once raised, it is not possible to transfer a crane anywhere else.</p>

<p>We have several construction projects in progress at the moment, each with its own requirements on how heavy the loads eventually lifted from the ground need to be. Find an assignment of cranes to buildings that can satisfy these requirements.</p>

### 입력

<ul>
	<li>One line containing an integer N (1 &le; N &le; 100), the number of types of cranes under our command.</li>
	<li>N further lines, each containing a pair of space-separated integers W<sub>i</sub> and L<sub>i</sub> (0 &le; W<sub>i</sub>, L<sub>i</sub> &le; 10<sup>6</sup>), the weight and maximum lifting weight of the i-th crane in kilograms.</li>
	<li>One line containing an integer M (1 &le; M &le; 100), the number of tower blocks.</li>
	<li>One line containing the M space-separated integers T<sub>i</sub> (1 &le; T<sub>i</sub> &le; 10<sup>6</sup>), T<sub>i</sub> being the weight we need to be able to lift from the top of the i-th building by the end.</li>
</ul>

### 출력

<p>If it is not possible to supply all of the buildings, output impossible.</p>

<p>Otherwise, output M lines. The i-th line should contain a list of space-separated integers x<sub>1</sub> . . . x<sub>k</sub> (1 &le; x &le; N), describing the order in which cranes should be raised onto the i-th building from the input.</p>