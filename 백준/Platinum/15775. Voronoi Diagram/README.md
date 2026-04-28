# [Platinum III] Voronoi Diagram - 15775

[문제 링크](https://www.acmicpc.net/problem/15775)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 300, 정답: 82, 맞힌 사람: 74, 정답 비율: 28.462%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15775/voronoi.png" style="width: 500px; height: 500px;" /></p>

<p style="text-align: center;">사진: 유클리드 좌표계에서 20개의 점으로 만든 Voronoi Diagram. 출처: Wikipedia</p>

<p>평면 위에 있는 크기 <em>n</em>의 점 집합을 생각하자. 이 점 집합의 <strong>Voronoi Diagram</strong>은, 평면 상의 점을 &quot;어떤 점과 가장 가까운가?&quot; 에 대한 기준으로 분할한 그림을 뜻한다. 예를 들어, 위 사진에서 평면 상의 모든 위치는, 그 위치와 가장 가까운 검은 점에 따라서 색이 칠해져 있다. Voronoi Diagram은 O(<em>n</em>&nbsp;log(<em>n</em>))에 계산하는 알고리즘이 알려져 있지만, 매우 어렵고 복잡한 알고리즘으로 악명이 높다.&nbsp;</p>

<p>모 대회에서 Voronoi Diagram에 대한 문제를 풀지 못한 민규는, 그 충격으로 인해서 매일 매일을 술과 함께 보내고 있었다. 어느 날 오후, 민규는 여느 때와 같이 낮술을 하고 있다가, 매우 천재적인 Voronoi Diagram 알고리즘을 발견하였다! 민규는 이에 관한 논문을 쓰기 전에 2018 KAIST RUN Spring Contest 에 관련된 문제를 출제하여서 만점자의 출현을 막으려 한다.&nbsp;</p>

<p>민규의 Voronoi Diagram 알고리즘은 왜 천재적일까? 보통 Voronoi Diagram은 평면에서만 적용되는데, 민규의 Voronoi Diagram은 더 일반화된 구조인 그래프에서 적용되기 때문이다. 정점이 <em>N</em>개이고, 양의 가중치가 있는 간선이 <em>M</em>개 있는 연결 그래프를 생각하자. 이 그래프에서 크기 <em>K</em>의 정점 집합이 주어졌을 때, 이 점 집합의 &quot;Voronoi Diagram&quot; 은 이 그래프의 모든 간선 상의 위치에 대해서, &quot;정점 집합에 있는 어떤 점과 가장 가까운가&quot; 에 대한 기준으로 분할한 그림을 뜻한다. 만약 같은 거리의 점이 여러 개 있으면, 이들 중 가장 정점의 번호가 작은 정점을 기준으로 한다.&nbsp;</p>

<p>가중치 있는 그래프가 주어졌을 때, 당신은 각각의 점에 대해서, &quot;Voronoi Diagram&quot;에서 해당 점과 가장 가깝게 표현된 간선의 길이를 모두 더한 값을 출력해야 한다. 이 문제를 풀고, 민규보다 먼저 논문을 써서 민규의 코를 납작하게 해주자!</p>

### 입력

<p>첫 번째 줄에 정점의 개수 <em>N</em>, 간선의 개수 <em>M</em>이 공백으로 구분되어 주어진다.&nbsp;</p>

<p>이후 <em>M</em>개의 줄의 <em>i</em>번째 줄엔 간선이 잇는 두 정점의 번호 <em>s<sub>i</sub></em>, <em>e<sub>i</sub></em>와, 간선의 가중치 <em>w<sub>i</sub></em>가 세 개의 정수로 공백으로 구분되어 주어진다.&nbsp;</p>

<p>다음 줄에 정점 집합의 크기 <em>K</em>가 주어진다.</p>

<p>다음 줄에 <em>K</em>개의 서로 다른 정수 <em>a<sub>i</sub></em>가 오름차순으로 공백으로 구분되어 주어진다. 정점 집합을 이루고 있는 정점들의 번호를 뜻한다.&nbsp;</p>

<p>입력으로 주어진 그래프는 연결그래프 임이 보장된다. 즉, 임의의 정점에서 임의의 정점으로 가는 경로가 존재한다.&nbsp;</p>

### 출력

<p><em>K</em>개의 줄에 걸쳐서 하나의 실수를 출력한다. <em>i</em>번째 줄에는, <em>a<sub>i</sub></em>&nbsp;번 정점을 가장 가까운 정점으로 가지는 길이의 합을 출력하라.&nbsp;</p>

<p>모든 출력은 소수점 둘째 자리에서 반올림하여서 출력하여야 한다. 실수 오차 관리에 초점을 맞춘 최근 ACM-ICPC World Finals의 경향에 맞춰서, 출력 시 <strong>일체의 오차도 허용되지 않는다</strong>.</p>

### 제한

<ul>
	<li>1 &le; <em>N</em>,&nbsp;<em>M</em> &le; 250,000</li>
	<li>1 &le; <em>s<sub>i</sub></em>, <em>e<sub>i</sub></em> &le; N</li>
	<li>1 &le; <em>w<sub>i</sub></em> &le; 10<sup>9</sup></li>
	<li>1 &le; <em>K</em> &le; <em>N</em></li>
	<li>1 &le; <em>a<sub>i</sub></em> &le; <em>N</em></li>
	<li>주어진 그래프는 연결그래프 이다.</li>
</ul>

### 힌트

<p>예제에 대한 그림은 다음과 같다.:</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15775/img1.png" style="width: 391px; height: 351px;" /></p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15775/img2.png" style="width: 600px; height: 379px;" /></p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15775/img3.png" style="width: 429px; height: 459px;" /></p>