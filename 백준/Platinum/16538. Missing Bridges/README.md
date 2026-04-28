# [Platinum III] Missing Bridges - 16538

[문제 링크](https://www.acmicpc.net/problem/16538)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 20, 정답: 6, 맞힌 사람: 5, 정답 비율: 29.412%

### 분류

자료 구조, 분리 집합, 다이나믹 프로그래밍, 오일러 경로, 그래프 이론, 강한 연결 요소

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16538.%E2%80%85Missing%E2%80%85Bridges/bd149cba.png" data-original-src="https://upload.acmicpc.net/caab46ee-0fcc-4e1c-bbae-493cd6e5ce12/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 283px; height: 209px; float: right;" />On Fig. 1 a scheme of 4 islands, presented by points and labeled from 1 to 4, and 7 bridges, presented by lines, each of them connecting 2 different points, are shown. Each bridge could be traversed in both directions. The task is to start from some island, to pass on each of the bridges exactly once, and to return at the starting point. Such walk is called all-bridgeswalk.</p>

<p>To do this with the islands and bridges on Fig. 1 is impossible. But, if some new bridges are built, then the asked walk could be made &ndash; for example with new bridges that connect island 4 with island 1 and island 2 with island 3. On Fig. 2 a region with four islands and three bridges is shown. If the all-bridges-walk for this region is asked, then two bridges from point 3 to point 4 will be enough for doing the walk.</p>

<p>It is given a country with N islands and M bridges. Write a program bridges to find the smallest number of bridges to build in order to have an all-bridges-walk in the country.</p>

### 입력

<p>First line of the standard input will contain the numbers N and M (N &le; 1000, M &le; 10000). On the each of the next M lines the two ends of a bridge will be given.</p>

### 출력

<p>On the first line of the standard output the program has to print the number K of the necessary new bridges. Each of the next K lines has to contain the two ends of a new bridge. Any set of new bridges that guaranties all-bridges-walk is acceptable as solution. If new bridges are not necessary, the program has to print just 0.</p>