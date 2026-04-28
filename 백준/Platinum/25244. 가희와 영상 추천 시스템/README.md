# [Platinum II] 가희와 영상 추천 시스템 - 25244

[문제 링크](https://www.acmicpc.net/problem/25244)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 146, 정답: 25, 맞힌 사람: 13, 정답 비율: 11.404%

### 분류

구현, 자료 구조, 문자열, 트리를 사용한 집합과 맵, 파싱, 우선순위 큐, 두 포인터

### 문제 설명

<p>가희는 YOTUBE에서 영상을 보고 있습니다. 가희가 <code>R를</code>&nbsp;입력했을 때,&nbsp;고유 번호가 <em>id</em>인 영상의 연관 지수는 아래와 같이 정의됩니다.</p>

<ul>
	<li>가희가 <code>R를</code>&nbsp;입력하기 전 72시간 전부터 <code>R를</code>&nbsp;입력할 때 까지

	<ul>
		<li>고유 번호가 <em>id</em>인 영상을 본 횟수 <em>v</em></li>
		<li>고유 번호가 <em>id</em>인 영상이 속한 카테고리를 C라 했을 때, 카테고리 C에 속하는 영상을 본 횟수 <em>c</em></li>
	</ul>
	</li>
	<li>라고 했을 때, <em>v</em>와 <em>c</em>를 더한 값</li>
</ul>

<p>YOTUBE에 있는 추천 영상은 아래 기준에 따라 순위가 결정됩니다.</p>

<ol>
	<li>연관 지수가 높은 것</li>
	<li>연관 지수가 같다면, 영상 <em>id</em>가 작은 것부터</li>
</ol>

<p>가희가 <em>R</em>를 입력할 때마다, 추천 영상 1위의 영상에 대한 정보를 출력해 주세요.</p>

### 입력

<p>1번째 줄에 YOTUBE에 있는 영상 개수 <em>N</em>과 이벤트의 개수 <em>E</em>가 주어집니다.</p>

<p>그 다음 줄부터 <em>N</em>개의 줄에 <code>VIDEO_NAME</code>과 <code>VIDEO_CATEGORY</code>와 <code>VIDEO_ID</code>가 공백으로&nbsp;구분되어&nbsp;주어집니다. 이때</p>

<ul>
	<li>문자열 <code>VIDEO_NAME</code>은 공백, 숫자, 소문자로만 이루어져 있으며, 공백으로 시작하거나 끝나지 않습니다.</li>
	<li>문자열 <code>VIDEO_CATEGORY</code>는 숫자, 소문자로만 이루어져 있습니다.</li>
	<li><code>VIDEO_ID</code>는 1이상 10<sup>9</sup>&nbsp;이하의 정수입니다.</li>
</ul>

<p>그 다음 줄부터 <em>E</em>개의 줄에 아래 형식 중 하나가 주어집니다.</p>

<ul>
	<li><code>EVENT_TIME</code> <code>VIDEO_ID</code>

	<ul>
		<li><code>EVENT_TIME</code>에 가희는 고유 번호가 <code>VIDEO_ID</code>인 영상을 봅니다.</li>
	</ul>
	</li>
	<li><code>EVENT_TIME</code> <code>R</code>
	<ul>
		<li><code>EVENT_TIME</code>에 가희는 추천 영상 1위의 영상 정보를 알고 싶어합니다.</li>
	</ul>
	</li>
</ul>

<p>이때, <code>VIDEO_ID</code>는 YOTUBE에 있는 영상 <em>id</em>만 주어집니다.</p>

### 출력

<p><code>R</code> 연산이 들어올 때마다, 추천 영상 1위의 동영상 <em>id</em>를 출력해 주세요.</p>

### 제한

<ul>
	<li>1 &le; <em>E</em> &le; 5 &times; 10<sup>5</sup></li>
	<li>1 &le; <em>N</em>&le; 5 &times; 10<sup>5</sup></li>
	<li>이벤트 <em>E</em>개가 일어난 시각은 모두 다르며, 먼저 일어난 순서대로 주어집니다.</li>
	<li>주어지는 <em>N</em>개의 영상 <em>id</em>는 모두 다릅니다.</li>
	<li><code>R</code> 연산이 일어나기 72시간 전부터 1초 전까지 본 영상이 최소 하나 이상 있습니다.</li>
	<li><code>VIDEO_CATEGORY</code>의 길이는 15를 넘지 않고,&nbsp;<code>VIDEO_NAME</code>의 길이는 40을&nbsp;넘지 않습니다.</li>
	<li><code>EVENT_TIME</code>은 2000년 1월 1일 00:00:00 이후이며, 이 대회가 시작한 시각&nbsp;이전입니다. 또한 <code>EVENT_TIME</code>은 YYYY-MM-DD hh:mm:ss 형식으로 주어집니다.</li>
	<li><code>R</code> 연산은 최소 한 번 이상 들어옵니다.</li>
</ul>