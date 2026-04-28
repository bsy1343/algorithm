# [Platinum III] Uncle Tom’s Inherited Land - 5780

[문제 링크](https://www.acmicpc.net/problem/5780)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 90, 정답: 49, 맞힌 사람: 40, 정답 비율: 52.632%

### 분류

그래프 이론, 최대 유량, 격자 그래프, 이분 매칭

### 문제 설명

<p>Your old uncle Tom inherited a piece of land from his great-great-uncle. Originally, the property had been in the shape of a rectangle. A long time ago, however, his great-great-uncle decided to divide the land into a grid of small squares. He turned some of the squares into ponds, for he loved to hunt ducks and wanted to attract them to his property. (You cannot be sure, for you have not been to the place, but he may have made so many ponds that the land may now consist of several disconnected islands.) Your uncle Tom wants to sell the inherited land, but local rules now regulate property sales.</p>

<p>Your uncle has been informed that, at his great-great-uncle&rsquo;s request, a law has been passed which establishes that property can only be sold in rectangular lots the size of two squares of your uncle&rsquo;s property. Furthermore, ponds are not salable property.</p>

<p>Your uncle asked your help to determine the largest number of properties he could sell (the remaining squares will become recreational parks).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5780.%E2%80%85Uncle%E2%80%85Tom%E2%80%99s%E2%80%85Inherited%E2%80%85Land/5eb6dadd.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5780/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:155px; width:621px" /></p>

### 입력

<p>Input will include several test cases. The first line of a test case contains two integers N and M, representing, respectively, the number of rows and columns of the land (1 &le; N, M &le; 100). The second line will contain an integer K indicating the number of squares that have been turned into ponds ( (N x M) &ndash; K &le; 50). Each of the next K lines contains two integers X and Y describing the position of a square which was turned into a pond (1 &le; X &le; N and 1 &le; Y &le; M). The end of input is indicated by N = M = 0.</p>

### 출력

<p>For each test case in the input your program should produce one line of output, containing an integer value representing the maximum number of properties which can be sold.</p>