# [Gold IV] 가희의 수열놀이 (Small) - 17162

[문제 링크](https://www.acmicpc.net/problem/17162)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 842, 정답: 237, 맞힌 사람: 181, 정답 비율: 29.288%

### 분류

수학, 자료 구조, 스택

### 문제 설명

<p>chogahui는 수열 <em>arr</em>을 이용해 나머지 놀이를 하고 있습니다. 조가희는 수열에 다음과 같은 연산을 할 수 있습니다.</p>

<ul>
	<li>수열 <em>arr</em>의 맨 뒤에 <em>num</em>을 추가합니다.</li>
	<li>수열 <em>arr</em>의 맨 뒤에 있는 원소를 제거합니다.</li>
</ul>

<p>chogahui가 물어보는 질문은&nbsp;다음과 같습니다.</p>

<ul>
	<li>수열 <em>arr</em>의 <strong>맨 뒤</strong>에서부터 최소 몇 개의 수를 선택해야, 이들을 <em>mod</em>로 나누었을 때 나머지가 0, ... , <em>mod-1</em>인 경우가 <strong>최소 한 번 이상</strong> 나타나는가?</li>
</ul>

<p>chogahui의 질문을 해결해 주세요.</p>

### 입력

<p>첫 번째 줄에는 쿼리의 수를 의미하는 정수 <em>Q</em>와 나누는 정수 <em>mod</em> 가 공백으로 구분되어 주어집니다. (1 &le;&nbsp;<em>Q</em>&nbsp;&le;&nbsp;2&times;10<sup>5</sup>, 1 &le;&nbsp;<em>mod</em> &le; 10<sup>2</sup>)</p>

<p>이후 <em>Q</em>개의 줄에 걸쳐서, 다음 세 종류의 쿼리 중 하나가 주어집니다. 이는 맨 앞에 오는 정수의 값 (1, 2, 3)에 따라 구분됩니다.</p>

<ul>
	<li>1 <em>num</em> : 수열 <em>arr</em>의 맨 뒤에 <em>num</em>을 추가한다. (1 &le;&nbsp;<em>num</em> &le; 2<sup>31</sup>-1)</li>
	<li>2 : 수열&nbsp;<i>arr</i>의 맨 뒤에 있는 원소를 제거한다. <strong>만약 <em>arr</em>이 비어있으면 무시한다.</strong></li>
	<li>3 : chogahui가 요구하는 쿼리에 대한 값을 계산한다.</li>
</ul>

<p>처음에 수열 <em>arr</em>은 비어 있습니다.</p>

### 출력

<p>chogahui가 요구한 쿼리에 대한 값을 <strong>3번 쿼리</strong>가 들어올 때마다 출력합니다. 3번 쿼리는 입력에 <strong>1개 이상 존재</strong>합니다.&nbsp;3번 쿼리에 대한 답이 존재하지 않는 경우에는 -1을 출력한다.</p>

### 힌트

<p>&nbsp;첫 번째 3번 쿼리가 들어왔을 때, 수열 <em>arr</em>은 다음과 같습니다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17162.%E2%80%85%EA%B0%80%ED%9D%AC%EC%9D%98%E2%80%85%EC%88%98%EC%97%B4%EB%86%80%EC%9D%B4%E2%80%85(Small)/3ee10a6d.png" data-original-src="https://upload.acmicpc.net/b3dedc57-47f2-47ea-8de1-064c76827cc1/-/crop/213x208/170,237/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>&nbsp;3을 4로 나눈 나머지는 3, 2를 4로 나눈 나머지는 2입니다. 수열의 모든 원소를 선택해도, 4로 나눈 나머지가 0인 경우, 1인 경우는 존재하지 않으므로 -1을 출력합니다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17162.%E2%80%85%EA%B0%80%ED%9D%AC%EC%9D%98%E2%80%85%EC%88%98%EC%97%B4%EB%86%80%EC%9D%B4%E2%80%85(Small)/0697e512.png" data-original-src="https://upload.acmicpc.net/6098146a-268f-4957-a835-b3b2637bde97/-/crop/234x377/161,70/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /><br />
&nbsp;</p>

<p>&nbsp;2번째 3번 쿼리가 들어온 경우입니다. 위에서부터 4개를 선택했을 때, 4를 4로 나눈 나머지는 0, 1을 4으로 나눈 나머지는 1, 3을 4로 나눈 나머지는 3, 2를 4로 나눈 나머지는 2입니다.&nbsp;나머지가 0, 1, 2, 3인 경우가 <strong>최소 하나 이상 존재합니다.</strong> 그리고 이 값이 조가희가 요구하는 값임을 알 수 있습니다. 따라서 4를 출력합니다.</p>