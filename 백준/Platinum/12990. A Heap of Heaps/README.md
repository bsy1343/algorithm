# [Platinum II] A Heap of Heaps - 12990

[문제 링크](https://www.acmicpc.net/problem/12990)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 28, 맞힌 사람: 25, 정답 비율: 55.556%

### 분류

자료 구조, 정렬, 세그먼트 트리, 머지 소트 트리

### 문제 설명

<p>n개의 자연수로 이루어진 수열이 하나 주어진다. (a<sub>1</sub>, a<sub>2</sub>, &hellip;, a<sub>n</sub>이라고 하자.) 성관이는 이 수열을 이용해 k진 힙을 작성하려고 한다.</p>

<p>k진 힙이란 각 내부 노드가 k개씩의 자식을 가지는 루트 있는 트리를 의미한다. (단, 마지막 내부 노드는 k개보다 작은 자식을 가질 수도 있다.) 구체적으로 말하자면, v번 노드는 k(v-1)+2, k(v-1)+3, &hellip;, kv + 1번 노드를 자식으로 가진다. (단, 해당되는 노드의 번호가 n보다 큰 경우, 그 자식은 없는 것으로 간주한다.)</p>

<p>성관이는 최소 힙의 성질을 깨뜨리는 노드의 개수를 세려고 한다. 즉, 루트 노드가 아닌 어떤 노드 v의 부모 노드 p(v)에 대해, a<sub>v</sub> &lt; a<sub>p(v)</sub>라면, 이것을 최소 힙의 성질을 깨뜨리는 노드라고 생각한다. k = 1~n-1인 모든 경우에 대해, 이런 노드의 개수를 계산하여 출력하는 프로그램을 작성하시오.</p>

### 입력

<p>입력의 첫 번째 줄에는 자연수 n이 주어진다. (1 &le; n &le; 200,000)</p>

<p>다음 줄에는 수열을 이루는 n개의 자연수가 주어진다. (-10<sup>9</sup> &le; a<sub>i</sub> &le; 10<sup>9</sup>)</p>

### 출력

<p>n-1개의 정수를 출력한다. i번째 수는 i진 힙에서 최소 힙의 성질을 깨뜨리는 노드의 개수이다.</p>

### 힌트

<p>예제를 나타내는 그림은 다음과 같다. 빨간 노드가 최소 힙의 성질을 위반한다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/12990.%E2%80%85A%E2%80%85Heap%E2%80%85of%E2%80%85Heaps/a6f4f078.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/12990/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:200px; width:23px" />&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/12990.%E2%80%85A%E2%80%85Heap%E2%80%85of%E2%80%85Heaps/1aa27251.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/12990/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:113px; width:250px" />&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/12990.%E2%80%85A%E2%80%85Heap%E2%80%85of%E2%80%85Heaps/f58affbd.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/12990/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:116px; width:122px" />&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/12990.%E2%80%85A%E2%80%85Heap%E2%80%85of%E2%80%85Heaps/6973b81b.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/12990/4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:72px; width:300px" /></p>