# [Platinum III] Looping Playlist - 15397

[문제 링크](https://www.acmicpc.net/problem/15397)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 162, 정답: 41, 맞힌 사람: 28, 정답 비율: 27.451%

### 분류

그리디 알고리즘, 비트마스킹

### 문제 설명

<p>A local radio station had a hardware malfunction and is stuck playing the same playlist in a loop. Equipped with pitch detection software, you set out to determine a lower bound to the number of songs in the playlist.</p>

<p>You&#39;ve managed to record the whole loop, starting at an arbitrary point, and ending at the same point. The pitch detection software&#39;s output consists of the N detected musical notes in the order in which they were played.</p>

<p>Every musical note has one of 12 names: Do, Do#, Re, Re#, Mi, Fa, Fa#, Sol, Sol#, La, La#, or Si. The interval between any two consecutive notes from the list is called a half-step. Notes that are 12 half-steps apart share the same name; therefore, the note that follows Si is called Do, and so on.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15397/1.png" style="height:134px; width:381px" /></p>

<p>Each of the songs is made up of two or more notes, all belonging to a single major scale.</p>

<p>All major scales are defined by their root note and are comprised of eight notes, of which seven have distinct names. The pitch offsets from the root note to each note in the scale are 0, 2, 4, 5, 7, 9 , 11 and 12 half-steps, respectivley (the first and last notes have the same as the root note). It is possible to build a major scale based on any root note. For example:</p>

<table class="table table-bordered" style="width:100%">
	<thead>
		<tr>
			<th>&nbsp;</th>
			<th>Root +0</th>
			<th>Root +2</th>
			<th>Root +4</th>
			<th>Root +5</th>
			<th>Root +7</th>
			<th>Root +9</th>
			<th>Root +11</th>
			<th>Root +12</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th>Do major</th>
			<td>Do</td>
			<td>Re</td>
			<td>Mi</td>
			<td>Fa</td>
			<td>Sol</td>
			<td>La</td>
			<td>Si</td>
			<td>Do</td>
		</tr>
		<tr>
			<th>Do# major</th>
			<td>Do#</td>
			<td>Re#</td>
			<td>Fa</td>
			<td>Fa#</td>
			<td>Sol#</td>
			<td>La#</td>
			<td>Do</td>
			<td>Do#</td>
		</tr>
		<tr>
			<th>Re major</th>
			<td>Re</td>
			<td>Mi</td>
			<td>Fa#</td>
			<td>Sol</td>
			<td>La</td>
			<td>Si</td>
			<td>Do#</td>
			<td>Re</td>
		</tr>
		<tr>
			<th>Re# major</th>
			<td>Re#</td>
			<td>Fa</td>
			<td>Sol</td>
			<td>Sol#</td>
			<td>La#</td>
			<td>Do</td>
			<td>Re</td>
			<td>Re#</td>
		</tr>
		<tr>
			<th>Mi major</th>
			<td>Mi</td>
			<td>Fa#</td>
			<td>Sol#</td>
			<td>La</td>
			<td>Si</td>
			<td>Do#</td>
			<td>Re#</td>
			<td>Mi</td>
		</tr>
		<tr>
			<td colspan="9" style="text-align:center">&hellip;et cetera&hellip;</td>
		</tr>
	</tbody>
</table>

<p>Your task is to determine M, which is the minimum number of songs that the playlist contains.</p>

### 입력

<p>The first line of the input file contains N &lt;= 10 000 000 representing the number of musical notes detected. The following N lines each contain a musical note. All notes are capitalized as shown previously (i. e. the first letter is upper case; the rest are lower case).</p>

### 출력

<p>The output has to contain M.</p>