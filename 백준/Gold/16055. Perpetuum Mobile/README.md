# [Gold II] Perpetuum Mobile - 16055

[문제 링크](https://www.acmicpc.net/problem/16055)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 14, 맞힌 사람: 12, 정답 비율: 35.294%

### 분류

플로이드–워셜, 그래프 이론, 수학, 최단 경로

### 문제 설명

<p>The year is 1902. Albert Einstein is working in the patent office in Bern. Many patent proposals contain egregious errors; some even violate the law of conservation of energy. To make matters worse, the majority of proposals make use of non-standard physical units that are not part of the metric system (or not even documented). All proposals are of the following form:</p>

<ul>
	<li>Every patent proposal contains n energy converters.</li>
	<li>Every converter has an unknown input energy unit associated with it.</li>
	<li>Some energy converters can be connected: If converter a can be connected to converter b such that one energy unit associated with a is turned into c input units for b, then this is indicated by an arc a &rarr; b (c) in the proposal. The output of a can be used as input for b if and only if such an arc from a to b exists.</li>
</ul>

<p>Einstein would like to dismiss all those proposals out of hand where the energy converters can be chained up in a cycle such that more energy is fed back to a converter than is given to it as input, thereby violating the law of conservation of energy.</p>

<p>Einstein&rsquo;s assistants know that he is born for higher things than weeding out faulty patent proposals. Hence, they take care of the most difficult cases, while the proposals given to Einstein are of a rather restricted form: Every admissible patent proposal given to Einstein does not allow for a cycle where the total product of arc weights exceeds 0.9. By contrast, every inadmissible patent proposal given to Einstein contains a cycle where the the number of arcs constituting the cycle does not exceed the number of converters defined in the proposal, and the total product of arc weights is greater or equal to 1.1.</p>

<p>Could you help Einstein identify the inadmissible proposals?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with two integers n and m, where
	<ul>
		<li>n (2 &le; n &le; 800) is the number of energy converters;</li>
		<li>m (0 &le; m &le; 4000) is the number of arcs.</li>
	</ul>
	</li>
	<li>m lines each containing three numbers a<sub>i</sub>, b<sub>i</sub>, and c<sub>i</sub>, where
	<ul>
		<li>a<sub>i</sub> and b<sub>i</sub> (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; n) are integers identifying energy converters;</li>
		<li>c<sub>i</sub> (0 &lt; c<sub>i</sub> &le; 5.0) is a decimal number</li>
	</ul>
	indicating that the converter ai can be connected to the converter bi such that one input unit associated with a<sub>i</sub> is converted to c<sub>i</sub> units associated with b<sub>i</sub>. The number c<sub>i</sub> may have up to 4 decimal places.</li>
</ul>

### 출력

<p>Output a single line containing inadmissible if the proposal given to Einstein is inadmissible, admissible otherwise.</p>