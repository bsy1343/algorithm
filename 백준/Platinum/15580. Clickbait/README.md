# [Platinum IV] Clickbait - 15580

[문제 링크](https://www.acmicpc.net/problem/15580)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 34, 정답: 17, 맞힌 사람: 15, 정답 비율: 51.724%

### 분류

구현, 그래프 이론, 문자열, 그래프 탐색, 파싱, 재귀

### 문제 설명

<p>While surfing online, Slavko came across an ad displaying a system of containers and pipes (an example of such system is illustrated in the image below) with the message: &ldquo;If container <strong>1</strong>&nbsp;starts filling up with water, determine the order in which the containers get filled up.&rdquo;</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15580.%E2%80%85Clickbait/b491f80f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15580.%E2%80%85Clickbait/b491f80f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15580/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:110px; width:227px" /></p>

<p>The system consists of K containers denoted with numbers from 1 to K, and we can describe it using a matrix of characters with N rows and M columns. The containers are <strong>in the shape of a rectangle</strong>​, and the outlines of the containers and pipes are shown with the following characters:</p>

<ul>
	<li>&lsquo;-&rsquo; if it&rsquo;s a horizontal part of the outline,</li>
	<li>&lsquo;|&rsquo; if it&rsquo;s a vertical part of the outline, and</li>
	<li>&lsquo;+&rsquo; if it&rsquo;s a spot where the horizontal and vertical parts of the outline connect. An exception is where the containers and pipes connect. In that case, the container outline dominates (see sample tests).</li>
</ul>

<p>In an arbitrary place within each container, there is a string of digits that represent the label of the container, and all the other fields in the matrix are equal to &lsquo;.&rsquo; (dot).</p>

<p>All containers except the one labeled with 1 have <strong>exactly one</strong> supply pipe that enters the container in its <strong>upper side</strong>​. The container labeled with 1 does not have a supply pipe.</p>

<p>The containers can have multiple (also possible, zero) discharge pipes that leave the container out of its <strong>lateral side</strong>​. The places where discharge pipes leave a container will be in mutually <strong>distinct rows</strong>​ in the matrix.</p>

<p>The pipes directly connect two containers, which means that <strong>it is not possible</strong> to split the pipes or connect multiple pipes into one, and no two pipes will intersect. On their way, looking from the source to the destination container, the pipes always descend to the following row or stay in the same row. In other words, they never go back to the previous row, so the water can flow freely from one container to another.</p>

<p>The water enters a container until it is full. If the water level reaches the level of the discharge pipe, the water will flow through that pipe until the container the pipe leads into is filled up.</p>

<p>Help Slavko and determine the order in which the containers will fill up.</p>

<p><strong>Please note​:</strong></p>

<ul>
	<li>The test data is such that each character &lsquo;+&rsquo; is surrounded with <strong>exactly one character</strong> &lsquo;-&rsquo; to the left or the right side and <strong>exactly one</strong> character &lsquo;|&rsquo; to the upper or&nbsp;lower side, and <strong>all other</strong> adjacent characters in directions up, down, left and right will be equal to &lsquo;.&rsquo; (dot).</li>
	<li>The only places where the pipe in the matrix is in a field adjacent to the container outline are the places where the pipe enters or exits the container. In other words, a pipe will never run right next to a container (except where it connects with the container). The entry for the supply pipe is labeled with the character &lsquo;|&rsquo; above a container, whereas the exit of the discharge pipe is labeled with the character &lsquo;-&rsquo; on the lateral side of a container.</li>
</ul>

### 입력

<p>The first line contains two integers N and M (1 &le; N, M &le; 1000), matrix dimensions. The following N lines contain M characters describing the container system.</p>

### 출력

<p>You must output K lines. The i<sup>th</sup> line contains the label of the container that fills up i<sup>th</sup>. A solution will always exist and will be unique.</p>

### 힌트

<p><strong>Clarification of the first test case:</strong></p>

<p>Container 1 starts filling up with water.</p>

<p>The water level in container 1 grows, and in one moment reaches the level of the discharge pipe leading to container 2. The water flows through the pipe until container 2 fills up.</p>

<p>After that, the water level in container 1 keeps growing until it reaches the level of the discharge pipe leading to container 3, which fills up next.</p>

<p>Finally, the water level in container 1 keeps growing and the container fills up.</p>