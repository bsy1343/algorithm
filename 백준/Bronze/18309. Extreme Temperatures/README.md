# [Bronze III] Extreme Temperatures - 18309

[문제 링크](https://www.acmicpc.net/problem/18309)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 469, 정답: 261, 맞힌 사람: 225, 정답 비율: 55.012%

### 분류

수학, 구현, 문자열, 사칙연산, 파싱

### 문제 설명

<p>Kristen is a meteorologist, who is monitoring extreme temperatures in the forest of Palaiseau. She has collected temperature measurements at various times over several days. Help her find out what the lowest and highest temperatures were in her entire dataset.</p>

### 입력

<p>The input is formed of N lines, each line i with 1 &le; i &le; N being a space-separated list of k<sub>i</sub> tokens:</p>

<ul>
	<li>the first token is the date of the measurement, in the form YYYY-MM-DD;</li>
	<li>for 2 &le;&nbsp;j &le; k<sub>i</sub>, the j-th entry is an integer temperature measurement t<sub>ij</sub>.</li>
</ul>

### 출력

<p>The output should contain a single line with two integers: the lowest and highest temperatures in the entire dataset, in this order.</p>

### 제한

<ul>
	<li>1 &le; N &le; 1 000;</li>
	<li>2 &le; k<sub>i</sub> &le; 100 for 1 &le; i &le; N;</li>
	<li>&minus;50 &le; t<sub>ij</sub> &le; 50 for 1 &le; i &le; N and 2 &le; j &le; k<sub>i</sub>.</li>
</ul>