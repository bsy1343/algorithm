# [Silver IV] NoMoPhobia - 5104

[문제 링크](https://www.acmicpc.net/problem/5104)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 185, 정답: 114, 맞힌 사람: 91, 정답 비율: 59.477%

### 분류

구현, 자료 구조, 문자열, 정렬, 집합과 맵, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>For Gen Y, digital communication is all encompassing. Extreme stress can be induced in many people by removing a teenager&rsquo;s cell phone.</p>

<p>Ms Hatchett is a teacher who has decided that students will accumulate de-merit points for every cell phone misdemeanor. Confiscation of the miscreant&rsquo;s cell phone occurs after 100 demerit points have been accumulated.</p>

<p>She communicates the following table to her classes</p>

<table class="table table-bordered" style="width:40%">
	<thead>
		<tr>
			<th>Misdemeanor</th>
			<th>Code</th>
			<th>De-merit points</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>Texting while teacher talks</td>
			<td>TT</td>
			<td>75</td>
		</tr>
		<tr>
			<td>Texting during exercises</td>
			<td>TX</td>
			<td>50</td>
		</tr>
		<tr>
			<td>Phone rings</td>
			<td>PR</td>
			<td>80</td>
		</tr>
		<tr>
			<td>Receiving texts</td>
			<td>RT</td>
			<td>30</td>
		</tr>
		<tr>
			<td>Argues about phone use</td>
			<td>AP</td>
			<td>25</td>
		</tr>
		<tr>
			<td>Takes pictures</td>
			<td>PX</td>
			<td>60</td>
		</tr>
	</tbody>
</table>

<p>She then records the student&rsquo;s first name and their points over the course of a week. At the end of the week, she announces the scorers of at least 100 points and confiscates their phone over the weekend. Everyone starts the week with a clean slate &ndash; that is, points aren&rsquo;t accumulated over more than a week.</p>

<p>Your job is to help her find the owners of phones needing to be confiscated.</p>

### 입력

<p>Input consists of a number of scenarios, each representing one week. The first line of a scenario consists of 2 whole numbers, W and N. (0 &lt; W, N &lt;= 50). W is the week number and N is the number of pupil demerit entries in that week. Input is terminated by a zero value for the week number. Do not process that line.</p>

<p>The first line will be followed by N lines, with each line containing a name (at most 20 characters) and a code as described in the table above. The name and code will be separated by a space.</p>

<p>There may be more than one week&rsquo;s data.</p>

### 출력

<p>Output will consist of one line for each week. The line starts with the word &ldquo;Week&rdquo; separated by a space from the week number followed by the names of the people whose phone&rsquo;s are confiscated. Names must appear in the order that they appear in the input list. These should be commas between the names and a space after the week number. If no phones are confiscated in that week, output a message &ldquo;No phones confiscated&rdquo;.</p>