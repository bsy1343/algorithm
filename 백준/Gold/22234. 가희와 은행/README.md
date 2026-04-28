# [Gold V] 가희와 은행 - 22234

[문제 링크](https://www.acmicpc.net/problem/22234)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 1451, 정답: 506, 맞힌 사람: 403, 정답 비율: 33.980%

### 분류

구현, 자료 구조, 시뮬레이션, 큐

### 문제 설명

<p>가희는 창구가 하나인 은행을 운영하고 있습니다. 가희의 은행이 영업을 시작했을 때,&nbsp;대기 줄에는 손님이&nbsp;<em>N</em>명&nbsp;있습니다.</p>

<p>&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22234.%E2%80%85%EA%B0%80%ED%9D%AC%EC%99%80%E2%80%85%EC%9D%80%ED%96%89/e9629e05.png" data-original-src="https://upload.acmicpc.net/55e4fafb-f33c-4d0d-b275-dd9728c1ad7f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><strong>[그림 1] 카운터 직원과 <em>N</em>명의 손님</strong></p>

<p><em>x</em>번 손님에 대한 정보는 <em>x</em>번 손님의&nbsp;<em>id</em> 값인 <em>P<sub>x</sub></em>와 업무를 처리하는 데 필요한 시간인 <em>t<sub>x</sub></em>초로 정보가 주어지게 됩니다.</p>

<p>은행이 영업을 시작하고 난 후에 들어오는 손님은&nbsp;<em>M</em>명 있습니다. 이 손님들은 입력을 받은 순서대로 각각 <em>N+1</em>, <em>N+2</em>, ..., <em>N+M</em>번 손님이 됩니다.</p>

<p>이 손님들에 대한 정보는 <em>x</em>번 손님의&nbsp;<em>id</em> 값인 <em>P<sub>x</sub></em>와 업무를 처리하는 데 필요한 시간인 <em>t<sub>x</sub></em>초, 영업 시작 <em>c<sub>x</sub></em>초 후에 들어왔다는&nbsp;정보가 주어지게 됩니다.</p>

<p>손님은&nbsp;은행에 들어옴과 동시에, 대기 큐의 맨 뒤에 서게 됩니다. N+1번 손님이 은행을 영업을 시작하고&nbsp;c<sub>N+1</sub>초 후에 들어왔다고 생각해 보겠습니다.</p>

<p>&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22234.%E2%80%85%EA%B0%80%ED%9D%AC%EC%99%80%E2%80%85%EC%9D%80%ED%96%89/dbabe07e.png" data-original-src="https://upload.acmicpc.net/33a3c56a-04b0-4119-bef6-c2dbea337ba4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><strong>[그림 2] 은행이 영업을 시작하고 c<sub>N+1</sub>초 후 상황</strong></p>

<p>N+1번 손님은 은행에 들어오자 마자 대기 큐의 맨 뒤에 줄을 서게 되므로, 영업을 시작하고 <em>c<sub>N+1</sub></em>초 후에 대기 큐의 상태는 위와 같습니다.</p>

<p>창구에 있는 직원과 고객들은 아래와 같은 알고리즘으로 업무를&nbsp;처리합니다.</p>

<ol>
	<li>대기 큐의 맨 앞에 있는 고객이 <em>x</em>번 손님이라고 하면, 창구에 있는 직원은

	<ul>
		<li><em>t<sub>x</sub></em>가 <em>T</em>보다 크다면, <em>x</em>번 손님의&nbsp;업무를 <em>T</em>초동안 처리합니다. 그 후, <em>x</em>번 손님의 업무가 끝나는 데 필요한 시간인 <em>t<sub>x</sub></em>는&nbsp;<em>T</em>만큼 감소합니다.</li>
		<li>그렇지 않으면, <em>x</em>번 손님의 업무를 <em>t<sub>x</sub></em>초 동안 처리합니다. 이후에, <em>x</em>번 손님의 업무가 끝나는 데 필요한 시간인 <em>t<sub>x</sub></em>는 은 0이 됩니다.</li>
	</ul>
	</li>
	<li>대기 큐의 맨 앞에 있는 고객인 <em>x</em>번 손님은
	<ul>
		<li>업무가 끝나는 데 필요한 시간인 <em>t<sub>x</sub></em>가&nbsp;0이 되었다면, 은행 바깥으로 나가게 됩니다.</li>
		<li>그렇지 않으면 대기 큐의 맨 뒤로 이동하게 됩니다. 만약에 이 때 도착한 손님이 있다면, 도착한 손님 뒤로 가게 됩니다.</li>
	</ul>
	</li>
	<li>대기 큐에 고객이 남았다면 1로 돌아갑니다.</li>
</ol>

<p>은행이&nbsp;영업을 시작할&nbsp;때 부터 창구에 있는 직원은 일을 시작합니다.</p>

<p>은행이 영업을 시작한 시점으로부터 0초가 지났을 때 부터 <em>W-1</em>초가 지날&nbsp;때 까지 창구에 있는 직원이&nbsp;어떤 고객의 업무를 처리하는지 알려주세요.</p>

### 입력

<p>첫 번째 줄에 <em>N</em>과&nbsp;<em>T</em>, <em>W</em>가 공백을 구분으로 해서 주어집니다.</p>

<p>두 번째 줄 부터 <em>N</em>개의 줄에는 0초일 때, 대기 큐의 앞에 있는 고객부터, <em>P<sub>x</sub></em>와 고객이 일을 처리하는 데 필요한 시간 <em>t<sub>x</sub></em>가 공백으로 구분되어 주어집니다.</p>

<p><em>N+2</em>번째 줄에는, 1초 이후에 은행에 들어온 고객 수 <em>M</em>이 주어집니다.</p>

<p><em>N+3</em>번째 줄부터 <i>M</i>개의 줄에 걸쳐서, <em>P<sub>x</sub></em>,&nbsp;<em>t<sub>x</sub></em>, <em>c<sub>x</sub></em>가 공백으로 구분되어 주어집니다. 입력된 순서대로 각각 <em>N+1</em>, ..., <em>N+M</em>번 고객입니다.</p>

<p>이는 고객 <em>id</em>가 <em>P<sub>x</sub></em>인 고객은 일을 처리하는 데 필요한 시간이 <em>t<sub>x</sub></em>초이고, 영업 시작 시간으로부터&nbsp;<em>c<sub>x</sub></em>초가 지났을 때&nbsp;은행에 들어왔다는 것을 의미합니다.</p>

### 출력

<p><em>i</em>번째 줄에는&nbsp;은행이 영업을 시작한 시점으로부터&nbsp;<em>i-1</em>초가 지났을&nbsp;때 은행 직원이 처리하고 있는 고객 <em>id</em>를 출력해 주세요.</p>

### 제한

<ul>
	<li><em>N</em>,&nbsp;<em>T</em>,<em> W</em>,<em> M</em>는&nbsp;구간 [1, 2&times;10<sup>5</sup>]에 속하는 정수입니다.</li>
	<li>0초부터 <em>W-1</em>초까지 모든 순간에 대기 큐가 비어 있는 경우는 존재하지 않습니다.</li>
	<li>고객이 일을 처리하는 데 걸리는 시간은 구간 [1, 10<sup>9</sup>]에 속하는 정수입니다.</li>
	<li>고객 <em>id</em>는 구간 [1, 10<sup>9</sup>]에 속하는 정수이고, 중복되지 않습니다.</li>
	<li>[<em>N</em>+1, <em>N</em>+<em>M</em>]에 속하는 임의의 정수 x에 대해, <em>c<sub>x</sub></em>는 구간 [1, 10<sup>9</sup>]에 속하는 정수이며, 중복되지 않습니다.<br />
	즉, 영업을 시작하고 난 후에는 <strong>같은 시간에 2명 이상이 동시에 들어오지 않습니다.</strong></li>
</ul>