# [Platinum V] 지폐가 넘쳐흘러 - 17422

[문제 링크](https://www.acmicpc.net/problem/17422)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 367, 정답: 106, 맞힌 사람: 81, 정답 비율: 29.242%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p style="text-align: center;"><em>💸&nbsp;DJ욱제는 디제잉으로 큰 돈을 벌어서 <strong>FLEX</strong> 하고 있다.&nbsp;💸</em></p>

<p><em>DJ욱제</em>는 오늘 파티에서&nbsp;<strong><em>FLEX</em></strong> 하려고 한다.&nbsp;<em>DJ욱제</em>는&nbsp;각 <em>W<sub>i</sub></em>개의 지폐가&nbsp;들어 있는 <em>N</em>개의 금고를 포화 이진 트리(노드가&nbsp;2<em><sup>k</sup></em>-1개인 이진 트리, <em>k</em>는 1 이상의 자연수)&nbsp;형태로 연결했다. 가장 위에 있는 꼭대기 금고의 번호는 1이고, <i>N</i>번 금고의 좌우 자식 금고 번호는 각 2&times;<em>N</em>,&nbsp;2&times;<i>N</i>+1이다. <em>DJ욱제</em>는 이 트리를 가지고 놀다가, 가장 많은 지폐가&nbsp;들어 있는 금고를 털어서 <strong><em>FLEX</em></strong>&nbsp;할 작정이다.</p>

<p><em>DJ욱제</em>는 <em>Q</em>번의 놀이를 할 것이다. 매 놀이마다, 한 금고에 들어 있는 지폐 개수를 임의로 바꾸고&nbsp;아래와 같이 행동한다.</p>

<ol>
	<li>임의의 금고(지폐 개수를 바꾼 금고가 아니어도 됨)를 하나 선택해서, 그 금고를 루트 금고로 잡는다.</li>
	<li>1에서 선택한 루트 금고를 맨 위로 끌어 올리고, 나머지 금고들의 높이를 다시 맞춰서 루트 금고와의 거리가 같은 금고들이 같은 높이에 위치하도록 한다.&nbsp;이때, 금고끼리의 연결은 끊어지거나 변하지&nbsp;않는다.</li>
	<li>모든 금고의 문을 동시에 연다. 금고에 들어 있던 지폐들은 연결된 자식 금고들 중 어딘가로 떨어진다. 더 이상 떨어질 곳이 없다면, 그 금고에 쌓인다.</li>
	<li>지폐가 가장 많이 쌓인 금고를 확인하고, 그 금고의&nbsp;지폐&nbsp;개수를 센다.</li>
	<li>1번 과정을 실행하기 전으로 트리를 복원한다.&nbsp;놀이에서 바꾼 지폐 개수는 그 다음 놀이에서도 계속 유지된다.</li>
</ol>

<p><em>DJ욱제</em>는 최대한 많은 돈을 <strong><em>FLEX</em></strong> 하고 싶지만, 똑같은 금고를 루트로 삼더라도 지폐가&nbsp;어디로 어떻게 떨어지느냐에 따라서&nbsp;금고에 쌓이는 지폐의 양이 달라질 수 있다. 그래서&nbsp;<em>DJ욱제</em>는 온 우주의 힘을 믿고 간절히 기도하기로 했다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17422.%E2%80%85%EC%A7%80%ED%8F%90%EA%B0%80%E2%80%85%EB%84%98%EC%B3%90%ED%9D%98%EB%9F%AC/f222eab4.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17422.%E2%80%85%EC%A7%80%ED%8F%90%EA%B0%80%E2%80%85%EB%84%98%EC%B3%90%ED%9D%98%EB%9F%AC/f222eab4.png" data-original-src="https://upload.acmicpc.net/4acd5ad8-1a7c-401f-9e5b-d9aa4d1ba34f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 909px; height: 460px;" /></p>

<p><em>DJ욱제</em>와 함께, <em>Q+1</em>번에 걸쳐, 루트 금고를 잘 고르고 지폐들이&nbsp;최적으로 잘 떨어졌을 때, 지폐가&nbsp;가장 많이 쌓이는 금고에는 얼마만큼의 지폐가&nbsp;쌓이게 되는지 알아보자!</p>

### 입력

<p>첫째 줄에 금고의 개수 <em>N</em>이 주어진다. 양의 정수 <em>k</em>에 대해, <em>N</em> = 2<em><sup>k</sup></em>-1이 항상 성립한다.</p>

<p>둘째 줄에 금고에 들어 있는 지폐의 개수&nbsp;<em>W<sub>i</sub></em>가&nbsp;1번 금고부터 순서대로 주어진다.</p>

<p>셋째 줄에 놀이의 횟수 <em>Q</em>가 주어진다.</p>

<p>이후 <em>Q</em>개의 줄에 걸쳐&nbsp;<em>i</em>와 <em>D<sub>i</sub></em>가 주어진다. 이는 <em>i</em>번 금고의 지폐 개수를 <em>D<sub>i</sub></em>로 변경한다는 의미이다.</p>

### 출력

<p>첫째 줄에 최초의&nbsp;트리에서 하나의 금고에&nbsp;쌓을 수 있는 지폐의 최대 개수를 출력한다.</p>

<p>이후 <em>Q</em>개의 줄에 걸쳐, <em>i</em>번째 놀이에서&nbsp;하나의 금고에 쌓을 수 있는 지폐의 최대 개수를 출력한다.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<em>N</em> &le; 262,143</li>
	<li>0 &le;&nbsp;<em>W<sub>i</sub></em>&nbsp;&le; 100,000,000</li>
	<li>0 &le;&nbsp;<em>Q</em>&nbsp;&le; 100,000</li>
	<li>1 &le; <em>i</em>&nbsp;&le; <em>N</em></li>
	<li>0 &le; <em>D<sub>i</sub></em>&nbsp;&le; 100,000,000</li>
</ul>