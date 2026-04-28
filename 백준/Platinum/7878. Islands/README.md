# [Platinum V] Islands - 7878

[문제 링크](https://www.acmicpc.net/problem/7878)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 18, 맞힌 사람: 16, 정답 비율: 34.783%

### 분류

자료 구조, 정렬, 스위핑, 분리 집합, 값 / 좌표 압축

### 문제 설명

<p>Deep in the Carribean, there is an island even stranger than the Monkey Island, dwelled by Horatio Torquemada Marley. Not only it has a rectangular shape, but is also divided into an n &times; m grid. Each grid field has a certain height. Unfortunately, the sea level started to raise and in year i, the level is i meters. Another strange feature of the island is that it is made of sponge, and the water can freely flow through it. Thus, a grid field whose height is at most the current sea level is considered flooded. Adjacent unflooded fields (i.e., sharing common edge) create unflooded areas. Sailors are interested in the number of unflooded areas in a given year.</p>

<p>An example of a 4&times;5 island is given below. Numbers denote the heights of respective fields in meters. Unflooded fields are darker; there are two unflooded areas in the first year and three areas in the second year.</p>

<table class="table table-bordered td-center th-center" style="width: 100%;">
	<thead>
		<tr>
			<th style="width: 50%;">Year 1</th>
			<th style="width: 50%;">Year 2</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7878.%E2%80%85Islands/22308f62.png" data-original-src="https://upload.acmicpc.net/fb099529-df05-43ea-adc5-d841293e6388/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 115px; height: 95px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7878.%E2%80%85Islands/b604a217.png" data-original-src="https://upload.acmicpc.net/aefee11a-7eda-4005-8ebf-8eac5b3a0f0f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 114px; height: 92px;" /></td>
		</tr>
	</tbody>
</table>

### 입력

<p>The input contains several test cases. The first line of the input contains a positive integer Z &le; 20, denoting the number of test cases. Then Z test cases follow.</p>

<p>The first line contains two numbers n and m separated by a single space, the dimensions of the island, where 1 &le; n, m &le; 1000. Next n lines contain m integers from the range [1, 10<sup>9</sup>] separated by single spaces, denoting the heights of the respective fields. Next line contains an integer T (1 &le; T &le; 10<sup>5</sup>). The last line contains T integers t<sub>j</sub>, separated by single spaces, such that 0 &le; t<sub>1</sub> &le; t<sub>2</sub> &le; . . . &le; t<sub>T&minus;1</sub> &le; t<sub>T</sub> &le; 10<sup>9</sup>.</p>

### 출력

<p>Your program should output a single line consisting of T numbers r<sub>j</sub> separated by single spaces, where r<sub>j</sub> is the number of unflooded areas in year t<sub>j</sub>.</p>