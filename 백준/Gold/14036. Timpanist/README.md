# [Gold I] Timpanist - 14036

[문제 링크](https://www.acmicpc.net/problem/14036)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 5, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Computer scientists don&rsquo;t often help percussionists, but today, that will change. Since we cannot help all percussionists at the same time, we focus on timpanists first. By way of terminology, the timpani is the plural of timpano and the player of the timpani is a timpanist.</p>

<p>A timpano is a large drum which can be tuned to a certain pitch, and a timpanist uses an ordered set of D timpani. On this occasion, they&rsquo;re playing a piece which has N notes. Note i occurs T<sub>i</sub> seconds into the piece, and has pitch P<sub>i</sub>. P<sub>i</sub> is one of the following twelve notes:</p>

<p style="text-align: center;">{ F, F#, G, G#, A, A#, B, C, C#, D, D#, E }</p>

<p>At a given time, a timpano can only be used to play the pitch it is currently tuned to, and thus the timpanist can play a note i if and only if one of the timpani is tuned to pitch P<sub>i</sub> at time T<sub>i</sub>.</p>

<p>Every note in this piece is in the range of a single octave, from F up to E, which means that the above list of possible notes is in ascending order of pitch. In order to make your computation slightly easier, we will use integers from 1 to 12 to indicate these 12 tones:</p>

<table class="table table-bordered" style="width: 100%;">
	<tbody>
		<tr>
			<th>1</th>
			<th>2</th>
			<th>3</th>
			<th>4</th>
			<th>5</th>
			<th>6</th>
			<th>7</th>
			<th>8</th>
			<th>9</th>
			<th>10</th>
			<th>11</th>
			<th>12</th>
		</tr>
		<tr>
			<td>F</td>
			<td>F#</td>
			<td>G</td>
			<td>G#</td>
			<td>A</td>
			<td>A#</td>
			<td>B</td>
			<td>C</td>
			<td>C#</td>
			<td>D</td>
			<td>D#</td>
			<td>E</td>
		</tr>
	</tbody>
</table>

<p>(i.e., F will be represented by 1, F# by 2, . . ., E by 12).</p>

<p>These are the only pitches to which timpani can be tuned.</p>

<p>Before the piece starts, the timpanist can freely tune each timpano to any pitch they&rsquo;d like. However, during the piece, they may need to quickly retune them in between notes in order to be able to play the required pitches at the correct times. The drums are numbered from 1 to D. At every point in time, the drum i + 1 must be kept tuned to a pitch higher than drum i. Retuning a single drum must be done in an uninterrupted interval of time, in which no notes are being played and no other drums are being retuned. Because this is not an easy process, the timpanist would like to give themselves as much time as possible. In particular, they&rsquo;d like to maximize the amount of time they have for the fastest retuning they must perform within the piece.</p>

### 입력

<p>The first line contains two integers, N and D, the number of notes to be played and the number&nbsp;of drums available to be played (1 &le; N &le; 100; 1 &le; D &le; 4). The next N lines each contain two integers T<sub>i</sub> and P<sub>i</sub> representing the time and pitch of the ith note played (0 &le; T<sub>1</sub> &lt; T<sub>2</sub> &lt; ... &lt; T<sub>N&minus;1</sub> &lt; T<sub>N</sub> &le; 10<sup>9</sup>; 1 &le; P<sub>i</sub> &le; 12 for 1 &le; i &le; N).</p>

### 출력

<p>The output is one line containing one real number (rounded off to 2 decimal places), which is the maximum amount of time (in seconds) that the timpanist can have for their fastest retuning, or 0.00 if no retunings are necessary</p>