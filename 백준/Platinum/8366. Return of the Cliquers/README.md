# [Platinum I] Return of the Cliquers - 8366

[문제 링크](https://www.acmicpc.net/problem/8366)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 8, 맞힌 사람: 8, 정답 비율: 36.364%

### 분류

수학, 정수론, 조합론, 분할 정복을 이용한 거듭제곱, 페르마의 소정리, 중국인의 나머지 정리

### 문제 설명

<p>An undirected graph with <em>n</em>&nbsp;vertices is called&nbsp;<b>a symmetric labeled cliquer</b>&nbsp;if each connected component of the graph contains the same number of vertices and is a clique, and the vertices of the graph are numbered with numbers from the set {1, ..., <em>n</em>}. Maurycy has drawn all symmetric labeled cliquers on a piece of paper and is going to assess beauty of each of them with a number from the set {1, ..., <em>m</em>}&nbsp;(in particular, different cliquers may be assigned equal grades). In how many ways can he do this? The result should be computed modulo 10<sup>9</sup> - 401. The figure below depicts all symmetric labeled cliquers for <em>n</em> = 4.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8366.%E2%80%85Return%E2%80%85of%E2%80%85the%E2%80%85Cliquers/4873538e.png" data-original-src="https://upload.acmicpc.net/04d63c30-d376-4eb9-8555-13bd0a67ce17/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

### 입력

<p>The only line of the standard input contains two integers <em>n</em>&nbsp;and <em>m</em>&nbsp;(1 &le; n, m &le; 2 &middot; 10<sup>9</sup>), separated by a single space and denoting the number of vertices of each symmetric labeled cliquer and the number of grades respectively.</p>

### 출력

<p>The only line of the standard output should contain the number of possible sets of grades modulo 10<sup>9</sup> - 401.</p>