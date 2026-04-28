# [Platinum IV] 순열 그래프의 전갈성 판별 - 13124

[문제 링크](https://www.acmicpc.net/problem/13124)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 141, 정답: 64, 맞힌 사람: 58, 정답 비율: 49.573%

### 분류

많은 조건 분기, 그래프 이론

### 문제 설명

<p>컴퓨터 과학에서 사용하는 그래프, 그중에서도 간선에 방향성이 없는 무향 그래프를 상상해보자. 이 중 어떤 그래프들은 특수한 성질을 가지고 있다. 예를 들어,</p>

<ul>
	<li>어떤 무향 그래프는 &lsquo;임의의 두 정점 쌍 간의 경로가 항상 존재하는&rsquo; 성질을 가진다. 이러한 그래프를 우리는 <em>연결 그래프</em>라고 부른다.</li>
	<li>어떤 무향 그래프는, &lsquo;사이클이 존재하지 않는&rsquo; 성질을 가진다. 이러한 그래프를 우리는 <em>포레스트</em>라고 부른다.</li>
	<li>어떤 무향 그래프는, &lsquo;사이클이 존재하지 않으며 모든 정점 쌍 간의 경로가 존재하는&rsquo; 성질을 가진다. 이러한 그래프를 우리는 <em>트리</em>라고 부른다.</li>
	<li>어떤 무향 그래프는, &lsquo;<em>전갈스러운</em>&rsquo; 성질을 가진다..? 이러한 그래프를 우리는 <strong><em>전갈 그래프</em></strong>라고 부른다...?</li>
</ul>

<table class="table table-bordered" style="width:520px">
	<tbody>
		<tr>
			<td style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13124.%E2%80%85%EC%88%9C%EC%97%B4%E2%80%85%EA%B7%B8%EB%9E%98%ED%94%84%EC%9D%98%E2%80%85%EC%A0%84%EA%B0%88%EC%84%B1%E2%80%85%ED%8C%90%EB%B3%84/6a4c41d7.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13124/fig1_1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:70px; width:128px" /></td>
			<td style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13124.%E2%80%85%EC%88%9C%EC%97%B4%E2%80%85%EA%B7%B8%EB%9E%98%ED%94%84%EC%9D%98%E2%80%85%EC%A0%84%EA%B0%88%EC%84%B1%E2%80%85%ED%8C%90%EB%B3%84/608d34c4.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13124/fig1_2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:63px; width:120px" /></td>
			<td style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13124.%E2%80%85%EC%88%9C%EC%97%B4%E2%80%85%EA%B7%B8%EB%9E%98%ED%94%84%EC%9D%98%E2%80%85%EC%A0%84%EA%B0%88%EC%84%B1%E2%80%85%ED%8C%90%EB%B3%84/48fa6712.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13124/fig1_3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:54px; width:131px" /></td>
			<td style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13124.%E2%80%85%EC%88%9C%EC%97%B4%E2%80%85%EA%B7%B8%EB%9E%98%ED%94%84%EC%9D%98%E2%80%85%EC%A0%84%EA%B0%88%EC%84%B1%E2%80%85%ED%8C%90%EB%B3%84/51dca693.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13124/fig1_4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:71px; width:122px" /></td>
		</tr>
		<tr>
			<td style="text-align:center">연결 그래프</td>
			<td style="text-align:center">포레스트</td>
			<td style="text-align:center">트리</td>
			<td style="text-align:center">전갈 그래프</td>
		</tr>
	</tbody>
</table>

<p>그래프의 예시</p>

<p>이번 문제에서 우리는 전갈 그래프를 다루게 될 것이다. 전갈스러운 성질을 가지는 그래프를 전갈 그래프라고 부르며, &lsquo;전갈스러운 성질&rsquo;은 다음과 같이 정의된다.</p>

<ul>
	<li>그래프는 연결 그래프이다.</li>
	<li>모든 정점은 아래 4가지 종류 중 하나에 속한다.
	<ul>
		<li><em><strong>가시</strong></em> 단 하나의 &lsquo;가시&rsquo; 정점이 존재하여, 꼬리 정점과만 연결되어 있다.</li>
		<li><em><strong>꼬리</strong></em> 단 하나의 &lsquo;꼬리&rsquo; 정점이 존재하여, 가시 정점과 몸통 정점과만 연결되어 있다.</li>
		<li><em><strong>몸통</strong></em> 단 하나의 &lsquo;몸통&rsquo; 정점이 존재하여, 꼬리 정점과 모든 발 정점들과만 연결되어 있다.</li>
		<li><em><strong>발</strong></em> 가시, 꼬리, 몸통 정점 이외의 모든 정점은 &lsquo;발&rsquo; 정점이다. 각각의 발 정점은 반드시 몸통 정점과 연결되어 있으며, 꼬리 정점과 가시 정점과는 연결되어 있지 않다. 발 정점끼리는, 연결되어 있을 수도 있고, 연결되어 있지 않을 수도 있다.</li>
	</ul>
	</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13124.%E2%80%85%EC%88%9C%EC%97%B4%E2%80%85%EA%B7%B8%EB%9E%98%ED%94%84%EC%9D%98%E2%80%85%EC%A0%84%EA%B0%88%EC%84%B1%E2%80%85%ED%8C%90%EB%B3%84/108c0841.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13124/fig2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:120px; width:174px" /></p>

<p style="text-align: center;">전갈 그래프의 예</p>

<p>왜 컴퓨터 과학자들은 &lsquo;전갈스럽다&rsquo;는 그래프 성질을 발견하고 이름까지 붙였을까? 이는 이 성질이 가지는 독특함 때문이다. <em>N</em> &times;&nbsp;<em>N</em> 크기의 인접 행렬이 주어졌을 때, 자명하지 않은 대부분의 그래프 성질(연결 그래프, 트리, 포레스트, ...)을 판별하는 데에는, 입력을 제외하면 <em>O</em>(<em>N</em><sup>2</sup>)의 시간이 필요하다. 하지만, 놀랍게도 어떤 그래프의 &lsquo;전갈성&rsquo;은, 간선의 개수에 상관없이, 항상 입력 제외 <em>O</em>(<em>N</em>)의 시간에 판별할 수 있는 알고리즘이 존재한다.</p>

<p>재현이는 전갈 그래프의 이러한 놀라운 성질에 감탄하여서, 여러분에게 순열 그래프라는 또 하나의 독특한 그래프를 주고, 이 그래프가 전갈스러운지를 판단하는 문제를 출제하였다. 순열 그래프란 무엇일까? 길이가 <em>N</em>인 순열 <em>A<sub>1</sub></em>, <em>A<sub>2</sub></em>, &middot; &middot; &middot; , <em>A<sub>N</sub></em>에 대해, 순열 <em>A</em>로 나타낸 순열 그래프는 아래와 같이 정의된다.</p>

<ul>
	<li>그래프는 1부터 <em>N</em>까지의 번호가 붙은 <em>N</em>개의 정점으로 구성된다.</li>
	<li>그래프의 간선은 아래와 같은 과정으로 잇는다.
	<ol>
		<li>두 개의 평행한 직선을 그려, 한 직선 위에는 1, 2, &middot;&middot;&middot; , <em>N</em>을, 다른 직선 위에는 <em>A<sub>1</sub></em>, <em>A<sub>2</sub></em>, &middot;&middot;&middot; , <em>A<sub>N</sub></em>를 차례로 적는다.</li>
		<li>같은 수끼리 선분을 잇는다.</li>
		<li><em>i</em>끼리 이은 선분과 <em>j</em>끼리 이은 선분이 교차하는 모든 (<em>i</em>, <em>j</em>) 쌍에 대해, <em>i</em>번 정점과 <em>j</em>번 정점을 무방향 간선으로 연결한다.</li>
	</ol>
	</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13124.%E2%80%85%EC%88%9C%EC%97%B4%E2%80%85%EA%B7%B8%EB%9E%98%ED%94%84%EC%9D%98%E2%80%85%EC%A0%84%EA%B0%88%EC%84%B1%E2%80%85%ED%8C%90%EB%B3%84/e699a883.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13124/fig3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:77px; width:249px" /></p>

<p style="text-align: center;"><em>A</em> = [2, 5, 4, 1, 3]으로 나타낸 순열 그래프</p>

<p>문제를 조금 더 어렵게 만들고 싶었던 재현이는, <em>Q</em>개의, 순열의 두 수를 교환하는 연산을 추가했다. 당신은, 교환 연산 이후의 순열 그래프 각각에 대해서 그 그래프가 전갈성을 띄는지 판별해야 한다. 교환 연산은 일시적이지 않으며, 이후 연산에 영향을 끼친다.</p>

### 입력

<p>첫 번째 줄에 순열의 길이 <em>N</em> (4 &le; <em>N</em> &le; 100 000)이 주어진다.</p>

<p>두 번째 줄에 순열 <em>A</em>를 나타내는 서로 다른 <em>N</em>개의 자연수 <em>A<sub>1</sub></em>, <em>A<sub>2</sub></em>, ... , <em>A<sub>N</sub></em> (1 &le; <em>A<sub>i</sub></em> &le; <em>N</em>)이 주어진다.</p>

<p>세 번째 줄에 교환 연산의 수 <em>Q</em> (1 &le; <em>Q</em> &le; 100 000)이 주어진다.</p>

<p>이후 <em>Q</em>개의 줄에는 교환 연산에 대한 정보가 주어진다. 각 줄에는 두 개의 자연수 <em>x</em>와 <em>y</em> (1 &le; <em>x</em>, <em>y</em> &le; <em>N</em>, <em>x</em> &ne; <em>y</em>)가 공백을 사이로 두고 주어지는데, 이는 순열 <em>A</em>의 <em>x</em>번째 원소 <em>A<sub>x</sub></em>와 <em>y</em>번째 원소 <em>A<sub>y</sub></em>의 값을 먼저 교환한 후, 순열 <em>A</em>로 나타낸 순열 그래프가 전갈 그래프인지 판별하여 출력하라는 의미이다.</p>

### 출력

<p>각 교환 연산이 주어질 때마다, <u>교환 이후</u> 순열 <em>A</em>로 나타낸 순열 그래프가 전갈 그래프라면 &ldquo;<code>YES</code>&rdquo; (따옴표 제외)를, 그렇지 않다면 &ldquo;<code>NO</code>&rdquo; (따옴표 제외)를 각 줄에 하나씩 출력한다.</p>