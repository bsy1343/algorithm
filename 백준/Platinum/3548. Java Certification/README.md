# [Platinum III] Java Certification - 3548

[문제 링크](https://www.acmicpc.net/problem/3548)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 32, 정답: 12, 맞힌 사람: 12, 정답 비율: 41.379%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>You have just completed Java Certification exam that contained n questions. You have a score card that explains your performance. The example of the scorecard is given below.</p>

<p>You have correctly answered 78 questions out of 87.</p>

<table class="table table-bordered" style="width: 30%;">
	<tbody>
		<tr>
			<td>Basic Concepts</td>
			<td>100%</td>
		</tr>
		<tr>
			<td>Declarations</td>
			<td>100%</td>
		</tr>
		<tr>
			<td>Expressions</td>
			<td>83%</td>
		</tr>
		<tr>
			<td>Classes and Interfaces</td>
			<td>92%</td>
		</tr>
		<tr>
			<td>Multithreading</td>
			<td>75%</td>
		</tr>
		<tr>
			<td>Collections</td>
			<td>93%</td>
		</tr>
	</tbody>
</table>

<p>From this scorecard you can infer that the questions are broken down into m categories (in the above example m = 6). Each category contains n<sub>i</sub> questions (1 &le; n<sub>i</sub> &le; n), so that &Sigma;<sub>1&le;i&le;m</sub>n<sub>i</sub> = n. You know that you have correctly answered k questions out of n (in the above example k = 78 and n = 87), so you can easily find the number of incorrect answers w = n &minus; k (in the above example w = 9).</p>

<p>You do remember several questions that you were unsure about and you can guess what category they belong to. To figure out if your answers on those questions were right or wrong, you really want to know how many incorrect answers you have given in each category.</p>

<p>Let w<sub>i</sub> (0 &le; w<sub>i</sub> &le; n<sub>i</sub>) be the number of incorrect answers in i-th category, &Sigma;<sub>1&le;i&le;m</sub>w<sub>i</sub> = w. From the scorecard you know the percentage of correct answers in each category. That is, for each i from 1 to m you know the value of 100(n<sub>i</sub> &minus; w<sub>i</sub>)/n<sub>i</sub> rounded to the nearest integer. The value with a fractional part of 0.5 is rounded to the nearest even integer.</p>

<p>It may not be possible to uniquely find the valid values for w<sub>i</sub>. However, you guess that the questions are broken down into categories in a mostly uniform manner. You have to find the valid values of w<sub>i</sub> and n<sub>i</sub>, so that to minimize the difference between the maximum value of ni and the minimum value of n<sub>i</sub>. If there are still multiple possible values for w<sub>i</sub> and n<sub>i</sub>, then find any of them.</p>

### 입력

<p>The first line of the input file contains three integer numbers &mdash; k, n, and m, where k (0 &le; k &le; n) is the number of correctly answered questions, n (1 &le; n &le; 100) is the total number of questions, m (1 &le; m &le; 10) is the number of question categories. The following m lines of the input file contain one integer number from 0 to 100 (inclusive) on a line &mdash; percentages of the number of the correct answers in each category. The input file always corresponds to some valid set of w<sub>i</sub> and n<sub>i</sub>.</p>

### 출력

<p>Write to the output file m lines with two integer numbers wi and ni on a line, separated by a space &mdash; the number of incorrect answers and the total number of questions in each category, satisfying constraints as given in the problem statement.</p>