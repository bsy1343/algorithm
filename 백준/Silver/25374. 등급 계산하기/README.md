# [Silver V] 등급 계산하기 - 25374

[문제 링크](https://www.acmicpc.net/problem/25374)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 408, 정답: 203, 맞힌 사람: 171, 정답 비율: 50.742%

### 분류

수학, 구현, 정렬, 사칙연산

### 문제 설명

<p>중학교에서는 절대 평가로 내신이 산출되었다면, 동래고등학교에 재학 중인 여러분은 1등급부터 9등급까지의 등급을&nbsp;받는 상대 평가로 내신과 수능 등급이 산출된다.</p>

<p>찬솔이는 고등학교를 졸업할 때까지 수능과 담을 쌓고 살았기 때문에 수능 등급을 산출하는 자세한 기준은 고등학교를 졸업한 지금도 모르고 있다. 찬솔이를 위해 한 과목에 응시한 사람의 수와 각 사람이 받은 점수가 주어지면, 1등급부터 9등급까지의 각 등급을 받는 인원수를 구해주자.</p>

<p>수능 등급을 산출하는 비율은 아래와 같다.</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th>등급</th>
			<th>누적 비율</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1등급</td>
			<td>상위 누적 4%</td>
		</tr>
		<tr>
			<td>2등급</td>
			<td>상위 누적 11%</td>
		</tr>
		<tr>
			<td>3등급</td>
			<td>상위 누적 23%</td>
		</tr>
		<tr>
			<td>4등급</td>
			<td>상위 누적 40%</td>
		</tr>
		<tr>
			<td>5등급</td>
			<td>상위 누적 60%</td>
		</tr>
		<tr>
			<td>6등급</td>
			<td>상위 누적 77%</td>
		</tr>
		<tr>
			<td>7등급</td>
			<td>상위 누적 89%</td>
		</tr>
		<tr>
			<td>8등급</td>
			<td>상위 누적 96%</td>
		</tr>
		<tr>
			<td>9등급</td>
			<td>상위 누적 100%</td>
		</tr>
	</tbody>
</table>

<p>구체적으로, $i$점부터 100점 사이에 있는 사람의 비율이 4% 이상인 가장 큰 $i$를&nbsp;1등급의 등급구분점수라고 한다. $i$점 이상의 점수를 받은 모든 학생은 1등급을 받는다. 비슷하게 $j$점부터 100점 사이에 있는 사람의 비율이 11% 이상인 가장 큰&nbsp;$j$점을 2등급의 등급구분점수라고 한다. 1등급의 등급구분점수 미만이면서 2등급의 등급구분점수&nbsp;이상의 점수를 받은 모든 학생은 2등급을 받는다. 만약, 1등급의 등급구분점수 이상을 받은 학생의 비율이 11% 이상이라면,&nbsp;이 학생들은 모두 1등급을 받고, 2등급의 등급구분점수가 1등급의 등급구분점수와 동일하므로&nbsp;2등급을 받는 학생은&nbsp;없다.</p>

<p>등급을 산출하는 조건을 정리한 표와&nbsp;등급블랭크와 관련한&nbsp;자세한 내용은 문제의 하단을&nbsp;참고하자.</p>

### 입력

<p>첫째 줄에 한 과목에 응시한 사람의 수 $N$이 주어진다.</p>

<p>둘째 줄에 각 사람이 받은 점수 $A_1, A_2, \cdots, A_N$이 공백으로 구분되어 주어진다.</p>

### 출력

<p>1등급, 2등급, $\cdots$, 9등급을 받는 학생의 수를 줄마다 출력한다.</p>

<p>만약, 해당 등급을 받는 학생이 없다면 $0$을 출력한다.</p>

### 제한

<ul>
	<li>$N=100$</li>
	<li>$0 \leq A_i \leq 100$</li>
	<li>입력으로 주어지는 모든 수는 정수이다.</li>
</ul>

### 힌트

<table border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 100%;">
	<tbody>
		<tr>
			<th style="text-align: center;">등급</th>
			<th style="text-align: center;">조건</th>
		</tr>
		<tr>
			<td style="text-align: center;">1등급</td>
			<td style="text-align: center;">($x_1$점 초과인 사람의 비율)% $\lt$ 4%</td>
		</tr>
		<tr>
			<td style="text-align: center;">2등급</td>
			<td style="text-align: center;">4% $\leq$ ($x_2$점 초과인 사람의 비율)% $\lt$ 11%</td>
		</tr>
		<tr>
			<td style="text-align: center;">3등급</td>
			<td style="text-align: center;">11% $\leq$ ($x_3$점 초과인 사람의 비율)% $\lt$ 23%</td>
		</tr>
		<tr>
			<td style="text-align: center;">4등급</td>
			<td style="text-align: center;">23% $\leq$ ($x_4$점 초과인 사람의 비율)% $\lt$ 40%</td>
		</tr>
		<tr>
			<td style="text-align: center;">5등급</td>
			<td style="text-align: center;">40% $\leq$ ($x_5$점 초과인 사람의 비율)% $\lt$ 60%</td>
		</tr>
		<tr>
			<td style="text-align: center;">6등급</td>
			<td style="text-align: center;">60% $\leq$ ($x_6$점 초과인 사람의 비율)% $\lt$ 77%</td>
		</tr>
		<tr>
			<td style="text-align: center;">7등급</td>
			<td style="text-align: center;">77% $\leq$ ($x_7$점 초과인 사람의 비율)% $\lt$ 89%</td>
		</tr>
		<tr>
			<td style="text-align: center;">8등급</td>
			<td style="text-align: center;">89% $\leq$ ($x_8$점 초과인 사람의 비율)% $\lt$ 96%</td>
		</tr>
		<tr>
			<td style="text-align: center;">9등급</td>
			<td style="text-align: center;">96% $\leq$ ($x_9$점 초과인 사람의 비율)%</td>
		</tr>
	</tbody>
</table>

<ul>
	<li>$i$등급의 조건에 해당하는 점수 $x_i$점을 받은 사람은 $i$등급을 받는다.</li>
</ul>

<p>예를 들어서, $N=100$이고, 100점을 받은 사람이 11명이고, 99점을 받은 사람이 1명인 경우를 가정해보자. (나머지 사람들은 99점 미만이라고 가정한다) 100점 초과인 사람은 0%이므로 100점을 받은 11명은 모두 1등급을 받는다. 99점 초과인 비율은 11%이기 때문에, 99점을 받은 1명은 2등급이 아닌 3등급을 받는다.</p>

<p>위 예에서 2등급을 받은 사람이 없는 것과 같이,&nbsp;등급블랭크는 특정&nbsp;등급을 받은 사람이 존재하지 않는다는 것을 의미한다.</p>