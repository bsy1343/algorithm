# [Gold I] 건포도 - 5463

[문제 링크](https://www.acmicpc.net/problem/5463)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 698, 정답: 415, 맞힌 사람: 332, 정답 비율: 58.761%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5463.%E2%80%85%EA%B1%B4%ED%8F%AC%EB%8F%84/7eaa4454.png" data-original-src="https://www.acmicpc.net/upload/images2/raisins.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:171px; width:252px" />플로브디브의 유명한 초콜릿 가공업자 Bonny는 가로 M개, 세로 N개의 격자에 건포도들이 들어있는, N*M크기의 건포도 초콜릿을 만들었다. 각 1*1 격자에는 최소 1개 이상의 건포도가 들어있으며, 2개 이상의 격자를 가로질러서 존재하는 건포도는 없다.</p>

<p>초기에, 초콜릿은 하나의 거대한 단일 블록으로 이루어져 있고, Bonny는 이 초콜릿을 N*M개의 단일 블록으로 나눠야 한다. Bonny는 굉장히 바쁘기 때문에 욕심쟁이 Peter에게 이 일을 맡기려고 한다. Peter는 직사각형 전체를 일직선으로 자르는 행동만 할 수 있으며, 한번 자를때마다 그에 따른 보상을 요구한다.</p>

<p>Bonny는 수중에 돈이 없지만 남은 건포도가 상당하기 때문에 Peter에게 돈 대신 건포도를 지불하려 한다. 욕심쟁이 Peter는 이 제안을 동의했지만, &quot;초콜릿 한 조각을 작은 두 조각으로 자를 때마다, 초기 큰 초콜릿에 있었던 건포도의 개수만큼의 수입을 받아야 한다&quot; 는 조건을 걸었다.</p>

<p>Bonny는 Peter에게 최소한의 건포도를 주려 한다. Bonny는 각 조각에 있는 건포도의 수를 알며, Peter가 잘라야 하는 건포도의 조각이나 위치 모두 Bonny가 결정할 수 있다. Bonny가 지불해야 하는 건포도의 최소 양을 구하여라.</p>

### 입력

<p>표준 입력으로부터 다음의 데이터를 읽어야 한다 :</p>

<ul>
	<li>첫 번째 줄에는 건포도의 크기 N,M이 주어진다.</li>
	<li>이후 N개 줄에 M개의 정수 Rij가 주어진다. 이는 i행 j열에 있는 건포도의 수이다.</li>
	<li>1 &lt;= N,M &lt;= 50</li>
	<li>1 &lt;= Ri,j &lt;= 1000</li>
</ul>

### 출력

<p>Bonny가 주어야 하는 건포도의 양의 최솟값을 출력한다.</p>

### 힌트

<p>다음과 같이 자르면 77개의 건포도를 주고 초콜릿을 자를 수 있다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5463.%E2%80%85%EA%B1%B4%ED%8F%AC%EB%8F%84/624f67f9.png" data-original-src="https://www.acmicpc.net/upload/images2/raisins2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:82px; width:711px" /></p>