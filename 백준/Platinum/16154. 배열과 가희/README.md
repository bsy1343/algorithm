# [Platinum I] 배열과 가희 - 16154

[문제 링크](https://www.acmicpc.net/problem/16154)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 199, 정답: 71, 맞힌 사람: 47, 정답 비율: 34.307%

### 분류

조합론, 포함 배제의 원리, 수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>길이가 <em>N</em>인 배열 <i>S가</i>&nbsp;주어진다. 다음 쿼리를 수행하는 프로그램을 작성하라.</p>

<p><meta charset="utf-8" /></p>

<ul dir="ltr">
	<li><em>u</em> <em>num</em> : <em>S<sub>u</sub></em>를 <em>num</em>으로 바꾼다. 그리고 GCD(<em>S<sub>i</sub></em>, <em>S<sub>j</sub></em>) &gt; 1이면서&nbsp;<em>i</em> &lt; <i>j</i>인 쌍의 개수를 출력한다. 단, GCD(<em>a</em>, <em>b</em>)는 <em>a</em>와 <em>b</em>의 최대공약수를 나타낸다.</li>
</ul>

### 입력

<p>첫째 줄에 배열의 길이 <em>N</em>(1 &le; <em>N</em>&nbsp;&le; 2 x 10<sup>5</sup>)과 쿼리의 개수 <em>Q</em>(1 &le; <em>Q</em> &le; 2 x 10<sup>5</sup>)가 공백으로 구분되어&nbsp;주어진다.</p>

<p>둘째 줄에 배열의 <em>i</em>(i = 0, 1, 2, ..., <em>N</em>-1)번째 원소를 나타내는 정수&nbsp;<em>S<sub>i</sub></em>(1 &le; <em>S<sub>i</sub></em>&nbsp;&le; 10<sup>6</sup>)가 공백으로 구분되어 주어진다.</p>

<p>셋째 줄부터&nbsp;<em>Q</em>개의 각&nbsp;줄에는 쿼리를 의미하는 정수&nbsp;<em>u</em>(0 &le; <em>u</em> &le; <em>N</em>-1),&nbsp;num(1 &le; <em>num</em> &le; 10<sup>6</sup>)이 공백으로 구분되어&nbsp;주어진다.</p>

### 출력

<p><em>Q</em>개의 각 줄에&nbsp;쿼리의&nbsp;정답을 순서대로&nbsp;한 줄에 하나씩 출력한다.</p>