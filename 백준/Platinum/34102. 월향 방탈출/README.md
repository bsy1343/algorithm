# [Platinum III] 월향 방탈출 - 34102

[문제 링크](https://www.acmicpc.net/problem/34102)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 91, 정답: 20, 맞힌 사람: 13, 정답 비율: 27.660%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 애드 혹, 트리, 해 구성하기

### 문제 설명

<p><strong>이 문제는 투 스텝 문제입니다.</strong></p>

<p>월간 향유회는 사업을 확장하기 위해 방탈출 카페를 만들었다. 카페에는 PS를 소재로 하는 <strong><span style="color:#FFC107;">월향</span> 방탈출</strong>이라는 테마가 있는데, 평소 PS와 방탈출을 모두 좋아하던 도훈이와 준혁이는 함께 <strong><span style="color:#FFC107;">월향</span> 방탈출</strong> 테마를 공략해보기로 했다. 방을 탈출하기 위한 미션은 다음과 같다.</p>

<ul>
	<li><strong><span style="color:#FFC107;">월향</span> 방탈출</strong> 테마는 두 개의 방 A와 B로 이루어져 있다. 도훈이와 준혁이는 각자 방 A와 방 B에 들어간다.</li>
	<li>방 A에는 <strong><span style="color:#D81B60;">빨강</span></strong>, <strong><span style="color:#1E88E5;">파랑</span></strong>, <strong><span style="color:#004D40;">초록</span></strong> 색연필과 <strong>최대 10자리</strong>의 정수 비밀번호가 적힌 쪽지, 그리고 그래프 하나가 놓여있다. 주어지는 그래프는 아래의 명세를 모두 만족하며, 그래프의 간선은 모두 색칠되지 않은 상태이다.</li>
	<li>도훈이는 방 A에 놓인 그래프의 모든 간선을 세 가지 색 중 원하는 색으로 색칠한 뒤 제출한다.</li>
	<li>제출한 그래프는 방 B에 있는 준혁이에게 전달된다.</li>
	<li>준혁이는 전달받은 그래프를 보고서 도훈이에게 주어진 비밀번호를 유추해서 맞혀야 한다.</li>
</ul>

<p>방 A에 제공될 그래프의 명세는 다음과 같다.</p>

<ul>
	<li>정점이 $100$개다.</li>
	<li>간선에 방향성이 없다.</li>
	<li>중복된 간선이 없다.</li>
	<li>간선이 잇는 두 정점은 서로 다르다.</li>
	<li>간선이 $2\,000$개 이하다.</li>
	<li>모든 정점의 차수는 $20$ 이상이다.</li>
</ul>

<p>도훈이와 준혁이는 지금까지 방탈출에 실패해 본 적이 없다. 이 기록이 깨지지 않도록 도훈이는 그래프의 간선을 잘 색칠해야 하고, 준혁이는 그래프를 보고 비밀번호를 잘 맞혀야 한다.</p>

### 입력

<p>당신의 프로그램은 채점 데이터 하나당 총 두 번 실행된다. 당신은 하나의 소스코드에 두 가지 실행 과정을 모두 구현해야 한다.</p>

<p>모든 입력의 첫 줄에는 방을 구분하는 문자열 $S$가 주어진다. $(S \in \{ $<span style="color:#e74c3c;"><font face="monospace">A</font></span>$, $<span style="color:#e74c3c;"><font face="monospace">B</font></span>$\})$</p>

<p>만약 $S$가 <span style="color:#e74c3c;"><code>A</code></span>라면 첫 번째 단계를 수행해야 하고, $S$가 <span style="color:#e74c3c;"><code>B</code></span>라면 두 번째 단계를 수행해야 한다.</p>

### 출력

