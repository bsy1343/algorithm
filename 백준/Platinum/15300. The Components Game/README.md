# [Platinum V] The Components Game - 15300

[문제 링크](https://www.acmicpc.net/problem/15300)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 27, 정답: 7, 맞힌 사람: 7, 정답 비율: 31.818%

### 분류

자료 구조, 분리 집합, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Narwhy the Narwhal likes playing games on his waterproof phone. Recently, he downloaded a new game from the OceanStore. It involves a rectangular grid made of white and black squares. After going through the tutorial, he learned that by touching any column it turns that column completely black. The larger the number of contiguous regions of the same color there are on the board, the higher his score is!</p>

<table class="table" style="width:100%">
	<tbody>
		<tr>
			<td style="text-align:center; width:25%"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15300/1.png" style="height:177px; width:158px" /></td>
			<td style="text-align:center; width:25%"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15300/2.png" style="height:176px; width:158px" /></td>
			<td style="text-align:center; width:25%"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15300/3.png" style="height:180px; width:158px" /></td>
			<td style="text-align:center; width:25%"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15300/4.png" style="height:178px; width:159px" /></td>
		</tr>
		<tr>
			<td style="text-align:center; width:25%">Original Board</td>
			<td style="text-align:center; width:25%">Column 1 Touched</td>
			<td style="text-align:center; width:25%">Column 2 Touched</td>
			<td style="text-align:center; width:25%">Column 3 Touched</td>
		</tr>
	</tbody>
</table>

<p>Rigorously, these regions are defined as maximal sections of neighboring squares of the same color, where two squares are considered neighbors if they share an edge. After playing the game for a while, Narwhy noticed that between two boards with the same number of total regions, the one with more white regions gets a higher score. Given a state of the board, how can Narwhy get the highest score possible by touching a single column?</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15300/5.png" style="height:187px; width:266px" /></p>

### 입력

<p>The first line of input contains a single decimal integer P, (1 &le; P &le; 10000), which is the number of data sets that follow. Each data set should be processed identically and independently.</p>

<p>Each data set consists of two or more lines of input. The first line contains the data set number, K, followed by a single space, followed by two decimal integers N and M, (1 &le; N,M &le; 1000), which represent the number of rows and the number of columns respectively. Each of the next N lines contains a string of M characters where each character is either a 0 (for a white square) or a 1 (for a black square).</p>

### 출력

<p>For each data set there is one line of output. The single output line consists of the data set number, K, followed by a space followed by two space separated decimal integers which are the number of white regions and the number of black regions corresponding to the highest score that can be obtained by touching exactly one column.</p>