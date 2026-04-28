# [Platinum III] Optimization is Freaky Fun - 17417

[문제 링크](https://www.acmicpc.net/problem/17417)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 650, 정답: 79, 맞힌 사람: 54, 정답 비율: 10.778%

### 분류

수학, 정수론, 이분 탐색, 누적 합, 많은 조건 분기, 조화수

### 문제 설명

<p>다음은 교준이가 작성한 소스 코드다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/77bd0aa1-52ef-4eff-a905-08ea8ddd6a03/-/preview/" style="height: 371px; width: 600px;" /></p>

<p style="text-align: center;"><strong>&lt;그림 1&gt;</strong>&nbsp;교준이가 작성한 소스 코드</p>

<p>&nbsp;</p>

<p>다음은 교준이가 작성한 프로그램의 입력이다:</p>

<pre>
<em>Q</em>
<em>N</em><sub>1</sub><em> S</em><sub>1</sub><em> E</em><sub>1</sub>
<em>N</em><sub>2</sub><em> S</em><sub>2</sub><em> E</em><sub>2</sub>
...
<em>N<sub>Q</sub> S<sub>Q</sub> E<sub>Q</sub></em></pre>

<p>교준이가 작성한 프로그램의 출력 결과를 출력하는 프로그램을 작성하시오.</p>

### 입력

<p>첫 번째 줄에 자연수 <em>Q</em>가 주어진다.</p>

<p>(i+1)번째 줄에는 세 자연수 <em>N</em><sub>i</sub>, <em>S</em><sub>i</sub>, <em>E</em><sub>i</sub>가 사이에 공백을 두고 주어진다(1 &le;&nbsp;i &le;&nbsp;<em>Q</em>).</p>

### 출력

<p>첫 번째 줄부터 <em>Q</em>개의 줄에 걸쳐, 교준이의&nbsp;프로그램의 출력 결과를 출력한다.</p>

### 제한

<p>모든 입력 데이터는 다음 조건을 만족한다.</p>

<ul>
	<li>3 &le; <em>Q</em> &le; 10<sup>5</sup></li>
	<li>1 &le; <em>N</em><sub>i</sub> &le; 10<sup>12</sup>&nbsp;(1 &le;&nbsp;i &le;&nbsp;<em>Q</em>)</li>
	<li>1&nbsp;&le; <em>S</em><sub>i</sub>&nbsp;&le; 10<sup>12</sup>&nbsp;(1 &le;&nbsp;i &le;&nbsp;<em>Q</em>)</li>
	<li>1&nbsp;&le; <i>E</i><sub>i</sub>&nbsp;&le; 10<sup>12</sup>&nbsp;(1 &le;&nbsp;i &le;&nbsp;<em>Q</em>)</li>
</ul>