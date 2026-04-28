# [Gold IV] 3차원 막대기 연결하기 - 19950

[문제 링크](https://www.acmicpc.net/problem/19950)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 436, 정답: 228, 맞힌 사람: 191, 정답 비율: 61.415%

### 분류

그리디 알고리즘, 기하학, 3차원 기하학

### 문제 설명

<p>3차원 좌표계에서 시작점과 끝점을 다양한 길이의&nbsp;막대기로 연결하려고 한다.</p>

<p>막대기는 서로 간에 겹쳐질 수 있으며 시작점부터 시작하여 막대기를 하나씩 연결하여 끝점까지 연결한다.</p>

<p>안 쓰는 막대기 없이 주어진 막대기를 전부&nbsp;사용해서 시작점부터 끝점까지&nbsp;정확히 이을&nbsp;수 있는지 확인하자.</p>

<p>막대기의 양끝은 항상 시작점, 끝점 혹은 다른 막대기의 끝과 이어져 있어야 하며 시작점 혹은 끝점에 두 개 이상의 막대기의 끝이&nbsp;연결돼 있을 수 없다.</p>

<p>막대기의 두께는 무시할 수 있을 만큼&nbsp;작아서 서로 겹쳐져 있는 것도 가능하다.</p>

### 입력

<p>첫 줄에 좌표계의 시작점(<em>X</em><sub>1</sub>,&nbsp;<em>Y</em><sub>1</sub>,&nbsp;<em>Z</em><sub>1</sub>)과 끝점(<em>X</em><sub>2</sub>,&nbsp;<em>Y</em><sub>2</sub>,&nbsp;<em>Z</em><sub>2</sub>)이 주어진다.</p>

<p>둘째 줄에 막대기의 개수&nbsp;<em>N</em>이 주어진다.</p>

<p>셋째 줄부터 <em>N</em>개의&nbsp;막대기의 길이를 의미하는 정수&nbsp;<em>K</em>가 주어진다.</p>

### 출력

<p>시작점에서 끝점까지 막대기들을 사용해서 연결할 수 있으면 &quot;YES&quot;, 불가능하면 &quot;NO&quot; 를 출력한다.</p>

### 제한

<ul>
	<li>-1,000&le; <em>X</em><sub>1</sub>, <em>Y</em><sub>1</sub>, <em>Z</em><sub>1</sub>, <em>X</em><sub>2</sub>, <em>Y</em><sub>2</sub>, <em>Z</em><sub>2&nbsp;&nbsp;</sub>&le;&nbsp;1,000</li>
	<li><em>X</em><sub>1</sub>, <em>Y</em><sub>1</sub>, <em>Z</em><sub>1</sub>, <em>X</em><sub>2</sub>, <em>Y</em><sub>2</sub>, <em>Z</em><sub>2</sub>는 모두 정수</li>
	<li>1 &le;&nbsp;<em>N &le;&nbsp;</em>100</li>
	<li>1 &le;&nbsp;<em>K &le;&nbsp;</em>100</li>
</ul>