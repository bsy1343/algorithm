# [Platinum I] 벽 칠하기 - 19618

[문제 링크](https://www.acmicpc.net/problem/19618)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 257, 정답: 61, 맞힌 사람: 54, 정답 비율: 22.689%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 두 포인터, 덱을 이용한 구간 최댓값 트릭

### 문제 설명

<p>성렬이는 자기가 사는&nbsp;집의 벽을 칠한지 한참 되었기 때문에 다시 칠하려고 한다. 벽은&nbsp;<em>N</em>개의 구간으로 되어 있는데,&nbsp;0부터&nbsp;<em>N</em>&nbsp;&minus; 1까지 번호가 매겨져 있다. 이 문제에서,&nbsp;<em>K</em> 가지 다른 색깔이 있고 이 색을 각각&nbsp;0&nbsp;이상 <em>K</em>&nbsp;&minus; 1&nbsp;이하인 정수로 표현하자 (예를 들면, 붉은 색은 0, 파란 색은 1, 등등 같은 식으로) 성렬이는 벽의&nbsp;<em>i</em> 번째 구간을 색깔 <em>C</em>[<em>i</em>]로 칠하려고 한다.</p>

<p>성렬이는 벽 칠해주는 회사에 이 일을 맡기기로 했는데, 이 회사에는&nbsp;<em>M</em>&nbsp;명의 일꾼이 있고 각 일꾼은&nbsp;0&nbsp;부터 <em>M</em>&nbsp;&minus; 1&nbsp;까지 번호가 매겨져 있다. 불행히도, 일꾼들은 자기가 좋아하는 색만 칠하려고 한다. 구체적으로는,&nbsp;<em>j</em>&nbsp;번 일꾼은 <em>A</em>[<em>j</em>]&nbsp;개의 색을 좋아하고,&nbsp;색 <em>B</em>[<em>j</em>][0], 색 <em>B</em>[<em>j</em>][1], &hellip;, 색 <em>B</em>[<em>j</em>][<em>A</em>[<em>j</em>] &minus; 1]&nbsp;중 하나로만 구간을 칠한다.</p>

<p>성렬이는 벽 칠해주는 회사에 여러 번 지령을 보낼 수&nbsp;있다. 성렬이가 회사에 보내는 지령 하나는&nbsp;두 파라미터 <em>x</em>와&nbsp;<em>y</em>로 이루어지는데, 0 &le; <em>x</em>&nbsp;&lt; <em>M</em>이고 0 &le; <em>y</em> &le; <em>N</em>&nbsp;&minus;&nbsp;<em>M</em>이다. 모든 0 &le; <em>l</em> &lt; <em>M</em>에 대해서 회사는&nbsp;((<em>x</em>&nbsp;+&nbsp;<em>l</em>) mod <em>M</em>)번 일꾼 에게&nbsp;(<em>y</em>&nbsp;+&nbsp;<em>l</em>) 번째 구간을 칠하게 시킨다. 만약 어떤 <em>l</em>&nbsp;값에서 ((<em>x</em> + <em>l</em>) mod <em>M</em>)번 일꾼이 색 <em>C</em>[<em>y</em> + <em>l</em>]을 좋아하지 않는 경우가&nbsp;있다면, 이 지령은 무효가 된다.</p>

<p>성렬이는 지령 하나를 보낼 때마다 돈을 내야 하기 때문에, 가능하다면 벽의 모든 구간을 원하는 색깔로 칠하는 명령의 최소 횟수, 또는 원하는 색깔로 벽을 칠할 수 없다는 것을 알고 싶다. 동일한 구간을 여러번 칠할 수 있지만, 항상 원하는 색깔로 칠해야 한다.</p>

### 입력



### 출력



### 제한

<p>0 &le; <em>k</em> &lt; <em>K</em>에 대해서, <em>f</em>(<em>k</em>)가&nbsp;<em>j</em>번 일꾼이 색&nbsp;<em>k</em>를 좋아하는&nbsp;<em>j</em>의 개수라고 하자. (즉, 색&nbsp;<em>k</em>를 좋아하는 일꾼의 수이다.)&nbsp;예를 들어, 만약&nbsp;<em>f</em>(1) = 2이라면, 색&nbsp;1을 좋아하는 일꾼이 둘 있다.</p>

<ul>
	<li>1 &le; <em>N</em> &le; 100000.</li>
	<li>1 &le; <em>M</em> &le; min(<em>N</em>, 50000).</li>
	<li>1 &le; <em>K</em> &le; 100000.</li>
	<li>0 &le; <em>C</em>[<em>i</em>] &lt; <em>K</em>.</li>
	<li>1 &le; <em>A</em>[<em>j</em>] &le; <em>K</em>.</li>
	<li>0 &le; <em>B</em>[<em>j</em>][0] &lt; <em>B</em>[<em>j</em>][1] &lt; &hellip; &lt; <em>B</em>[<em>j</em>][<em>A</em>[<em>j</em>] &minus; 1] &lt; K.</li>
	<li>&sum;<em>f</em>(<em>k</em>)<sup>2</sup>&nbsp;&le; 400000.</li>
</ul>