# [Silver III] Making the Grade - 6490

[문제 링크](https://www.acmicpc.net/problem/6490)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 17, 맞힌 사람: 16, 정답 비율: 66.667%

### 분류

구현, 수학, 시뮬레이션, 통계학

### 문제 설명

<p>Mr. Chips has a simple grading scheme that lends itself to&nbsp;automated computation. &nbsp;You will write a program that will read in&nbsp;his students&#39; grades, bonus points, and attendance record, compute&nbsp;the student&#39;s grades, and output the average grade point of the&nbsp;class.</p>

<p>Problem Statement: Mr. Chips grades as follows. &nbsp;All tests are&nbsp;based on 100 points and all test grades are between 0 and 100&nbsp;points. If he has given more than 2 tests then he will drop the&nbsp;lowest test grade for each student before computing student&nbsp;averages. &nbsp;After computing student averages he computes the&nbsp;overall class average (mean) and standard deviation (sd). The&nbsp;cutoff points for grades are: an average &gt;= one sd above the mean is&nbsp;an A, an average &gt;= the mean but &lt; one sd above the mean is a B,&nbsp;an average &gt;= one sd&nbsp;below the mean but &lt; the mean is a C, and an&nbsp;average &lt; one sd below the mean is a D. &nbsp;For every two bonus&nbsp;points accrued by a&nbsp;student Mr. Chips increases their computed&nbsp;average by 3 percentage points. Thus, if students have one bonus&nbsp;point, their averages are&nbsp;not bumped at all. &nbsp;If they have 4 or 5&nbsp;bonus points, their averages are bumped by 6 percentage points,&nbsp;and so on. Bumping of&nbsp;averages based on bonus points takes place&nbsp;after the grade cutoff points have been determined. &nbsp;Finally, for&nbsp;every 4 absences,&nbsp;students lose one letter grade (from A to B, B to&nbsp;C, C to D, and D to F). &nbsp;For example, if they have 9 absences they&nbsp;will lose two letter&nbsp;grades. Students cannot get a grade lower than&nbsp;F. If students have perfect attendance, they gain one letter grade;&nbsp;although they&nbsp;cannot get a grade higher than an A. &nbsp;During his&nbsp;computations, Mr. Chips always rounds his results to the nearest&nbsp;tenth. In summary,&nbsp;Mr. Chips drops a student&#39;s lowest test grade if&nbsp;more than 2 tests have been administered, computes each student&#39;s&nbsp;average,&nbsp;computes the class mean and sd, adjusts the students&#39;&nbsp;averages based on bonus points, determines the student&#39;s&nbsp;unadjusted grades,&nbsp;and then adjusts the grades based on attendance.</p>

<p>The average grade point of a class is determined by using 4 points&nbsp;for each A, 3 points for each B, 2 points for each C, 1 point for&nbsp;each D, and 0 points for each F. &nbsp;The total points for the class are&nbsp;added together and divided by the number of students in the class&nbsp;(which is always at least 2).</p>

<p>The standard deviation sd of a list of numbers x<sub>1</sub>, ..., x<sub>n</sub>&nbsp;is: &nbsp; &nbsp;[graphic deleted]</p>

<p>If the calculated standard deviation is less than 1 then Mr. Chips&nbsp;uses 1 in place of the standard deviation for grade calculation.</p>

<p>Suppose Mr. Chips has 5 students and has given 3 tests. The&nbsp;following table shows the grades, number of bonuses and days&nbsp;absent, plus the computed average (with lowest test dropped), the&nbsp;adjusted average (with bonus), the unadjusted grade and the&nbsp;adjusted grade (with attendance). The mean and sd used to&nbsp;determine letter grade cutoffs are 69.0 and 20.1. For example, for&nbsp;an unadjusted B,&nbsp;one&#39;s average must be greater than or equal to&nbsp;69.0 and less than 89.1.</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<td>T1</td>
			<td>T2</td>
			<td>T3</td>
			<td>Bns</td>
			<td>Abst</td>
			<td>Avg</td>
			<td>AdjAvg</td>
			<td>Grade</td>
			<td>AdjGrd</td>
		</tr>
		<tr>
			<td>100</td>
			<td>100</td>
			<td>80</td>
			<td>3</td>
			<td>2</td>
			<td>100.0</td>
			<td>103.0</td>
			<td>A</td>
			<td>A</td>
		</tr>
		<tr>
			<td>80</td>
			<td>80</td>
			<td>80</td>
			<td>0</td>
			<td>5</td>
			<td>80.0</td>
			<td>80.0</td>
			<td>B</td>
			<td>C</td>
		</tr>
		<tr>
			<td>60</td>
			<td>20</td>
			<td>70</td>
			<td>5</td>
			<td>3</td>
			<td>65.0</td>
			<td>71.0</td>
			<td>B</td>
			<td>B</td>
		</tr>
		<tr>
			<td>40</td>
			<td>40</td>
			<td>40</td>
			<td>5</td>
			<td>0</td>
			<td>40.0</td>
			<td>46.0</td>
			<td>D</td>
			<td>C</td>
		</tr>
		<tr>
			<td>100</td>
			<td>20</td>
			<td>20</td>
			<td>1</td>
			<td>9</td>
			<td>60.0</td>
			<td>60.0</td>
			<td>C</td>
			<td>F</td>
		</tr>
	</tbody>
</table>

<p>avg grd pnt is 2.2</p>

### 입력

<p>The first line contains an integer N between 1 and 10 describing how many of Mr. Chip&#39;s classes are represented in the input.&nbsp; The first line for each class contains two integers S and T. S is the number of students in the class (1 &lt; S &lt; 31) and T is the number of tests the students took (1 &lt; T &lt; 11).&nbsp; The next S lines will each represent one student in the class. A student line first lists each of their T test scores as integers between 0 and 100 inclusive, and then lists their bonus points and their number of absences.</p>

### 출력

<p>There should be N+2 lines of output.&nbsp; The first line of output should read MAKING THE GRADE OUTPUT.&nbsp;&nbsp; There will then be one line of output for each of Mr. Chip&#39;s classes showing that class&#39;s average grade point. The final line of output should read END OF OUTPUT.</p>