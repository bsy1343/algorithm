# [Silver II] Vote-Value Disparity 1 - 7609

[문제 링크](https://www.acmicpc.net/problem/7609)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 43, 정답: 23, 맞힌 사람: 21, 정답 비율: 55.263%

### 분류

해 구성하기, 휴리스틱

### 문제 설명

<p>A national election will be held in the JOI kingdom. The JOI kingdom consists of N provinces.</p>

<p>The map of the JOI kingdom is a rectangular-shaped grid consisting of H &times;W blocks. There are H blocks in the vertical direction, and there are W blocks in the horizontal direction. A block is connected with another block by one of the four sides (left, right, top, bottom) of it. The H &times; W blocks are divided into N provinces. Each province is a connected region consisting of blocks. In total, there are P<sub>i</sub> voters in the i-th province (1 &le; i &le; N).</p>

<p>You are the chairman of the National Election Committee of JOI. Your task is to divide the N provinces into K electoral districts (1 &le; K &le; N) in order to elect K representatives. Each electoral district should contain at least one province, and the blocks belonging to an electoral district should form a connected region. Note that a block is connected with another block by one of the four sides (left, right, top, bottom). Two blocks sharing only a vertex are not connected.</p>

<p>For each electoral district, the ratio 1/(the number of voters in the electoral district) is called the <strong>weight of a single vote</strong> of the electoral district. <strong>The vote-value disparity</strong> is defined to be the maximal weight of a single vote for all electoral districts divided by the the minimal weight of a single vote for all electoral districts.</p>

<p>Recently, the value of &ldquo;the vote-value disparity&rdquo; becomes a serious social issue. You have to make this value as small as possible.</p>

<p>Given the information of the provinces of the JOI kingdom and the number of representatives, determine how to divide the provinces into electoral districts so that the value of the vote-value disparity is as small as possible.</p>

### 입력

<p>Read the following data from the standard input.</p>

<ul>
	<li>The first line of input contains four space separated integers H, W, N, K, where the height of the map of the JOI kingdom is H, the width is W, the number of provinces is N, the number of representatives is K.</li>
	<li>Each of the following H lines contains W space separated integers. In the i-th line (1 &le; i &le;&nbsp;H), the j-th integer (j &le; j &le; W) is S<sub>ij</sub> (1 &le; S<sub>ij</sub> &le; N). This means the block in i-th row from above and the j-th column from left belongs to the S<sub>ij</sub>-th province.</li>
	<li>In the i-th line (1 &le;&nbsp;i &le; N) of the following N lines contains an integer P<sub>i</sub>, the number of voters in the i-th province.</li>
</ul>

### 출력

<p>Write the way to divide the provinces into electoral districts in N lines. The i-th line (1 &le; i &le; N) of output should contain an integer, the number of the electoral district where the i-th province belongs.</p>

### 제한

<ul>
	<li>1 &le; H &le; 200</li>
	<li>1 &le; W &le; 200</li>
	<li>1 &le; N &le; 10 000</li>
	<li>1 &le; K &le; N</li>
	<li>1 &le; P<sub>i</sub> &le; 100 000 (1 &le; i &le; N)</li>
	<li>For each province, the blocks belonging to the province form a connected region.</li>
</ul>

### 힌트

<p>In this example, the shape of the JOI kingdom is as follows.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/2684c98e-dec5-43e3-bc4b-f2449ff29e59/-/preview/" style="width: 283px; height: 158px;" /></p>

<p>The number of voters in each province is 3, 5, 7, 10, respectively. In this sample output, the provinces are divided into electoral districts as follows.</p>

<ul>
	<li>Electoral District 1 : Province 1 and Province 3</li>
	<li>Electoral District 2 : Province 2</li>
	<li>Electoral District 3 : Province 4</li>
</ul>

<p>The number of voters in each electoral district is 10, 5, 10, respectively. The weight of a single vote for each electoral district is 0.1, 0.2, 0.1, respectively. Therefore, the vote-value disparity is 0.2/0.1 = 2. If X = 1.5, Y = 3, we have ((3&minus;2)/(3&minus;1.5))<sup>2</sup> &times; 100 = 44.4444444444&middot;&middot;&middot; and this output is worth 44.4444444444&middot;&middot;&middot;&nbsp;points.</p>

<p>In this sample input, the following division is not allowed because the Electoral District 2 does not form a connected region.</p>

<ul>
	<li>Electoral District 1 : Province 1</li>
	<li>Electoral District 2 : Province 2 and Province 4</li>
	<li>Electoral District 3 : Province 3</li>
</ul>