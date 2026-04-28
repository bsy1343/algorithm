# [Gold IV] 띠 정렬하기 - 30644

[문제 링크](https://www.acmicpc.net/problem/30644)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 239, 정답: 191, 맞힌 사람: 164, 정답 비율: 80.788%

### 분류

정렬, 애드 혹, 값 / 좌표 압축

### 문제 설명

<p>숫자가 적힌 종이로 된 띠가 있다. 띠에는 <em>N</em>개의 서로 다른 수가 적혀 있다.<!-- notionvc: 6e6ba896-eee5-47b7-bc20-38f23574e5e6 --></p>

<p style="text-align: center;"><img alt="" height="86" src="%EB%B0%B1%EC%A4%80/Gold/30644.%E2%80%85%EB%9D%A0%E2%80%85%EC%A0%95%EB%A0%AC%ED%95%98%EA%B8%B0/f9cc4246.png" data-original-src="https://u.acmicpc.net/0c5a8b41-304d-4107-871f-401a83917f4a/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202023-10-16%20021251.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="399" /></p>

<p>이때, 이 띠에 적힌 수 사이에 가위질을 하여 하나의 띠를 여러개의 띠로 분리할 수 있으며, 여러개의 띠가 있을 때 각 띠간의 순서를 자유롭게 바꿀 수 있다.</p>

<p style="text-align: center;"><img alt="" height="312" src="%EB%B0%B1%EC%A4%80/Gold/30644.%E2%80%85%EB%9D%A0%E2%80%85%EC%A0%95%EB%A0%AC%ED%95%98%EA%B8%B0/5e17b903.png" data-original-src="https://u.acmicpc.net/c112ef82-a640-466d-ae17-c0b25b4462ae/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202023-10-16%20021302.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="453" /></p>

<p>또한, 각 띠에 대해 띠에 적힌 수를 모두 지우고 원래 적혀있던 수의 역순으로 수를 적을 수 있다.</p>

<p style="text-align: center;"><img alt="" height="195" src="%EB%B0%B1%EC%A4%80/Gold/30644.%E2%80%85%EB%9D%A0%E2%80%85%EC%A0%95%EB%A0%AC%ED%95%98%EA%B8%B0/a4d1569c.png" data-original-src="https://u.acmicpc.net/623e48e0-3823-4760-8421-c412543fe7d8/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202023-10-16%20021313.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="455" /></p>

<p>띠에 적힌 수가 주어질 때, 띠에 적힌 수를 왼쪽부터 오름차순으로 정렬된 상태로 표시하기 위해 필요한 최소한의 가위질 횟수를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫 번째 줄에 띠에 적힌 수의 개수 <em>N</em>이 주어진다.</p>

<p>두 번째 줄에 왼쪽부터 순서대로 띠에 적힌 수 a<sub>1</sub>, a<sub>2</sub>, &hellip; a<sub>N</sub>이 주어진다.</p>

### 출력

<p>띠에 적힌 수들을 왼쪽부터 오름차순으로 표시하기 위해 필요한 가위질 횟수의 최솟값을 출력한다.

### 제한

<ul>
	<li>2 &le; <em>N</em> &le; 200,000</li>
	<li>1 &le; a<sub>i</sub> &le; 10<sup>9</sup></li>
	<li>띠에 적혀있는 수들은 모두 다른 수이다.</li>
</ul>