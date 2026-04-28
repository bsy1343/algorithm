# [Platinum III] Bulb - 10877

[문제 링크](https://www.acmicpc.net/problem/10877)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 128, 정답: 26, 맞힌 사람: 21, 정답 비율: 22.340%

### 분류

구현, 그래프 이론

### 문제 설명

<p>Jeehak Yoon is a member of United Committee of Puzzle Creation. Recently, he has made a puzzle to light all the bulbs on the board. The puzzle looks like the following:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10877.%E2%80%85Bulb/99341e6a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/10877.%E2%80%85Bulb/99341e6a.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/10877/bulb1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:218px; width:313px" /></p>

<p>The board consists of N rows and M columns of cells. Each cell contains either a bulb, a wire or nothing. There are exactly two bulbs, and each bulb can be connected with an adjacent cell. There are two types of wires in this puzzle: q-type and l-type. A q-type wire connects two cells that share a vertex, and a l-type wire connects two cells that are opposite to each other.</p>

<p>In order to light all the bulbs, they should be connected by wires. (i.e. there must be a path of wires connecting the two bulbs) It can be done by rotating each cell by 90-degree as many times as you want. Jeehak thought this was too easy, so he added one more constraint: all the wires must be used to connect the bulbs. (i.e. the path of wires connecting two bulbs must consist of all the wires in the board)</p>

<p>The figure below shows an example of a valid solution.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10877.%E2%80%85Bulb/d7104eed.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/10877.%E2%80%85Bulb/d7104eed.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/10877/bulb2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:218px; width:313px" /></p>

<p>Jeehak provided this idea to UCPC and got the test version of this puzzle. He tried to solve the puzzle, but he couldn&rsquo;t solve it because the size of puzzle was quite large for him. Why don&rsquo;t you help Jeehak to solve the puzzle?</p>

### 입력

<p>The first line of input contains an integer T (1 &le; T &le; 10), the number of test cases.</p>

<p>Each test case starts with a line containing two space-separated integers N and M (1 &le; N, M &le; 500), where N is the number of rows of the board and M is the number of columns of the board.</p>

<p>Each of the next N lines contains a string of length M, describing the board. The j-th character of the i-th string (1 &le; i &le; N, 1 &le; j &le; M) describes the cell in the i-th row from the top and the j-th column from the left. There are four kinds of characters &lsquo;O&rsquo; (ASCII code 79), &lsquo;q&rsquo; (ASCII code 113), &lsquo;l&rsquo; (ASCII code 108), and &lsquo;*&rsquo; (ASCII code 42) which describes a cell: &lsquo;O&rsquo; means a bulb, &lsquo;q&rsquo; means a q-type wire, &lsquo;l&rsquo; means a l-type wire and &lsquo;*&rsquo; means nothing.</p>

### 출력

<p>For each test case,</p>

<ul>
	<li>If there exists a valid solution, first print &ldquo;YES&rdquo; (without quotes) in a single line, and then print how a valid solution looks in the next N lines. The i-th (1 &le; i &le; N) line of them should contain exactly M characters. The j-th character of the i-th line (1 &le; i &le; N, 1 &le; j &le; M) should be determined as follows:
	<ul>
		<li>If the corresponding cell was a bulb, the character should be one of &ldquo;^v&lt;&gt;&rdquo; (ASCII Code 94, 118, 60 and 62, correspondingly), according to the direction (up, down, left and right, correspondingly) to which the bulb is connected.</li>
		<li>If the corresponding cell was a q-type wire, the character should be one of &ldquo;qdbp&rdquo; (ASCII Code 113, 100, 98 and 112, correspondingly), according to the position of two ends (left and down, up and left, right and up, down and right correspondingly) of the wire.</li>
		<li>If the corresponding cell was a l-type wire, the character should be one of &ldquo;l-&rdquo; (ASCII Code 108 and 45, correspondingly), according to the position of two ends (up and down, left and right, correspondingly) of the wire.</li>
		<li>If the corresponding cell contained nothing, the character should be &rsquo;*&rsquo; (ASCII code 42).</li>
	</ul>
	</li>
</ul>

<p>If there exists several solutions, it is allowed to print any of them.</p>

<ul>
	<li>If there is no solution, just print &ldquo;NO&rdquo; (without quotes) in a single line.</li>
</ul>