# [Gold III] 가희와 탑 - 24337

[문제 링크](https://www.acmicpc.net/problem/24337)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 4849, 정답: 1310, 맞힌 사람: 988, 정답 비율: 25.178%

### 분류

그리디 알고리즘, 해 구성하기

### 문제 설명

<p>일직선으로 다양한 높이의 건물들이 <em>N</em>개 존재합니다. 가희는 건물들의 왼쪽에, 단비는 건물들의 오른쪽에 있습니다. 일직선 상에 가희와 단비, 건물들은 아래와 같은 순서로 배치되어 있습니다.</p>

<ul>
	<li>가희의 오른쪽에는 1번 건물이 있습니다.</li>
	<li><em>x</em>가 1이상 <em>N-1</em>이하의 정수일 때, x번 건물의 오른쪽에는 <em>x+1</em>번 건물이 있습니다.</li>
	<li><em>N</em>번 건물의 오른쪽에는 단비가 있습니다.</li>
</ul>

<p>가희와 단비가 볼 수 있는 건물은 아래와 같습니다.</p>

<ul>
	<li>가희는 1번 건물을 볼 수 있습니다.</li>
	<li><em>k</em>번 건물보다 왼쪽에 있는 건물들이 <strong>모두</strong>&nbsp;<em>k</em>번 건물보다 높이가 낮다면, 가희는 <em>k</em>번 건물을 볼 수 있습니다.</li>
	<li>단비는 <em>N</em>번 건물을 볼 수 있습니다.</li>
	<li><em>k</em>번 건물보다 오른쪽에 있는 건물들이 <strong>모두</strong>&nbsp;<em>k</em>번 건물보다 높이가 낮다면, 단비는 <em>k</em>번 건물을 볼 수 있습니다.</li>
</ul>

<p>예를 들어, <em>N</em>이 3이고, 1번 건물의 높이가 1, 2번 건물의 높이가 3, 3번 건물의 높이가 2라고 하겠습니다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24337.%E2%80%85%EA%B0%80%ED%9D%AC%EC%99%80%E2%80%85%ED%83%91/03bcea1e.png" data-original-src="https://upload.acmicpc.net/5a6e0313-a6d1-43b4-9997-926cae9b0905/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><strong>[그림 1] 가희와 단비, 그리고 건물들의 배치</strong></p>

<p>가희가 볼 수 있는 건물과 단비가 볼 수 있는 건물의 수는 각각 2개입니다. 이를 각각 노란색, 연보라색으로 표시하겠습니다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24337.%E2%80%85%EA%B0%80%ED%9D%AC%EC%99%80%E2%80%85%ED%83%91/88537af5.png" data-original-src="https://upload.acmicpc.net/f0583b2b-3237-498e-95cf-af714b52cd15/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" />&nbsp;&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24337.%E2%80%85%EA%B0%80%ED%9D%AC%EC%99%80%E2%80%85%ED%83%91/ca6757bb.png" data-original-src="https://upload.acmicpc.net/777defd0-84a6-40ae-a24f-89154fa6ab8c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><strong>[좌] 가희가 볼 수 있는 건물 [우] 단비가 볼 수 있는 건물</strong></p>

<p>가희가 3번&nbsp;건물을 볼 수 없는 이유는 3번&nbsp;건물 왼쪽에 있는 2번&nbsp;건물의 높이가 3번&nbsp;건물보다 높기&nbsp;때문입니다. 그리고, 단비가 1번&nbsp;건물을 볼 수 없는 이유는 1번&nbsp;건물보다 오른쪽에 있는 2번 건물과 3번&nbsp;건물이 1번&nbsp;건물보다 높기&nbsp;때문입니다.</p>

<p>가희와 단비 사이에 있는 건물의 개수 <em>N</em>과 가희가 볼 수 있는 건물의 개수 <em>a</em>, 단비가 볼 수 있는 건물의 개수 <em>b</em>가 주어집니다. <strong>사전 순으로 가장 앞서는</strong>&nbsp;<em>N</em>개의 건물 높이 정보를 출력해 주세요.</p>

### 입력

<p>첫째 줄에 건물의 개수&nbsp;<em>N</em>, 가희가 볼 수 있는 건물의 개수&nbsp;<em>a</em>, 단비가 볼 수 있는 건물의 개수&nbsp;<em>b</em>가 공백으로 구분해서 주어집니다.</p>

### 출력

<p>문제의 조건에 맞는 건물들의 높이 정보가 1개 이상 존재하는 경우 <em>N</em>개의 건물 높이 정보 중 <strong>사전순으로 가장 앞선 것</strong>을 출력해 주세요. 출력 형식은 다음을 만족해야 합니다.</p>

<ul>
	<li>1번 건물, ... , <em>N</em>번 건물의 높이를&nbsp;<strong>공백으로&nbsp;구분해서 출력</strong>해 주세요. <strong>출력하는 수들이 모두 다를 필요는 없습니다.</strong></li>
	<li>높이는 <strong>1보다 크거나 같은 정수</strong>여야 합니다.</li>
</ul>

<p>문제의 조건에 맞는 건물들의 높이 정보가 존재하지 않으면 첫 줄에 -1을 출력해 주세요.</p>

### 제한

<ul>
	<li>1 &le; <em>N </em>&le; 10<sup>5</sup></li>
	<li>1 &le; <em>a </em>&le; <em>N</em></li>
	<li>1 &le; <em>b </em>&le; <em>N</em></li>
</ul>

### 힌트

<p>건물 <em>N</em>개에 대한 높이 정보 <em>A</em>, <em>B</em>가 있다고 하겠습니다.&nbsp;</p>

<p>높이 정보 <em>A</em> = <em>a<sub>1</sub></em>, ... , <em>a<sub>n</sub></em>가&nbsp;높이 정보 <em>B</em> = <em>b<sub>1</sub></em>, ... , <em>b<sub>n</sub> </em>보다 사전 순으로 앞선다는 것은 두 조건 중 하나를 만족한다는 것입니다.</p>

<ul>
	<li><em>a<sub>1</sub> </em>&lt; <em>b<sub>1&nbsp;</sub></em>입니다.</li>
	<li><em>a<sub>1</sub> </em>= <em>b<sub>1</sub></em>, ... , <em>a<sub>i-1</sub></em> = <em>b<sub>i-1</sub></em>이고 <em>a<sub>i</sub> </em>&lt; <em>b<sub>i</sub></em>인 <em>i</em>가 존재합니다. (<em>i</em>는 <strong>2이상 <em>N</em>이하&nbsp;정수</strong>입니다.)</li>
</ul>