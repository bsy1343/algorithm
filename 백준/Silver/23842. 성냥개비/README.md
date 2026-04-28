# [Silver IV] 성냥개비 - 23842

[문제 링크](https://www.acmicpc.net/problem/23842)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1101, 정답: 543, 맞힌 사람: 451, 정답 비율: 47.126%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>동빈이는 내일 TV 프로그램 &#39;문제적 유니&#39; 에 출연한다. 평소 애청자였던 동빈이는 성냥개비 문제가 자주 출제된다는 사실을 알았고, 오늘 예습하기로 했다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/23842.%E2%80%85%EC%84%B1%EB%83%A5%EA%B0%9C%EB%B9%84/ef82d95a.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/23842.%E2%80%85%EC%84%B1%EB%83%A5%EA%B0%9C%EB%B9%84/ef82d95a.png" data-original-src="https://upload.acmicpc.net/4ca15d6c-034a-4bd2-89f0-0b1ff2c64720/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 333px; height: 200px;" /></p>

<p>성냥개비는 다음과 같이 숫자를 디지털 형식으로 표현하는데, 각 숫자에 필요한 성냥개비 수는 그림과 같다.</p>

<p>동빈이가 연습할 문제는 &#39;올바른 수식 만들기&#39; 문제이고, 다음의 조건들을 만족해야 한다.</p>

<ol>
	<li>수식은 □□+□□=□□&nbsp;의 형태이고, 각 빈칸에는 0~9의 숫자가 들어간다.</li>
	<li>모든 수는 항상 두 자릿수에 맞게 표현해야 한다.<br />
	예시로, 27인 경우에는 &#39;27&#39;, 5인 경우에는 &#39;05&#39;로 표현한다</li>
	<li>&#39;+&#39; 와 &#39;=&#39; 에도 각각 두 개의 성냥개비가 필요하다.&nbsp;</li>
</ol>

<p>N개의 성냥개비가 주어졌을 때, 성냥을 모두 사용하여 조건을 만족하는 수식을 만들 수 있을까? 가능한 답이 없다면 <code>impossible</code>을 출력한다.</p>

### 입력

<p>성냥개비의 개수 <em>N</em>이 주어진다. (1 &le; <em>N</em> &le; 50)</p>

### 출력

<p>첫 줄에 □□+□□=□□&nbsp;형태로 답을 출력한다.</p>

<p>만약 가능한 답이 없다면 <code>impossible</code>&nbsp;을 출력한다.</p>

<p>가능한 답이 여러 개인 경우 그 중 하나를 출력한다.</p>