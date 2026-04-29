# [Gold II] 이진트리 그리기 - 2366

[문제 링크](https://www.acmicpc.net/problem/2366)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 6, 맞힌 사람: 5, 정답 비율: 38.462%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>그래프를 주어진 제약조건을 만족하도록 평면상에 그리는 것은 VLSI에서 회로를 배선하거나 정보 시스템의 구조를 다이어그램으로 나타내어 분석하는데 이용된다. 이 문제에서는 주어진 이진트리(binary tree)를 다음 조건을 만족하도록 이차원 격자구조에 그리는 문제를 고려한다.&nbsp;</p>

<ol>
	<li>루트는 격자상의 최상단 가장 왼쪽 모서리에 위치한다.</li>
	<li>각 정점에 대해 하나의 자식 정점은 수평방향 오른쪽, 다른 자식 정점은 수직방향 아래쪽의 격자점에 위치한다 (자식정점이 하나인 경우는 둘중 하나의 조건을 만족).</li>
	<li>각 정점에 대해 두 자식 정점을 루트로 하는 서브트리를 둘러싼 두 직사각형은 서로 겹치지 않는다.</li>
</ol>

<p>예를 들어, 다음은 주어진 이진트리를 위의 제약 조건을 만족하도록 그린 것이다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/2366.%E2%80%85%EC%9D%B4%EC%A7%84%ED%8A%B8%EB%A6%AC%E2%80%85%EA%B7%B8%EB%A6%AC%EA%B8%B0/105c468d.png" data-original-src="https://boja.mercury.kr/assets/problem/2366-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:146px; width:170px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/2366.%E2%80%85%EC%9D%B4%EC%A7%84%ED%8A%B8%EB%A6%AC%E2%80%85%EA%B7%B8%EB%A6%AC%EA%B8%B0/510029ec.png" data-original-src="https://boja.mercury.kr/assets/problem/2366-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:145px; width:176px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/2366.%E2%80%85%EC%9D%B4%EC%A7%84%ED%8A%B8%EB%A6%AC%E2%80%85%EA%B7%B8%EB%A6%AC%EA%B8%B0/14ec7d3e.png" data-original-src="https://boja.mercury.kr/assets/problem/2366-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:181px; width:134px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/2366.%E2%80%85%EC%9D%B4%EC%A7%84%ED%8A%B8%EB%A6%AC%E2%80%85%EA%B7%B8%EB%A6%AC%EA%B8%B0/4e919231.png" data-original-src="https://boja.mercury.kr/assets/problem/2366-4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:182px; width:130px" /></p>

<p>왼쪽부터 이진트리, 그리기-1, 그리기-2, 그리기-3이다.</p>

<p>또, 위와 같이 이진 트리를 그릴 때는 그리기에 필요한 면적이 중요한 평가 요소가 된다. 어떤 그리기의 면적은 그리기에 필요한 이차원 격자의 가로크기와 세로크기를 곱한 값이다. 그러므로, 위의 그림에서 &lt;그리기-1&gt;의 면적은 16이며 &lt;그리기-2&gt;와 &lt;그리기-3&gt;의 면적은 15이다. 이진 트리가 주어질 때 위의 제약 조건을 만족하는 그리기 중 면적을 최소로 하는 그리기의 면적을 출력하는 프로그램을 작성하시오.</p>

### 입력

<p>입력의 첫째 줄에는 이진트리의 정점수를 나타내는 n이 주어진다(1 &le; n &le; 100). 둘째 줄에는 n개의 정수로 구성된 수열이 주어진다. 주어지는 정수 수열은 이진트리를 전위(preorder) 순회한 순서가 1, 2, 3, . . . ,n 이라고 가정했을 때, 그 이진트리를 중위순회한 순서를 나타낸다. 정수 사이에는 빈칸이 하나 있다. 올바른 입력만 주어진다고 가정한다.</p>

### 출력

<p>첫 줄에 최소 면적을 출력한다.</p>