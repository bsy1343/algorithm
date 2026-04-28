# [Gold I] 벼락치기 계획 세우기 - 31991

[문제 링크](https://www.acmicpc.net/problem/31991)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 53, 정답: 9, 맞힌 사람: 7, 정답 비율: 14.286%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>유민이는 이번 학기에 무려 $N$개 과목의 기말고사를 봐야 한다! 각 과목의 성적은 낮은 순서부터 F, D-, D0, D+, C-, C0, C+, B-, B0, B+, A-, A0, A+로 총 13단계로 분류되며, 수로 환산되는 평점은 각각 0.0, 0.7, 1.0, 1.3, 1.7, 2.0, 2.3, 2.7, 3.0, 3.3, 3.7, 4.0, 4.3점이다.</p>

<p>$i$번째 과목의 시험 시각은 지금으로부터 $t_i$시간 뒤이고, 이수학점은 $c_i$학점이다. 또, 그 과목에서 $j$번째로 낮은 평점을 얻기 위해서는 해당 과목을 $s_{i,j}$시간 이상 공부해야 한다. 각 과목은 시험 시각 이전까지만 공부할 수 있고, 여러 과목을 동시에 공부할 수는 없다. 시험을 치르는 데 걸리는 시간은 없다고 가정하고, 여러 시험을 동시에 칠 수도 있다.</p>

<p>늘 그랬듯 아직까지 공부를 전혀 하지 않은 유민이는 효율적인 벼락치기를 통해 평점평균을 최대화하려고 한다. 평점평균이란 $N$개 과목 각각에 대하여 이수학점과 그 과목에서 유민이가 얻은 평점의 곱의 총합을 $N$개 과목의 이수학점의 총합으로 나눈 값이다. F학점을 받은 과목도 이수학점 계산에 반영된다.</p>

<table align="center" border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 100%;">
	<tbody>
		<tr>
			<td colspan="1" rowspan="2" style="text-align: center; vertical-align: middle;">과목명</td>
			<td colspan="1" rowspan="2" style="text-align: center; vertical-align: middle;">시험 시각</td>
			<td colspan="1" rowspan="2" style="text-align: center; vertical-align: middle;">이수학점</td>
			<td colspan="13" rowspan="1" style="text-align: center;">평점을 얻기 위한 공부 시간</td>
		</tr>
		<tr>
			<td style="text-align: center;">F(0.0)</td>
			<td style="text-align: center;">D-(0.7)</td>
			<td style="text-align: center;">D0(1.0)</td>
			<td style="text-align: center;">D+(1.3)</td>
			<td style="text-align: center;">C-(1.7)</td>
			<td style="text-align: center;">C0(2.0)</td>
			<td style="text-align: center;">C+(2.3)</td>
			<td style="text-align: center;">B-(2.7)</td>
			<td style="text-align: center;">B0(3.0)</td>
			<td style="text-align: center;">B+(3.3)</td>
			<td style="text-align: center;">A-(3.7)</td>
			<td style="text-align: center;">A0(4.0)</td>
			<td style="text-align: center;">A+(4.3)</td>
		</tr>
		<tr>
			<td style="text-align: center;">미적분1</td>
			<td style="text-align: center;">30</td>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">3</td>
			<td style="text-align: center;">7</td>
			<td style="text-align: center;">10</td>
			<td style="text-align: center;">14</td>
			<td style="text-align: center;">16</td>
			<td style="text-align: center;">20</td>
			<td style="text-align: center;"><strong>27</strong></td>
			<td style="text-align: center;">30</td>
			<td style="text-align: center;">60</td>
			<td style="text-align: center;">88</td>
			<td style="text-align: center;">120</td>
			<td style="text-align: center;">200</td>
		</tr>
		<tr>
			<td style="text-align: center;">세계사</td>
			<td style="text-align: center;">80</td>
			<td style="text-align: center;">3</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">6</td>
			<td style="text-align: center;">8</td>
			<td style="text-align: center;">10</td>
			<td style="text-align: center;">30</td>
			<td style="text-align: center;">50</td>
			<td style="text-align: center;">52</td>
			<td style="text-align: center;"><strong>53</strong></td>
			<td style="text-align: center;">198</td>
			<td style="text-align: center;">199</td>
			<td style="text-align: center;">200</td>
		</tr>
		<tr>
			<td style="text-align: center;">수학3</td>
			<td style="text-align: center;">180</td>
			<td style="text-align: center;">3</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">5</td>
			<td style="text-align: center;">10</td>
			<td style="text-align: center;">15</td>
			<td style="text-align: center;">20</td>
			<td style="text-align: center;">25</td>
			<td style="text-align: center;">35</td>
			<td style="text-align: center;">50</td>
			<td style="text-align: center;">75</td>
			<td style="text-align: center;">80</td>
			<td style="text-align: center;">90</td>
			<td style="text-align: center;">95</td>
			<td style="text-align: center;"><strong>100</strong></td>
		</tr>
		<tr>
			<td style="text-align: center;">정보과학3</td>
			<td style="text-align: center;">200</td>
			<td style="text-align: center;">3</td>
			<td style="text-align: center;">0</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;"><strong>2</strong></td>
		</tr>
	</tbody>
</table>

<p>예를 들어, 위 상황에서는 다음과 같이 공부하는 것이 최선이다.</p>

<ul>
	<li>먼저 미적분1을 27시간 공부한다.</li>
	<li>다음으로 세계사를 3시간 공부한다.</li>
	<li>미적분1 시험을 친다. 총 27시간을 공부했으므로 B-(2.7)를 받게 된다.</li>
	<li>세계사를 50시간 더 공부한다.</li>
	<li>세계사 시험을 친다. 총 53시간을 공부했으므로 B+(3.3)를 받게 된다.</li>
	<li>수학3을 100시간 공부한다.</li>
	<li>수학3 시험을 친다. 총 100시간을 공부했으므로 A+(4.3)을 받게 된다.</li>
	<li>정보과학3 시험까지 남은 20시간 중 2시간 이상 정보과학3을 공부한다.</li>
	<li>정보과학3 시험을 친다. 총 2시간 이상을 공부했으므로 A+(4.3)을 받게 된다.</li>
</ul>

<p>이때 평점평균은 $\cfrac{4\times 2.7 + 3\times 3.3 + 3\times 4.3 + 3\times 4.3}{4+3+3+3} \approx 3.576923076923$점이다.</p>

### 입력

<p>첫 번째 줄에 과목의 수 $N$이 주어진다.</p>

<p>두 번째 줄부터 $N$개의 줄에 과목들의 정보가 주어지며, 그 중 $i$번째 줄에는 15개의 정수 $t_i,\, c_i,\, s_{i,1}, s_{i,2}, \cdots , s_{i,13}$이 공백을 사이에 두고 주어진다.</p>

### 출력

<p>유민이가 받을 수 있는 평점평균의 최댓값을 출력한다. 절대오차 또는 상대오차는 $10^{-6}$까지 허용한다.</p>

### 제한

<ul>
	<li>$1 \leq N \leq 300$</li>
	<li>$1 \leq t_i \leq 10^8$</li>
	<li>$1 \leq c_i \leq 4$</li>
	<li>$0 = s_{i, 1} &lt; s_{i, 2} \leq s_{i, 3} \leq s_{i, 4} \leq \cdots \leq s_{i, 13} \leq 10^8$</li>
</ul>