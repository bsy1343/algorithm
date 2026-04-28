# [Platinum I] 이제 다시 시작이다 - 18865

[문제 링크](https://www.acmicpc.net/problem/18865)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 75, 정답: 37, 맞힌 사람: 25, 정답 비율: 43.860%

### 분류

자료 구조, 기하학, 포함 배제의 원리, 수학, 세그먼트 트리

### 문제 설명

<p>논산에 도착한 욱제는 <a href="https://www.acmicpc.net/problem/17423">DJ욱제였던 시절</a>의 기억들을 회상하고 있다.</p>

<p>욱제는 훈련소에서 새로운 시작을 하기 전에 마지막으로 자신의 예술을 알리기 위한 광역디제잉을 준비했다.</p>

<ol>
	<li>논산은 2차원 격자로 표현되며, 두 점 (x<sub>1</sub>, y<sub>1</sub>), (x<sub>2</sub>, y<sub>2</sub>)의 거리는 | x<sub>1</sub>&nbsp;- x<sub>2</sub>&nbsp;| + | y<sub>1</sub>&nbsp;- y<sub>2</sub>&nbsp;|이다.</li>
	<li>훈련소는 축에 평행한 직사각형으로,&nbsp;왼쪽 아래 끝점의 좌표는 (sx, sy)이며,&nbsp;오른쪽 위&nbsp;끝점의 좌표는 (ex, ey)이다.</li>
	<li>볼륨이 V이면, 각&nbsp;스피커의 음악은 그 스피커와의 거리가 V 이하인 모든 점에서 들을 수 있다.</li>
	<li>볼륨은 정수 단위로만 조작 가능하며, <strong>모든 스피커의 볼륨은 같다.</strong></li>
	<li>『 <strong>예술은 볼륨이다.</strong> 』</li>
</ol>

<p>욱제는 예술의 경지에 다다르기 위한 실험으로&nbsp;다음과 같은 쿼리를 Q개 준비했다.</p>

<ul>
	<li>1 x<sub>i</sub>&nbsp;y<sub>i</sub>&nbsp;: (x<sub>i</sub>, y<sub>i</sub>)에 스피커를 하나 설치한다.&nbsp;욱제는 아직 훈련소에&nbsp;들어가지 않았기 때문에&nbsp;<strong>모든 스피커는&nbsp;훈련소의 오른쪽 위 바깥에만 설치된다</strong>. 즉,&nbsp;ex &lt; x<sub>i</sub>, ey &lt; y<sub>i</sub> 가 항상 만족된다.</li>
	<li>2 V<sub>i</sub>&nbsp;: 현재까지 설치된 스피커의 개수가 k개이고, 이들&nbsp;스피커의 볼륨이 모두 V<sub>i</sub>일 때, (훈련소 내부에서&nbsp;1번 스피커의 음악이&nbsp;들리는 영역의 넓이) +&nbsp;(훈련소 내부에서 2번 스피커의 음악이&nbsp;들리는 영역의 넓이) + ... + (훈련소 내부에서 k번 스피커의 음악이&nbsp;들리는 영역의 넓이) 를 계산하라. 이 값이 정수가 아닐 수도 있으므로, <strong>계산한&nbsp;값의 2배를 출력하라</strong>. 합집합이 아니기 때문에, 한 영역에서 여러 스피커의 소리를 들을 수 있으면 여러 번 센다는 것에 유의하라.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18865.%E2%80%85%EC%9D%B4%EC%A0%9C%E2%80%85%EB%8B%A4%EC%8B%9C%E2%80%85%EC%8B%9C%EC%9E%91%EC%9D%B4%EB%8B%A4/2d25793e.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/18865.%E2%80%85%EC%9D%B4%EC%A0%9C%E2%80%85%EB%8B%A4%EC%8B%9C%E2%80%85%EC%8B%9C%EC%9E%91%EC%9D%B4%EB%8B%A4/2d25793e.png" data-original-src="https://upload.acmicpc.net/3a8e1038-286b-44d5-9608-ec8c6800ad24/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 650px; height: 447px; margin-left: 0px; margin-right: 0px;" /></p>

<p>실험들을 해결하고 욱제의 예술(볼륨)을 온 몸으로 느껴보자!</p>

### 입력

<p>첫째 줄에 훈련소를 나타내는 직사각형의 왼쪽 아래 끝점 (sx, sy)와&nbsp;오른쪽 위&nbsp;끝점 (ex, ey)가 주어진다.</p>

<p>둘째 줄에 쿼리의 개수 Q가 주어진다.</p>

<p>셋째 줄부터 Q개의 줄에 걸쳐, i + 2번째 줄에 i번째 쿼리가 주어진다. 2번 쿼리는 한 번 이상 등장한다.</p>

### 출력

<p>2번 쿼리가 주어질 때마다&nbsp;한 줄에 하나씩 답을 출력한다. 이 값은 항상 정수이다.</p>

### 제한

<ul>
	<li>-100,000 &le;&nbsp;sx&nbsp;&lt;&nbsp;ex&nbsp;&le;&nbsp;0</li>
	<li>-100,000 &le;&nbsp;sy&nbsp;&lt;&nbsp;ey&nbsp;&le; 0</li>
	<li>1 &le;&nbsp;Q &le;&nbsp;250,000</li>
	<li>1 &le;&nbsp;x<sub>i</sub>, y<sub>i</sub>&nbsp;&le;&nbsp;100,000</li>
	<li>1 &le;&nbsp;V<sub>i</sub>&nbsp;&le;&nbsp;400,000</li>
	<li>ex &lt; x<sub>i</sub>, ey &lt; y<sub>i</sub></li>
</ul>