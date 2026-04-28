# [Silver V] 너의 평점은 - 25206

[문제 링크](https://www.acmicpc.net/problem/25206)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 107254, 정답: 48104, 맞힌 사람: 41810, 정답 비율: 44.754%

### 분류

수학, 구현, 문자열

### 문제 설명

<p>인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!</p>

<p>치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.</p>

<p>전공평점은&nbsp;전공과목별 (학점&nbsp;&times; 과목평점)의 합을 학점의 총합으로 나눈 값이다.</p>

<p>인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와&nbsp;같다.</p>

<table border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 150px;">
	<tbody>
		<tr>
			<td style="text-align: center;">A+</td>
			<td style="text-align: center;">4.5</td>
		</tr>
		<tr>
			<td style="text-align: center;">A0</td>
			<td style="text-align: center;">4.0</td>
		</tr>
		<tr>
			<td style="text-align: center;">B+</td>
			<td style="text-align: center;">3.5</td>
		</tr>
		<tr>
			<td style="text-align: center;">B0</td>
			<td style="text-align: center;">3.0</td>
		</tr>
		<tr>
			<td style="text-align: center;">C+</td>
			<td style="text-align: center;">2.5</td>
		</tr>
		<tr>
			<td style="text-align: center;">C0</td>
			<td style="text-align: center;">2.0</td>
		</tr>
		<tr>
			<td style="text-align: center;">D+</td>
			<td style="text-align: center;">1.5</td>
		</tr>
		<tr>
			<td style="text-align: center;">D0</td>
			<td style="text-align: center;">1.0</td>
		</tr>
		<tr>
			<td style="text-align: center;">F</td>
			<td style="text-align: center;">0.0</td>
		</tr>
	</tbody>
</table>

<p>P/F 과목의 경우 등급이 <code>P</code>또는 <code>F</code>로 표시되는데, 등급이 <code>P</code>인 과목은 계산에서 제외해야 한다.</p>

<p>과연 치훈이는 무사히 졸업할 수 있을까?</p>

### 입력

<p><strong>20</strong>줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.</p>

### 출력

<p>치훈이의 전공평점을 출력한다.</p>

<p>정답과의 절대오차 또는 상대오차가 \(10^{-4}\) 이하이면 정답으로 인정한다.</p>

### 제한

<ul>
	<li>1 &le; 과목명의 길이 &le; 50</li>
	<li>과목명은 알파벳 대소문자 또는 숫자로만 이루어져 있으며,&nbsp;띄어쓰기 없이 주어진다. 입력으로 주어지는 모든 과목명은 서로 다르다.</li>
	<li>학점은&nbsp;<code>1.0</code>,<code>2.0</code>,<code>3.0</code>,<code>4.0</code>중 하나이다.</li>
	<li>등급은&nbsp;<code>A+</code>,<code>A0</code>,<code>B+</code>,<code>B0</code>,<code>C+</code>,<code>C0</code>,<code>D+</code>,<code>D0</code>,<code>F</code>,<code>P</code>중 하나이다.</li>
	<li>적어도 한 과목은 등급이 <code>P</code>가 아님이 보장된다.</li>
</ul>

### 힌트

<p>예제 1은&nbsp;치훈이의 실제 전공과목 성적이다.</p>