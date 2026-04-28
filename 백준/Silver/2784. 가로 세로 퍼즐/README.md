# [Silver II] 가로 세로 퍼즐 - 2784

[문제 링크](https://www.acmicpc.net/problem/2784)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 1651, 정답: 731, 맞힌 사람: 599, 정답 비율: 46.148%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>아래와 같은 가로 세로 퍼즐을 풀어보자.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/2784.%E2%80%85%EA%B0%80%EB%A1%9C%E2%80%85%EC%84%B8%EB%A1%9C%E2%80%85%ED%8D%BC%EC%A6%90/3df97911.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/2784.%E2%80%85%EA%B0%80%EB%A1%9C%E2%80%85%EC%84%B8%EB%A1%9C%E2%80%85%ED%8D%BC%EC%A6%90/3df97911.png" data-original-src="https://upload.acmicpc.net/45bdf75b-0280-4ae5-94b3-f91e742dc1e2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 149px; height: 125px;" /></p>

<p>가로줄</p>

<ol>
	<li>device used to cool a PC</li>
	<li>solid water</li>
	<li>to obtain</li>
</ol>

<p>세로줄</p>

<ol>
	<li>small, soft, sweet fruit</li>
	<li>strong playing card</li>
	<li>fisherman&#39;s tool</li>
</ol>

<p>6개의 단어가 주어졌을 때, 이를 가지고 가로 세로 퍼즐을 만드는 프로그램을 작성하시오. 단어 3개는 가로줄, 3개는 세로줄로 배치해야한다.</p>

### 입력

<p>6개의 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 이 단어는 사전순으로 정렬되어 있다.</p>

### 출력

<p>6개 단어를 3*3 가로 세로 퍼즐에 놓을 수 없다면 0을 출력한다. 그렇지 않다면, 3개 줄에 퍼즐을 출력한다. 만약 가능한 답이 여러개라면 사전순으로 앞서는 것을 출력한다. 사전순으로 비교를 할 때는, 모두 한 줄로 이어붙인 9개의 단어를 생각하면 된다.</p>