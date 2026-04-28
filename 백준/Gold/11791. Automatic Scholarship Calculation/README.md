# [Gold III] Automatic Scholarship Calculation - 11791

[문제 링크](https://www.acmicpc.net/problem/11791)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 256 MB

### 통계

제출: 59, 정답: 26, 맞힌 사람: 18, 정답 비율: 36.735%

### 분류

구현, 누적 합

### 문제 설명

<p>A university gives scholarship to students based on their current CGPA. This waiver allocation follows some rules. At the beginning of a semester allotted scholarships for certain CGPA range is put on the notice board in tabular form. Two such tables are shown below:&nbsp;</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11791/1.png" style="height:125px; width:623px" /></p>

<p>In the table on the left it is said that students who have CGPA within 3.60 and 3.69 (inclusive) will get 10% of their tuition fee as scholarship. Similarly, those with CGPA range is within 3.90-3.99 will get 40% of their tuition fee as scholarship. Using the two tables above we will try to explain to you the rules and restrictions of allocating waiver:</p>

<ol>
	<li>A fixed Scholarship is given to all the students within a CGPA Range.</li>
	<li>The range of each CGPA slab must be equal (Except the topmost one, which can be smaller). The slabs must go all the way up to 4.00.</li>
	<li>The scholarship percentage for the lowest slab is a positive integer. With the increase of CGPA range the amount of scholarship percentage must also increase by a fixed positive integer value. In the table on the left this fixed value is 10% and in the table on the right this fixed value is 30%.</li>
	<li>Scholarship percentage for each slab is always a positive integer with a maximum value of 100%.</li>
	<li>The scholarship amount that can give 1 student 1 % scholarship is called a unit. So to give 2 students 50% scholarship, 50*2 = 100 units is needed.</li>
	<li>All the scholarships given should use up a given amount, P units.</li>
	<li>A CGPA range for scholarship cannot start below 2.50. So 2.50-2.55 is a valid CGPA range but 2.45-2.55 is not valid.</li>
	<li>There must be at least 2 slabs for scholarship. But of course a slab can contain zero students.</li>
</ol>

<p>Given the number of students, total available scholarship units and their current CGPA, your job is to find out the number of different possible scholarship allocations that uses up all the scholarship units. Two scholarship allocations are different if their CGPA range is different or scholarship allocation in any slab is different.&nbsp;</p>

### 입력

<p>Input file contains at most 100 sets of inputs. The description of each set is given below:</p>

<p>Each set starts with two integers N (N&lt;=10000) which indicates the total number of students and P which indicates the scholarship units that needs to be used up. Each of the next N lines contains the CGPA of one student.</p>

<p>Input is terminated by a line containing two zeroes.&nbsp;</p>

### 출력

<p>For each test case produce one line of output which contains an integer D. This D denotes the total number of different scholarship allocations that uses up all P units. Input will be such that there will always be at least one possible allocation.&nbsp;</p>

### 힌트

<p>//a = 10 d = 10 lowest = 2.88 nslab = 8 wslab = 14</p>

<p>One possible solution to the sample input above is</p>

<table class="table table-bordered" style="width:50%">
	<thead>
		<tr>
			<th>CGPARange</th>
			<th># of students</th>
			<th>Waiver %</th>
			<th>Total Units needed</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>3.93-4.00</td>
			<td>2</td>
			<td>80</td>
			<td>160</td>
		</tr>
		<tr>
			<td>3.78-3.92</td>
			<td>0</td>
			<td>70</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>3.63-3.77</td>
			<td>3</td>
			<td>60</td>
			<td>180</td>
		</tr>
		<tr>
			<td>3.48-3.62</td>
			<td>0</td>
			<td>50</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>3.33-3.47</td>
			<td>0</td>
			<td>40</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>3.18-3.32</td>
			<td>2</td>
			<td>30</td>
			<td>60</td>
		</tr>
		<tr>
			<td>3.03-3.17</td>
			<td>0</td>
			<td>20</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>2.88-3.02</td>
			<td>1</td>
			<td>10</td>
			<td>10</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>Total Units</td>
			<td>410</td>
		</tr>
	</tbody>
</table>

<p>There is another 79553 different allocation which uses up all 410 units exactly.&nbsp;</p>