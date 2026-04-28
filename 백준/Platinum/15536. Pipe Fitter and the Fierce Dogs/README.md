# [Platinum I] Pipe Fitter and the Fierce Dogs - 15536

[문제 링크](https://www.acmicpc.net/problem/15536)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 20, 맞힌 사람: 17, 정답 비율: 70.833%

### 분류

애드 혹, 다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>You, a proud pipe fitter of ICPC (International Community for Pipe Connection), undertake a new task. The area in which you will take charge of piping work is a rectangular shape with W blocks from west to east and H blocks from north to south. We refer to the block at the i-th from west and the j-th from north as (i, j). The westernmost and northernmost block is (1, 1), and the easternmost and southernmost block is (W, H). To make the area good scenery, the block (i, j) has exactly one house if and only if both of i and j are odd numbers.</p>

<p>Your task is to construct a water pipe network in the area such that every house in the area is supplied water through the network. A water pipe network consists of pipelines. A pipeline is made by connecting one or more pipes, and a pipeline with l pipes is constructed as follows:</p>

<ol>
	<li>choose a first house, and connect the house to an underground water source with a special pipe.</li>
	<li>choose an i-th house (2 &le; i &le; l), and connect the i-th house to the (i &minus; 1)-th house with a common pipe. In this case, there is a condition to choose a next i-th house because the area is slope land. Let (x, y) be the block of the (i &minus; 1)-th house. An i-th house must be located at either (x &minus; 2, y + 2), (x, y + 2), or (x + 2, y + 2). A common pipe connecting two houses must be located at (x &minus; 1, y + 1), (x, y + 1), or (x + 1, y + 1), respectively.</li>
</ol>

<p>In addition, you should notice the followings when you construct several pipelines:</p>

<ul>
	<li>For each house, exactly one pipeline is through the house.</li>
	<li>Multiple pipes can be located at one block.</li>
</ul>

<p>In your task, common pipes are common, so you can use any number of common pipes. On the other hand, special pipes are special, so the number of available special pipes in this task is restricted under ICPC regulation.</p>

<p>Besides the restriction of available special pipes, there is another factor obstructing your pipe work: fierce dogs. Some of the blocks which do not contain a house seem to be home of fierce dogs. Each dog always stays at his/her home block. Since several dogs must not live at the&nbsp;same block as their home, you can assume each block is home of only one dog, or not home of any dogs.</p>

<p>The figure below is an example of a water pipe network in a 5 &times; 5 area with 4 special pipes. This corresponds to the first sample.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15536.%E2%80%85Pipe%E2%80%85Fitter%E2%80%85and%E2%80%85the%E2%80%85Fierce%E2%80%85Dogs/448e749b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15536.%E2%80%85Pipe%E2%80%85Fitter%E2%80%85and%E2%80%85the%E2%80%85Fierce%E2%80%85Dogs/448e749b.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15536/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:218px; width:392px" /></p>

<p>Locating a common pipe at a no-dog block costs 1 unit time, but locating a common pipe at a dog-living block costs 2 unit time because you have to fight against the fierce dog. Note that when you locate multiple pipes at the same block, each pipe-locating costs 1 unit time for no-dog blocks and 2 for dog-living blocks, respectively. By the way, special pipes are very special, so locating a special pipe costs 0 unit time.</p>

<p>You, a proud pipe fitter, want to accomplish this task as soon as possible. Fortunately, you get a list of blocks which are home of dogs. You have frequently participated in programming contests before being a pipe fitter. Hence, you decide to make a program determining whether or not you can construct a water pipe network such that every house is supplied water through the network with a restricted number of special pipes, and if so, computing the minimum total time cost to construct it.</p>

### 입력

<p>The input consists of a single test case.</p>

<pre>
W H K
N
x<sub>1</sub> y<sub>1</sub>
...
x<sub>N</sub> y<sub>N</sub></pre>

<p>All numbers in a test case are integers. The first line contains three integers W, H, and K. W and H represent the size of the rectangle area. W is the number of blocks from west to east (1 &le; W &lt; 10,000), and H is the number of blocks from north to south (1 &le; H &lt; 10,000). W and H must be odd numbers. K is the number of special pipes that you can use in this task (1 &le; K &le; 100,000,000). The second line has an integer N (0 &le; N &le; 100,000), which is the number of dogs in the area. Each of the following N lines contains two integers x<sub>i</sub> and y<sub>i</sub>, which indicates home of the i-th fierce dog is the block (x<sub>i</sub>, y<sub>i</sub>). These numbers satisfy the following conditions:</p>

<ul>
	<li>1 &le; x<sub>i</sub> &le; W, 1 &le; y<sub>i</sub> &le; H.</li>
	<li>At least one of x<sub>i</sub> and y<sub>i</sub> is even number.</li>
	<li>i &ne; j implies (x<sub>i</sub>, y<sub>i</sub>) &ne; (x<sub>j</sub>, y<sub>j</sub>). That is, two or more dogs are not in the same block.</li>
</ul>

### 출력

<p>If we can construct a water pipe network such that every house is supplied water through the network with a restricted number of special pipes, print the minimum total time cost to construct it. If not, print -1.</p>