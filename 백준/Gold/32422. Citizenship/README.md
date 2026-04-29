# [Gold II] Citizenship - 32422

[문제 링크](https://www.acmicpc.net/problem/32422)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 12, 맞힌 사람: 12, 정답 비율: 70.588%

### 분류

누적 합

### 문제 설명

<p>It has been a long time since you moved to a different country and you have decided it is time to become a citizen. Your new country has a strict residency requirement for all applicants. To apply, you must have been physically present in the country for at least $d$ days per year, for the past $y$ consecutive years. These years are counted in $12$-month periods backwards from the application date.</p>

<p>For this problem, assume that a calendar year has $12$ months of $365$ days, and each month has exactly the number of days below:</p>

<table class="table table-bordered td-center th-center table-center-50">
	<tbody>
		<tr>
			<th>month</th>
			<td>01</td>
			<td>02</td>
			<td>03</td>
			<td>04</td>
			<td>05</td>
			<td>06</td>
			<td>07</td>
			<td>08</td>
			<td>09</td>
			<td>10</td>
			<td>11</td>
			<td>12</td>
		</tr>
		<tr>
			<th>days</th>
			<td>31</td>
			<td>28</td>
			<td>31</td>
			<td>30</td>
			<td>31</td>
			<td>30</td>
			<td>31</td>
			<td>31</td>
			<td>30</td>
			<td>31</td>
			<td>30</td>
			<td>31</td>
		</tr>
	</tbody>
</table>

<p>For example, if you were to apply on 2024–09–19 you must have been in the country for at least $d$ days during the $12$-month periods from 2023–09–19 to 2024–09–18, 2022–09–19 to 2023–09–18, and so on for $y$ such periods.</p>

<p>You have lived in the country for at least $y$ years, but having traveled a lot, you are not sure if you meet the residency requirement. Write a program that finds the earliest date you can submit your citizenship application given your travel history.</p>

### 입력

<p>The first line contains three integers $n$, $y$ and $d$ ($1 ≤ n ≤ 500$, $1 ≤ y ≤ 1\, 000$, $1 ≤ d ≤ 365$). You have been out of the country $n$ times and $y$ and $d$ specify the country’s residency requirement as described above.</p>

<p>Each of the following n lines contains two dates in the form <code>YYYY-MM-DD</code> ($0000 ≤ $<code>YYYY</code>$ ≤ 5\, 000$, $01 ≤ $<code>MM</code>$ ≤ 12$, $01 ≤ $<code>DD</code>$ ≤ 31$). You have been out of the country between the two dates, inclusive. All dates in the input are sorted in increasing order. The only dates which may be equal are dates on the same line. All given dates are valid.</p>

### 출력

<p>Output the earliest date on which you meet the residency requirement. The date must be after the last date of the input.</p>