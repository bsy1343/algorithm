# [Gold V] 새트리 - 3652

[문제 링크](https://www.acmicpc.net/problem/3652)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 208, 정답: 108, 맞힌 사람: 98, 정답 비율: 69.014%

### 분류

수학, 재귀

### 문제 설명

<p>새트리는 무한 이진 트리이고, 첫 5레벨은 다음과 같이 생겼다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3652.%E2%80%85%EC%83%88%ED%8A%B8%EB%A6%AC/09bec388.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/3652.%E2%80%85%EC%83%88%ED%8A%B8%EB%A6%AC/09bec388.png" data-original-src="https://www.acmicpc.net/upload/images/bt.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:240px; width:564px" /></p>

<p>새트리의 각 노드는 다음과 같이 재귀적으로 정의할 수 있다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3652.%E2%80%85%EC%83%88%ED%8A%B8%EB%A6%AC/a43046ae.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/3652.%E2%80%85%EC%83%88%ED%8A%B8%EB%A6%AC/a43046ae.png" data-original-src="https://www.acmicpc.net/upload/images/bd.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:85px; width:247px" /></p>

<p>여기서 bird는 완전 트리를 의미하고, bird+1은 트리의 모든 분수에 1를 더하는 것을 의미하고, 1/bird는 트리의 모든 분수를 뒤집는 것을 의미한다.</p>

<p>놀랍게도 트리에는 모든 유리수가 딱 한 번씩 등장한다. 따라서, 모든 기약분수는 유일한 경로가 있다. 경로는 왼쪽 자식노드로 갈 때는 L, 오른쪽으로 갈 때는 R로 표현한다. 예를 들어, 2/5는 LRR로 표현할 수 있다.</p>

<p>기약분수가 주어졌을 때, 루트에서 그 노드까지의 경로를 L과 R로 표현하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 a와 b가 &#39;/&#39;로 구분되어 주어진다. a는 기약분수의 분자, b는 분모이며, a와 b가 동시에 1인 경우는 없다. 또한, gcd(a,b) = 1을 만족한다. (1 &le; a,b &le; 10<sup>9</sup>)&nbsp;경로의 길이는 10,000을 넘지 않는다.</p>

### 출력

<p>첫째 줄에 루트에서 입력으로 주어진 기약분수까지 가는 경로를 출력한다.&nbsp;</p>