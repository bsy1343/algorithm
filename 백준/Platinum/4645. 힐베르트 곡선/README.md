# [Platinum III] 힐베르트 곡선 - 4645

[문제 링크](https://www.acmicpc.net/problem/4645)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 167, 정답: 27, 맞힌 사람: 20, 정답 비율: 16.949%

### 분류

분할 정복, 다이나믹 프로그래밍, 구현, 재귀

### 문제 설명

<table class="table" style="width:670px;">
	<thead>
		<tr>
			<th style="width:20px;text-align:center;">
				&nbsp;</th>
			<th style="width:130px;text-align:center;">
				시작 곡선</th>
			<th style="width:130px;text-align:center;">
				변형 1</th>
			<th style="width:130px;text-align:center;">
				변형 2</th>
			<th style="width:130px;text-align:center;">
				변형 3</th>
			<th style="width:130px;text-align:center;">
				변형 4</th>
		</tr>
	</thead>
	<thead>
	</thead>
	<tbody>
		<tr>
			<td style="vertical-align: middle;">
				H<sub>1</sub></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/6a20fa41.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/6a20fa41.gif" data-original-src="https://www.acmicpc.net/upload/images/h1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/1f19fd3e.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/1f19fd3e.gif" data-original-src="https://www.acmicpc.net/upload/images/h21.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/74cd1a53.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/74cd1a53.gif" data-original-src="https://www.acmicpc.net/upload/images/h22.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/1dba2ebf.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/1dba2ebf.gif" data-original-src="https://www.acmicpc.net/upload/images/h23.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/92ff130c.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/92ff130c.gif" data-original-src="https://www.acmicpc.net/upload/images/h24.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
		</tr>
		<tr>
			<td style="vertical-align: middle;">
				H<sub>2</sub></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/789793d2.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/789793d2.gif" data-original-src="https://www.acmicpc.net/upload/images/h2.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/beb15c09.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/beb15c09.gif" data-original-src="https://www.acmicpc.net/upload/images/h31.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/6afb3444.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/6afb3444.gif" data-original-src="https://www.acmicpc.net/upload/images/h32.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/2a9ce30a.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/2a9ce30a.gif" data-original-src="https://www.acmicpc.net/upload/images/h33.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/be52ebb7.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/be52ebb7.gif" data-original-src="https://www.acmicpc.net/upload/images/h34.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
		</tr>
		<tr>
			<td style="vertical-align: middle;">
				H<sub>3</sub></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/9a9fe3fa.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/9a9fe3fa.gif" data-original-src="https://www.acmicpc.net/upload/images/h3.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/70a8fce0.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/70a8fce0.gif" data-original-src="https://www.acmicpc.net/upload/images/h41.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/ba49b10c.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/ba49b10c.gif" data-original-src="https://www.acmicpc.net/upload/images/h42.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/5761de9e.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/5761de9e.gif" data-original-src="https://www.acmicpc.net/upload/images/h43.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/ed1c613a.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/ed1c613a.gif" data-original-src="https://www.acmicpc.net/upload/images/h44.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
		</tr>
		<tr>
			<td style="vertical-align: middle;">
				H<sub>4</sub></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/688b1680.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/688b1680.gif" data-original-src="https://www.acmicpc.net/upload/images/h4.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/2dadff9a.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/2dadff9a.gif" data-original-src="https://www.acmicpc.net/upload/images/h51.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/c2ed8237.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/c2ed8237.gif" data-original-src="https://www.acmicpc.net/upload/images/h52.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/65996df8.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/65996df8.gif" data-original-src="https://www.acmicpc.net/upload/images/h53.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td>
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/c396edf8.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/c396edf8.gif" data-original-src="https://www.acmicpc.net/upload/images/h54.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
		</tr>
	</tbody>
</table>

<p>
	힐베르트 곡선은 독일 수학자 다비드 힐베르트가 처음으로 묘사한 연속 프랙탈 공간 채움 곡선이다.</p>

<p>
	힐베르트 곡선은 가로줄과 세로줄로 이루어져 있는 곡선의 수열 H<sub>1</sub>, H<sub>2</sub>, H<sub>3</sub>, H<sub>4</sub>, ...을 이용해서 만들 수 있다. 각각의 곡선은 단위 정사각형 [0, 1] &times; [0, 1]위에 있다.</p>

<p>
	H<sub>1</sub>은 (&frac14;, &frac34;), (&frac14;, &frac14;), (&frac34;, &frac14;), (&frac34;, &frac34;)을 잇는 세 선분으로 이루어져 있다. H<sub>n</sub>은 H<sub>n-1</sub>을 이용해서 다음 4가지 과정을 통해서 재귀적으로 만들 수 있다.</p>

<p>
	1. H<sub>n-1</sub>의 모든 좌표를 절반으로 줄인다.</p>
<p>
	2. 곡선을 (0, &frac12;)을 기준으로 반시계 방향으로 돌린 곡선을 더한다.</p>
<p>
	3. x = &frac12;를 기준으로 대칭시킨 곡선을 더한다.</p>
<p>
	4. m = &frac12;<sup>n+1</sup>이라 하자. 각 곡선의 끝점 (&frac12; - m, &frac12; - m) 와 (&frac12; + m, &frac12; - m), (m, &frac12; - m) 와 (m, &frac12; + m), (1 - m, &frac12; - m) 와 (1 - m, &frac12; + m)을 잇는다.</p>

<p>
	수평선이 주어졌을 때, 곡선과 교차하는 점의 수를 구하는 프로그램을 작성하시오. 예를 들어, 입력 예제 첫 번째와 두 번째 그림은 다음과 같다.</p>

<table class="table" style="width:70%;">
	<thead>
		<tr>
			<th style="width:35%;text-align:center;">
				그림 1</th>
			<th style="width:35%;text-align:center;">
				그림 2</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td style="text-align:center;">
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/9ab2cc4f.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/9ab2cc4f.gif" data-original-src="https://www.acmicpc.net/upload/images/h3line.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td style="text-align:center;">
				<img src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/ef4e5b51.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4645.%E2%80%85%ED%9E%90%EB%B2%A0%EB%A5%B4%ED%8A%B8%E2%80%85%EA%B3%A1%EC%84%A0/ef4e5b51.gif" data-original-src="https://www.acmicpc.net/upload/images/h4line.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
		</tr>
		<tr>
			<td style="text-align:center;">
				H<sub>3</sub>과 수평선(2/8,7/8)-(7/8,7/8)은 3번 교차한다</td>
			<td style="text-align:center;">
				H<sub>4</sub>과 수평선(0/16,1/16)-(16/16,1/16)은 16번 교차한다</td>
		</tr>
	</tbody>
</table>

<p>
	H<sub>n</sub>의 꼭짓점 좌표는 항상 1/2<sup>n+1</sup>의 홀수 배수이다. 수평선의 끝점 좌표는 항상 1/2<sup>n</sup>의 배수이다. 따라서, 선분은 항상 H<sub>n</sub>의 세로선과 교차한다.</p>

### 입력

<p>
	입력은 여러 개의 데이터로 이루어져 있다. 주어지는 데이터는 최대 100개이다. 각 데이터는 다음과 같은 H<sub>n</sub>과 수평선(x<sub>1</sub>/2<sup>n</sup>, y/2<sup>n</sup>)-(x<sub>2</sub>/2<sup>n</sup>, y/2<sup>n</sup>)을 나타내는 4개의 수(n x<sub>1</sub> x<sub>2</sub> y)가 공백으로 구분되어져 있다. (0 &lt; n &lt; 31, x<sub>1</sub> &lt; x<sub>2</sub>) x<sub>1</sub>, x<sub>2</sub>, y는 항상 [0, 2<sup>n</sup>] 범위이다.</p>

<p>
	마지막 데이터의 다음 줄에는 0이 하나 주어진다.</p>

### 출력

<p>
	각 데이터에 대해서 H<sub>n</sub>과 주어진 수평선과 교차하는 점의 개수를 출력한다.</p>