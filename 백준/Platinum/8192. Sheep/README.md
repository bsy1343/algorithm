# [Platinum I] Sheep - 8192

[문제 링크](https://www.acmicpc.net/problem/8192)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 77, 정답: 30, 맞힌 사람: 20, 정답 비율: 48.780%

### 분류

다이나믹 프로그래밍, 기하학

### 문제 설명

<p>The habitants of the Byteotian Highland bred sheep for centuries. Every sane shepherd has a fenced pasture in the shape of a convex-주석1 polygon for the sheep to graze on. Every sane sheep in turn has its own favourite feeding spot on the pasture where it spends all days. Sometimes however, the sheep want to play. As they play in pairs, every shepherd keeps an even number of sheep, so that his every sheep has a partner to play with.</p>

<p>The shepherds are concerned about a decree recently issued by the Byteburg&#39;s High Commissioner for Agriculture. The decree states that as of the next year the sheep can only graze on triangle-shaped pastures. Thus every shepherd whose pasture is an n-gon for n &gt; 3 is to partition it into triangles by putting n-3 fences inside. Each single new fence, of course, is going to be a segment connecting two vertices of the polygon (pasture). Additionally, the fences can intersect only in these vertices. A shepherd who does not fulfil these requirements will no longer be subsidized.</p>

<p>Byteasar, as a shepherd, has to decide on a way of partitioning his pasture. In fact, he is unsure how many partitions are possible. He is only interested in such partitions that no fence is drawn through a favourite spot of any sheep, and such that every resulting triangle contains the favourite spots of an even number of sheep, so that these sheep can play in pairs. Help Byteasar by writing a program that calculates the number of such partitions!</p>

### 입력

<p>The first line of the standard input contains three integers n, k and m (4 &le; n &le; 600, 2 &le; k &le; 20,000, 2 | k, 2 &le; m &le; 20,000), separated by single spaces, that denote respectively: the number of vertices of the polygon forming the pasture, the number of the sheep, and a certain positive integer m. Each of the following n lines contains two integers x<sub>i</sub> and y<sub>i</sub> (-15,000 &le; x<sub>i</sub>,y<sub>i</sub> &le; 15,000), separated by a single space, denoting the coordinates of the i-th vertex of the pasture. The vertices are given in a clockwise order. Each of the k lines that follow holds two integers p<sub>j</sub>, q<sub>j</sub> (-15,000 &le; p<sub>j</sub>,q<sub>j</sub> &le; 15,000), separated by a single space, denoting the coordinates of the favourite spot of the j-th sheep. All the favourite spots lie strictly inside (i.e., not on the boundary) the pasture.</p>

### 출력

<p>Your program should print one integer on the standard output, namely the remainder of division by m of the number of partitions of the pasture in triangles, such that no fence is drawn through a favourite spot of any sheep, and every resulting triangle contains the favourite spots of an even number of sheep.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8192.%E2%80%85Sheep/4c778ca0.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8192/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:222px; width:562px" /></p>

<p>The figure depicts three possible partitions into triangles. The favourite spots of the sheep are marked with dots.</p>

<p>A convex polygon is a simple polygon (i.e., one with no self-intersections), in which every internal angle is smaller than 180&deg;.</p>