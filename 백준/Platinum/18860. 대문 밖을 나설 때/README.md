# [Platinum II] 대문 밖을 나설 때 - 18860

[문제 링크](https://www.acmicpc.net/problem/18860)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 68, 정답: 29, 맞힌 사람: 24, 정답 비율: 45.283%

### 분류

구현, 다이나믹 프로그래밍, 그리디 알고리즘, 트리, 시뮬레이션

### 문제 설명

<p>대문 밖을 나설 때 욱제는 깨달았다. 석유 관련주 주식을 <em><strong>풀매수</strong></em> 해놓고 그냥 나왔다는 것을! 하지만 열차 시간이 다가오기 때문에 욱제는 눈에서 석유를&nbsp;흘리는 것 외에 아무것도 할 수 없었다.</p>

<p>욱제네 집&nbsp;대문 아래 지하에는 <a href="https://www.acmicpc.net/problem/17261">과거에 건설한 석유 탱크</a>가 있다.&nbsp;각 용량이 W<sub>i</sub>인 N개의 탱크들이 N - 1개의 파이프를 통해 포화&nbsp;이진 트리&nbsp;형태로 연결되어 있다. 탱크는 <strong>정수 단위</strong>의 석유만 저장할 수 있다. 자식 탱크가 없는 모든 잎 탱크에는 석유를 끌어 올리는 펌프가 연결되어 있다.&nbsp;작동을 시작한 펌프는 매 정수 시각마다 1만큼의 석유를 끌어 올린다. 단, <strong>작동을 시작한 시각에는 석유가 차오르지 않는다</strong>. 시각 T에 작동을 시작했으면 시각 T + 1부터 석유가 차오른다.</p>

<p style="text-align: center;"><img src="%EB%B0%B1%EC%A4%80/Platinum/18860.%E2%80%85%EB%8C%80%EB%AC%B8%E2%80%85%EB%B0%96%EC%9D%84%E2%80%85%EB%82%98%EC%84%A4%E2%80%85%EB%95%8C/3d316bf3.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/18860.%E2%80%85%EB%8C%80%EB%AC%B8%E2%80%85%EB%B0%96%EC%9D%84%E2%80%85%EB%82%98%EC%84%A4%E2%80%85%EB%95%8C/3d316bf3.png" data-original-src="https://upload.acmicpc.net/0642b55a-1ad7-4f2f-a2a8-175ae9d378d9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 600px; height: 555px;" /></p>

<p style="text-align: justify;">자식 탱크에 석유가 가득 차면 부모 탱크로 석유가 넘쳐 오른다. 만약 어떤 자식 탱크로부터 석유가 올라왔는데 다른 자식 탱크는 아직 가득 차지 않았다면, 석유는 자연스럽게 다른 자식 탱크로 흘러 들어가게 된다. (욕조에 하수구가 두 개 있고 한 하수구에서 물이 역류했을 때를 생각하면 된다.) 두 자식 탱크가 가득 차면, 그때부터 부모 탱크에 석유가 채워지기 시작한다.</p>

<p style="text-align: center;"><img src="%EB%B0%B1%EC%A4%80/Platinum/18860.%E2%80%85%EB%8C%80%EB%AC%B8%E2%80%85%EB%B0%96%EC%9D%84%E2%80%85%EB%82%98%EC%84%A4%E2%80%85%EB%95%8C/18d88526.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/18860.%E2%80%85%EB%8C%80%EB%AC%B8%E2%80%85%EB%B0%96%EC%9D%84%E2%80%85%EB%82%98%EC%84%A4%E2%80%85%EB%95%8C/18d88526.png" data-original-src="https://upload.acmicpc.net/04067c44-6304-43fb-80ae-2024c239afbb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 527px; width: 600px;" /></p>

<p style="text-align: justify;">최초에 모든 연료 탱크는 비어 있고, 모든 펌프는 멈춰있다. 펌프는 오래되어서 기름칠이 되어야 작동을 시작한다. 놀랍게도, 시각 0에 욱제 눈에서 흘린 석유가&nbsp;어떤 펌프 하나를 작동시켰다. 어떤 탱크의 석유가 넘쳐서 다른 펌프에 도달하면 그 펌프가 즉시 작동하기 시작한다.</p>

<p style="text-align: justify;">파이프를 통해 석유가 이동하는데 걸리는 시간은 0이라고 하자. 가장 위에 있는 꼭대기 탱크의 번호는 1이고, 부모 탱크 번호가 N일 때 좌우 자식 탱크 번호는 각 2 &times; N, 2 &times; N + 1이다.</p>

<p style="text-align: justify;">수찬이는 욱제가 훈련소에 간 틈을 타 욱제의 석유를 꿀꺽하려고 준비하고 있다. 수찬이는 탱크가 가득 차서&nbsp;유전이 터지는 시각이&nbsp;언제인지 궁금해졌다. 하지만 탱크의 용량도 제각각이고, 석유가 어디로 어떻게 흘러갈 지 모르기 때문에 모든 탱크가 가득 차는 시각은 유일하게 결정되지 않을 수 있다.</p>

<p style="text-align: justify;">수찬이를 위해 유전이 터지는(모든 탱크의 용량이 가득 차는)&nbsp;가장 빠른 시각을 계산해주자.</p>

### 입력

<p>첫째&nbsp;줄에 탱크의 개수 N이 주어진다. 양의 정수 k가 존재하여&nbsp;N = 2<sup>k</sup> - 1이 성립한다.</p>

<p>둘째 줄에 N개의&nbsp;탱크&nbsp;용량 W<sub>1</sub>, ..., W<sub>N</sub>이 주어진다.</p>

### 출력

<p>탱크 전체에 석유가 가득 차는 가장 빠른 시각을 출력한다.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;N &le; 262,143</li>
	<li>1 &le;&nbsp;W<sub>i</sub>&nbsp;&le; 10<sup>8</sup>&nbsp;(1&nbsp;&le;&nbsp;i&nbsp;&le; N)</li>
</ul>

### 힌트

<p>석유가 정수 단위로만 저장될 수 있음에 유의하라. 예를 들어, 4만큼 넘친 석유가 1, 1, 2로 나누어져 3개의 탱크로 흘러들 수는 있지만 0.5, 1.0, 2.5로 나누어지는 것은 불가능하다.</p>

<p>시각 0에 어떤 하나의 펌프가 작동되기 시작하므로, 석유가 차오르기 시작하는 시각은 1이다.</p>

<p><strong>처음으로 작동되는 펌프가 무엇인지에 따라 모든 탱크가 가득 차는 시각이 달라질 수 있음에 유의하라.</strong></p>