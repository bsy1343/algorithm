# [Gold I] Split the SSHS - 24914

[문제 링크](https://www.acmicpc.net/problem/24914)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB (추가 메모리 없음)

### 통계

제출: 235, 정답: 97, 맞힌 사람: 86, 정답 비율: 49.711%

### 분류

자료 구조, 트리, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>서울의 명소 서울과학고등학교에는 1부터 <em>N</em>까지의 번호가 매겨진 건물이 <em>N</em> - 1 개의 길로 연결되어 있다. 단, 서울과학고등학교는 어떤 두 건물 사이도 연결된 길만을 이용하여 오갈 수 있다. 다음은 유효한 서울과학고등학교이다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/3563c16e-8118-4798-b94e-0712ac0de799/-/preview/" /></p>

<p>정후는 서울과학고등학교를 여러 조각으로 분열시킨 후 서울과학고등학교를 지배할 계획을 세우고 있다.&nbsp;서울과학고등학교의 각 길은 <em>M</em> 개의 색 중 정확히 하나의 색으로 칠해져 있으며, 정확히 하나의 조각에 속한다. 어떤&nbsp;두 길이 하나의 건물을 공유하며 같은 색으로 칠해져 있다면 두 길은&nbsp;<strong>연결되어 있다</strong>.&nbsp;서로 연결된 길은 같은 조각에 속하고, 연결되지 않은 길은 다른 조각에 속하도록 조각을 나눈다.&nbsp;다음&nbsp;서울과학고등학교는 정확히 세 개의 조각으로 쪼개진다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/6b6268ea-a6ea-4a90-948b-c0a2414a095f/-/preview/" /></p>

<p>정후는 서울과학고등학교에 심어놓은 스파이에게 명령하여&nbsp;길에 색을 <em>Q</em> 번 새로 칠한다. 길을 새로 칠할 때마다&nbsp;서울과학고등학교가 정확히 몇 개의 조각으로 분열하는지&nbsp;정후에게 알려주자.</p>

<p>단, 길의 색을 새로 칠할 때, 이전에 칠해져 있던 색과 같을 수 있음에 주의하라. 새로 칠한 길은 그 길에 다시&nbsp;새로운 색이 칠해지지 않는 한 지워지지 않는다.</p>

### 입력

<p>첫째 줄에 세 정수 <em>N</em>, <em>M</em>, 그리고 <em>Q</em>가 공백으로 구분되어 주어진다. 둘째 줄부터 <em>N</em>째 줄까지 <em>N</em> - 1 개의 줄에 세 정수 <em>u<sub>i</sub></em>, <em>v<sub>i</sub></em>, <em>w<sub>i</sub></em>가 공백으로 구분되어 주어지며, 색 <em>w<sub>i</sub></em>로 칠해진 <em>i</em> 번 길이 <em>u<sub>i</sub></em>&nbsp;번 건물과 <em>v<sub>i</sub></em> 번 건물을 연결함을 나타낸다. <em>N&nbsp;</em>+ 1째 줄부터 <em>N</em> + <em>Q</em>째 줄까지 <em>Q</em> 개의 줄에 두 정수 <em>p<sub>i</sub></em>, <em>t<sub>i</sub></em>가 공백으로 구분되어 주어지며, <em>p<sub>i</sub></em>번 길을 색 <em>t<sub>i</sub></em>로 색칠하라는 명령을 나타낸다.</p>

### 출력

<p><em>Q</em> 개의 줄에 걸쳐, <em>i</em>번째 줄에는 <em>i</em>번째로&nbsp;주어진 명령을 처리한 뒤 조각의 개수를 나타내는 하나의 정수를 출력한다.</p>

### 제한

<ul>
	<li>2 &le;&nbsp;<em>N</em>, <em>M</em> &le; 200,000</li>
	<li>1 &le;&nbsp;<em>Q </em>&le; 100,000</li>
	<li>1 &le; <em>u<sub>i</sub></em> &lt; <em>v<sub>i</sub></em> &le; <em>N</em></li>
	<li>1 &le; <em>w<sub>i</sub></em><sub>,</sub>&nbsp;<em>t<sub>i</sub></em> &le; <i>M</i></li>
	<li><em>i</em> &ne; <em>j</em>이면 <em>u<sub>i</sub></em> &ne; <em>u<sub>j</sub></em> 또는 <em>v<sub>i</sub></em> &ne; <em>v<sub>j</sub></em>.</li>
	<li>1 &le; <em>p<sub>i</sub></em> &le; <em>N</em> - 1</li>
	<li>주어지는 모든 수는 정수이다.</li>
</ul>

### 힌트

<p>이 문제를 풀어서 서울과학고등학교를 쪼개 버리자.</p>