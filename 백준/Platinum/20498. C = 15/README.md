# [Platinum II] C = 15 - 20498

[문제 링크](https://www.acmicpc.net/problem/20498)

### 성능 요약

시간 제한: 1.515 초, 메모리 제한: 1515 MB

### 통계

제출: 160, 정답: 41, 맞힌 사람: 29, 정답 비율: 21.324%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍, 트리에서의 전방향 다이나믹 프로그래밍

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20498.%E2%80%85C%E2%80%85%3D%E2%80%8515/bee09be8.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/20498.%E2%80%85C%E2%80%85%3D%E2%80%8515/bee09be8.png" data-original-src="https://upload.acmicpc.net/97cca79e-a2c1-4001-a927-c411266f5e2e/-/crop/1973x444/0,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 800px; height: 180px;" /></p>

<p>위 메일은 실제로 욱제가 교수님께 보냈던 메일이며, 미적분을 컴퓨터수학으로 잘못 적어서 정정 메일을 보냈고, 정정 메일에는 수업 시간을 잘못 적어서 보냈다는 비하인드가 있다.</p>

<p>욱제는 중간고사에서 11점을 받았다. 기말고사에서 4점 이상을 받아 도합 <strong>15점</strong>을 넘지 못하면 F, 넘으면 C를 받게 된다. (만점은 160점이다.) (실화를 기반으로 한 이야기이다.)</p>

<p>욱제가 공부해야 할 문제 유형은 총 $2^{k}-1$개가 있다. 각 유형 사이의 관계는 노드에 가중치가 있는 포화이진트리로 표현된다. 각 노드는 유형, 노드의 가중치는 유형의 중요도를 의미한다. 루트 노드의 번호는 $1$이며, $N$번 노드의 좌우 자식 노드는 각 $N \times 2$, $N \times 2+1$이다.</p>

<p>욱제는 단 한 번, 정확히 $k$개의 연속된 리프 노드에 ★<strong>족보의 힘</strong>★을 사용할 수 있다. $[L, R]$ 구간의 리프 노드에 ★<strong>족보의 힘</strong>★을 사용하면, $LCA(L, R)$에서 출발해 $L, L+1, ..., R-1, R$ 각각으로 도착하는 단순 경로들에 포함된 모든 노드를 하나의 노드로 합쳐버릴 수 있다! 합쳐진 노드의 가중치는 기존 노드들의 가중치 합이다. 기존 노드들에 연결되어 있던 간선들은 모두 합쳐진 노드로 연결된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20498.%E2%80%85C%E2%80%85%3D%E2%80%8515/023b697a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/20498.%E2%80%85C%E2%80%85%3D%E2%80%8515/023b697a.png" data-original-src="https://upload.acmicpc.net/9e56bd49-0ae1-41dc-9f57-1d8f06edb480/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 277px; height: 500px;" /><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20498.%E2%80%85C%E2%80%85%3D%E2%80%8515/202d5031.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/20498.%E2%80%85C%E2%80%85%3D%E2%80%8515/202d5031.png" data-original-src="https://upload.acmicpc.net/85380d62-d948-4724-ac92-5a5bda1d2ad7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 304px; height: 500px;" /><br />
&nbsp;</p>

<p>욱제에게 남은 시간은 제한적이다. 욱제는 임의로 두 노드를 골라, 두 노드 사이의 단순 경로 내에 있는 모든 과목을 공부할 것이다. 욱제는 공부한 과목들의 중요도 합이 최대가 되도록 하고 싶다. ★<strong>족보의 힘</strong>★은 필요에 따라 사용하지 않을 수도 있다.</p>

<p>당신은 욱제의 학부모이다. 철부지 아들을&nbsp;위해 ★<strong>족보의 힘</strong>★을 적절히 사용하고, 단순 경로를 잘 골라서 공부한 과목들의&nbsp;중요도&nbsp;합을 최대로 만들어 주자.</p>

### 입력

<p>첫째 줄에 유형의 개수 $N$이 주어진다.</p>

<p>둘째 줄에 $N$개 유형의 중요도 $W_{i}$이 1번 유형부터 순서대로 주어진다.</p>

### 출력

<p>중요도의 최대 합을 출력한다.</p>

### 제한

<ul>
	<li>$1 \le N \le 262\,143 = 2^{18} - 1$</li>
	<li>양의 정수 $k$에 대해, $N = 2^{k}-1$이 항상 성립한다.</li>
	<li>$1 \le W_{i} \le 100\,000\,000$</li>
</ul>

### 힌트

<p>욱제는 결국 시험 공부를 하나도 안 하고 4점을 넘어서 C+을 받았다.</p>